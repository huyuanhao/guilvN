package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I丨ii丨L1l  reason: invalid class name and case insensitive filesystem */
public class C5538IiiL1l extends C9841ill1Ii {
    public static final int o0ooOOo = 24;

    public C5538IiiL1l(byte[] bArr) {
        super(bArr);
        if (OooO00o(bArr, 0, bArr.length)) {
            throw new IllegalArgumentException("attempt to create weak DESede key");
        }
    }

    public static boolean OooO00o(byte[] bArr, int i) {
        return OooO00o(bArr, i, bArr.length - i);
    }

    public static boolean OooO00o(byte[] bArr, int i, int i2) {
        while (i < i2) {
            if (C9841ill1Ii.OooO00o(bArr, i)) {
                return true;
            }
            i += 8;
        }
        return false;
    }

    public static boolean OooO0O0(byte[] bArr, int i) {
        boolean z = false;
        for (int i2 = i; i2 != i + 8; i2++) {
            if (bArr[i2] != bArr[i2 + 8]) {
                z = true;
            }
        }
        return z;
    }

    public static boolean OooO0OO(byte[] bArr, int i) {
        int i2 = i;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            boolean z4 = true;
            if (i2 == i + 8) {
                break;
            }
            int i3 = i2 + 8;
            z |= bArr[i2] != bArr[i3];
            int i4 = i2 + 16;
            z2 |= bArr[i2] != bArr[i4];
            if (bArr[i3] == bArr[i4]) {
                z4 = false;
            }
            z3 |= z4;
            i2++;
        }
        return z && z2 && z3;
    }

    public static boolean OooO0Oo(byte[] bArr, int i) {
        return bArr.length == 16 ? OooO0O0(bArr, i) : OooO0OO(bArr, i);
    }
}
