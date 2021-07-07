package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨iL丨iiLL  reason: invalid class name */
public class iLiiLL extends C11l {
    public static boolean OooO00o(byte b, int i) {
        return (b & (1 << i)) != 0;
    }

    public static byte[] OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i = 0; i != 8; i++) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 != 8; i4++) {
                int OooO0O0 = AbstractC6464l1l.OooO0O0(bArr, i4 * 4);
                if (OooO00o(bArr2[i], i4)) {
                    i2 += OooO0O0;
                } else {
                    i3 += OooO0O0;
                }
            }
            byte[] bArr4 = new byte[8];
            AbstractC6464l1l.OooO0O0(i2, bArr4, 0);
            AbstractC6464l1l.OooO0O0(i3, bArr4, 4);
            C6542lL1 ll1 = new C6542lL1(new C5539Iil());
            ll1.OooO00o(true, new C6274iilL1L(new C9374IiI(new C6642li1LI(bArr), bArr3), bArr4));
            ll1.OooO00o(bArr, 0, bArr, 0);
            ll1.OooO00o(bArr, 8, bArr, 8);
            ll1.OooO00o(bArr, 16, bArr, 16);
            ll1.OooO00o(bArr, 24, bArr, 24);
        }
        return bArr;
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI, com.p118pd.sdk.C11l
    public void OooO00o(boolean z, AbstractC6370iIIIl r7) {
        byte[] bArr;
        C6642li1LI r0;
        C6403ii r02;
        if (r7 instanceof liLL1l) {
            r7 = ((liLL1l) r7).OooO00o();
        }
        C6403ii r72 = (C6403ii) r7;
        if (r72.OooO00o() instanceof C9374IiI) {
            r0 = (C6642li1LI) ((C9374IiI) r72.OooO00o()).OooO00o();
            bArr = ((C9374IiI) r72.OooO00o()).m21446OooO00o();
        } else {
            bArr = null;
            r0 = (C6642li1LI) r72.OooO00o();
        }
        C6642li1LI r2 = new C6642li1LI(OooO00o(r0.OooO00o(), r72.m17518OooO00o(), bArr));
        if (bArr != null) {
            new C9374IiI(r2, bArr);
            r72.m17518OooO00o();
        } else {
            r02 = new C6403ii(r2, r72.m17518OooO00o());
        }
        super.OooO00o(z, r02);
    }
}
