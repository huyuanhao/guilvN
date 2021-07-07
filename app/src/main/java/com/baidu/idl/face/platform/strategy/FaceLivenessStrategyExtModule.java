package com.baidu.idl.face.platform.strategy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
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
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class FaceLivenessStrategyExtModule extends FaceStrategyModule implements ILivenessStrategy {
    public static final String TAG = "FaceLivenessStrategyExtModule";
    public HashMap<String, String> mBase64ImageMap = new HashMap<>();
    public Context mContext;
    public Rect mDetectRect;
    public DetectStrategy mDetectStrategy;
    public ILivenessStrategyCallback mILivenessStrategyCallback;
    public volatile boolean mIsEnableSound = true;
    public boolean mIsFirstLivenessSuccessTipsed = false;
    public boolean mIsFirstTipsed = false;
    public volatile LivenessStatus mLivenessStatus = LivenessStatus.LivenessReady;
    public LivenessStatusStrategy mLivenessStrategy;
    public long mLivenessTipsDurationTime = 0;
    public long mLivenessTipsTime = 0;
    public Rect mPreviewRect;
    public SoundPoolHelper mSoundPlayHelper = null;
    public HashMap<FaceStatusEnum, String> mTipsMap = new HashMap<>();

    /* renamed from: com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$1 */
    public static /* synthetic */ class C04181 {
        public static final /* synthetic */ int[] $SwitchMap$com$baidu$idl$face$platform$FaceStatusEnum;

        /* renamed from: $SwitchMap$com$baidu$idl$face$platform$strategy$FaceLivenessStrategyExtModule$LivenessStatus */
        public static final /* synthetic */ int[] f948x49bb5ee7;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus[] r0 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.C04181.f948x49bb5ee7 = r0
                r1 = 1
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r2 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessReady     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.C04181.f948x49bb5ee7     // Catch:{ NoSuchFieldError -> 0x001d }
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r3 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessTips     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.C04181.f948x49bb5ee7     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r3 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessOK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.baidu.idl.face.platform.FaceStatusEnum[] r2 = com.baidu.idl.face.platform.FaceStatusEnum.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.C04181.$SwitchMap$com$baidu$idl$face$platform$FaceStatusEnum = r2
                com.baidu.idl.face.platform.FaceStatusEnum r3 = com.baidu.idl.face.platform.FaceStatusEnum.Detect_NoFace     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.C04181.$SwitchMap$com$baidu$idl$face$platform$FaceStatusEnum     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.baidu.idl.face.platform.FaceStatusEnum r2 = com.baidu.idl.face.platform.FaceStatusEnum.Detect_FacePointOut     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.C04181.<clinit>():void");
        }
    }

    public enum LivenessStatus {
        LivenessReady,
        LivenessTips,
        LivenessOK,
        LivenessOKTips
    }

    public class UILivenessResultRunnable implements Runnable {
        public final FaceModel mModel;

        public UILivenessResultRunnable(FaceModel faceModel) {
            this.mModel = faceModel;
        }

        public void run() {
            FaceLivenessStrategyExtModule.this.processUIResult(this.mModel);
        }
    }

    public FaceLivenessStrategyExtModule(Context context, FaceTracker faceTracker) {
        super(faceTracker);
        LogHelper.addLog(ConstantHelper.LOG_APPID, context.getPackageName());
        this.mContext = context;
        this.mDetectStrategy = new DetectStrategy();
        this.mLivenessStrategy = new LivenessStatusStrategy();
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
        if (faceStatusEnum == FaceStatusEnum.OK || faceStatusEnum == FaceStatusEnum.Liveness_Completion) {
            this.mIsProcessing = false;
            this.mIsCompletion = true;
            LogHelper.addLogWithKey(ConstantHelper.LOG_ETM, Long.valueOf(System.currentTimeMillis()));
            LogHelper.addLogWithKey(ConstantHelper.LOG_FINISH, 1);
            LogHelper.sendLog();
            if (this.mILivenessStrategyCallback != null) {
                ArrayList<String> detectBestImageList = this.mFaceModule.getDetectBestImageList();
                for (int i = 0; i < detectBestImageList.size(); i++) {
                    HashMap<String, String> hashMap = this.mBase64ImageMap;
                    hashMap.put("bestImage" + i, detectBestImageList.get(i));
                }
                this.mILivenessStrategyCallback.onLivenessCompletion(faceStatusEnum, getStatusTextResId(faceStatusEnum), this.mBase64ImageMap);
                return;
            }
            return;
        }
        ILivenessStrategyCallback iLivenessStrategyCallback = this.mILivenessStrategyCallback;
        if (iLivenessStrategyCallback != null) {
            iLivenessStrategyCallback.onLivenessCompletion(faceStatusEnum, getStatusTextResId(faceStatusEnum), null);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void processUIResult(FaceModel faceModel) {
        if (this.mIsProcessing) {
            long currentTimeMillis = System.currentTimeMillis() - this.mLaunchTime;
            long j = FaceEnvironment.TIME_MODULE;
            if (currentTimeMillis <= j || j == 0) {
                FaceExtInfo faceExtInfo = null;
                FaceStatusEnum faceStatusEnum = FaceStatusEnum.Detect_NoFace;
                LivenessTypeEnum currentLivenessType = this.mLivenessStrategy.getCurrentLivenessType();
                if (faceModel == null || faceModel.getFaceInfos() == null || faceModel.getFaceInfos().length <= 0) {
                    DetectStrategy detectStrategy = this.mDetectStrategy;
                    if (detectStrategy != null) {
                        detectStrategy.reset();
                    }
                } else {
                    faceStatusEnum = faceModel.getFaceModuleState();
                    faceExtInfo = faceModel.getFaceInfos()[0];
                    LogHelper.addLogWithKey(ConstantHelper.LOG_FTM, Long.valueOf(System.currentTimeMillis()));
                }
                FaceStatusEnum faceStatusEnum2 = faceStatusEnum;
                if (faceExtInfo != null) {
                    faceStatusEnum2 = this.mDetectStrategy.checkDetect(this.mPreviewRect, this.mDetectRect, faceExtInfo.getPitch(), faceExtInfo.getYaw(), faceExtInfo.getLandmarksOutOfDetectCount(this.mDetectRect), faceExtInfo.getFaceWidth(), faceStatusEnum2);
                }
                FaceStatusEnum faceStatusEnum3 = FaceStatusEnum.OK;
                if (faceStatusEnum2 != faceStatusEnum3) {
                    if (this.mDetectStrategy.isTimeout()) {
                        this.mIsProcessing = false;
                        processUICallback(FaceStatusEnum.Error_DetectTimeout);
                        return;
                    }
                    int i = C04181.$SwitchMap$com$baidu$idl$face$platform$FaceStatusEnum[faceStatusEnum2.ordinal()];
                    if (i == 1 || i == 2) {
                        if (this.mNoFaceTime == 0) {
                            this.mNoFaceTime = System.currentTimeMillis();
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j2 = this.mNoFaceTime;
                        if (currentTimeMillis2 - j2 > FaceEnvironment.TIME_DETECT_MODULE) {
                            this.mIsProcessing = false;
                            processUICallback(FaceStatusEnum.Error_DetectTimeout);
                            return;
                        }
                        if (FaceStatusEnum.Detect_NoFace != faceStatusEnum2) {
                            this.mDetectStrategy.reset();
                            this.mLivenessStatus = LivenessStatus.LivenessReady;
                            this.mLivenessStrategy.resetState();
                        } else if (!this.mIsFirstLivenessSuccessTipsed || j2 == 0 || System.currentTimeMillis() - this.mNoFaceTime >= FaceEnvironment.TIME_DETECT_NO_FACE_CONTINUOUS) {
                            this.mIsFirstLivenessSuccessTipsed = false;
                            this.mDetectStrategy.reset();
                            this.mLivenessStatus = LivenessStatus.LivenessReady;
                            this.mLivenessStrategy.reset();
                            HashMap<String, String> hashMap = this.mBase64ImageMap;
                            if (hashMap != null) {
                                hashMap.clear();
                            }
                        } else {
                            return;
                        }
                        processUITips(faceStatusEnum2);
                        return;
                    }
                    processUITips(faceStatusEnum2);
                    this.mDetectStrategy.reset();
                    this.mLivenessStatus = LivenessStatus.LivenessReady;
                    this.mLivenessStrategy.resetState();
                } else if (faceExtInfo != null && faceStatusEnum2 == faceStatusEnum3) {
                    if (this.mLivenessStrategy.getCurrentLivenessStatus() != FaceStatusEnum.Liveness_HeadLeftRight && this.mLivenessStrategy.getCurrentLivenessStatus() != FaceStatusEnum.Liveness_HeadLeft && this.mLivenessStrategy.getCurrentLivenessStatus() != FaceStatusEnum.Liveness_HeadRight) {
                        this.mLivenessStrategy.processLiveness(faceExtInfo);
                    } else if (this.mLivenessStatus == LivenessStatus.LivenessTips && System.currentTimeMillis() - this.mLivenessTipsTime > this.mLivenessTipsDurationTime) {
                        this.mLivenessStrategy.processLiveness(faceExtInfo);
                    }
                    if (this.mLivenessStrategy.isCurrentLivenessSuccess()) {
                        saveLivenessImage(this.mLivenessStrategy.getCurrentLivenessType(), faceModel.getArgbImage(), this.mPreviewRect);
                    }
                    this.mNoFaceTime = 0;
                    this.mDetectStrategy.setLiveness(currentLivenessType);
                    LogHelper.addLogWithKey(ConstantHelper.LOG_BTM, Long.valueOf(System.currentTimeMillis()));
                    if (this.mLivenessStrategy.isTimeout()) {
                        this.mIsProcessing = false;
                        processUICallback(FaceStatusEnum.Error_LivenessTimeout);
                        return;
                    }
                    int i2 = C04181.f948x49bb5ee7[this.mLivenessStatus.ordinal()];
                    if (i2 == 1) {
                        String str = "switch " + this.mLivenessStatus.name() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.mLivenessStrategy.getCurrentLivenessStatus();
                        if (processUITips(this.mLivenessStrategy.getCurrentLivenessStatus())) {
                            if (this.mLivenessTipsDurationTime == 0) {
                                this.mLivenessTipsDurationTime = this.mSoundPlayHelper.getPlayDuration();
                            }
                            this.mLivenessStatus = LivenessStatus.LivenessTips;
                            this.mLivenessTipsTime = System.currentTimeMillis();
                        }
                    } else if (i2 == 2) {
                        String str2 = "switch " + this.mLivenessStatus.name() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.mLivenessStrategy.getCurrentLivenessStatus();
                        if (this.mLivenessStrategy.isCurrentLivenessSuccess()) {
                            this.mLivenessStatus = LivenessStatus.LivenessOK;
                            this.mLivenessTipsTime = 0;
                            this.mLivenessTipsDurationTime = 0;
                            return;
                        }
                        processUITips(this.mLivenessStrategy.getCurrentLivenessStatus());
                    } else if (i2 == 3) {
                        String str3 = "switch " + this.mLivenessStatus.name() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.mLivenessStrategy.getCurrentLivenessStatus();
                        if (processUITips(FaceStatusEnum.Liveness_OK)) {
                            if (!this.mIsFirstLivenessSuccessTipsed) {
                                this.mIsFirstLivenessSuccessTipsed = true;
                            }
                            if (this.mLivenessStrategy.nextLiveness()) {
                                this.mLivenessStatus = LivenessStatus.LivenessReady;
                                this.mLivenessTipsTime = 0;
                                this.mLivenessTipsDurationTime = 0;
                            } else if (this.mLivenessStrategy.isLivenessSuccess()) {
                                processUICallback(FaceStatusEnum.OK);
                            }
                        }
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
            processUITips(FaceStatusEnum.Detect_FacePointOut);
        } else if (this.mIsProcessing) {
            process(bArr);
        }
    }

    @Override // com.baidu.idl.face.platform.strategy.FaceStrategyModule
    public void processStrategy(byte[] bArr) {
        processUIStrategy(new UILivenessResultRunnable(this.mFaceModule.detect(bArr, this.mPreviewRect.height(), this.mPreviewRect.width())));
    }

    @Override // com.baidu.idl.face.platform.strategy.FaceStrategyModule, com.baidu.idl.face.platform.ILivenessStrategy
    public void reset() {
        super.reset();
        if (this.mLivenessStrategy != null && !this.mIsCompletion) {
            this.mLivenessStrategy.reset();
        }
        if (this.mBase64ImageMap != null && !this.mIsCompletion) {
            this.mBase64ImageMap.clear();
        }
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
