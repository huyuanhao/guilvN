package com.p118pd.sdk;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooOO00o  reason: case insensitive filesystem */
public class C9153oooOO00o extends C9152oooOO00O {
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m20894OooO00o(double d) {
        return !Double.isInfinite(d) && !Double.isNaN(d);
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final boolean m20896OooO0O0(double d) {
        return Double.isInfinite(d);
    }

    @InlineOnly
    public static final boolean OooO0OO(double d) {
        return Double.isNaN(d);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m20895OooO00o(float f) {
        return !Float.isInfinite(f) && !Float.isNaN(f);
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final boolean m20897OooO0O0(float f) {
        return Float.isInfinite(f);
    }

    @InlineOnly
    public static final boolean OooO0OO(float f) {
        return Float.isNaN(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final long OooO00o(double d) {
        return Double.doubleToLongBits(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final long OooO0O0(double d) {
        return Double.doubleToRawLongBits(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final double OooO00o(@NotNull O0O0O0 o0o0o0, long j) {
        return Double.longBitsToDouble(j);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final int OooO0O0(float f) {
        return Float.floatToRawIntBits(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final int OooO00o(float f) {
        return Float.floatToIntBits(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final float OooO00o(@NotNull C7287o0O0O00o o0o0o00o, int i) {
        return Float.intBitsToFloat(i);
    }
}
