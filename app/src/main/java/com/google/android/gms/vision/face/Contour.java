package com.google.android.gms.vision.face;

import android.graphics.PointF;

public final class Contour {
    public static final int FACE = 1;
    public static final int LEFT_EYE = 6;
    public static final int LEFT_EYEBROW_BOTTOM = 3;
    public static final int LEFT_EYEBROW_TOP = 2;
    public static final int LOWER_LIP_BOTTOM = 11;
    public static final int LOWER_LIP_TOP = 10;
    public static final int NOSE_BOTTOM = 13;
    public static final int NOSE_BRIDGE = 12;
    public static final int RIGHT_EYE = 7;
    public static final int RIGHT_EYEBROW_BOTTOM = 5;
    public static final int RIGHT_EYEBROW_TOP = 4;
    public static final int UPPER_LIP_BOTTOM = 9;
    public static final int UPPER_LIP_TOP = 8;
    public final int type;
    public final PointF[] zzbz;

    public Contour(PointF[] pointFArr, int i) {
        this.zzbz = pointFArr;
        this.type = i;
    }

    public final PointF[] getPositions() {
        return this.zzbz;
    }

    public final int getType() {
        return this.type;
    }
}
