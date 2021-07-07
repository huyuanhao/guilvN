package com.p118pd.sdk;

import java.util.NoSuchElementException;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.ranges.UIntProgression;
import kotlin.ranges.ULongProgression;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oO00OO0o  reason: case insensitive filesystem */
public class C7797oO00OO0o {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    public static final int OooO00o(@NotNull UIntRange oo00o0o0) {
        return OooO00o(oo00o0o0, Random.f16961OooO00o);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    public static final long OooO00o(@NotNull ULongRange oo00oo0) {
        return OooO00o(oo00oo0, Random.f16961OooO00o);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int OooO00o(@NotNull UIntRange oo00o0o0, @NotNull Random oo) {
        o0O0OO00.OooO0o(oo00o0o0, "receiver$0");
        o0O0OO00.OooO0o(oo, "random");
        try {
            return OO00.OooO00o(oo, oo00o0o0);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final long OooO00o(@NotNull ULongRange oo00oo0, @NotNull Random oo) {
        o0O0OO00.OooO0o(oo00oo0, "receiver$0");
        o0O0OO00.OooO0o(oo, "random");
        try {
            return OO00.OooO00o(oo, oo00oo0);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    public static final boolean OooO00o(@NotNull UIntRange oo00o0o0, UInt ooooooo0) {
        o0O0OO00.OooO0o(oo00o0o0, "receiver$0");
        return ooooooo0 != null && oo00o0o0.OooO00o(ooooooo0.OooO00o());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    public static final boolean OooO00o(@NotNull ULongRange oo00oo0, ULong oooooo00) {
        o0O0OO00.OooO0o(oo00oo0, "receiver$0");
        return oooooo00 != null && oo00oo0.OooO00o(oooooo00.OooO00o());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final UIntProgression OooO00o(byte b, byte b2) {
        return UIntProgression.OooO00o.OooO00o(UInt.m20934OooO0O0(b & 255), UInt.m20934OooO0O0(b2 & 255), -1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final UIntProgression OooO00o(int i, int i2) {
        return UIntProgression.OooO00o.OooO00o(i, i2, -1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final ULongProgression m19497OooO00o(long j, long j2) {
        return ULongProgression.OooO00o.OooO00o(j, j2, -1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final UIntProgression OooO00o(short s, short s2) {
        return UIntProgression.OooO00o.OooO00o(UInt.m20934OooO0O0(s & UShort.OooO0OO), UInt.m20934OooO0O0(s2 & UShort.OooO0OO), -1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final UIntProgression OooO00o(@NotNull UIntProgression oo00o00o) {
        o0O0OO00.OooO0o(oo00o00o, "receiver$0");
        return UIntProgression.OooO00o.OooO00o(oo00o00o.OooO0O0(), oo00o00o.OooO00o(), -oo00o00o.OooO0OO());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final ULongProgression OooO00o(@NotNull ULongProgression oo00o0oo) {
        o0O0OO00.OooO0o(oo00o0oo, "receiver$0");
        return ULongProgression.OooO00o.OooO00o(oo00o0oo.OooO0O0(), oo00o0oo.OooO00o(), -oo00o0oo.OooO0OO());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final UIntProgression OooO00o(@NotNull UIntProgression oo00o00o, int i) {
        o0O0OO00.OooO0o(oo00o00o, "receiver$0");
        OO00O00.OooO00o(i > 0, Integer.valueOf(i));
        UIntProgression.OooO00o oooO00o = UIntProgression.OooO00o;
        int OooO00o = oo00o00o.OooO00o();
        int OooO0O0 = oo00o00o.OooO0O0();
        if (oo00o00o.OooO0OO() <= 0) {
            i = -i;
        }
        return oooO00o.OooO00o(OooO00o, OooO0O0, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final ULongProgression OooO00o(@NotNull ULongProgression oo00o0oo, long j) {
        o0O0OO00.OooO0o(oo00o0oo, "receiver$0");
        OO00O00.OooO00o(j > 0, Long.valueOf(j));
        ULongProgression.OooO00o oooO00o = ULongProgression.OooO00o;
        long OooO00o = oo00o0oo.OooO00o();
        long OooO0O0 = oo00o0oo.OooO0O0();
        if (oo00o0oo.OooO0OO() <= 0) {
            j = -j;
        }
        return oooO00o.OooO00o(OooO00o, OooO0O0, j);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final UIntRange m19494OooO00o(byte b, byte b2) {
        return new UIntRange(UInt.m20934OooO0O0(b & 255), UInt.m20934OooO0O0(UInt.m20934OooO0O0(b2 & 255) - 1), null);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final UIntRange m19495OooO00o(int i, int i2) {
        if (C9175oooOOooo.OooO00o(i2, 0) <= 0) {
            return UIntRange.OooO00o.OooO00o();
        }
        return new UIntRange(i, UInt.m20934OooO0O0(i2 - 1), null);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final ULongRange OooO00o(long j, long j2) {
        if (C9175oooOOooo.OooO00o(j2, 0L) <= 0) {
            return ULongRange.OooO00o.OooO00o();
        }
        return new ULongRange(j, ULong.m20943OooO00o(j2 - ULong.m20943OooO00o(((long) 1) & 4294967295L)), null);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final UIntRange m19496OooO00o(short s, short s2) {
        return new UIntRange(UInt.m20934OooO0O0(s & UShort.OooO0OO), UInt.m20934OooO0O0(UInt.m20934OooO0O0(s2 & UShort.OooO0OO) - 1), null);
    }
}
