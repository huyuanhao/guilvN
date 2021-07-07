package com.p118pd.sdk;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.OO00 */
public final class OO00 {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int OooO00o(@NotNull Random oo) {
        o0O0OO00.OooO0o(oo, "receiver$0");
        return UInt.m20934OooO0O0(oo.m16527OooO00o());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int OooO00o(@NotNull Random oo, int i) {
        o0O0OO00.OooO0o(oo, "receiver$0");
        return OooO00o(oo, 0, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int OooO00o(@NotNull Random oo, int i, int i2) {
        o0O0OO00.OooO0o(oo, "receiver$0");
        OooO00o(i, i2);
        return UInt.m20934OooO0O0(oo.OooO00o(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int OooO00o(@NotNull Random oo, @NotNull UIntRange oo00o0o0) {
        o0O0OO00.OooO0o(oo, "receiver$0");
        o0O0OO00.OooO0o(oo00o0o0, "range");
        if (oo00o0o0.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + oo00o0o0);
        } else if (C9175oooOOooo.OooO00o(oo00o0o0.OooO0O0(), -1) < 0) {
            return OooO00o(oo, oo00o0o0.OooO00o(), UInt.m20934OooO0O0(oo00o0o0.OooO0O0() + 1));
        } else {
            if (C9175oooOOooo.OooO00o(oo00o0o0.OooO00o(), 0) > 0) {
                return UInt.m20934OooO0O0(OooO00o(oo, UInt.m20934OooO0O0(oo00o0o0.OooO00o() - 1), oo00o0o0.OooO0O0()) + 1);
            }
            return OooO00o(oo);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m16537OooO00o(@NotNull Random oo) {
        o0O0OO00.OooO0o(oo, "receiver$0");
        return ULong.m20943OooO00o(oo.m16528OooO00o());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final long OooO00o(@NotNull Random oo, long j) {
        o0O0OO00.OooO0o(oo, "receiver$0");
        return OooO00o(oo, 0, j);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final long OooO00o(@NotNull Random oo, long j, long j2) {
        o0O0OO00.OooO0o(oo, "receiver$0");
        OooO00o(j, j2);
        return ULong.m20943OooO00o(oo.OooO00o(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final long OooO00o(@NotNull Random oo, @NotNull ULongRange oo00oo0) {
        o0O0OO00.OooO0o(oo, "receiver$0");
        o0O0OO00.OooO0o(oo00oo0, "range");
        if (oo00oo0.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + oo00oo0);
        } else if (C9175oooOOooo.OooO00o(oo00oo0.OooO0O0(), -1L) < 0) {
            return OooO00o(oo, oo00oo0.OooO00o(), ULong.m20943OooO00o(oo00oo0.OooO0O0() + ULong.m20943OooO00o(4294967295L & ((long) 1))));
        } else {
            if (C9175oooOOooo.OooO00o(oo00oo0.OooO00o(), 0L) <= 0) {
                return m16537OooO00o(oo);
            }
            long j = 4294967295L & ((long) 1);
            return ULong.m20943OooO00o(OooO00o(oo, ULong.m20943OooO00o(oo00oo0.OooO00o() - ULong.m20943OooO00o(j)), oo00oo0.OooO0O0()) + ULong.m20943OooO00o(j));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] OooO00o(@NotNull Random oo, @NotNull byte[] bArr) {
        o0O0OO00.OooO0o(oo, "receiver$0");
        o0O0OO00.OooO0o(bArr, "array");
        oo.OooO00o(bArr);
        return bArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final byte[] m16538OooO00o(@NotNull Random oo, int i) {
        o0O0OO00.OooO0o(oo, "receiver$0");
        return UByteArray.m20918OooO00o(oo.m16530OooO00o(i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static /* synthetic */ byte[] OooO00o(Random oo, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.OooO00o(bArr);
        }
        return OooO00o(oo, bArr, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] OooO00o(@NotNull Random oo, @NotNull byte[] bArr, int i, int i2) {
        o0O0OO00.OooO0o(oo, "receiver$0");
        o0O0OO00.OooO0o(bArr, "array");
        oo.OooO00o(bArr, i, i2);
        return bArr;
    }

    @ExperimentalUnsignedTypes
    public static final void OooO00o(int i, int i2) {
        if (!(C9175oooOOooo.OooO00o(i2, i) > 0)) {
            throw new IllegalArgumentException(OO0.OooO00o(UInt.OooO00o(i), UInt.OooO00o(i2)).toString());
        }
    }

    @ExperimentalUnsignedTypes
    public static final void OooO00o(long j, long j2) {
        if (!(C9175oooOOooo.OooO00o(j2, j) > 0)) {
            throw new IllegalArgumentException(OO0.OooO00o(ULong.OooO00o(j), ULong.OooO00o(j2)).toString());
        }
    }
}
