package com.baidu.idl.facesdk;

import android.content.Context;
import android.content.res.AssetManager;
import com.baidu.idl.facesdk.FaceSDK;
import java.util.HashMap;
import java.util.Map;

public class FaceTracker {
    public static final String TAG = "FaceTracker";
    public Map<String, Boolean> abilities = new HashMap();
    public Context context;
    public long index = 1;

    public enum ActionType {
        DELETE,
        REGIST,
        VERIFY,
        RECOGNIZE
    }

    public enum ErrCode {
        OK,
        PITCH_OUT_OF_DOWN_MAX_RANGE,
        PITCH_OUT_OF_UP_MAX_RANGE,
        YAW_OUT_OF_LEFT_MAX_RANGE,
        YAW_OUT_OF_RIGHT_MAX_RANGE,
        POOR_ILLUMINATION,
        NO_FACE_DETECTED,
        DATA_NOT_READY,
        DATA_HIT_ONE,
        DATA_HIT_LAST,
        IMG_BLURED,
        OCCLUSION_LEFT_EYE,
        OCCLUSION_RIGHT_EYE,
        OCCLUSION_NOSE,
        OCCLUSION_MOUTH,
        OCCLUSION_LEFT_CONTOUR,
        OCCLUSION_RIGHT_CONTOUR,
        OCCLUSION_CHIN_CONTOUR,
        FACE_NOT_COMPLETE,
        UNKNOW_TYPE
    }

    public FaceTracker(Context context2) {
        if (context2 != null) {
            create();
            if (BDFaceUtils.hasModel(context2, FaceConfig.cdnn_alignmodel_path)) {
                AlignModelInit(context2.getAssets(), FaceConfig.cdnn_alignmodel_path, "", FaceSDK.AlignMethodType.CDNN.ordinal());
                this.abilities.put(FaceConfig.cdnn_alignmodel_path, true);
            }
            if (BDFaceUtils.hasModel(context2, FaceConfig.detect_cnn_model)) {
                DetectModelInit(context2.getAssets(), FaceConfig.detect_cnn_model, FaceSDK.DetectMethodType.CNN.ordinal());
                this.abilities.put(FaceConfig.detect_cnn_model, true);
            }
            if (BDFaceUtils.hasModel(context2, FaceConfig.detect_nir_model)) {
                DetectModelInit(context2.getAssets(), FaceConfig.detect_nir_model, FaceSDK.DetectMethodType.NIR.ordinal());
                this.abilities.put(FaceConfig.detect_nir_model, true);
            }
            if (BDFaceUtils.hasModel(context2, FaceConfig.score_model)) {
                ScoreModelInit(context2.getAssets(), FaceConfig.score_model, "", FaceSDK.DetectMethodType.CNN.ordinal());
                this.abilities.put(FaceConfig.score_model, true);
            }
            if (BDFaceUtils.hasModel(context2, FaceConfig.blur_model)) {
                imgQualityModelInit(context2.getAssets(), FaceConfig.blur_model, "", FaceSDK.QualityModelType.QUALITY_BLUR.ordinal());
                this.abilities.put(FaceConfig.blur_model, true);
            }
            if (BDFaceUtils.hasModel(context2, FaceConfig.occlusion_model)) {
                imgQualityModelInit(context2.getAssets(), FaceConfig.occlusion_model, "", FaceSDK.QualityModelType.QUALITY_OCCLUSION.ordinal());
                this.abilities.put(FaceConfig.occlusion_model, true);
            }
        }
    }

    private native int AlignModelInit(AssetManager assetManager, String str, String str2, int i);

    private native int DetectModelInit(AssetManager assetManager, String str, int i);

    private native int ParsingModelInit(AssetManager assetManager, String str, String str2, int i);

    private native int ScoreModelInit(AssetManager assetManager, String str, String str2, int i);

    private native int create();

    private native int imgQualityModelInit(AssetManager assetManager, String str, String str2, int i);

    private native void tracking(int[] iArr, int i, int i2, int i3, int i4);

    public native int clearTrackedFaces();

    public ErrCode faceVerification(int[] iArr, int i, int i2, FaceSDK.ImgType imgType, ActionType actionType) {
        if (!FaceSDK.checkParameter(iArr, i, i2)) {
            return ErrCode.UNKNOW_TYPE;
        }
        int prepare_data_for_verify = prepare_data_for_verify(iArr, i, i2, imgType.ordinal(), actionType.ordinal());
        if (prepare_data_for_verify == ErrCode.OK.ordinal()) {
            return ErrCode.OK;
        }
        if (prepare_data_for_verify > 0) {
            return ErrCode.values()[prepare_data_for_verify];
        }
        return ErrCode.UNKNOW_TYPE;
    }

    public native FaceVerifyData[] get_FaceVerifyData(int i);

    public native FaceInfo[] get_TrackedFaceInfo();

    public native FaceSleepnessInfo[] get_sleepnessInfo();

    public ErrCode maxFaceVerification(int[] iArr, int i, int i2, FaceSDK.ImgType imgType, ActionType actionType) {
        if (!FaceSDK.checkParameter(iArr, i, i2)) {
            return ErrCode.UNKNOW_TYPE;
        }
        int prepare_max_face_data_for_verify = prepare_max_face_data_for_verify(iArr, i, i2, imgType.ordinal(), actionType.ordinal());
        if (prepare_max_face_data_for_verify == ErrCode.OK.ordinal()) {
            return ErrCode.OK;
        }
        if (prepare_max_face_data_for_verify > 0) {
            return ErrCode.values()[prepare_max_face_data_for_verify];
        }
        return ErrCode.UNKNOW_TYPE;
    }

    public native int prepare_data_for_verify(int[] iArr, int i, int i2, int i3, int i4);

    public native int prepare_max_face_data_for_verify(int[] iArr, int i, int i2, int i3, int i4);

    public native int re_collect_reg_imgs();

    public native int setAppType(int i);

    public native int set_AlignMethodType(int i);

    public native int set_DetectMethodType(int i);

    public native int set_blur_thr(float f);

    public native int set_cropFaceEnlargeRatio(float f);

    public native int set_cropFaceSize(int i);

    public native int set_detect_in_video_interval(int i);

    @Deprecated
    public native int set_detection_frame_interval(int i);

    public native int set_eulur_angle_thr(int i, int i2, int i3);

    public native int set_illum_thr(float f);

    @Deprecated
    public native int set_intervalTime(long j);

    public native int set_isCheckQuality(boolean z);

    public native int set_isFineAlign(boolean z);

    public native int set_isVerifyLive(boolean z);

    public native int set_max_reg_img_num(int i);

    public native int set_min_face_size(int i);

    public native int set_notFace_thr(float f);

    public native int set_occlu_thr(float f);

    public native int set_track_by_detection_interval(int i);

    public void track(int[] iArr, int i, int i2, int i3, int i4) {
        if (FaceSDK.checkParameter(iArr, i, i2)) {
            tracking(iArr, i, i2, i3, i4);
        }
    }
}
