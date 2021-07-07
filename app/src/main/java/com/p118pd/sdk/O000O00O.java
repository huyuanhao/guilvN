package com.p118pd.sdk;

import kotlin.PublishedApi;

/* renamed from: com.pd.sdk.O000O00O */
public final class O000O00O {
    public static final int OooO00o(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    @PublishedApi
    public static final int OooO0O0(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - OooO00o(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + OooO00o(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static final long OooO00o(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }

    public static final int OooO00o(int i, int i2, int i3) {
        return OooO00o(OooO00o(i, i3) - OooO00o(i2, i3), i3);
    }

    public static final long OooO00o(long j, long j2, long j3) {
        return OooO00o(OooO00o(j, j3) - OooO00o(j2, j3), j3);
    }

    @PublishedApi
    public static final long OooO0O0(long j, long j2, long j3) {
        if (j3 > 0) {
            if (j >= j2) {
                return j2;
            }
            return j2 - OooO00o(j2, j, j3);
        } else if (j3 < 0) {
            return j <= j2 ? j2 : j2 + OooO00o(j, j2, -j3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
