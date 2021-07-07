package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L11i丨丨  reason: invalid class name and case insensitive filesystem */
public class C5576L11i extends C5706LiL {
    public static final byte OooO00o = -4;
    public static final byte OooO0O0 = 15;

    public static void OooO00o(byte b, byte b2) {
        if ((b & (b2 ^ -1)) != 0) {
            throw new IllegalArgumentException("Invalid format for r portion of Poly1305 key.");
        }
    }

    public static void OooO00o(byte[] bArr) {
        if (bArr.length == 32) {
            OooO00o(bArr[3], (byte) 15);
            OooO00o(bArr[7], (byte) 15);
            OooO00o(bArr[11], (byte) 15);
            OooO00o(bArr[15], (byte) 15);
            OooO00o(bArr[4], (byte) -4);
            OooO00o(bArr[8], (byte) -4);
            OooO00o(bArr[12], (byte) -4);
            return;
        }
        throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
    }

    public static void OooO0O0(byte[] bArr) {
        if (bArr.length == 32) {
            bArr[3] = (byte) (bArr[3] & 15);
            bArr[7] = (byte) (bArr[7] & 15);
            bArr[11] = (byte) (bArr[11] & 15);
            bArr[15] = (byte) (bArr[15] & 15);
            bArr[4] = (byte) (bArr[4] & -4);
            bArr[8] = (byte) (bArr[8] & -4);
            bArr[12] = (byte) (bArr[12] & -4);
            return;
        }
        throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
    }

    @Override // com.p118pd.sdk.C5706LiL
    public void OooO00o(C6470l1i r3) {
        super.OooO00o(new C6470l1i(r3.m17607OooO00o(), 256));
    }

    @Override // com.p118pd.sdk.C5706LiL
    public byte[] OooO00o() {
        byte[] OooO00o2 = super.OooO00o();
        OooO0O0(OooO00o2);
        return OooO00o2;
    }
}
