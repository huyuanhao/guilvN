package com.p118pd.sdk;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* renamed from: com.pd.sdk.O0OoO0o */
public class O0OoO0o extends C7481o0OoO00o {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO(double d) {
        return Math.cos(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO00o(double d) {
        return Math.abs(d);
    }

    public static final int OooO00o(long j) {
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO0O0(double d) {
        return Math.acos(d);
    }

    @SinceKotlin(version = "1.2")
    public static final double OooO0OO(double d) {
        double d2 = (double) 1;
        if (d < d2) {
            return O0O0O0.f16953OooO00o.OooO0Oo();
        }
        if (d > C7478o0OoO00.OooO0o0) {
            return Math.log(d) + C7478o0OoO00.OooO00o;
        }
        Double.isNaN(d2);
        double d3 = d - d2;
        if (d3 >= C7478o0OoO00.OooO0Oo) {
            Double.isNaN(d2);
            return Math.log(d + Math.sqrt((d * d) - d2));
        }
        double sqrt = Math.sqrt(d3);
        if (sqrt >= C7478o0OoO00.OooO0OO) {
            double d4 = (double) 12;
            Double.isNaN(d4);
            sqrt -= ((sqrt * sqrt) * sqrt) / d4;
        }
        return sqrt * Math.sqrt(2.0d);
    }

    public static final int OooO0OO(int i) {
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO0Oo(double d) {
        return Math.asin(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO0o(double d) {
        return Math.atan(d);
    }

    @SinceKotlin(version = "1.2")
    public static final double OooO0o0(double d) {
        double d2 = C7478o0OoO00.OooO0Oo;
        if (d >= d2) {
            if (d <= C7478o0OoO00.OooO0o) {
                double d3 = (double) 1;
                Double.isNaN(d3);
                return Math.log(d + Math.sqrt((d * d) + d3));
            } else if (d > C7478o0OoO00.OooO0o0) {
                return Math.log(d) + C7478o0OoO00.OooO00o;
            } else {
                double d4 = (double) 2;
                Double.isNaN(d4);
                double d5 = d * d4;
                double d6 = (double) 1;
                Double.isNaN(d6);
                return Math.log(d5 + (d6 / d5));
            }
        } else if (d <= (-d2)) {
            return -OooO0o0(-d);
        } else {
            if (Math.abs(d) < C7478o0OoO00.OooO0OO) {
                return d;
            }
            double d7 = (double) 6;
            Double.isNaN(d7);
            return d - (((d * d) * d) / d7);
        }
    }

    @SinceKotlin(version = "1.2")
    public static final double OooO0oO(double d) {
        if (Math.abs(d) >= C7478o0OoO00.OooO0Oo) {
            double d2 = (double) 1;
            Double.isNaN(d2);
            Double.isNaN(d2);
            double log = Math.log((d2 + d) / (d2 - d));
            double d3 = (double) 2;
            Double.isNaN(d3);
            return log / d3;
        } else if (Math.abs(d) <= C7478o0OoO00.OooO0OO) {
            return d;
        } else {
            double d4 = (double) 3;
            Double.isNaN(d4);
            return d + (((d * d) * d) / d4);
        }
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO0oo(double d) {
        return Math.ceil(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooOO0(double d) {
        return Math.cosh(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooOO0O(double d) {
        return Math.exp(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooOO0o(double d) {
        return Math.expm1(d);
    }

    public static final double OooOOO(double d) {
        return Math.abs(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooOOO0(double d) {
        return Math.floor(d);
    }

    public static final double OooOOOO(double d) {
        return Math.signum(d);
    }

    public static final double OooOOOo(double d) {
        return Math.ulp(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooOOo(double d) {
        return Math.log1p(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooOOo0(double d) {
        return Math.log(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooOOoo(double d) {
        return Math.log10(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooOo(double d) {
        return Math.signum(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooOo0(double d) {
        return Math.nextAfter(d, O0O0O0.f16953OooO00o.OooO0OO());
    }

    @SinceKotlin(version = "1.2")
    public static final double OooOo00(double d) {
        return Math.log(d) / C7478o0OoO00.OooO00o;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooOo0O(double d) {
        return Math.nextUp(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooOo0o(double d) {
        return Math.rint(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooOoO(double d) {
        return Math.sinh(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooOoO0(double d) {
        return Math.sin(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooOoOO(double d) {
        return Math.sqrt(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooOoo(double d) {
        return Math.tanh(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooOoo0(double d) {
        return Math.tan(d);
    }

    @SinceKotlin(version = "1.2")
    public static final double OooOooO(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return d;
        }
        if (d > ((double) 0)) {
            return Math.floor(d);
        }
        return Math.ceil(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO(double d, double d2) {
        return Math.copySign(d, d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO00o(double d, int i) {
        return Math.pow(d, (double) i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO0O0(double d, double d2) {
        return Math.atan2(d, d2);
    }

    @SinceKotlin(version = "1.2")
    public static final double OooO0Oo(double d, double d2) {
        if (d2 <= AbstractC8352oOoOOoO0.OooO0O0 || d2 == 1.0d) {
            return O0O0O0.f16953OooO00o.OooO0Oo();
        }
        return Math.log(d) / Math.log(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO0o(double d, double d2) {
        return Math.min(d, d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO0oo(double d, double d2) {
        return Math.pow(d, d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooOO0(float f) {
        return (float) Math.cosh((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooOO0O(float f) {
        return (float) Math.exp((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooOO0o(float f) {
        return (float) Math.expm1((double) f);
    }

    public static final float OooOOO(float f) {
        return Math.abs(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooOOO0(float f) {
        return (float) Math.floor((double) f);
    }

    public static final float OooOOOO(float f) {
        return Math.signum(f);
    }

    public static final float OooOOOo(float f) {
        return Math.ulp(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooOOo(float f) {
        return (float) Math.log1p((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooOOo0(float f) {
        return (float) Math.log((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooOOoo(float f) {
        return (float) Math.log10((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooOo(float f) {
        return Math.signum(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooOo0(float f) {
        return Math.nextAfter(f, O0O0O0.f16953OooO00o.OooO0OO());
    }

    @SinceKotlin(version = "1.2")
    public static final float OooOo00(float f) {
        return (float) (Math.log((double) f) / C7478o0OoO00.OooO00o);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooOo0O(float f) {
        return Math.nextUp(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooOo0o(float f) {
        return (float) Math.rint((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooOoO(float f) {
        return (float) Math.sinh((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooOoO0(float f) {
        return (float) Math.sin((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooOoOO(float f) {
        return (float) Math.sqrt((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooOoo(float f) {
        return (float) Math.tanh((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooOoo0(float f) {
        return (float) Math.tan((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO(float f) {
        return (float) Math.cos((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO00o(double d, double d2) {
        return Math.IEEEremainder(d, d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO0O0(double d, int i) {
        return Math.copySign(d, (double) i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO0o(float f) {
        return (float) Math.atan((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO0oo(float f) {
        return (float) Math.ceil((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO(float f, float f2) {
        return Math.copySign(f, f2);
    }

    @SinceKotlin(version = "1.2")
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final int m16520OooO00o(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d > ((double) Integer.MAX_VALUE)) {
            return Integer.MAX_VALUE;
        } else {
            if (d < ((double) Integer.MIN_VALUE)) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO0O0(float f) {
        return (float) Math.acos((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO0Oo(float f) {
        return (float) Math.asin((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO0o(float f, float f2) {
        return Math.min(f, f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO0oo(float f, float f2) {
        return (float) Math.pow((double) f, (double) f2);
    }

    @SinceKotlin(version = "1.2")
    public static final float OooOooO(float f) {
        double d;
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return f;
        }
        if (f > ((float) 0)) {
            d = Math.floor((double) f);
        } else {
            d = Math.ceil((double) f);
        }
        return (float) d;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO0O0(float f, float f2) {
        return (float) Math.atan2((double) f, (double) f2);
    }

    @SinceKotlin(version = "1.2")
    public static final float OooO0Oo(float f, float f2) {
        if (f2 <= 0.0f || f2 == 1.0f) {
            return C7287o0O0O00o.f19959OooO00o.OooO0Oo();
        }
        return (float) (Math.log((double) f) / Math.log((double) f2));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO0oO(double d, double d2) {
        return Math.nextAfter(d, d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO0O0(float f, int i) {
        return Math.copySign(f, (float) i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO0oO(float f) {
        return (float) OooO0oO((double) f);
    }

    @SinceKotlin(version = "1.2")
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m16522OooO00o(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final int OooO0O0(int i, int i2) {
        return Math.min(i, i2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO0oO(float f, float f2) {
        return Math.nextAfter(f, (double) f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO00o(float f) {
        return Math.abs(f);
    }

    public static final int OooO0O0(int i) {
        return Math.abs(i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO00o(float f, int i) {
        return (float) Math.pow((double) f, (double) i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final long OooO0O0(long j, long j2) {
        return Math.min(j, j2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO00o(float f, float f2) {
        return (float) Math.IEEEremainder((double) f, (double) f2);
    }

    public static final long OooO0O0(long j) {
        return Math.abs(j);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO0OO(double d, double d2) {
        return Math.hypot(d, d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO0o0(double d, double d2) {
        return Math.max(d, d2);
    }

    @SinceKotlin(version = "1.2")
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final int m16521OooO00o(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO0OO(float f) {
        return (float) OooO0OO((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO0o0(float f) {
        return (float) OooO0o0((double) f);
    }

    @SinceKotlin(version = "1.2")
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m16523OooO00o(float f) {
        return m16522OooO00o((double) f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO0OO(float f, float f2) {
        return (float) Math.hypot((double) f, (double) f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO0o0(float f, float f2) {
        return Math.max(f, f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final int OooO00o(int i) {
        return Math.abs(i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final int OooO00o(int i, int i2) {
        return Math.max(i, i2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m16524OooO00o(long j) {
        return Math.abs(j);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final long OooO00o(long j, long j2) {
        return Math.max(j, j2);
    }
}
