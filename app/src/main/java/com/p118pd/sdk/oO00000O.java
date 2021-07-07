package com.p118pd.sdk;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.oO00000O */
public final class oO00000O implements ClosedFloatingPointRange<Double> {
    public final double OooO00o;
    public final double OooO0O0;

    public oO00000O(double d, double d2) {
        this.OooO00o = d;
        this.OooO0O0 = d2;
    }

    public boolean OooO00o(double d, double d2) {
        return d <= d2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean OooO00o(Double d) {
        return OooO00o(d.doubleValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof oO00000O) {
            if (!isEmpty() || !((oO00000O) obj).isEmpty()) {
                oO00000O oo00000o = (oO00000O) obj;
                if (!(this.OooO00o == oo00000o.OooO00o && this.OooO0O0 == oo00000o.OooO0O0)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.valueOf(this.OooO00o).hashCode() * 31) + Double.valueOf(this.OooO0O0).hashCode();
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return this.OooO00o > this.OooO0O0;
    }

    @NotNull
    public String toString() {
        return this.OooO00o + ".." + this.OooO0O0;
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    /* renamed from: OooO0O0 */
    public Double OooO00o() {
        return Double.valueOf(this.OooO00o);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable, java.lang.Comparable] */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean OooO00o(Double d, Double d2) {
        return OooO00o(d.doubleValue(), d2.doubleValue());
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    /* renamed from: OooO00o */
    public Double OooO0O0() {
        return Double.valueOf(this.OooO0O0);
    }

    public boolean OooO00o(double d) {
        return d >= this.OooO00o && d <= this.OooO0O0;
    }
}
