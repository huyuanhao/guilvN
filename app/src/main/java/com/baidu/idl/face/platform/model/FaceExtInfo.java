package com.baidu.idl.face.platform.model;

import android.graphics.Point;
import android.graphics.Rect;
import com.baidu.idl.facesdk.FaceInfo;
import java.util.HashMap;

public class FaceExtInfo {
    public static int[] comp1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    public static int[] comp2 = {13, 14, 15, 16, 17, 18, 19, 20, 13, 21};
    public static int[] comp3 = {22, 23, 24, 25, 26, 27, 28, 29, 22};
    public static int[] comp4 = {30, 31, 32, 33, 34, 35, 36, 37, 30, 38};
    public static int[] comp5 = {39, 40, 41, 42, 43, 44, 45, 46, 39};
    public static int[] comp6 = {47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 47};
    public static int[] comp7 = {51, 57, 52};
    public static int[] comp8 = {58, 59, 60, 61, 62, 63, 64, 65, 58};
    public static int[] comp9 = {58, 66, 67, 68, 62, 69, 70, 71, 58};
    public static int nComponents = 9;
    public static int[] nPoints = {13, 10, 9, 10, 9, 11, 3, 9, 9};
    public HashMap<String, Point[]> facePointMap;
    public int face_id;
    public float[] headPose;
    public int[] is_live;
    public int[] landmarks;
    public int mAngle;
    public int mCenter_x;
    public int mCenter_y;
    public float mConf;
    public float mPitch;
    public float mRoll;
    public int mWidth;
    public float mYaw;

    public FaceExtInfo() {
    }

    public void addFaceInfo(FaceInfo faceInfo) {
        this.mWidth = faceInfo.mWidth;
        this.mAngle = faceInfo.mAngle;
        this.mCenter_y = faceInfo.mCenter_y;
        this.mCenter_x = faceInfo.mCenter_x;
        this.mConf = faceInfo.mConf;
        this.landmarks = faceInfo.landmarks;
        this.face_id = faceInfo.face_id;
        this.headPose = faceInfo.headPose;
        this.is_live = faceInfo.is_live;
    }

    public float getConfidence() {
        return this.mConf;
    }

    public int getFaceId() {
        return this.face_id;
    }

    public Rect getFaceRect() {
        int i = this.mCenter_x;
        int i2 = this.mWidth;
        return new Rect(i - (i2 / 2), this.mCenter_y - (i2 / 2), i2, i2);
    }

    public int getFaceWidth() {
        return this.mWidth;
    }

    public int getLandmarksOutOfDetectCount(Rect rect) {
        if (this.landmarks.length != 144) {
            return 0;
        }
        int[][] iArr = {comp1, comp2, comp3, comp4, comp5, comp6, comp7, comp8, comp9};
        float[] fArr = new float[4];
        int i = 0;
        for (int i2 = 0; i2 < nComponents; i2++) {
            int i3 = 0;
            while (i3 < nPoints[i2] - 1) {
                int[] iArr2 = this.landmarks;
                fArr[0] = (float) iArr2[iArr[i2][i3] << 1];
                fArr[1] = (float) iArr2[(iArr[i2][i3] << 1) + 1];
                i3++;
                fArr[2] = (float) iArr2[iArr[i2][i3] << 1];
                fArr[3] = (float) iArr2[(iArr[i2][i3] << 1) + 1];
                if (!rect.contains((int) (fArr[0] * 1.0f), (int) (fArr[1] * 1.0f))) {
                    i++;
                }
                if (!rect.contains((int) (fArr[2] * 1.0f), (int) (fArr[3] * 1.0f))) {
                    i++;
                }
            }
        }
        return i;
    }

    public int getLeftEyeState() {
        int[] iArr = this.is_live;
        if (iArr == null || iArr.length != 11) {
            return 0;
        }
        return iArr[1];
    }

    public int[] getLiveInfo() {
        return this.is_live;
    }

    public int getMouthState() {
        int[] iArr = this.is_live;
        if (iArr == null || iArr.length != 11) {
            return 0;
        }
        return iArr[4];
    }

    public float getPitch() {
        float[] fArr = this.headPose;
        this.mPitch = fArr[0];
        if (fArr != null && fArr.length > 0) {
            this.mPitch = fArr[0];
        }
        return this.mPitch;
    }

