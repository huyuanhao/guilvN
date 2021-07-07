package com.baidu.idl.face.platform.strategy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.baidu.idl.face.platform.FaceConfig;
import com.baidu.idl.face.platform.FaceEnvironment;
import com.baidu.idl.face.platform.FaceSDKManager;
import com.baidu.idl.face.platform.FaceStatusEnum;
import com.baidu.idl.face.platform.IDetectStrategy;
import com.baidu.idl.face.platform.IDetectStrategyCallback;
import com.baidu.idl.face.platform.common.ConstantHelper;
import com.baidu.idl.face.platform.common.LogHelper;
import com.baidu.idl.face.platform.common.SoundPoolHelper;
import com.baidu.idl.face.platform.decode.FaceModule;
import com.baidu.idl.face.platform.model.FaceExtInfo;
import com.baidu.idl.face.platform.model.FaceModel;
import com.baidu.idl.face.platform.utils.BitmapUtils;
import com.baidu.idl.facesdk.FaceTracker;
import com.p118pd.sdk.C8932ooOOO0o;
import java.util.ArrayList;
import java.util.HashMap;

public final class FaceDetectStrategyExtModule extends FaceStrategyModule implements IDetectStrategy {
    public static final String TAG = "FaceDetectStrategyExtModule";
    public HashMap<String, String> mBase64ImageMap = new HashMap<>();
    public Context mContext;
    public Rect mDetectRect;
    public DetectStrategy mDetectStrategy;
    public IDetectStrategyCallback mIDetectStrategyCallback;
    public volatile boolean mIsEnableSound = true;
    public boolean mIsFirstTipsed = false;
    public volatile boolean mIsPlayCompletion = false;
    public Rect mPreviewRect;
    public SoundPoolHelper mSoundPlayHelper = null;
    public HashMap<FaceStatusEnum, String> mTipsMap = new HashMap<>();

    public class UIDetectResultRunnable implements Runnable {
        public final FaceModel mModel;

        public UIDetectResultRunnable(FaceModel faceModel) {
            this.mModel = faceModel;
        }

        public void run() {
            FaceDetectStrategyExtModule.this.processUIResult(this.mModel);
        }
    }

    public FaceDetectStrategyExtModule(Context context, FaceTracker faceTracker) {
        super(faceTracker);
        LogHelper.addLog(ConstantHelper.LOG_APPID, context.getPackageName());
        this.mContext = context;
        this.mDetectStrategy = new DetectStrategy();
        this.mSoundPlayHelper = new SoundPoolHelper(context);
        this.mLaunchTime = System.currentTimeMillis();
    }

    private String getStatusTextResId(FaceStatusEnum faceStatusEnum) {
        if (this.mTipsMap.containsKey(faceStatusEnum)) {
            return this.mTipsMap.get(faceStatusEnum);
        }
        int tipsId = FaceEnvironment.getTipsId(faceStatusEnum);
        if (tipsId <= 0) {
            return "";
        }
        String string = this.mContext.getResources().getString(tipsId);
        this.mTipsMap.put(faceStatusEnum, string);
        return string;
    }

