package com.p118pd.sdk;

/* renamed from: com.pd.sdk.OooOO0  reason: case insensitive filesystem */
public class C5937OooOO0 {
    public static final float OooO00o = 0.017453292f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C5937OooOO0 f17031OooO00o = null;
    public static final float OooO0O0 = 9.0E-4f;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int f17032OooO0O0 = 0;
    public static final float OooO0OO = -0.10471976f;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final int f17033OooO0OO = 1;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final long f17034OooO0OO = 946728000000L;
    public static final float OooO0Oo = 0.0334196f;
    public static final float OooO0o = 5.236E-6f;
    public static final float OooO0o0 = 3.49066E-4f;
    public static final float OooO0oO = 0.4092797f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f17035OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f17036OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f17037OooO0O0;

    public static C5937OooOO0 OooO00o() {
        if (f17031OooO00o == null) {
            f17031OooO00o = new C5937OooOO0();
        }
        return f17031OooO00o;
    }

    public void OooO00o(long j, double d, double d2) {
        float f = ((float) (j - f17034OooO0OO)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double sin = (Math.sin(d3) * 0.03341960161924362d) + d3 + (Math.sin((double) (2.0f * f2)) * 3.4906598739326E-4d) + (Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double d5 = (double) (f - 9.0E-4f);
        Double.isNaN(d5);
        double round = (double) (((float) Math.round(d5 - d4)) + 9.0E-4f);
        Double.isNaN(round);
        double sin2 = round + d4 + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * sin) * -0.0069d);
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d6 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(d6) * Math.sin(asin))) / (Math.cos(d6) * Math.cos(asin));
        if (sin3 >= 1.0d) {
            this.f17035OooO00o = 1;
            this.f17036OooO00o = -1;
            this.f17037OooO0O0 = -1;
        } else if (sin3 <= -1.0d) {
            this.f17035OooO00o = 0;
            this.f17036OooO00o = -1;
            this.f17037OooO0O0 = -1;
        } else {
            double acos = (double) ((float) (Math.acos(sin3) / 6.283185307179586d));
            Double.isNaN(acos);
            this.f17036OooO00o = Math.round((sin2 + acos) * 8.64E7d) + f17034OooO0OO;
            Double.isNaN(acos);
            long round2 = Math.round((sin2 - acos) * 8.64E7d) + f17034OooO0OO;
            this.f17037OooO0O0 = round2;
            if (round2 >= j || this.f17036OooO00o <= j) {
                this.f17035OooO00o = 1;
            } else {
                this.f17035OooO00o = 0;
            }
        }
    }
}
