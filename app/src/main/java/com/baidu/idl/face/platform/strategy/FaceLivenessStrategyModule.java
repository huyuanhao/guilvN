package com.baidu.idl.face.platform.strategy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import com.baidu.idl.face.platform.FaceConfig;
import com.baidu.idl.face.platform.FaceEnvironment;
import com.baidu.idl.face.platform.FaceStatusEnum;
import com.baidu.idl.face.platform.ILivenessStrategy;
import com.baidu.idl.face.platform.ILivenessStrategyCallback;
import com.baidu.idl.face.platform.LivenessTypeEnum;
import com.baidu.idl.face.platform.common.ConstantHelper;
import com.baidu.idl.face.platform.common.LogHelper;
import com.baidu.idl.face.platform.common.SoundPoolHelper;
import com.baidu.idl.face.platform.decode.FaceModule;
import com.baidu.idl.face.platform.model.FaceExtInfo;
import com.baidu.idl.face.platform.model.FaceModel;
import com.baidu.idl.face.platform.utils.BitmapUtils;
import com.baidu.idl.facesdk.FaceTracker;
import com.p118pd.sdk.C8932ooOOO0o;
import java.util.HashMap;
import java.util.List;

@Deprecated
public final class FaceLivenessStrategyModule extends FaceStrategyModule implements ILivenessStrategy {
    public static final String TAG = "FaceLivenessStrategyModule";
    public HashMap<String, String> mBase64ImageMap = new HashMap<>();
    public int[] mBestFaceImage;
    public Context mContext;
    public Rect mDetectRect;
    public DetectStrategy mDetectStrategy;
    public ILivenessStrategyCallback mILivenessStrategyCallback;
    public volatile boolean mIsEnableSound = true;
    public boolean mIsFirstTipsed = false;
    public volatile boolean mIsTipsed = false;
    public LivenessStrategy mLivenessStrategy;
    public Rect mPreviewRect;
    public SoundPoolHelper mSoundPlayHelper = null;
    public HashMap<FaceStatusEnum, String> mTipsMap = new HashMap<>();

    public class UILivenessResultRunnable implements Runnable {
        public final FaceModel mModel;

        public UILivenessResultRunnable(FaceModel faceModel) {
            this.mModel = faceModel;
        }

        public void run() {
            FaceLivenessStrategyModule.this.processUIResult(this.mModel);
        }
    }

