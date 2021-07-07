package com.p118pd.sdk;

/* renamed from: com.pd.sdk.oOOo00o  reason: case insensitive filesystem */
public class C8180oOOo00o {
    public static final double OooO00o = 16384.0d;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int f21235OooO00o = 16384;
    public static final double OooO0O0 = 16384.999999999996d;

    public static float OooO00o(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static float OooO00o(float f, float f2, float f3) {
        return f <= f2 ? f2 : f >= f3 ? f3 : f;
    }

    public static int OooO00o(float f) {
        double d = (double) f;
        Double.isNaN(d);
        return ((int) (d + 16384.999999999996d)) - 16384;
    }

    public static int OooO00o(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static int OooO00o(int i, int i2, int i3) {
        return i <= i2 ? i2 : i >= i3 ? i3 : i;
    }

    public static float OooO0O0(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static int OooO0O0(float f) {
        double d = (double) f;
        Double.isNaN(d);
        return ((int) (d + 16384.0d)) - 16384;
    }

    public static int OooO0O0(int i, int i2) {
        return i < i2 ? i2 : i;
    }
}
