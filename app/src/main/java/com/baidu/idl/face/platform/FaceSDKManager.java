package com.baidu.idl.face.platform;

import android.content.Context;
import com.baidu.aip.face.stat.Ast;
import com.baidu.idl.face.platform.decode.FaceModule;
import com.baidu.idl.face.platform.strategy.FaceDetectStrategyExtModule;
import com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule;
import com.baidu.idl.facesdk.FaceSDK;
import com.baidu.idl.facesdk.FaceTracker;

public class FaceSDKManager {
    public static FaceSDKManager instance;
    public Context mContext;
    public FaceConfig mFaceConfig = new FaceConfig();
    public FaceTracker mFaceTracker;
    public boolean mInitFlag = false;
    public boolean mIsOnlyCollect = false;

    public static FaceSDKManager getInstance() {
        if (instance == null) {
            synchronized (FaceSDKManager.class) {
                if (instance == null) {
                    instance = new FaceSDKManager();
                }
            }
        }
        return instance;
    }

    public static String getVersion() {
        return FaceEnvironment.SDK_VERSION;
    }

    public static boolean isLicenseSuccess() {
        return FaceSDK.getAuthorityStatus() == 0;
    }

    private void setSDKValue(FaceConfig faceConfig) {
        FaceTracker faceTracker = this.mFaceTracker;
        if (faceTracker != null && faceConfig != null) {
            faceTracker.set_isCheckQuality(faceConfig.isCheckFaceQuality);
            this.mFaceTracker.set_notFace_thr(faceConfig.notFaceValue);
            this.mFaceTracker.set_min_face_size(faceConfig.minFaceSize);
            this.mFaceTracker.set_cropFaceSize(faceConfig.cropFaceValue);
            this.mFaceTracker.set_illum_thr(faceConfig.brightnessValue);
            this.mFaceTracker.set_blur_thr(faceConfig.blurnessValue);
            this.mFaceTracker.set_occlu_thr(faceConfig.occlusionValue);
            this.mFaceTracker.set_isVerifyLive(faceConfig.isVerifyLive);
            this.mFaceTracker.set_max_reg_img_num(faceConfig.maxCropImageNum);
            this.mFaceTracker.set_eulur_angle_thr(faceConfig.headPitchValue, faceConfig.headYawValue, faceConfig.headRollValue);
            FaceSDK.setNumberOfThreads(faceConfig.faceDecodeNumberOfThreads);
        }
    }

    public int getAuthorityStatus() {
        return FaceSDK.getAuthorityStatus();
    }

    public IDetect getDetectModule() {
        return new FaceModule(this.mFaceTracker);
    }

    public IDetectStrategy getDetectStrategyModule() {
        FaceDetectStrategyExtModule faceDetectStrategyExtModule = new FaceDetectStrategyExtModule(this.mContext, this.mFaceTracker);
        faceDetectStrategyExtModule.setConfigValue(this.mFaceConfig);
        return faceDetectStrategyExtModule;
    }

    public FaceConfig getFaceConfig() {
        return this.mFaceConfig;
    }

    public FaceTracker getFaceTracker() {
        return this.mFaceTracker;
    }

    public ILiveness getLivenessModule() {
        return new FaceModule(this.mFaceTracker);
    }

    public ILivenessStrategy getLivenessStrategyModule() {
        FaceLivenessStrategyExtModule faceLivenessStrategyExtModule = new FaceLivenessStrategyExtModule(this.mContext, this.mFaceTracker);
        faceLivenessStrategyExtModule.setConfigValue(this.mFaceConfig);
        return faceLivenessStrategyExtModule;
    }

    public boolean getmIsOnlyCollect() {
        return this.mIsOnlyCollect;
    }

    public void initialize(Context context, String str) {
        initialize(context, str, "", false);
    }

    public void release() {
        synchronized (FaceSDKManager.class) {
            Ast.getInstance().immediatelyUpload();
            if (instance != null) {
                instance.mInitFlag = false;
                instance.mFaceTracker = null;
                instance.mContext = null;
                instance = null;
            }
        }
    }

    public void setFaceConfig(FaceConfig faceConfig) {
        this.mFaceConfig = faceConfig;
        setSDKValue(faceConfig);
    }

    public void setmIsOnlyCollect(boolean z) {
        this.mIsOnlyCollect = z;
    }

    public void initialize(Context context, String str, String str2) {
        initialize(context, str, str2, false);
    }

    public void initialize(Context context, String str, String str2, boolean z) {
        this.mContext = context;
        this.mIsOnlyCollect = z;
        FaceSDK.initLicense(context, str, str2, true);
        FaceTracker faceTracker = new FaceTracker(context);
        this.mFaceTracker = faceTracker;
        faceTracker.set_isFineAlign(false);
        this.mFaceTracker.set_isVerifyLive(true);
        this.mFaceTracker.set_DetectMethodType(1);
        this.mFaceTracker.set_isCheckQuality(true);
        this.mFaceTracker.set_notFace_thr(0.6f);
        this.mFaceTracker.set_min_face_size(200);
        this.mFaceTracker.set_cropFaceSize(400);
        this.mFaceTracker.set_illum_thr(40.0f);
        this.mFaceTracker.set_blur_thr(0.5f);
        this.mFaceTracker.set_occlu_thr(0.5f);
        this.mFaceTracker.set_max_reg_img_num(1);
        this.mFaceTracker.set_eulur_angle_thr(10, 10, 10);
        this.mFaceTracker.set_track_by_detection_interval(800);
        FaceSDK.setNumberOfThreads(2);
        Ast.getInstance().init(context.getApplicationContext(), BuildConfig.VERSION_NAME, "facenormal");
        this.mInitFlag = true;
    }
}
