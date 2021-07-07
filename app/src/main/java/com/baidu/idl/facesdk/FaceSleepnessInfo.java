package com.baidu.idl.facesdk;

public class FaceSleepnessInfo {
    public float bluriness;
    public float[] headPose;
    public float illum;
    public int[] landmarks;
    public float left_eye_close_prob;
    public float left_eye_open_prob;
    public float mouth_close_prob;
    public float mouth_open_prob;
    public float[] occlusions;
    public float right_eye_close_prob;
    public float right_eye_open_prob;

    public FaceSleepnessInfo(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int[] iArr, float[] fArr, float[] fArr2) {
        this.left_eye_open_prob = f;
        this.left_eye_close_prob = f2;
        this.right_eye_open_prob = f3;
        this.right_eye_close_prob = f4;
        this.mouth_open_prob = f5;
        this.mouth_close_prob = f6;
        this.bluriness = f7;
        this.illum = f8;
        this.landmarks = iArr;
        this.headPose = fArr;
        this.occlusions = fArr2;
    }
}