    private void processUICallback(FaceStatusEnum faceStatusEnum) {
        if (faceStatusEnum == FaceStatusEnum.Error_DetectTimeout || faceStatusEnum == FaceStatusEnum.Error_LivenessTimeout || faceStatusEnum == FaceStatusEnum.Error_Timeout) {
            LogHelper.addLogWithKey(ConstantHelper.LOG_ETM, Long.valueOf(System.currentTimeMillis()));
            LogHelper.sendLog();
        }
        IDetectStrategyCallback iDetectStrategyCallback = this.mIDetectStrategyCallback;
        if (iDetectStrategyCallback == null) {
            return;
        }
        if (FaceStatusEnum.OK == faceStatusEnum) {
            this.mIsProcessing = false;
            this.mIsCompletion = true;
            LogHelper.addLogWithKey(ConstantHelper.LOG_ETM, Long.valueOf(System.currentTimeMillis()));
            LogHelper.addLogWithKey(ConstantHelper.LOG_FINISH, 1);
            LogHelper.sendLog();
            ArrayList<String> detectBestImageList = this.mFaceModule.getDetectBestImageList();
            for (int i = 0; i < detectBestImageList.size(); i++) {
                HashMap<String, String> hashMap = this.mBase64ImageMap;
                hashMap.put("bestImage" + i, detectBestImageList.get(i));
            }
            this.mIDetectStrategyCallback.onDetectCompletion(faceStatusEnum, getStatusTextResId(faceStatusEnum), this.mBase64ImageMap);
            return;
        }
        iDetectStrategyCallback.onDetectCompletion(faceStatusEnum, getStatusTextResId(faceStatusEnum), null);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void processUIResult(FaceModel faceModel) {
        FaceExtInfo faceExtInfo;
        if (this.mIsProcessing) {
            long currentTimeMillis = System.currentTimeMillis() - this.mLaunchTime;
            long j = FaceEnvironment.TIME_MODULE;
            if (currentTimeMillis <= j || j == 0) {
                if (faceModel == null || faceModel.getFaceInfos() == null || faceModel.getFaceInfos().length <= 0) {
                    faceExtInfo = null;
                    DetectStrategy detectStrategy = this.mDetectStrategy;
                    if (detectStrategy != null) {
                        detectStrategy.reset();
                    }
                } else {
                    faceExtInfo = faceModel.getFaceInfos()[0];
                    LogHelper.addLogWithKey(ConstantHelper.LOG_FTM, Long.valueOf(System.currentTimeMillis()));
                }
                if (faceExtInfo == null) {
                    if (faceModel == null || faceModel.getFaceModuleState() != FaceStatusEnum.Detect_NoFace) {
                        this.mNoFaceTime = 0;
                    } else {
                        this.mDetectStrategy.reset();
                        if (this.mNoFaceTime == 0) {
                            this.mNoFaceTime = System.currentTimeMillis();
                        } else if (System.currentTimeMillis() - this.mNoFaceTime > FaceEnvironment.TIME_DETECT_MODULE) {
                            this.mIsProcessing = false;
                            processUICallback(FaceStatusEnum.Error_DetectTimeout);
                            return;
                        }
                    }
                    if (this.mDetectStrategy.isTimeout()) {
                        this.mIsProcessing = false;
                        processUICallback(FaceStatusEnum.Error_DetectTimeout);
                        return;
                    }
                    processUITips(FaceStatusEnum.Detect_NoFace);
                } else if (this.mIsCompletion) {
                    this.mIsPlayCompletion = processUITips(FaceStatusEnum.OK);
                } else {
                    FaceStatusEnum checkDetect = this.mDetectStrategy.checkDetect(this.mPreviewRect, this.mDetectRect, faceExtInfo.getPitch(), faceExtInfo.getYaw(), faceExtInfo.getLandmarksOutOfDetectCount(this.mDetectRect), faceExtInfo.getFaceWidth(), faceModel.getFaceModuleState());
                    if (checkDetect == FaceStatusEnum.OK || checkDetect == FaceStatusEnum.Detect_DataNotReady) {
                        LogHelper.addLogWithKey(ConstantHelper.LOG_BTM, Long.valueOf(System.currentTimeMillis()));
                    }
                    FaceStatusEnum faceStatusEnum = FaceStatusEnum.OK;
                    if (checkDetect == faceStatusEnum) {
                        processUITips(faceStatusEnum);
                        this.mIsCompletion = true;
                    } else if (this.mDetectStrategy.isTimeout()) {
                        this.mIsProcessing = false;
                        processUICallback(FaceStatusEnum.Error_DetectTimeout);
                    } else {
                        processUITips(checkDetect);
                    }
                }
            } else {
                this.mIsProcessing = false;
                processUICallback(FaceStatusEnum.Error_Timeout);
            }
        }
    }

    private boolean processUITips(FaceStatusEnum faceStatusEnum) {
        if (faceStatusEnum == null) {
            return false;
        }
        this.mSoundPlayHelper.setEnableSound(this.mIsEnableSound);
        boolean playSound = this.mSoundPlayHelper.playSound(faceStatusEnum);
        if (!playSound) {
            return playSound;
        }
        LogHelper.addTipsLogWithKey(faceStatusEnum.name());
        processUICallback(faceStatusEnum);
        return playSound;
    }

    @Override // com.baidu.idl.face.platform.IDetectStrategy
    public void detectStrategy(byte[] bArr) {
        if (!this.mIsFirstTipsed) {
            this.mIsFirstTipsed = true;
            processUITips(FaceStatusEnum.Detect_FacePointOut);
        }
        if (this.mIsProcessing) {
            process(bArr);
        }
    }

    @Override // com.baidu.idl.face.platform.IDetectStrategy
    public String getBestFaceImage() {
        String str;
        Exception e;
        FaceModule faceModule = this.mFaceModule;
        if (faceModule == null || faceModule.getBestFaceImage() == null || this.mFaceModule.getBestFaceImage().length <= 0) {
            return "";
        }
        try {
            int[] bestFaceImage = this.mFaceModule.getBestFaceImage();
            int height = this.mPreviewRect.height();
            int width = this.mPreviewRect.width();
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(bestFaceImage, 0, width, 0, 0, width, height);
            str = BitmapUtils.bitmapToJpegBase64(createBitmap, 100);
            if (str != null) {
                try {
                    if (str.length() > 0) {
                        str = str.replace("\\/", C8932ooOOO0o.OooO0OO);
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    String str2 = "getBestFaceImage Exception " + e.getMessage();
                    return str;
                }
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
            e.printStackTrace();
            String str22 = "getBestFaceImage Exception " + e.getMessage();
            return str;
        }
        return str;
    }

    @Override // com.baidu.idl.face.platform.strategy.FaceStrategyModule
    public void processStrategy(byte[] bArr) {
        IDetectStrategyCallback iDetectStrategyCallback;
        FaceModel detect = this.mFaceModule.detect(bArr, this.mPreviewRect.height(), this.mPreviewRect.width());
        if (!FaceSDKManager.getInstance().getmIsOnlyCollect() || detect == null || (iDetectStrategyCallback = this.mIDetectStrategyCallback) == null) {
            processUIStrategy(new UIDetectResultRunnable(detect));
        } else {
            iDetectStrategyCallback.onDetectCompletion(detect.getFaceModuleState(), "", null);
        }
    }

    @Override // com.baidu.idl.face.platform.strategy.FaceStrategyModule, com.baidu.idl.face.platform.IDetectStrategy
    public void reset() {
        super.reset();
        SoundPoolHelper soundPoolHelper = this.mSoundPlayHelper;
        if (soundPoolHelper != null) {
            soundPoolHelper.release();
        }
    }

    public void setConfigValue(FaceConfig faceConfig) {
        DetectStrategy detectStrategy;
        if (faceConfig != null && (detectStrategy = this.mDetectStrategy) != null) {
            detectStrategy.setHeadAngle(faceConfig.getHeadPitchValue(), faceConfig.getHeadYawValue(), faceConfig.getHeadRollValue());
        }
    }

    @Override // com.baidu.idl.face.platform.IDetectStrategy
    public void setDetectStrategyConfig(Rect rect, Rect rect2, IDetectStrategyCallback iDetectStrategyCallback) {
        this.mPreviewRect = rect;
        this.mDetectRect = rect2;
        this.mIDetectStrategyCallback = iDetectStrategyCallback;
    }

    @Override // com.baidu.idl.face.platform.IDetectStrategy
    public void setDetectStrategySoundEnable(boolean z) {
        this.mIsEnableSound = z;
    }

    @Override // com.baidu.idl.face.platform.IDetectStrategy
    public void setPreviewDegree(int i) {
        FaceModule faceModule = this.mFaceModule;
        if (faceModule != null) {
            faceModule.setPreviewDegree(i);
        }
    }
}
