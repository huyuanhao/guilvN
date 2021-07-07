package com.p118pd.sdk;

import java.lang.reflect.Array;

/* renamed from: com.pd.sdk.l丨LIlii  reason: invalid class name and case insensitive filesystem */
public class C6846lLIlii implements lIL1i11, AbstractC6186iLi1 {
    public static final int OooO0O0 = 32;
    public static final byte[] OooOOO0 = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    public byte[] OooO;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f18906OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f18907OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18908OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[] f18909OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[][] f18910OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18911OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public short[] f18912OooO0O0;
    public byte[] OooO0OO;
    public byte[] OooO0Oo;
    public byte[] OooO0o;
    public byte[] OooO0o0;
    public byte[] OooO0oO;
    public byte[] OooO0oo;
    public byte[] OooOO0;
    public byte[] OooOO0O;
    public byte[] OooOO0o;

    public C6846lLIlii() {
        this.f18908OooO00o = new byte[32];
        this.f18911OooO0O0 = new byte[32];
        this.OooO0OO = new byte[32];
        this.OooO0Oo = new byte[32];
        this.f18910OooO00o = (byte[][]) Array.newInstance(byte.class, 4, 32);
        this.OooO0o0 = new byte[32];
        this.f18907OooO00o = new C5539Iil();
        this.OooO0oO = new byte[32];
        this.OooO0oo = new byte[8];
        this.f18909OooO00o = new short[16];
        this.f18912OooO0O0 = new short[16];
        this.OooO = new byte[32];
        this.OooOO0 = new byte[32];
        this.OooOO0O = new byte[32];
        this.OooOO0o = new byte[32];
        byte[] OooO00o2 = C5539Iil.OooO00o("D-A");
        this.OooO0o = OooO00o2;
        this.f18907OooO00o.OooO00o(true, new C9374IiI(null, OooO00o2));
        reset();
    }

    public C6846lLIlii(C6846lLIlii r4) {
        this.f18908OooO00o = new byte[32];
        this.f18911OooO0O0 = new byte[32];
        this.OooO0OO = new byte[32];
        this.OooO0Oo = new byte[32];
        this.f18910OooO00o = (byte[][]) Array.newInstance(byte.class, 4, 32);
        this.OooO0o0 = new byte[32];
        this.f18907OooO00o = new C5539Iil();
        this.OooO0oO = new byte[32];
        this.OooO0oo = new byte[8];
        this.f18909OooO00o = new short[16];
        this.f18912OooO0O0 = new short[16];
        this.OooO = new byte[32];
        this.OooOO0 = new byte[32];
        this.OooOO0O = new byte[32];
        this.OooOO0o = new byte[32];
        OooO00o(r4);
    }

    public C6846lLIlii(byte[] bArr) {
        this.f18908OooO00o = new byte[32];
        this.f18911OooO0O0 = new byte[32];
        this.OooO0OO = new byte[32];
        this.OooO0Oo = new byte[32];
        this.f18910OooO00o = (byte[][]) Array.newInstance(byte.class, 4, 32);
        this.OooO0o0 = new byte[32];
        this.f18907OooO00o = new C5539Iil();
        this.OooO0oO = new byte[32];
        this.OooO0oo = new byte[8];
        this.f18909OooO00o = new short[16];
        this.f18912OooO0O0 = new short[16];
        this.OooO = new byte[32];
        this.OooOO0 = new byte[32];
        this.OooOO0O = new byte[32];
        this.OooOO0o = new byte[32];
        byte[] OooO00o2 = C9586iIILl.m21630OooO00o(bArr);
        this.OooO0o = OooO00o2;
        this.f18907OooO00o.OooO00o(true, new C9374IiI(null, OooO00o2));
        reset();
    }

    private void OooO00o(byte[] bArr) {
        OooO00o(bArr, this.f18909OooO00o);
        short[] sArr = this.f18912OooO0O0;
        short[] sArr2 = this.f18909OooO00o;
        sArr[15] = (short) (((((sArr2[0] ^ sArr2[1]) ^ sArr2[2]) ^ sArr2[3]) ^ sArr2[12]) ^ sArr2[15]);
        System.arraycopy(sArr2, 1, sArr, 0, 15);
        OooO00o(this.f18912OooO0O0, bArr);
    }

