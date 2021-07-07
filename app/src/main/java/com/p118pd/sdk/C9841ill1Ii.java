package com.p118pd.sdk;

import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3587az;

/* renamed from: com.pd.sdk.丨丨ill1Ii  reason: invalid class name and case insensitive filesystem */
public class C9841ill1Ii extends C6642li1LI {
    public static byte[] OooO0O0 = {1, 1, 1, 1, 1, 1, 1, 1, C3571am.f9204j, C3571am.f9204j, C3571am.f9204j, C3571am.f9204j, C3587az.f9268l, C3587az.f9268l, C3587az.f9268l, C3587az.f9268l, C3571am.f9205k, C3571am.f9205k, C3571am.f9205k, C3571am.f9205k, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, C3571am.f9204j, C3571am.f9205k, C3571am.f9204j, C3571am.f9205k, C3587az.f9268l, -15, C3587az.f9268l, -15, 1, C3571am.f9205k, 1, C3571am.f9205k, 1, -15, 1, -15, C3571am.f9204j, -2, C3571am.f9204j, -2, C3587az.f9268l, -2, C3587az.f9268l, -2, 1, C3571am.f9204j, 1, C3571am.f9204j, 1, C3587az.f9268l, 1, C3587az.f9268l, C3571am.f9205k, -2, C3571am.f9205k, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, C3571am.f9205k, C3571am.f9204j, C3571am.f9205k, C3571am.f9204j, -15, C3587az.f9268l, -15, C3587az.f9268l, C3571am.f9205k, 1, C3571am.f9205k, 1, -15, 1, -15, 1, -2, C3571am.f9204j, -2, C3571am.f9204j, -2, C3587az.f9268l, -2, C3587az.f9268l, C3571am.f9204j, 1, C3571am.f9204j, 1, C3587az.f9268l, 1, C3587az.f9268l, 1, -2, C3571am.f9205k, -2, C3571am.f9205k, -2, -15, -2, -15};
    public static final int o00oO0O = 8;
    public static final int o0ooOO0 = 16;

    public C9841ill1Ii(byte[] bArr) {
        super(bArr);
        if (OooO00o(bArr, 0)) {
            throw new IllegalArgumentException("attempt to create weak DES key");
        }
    }

    public static void OooO00o(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            bArr[i] = (byte) (((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1) | (b & 254));
        }
    }

    public static boolean OooO00o(byte[] bArr, int i) {
        if (bArr.length - i >= 8) {
            for (int i2 = 0; i2 < 16; i2++) {
                for (int i3 = 0; i3 < 8; i3++) {
                    if (bArr[i3 + i] != OooO0O0[(i2 * 8) + i3]) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("key material too short.");
    }
}
