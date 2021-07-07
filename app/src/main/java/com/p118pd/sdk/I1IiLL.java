package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I丨1IiLL  reason: invalid class name */
public class I1IiLL extends C6203iLIl1 {
    public static final int OooO0O0 = 20;

    @Override // com.p118pd.sdk.C5706LiL, com.p118pd.sdk.C6203iLIl1
    public void OooO00o(C6470l1i r4) {
        ((C5706LiL) this).f16598OooO00o = r4.m17607OooO00o();
        int OooO00o = (r4.OooO00o() + 7) / 8;
        ((C5706LiL) this).OooO00o = OooO00o;
        if (OooO00o == 0 || OooO00o == 21) {
            ((C5706LiL) this).OooO00o = 24;
        } else if (OooO00o == 14) {
            ((C5706LiL) this).OooO00o = 16;
        } else if (OooO00o != 24 && OooO00o != 16) {
            throw new IllegalArgumentException("DESede key must be 192 or 128 bits long.");
        }
    }

    @Override // com.p118pd.sdk.C5706LiL, com.p118pd.sdk.C6203iLIl1
    public byte[] OooO00o() {
        int i = ((C5706LiL) this).OooO00o;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            ((C5706LiL) this).f16598OooO00o.nextBytes(bArr);
            C9841ill1Ii.OooO00o(bArr);
            i2++;
            if (i2 >= 20 || (!C5538IiiL1l.OooO00o(bArr, 0, i) && C5538IiiL1l.OooO0Oo(bArr, 0))) {
            }
        }
        if (!C5538IiiL1l.OooO00o(bArr, 0, i) && C5538IiiL1l.OooO0Oo(bArr, 0)) {
            return bArr;
        }
        throw new IllegalStateException("Unable to generate DES-EDE key");
    }
}