    public FaceLivenessStrategyModule(Context context, FaceTracker faceTracker) {
        super(faceTracker);
        LogHelper.addLog(ConstantHelper.LOG_APPID, context.getPackageName());
        this.mContext = context;
        this.mDetectStrategy = new DetectStrategy();
        this.mLivenessStrategy = new LivenessStrategy();
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

    private boolean isPrepareDataSuccess(int i) {
        return !TextUtils.isEmpty(this.mFaceModule.getDetectBestImage(i));
    }

    private void processUICallback(FaceStatusEnum faceStatusEnum) {
        if (faceStatusEnum == FaceStatusEnum.Error_DetectTimeout || faceStatusEnum == FaceStatusEnum.Error_LivenessTimeout || faceStatusEnum == FaceStatusEnum.Error_Timeout) {
            LogHelper.addLogWithKey(ConstantHelper.LOG_ETM, Long.valueOf(System.currentTimeMillis()));
            LogHelper.sendLog();
        }
        ILivenessStrategyCallback iLivenessStrategyCallback = this.mILivenessStrategyCallback;
        if (iLivenessStrategyCallback != null) {
            iLivenessStrategyCallback.onLivenessCompletion(faceStatusEnum, getStatusTextResId(faceStatusEnum), null);
        }
    }

    private void processUICompletion(int i, FaceStatusEnum faceStatusEnum) {
        this.mIsProcessing = false;
        this.mIsCompletion = true;
        LogHelper.addLogWithKey(ConstantHelper.LOG_ETM, Long.valueOf(System.currentTimeMillis()));
        LogHelper.addLogWithKey(ConstantHelper.LOG_FINISH, 1);
        LogHelper.sendLog();
        if (this.mILivenessStrategyCallback != null) {
            this.mBase64ImageMap.put("bestImage", this.mFaceModule.getDetectBestImage(i));
            processUIStrategyDelay(new Runnable() {
                /* class com.baidu.idl.face.platform.strategy.FaceLivenessStrategyModule.RunnableC04191 */

                public void run() {
                    FaceLivenessStrategyModule.this.processUITips(FaceStatusEnum.Liveness_Completion);
                }
            }, 500);
            this.mILivenessStrategyCallback.onLivenessCompletion(faceStatusEnum, getStatusTextResId(faceStatusEnum), this.mBase64ImageMap);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void processUIResult(FaceModel faceModel) {
        FaceExtInfo faceExtInfo;
        if (this.mIsProcessing) {
            long currentTimeMillis = System.currentTimeMillis() - this.mLaunchTime;
            long j = FaceEnvironment.TIME_MODULE;
            if (currentTimeMillis > j && j != 0) {
                this.mIsProcessing = false;
                processUICallback(FaceStatusEnum.Error_Timeout);
            } else if (System.currentTimeMillis() - this.mLaunchTime >= 1600) {
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
                FaceStatusEnum faceStatusEnum = FaceStatusEnum.Detect_NoFace;
                if (faceExtInfo != null) {
                    LivenessTypeEnum currentLivenessType = this.mLivenessStrategy.getCurrentLivenessType();
                    this.mDetectStrategy.setLiveness(currentLivenessType);
                    FaceStatusEnum checkDetect = this.mDetectStrategy.checkDetect(this.mPreviewRect, this.mDetectRect, faceExtInfo.getPitch(), faceExtInfo.getYaw(), faceExtInfo.getLandmarksOutOfDetectCount(this.mDetectRect), faceExtInfo.getFaceWidth(), faceModel.getFaceModuleState());
                    if (checkDetect == FaceStatusEnum.OK) {
                        LogHelper.addLogWithKey(ConstantHelper.LOG_BTM, Long.valueOf(System.currentTimeMillis()));
                        this.mNoFaceTime = 0;
                        if (this.mLivenessStrategy.isTimeout()) {
                            this.mIsProcessing = false;
                            processUICallback(FaceStatusEnum.Error_LivenessTimeout);
                            return;
                        }
                        if (!this.mLivenessStrategy.isCurrentLivenessCheckSuccess()) {
                            if (processUITips(this.mLivenessStrategy.getCurrentLivenessStatus())) {
                                this.mIsTipsed = true;
                            }
                        } else if (this.mLivenessStrategy.isLivenessCheckSuccess()) {
                            if (isPrepareDataSuccess(faceExtInfo.getFaceId())) {
                                if (processUITips(FaceStatusEnum.Liveness_OK)) {
                                    processUICompletion(faceExtInfo.getFaceId(), FaceStatusEnum.OK);
                                }
                            } else {
                                return;
                            }
                        } else if (this.mIsTipsed && processUITips(FaceStatusEnum.Liveness_OK)) {
                            this.mLivenessStrategy.nextLiveness();
                            this.mIsTipsed = false;
                        }
                        if (this.mIsTipsed) {
                            this.mLivenessStrategy.checkLiveness(faceExtInfo.getLiveInfo());
                        }
                        if (this.mLivenessStrategy.isCurrentLivenessCheckSuccess()) {
                            saveLivenessImage(currentLivenessType, faceModel.getArgbImage(), this.mPreviewRect);
                            LogHelper.addLogWithKey(ConstantHelper.LOG_PTM, Long.valueOf(System.currentTimeMillis()));
                            LogHelper.addLivenessLog(currentLivenessType.ordinal());
                            return;
                        }
                        return;
                    }
                    if (processUITips(checkDetect)) {
                        if (checkDetect == FaceStatusEnum.Detect_NoFace) {
                            this.mIsTipsed = false;
                            this.mDetectStrategy.reset();
                            this.mLivenessStrategy.reset();
                            HashMap<String, String> hashMap = this.mBase64ImageMap;
                            if (hashMap != null) {
                                hashMap.clear();
                            }
                        } else {
                            this.mIsTipsed = false;
                            this.mLivenessStrategy.resetState();
                            this.mNoFaceTime = 0;
                        }
                    }
                    if (this.mDetectStrategy.isTimeout()) {
                        this.mIsProcessing = false;
                        processUICallback(FaceStatusEnum.Error_DetectTimeout);
                        return;
                    }
                    return;
                }
                if (faceStatusEnum == faceStatusEnum) {
                    if (this.mNoFaceTime == 0) {
                        this.mNoFaceTime = System.currentTimeMillis();
                    } else if (System.currentTimeMillis() - this.mNoFaceTime > FaceEnvironment.TIME_DETECT_MODULE) {
                        this.mIsProcessing = false;
                        processUICallback(FaceStatusEnum.Error_DetectTimeout);
                        return;
                    }
                    if (this.mNoFaceTime != 0 && System.currentTimeMillis() - this.mNoFaceTime > FaceEnvironment.TIME_DETECT_NO_FACE_CONTINUOUS) {
                        this.mIsTipsed = false;
                        this.mDetectStrategy.reset();
                        this.mLivenessStrategy.reset();
                        HashMap<String, String> hashMap2 = this.mBase64ImageMap;
                        if (hashMap2 != null) {
                            hashMap2.clear();
                        }
                    } else {
                        return;
                    }
                } else {
                    this.mNoFaceTime = 0;
                }
                if (this.mDetectStrategy.isTimeout()) {
                    this.mIsProcessing = false;
                    processUICallback(FaceStatusEnum.Error_DetectTimeout);
                    return;
                }
                processUITips(faceStatusEnum);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
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

    private void saveLivenessImage(LivenessTypeEnum livenessTypeEnum, int[] iArr, Rect rect) {
        if (!this.mBase64ImageMap.containsKey(livenessTypeEnum.name())) {
            Bitmap createLivenessBitmap = BitmapUtils.createLivenessBitmap(this.mContext, iArr, rect);
            String bitmapToJpegBase64 = BitmapUtils.bitmapToJpegBase64(createLivenessBitmap, 80);
            if (bitmapToJpegBase64 != null && bitmapToJpegBase64.length() > 0) {
                this.mBase64ImageMap.put(livenessTypeEnum.name(), bitmapToJpegBase64.replace("\\/", C8932ooOOO0o.OooO0OO));
            }
            if (createLivenessBitmap != null && !createLivenessBitmap.isRecycled()) {
                createLivenessBitmap.recycle();
            }
        }
    }

    @Override // com.baidu.idl.face.platform.ILivenessStrategy
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
                    return str;
                }
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
            e.printStackTrace();
            return str;
        }
        return str;
    }

    @Override // com.baidu.idl.face.platform.ILivenessStrategy
    public void livenessStrategy(byte[] bArr) {
        if (!this.mIsFirstTipsed) {
            this.mIsFirstTipsed = true;
            processUITips(FaceStatusEnum.Detect_NoFace);
        }
        if (this.mIsProcessing) {
            process(bArr);
        }
    }

    @Override // com.baidu.idl.face.platform.strategy.FaceStrategyModule
    public void processStrategy(byte[] bArr) {
        FaceEnvironment.isDebugable();
        processUIStrategy(new UILivenessResultRunnable(this.mFaceModule.detect(bArr, this.mPreviewRect.height(), this.mPreviewRect.width())));
    }

    @Override // com.baidu.idl.face.platform.strategy.FaceStrategyModule, com.baidu.idl.face.platform.ILivenessStrategy
    public void reset() {
        if (this.mLivenessStrategy != null && !this.mIsCompletion) {
            this.mLivenessStrategy.reset();
        }
        if (this.mBase64ImageMap != null && !this.mIsCompletion) {
            this.mBase64ImageMap.clear();
        }
    }

    public void setConfigValue(FaceConfig faceConfig) {
        DetectStrategy detectStrategy;
        if (faceConfig != null && (detectStrategy = this.mDetectStrategy) != null) {
            detectStrategy.setHeadAngle(faceConfig.getHeadPitchValue(), faceConfig.getHeadYawValue(), faceConfig.getHeadRollValue());
        }
    }

    @Override // com.baidu.idl.face.platform.ILivenessStrategy
    public void setLivenessStrategyConfig(List<LivenessTypeEnum> list, Rect rect, Rect rect2, ILivenessStrategyCallback iLivenessStrategyCallback) {
        this.mLivenessStrategy.setLivenessList(list);
        this.mPreviewRect = rect;
        this.mDetectRect = rect2;
        this.mILivenessStrategyCallback = iLivenessStrategyCallback;
    }

    @Override // com.baidu.idl.face.platform.ILivenessStrategy
    public void setLivenessStrategySoundEnable(boolean z) {
        this.mIsEnableSound = z;
    }

    @Override // com.baidu.idl.face.platform.ILivenessStrategy
    public void setPreviewDegree(int i) {
        FaceModule faceModule = this.mFaceModule;
        if (faceModule != null) {
            faceModule.setPreviewDegree(i);
        }
    }
}
