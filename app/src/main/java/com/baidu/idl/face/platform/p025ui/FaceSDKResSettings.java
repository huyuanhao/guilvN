package com.baidu.idl.face.platform.p025ui;

import com.baidu.idl.face.platform.FaceEnvironment;
import com.baidu.idl.face.platform.FaceStatusEnum;

/* renamed from: com.baidu.idl.face.platform.ui.FaceSDKResSettings */
public class FaceSDKResSettings {
    public static void initializeResId() {
        FaceEnvironment.setSoundId(FaceStatusEnum.Detect_NoFace, C0429R.raw.detect_face_in);
        FaceEnvironment.setSoundId(FaceStatusEnum.Detect_FacePointOut, C0429R.raw.detect_face_in);
        FaceEnvironment.setSoundId(FaceStatusEnum.Liveness_Eye, C0429R.raw.liveness_eye);
        FaceEnvironment.setSoundId(FaceStatusEnum.Liveness_Mouth, C0429R.raw.liveness_mouth);
        FaceEnvironment.setSoundId(FaceStatusEnum.Liveness_HeadUp, C0429R.raw.liveness_head_up);
        FaceEnvironment.setSoundId(FaceStatusEnum.Liveness_HeadDown, C0429R.raw.liveness_head_down);
        FaceEnvironment.setSoundId(FaceStatusEnum.Liveness_HeadLeft, C0429R.raw.liveness_head_left);
        FaceEnvironment.setSoundId(FaceStatusEnum.Liveness_HeadRight, C0429R.raw.liveness_head_right);
        FaceEnvironment.setSoundId(FaceStatusEnum.Liveness_HeadLeftRight, C0429R.raw.liveness_head_left_right);
        FaceEnvironment.setSoundId(FaceStatusEnum.Liveness_OK, C0429R.raw.face_good);
        FaceEnvironment.setSoundId(FaceStatusEnum.OK, C0429R.raw.face_good);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_NoFace, C0429R.string.detect_no_face);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_FacePointOut, C0429R.string.detect_face_in);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_PoorIllumintion, C0429R.string.detect_low_light);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_ImageBlured, C0429R.string.detect_keep);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_OccLeftEye, C0429R.string.detect_occ_face);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_OccRightEye, C0429R.string.detect_occ_face);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_OccNose, C0429R.string.detect_occ_face);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_OccMouth, C0429R.string.detect_occ_face);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_OccLeftContour, C0429R.string.detect_occ_face);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_OccRightContour, C0429R.string.detect_occ_face);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_OccChin, C0429R.string.detect_occ_face);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_PitchOutOfUpMaxRange, C0429R.string.detect_head_down);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_PitchOutOfDownMaxRange, C0429R.string.detect_head_up);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_PitchOutOfLeftMaxRange, C0429R.string.detect_head_right);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_PitchOutOfRightMaxRange, C0429R.string.detect_head_left);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_FaceZoomIn, C0429R.string.detect_zoom_in);
        FaceEnvironment.setTipsId(FaceStatusEnum.Detect_FaceZoomOut, C0429R.string.detect_zoom_out);
        FaceEnvironment.setTipsId(FaceStatusEnum.Liveness_Eye, C0429R.string.liveness_eye);
        FaceEnvironment.setTipsId(FaceStatusEnum.Liveness_Mouth, C0429R.string.liveness_mouth);
        FaceEnvironment.setTipsId(FaceStatusEnum.Liveness_HeadUp, C0429R.string.liveness_head_up);
        FaceEnvironment.setTipsId(FaceStatusEnum.Liveness_HeadDown, C0429R.string.liveness_head_down);
        FaceEnvironment.setTipsId(FaceStatusEnum.Liveness_HeadLeft, C0429R.string.liveness_head_left);
        FaceEnvironment.setTipsId(FaceStatusEnum.Liveness_HeadRight, C0429R.string.liveness_head_right);
        FaceEnvironment.setTipsId(FaceStatusEnum.Liveness_HeadLeftRight, C0429R.string.liveness_head_left_right);
        FaceEnvironment.setTipsId(FaceStatusEnum.Liveness_OK, C0429R.string.liveness_good);
        FaceEnvironment.setTipsId(FaceStatusEnum.OK, C0429R.string.liveness_good);
        FaceEnvironment.setTipsId(FaceStatusEnum.Error_Timeout, C0429R.string.detect_timeout);
        FaceEnvironment.setTipsId(FaceStatusEnum.Error_DetectTimeout, C0429R.string.detect_timeout);
        FaceEnvironment.setTipsId(FaceStatusEnum.Error_LivenessTimeout, C0429R.string.detect_timeout);
    }
}
