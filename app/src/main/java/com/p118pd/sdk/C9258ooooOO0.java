package com.p118pd.sdk;

import com.qiyukf.unicorn.mediaselect.internal.p241d.C2756c;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.ooooOO0  reason: case insensitive filesystem */
public class C9258ooooOO0 extends C9250ooooO0oO {
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T OooO00o(@NotNull T t, @NotNull T t2) {
        o0O0OO00.OooO0o(t, "a");
        o0O0OO00.OooO0o(t2, "b");
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T OooO0O0(@NotNull T t, @NotNull T t2) {
        o0O0OO00.OooO0o(t, "a");
        o0O0OO00.OooO0o(t2, "b");
        return t.compareTo(t2) <= 0 ? t : t2;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final byte OooO00o(byte b, byte b2) {
        return (byte) Math.max((int) b, (int) b2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final byte OooO0O0(byte b, byte b2) {
        return (byte) Math.min((int) b, (int) b2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final short OooO00o(short s, short s2) {
        return (short) Math.max((int) s, (int) s2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final short OooO0O0(short s, short s2) {
        return (short) Math.min((int) s, (int) s2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final int OooO00o(int i, int i2) {
        return Math.max(i, i2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final int OooO0O0(int i, int i2) {
        return Math.min(i, i2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final long OooO00o(long j, long j2) {
        return Math.max(j, j2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final long OooO0O0(long j, long j2) {
        return Math.min(j, j2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final float OooO00o(float f, float f2) {
        return Math.max(f, f2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final float OooO0O0(float f, float f2) {
        return Math.min(f, f2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final double OooO00o(double d, double d2) {
        return Math.max(d, d2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final double OooO0O0(double d, double d2) {
        return Math.min(d, d2);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T OooO00o(@NotNull T t, @NotNull T t2, @NotNull T t3) {
        o0O0OO00.OooO0o(t, "a");
        o0O0OO00.OooO0o(t2, "b");
        o0O0OO00.OooO0o(t3, C2756c.f5722a);
        return (T) OooO00o((Comparable) t, OooO00o((Comparable) t2, (Comparable) t3));
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T OooO0O0(@NotNull T t, @NotNull T t2, @NotNull T t3) {
        o0O0OO00.OooO0o(t, "a");
        o0O0OO00.OooO0o(t2, "b");
        o0O0OO00.OooO0o(t3, C2756c.f5722a);
        return (T) OooO0O0(t, OooO0O0(t2, t3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final byte OooO00o(byte b, byte b2, byte b3) {
        return (byte) Math.max((int) b, Math.max((int) b2, (int) b3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final byte OooO0O0(byte b, byte b2, byte b3) {
        return (byte) Math.min((int) b, Math.min((int) b2, (int) b3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final short OooO00o(short s, short s2, short s3) {
        return (short) Math.max((int) s, Math.max((int) s2, (int) s3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final short OooO0O0(short s, short s2, short s3) {
        return (short) Math.min((int) s, Math.min((int) s2, (int) s3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final int OooO00o(int i, int i2, int i3) {
        return Math.max(i, Math.max(i2, i3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final int OooO0O0(int i, int i2, int i3) {
        return Math.min(i, Math.min(i2, i3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final long OooO00o(long j, long j2, long j3) {
        return Math.max(j, Math.max(j2, j3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final long OooO0O0(long j, long j2, long j3) {
        return Math.min(j, Math.min(j2, j3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final float OooO00o(float f, float f2, float f3) {
        return Math.max(f, Math.max(f2, f3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final float OooO0O0(float f, float f2, float f3) {
        return Math.min(f, Math.min(f2, f3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final double OooO00o(double d, double d2, double d3) {
        return Math.max(d, Math.max(d2, d3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final double OooO0O0(double d, double d2, double d3) {
        return Math.min(d, Math.min(d2, d3));
    }
}
