package com.baidu.idl.facesdk;

import android.content.Context;
import android.content.res.AssetManager;
import com.baidu.idl.license.AndroidLicenser;
import com.p118pd.sdk.C7748o0oooOOo;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

public class FaceSDK {
    public static final String TAG = "FaceSDK";
    public static int mAuthorityStatus = AndroidLicenser.ErrorCode.LICENSE_INIT_ERROR.ordinal();

    public enum AlignMethodType {
        SDM,
        CDNN,
        SDM_7PTS,
        SDM_15PTS
    }

    public enum DetectMethodType {
        BOOST,
        CNN,
        NIR
    }

    public enum ImgType {
        ARGB
    }

    public enum LivenessAction {
        RESET,
        ADD_ONE_FRAME
    }

    public enum LivenessMethodType {
        EYE_BLINK,
        MOUTH_MOTION,
        HEAD_POSE,
        ALL
    }

    public enum LivenessTypeId {
        LIVEID_IR,
        LIVEID_DEPTH,
        LIVEID_VIS
    }

    public enum ParsMethodType {
        NOT_USE,
        CLASS_NUM_3,
        CLASS_NUM_7,
        CLASS_NUM_10
    }

    public enum QualityModelType {
        QUALITY_NOT_USE,
        QUALITY_BLUR,
        QUALITY_OCCLUSION
    }

    public enum RecognizeType {
        RECOGNIZE_ID_PHOTO,
        RECOGNIZE_LIVE,
        RECOGNIZE_NIR
    }

    public static native int AlignModelInit(AssetManager assetManager, String str, String str2, int i);

    public static native int DetectModelInit(AssetManager assetManager, String str, int i);

    public static native int ParsingModelInit(AssetManager assetManager, String str, String str2, int i);

    public static native int ScoreModelInit(AssetManager assetManager, String str, String str2, int i);

    public static native int align(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2, int[] iArr3, int[] iArr4, float[] fArr);

    public static boolean checkParameter(Object obj, int i, int i2) {
        return obj != null && i > 0 && i2 > 0;
    }

    public static native int cropFaceImg(int[] iArr, int i, int i2, int i3, int[] iArr2, int i4, int i5, int i6, int[] iArr3, int[] iArr4);

    public static native FaceInfo[] detect(int[] iArr, int i, int i2, int i3, int i4, int i5);

    public static native int fineAlign(int[] iArr, int i, int i2, int i3, int[] iArr2, int[] iArr3);

    public static native int getARGBFromYUVimg(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4);

    public static int getAuthorityStatus() {
        return mAuthorityStatus;
    }

    public static int getNumCores() {
        try {
            return new File(C7748o0oooOOo.OooO0OO).listFiles(new FileFilter() {
                /* class com.baidu.idl.facesdk.FaceSDK.AnonymousClass1CpuFilter */

                public boolean accept(File file) {
                    return Pattern.matches(C7748o0oooOOo.OooO0O0, file.getName());
                }
            }).length;
        } catch (Exception unused) {
            return 1;
        }
    }

    public static String getVersion() {
        return FaceConfig.SDK_VERSION;
    }

    public static native int headPoseEstimation(int[] iArr, int i, double[] dArr);

    public static native int imgQuality(int[] iArr, int i, int i2, int i3, int[] iArr2, int i4, float[] fArr, int[] iArr3, float[] fArr2, int[] iArr4);

    public static native int imgQualityModelInit(AssetManager assetManager, String str, String str2, int i);

