package com.p118pd.sdk;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooOO00O  reason: case insensitive filesystem */
public class C9152oooOO00O extends C9159oooOO0o0 {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final BigInteger m20893OooO00o(@NotNull BigInteger bigInteger) {
        o0O0OO00.OooO0o(bigInteger, "receiver$0");
        BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
        o0O0OO00.OooO00o((Object) subtract, "this.subtract(BigInteger.ONE)");
        return subtract;
    }

    @InlineOnly
    public static final BigInteger OooO0O0(@NotNull BigInteger bigInteger, BigInteger bigInteger2) {
        o0O0OO00.OooO0o(bigInteger, "receiver$0");
        BigInteger divide = bigInteger.divide(bigInteger2);
        o0O0OO00.OooO00o((Object) divide, "this.divide(other)");
        return divide;
    }

    @InlineOnly
    public static final BigInteger OooO0OO(@NotNull BigInteger bigInteger, BigInteger bigInteger2) {
        o0O0OO00.OooO0o(bigInteger, "receiver$0");
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        o0O0OO00.OooO00o((Object) subtract, "this.subtract(other)");
        return subtract;
    }

    @InlineOnly
    public static final BigInteger OooO0Oo(@NotNull BigInteger bigInteger) {
        o0O0OO00.OooO0o(bigInteger, "receiver$0");
        BigInteger negate = bigInteger.negate();
        o0O0OO00.OooO00o((Object) negate, "this.negate()");
        return negate;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final BigInteger OooO0o(@NotNull BigInteger bigInteger, BigInteger bigInteger2) {
        o0O0OO00.OooO0o(bigInteger, "receiver$0");
        BigInteger remainder = bigInteger.remainder(bigInteger2);
        o0O0OO00.OooO00o((Object) remainder, "this.remainder(other)");
        return remainder;
    }

    @InlineOnly
    public static final BigInteger OooO0o0(@NotNull BigInteger bigInteger, BigInteger bigInteger2) {
        o0O0OO00.OooO0o(bigInteger, "receiver$0");
        BigInteger add = bigInteger.add(bigInteger2);
        o0O0OO00.OooO00o((Object) add, "this.add(other)");
        return add;
    }

    @InlineOnly
    public static final BigInteger OooO0oO(@NotNull BigInteger bigInteger, BigInteger bigInteger2) {
        o0O0OO00.OooO0o(bigInteger, "receiver$0");
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        o0O0OO00.OooO00o((Object) multiply, "this.multiply(other)");
        return multiply;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigInteger OooO0oo(@NotNull BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger xor = bigInteger.xor(bigInteger2);
        o0O0OO00.OooO00o((Object) xor, "this.xor(other)");
        return xor;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigInteger OooO00o(@NotNull BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger and = bigInteger.and(bigInteger2);
        o0O0OO00.OooO00o((Object) and, "this.and(other)");
        return and;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigInteger OooO0O0(@NotNull BigInteger bigInteger) {
        o0O0OO00.OooO0o(bigInteger, "receiver$0");
        BigInteger add = bigInteger.add(BigInteger.ONE);
        o0O0OO00.OooO00o((Object) add, "this.add(BigInteger.ONE)");
        return add;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigInteger OooO0OO(@NotNull BigInteger bigInteger) {
        BigInteger not = bigInteger.not();
        o0O0OO00.OooO00o((Object) not, "this.not()");
        return not;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigInteger OooO0Oo(@NotNull BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger or = bigInteger.or(bigInteger2);
        o0O0OO00.OooO00o((Object) or, "this.or(other)");
        return or;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigInteger OooO00o(@NotNull BigInteger bigInteger, int i) {
        BigInteger shiftLeft = bigInteger.shiftLeft(i);
        o0O0OO00.OooO00o((Object) shiftLeft, "this.shiftLeft(n)");
        return shiftLeft;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigInteger OooO0O0(@NotNull BigInteger bigInteger, int i) {
        BigInteger shiftRight = bigInteger.shiftRight(i);
        o0O0OO00.OooO00o((Object) shiftRight, "this.shiftRight(n)");
        return shiftRight;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigInteger OooO00o(int i) {
        BigInteger valueOf = BigInteger.valueOf((long) i);
        o0O0OO00.OooO00o((Object) valueOf, "BigInteger.valueOf(this.toLong())");
        return valueOf;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigInteger OooO00o(long j) {
        BigInteger valueOf = BigInteger.valueOf(j);
        o0O0OO00.OooO00o((Object) valueOf, "BigInteger.valueOf(this)");
        return valueOf;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigDecimal OooO00o(@NotNull BigInteger bigInteger) {
        return new BigDecimal(bigInteger);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ BigDecimal OooO00o(BigInteger bigInteger, int i, MathContext mathContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            o0O0OO00.OooO00o((Object) mathContext, "MathContext.UNLIMITED");
        }
        return new BigDecimal(bigInteger, i, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final BigDecimal OooO00o(@NotNull BigInteger bigInteger, int i, MathContext mathContext) {
        return new BigDecimal(bigInteger, i, mathContext);
    }
}
