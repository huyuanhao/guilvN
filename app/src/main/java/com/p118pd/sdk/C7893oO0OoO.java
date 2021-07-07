package com.p118pd.sdk;

import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.text.DecimalFormat;

/* renamed from: com.pd.sdk.oO0OoO  reason: case insensitive filesystem */
public final class C7893oO0OoO {
    public final double OooO00o;
    public final double OooO0O0;

    public C7893oO0OoO(double d, double d2) {
        this.OooO00o = d;
        this.OooO0O0 = d2;
    }

    public double OooO00o() {
        return this.OooO00o;
    }

    public double OooO0O0() {
        return this.OooO0O0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7893oO0OoO.class != obj.getClass()) {
            return false;
        }
        C7893oO0OoO oo0ooo = (C7893oO0OoO) obj;
        return Double.compare(oo0ooo.OooO00o, this.OooO00o) == 0 && Double.compare(oo0ooo.OooO0O0, this.OooO0O0) == 0;
    }

    public int hashCode() {
        double d = this.OooO00o;
        long j = 0;
        long doubleToLongBits = d != AbstractC8352oOoOOoO0.OooO0O0 ? Double.doubleToLongBits(d) : 0;
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        double d2 = this.OooO0O0;
        if (d2 != AbstractC8352oOoOOoO0.OooO0O0) {
            j = Double.doubleToLongBits(d2);
        }
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public String toString() {
        return this.OooO00o + ", " + this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19575OooO00o() {
        return this.OooO00o == AbstractC8352oOoOOoO0.OooO0O0 && this.OooO0O0 == AbstractC8352oOoOOoO0.OooO0O0;
    }

    @NotNull
    public static String OooO00o(double d) {
        double[] OooO00o2 = m19573OooO00o(d);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        return String.format("%s° %s' %s\"", decimalFormat.format(OooO00o2[0]), decimalFormat.format(OooO00o2[1]), decimalFormat.format(OooO00o2[2]));
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static double[] m19573OooO00o(double d) {
        int i = (int) d;
        double abs = Math.abs((d % 1.0d) * 60.0d);
        return new double[]{(double) i, (double) ((int) abs), (abs % 1.0d) * 60.0d};
    }

    @Nullable
    public static Double OooO00o(@NotNull Rational rational, @NotNull Rational rational2, @NotNull Rational rational3, boolean z) {
        double abs = Math.abs(rational.doubleValue()) + (rational2.doubleValue() / 60.0d) + (rational3.doubleValue() / 3600.0d);
        if (Double.isNaN(abs)) {
            return null;
        }
        if (z) {
            abs *= -1.0d;
        }
        return Double.valueOf(abs);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19574OooO00o() {
        return OooO00o(this.OooO00o) + ", " + OooO00o(this.OooO0O0);
    }
}
