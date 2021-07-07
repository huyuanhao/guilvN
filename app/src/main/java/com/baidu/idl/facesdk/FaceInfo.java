package com.baidu.idl.facesdk;

public class FaceInfo {
    public int face_id;
    public float[] headPose;
    public int[] is_live;
    public int[] landmarks;
    public int mAngle;
    public int mCenter_x;
    public int mCenter_y;
    public float mConf;
    public int mWidth;

    public FaceInfo(int i, int i2, int i3, int i4, float f) {
        this.mWidth = i;
        this.mAngle = i2;
        this.mCenter_y = i3;
        this.mCenter_x = i4;
        this.mConf = f;
        this.landmarks = null;
        this.face_id = 0;
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

    public int get_leftEyeState() {
        int[] iArr = this.is_live;
        if (iArr == null || iArr.length != 11) {
            return 0;
        }
        return iArr[1];
    }

    public int get_mouthState() {
        int[] iArr = this.is_live;
        if (iArr == null || iArr.length != 11) {
            return 0;
        }
        return iArr[4];
    }

    public int get_rightEyeState() {
        int[] iArr = this.is_live;
        if (iArr == null || iArr.length != 11) {
            return 0;
        }
        return iArr[2];
    }

    public boolean is_live() {
        int[] iArr = this.is_live;
        if (iArr != null && iArr.length == 11 && 1 == iArr[0]) {
            return true;
        }
        return false;
    }

    public boolean is_live_head_down() {
        int[] iArr = this.is_live;
        if (iArr != null && iArr.length == 11 && 1 == iArr[9]) {
            return true;
        }
        return false;
    }

    public boolean is_live_head_turn_left() {
        int[] iArr = this.is_live;
        if (iArr != null && iArr.length == 11 && 1 == iArr[5]) {
            return true;
        }
        return false;
    }

    public boolean is_live_head_turn_right() {
        int[] iArr = this.is_live;
        if (iArr != null && iArr.length == 11 && 1 == iArr[6]) {
            return true;
        }
        return false;
    }

    public boolean is_live_head_up() {
        int[] iArr = this.is_live;
        if (iArr != null && iArr.length == 11 && 1 == iArr[8]) {
            return true;
        }
        return false;
    }

    public boolean is_live_mouth() {
        int[] iArr = this.is_live;
        if (iArr != null && iArr.length == 11 && 1 == iArr[3]) {
            return true;
        }
        return false;
    }

    public FaceInfo(int i, int i2, int i3, int i4, float f, int i5, int[] iArr) {
        this.mWidth = i;
        this.mAngle = i2;
        this.mCenter_y = i3;
        this.mCenter_x = i4;
        this.mConf = f;
        this.landmarks = iArr;
        this.face_id = i5;
    }

    public FaceInfo(int i, int i2, int i3, int i4, float f, int i5, int[] iArr, float[] fArr, int[] iArr2) {
        this.mWidth = i;
        this.mAngle = i2;
        this.mCenter_y = i3;
        this.mCenter_x = i4;
        this.mConf = f;
        this.landmarks = iArr;
        this.face_id = i5;
        this.headPose = fArr;
        this.is_live = iArr2;
    }
}
