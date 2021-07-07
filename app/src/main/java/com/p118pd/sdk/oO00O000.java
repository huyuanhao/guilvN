package com.p118pd.sdk;

import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.ranges.CharProgression;
import kotlin.ranges.IntProgression;
import kotlin.ranges.LongProgression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.oO00O000 */
public class oO00O000 extends OO00O00 {
    public static final byte OooO00o(byte b, byte b2) {
        return b < b2 ? b2 : b;
    }

    public static final double OooO00o(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static final float OooO00o(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static final int OooO00o(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final int OooO00o(@NotNull IntRange oo000o0o) {
        return OooO00o(oo000o0o, (Random) Random.f16961OooO00o);
    }

    public static final long OooO00o(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final short m19479OooO00o(short s, short s2) {
        return s < s2 ? s2 : s;
    }

    public static final byte OooO0O0(byte b, byte b2) {
        return b > b2 ? b2 : b;
    }

    public static final double OooO0O0(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    public static final float OooO0O0(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static final int OooO0O0(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static final long OooO0O0(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static final short OooO0O0(short s, short s2) {
        return s > s2 ? s2 : s;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "floatRangeContains")
    public static final boolean OooO0O0(@NotNull ClosedRange<Float> oo0000oo, byte b) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        return oo0000oo.OooO00o(Float.valueOf((float) b));
    }

    @JvmName(name = "intRangeContains")
    public static final boolean OooO0OO(@NotNull ClosedRange<Integer> oo0000oo, byte b) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        return oo0000oo.OooO00o(Integer.valueOf(b));
    }

    @JvmName(name = "longRangeContains")
    public static final boolean OooO0Oo(@NotNull ClosedRange<Long> oo0000oo, byte b) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        return oo0000oo.OooO00o(Long.valueOf((long) b));
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean OooO0o0(@NotNull ClosedRange<Short> oo0000oo, byte b) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        return oo0000oo.OooO00o(Short.valueOf((short) b));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final long OooO00o(@NotNull LongRange oo000ooo) {
        return OooO00o(oo000ooo, (Random) Random.f16961OooO00o);
    }

    @JvmName(name = "floatRangeContains")
    public static final boolean OooO0O0(@NotNull ClosedRange<Float> oo0000oo, double d) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        return oo0000oo.OooO00o(Float.valueOf((float) d));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "intRangeContains")
    public static final boolean OooO0OO(@NotNull ClosedRange<Integer> oo0000oo, double d) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        Integer OooO00o = m19470OooO00o(d);
        if (OooO00o != null) {
            return oo0000oo.OooO00o(OooO00o);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "longRangeContains")
    public static final boolean OooO0Oo(@NotNull ClosedRange<Long> oo0000oo, double d) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        Long OooO00o = m19473OooO00o(d);
        if (OooO00o != null) {
            return oo0000oo.OooO00o(OooO00o);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "shortRangeContains")
    public static final boolean OooO0o0(@NotNull ClosedRange<Short> oo0000oo, double d) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        Short OooO00o = m19475OooO00o(d);
        if (OooO00o != null) {
            return oo0000oo.OooO00o(OooO00o);
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final char OooO00o(@NotNull CharRange oo000000) {
        return OooO00o(oo000000, (Random) Random.f16961OooO00o);
    }

    @JvmName(name = "doubleRangeContains")
    public static final boolean OooO0O0(@NotNull ClosedRange<Double> oo0000oo, float f) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        return oo0000oo.OooO00o(Double.valueOf((double) f));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "intRangeContains")
    public static final boolean OooO0OO(@NotNull ClosedRange<Integer> oo0000oo, float f) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        Integer OooO00o = m19471OooO00o(f);
        if (OooO00o != null) {
            return oo0000oo.OooO00o(OooO00o);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "longRangeContains")
    public static final boolean OooO0Oo(@NotNull ClosedRange<Long> oo0000oo, float f) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        Long OooO00o = m19474OooO00o(f);
        if (OooO00o != null) {
            return oo0000oo.OooO00o(OooO00o);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "shortRangeContains")
    public static final boolean OooO0o0(@NotNull ClosedRange<Short> oo0000oo, float f) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        Short OooO00o = m19476OooO00o(f);
        if (OooO00o != null) {
            return oo0000oo.OooO00o(OooO00o);
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    public static final int OooO00o(@NotNull IntRange oo000o0o, @NotNull Random oo) {
        o0O0OO00.OooO0o(oo000o0o, "receiver$0");
        o0O0OO00.OooO0o(oo, "random");
        try {
            return OO0.OooO00o(oo, oo000o0o);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "doubleRangeContains")
    public static final boolean OooO0O0(@NotNull ClosedRange<Double> oo0000oo, int i) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        return oo0000oo.OooO00o(Double.valueOf((double) i));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "floatRangeContains")
    public static final boolean OooO0OO(@NotNull ClosedRange<Float> oo0000oo, int i) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        return oo0000oo.OooO00o(Float.valueOf((float) i));
    }

    @JvmName(name = "longRangeContains")
    public static final boolean OooO0Oo(@NotNull ClosedRange<Long> oo0000oo, int i) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        return oo0000oo.OooO00o(Long.valueOf((long) i));
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean OooO0o0(@NotNull ClosedRange<Short> oo0000oo, int i) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        Short OooO00o = m19477OooO00o(i);
        if (OooO00o != null) {
            return oo0000oo.OooO00o(OooO00o);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "doubleRangeContains")
    public static final boolean OooO0O0(@NotNull ClosedRange<Double> oo0000oo, long j) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        return oo0000oo.OooO00o(Double.valueOf((double) j));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "floatRangeContains")
    public static final boolean OooO0OO(@NotNull ClosedRange<Float> oo0000oo, long j) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        return oo0000oo.OooO00o(Float.valueOf((float) j));
    }

    @JvmName(name = "intRangeContains")
    public static final boolean OooO0Oo(@NotNull ClosedRange<Integer> oo0000oo, long j) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        Integer OooO00o = m19472OooO00o(j);
        if (OooO00o != null) {
            return oo0000oo.OooO00o(OooO00o);
        }
        return false;
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean OooO0o0(@NotNull ClosedRange<Short> oo0000oo, long j) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        Short OooO00o = m19478OooO00o(j);
        if (OooO00o != null) {
            return oo0000oo.OooO00o(OooO00o);
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    public static final long OooO00o(@NotNull LongRange oo000ooo, @NotNull Random oo) {
        o0O0OO00.OooO0o(oo000ooo, "receiver$0");
        o0O0OO00.OooO0o(oo, "random");
        try {
            return OO0.OooO00o(oo, oo000ooo);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "doubleRangeContains")
    public static final boolean OooO0O0(@NotNull ClosedRange<Double> oo0000oo, short s) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        return oo0000oo.OooO00o(Double.valueOf((double) s));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "floatRangeContains")
    public static final boolean OooO0OO(@NotNull ClosedRange<Float> oo0000oo, short s) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        return oo0000oo.OooO00o(Float.valueOf((float) s));
    }

    @JvmName(name = "intRangeContains")
    public static final boolean OooO0Oo(@NotNull ClosedRange<Integer> oo0000oo, short s) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        return oo0000oo.OooO00o(Integer.valueOf(s));
    }

    @JvmName(name = "longRangeContains")
    public static final boolean OooO0o0(@NotNull ClosedRange<Long> oo0000oo, short s) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        return oo0000oo.OooO00o(Long.valueOf((long) s));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T OooO0O0(@NotNull T t, @NotNull T t2) {
        o0O0OO00.OooO0o(t, "receiver$0");
        o0O0OO00.OooO0o(t2, "maximumValue");
        return t.compareTo(t2) > 0 ? t2 : t;
    }

    @SinceKotlin(version = "1.3")
    public static final char OooO00o(@NotNull CharRange oo000000, @NotNull Random oo) {
        o0O0OO00.OooO0o(oo000000, "receiver$0");
        o0O0OO00.OooO0o(oo, "random");
        try {
            return (char) oo.OooO00o((int) oo000000.OooO00o(), oo000000.OooO0O0() + 1);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final boolean OooO00o(@NotNull IntRange oo000o0o, Integer num) {
        o0O0OO00.OooO0o(oo000o0o, "receiver$0");
        return num != null && oo000o0o.OooO00o(num.intValue());
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final boolean OooO00o(@NotNull LongRange oo000ooo, Long l) {
        o0O0OO00.OooO0o(oo000ooo, "receiver$0");
        return l != null && oo000ooo.OooO00o(l.longValue());
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final boolean OooO00o(@NotNull CharRange oo000000, Character ch) {
        o0O0OO00.OooO0o(oo000000, "receiver$0");
        return ch != null && oo000000.OooO00o(ch.charValue());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "doubleRangeContains")
    public static final boolean OooO00o(@NotNull ClosedRange<Double> oo0000oo, byte b) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        return oo0000oo.OooO00o(Double.valueOf((double) b));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "byteRangeContains")
    public static final boolean OooO00o(@NotNull ClosedRange<Byte> oo0000oo, double d) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        Byte OooO00o = OooO00o(d);
        if (OooO00o != null) {
            return oo0000oo.OooO00o(OooO00o);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "byteRangeContains")
    public static final boolean OooO00o(@NotNull ClosedRange<Byte> oo0000oo, float f) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        Byte OooO00o = OooO00o(f);
        if (OooO00o != null) {
            return oo0000oo.OooO00o(OooO00o);
        }
        return false;
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean OooO00o(@NotNull ClosedRange<Byte> oo0000oo, int i) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        Byte OooO00o = OooO00o(i);
        if (OooO00o != null) {
            return oo0000oo.OooO00o(OooO00o);
        }
        return false;
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean OooO00o(@NotNull ClosedRange<Byte> oo0000oo, long j) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        Byte OooO00o = OooO00o(j);
        if (OooO00o != null) {
            return oo0000oo.OooO00o(OooO00o);
        }
        return false;
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean OooO00o(@NotNull ClosedRange<Byte> oo0000oo, short s) {
        o0O0OO00.OooO0o(oo0000oo, "receiver$0");
        Byte OooO00o = OooO00o(s);
        if (OooO00o != null) {
            return oo0000oo.OooO00o(OooO00o);
        }
        return false;
    }

    @NotNull
    public static final IntProgression OooO00o(int i, byte b) {
        return IntProgression.OooO00o.OooO00o(i, b, -1);
    }

    @NotNull
    public static final LongProgression OooO00o(long j, byte b) {
        return LongProgression.OooO00o.OooO00o(j, (long) b, -1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final IntProgression m19450OooO00o(byte b, byte b2) {
        return IntProgression.OooO00o.OooO00o(b, b2, -1);
    }

    @NotNull
    public static final IntProgression OooO00o(short s, byte b) {
        return IntProgression.OooO00o.OooO00o(s, b, -1);
    }

    @NotNull
    public static final CharProgression OooO00o(char c, char c2) {
        return CharProgression.OooO00o.OooO00o(c, c2, -1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final IntProgression m19451OooO00o(int i, int i2) {
        return IntProgression.OooO00o.OooO00o(i, i2, -1);
    }

    @NotNull
    public static final LongProgression OooO00o(long j, int i) {
        return LongProgression.OooO00o.OooO00o(j, (long) i, -1);
    }

    @NotNull
    public static final IntProgression OooO00o(byte b, int i) {
        return IntProgression.OooO00o.OooO00o(b, i, -1);
    }

    @NotNull
    public static final IntProgression OooO00o(short s, int i) {
        return IntProgression.OooO00o.OooO00o(s, i, -1);
    }

    @NotNull
    public static final LongProgression OooO00o(int i, long j) {
        return LongProgression.OooO00o.OooO00o((long) i, j, -1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final LongProgression m19453OooO00o(long j, long j2) {
        return LongProgression.OooO00o.OooO00o(j, j2, -1);
    }

    @NotNull
    public static final LongProgression OooO00o(byte b, long j) {
        return LongProgression.OooO00o.OooO00o((long) b, j, -1);
    }

    @NotNull
    public static final LongProgression OooO00o(short s, long j) {
        return LongProgression.OooO00o.OooO00o((long) s, j, -1);
    }

    @NotNull
    public static final IntProgression OooO00o(int i, short s) {
        return IntProgression.OooO00o.OooO00o(i, s, -1);
    }

    @NotNull
    public static final LongProgression OooO00o(long j, short s) {
        return LongProgression.OooO00o.OooO00o(j, (long) s, -1);
    }

    @NotNull
    public static final IntProgression OooO00o(byte b, short s) {
        return IntProgression.OooO00o.OooO00o(b, s, -1);
    }

    @NotNull
    public static final IntProgression OooO00o(short s, short s2) {
        return IntProgression.OooO00o.OooO00o(s, s2, -1);
    }

    @NotNull
    public static final IntProgression OooO00o(@NotNull IntProgression oo000o0) {
        o0O0OO00.OooO0o(oo000o0, "receiver$0");
        return IntProgression.OooO00o.OooO00o(oo000o0.OooO0O0(), oo000o0.OooO00o(), -oo000o0.OooO0OO());
    }

    @NotNull
    public static final LongProgression OooO00o(@NotNull LongProgression oo000oo) {
        o0O0OO00.OooO0o(oo000oo, "receiver$0");
        return LongProgression.OooO00o.OooO00o(oo000oo.OooO0O0(), oo000oo.OooO00o(), -oo000oo.OooO0OO());
    }

    @NotNull
    public static final CharProgression OooO00o(@NotNull CharProgression oo0000) {
        o0O0OO00.OooO0o(oo0000, "receiver$0");
        return CharProgression.OooO00o.OooO00o(oo0000.OooO0O0(), oo0000.OooO00o(), -oo0000.m16624OooO00o());
    }

    @NotNull
    public static final IntProgression OooO00o(@NotNull IntProgression oo000o0, int i) {
        o0O0OO00.OooO0o(oo000o0, "receiver$0");
        OO00O00.OooO00o(i > 0, Integer.valueOf(i));
        IntProgression.OooO00o oooO00o = IntProgression.OooO00o;
        int OooO00o = oo000o0.OooO00o();
        int OooO0O0 = oo000o0.OooO0O0();
        if (oo000o0.OooO0OO() <= 0) {
            i = -i;
        }
        return oooO00o.OooO00o(OooO00o, OooO0O0, i);
    }

    @NotNull
    public static final LongProgression OooO00o(@NotNull LongProgression oo000oo, long j) {
        o0O0OO00.OooO0o(oo000oo, "receiver$0");
        OO00O00.OooO00o(j > 0, Long.valueOf(j));
        LongProgression.OooO00o oooO00o = LongProgression.OooO00o;
        long OooO00o = oo000oo.OooO00o();
        long OooO0O0 = oo000oo.OooO0O0();
        if (oo000oo.OooO0OO() <= 0) {
            j = -j;
        }
        return oooO00o.OooO00o(OooO00o, OooO0O0, j);
    }

    @NotNull
    public static final CharProgression OooO00o(@NotNull CharProgression oo0000, int i) {
        o0O0OO00.OooO0o(oo0000, "receiver$0");
        OO00O00.OooO00o(i > 0, Integer.valueOf(i));
        CharProgression.OooO00o oooO00o = CharProgression.OooO00o;
        char OooO00o = oo0000.OooO00o();
        char OooO0O0 = oo0000.OooO0O0();
        if (oo0000.m16624OooO00o() <= 0) {
            i = -i;
        }
        return oooO00o.OooO00o(OooO00o, OooO0O0, i);
    }

    @Nullable
    public static final Byte OooO00o(int i) {
        if (-128 <= i && 127 >= i) {
            return Byte.valueOf((byte) i);
        }
        return null;
    }

    @Nullable
    public static final Byte OooO00o(long j) {
        long j2 = (long) 127;
        if (((long) C7490o0OoOO0o.OooO0oO) <= j && j2 >= j) {
            return Byte.valueOf((byte) ((int) j));
        }
        return null;
    }

    @Nullable
    public static final Byte OooO00o(short s) {
        short s2 = (short) 127;
        if (((short) C7490o0OoOO0o.OooO0oO) <= s && s2 >= s) {
            return Byte.valueOf((byte) s);
        }
        return null;
    }

    @Nullable
    public static final Byte OooO00o(double d) {
        double d2 = (double) 127;
        if (d < ((double) C7490o0OoOO0o.OooO0oO) || d > d2) {
            return null;
        }
        return Byte.valueOf((byte) ((int) d));
    }

    @Nullable
    public static final Byte OooO00o(float f) {
        float f2 = (float) 127;
        if (f < ((float) C7490o0OoOO0o.OooO0oO) || f > f2) {
            return null;
        }
        return Byte.valueOf((byte) ((int) f));
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Integer m19472OooO00o(long j) {
        long j2 = (long) Integer.MAX_VALUE;
        if (((long) Integer.MIN_VALUE) <= j && j2 >= j) {
            return Integer.valueOf((int) j);
        }
        return null;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Integer m19470OooO00o(double d) {
        double d2 = (double) Integer.MAX_VALUE;
        if (d < ((double) Integer.MIN_VALUE) || d > d2) {
            return null;
        }
        return Integer.valueOf((int) d);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Integer m19471OooO00o(float f) {
        float f2 = (float) Integer.MAX_VALUE;
        if (f < ((float) Integer.MIN_VALUE) || f > f2) {
            return null;
        }
        return Integer.valueOf((int) f);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Long m19473OooO00o(double d) {
        double d2 = (double) Long.MAX_VALUE;
        if (d < ((double) Long.MIN_VALUE) || d > d2) {
            return null;
        }
        return Long.valueOf((long) d);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Long m19474OooO00o(float f) {
        float f2 = (float) Long.MAX_VALUE;
        if (f < ((float) Long.MIN_VALUE) || f > f2) {
            return null;
        }
        return Long.valueOf((long) f);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Short m19477OooO00o(int i) {
        if (-32768 <= i && 32767 >= i) {
            return Short.valueOf((short) i);
        }
        return null;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Short m19478OooO00o(long j) {
        long j2 = (long) 32767;
        if (((long) -32768) <= j && j2 >= j) {
            return Short.valueOf((short) ((int) j));
        }
        return null;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Short m19475OooO00o(double d) {
        double d2 = (double) 32767;
        if (d < ((double) -32768) || d > d2) {
            return null;
        }
        return Short.valueOf((short) ((int) d));
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Short m19476OooO00o(float f) {
        float f2 = (float) 32767;
        if (f < ((float) -32768) || f > f2) {
            return null;
        }
        return Short.valueOf((short) ((int) f));
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final IntRange m19457OooO00o(int i, byte b) {
        return new IntRange(i, b - 1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final LongRange m19465OooO00o(long j, byte b) {
        return new LongRange(j, ((long) b) - 1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final IntRange m19454OooO00o(byte b, byte b2) {
        return new IntRange(b, b2 - 1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final IntRange m19460OooO00o(short s, byte b) {
        return new IntRange(s, b - 1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final CharRange m19452OooO00o(char c, char c2) {
        if (c2 <= 0) {
            return CharRange.OooO00o.OooO00o();
        }
        return new CharRange(c, (char) (c2 - 1));
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final IntRange m19458OooO00o(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return IntRange.OooO00o.OooO00o();
        }
        return new IntRange(i, i2 - 1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final LongRange m19466OooO00o(long j, int i) {
        return new LongRange(j, ((long) i) - 1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final IntRange m19455OooO00o(byte b, int i) {
        if (i <= Integer.MIN_VALUE) {
            return IntRange.OooO00o.OooO00o();
        }
        return new IntRange(b, i - 1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final IntRange m19461OooO00o(short s, int i) {
        if (i <= Integer.MIN_VALUE) {
            return IntRange.OooO00o.OooO00o();
        }
        return new IntRange(s, i - 1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final LongRange m19464OooO00o(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.OooO00o.OooO00o();
        }
        return new LongRange((long) i, j - 1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final LongRange m19467OooO00o(long j, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return LongRange.OooO00o.OooO00o();
        }
        return new LongRange(j, j2 - 1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final LongRange m19463OooO00o(byte b, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.OooO00o.OooO00o();
        }
        return new LongRange((long) b, j - 1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final LongRange m19469OooO00o(short s, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.OooO00o.OooO00o();
        }
        return new LongRange((long) s, j - 1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final IntRange m19459OooO00o(int i, short s) {
        return new IntRange(i, s - 1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final LongRange m19468OooO00o(long j, short s) {
        return new LongRange(j, ((long) s) - 1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final IntRange m19456OooO00o(byte b, short s) {
        return new IntRange(b, s - 1);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final IntRange m19462OooO00o(short s, short s2) {
        return new IntRange(s, s2 - 1);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T OooO00o(@NotNull T t, @NotNull T t2) {
        o0O0OO00.OooO0o(t, "receiver$0");
        o0O0OO00.OooO0o(t2, "minimumValue");
        return t.compareTo(t2) < 0 ? t2 : t;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T OooO00o(@NotNull T t, @Nullable T t2, @Nullable T t3) {
        o0O0OO00.OooO0o(t, "receiver$0");
        if (t2 == null || t3 == null) {
            if (t2 == null || t.compareTo(t2) >= 0) {
                return (t3 == null || t.compareTo(t3) <= 0) ? t : t3;
            }
            return t2;
        } else if (t2.compareTo(t3) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t3 + " is less than minimum " + t2 + '.');
        } else if (t.compareTo(t2) < 0) {
            return t2;
        } else {
            if (t.compareTo(t3) > 0) {
                return t3;
            }
        }
    }

    public static final byte OooO00o(byte b, byte b2, byte b3) {
        if (b2 > b3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b3) + " is less than minimum " + ((int) b2) + '.');
        } else if (b < b2) {
            return b2;
        } else {
            return b > b3 ? b3 : b;
        }
    }

    public static final short OooO00o(short s, short s2, short s3) {
        if (s2 > s3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s3) + " is less than minimum " + ((int) s2) + '.');
        } else if (s < s2) {
            return s2;
        } else {
            return s > s3 ? s3 : s;
        }
    }

    public static final int OooO00o(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
        } else if (i < i2) {
            return i2;
        } else {
            return i > i3 ? i3 : i;
        }
    }

    public static final long OooO00o(long j, long j2, long j3) {
        if (j2 > j3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
        } else if (j < j2) {
            return j2;
        } else {
            return j > j3 ? j3 : j;
        }
    }

    public static final float OooO00o(float f, float f2, float f3) {
        if (f2 > f3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
        } else if (f < f2) {
            return f2;
        } else {
            return f > f3 ? f3 : f;
        }
    }

    public static final double OooO00o(double d, double d2, double d3) {
        if (d2 > d3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
        } else if (d < d2) {
            return d2;
        } else {
            return d > d3 ? d3 : d;
        }
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T OooO00o(@NotNull T t, @NotNull ClosedFloatingPointRange<T> oo0000o0) {
        o0O0OO00.OooO0o(t, "receiver$0");
        o0O0OO00.OooO0o(oo0000o0, "range");
        if (oo0000o0.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + oo0000o0 + '.');
        } else if (!oo0000o0.OooO00o(t, oo0000o0.OooO00o()) || oo0000o0.OooO00o(oo0000o0.OooO00o(), t)) {
            return (!oo0000o0.OooO00o(oo0000o0.OooO0O0(), t) || oo0000o0.OooO00o(t, oo0000o0.OooO0O0())) ? t : oo0000o0.OooO0O0();
        } else {
            return oo0000o0.OooO00o();
        }
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T OooO00o(@NotNull T t, @NotNull ClosedRange<T> oo0000oo) {
        o0O0OO00.OooO0o(t, "receiver$0");
        o0O0OO00.OooO0o(oo0000oo, "range");
        if (oo0000oo instanceof ClosedFloatingPointRange) {
            return (T) OooO00o((Comparable) t, (ClosedFloatingPointRange) oo0000oo);
        }
        if (oo0000oo.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + oo0000oo + '.');
        } else if (t.compareTo(oo0000oo.OooO00o()) < 0) {
            return oo0000oo.OooO00o();
        } else {
            return t.compareTo(oo0000oo.OooO0O0()) > 0 ? oo0000oo.OooO0O0() : t;
        }
    }

    public static final int OooO00o(int i, @NotNull ClosedRange<Integer> oo0000oo) {
        o0O0OO00.OooO0o(oo0000oo, "range");
        if (oo0000oo instanceof ClosedFloatingPointRange) {
            return ((Number) OooO00o((Comparable) Integer.valueOf(i), (ClosedFloatingPointRange) oo0000oo)).intValue();
        }
        if (oo0000oo.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + oo0000oo + '.');
        } else if (i < oo0000oo.OooO00o().intValue()) {
            return oo0000oo.OooO00o().intValue();
        } else {
            return i > oo0000oo.OooO0O0().intValue() ? oo0000oo.OooO0O0().intValue() : i;
        }
    }

    public static final long OooO00o(long j, @NotNull ClosedRange<Long> oo0000oo) {
        o0O0OO00.OooO0o(oo0000oo, "range");
        if (oo0000oo instanceof ClosedFloatingPointRange) {
            return ((Number) OooO00o((Comparable) Long.valueOf(j), (ClosedFloatingPointRange) oo0000oo)).longValue();
        }
        if (oo0000oo.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + oo0000oo + '.');
        } else if (j < oo0000oo.OooO00o().longValue()) {
            return oo0000oo.OooO00o().longValue();
        } else {
            return j > oo0000oo.OooO0O0().longValue() ? oo0000oo.OooO0O0().longValue() : j;
        }
    }
}