    public void getRectPoints(int[] iArr) {
        int[] iArr2 = iArr;
        double d = (double) this.mAngle;
        Double.isNaN(d);
        double d2 = (d * 3.14159d) / 180.0d;
        double cos = Math.cos(d2);
        double sin = Math.sin(d2);
        double d3 = (double) this.mCenter_x;
        int i = this.mWidth;
        double d4 = (double) i;
        Double.isNaN(d4);
        Double.isNaN(d3);
        double d5 = d3 + ((d4 * cos) / 2.0d);
        double d6 = (double) i;
        Double.isNaN(d6);
        int i2 = (int) (d5 - ((d6 * sin) / 2.0d));
        double d7 = (double) this.mCenter_y;
        double d8 = (double) i;
        Double.isNaN(d8);
        Double.isNaN(d7);
        double d9 = d7 + ((sin * d8) / 2.0d);
        double d10 = (double) i;
        Double.isNaN(d10);
        int i3 = (int) (d9 + ((cos * d10) / 2.0d));
        double d11 = (double) this.mAngle;
        Double.isNaN(d11);
        double d12 = (d11 * 3.14159d) / 180.0d;
        double cos2 = Math.cos(d12) * 0.5d;
        double sin2 = Math.sin(d12) * 0.5d;
        if (iArr2 == null || iArr2.length == 0) {
            iArr2 = new int[8];
        }
        double d13 = (double) i2;
        int i4 = this.mWidth;
        double d14 = (double) i4;
        Double.isNaN(d14);
        Double.isNaN(d13);
        double d15 = (double) i4;
        Double.isNaN(d15);
        iArr2[0] = (int) ((d13 - (d14 * sin2)) - (d15 * cos2));
        double d16 = (double) i3;
        double d17 = (double) i4;
        Double.isNaN(d17);
        Double.isNaN(d16);
        double d18 = (double) i4;
        Double.isNaN(d18);
        iArr2[1] = (int) ((d16 + (d17 * cos2)) - (d18 * sin2));
        double d19 = (double) i4;
        Double.isNaN(d19);
        Double.isNaN(d13);
        double d20 = d13 + (d19 * sin2);
        double d21 = (double) i4;
        Double.isNaN(d21);
        iArr2[2] = (int) (d20 - (d21 * cos2));
        double d22 = (double) i4;
        Double.isNaN(d22);
        Double.isNaN(d16);
        double d23 = d16 - (cos2 * d22);
        double d24 = (double) i4;
        Double.isNaN(d24);
        iArr2[3] = (int) (d23 - (sin2 * d24));
        int i5 = i2 * 2;
        iArr2[4] = i5 - iArr2[0];
        int i6 = i3 * 2;
        iArr2[5] = i6 - iArr2[1];
        iArr2[6] = i5 - iArr2[2];
        iArr2[7] = i6 - iArr2[3];
    }

    public int getRightEyeState() {
        int[] iArr = this.is_live;
        if (iArr == null || iArr.length != 11) {
            return 0;
        }
        return iArr[2];
    }

    public float getRoll() {
        float[] fArr = this.headPose;
        if (fArr != null && fArr.length > 2) {
            this.mRoll = fArr[2];
        }
        return this.mRoll;
    }

    public float getYaw() {
        float[] fArr = this.headPose;
        if (fArr != null && fArr.length > 1) {
            this.mYaw = fArr[1];
        }
        return this.mYaw;
    }

    public boolean isLiveEye() {
        int[] iArr = this.is_live;
        return iArr != null && iArr.length == 11 && 1 == iArr[0];
    }

    public boolean isLiveHeadDown() {
        int[] iArr = this.is_live;
        return iArr != null && iArr.length == 11 && 1 == iArr[9];
    }

    public boolean isLiveHeadTurnLeft() {
        int[] iArr = this.is_live;
        return iArr != null && iArr.length == 11 && 1 == iArr[5];
    }

    public boolean isLiveHeadTurnLeftOrRight() {
        int[] iArr = this.is_live;
        if (iArr == null || iArr.length != 11) {
            return false;
        }
        return 1 == iArr[5] || 1 == iArr[6];
    }

    public boolean isLiveHeadTurnRight() {
        int[] iArr = this.is_live;
        return iArr != null && iArr.length == 11 && 1 == iArr[6];
    }

    public boolean isLiveHeadUp() {
        int[] iArr = this.is_live;
        return iArr != null && iArr.length == 11 && 1 == iArr[8];
    }

    public boolean isLiveMouth() {
        int[] iArr = this.is_live;
        return iArr != null && iArr.length == 11 && 1 == iArr[3];
    }

    public boolean isOutofDetectRect(Rect rect) {
        return rect.contains(getFaceRect());
    }

    public FaceExtInfo(FaceInfo faceInfo) {
        this.mWidth = faceInfo.mWidth;
        this.mAngle = faceInfo.mAngle;
        this.mCenter_y = faceInfo.mCenter_y;
        this.mCenter_x = faceInfo.mCenter_x;
        this.mConf = faceInfo.mConf;
        this.landmarks = faceInfo.landmarks;
        this.face_id = faceInfo.face_id;
        this.headPose = faceInfo.headPose;
        this.is_live = faceInfo.is_live;
    }
}
