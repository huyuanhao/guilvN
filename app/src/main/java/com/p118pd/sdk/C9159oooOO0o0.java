package com.p118pd.sdk;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooOO0o0  reason: case insensitive filesystem */
public class C9159oooOO0o0 {
    @InlineOnly
    public static final BigDecimal OooO00o(@NotNull BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        o0O0OO00.OooO0o(bigDecimal, "receiver$0");
        BigDecimal divide = bigDecimal.divide(bigDecimal2, RoundingMode.HALF_EVEN);
        o0O0OO00.OooO00o((Object) divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        return divide;
    }

    @InlineOnly
    public static final BigDecimal OooO0O0(@NotNull BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        o0O0OO00.OooO0o(bigDecimal, "receiver$0");
        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
        o0O0OO00.OooO00o((Object) subtract, "this.subtract(other)");
        return subtract;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use rem(other) instead", replaceWith = @ReplaceWith(expression = "rem(other)", imports = {}))
    @InlineOnly
    public static final BigDecimal OooO0OO(@NotNull BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        o0O0OO00.OooO0o(bigDecimal, "receiver$0");
        BigDecimal remainder = bigDecimal.remainder(bigDecimal2);
        o0O0OO00.OooO00o((Object) remainder, "this.remainder(other)");
        return remainder;
    }

    @InlineOnly
    public static final BigDecimal OooO0Oo(@NotNull BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        o0O0OO00.OooO0o(bigDecimal, "receiver$0");
        BigDecimal add = bigDecimal.add(bigDecimal2);
        o0O0OO00.OooO00o((Object) add, "this.add(other)");
        return add;
    }

    @InlineOnly
    public static final BigDecimal OooO0o(@NotNull BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        o0O0OO00.OooO0o(bigDecimal, "receiver$0");
        BigDecimal multiply = bigDecimal.multiply(bigDecimal2);
        o0O0OO00.OooO00o((Object) multiply, "this.multiply(other)");
        return multiply;
    }

    @InlineOnly
    public static final BigDecimal OooO0o0(@NotNull BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        o0O0OO00.OooO0o(bigDecimal, "receiver$0");
        BigDecimal remainder = bigDecimal.remainder(bigDecimal2);
        o0O0OO00.OooO00o((Object) remainder, "this.remainder(other)");
        return remainder;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigDecimal OooO00o(@NotNull BigDecimal bigDecimal) {
        o0O0OO00.OooO0o(bigDecimal, "receiver$0");
        BigDecimal subtract = bigDecimal.subtract(BigDecimal.ONE);
        o0O0OO00.OooO00o((Object) subtract, "this.subtract(BigDecimal.ONE)");
        return subtract;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigDecimal OooO0O0(@NotNull BigDecimal bigDecimal) {
        o0O0OO00.OooO0o(bigDecimal, "receiver$0");
        BigDecimal add = bigDecimal.add(BigDecimal.ONE);
        o0O0OO00.OooO00o((Object) add, "this.add(BigDecimal.ONE)");
        return add;
    }

    @InlineOnly
    public static final BigDecimal OooO0OO(@NotNull BigDecimal bigDecimal) {
        o0O0OO00.OooO0o(bigDecimal, "receiver$0");
        BigDecimal negate = bigDecimal.negate();
        o0O0OO00.OooO00o((Object) negate, "this.negate()");
        return negate;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigDecimal OooO00o(int i) {
        BigDecimal valueOf = BigDecimal.valueOf((long) i);
        o0O0OO00.OooO00o((Object) valueOf, "BigDecimal.valueOf(this.toLong())");
        return valueOf;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigDecimal OooO00o(int i, MathContext mathContext) {
        return new BigDecimal(i, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigDecimal OooO00o(long j) {
        BigDecimal valueOf = BigDecimal.valueOf(j);
        o0O0OO00.OooO00o((Object) valueOf, "BigDecimal.valueOf(this)");
        return valueOf;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigDecimal OooO00o(long j, MathContext mathContext) {
        return new BigDecimal(j, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigDecimal OooO00o(float f) {
        return new BigDecimal(String.valueOf(f));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigDecimal OooO00o(float f, MathContext mathContext) {
        return new BigDecimal(String.valueOf(f), mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigDecimal OooO00o(double d) {
        return new BigDecimal(String.valueOf(d));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigDecimal OooO00o(double d, MathContext mathContext) {
        return new BigDecimal(String.valueOf(d), mathContext);
    }
}
