package com.p118pd.sdk;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.OO0 */
public final class OO0 {
    public static final int OooO00o(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Random OooO00o(int i) {
        return new OO000(i, i >> 31);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Random OooO00o(long j) {
        return new OO000((int) j, (int) (j >> 32));
    }

    @SinceKotlin(version = "1.3")
    public static final int OooO00o(@NotNull Random oo, @NotNull IntRange oo000o0o) {
        o0O0OO00.OooO0o(oo, "receiver$0");
        o0O0OO00.OooO0o(oo000o0o, "range");
        if (oo000o0o.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + oo000o0o);
        } else if (oo000o0o.OooO0O0() < Integer.MAX_VALUE) {
            return oo.OooO00o(oo000o0o.OooO00o(), oo000o0o.OooO0O0() + 1);
        } else {
            if (oo000o0o.OooO00o() > Integer.MIN_VALUE) {
                return oo.OooO00o(oo000o0o.OooO00o() - 1, oo000o0o.OooO0O0()) + 1;
            }
            return oo.m16527OooO00o();
        }
    }

    @SinceKotlin(version = "1.3")
    public static final long OooO00o(@NotNull Random oo, @NotNull LongRange oo000ooo) {
        o0O0OO00.OooO0o(oo, "receiver$0");
        o0O0OO00.OooO0o(oo000ooo, "range");
        if (oo000ooo.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + oo000ooo);
        } else if (oo000ooo.OooO0O0() < Long.MAX_VALUE) {
            return oo.OooO00o(oo000ooo.OooO00o().longValue(), oo000ooo.OooO0O0().longValue() + 1);
        } else {
            if (oo000ooo.OooO00o().longValue() > Long.MIN_VALUE) {
                return oo.OooO00o(oo000ooo.OooO00o().longValue() - 1, oo000ooo.OooO0O0().longValue()) + 1;
            }
            return oo.m16528OooO00o();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final void m16536OooO00o(int i, int i2) {
        if (!(i2 > i)) {
            throw new IllegalArgumentException(OooO00o(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    public static final void OooO00o(long j, long j2) {
        if (!(j2 > j)) {
            throw new IllegalArgumentException(OooO00o(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    public static final void OooO00o(double d, double d2) {
        if (!(d2 > d)) {
            throw new IllegalArgumentException(OooO00o(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
    }

    @NotNull
    public static final String OooO00o(@NotNull Object obj, @NotNull Object obj2) {
        o0O0OO00.OooO0o(obj, "from");
        o0O0OO00.OooO0o(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }
}
