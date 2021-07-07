package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iiL  reason: case insensitive filesystem */
public class C6237iiL {
    public AbstractC6436l11LI OooO00o;

    public C6237iiL(AbstractC6436l11LI r1) {
        this.OooO00o = r1;
    }

    private void OooO00o(byte[] bArr) {
        byte b = 1;
        for (int i = 0; i < bArr.length; i++) {
            int i2 = (bArr[i] & 255) + b;
            bArr[i] = (byte) i2;
            b = (byte) (i2 >> 8);
        }
    }

    private void OooO00o(byte[] bArr, byte[] bArr2) {
        byte b = 0;
        for (int i = 0; i < bArr.length; i++) {
            int i2 = (bArr[i] & 255) + (bArr2[i] & 255) + b;
            bArr[i] = (byte) i2;
            b = (byte) (i2 >> 8);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17248OooO00o(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        this.OooO00o.update(bArr, 0, bArr.length);
        byte[] bArr3 = new byte[this.OooO00o.OooO0O0()];
        this.OooO00o.OooO00o(bArr3, 0);
        OooO00o(bArr, bArr3);
        OooO00o(bArr);
        return bArr3;
    }
}
