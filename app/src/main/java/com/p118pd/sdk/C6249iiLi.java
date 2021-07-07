package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iiLi  reason: case insensitive filesystem */
public class C6249iiLi extends C5524IL1I1L {
    public C6249iiLi() {
        this(256);
    }

    public C6249iiLi(int i) {
        super(OooO00o(i));
    }

    public C6249iiLi(C6249iiLi iili) {
        super(iili);
    }

    public static int OooO00o(int i) {
        if (i == 224 || i == 256 || i == 384 || i == 512) {
            return i;
        }
        throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHA-3");
    }

    @Override // com.p118pd.sdk.C5524IL1I1L, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o(byte[] bArr, int i) {
        OooO00o(2, 2);
        return super.m15795OooO00o(bArr, i);
    }

    @Override // com.p118pd.sdk.C5524IL1I1L
    public int OooO00o(byte[] bArr, int i, byte b, int i2) {
        if (i2 < 0 || i2 > 7) {
            throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i3 = (b & ((1 << i2) - 1)) | (2 << i2);
        int i4 = i2 + 2;
        if (i4 >= 8) {
            OooO00o(new byte[]{(byte) i3}, 0, 1);
            i4 -= 8;
            i3 >>>= 8;
        }
        return super.OooO00o(bArr, i, (byte) i3, i4);
    }

    @Override // com.p118pd.sdk.C5524IL1I1L, com.p118pd.sdk.C5524IL1I1L, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI
    public String OooO00o() {
        return "SHA3-" + this.OooO0OO;
    }
}
