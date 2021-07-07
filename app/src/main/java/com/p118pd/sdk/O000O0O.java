package com.p118pd.sdk;

import kotlin.PublishedApi;
import kotlin.SinceKotlin;

/* renamed from: com.pd.sdk.O000O0O */
public final class O000O0O {
    public static final int OooO00o(int i, int i2, int i3) {
        int OooO0OO = C9175oooOOooo.OooO0OO(i, i3);
        int OooO0OO2 = C9175oooOOooo.OooO0OO(i2, i3);
        int OooO00o = C9175oooOOooo.OooO00o(OooO0OO, OooO0OO2);
        int OooO0O0 = UInt.m20934OooO0O0(OooO0OO - OooO0OO2);
        return OooO00o >= 0 ? OooO0O0 : UInt.m20934OooO0O0(OooO0O0 + i3);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final int OooO0O0(int i, int i2, int i3) {
        if (i3 > 0) {
            if (C9175oooOOooo.OooO00o(i, i2) >= 0) {
                return i2;
            }
            return UInt.m20934OooO0O0(i2 - OooO00o(i2, i, UInt.m20934OooO0O0(i3)));
        } else if (i3 < 0) {
            return C9175oooOOooo.OooO00o(i, i2) <= 0 ? i2 : UInt.m20934OooO0O0(i2 + OooO00o(i, i2, UInt.m20934OooO0O0(-i3)));
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static final long OooO00o(long j, long j2, long j3) {
        long OooO0O0 = C9175oooOOooo.OooO0O0(j, j3);
        long OooO0O02 = C9175oooOOooo.OooO0O0(j2, j3);
        int OooO00o = C9175oooOOooo.OooO00o(OooO0O0, OooO0O02);
        long OooO00o2 = ULong.m20943OooO00o(OooO0O0 - OooO0O02);
        return OooO00o >= 0 ? OooO00o2 : ULong.m20943OooO00o(OooO00o2 + j3);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final long OooO0O0(long j, long j2, long j3) {
        if (j3 > 0) {
            if (C9175oooOOooo.OooO00o(j, j2) >= 0) {
                return j2;
            }
            return ULong.m20943OooO00o(j2 - OooO00o(j2, j, ULong.m20943OooO00o(j3)));
        } else if (j3 < 0) {
            return C9175oooOOooo.OooO00o(j, j2) <= 0 ? j2 : ULong.m20943OooO00o(j2 + OooO00o(j, j2, ULong.m20943OooO00o(-j3)));
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
