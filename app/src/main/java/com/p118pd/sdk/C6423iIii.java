package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨丨Iii丨丨  reason: invalid class name and case insensitive filesystem */
public class C6423iIii extends C5524IL1I1L implements AbstractC6534lIL1 {
    public C6423iIii() {
        this(128);
    }

    public C6423iIii(int i) {
        super(OooO00o(i));
    }

    public C6423iIii(C6423iIii r1) {
        super(r1);
    }

    public static int OooO00o(int i) {
        if (i == 128 || i == 256) {
            return i;
        }
        throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHAKE");
    }

    @Override // com.p118pd.sdk.C5524IL1I1L, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o(byte[] bArr, int i) {
        return OooO0O0(bArr, i, m15797OooO0O0());
    }

    @Override // com.p118pd.sdk.C5524IL1I1L
    public int OooO00o(byte[] bArr, int i, byte b, int i2) {
        return OooO00o(bArr, i, m15797OooO0O0(), b, i2);
    }

    @Override // com.p118pd.sdk.C5524IL1I1L, com.p118pd.sdk.AbstractC6534lIL1
    public int OooO00o(byte[] bArr, int i, int i2) {
        if (!((C5524IL1I1L) this).f16033OooO00o) {
            OooO00o(15, 4);
        }
        OooO00o(bArr, i, ((long) i2) * 8);
        return i2;
    }

    public int OooO00o(byte[] bArr, int i, int i2, byte b, int i3) {
        if (i3 < 0 || i3 > 7) {
            throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i4 = (b & ((1 << i3) - 1)) | (15 << i3);
        int i5 = i3 + 4;
        if (i5 >= 8) {
            OooO00o(new byte[]{(byte) i4}, 0, 1);
            i5 -= 8;
            i4 >>>= 8;
        }
        if (i5 > 0) {
            OooO00o(i4, i5);
        }
        OooO00o(bArr, i, ((long) i2) * 8);
        reset();
        return i2;
    }

    @Override // com.p118pd.sdk.C5524IL1I1L, com.p118pd.sdk.C5524IL1I1L, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI
    public String OooO00o() {
        return "SHAKE" + this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC6534lIL1
    public int OooO0O0(byte[] bArr, int i, int i2) {
        int OooO00o = OooO00o(bArr, i, i2);
        reset();
        return OooO00o;
    }
}
