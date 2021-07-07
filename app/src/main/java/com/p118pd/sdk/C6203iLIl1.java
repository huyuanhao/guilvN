package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iL丨Il1  reason: invalid class name and case insensitive filesystem */
public class C6203iLIl1 extends C5706LiL {
    @Override // com.p118pd.sdk.C5706LiL
    public void OooO00o(C6470l1i r3) {
        super.OooO00o(r3);
        int i = ((C5706LiL) this).OooO00o;
        if (i == 0 || i == 7) {
            ((C5706LiL) this).OooO00o = 8;
        } else if (i != 8) {
            throw new IllegalArgumentException("DES key must be 64 bits long.");
        }
    }

    @Override // com.p118pd.sdk.C5706LiL
    public byte[] OooO00o() {
        byte[] bArr = new byte[8];
        do {
            ((C5706LiL) this).f16598OooO00o.nextBytes(bArr);
            C9841ill1Ii.OooO00o(bArr);
        } while (C9841ill1Ii.OooO00o(bArr, 0));
        return bArr;
    }
}
