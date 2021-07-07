package com.p118pd.sdk;

import com.p118pd.sdk.C6108iIiL1;

/* renamed from: com.pd.sdk.LlIl  reason: case insensitive filesystem */
public class C5779LlIl {
    public static void OooO00o(II1i111L iI1i111L, byte[] bArr, int i, byte[] bArr2, C6108iIiL1.OooO00o oooO00o) {
        byte[] bArr3 = new byte[40];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr3[i2] = bArr2[i2];
        }
        AbstractC6464l1l.OooO0O0((oooO00o.OooO0O0 << 59) | ((long) oooO00o.OooO00o) | (oooO00o.f17568OooO00o << 4), bArr3, 32);
        iI1i111L.OooO0OO(bArr, i, bArr3, 40);
    }

    public static void OooO00o(byte[] bArr, int i, long j, byte[] bArr2, int i2) {
        C5512IIll1 r1 = new C5512IIll1(12);
        r1.OooO00o(true, (AbstractC6370iIIIl) new C6274iilL1L(new C6642li1LI(bArr2, i2, 32), new byte[8]));
        r1.OooO00o(bArr, i, (int) j, bArr, i);
    }
}
