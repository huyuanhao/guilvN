package com.p118pd.sdk;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.OO0000O */
public final class OO0000O implements ClosedFloatingPointRange<Float> {
    public final float OooO0Oo;
    public final float OooO0o0;

    public OO0000O(float f, float f2) {
        this.OooO0Oo = f;
        this.OooO0o0 = f2;
    }

    public boolean OooO00o(float f, float f2) {
        return f <= f2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean OooO00o(Float f) {
        return OooO00o(f.floatValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof OO0000O) {
            if (!isEmpty() || !((OO0000O) obj).isEmpty()) {
                OO0000O oo0000o = (OO0000O) obj;
                if (!(this.OooO0Oo == oo0000o.OooO0Oo && this.OooO0o0 == oo0000o.OooO0o0)) {
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
        return (Float.valueOf(this.OooO0Oo).hashCode() * 31) + Float.valueOf(this.OooO0o0).hashCode();
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return this.OooO0Oo > this.OooO0o0;
    }

    @NotNull
    public String toString() {
        return this.OooO0Oo + ".." + this.OooO0o0;
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    /* renamed from: OooO0O0 */
    public Float OooO00o() {
        return Float.valueOf(this.OooO0Oo);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable, java.lang.Comparable] */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean OooO00o(Float f, Float f2) {
        return OooO00o(f.floatValue(), f2.floatValue());
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    /* renamed from: OooO00o */
    public Float OooO0O0() {
        return Float.valueOf(this.OooO0o0);
    }

    public boolean OooO00o(float f) {
        return f >= this.OooO0Oo && f <= this.OooO0o0;
    }
}
