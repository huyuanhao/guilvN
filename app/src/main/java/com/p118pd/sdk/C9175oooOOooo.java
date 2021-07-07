package com.p118pd.sdk;

import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@JvmName(name = "UnsignedKt")
/* renamed from: com.pd.sdk.oooOOooo  reason: case insensitive filesystem */
public final class C9175oooOOooo {
    @PublishedApi
    public static final int OooO00o(int i, int i2) {
        return o0O0OO00.OooO00o(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    public static final int OooO00o(long j, long j2) {
        return ((j ^ Long.MIN_VALUE) > (j2 ^ Long.MIN_VALUE) ? 1 : ((j ^ Long.MIN_VALUE) == (j2 ^ Long.MIN_VALUE) ? 0 : -1));
    }

    @PublishedApi
    public static final int OooO0O0(int i, int i2) {
        return UInt.m20934OooO0O0((int) ((((long) i) & 4294967295L) / (((long) i2) & 4294967295L)));
    }

    @PublishedApi
    public static final int OooO0OO(int i, int i2) {
        return UInt.m20934OooO0O0((int) ((((long) i) & 4294967295L) % (((long) i2) & 4294967295L)));
    }

    @PublishedApi
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m20977OooO00o(long j, long j2) {
        if (j2 < 0) {
            return OooO00o(j, j2) < 0 ? ULong.m20943OooO00o(0L) : ULong.m20943OooO00o(1L);
        }
        if (j >= 0) {
            return ULong.m20943OooO00o(j / j2);
        }
        int i = 1;
        long j3 = ((j >>> 1) / j2) << 1;
        if (OooO00o(ULong.m20943OooO00o(j - (j3 * j2)), ULong.m20943OooO00o(j2)) < 0) {
            i = 0;
        }
        return ULong.m20943OooO00o(j3 + ((long) i));
    }

    @PublishedApi
    public static final long OooO0O0(long j, long j2) {
        if (j2 < 0) {
            return OooO00o(j, j2) < 0 ? j : ULong.m20943OooO00o(j - j2);
        }
        if (j >= 0) {
            return ULong.m20943OooO00o(j % j2);
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (OooO00o(ULong.m20943OooO00o(j3), ULong.m20943OooO00o(j2)) < 0) {
            j2 = 0;
        }
        return ULong.m20943OooO00o(j3 - j2);
    }

    @NotNull
    public static final String OooO00o(long j) {
        return OooO00o(j, 10);
    }

    @NotNull
    public static final String OooO00o(long j, int i) {
        if (j >= 0) {
            String l = Long.toString(j, C8282oOo000oO.OooO00o(i));
            o0O0OO00.OooO00o((Object) l, "java.lang.Long.toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = (long) i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String l2 = Long.toString(j3, C8282oOo000oO.OooO00o(i));
        o0O0OO00.OooO00o((Object) l2, "java.lang.Long.toString(this, checkRadix(radix))");
        sb.append(l2);
        String l3 = Long.toString(j4, C8282oOo000oO.OooO00o(i));
        o0O0OO00.OooO00o((Object) l3, "java.lang.Long.toString(this, checkRadix(radix))");
        sb.append(l3);
        return sb.toString();
    }
}