    private void OooO00o(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2) {
        this.f18907OooO00o.OooO00o(true, new C6642li1LI(bArr));
        this.f18907OooO00o.OooO00o(bArr3, i2, bArr2, i);
    }

    private void OooO00o(byte[] bArr, short[] sArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int i2 = i * 2;
            sArr[i] = (short) ((bArr[i2] & 255) | ((bArr[i2 + 1] << 8) & 65280));
        }
    }

    private void OooO00o(short[] sArr, byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int i2 = i * 2;
            bArr[i2 + 1] = (byte) (sArr[i] >> 8);
            bArr[i2] = (byte) sArr[i];
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private byte[] m17993OooO00o(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            this.OooO0oo[i] = (byte) (bArr[i] ^ bArr[i + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.OooO0oo, 0, bArr, 24, 8);
        return bArr;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    private void OooO0O0() {
        AbstractC6464l1l.OooO0O0(this.f18906OooO00o * 8, this.f18911OooO0O0, 0);
        while (this.OooO00o != 0) {
            update((byte) 0);
        }
        m17997OooO00o(this.f18911OooO0O0, 0);
        m17997OooO00o(this.OooO0Oo, 0);
    }

    private void OooO0O0(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.OooO0Oo;
            if (i != bArr2.length) {
                int i3 = (bArr2[i] & 255) + (bArr[i] & 255) + i2;
                bArr2[i] = (byte) i3;
                i2 = i3 >>> 8;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private byte[] m17994OooO0O0(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            byte[] bArr2 = this.OooO0oO;
            int i2 = i * 4;
            bArr2[i2] = bArr[i];
            bArr2[i2 + 1] = bArr[i + 8];
            bArr2[i2 + 2] = bArr[i + 16];
            bArr2[i2 + 3] = bArr[i + 24];
        }
        return this.OooO0oO;
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    public int OooO00o() {
        return 32;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o(byte[] bArr, int i) {
        OooO0O0();
        byte[] bArr2 = this.f18908OooO00o;
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        reset();
        return 32;
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6186iLi1 m17995OooO00o() {
        return new C6846lLIlii(this);
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17996OooO00o() {
        return "GOST3411";
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r6) {
        C6846lLIlii r62 = (C6846lLIlii) r6;
        byte[] bArr = r62.OooO0o;
        this.OooO0o = bArr;
        this.f18907OooO00o.OooO00o(true, new C9374IiI(null, bArr));
        reset();
        byte[] bArr2 = r62.f18908OooO00o;
        System.arraycopy(bArr2, 0, this.f18908OooO00o, 0, bArr2.length);
        byte[] bArr3 = r62.f18911OooO0O0;
        System.arraycopy(bArr3, 0, this.f18911OooO0O0, 0, bArr3.length);
        byte[] bArr4 = r62.OooO0OO;
        System.arraycopy(bArr4, 0, this.OooO0OO, 0, bArr4.length);
        byte[] bArr5 = r62.OooO0Oo;
        System.arraycopy(bArr5, 0, this.OooO0Oo, 0, bArr5.length);
        byte[][] bArr6 = r62.f18910OooO00o;
        System.arraycopy(bArr6[1], 0, this.f18910OooO00o[1], 0, bArr6[1].length);
        byte[][] bArr7 = r62.f18910OooO00o;
        System.arraycopy(bArr7[2], 0, this.f18910OooO00o[2], 0, bArr7[2].length);
        byte[][] bArr8 = r62.f18910OooO00o;
        System.arraycopy(bArr8[3], 0, this.f18910OooO00o[3], 0, bArr8[3].length);
        byte[] bArr9 = r62.OooO0o0;
        System.arraycopy(bArr9, 0, this.OooO0o0, 0, bArr9.length);
        this.OooO00o = r62.OooO00o;
        this.f18906OooO00o = r62.f18906OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17997OooO00o(byte[] bArr, int i) {
        System.arraycopy(bArr, i, this.OooO0OO, 0, 32);
        System.arraycopy(this.f18908OooO00o, 0, this.OooOO0, 0, 32);
        System.arraycopy(this.OooO0OO, 0, this.OooOO0O, 0, 32);
        for (int i2 = 0; i2 < 32; i2++) {
            this.OooOO0o[i2] = (byte) (this.OooOO0[i2] ^ this.OooOO0O[i2]);
        }
        OooO00o(m17994OooO0O0(this.OooOO0o), this.OooO, 0, this.f18908OooO00o, 0);
        for (int i3 = 1; i3 < 4; i3++) {
            byte[] OooO00o2 = m17993OooO00o(this.OooOO0);
            for (int i4 = 0; i4 < 32; i4++) {
                this.OooOO0[i4] = (byte) (OooO00o2[i4] ^ this.f18910OooO00o[i3][i4]);
            }
            this.OooOO0O = m17993OooO00o(m17993OooO00o(this.OooOO0O));
            for (int i5 = 0; i5 < 32; i5++) {
                this.OooOO0o[i5] = (byte) (this.OooOO0[i5] ^ this.OooOO0O[i5]);
            }
            int i6 = i3 * 8;
            OooO00o(m17994OooO0O0(this.OooOO0o), this.OooO, i6, this.f18908OooO00o, i6);
        }
        for (int i7 = 0; i7 < 12; i7++) {
            OooO00o(this.OooO);
        }
        for (int i8 = 0; i8 < 32; i8++) {
            byte[] bArr2 = this.OooO;
            bArr2[i8] = (byte) (bArr2[i8] ^ this.OooO0OO[i8]);
        }
        OooO00o(this.OooO);
        for (int i9 = 0; i9 < 32; i9++) {
            byte[] bArr3 = this.OooO;
            bArr3[i9] = (byte) (this.f18908OooO00o[i9] ^ bArr3[i9]);
        }
        for (int i10 = 0; i10 < 61; i10++) {
            OooO00o(this.OooO);
        }
        byte[] bArr4 = this.OooO;
        byte[] bArr5 = this.f18908OooO00o;
        System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m17998OooO0O0() {
        return 32;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        this.f18906OooO00o = 0;
        this.OooO00o = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f18908OooO00o;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.f18911OooO0O0;
            if (i2 >= bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.OooO0OO;
            if (i3 >= bArr3.length) {
                break;
            }
            bArr3[i3] = 0;
            i3++;
        }
        int i4 = 0;
        while (true) {
            byte[][] bArr4 = this.f18910OooO00o;
            if (i4 >= bArr4[1].length) {
                break;
            }
            bArr4[1][i4] = 0;
            i4++;
        }
        int i5 = 0;
        while (true) {
            byte[][] bArr5 = this.f18910OooO00o;
            if (i5 >= bArr5[3].length) {
                break;
            }
            bArr5[3][i5] = 0;
            i5++;
        }
        int i6 = 0;
        while (true) {
            byte[] bArr6 = this.OooO0Oo;
            if (i6 >= bArr6.length) {
                break;
            }
            bArr6[i6] = 0;
            i6++;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr7 = this.OooO0o0;
            if (i7 < bArr7.length) {
                bArr7[i7] = 0;
                i7++;
            } else {
                byte[] bArr8 = OooOOO0;
                System.arraycopy(bArr8, 0, this.f18910OooO00o[2], 0, bArr8.length);
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte b) {
        byte[] bArr = this.OooO0o0;
        int i = this.OooO00o;
        int i2 = i + 1;
        this.OooO00o = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            OooO0O0(bArr);
            m17997OooO00o(this.OooO0o0, 0);
            this.OooO00o = 0;
        }
        this.f18906OooO00o++;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte[] bArr, int i, int i2) {
        while (this.OooO00o != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.OooO0o0;
            if (i2 <= bArr2.length) {
                break;
            }
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            OooO0O0(this.OooO0o0);
            m17997OooO00o(this.OooO0o0, 0);
            byte[] bArr3 = this.OooO0o0;
            i += bArr3.length;
            i2 -= bArr3.length;
            this.f18906OooO00o += (long) bArr3.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }
}