    public static synchronized void initLicense(final Context context, final String str, final String str2, final boolean z) {
        synchronized (FaceSDK.class) {
            if (context != null) {
                File dir = context.getDir("FaceSDKLibs", 0);
                File file = new File(dir.getAbsolutePath() + File.separator + FaceConfig.FACE_SO_CUSTOM_NAME);
                File file2 = new File(dir.getAbsolutePath() + File.separator + FaceConfig.LICENSE_SO_CUSTOM_NAME);
                if (!file.exists() || !file2.exists()) {
                    System.loadLibrary(FaceConfig.LICENSE_SO_PRIVATE_NAME);
                    System.loadLibrary("FaceSDK");
                } else {
                    System.load(file2.getAbsolutePath());
                    System.load(file.getAbsolutePath());
                }
                new Thread(new Runnable() {
                    /* class com.baidu.idl.facesdk.FaceSDK.RunnableC04341 */

                    public void run() {
                        try {
                            String unused = FaceSDK.TAG;
                            if (!"".equals(str) && !"".equals(str2)) {
                                AndroidLicenser instance = AndroidLicenser.getInstance();
                                instance.init(context, str, str2, 3);
                                instance.is_remote_authorize = z;
                                int unused2 = FaceSDK.mAuthorityStatus = instance.authenticate(context);
                            }
                            String unused3 = FaceSDK.TAG;
                            String str = "license  status  " + FaceSDK.mAuthorityStatus;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
                int numCores = getNumCores();
                int i = 1;
                if (numCores > 1) {
                    i = numCores / 2;
                }
                setNumberOfThreads(i);
            }
        }
    }

    public static synchronized void initModel(Context context) {
        synchronized (FaceSDK.class) {
            if (context != null) {
                if (BDFaceUtils.hasModel(context, FaceConfig.cdnn_alignmodel_path)) {
                    AlignModelInit(context.getAssets(), FaceConfig.cdnn_alignmodel_path, "", AlignMethodType.CDNN.ordinal());
                }
                if (BDFaceUtils.hasModel(context, FaceConfig.detect_cnn_model)) {
                    DetectModelInit(context.getAssets(), FaceConfig.detect_cnn_model, DetectMethodType.CNN.ordinal());
                }
                if (BDFaceUtils.hasModel(context, FaceConfig.detect_nir_model)) {
                    DetectModelInit(context.getAssets(), FaceConfig.detect_nir_model, DetectMethodType.NIR.ordinal());
                }
                if (BDFaceUtils.hasModel(context, FaceConfig.score_model)) {
                    ScoreModelInit(context.getAssets(), FaceConfig.score_model, "", DetectMethodType.CNN.ordinal());
                }
                if (BDFaceUtils.hasModel(context, FaceConfig.blur_model)) {
                    imgQualityModelInit(context.getAssets(), FaceConfig.blur_model, "", QualityModelType.QUALITY_BLUR.ordinal());
                }
                if (BDFaceUtils.hasModel(context, FaceConfig.occlusion_model)) {
                    imgQualityModelInit(context.getAssets(), FaceConfig.occlusion_model, "", QualityModelType.QUALITY_OCCLUSION.ordinal());
                }
            }
        }
    }

    public static native int liveness(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2, int[] iArr3, int i5, int[] iArr4);

    public static int livenessSilentInit(Context context, LivenessTypeId livenessTypeId) {
        if (context == null) {
            return -1;
        }
        if (livenessTypeId == LivenessTypeId.LIVEID_IR && BDFaceUtils.hasModel(context, FaceConfig.livenessSilent_nir_model_path)) {
            return livenessSilentInit(context.getAssets(), livenessTypeId.ordinal(), FaceConfig.livenessSilent_nir_model_path);
        }
        if (livenessTypeId == LivenessTypeId.LIVEID_DEPTH && BDFaceUtils.hasModel(context, FaceConfig.livenessSilent_depth_model_path)) {
            return livenessSilentInit(context.getAssets(), livenessTypeId.ordinal(), FaceConfig.livenessSilent_depth_model_path);
        }
        if (livenessTypeId != LivenessTypeId.LIVEID_VIS || !BDFaceUtils.hasModel(context, FaceConfig.livenes_ssilent_vis_model_path)) {
            return -1;
        }
        return livenessSilentInit(context.getAssets(), livenessTypeId.ordinal(), FaceConfig.livenes_ssilent_vis_model_path);
    }

    public static native int livenessSilentInit(AssetManager assetManager, int i, String str);

    public static native float livenessSilentPredict(int i, int[] iArr, int i2, int i3, int i4, int[] iArr2);

    public static native float livenessSilentPredictByte(int i, byte[] bArr, int i2, int i3, int i4, int[] iArr);

    public static native int parsing(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2, int i5, byte[] bArr);

    public static native FaceVerifyData removeTexture(int[] iArr, int i, int i2, int i3);

    public static FaceVerifyData removeTexture(int[] iArr, int i, int i2, ImgType imgType) {
        if (!checkParameter(iArr, i, i2)) {
            return null;
        }
        return removeTexture(iArr, i, i2, imgType.ordinal());
    }

    public static int removeTextureModelInit(Context context) {
        if (context == null || !BDFaceUtils.hasModel(context, FaceConfig.remove_texture_model_path)) {
            return -1;
        }
        return removeTextureModelInit(context.getAssets(), FaceConfig.remove_texture_model_path);
    }

    public static native int removeTextureModelInit(AssetManager assetManager, String str);

    public static int run_align(int[] iArr, int i, int i2, ImgType imgType, AlignMethodType alignMethodType, int[] iArr2, int[] iArr3, int[] iArr4, float[] fArr) {
        if (!checkParameter(iArr, i, i2)) {
            return -1;
        }
        return align(iArr, i, i2, imgType.ordinal(), alignMethodType.ordinal(), iArr2, iArr3, iArr4, fArr);
    }

    public static int run_cropFaceImg(int[] iArr, int i, int i2, ImgType imgType, int[] iArr2, int i3, int i4, int i5, int[] iArr3, int[] iArr4) {
        if (!checkParameter(iArr, i, i2)) {
            return -1;
        }
        return cropFaceImg(iArr, i, i2, imgType.ordinal(), iArr2, i3, i4, i5, iArr3, iArr4);
    }

    public static FaceInfo[] run_detect(int[] iArr, int i, int i2, ImgType imgType, DetectMethodType detectMethodType, int i3) {
        return detect(iArr, i, i2, imgType.ordinal(), detectMethodType.ordinal(), i3);
    }

    public static int run_fineAlign(int[] iArr, int i, int i2, ImgType imgType, int[] iArr2, int[] iArr3) {
        if (!checkParameter(iArr, i, i2)) {
            return -1;
        }
        return fineAlign(iArr, i, i2, imgType.ordinal(), iArr2, iArr3);
    }

    public static int run_headPoseEstimation(int[] iArr, int[] iArr2, double[] dArr) {
        return headPoseEstimation(iArr, iArr2[0], dArr);
    }

    public static int run_imgQuality(int[] iArr, int i, int i2, int i3, int[] iArr2, int i4, float[] fArr, int[] iArr3, float[] fArr2, int[] iArr4) {
        if (!checkParameter(iArr, i, i2)) {
            return -1;
        }
        return imgQuality(iArr, i, i2, i3, iArr2, i4, fArr, iArr3, fArr2, iArr4);
    }

    public static int run_liveness(int[] iArr, int i, int i2, ImgType imgType, LivenessMethodType livenessMethodType, int[] iArr2, int[] iArr3, LivenessAction livenessAction, int[] iArr4) {
        if (!checkParameter(iArr, i, i2)) {
            return -1;
        }
        return liveness(iArr, i, i2, imgType.ordinal(), livenessMethodType.ordinal(), iArr2, iArr3, livenessAction.ordinal(), iArr4);
    }

    public static float run_livenessSilentPredict(LivenessTypeId livenessTypeId, int[] iArr, int i, int i2, int i3, int[] iArr2) {
        if (!checkParameter(iArr, i, i2)) {
            return -1.0f;
        }
        return livenessSilentPredict(livenessTypeId.ordinal(), iArr, i, i2, i3, iArr2);
    }

    public static float run_livenessSilentPredictByte(LivenessTypeId livenessTypeId, byte[] bArr, int i, int i2, int i3, int[] iArr) {
        if (!checkParameter(bArr, i, i2)) {
            return -1.0f;
        }
        return livenessSilentPredictByte(livenessTypeId.ordinal(), bArr, i, i2, i3, iArr);
    }

    public static int run_parsing(int[] iArr, int i, int i2, ImgType imgType, ParsMethodType parsMethodType, int[] iArr2, int i3, byte[] bArr) {
        if (!checkParameter(iArr, i, i2)) {
            return -1;
        }
        return parsing(iArr, i, i2, imgType.ordinal(), parsMethodType.ordinal(), iArr2, i3, bArr);
    }

    public static int run_tracking(int[] iArr, int i, int i2, ImgType imgType, AlignMethodType alignMethodType, int[] iArr2, int[] iArr3, float[] fArr) {
        if (!checkParameter(iArr, i, i2)) {
            return -1;
        }
        return tracking(iArr, i, i2, imgType.ordinal(), alignMethodType.ordinal(), iArr2, iArr3, fArr);
    }

    public static native int setNumberOfThreads(int i);

    public static native int setPerfLogFlag(int i);

    public static native int setValueLogFlag(int i);

    public static native FaceVerifyData superResolution(int[] iArr, int i, int i2, int i3);

    public static FaceVerifyData superResolution(int[] iArr, int i, int i2, ImgType imgType) {
        if (!checkParameter(iArr, i, i2)) {
            return null;
        }
        return superResolution(iArr, i, i2, imgType.ordinal());
    }

    public static int superResolutionMoelInit(Context context) {
        if (context == null || !BDFaceUtils.hasModel(context, FaceConfig.super_resolution_model_path)) {
            return -1;
        }
        return superResolutionMoelInit(context.getAssets(), FaceConfig.super_resolution_model_path);
    }

    public static native int superResolutionMoelInit(AssetManager assetManager, String str);

    public static native int tracking(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2, int[] iArr3, float[] fArr);
}
