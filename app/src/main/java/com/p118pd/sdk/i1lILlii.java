package com.p118pd.sdk;

import com.facebook.imageutils.JfifUtil;
import com.tencent.bugly.beta.tinker.TinkerReport;

/* renamed from: com.pd.sdk.i1lILlii */
public final class i1lILlii implements lIL1i11, AbstractC6186iLi1 {
    public static final long[] OooO = new long[256];
    public static final int[] OooO00o = {24, 35, 198, 232, 135, 184, 1, 79, 54, 166, 210, 245, 121, 111, 145, 82, 96, 188, 155, 142, 163, 12, TinkerReport.KEY_APPLIED_DEXOPT_FORMAT, 53, 29, C7967oO0oOo00.Ooooo0o, JfifUtil.MARKER_RST7, Lillilli.OoooooO, 46, 75, 254, 87, 21, 119, 55, 229, 159, 240, 74, 218, 88, 201, 41, 10, 177, 160, 107, 133, 189, 93, 16, 244, 203, 62, 5, 103, 228, 39, 65, 139, 167, C7531o0Oooo0o.OooO0O0, 149, JfifUtil.MARKER_SOI, TinkerReport.KEY_LOADED_UNCAUGHT_EXCEPTION, 238, 124, 102, 221, 23, 71, 158, 202, 45, Lillilli.OooooOo, 7, 173, 90, 131, 51, 99, 2, 170, 113, 200, 25, 73, 217, 242, 227, 91, 136, 154, 38, 50, 176, 233, 15, 213, 128, Lillilli.OooooOO, TinkerReport.KEY_APPLIED_FAIL_COST_5S_LESS, 52, 72, 255, TinkerReport.KEY_APPLIED_DEXOPT_EXIST, 144, 95, 32, 104, 26, 174, 180, 84, 147, 34, 100, 241, 115, 18, 64, 8, Lillilli.Ooooooo, 236, 219, 161, 141, 61, 151, 0, TinkerReport.KEY_APPLIED_FAIL_COST_30S_LESS, 43, 118, 130, 214, 27, 181, 175, 106, 80, 69, 243, 48, 239, 63, 85, 162, 234, 101, Lillilli.OoooOoo, 47, 192, 222, 28, TinkerReport.KEY_LOADED_EXCEPTION_DEX_CHECK, 77, 146, 117, 6, 138, 178, 230, 14, 31, 98, 212, 168, 150, C7637o0oOo0OO.OooO0o, Lillilli.ooOO, 37, 89, 132, 114, 57, 76, 94, 120, 56, 140, TinkerReport.KEY_APPLIED_FAIL_COST_OTHER, 165, 226, 97, 179, 33, 156, 30, 67, 199, TinkerReport.KEY_LOADED_EXCEPTION_DEX, 4, 81, 153, 109, 13, 250, 223, 126, 36, 59, 171, 206, 17, 143, 78, 183, 235, 60, 129, 148, 247, 185, 19, 44, AbstractC9366ILlIL.OooO00o, 231, 110, Lillilli.o0OoOo0, 3, 86, 68, 127, 169, 42, 187, Lillilli.Oooooo, 83, LayoutInflater$Factory2C7167o00o0o.o0ooOoO, 11, 157, 108, 49, 116, 246, 70, 172, 137, 20, 225, 22, 58, 105, 9, 112, 182, 208, 237, 204, 66, 152, 164, 40, 92, 248, 134};
    public static final int OooO0O0 = 64;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final short[] f17429OooO0O0;
    public static final int OooO0OO = 64;
    public static final int OooO0Oo = 10;
    public static final int OooO0o = 32;
    public static final int OooO0o0 = 285;
    public static final long[] OooO0oO = new long[256];
    public static final long[] OooO0oo = new long[256];
    public static final long[] OooOO0 = new long[256];
    public static final long[] OooOO0O = new long[256];
    public static final long[] OooOO0o = new long[256];
    public static final long[] OooOOO = new long[256];
    public static final long[] OooOOO0 = new long[256];

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f17430OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17431OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final long[] f17432OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[] f17433OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long[] f17434OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public long[] f17435OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public long[] f17436OooO0Oo;

    /* renamed from: OooO0o  reason: collision with other field name */
    public long[] f17437OooO0o;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public long[] f17438OooO0o0;

    static {
        short[] sArr = new short[32];
        f17429OooO0O0 = sArr;
        sArr[31] = 8;
    }

    public i1lILlii() {
        this.f17432OooO00o = new long[11];
        this.f17431OooO00o = new byte[64];
        this.f17430OooO00o = 0;
        this.f17433OooO00o = new short[32];
        this.f17434OooO0O0 = new long[8];
        this.f17435OooO0OO = new long[8];
        this.f17436OooO0Oo = new long[8];
        this.f17438OooO0o0 = new long[8];
        this.f17437OooO0o = new long[8];
        for (int i = 0; i < 256; i++) {
            int i2 = OooO00o[i];
            int OooO00o2 = OooO00o(i2 << 1);
            int OooO00o3 = OooO00o(OooO00o2 << 1);
            int i3 = OooO00o3 ^ i2;
            int OooO00o4 = OooO00o(OooO00o3 << 1);
            int i4 = OooO00o4 ^ i2;
            OooO0oO[i] = OooO00o(i2, i2, OooO00o3, i2, OooO00o4, i3, OooO00o2, i4);
            OooO0oo[i] = OooO00o(i4, i2, i2, OooO00o3, i2, OooO00o4, i3, OooO00o2);
            OooO[i] = OooO00o(OooO00o2, i4, i2, i2, OooO00o3, i2, OooO00o4, i3);
            OooOO0[i] = OooO00o(i3, OooO00o2, i4, i2, i2, OooO00o3, i2, OooO00o4);
            OooOO0O[i] = OooO00o(OooO00o4, i3, OooO00o2, i4, i2, i2, OooO00o3, i2);
            OooOO0o[i] = OooO00o(i2, OooO00o4, i3, OooO00o2, i4, i2, i2, OooO00o3);
            OooOOO0[i] = OooO00o(OooO00o3, i2, OooO00o4, i3, OooO00o2, i4, i2, i2);
            OooOOO[i] = OooO00o(i2, OooO00o3, i2, OooO00o4, i3, OooO00o2, i4, i2);
        }
        this.f17432OooO00o[0] = 0;
        for (int i5 = 1; i5 <= 10; i5++) {
            int i6 = (i5 - 1) * 8;
            this.f17432OooO00o[i5] = (((((((OooO0oO[i6] & -72057594037927936L) ^ (OooO0oo[i6 + 1] & 71776119061217280L)) ^ (OooO[i6 + 2] & 280375465082880L)) ^ (OooOO0[i6 + 3] & 1095216660480L)) ^ (OooOO0O[i6 + 4] & 4278190080L)) ^ (OooOO0o[i6 + 5] & 16711680)) ^ (OooOOO0[i6 + 6] & 65280)) ^ (OooOOO[i6 + 7] & 255);
        }
    }

    public i1lILlii(i1lILlii i1lillii) {
        this.f17432OooO00o = new long[11];
        this.f17431OooO00o = new byte[64];
        this.f17430OooO00o = 0;
        this.f17433OooO00o = new short[32];
        this.f17434OooO0O0 = new long[8];
        this.f17435OooO0OO = new long[8];
        this.f17436OooO0Oo = new long[8];
        this.f17438OooO0o0 = new long[8];
        this.f17437OooO0o = new long[8];
        OooO00o(i1lillii);
    }

    private int OooO00o(int i) {
        return ((long) i) >= 256 ? i ^ 285 : i;
    }

    private long OooO00o(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return (((((((((long) i2) << 48) ^ (((long) i) << 56)) ^ (((long) i3) << 40)) ^ (((long) i4) << 32)) ^ (((long) i5) << 24)) ^ (((long) i6) << 16)) ^ (((long) i7) << 8)) ^ ((long) i8);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    private long OooO00o(byte[] bArr, int i) {
        return (((long) bArr[i + 7]) & 255) | ((((long) bArr[i + 0]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
    }

    private void OooO00o(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i + i2] = (byte) ((int) ((j >> (56 - (i2 * 8))) & 255));
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m16904OooO00o(byte[] bArr, int i) {
        for (int i2 = 0; i2 < this.f17437OooO0o.length; i2++) {
            this.f17438OooO0o0[i2] = OooO00o(this.f17431OooO00o, i2 * 8);
        }
        m16909OooO0O0();
        this.f17430OooO00o = 0;
        C9586iIILl.OooO00o(this.f17431OooO00o, (byte) 0);
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    private byte[] OooO00o() {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 32; i++) {
            bArr[i] = (byte) (this.f17433OooO00o[i] & 255);
        }
        return bArr;
    }

    private void OooO0OO() {
        byte[] OooO00o2 = OooO00o();
        byte[] bArr = this.f17431OooO00o;
        int i = this.f17430OooO00o;
        int i2 = i + 1;
        this.f17430OooO00o = i2;
        bArr[i] = (byte) (bArr[i] | O0O00O.OooO00o);
        if (i2 == bArr.length) {
            m16904OooO00o(bArr, 0);
        }
        if (this.f17430OooO00o > 32) {
            while (this.f17430OooO00o != 0) {
                update((byte) 0);
            }
        }
        while (this.f17430OooO00o <= 32) {
            update((byte) 0);
        }
        System.arraycopy(OooO00o2, 0, this.f17431OooO00o, 32, OooO00o2.length);
        m16904OooO00o(this.f17431OooO00o, 0);
    }

    private void OooO0Oo() {
        int i = 0;
        for (int length = this.f17433OooO00o.length - 1; length >= 0; length--) {
            short[] sArr = this.f17433OooO00o;
            int i2 = (sArr[length] & 255) + f17429OooO0O0[length] + i;
            i = i2 >>> 8;
            sArr[length] = (short) (i2 & 255);
        }
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m16905OooO00o() {
        return 64;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m16906OooO00o(byte[] bArr, int i) {
        OooO0OO();
        for (int i2 = 0; i2 < 8; i2++) {
            OooO00o(this.f17434OooO0O0[i2], bArr, (i2 * 8) + i);
        }
        reset();
        return OooO0O0();
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6186iLi1 m16907OooO00o() {
        return new i1lILlii(this);
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16908OooO00o() {
        return "Whirlpool";
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r5) {
        i1lILlii i1lillii = (i1lILlii) r5;
        long[] jArr = i1lillii.f17432OooO00o;
        long[] jArr2 = this.f17432OooO00o;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = i1lillii.f17431OooO00o;
        byte[] bArr2 = this.f17431OooO00o;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f17430OooO00o = i1lillii.f17430OooO00o;
        short[] sArr = i1lillii.f17433OooO00o;
        short[] sArr2 = this.f17433OooO00o;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = i1lillii.f17434OooO0O0;
        long[] jArr4 = this.f17434OooO0O0;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = i1lillii.f17435OooO0OO;
        long[] jArr6 = this.f17435OooO0OO;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = i1lillii.f17436OooO0Oo;
        long[] jArr8 = this.f17436OooO0Oo;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = i1lillii.f17438OooO0o0;
        long[] jArr10 = this.f17438OooO0o0;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = i1lillii.f17437OooO0o;
        long[] jArr12 = this.f17437OooO0o;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public int OooO0O0() {
        return 64;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m16909OooO0O0() {
        long[] jArr;
        for (int i = 0; i < 8; i++) {
            long[] jArr2 = this.f17437OooO0o;
            long j = this.f17438OooO0o0[i];
            long[] jArr3 = this.f17435OooO0OO;
            long j2 = this.f17434OooO0O0[i];
            jArr3[i] = j2;
            jArr2[i] = j ^ j2;
        }
        int i2 = 1;
        while (i2 <= 10) {
            int i3 = 0;
            while (i3 < 8) {
                long[] jArr4 = this.f17436OooO0Oo;
                jArr4[i3] = 0;
                long j3 = jArr4[i3];
                long[] jArr5 = OooO0oO;
                long[] jArr6 = this.f17435OooO0OO;
                jArr4[i3] = jArr5[((int) (jArr6[(i3 + 0) & 7] >>> 56)) & 255] ^ j3;
                jArr4[i3] = jArr4[i3] ^ OooO0oo[((int) (jArr6[(i3 - 1) & 7] >>> 48)) & 255];
                jArr4[i3] = jArr4[i3] ^ OooO[((int) (jArr6[(i3 - 2) & 7] >>> 40)) & 255];
                jArr4[i3] = jArr4[i3] ^ OooOO0[((int) (jArr6[(i3 - 3) & 7] >>> 32)) & 255];
                jArr4[i3] = jArr4[i3] ^ OooOO0O[((int) (jArr6[(i3 - 4) & 7] >>> 24)) & 255];
                jArr4[i3] = jArr4[i3] ^ OooOO0o[((int) (jArr6[(i3 - 5) & 7] >>> 16)) & 255];
                jArr4[i3] = jArr4[i3] ^ OooOOO0[((int) (jArr6[(i3 - 6) & 7] >>> 8)) & 255];
                jArr4[i3] = jArr4[i3] ^ OooOOO[((int) jArr6[(i3 - 7) & 7]) & 255];
                i3++;
                i2 = i2;
            }
            long[] jArr7 = this.f17436OooO0Oo;
            long[] jArr8 = this.f17435OooO0OO;
            System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
            long[] jArr9 = this.f17435OooO0OO;
            jArr9[0] = jArr9[0] ^ this.f17432OooO00o[i2];
            int i4 = 0;
            while (true) {
                jArr = this.f17436OooO0Oo;
                if (i4 >= 8) {
                    break;
                }
                jArr[i4] = this.f17435OooO0OO[i4];
                long j4 = jArr[i4];
                long[] jArr10 = OooO0oO;
                long[] jArr11 = this.f17437OooO0o;
                jArr[i4] = j4 ^ jArr10[((int) (jArr11[(i4 + 0) & 7] >>> 56)) & 255];
                jArr[i4] = jArr[i4] ^ OooO0oo[((int) (jArr11[(i4 - 1) & 7] >>> 48)) & 255];
                jArr[i4] = jArr[i4] ^ OooO[((int) (jArr11[(i4 - 2) & 7] >>> 40)) & 255];
                jArr[i4] = jArr[i4] ^ OooOO0[((int) (jArr11[(i4 - 3) & 7] >>> 32)) & 255];
                jArr[i4] = jArr[i4] ^ OooOO0O[((int) (jArr11[(i4 - 4) & 7] >>> 24)) & 255];
                jArr[i4] = jArr[i4] ^ OooOO0o[((int) (jArr11[(i4 - 5) & 7] >>> 16)) & 255];
                jArr[i4] = jArr[i4] ^ OooOOO0[((int) (jArr11[(i4 - 6) & 7] >>> 8)) & 255];
                jArr[i4] = jArr[i4] ^ OooOOO[((int) jArr11[(i4 - 7) & 7]) & 255];
                i4++;
            }
            long[] jArr12 = this.f17437OooO0o;
            System.arraycopy(jArr, 0, jArr12, 0, jArr12.length);
            i2++;
        }
        for (int i5 = 0; i5 < 8; i5++) {
            long[] jArr13 = this.f17434OooO0O0;
            jArr13[i5] = jArr13[i5] ^ (this.f17437OooO0o[i5] ^ this.f17438OooO0o0[i5]);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        this.f17430OooO00o = 0;
        C9586iIILl.OooO00o(this.f17433OooO00o, (short) 0);
        C9586iIILl.OooO00o(this.f17431OooO00o, (byte) 0);
        C9586iIILl.OooO00o(this.f17434OooO0O0, 0L);
        C9586iIILl.OooO00o(this.f17435OooO0OO, 0L);
        C9586iIILl.OooO00o(this.f17436OooO0Oo, 0L);
        C9586iIILl.OooO00o(this.f17438OooO0o0, 0L);
        C9586iIILl.OooO00o(this.f17437OooO0o, 0L);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte b) {
        byte[] bArr = this.f17431OooO00o;
        int i = this.f17430OooO00o;
        bArr[i] = b;
        int i2 = i + 1;
        this.f17430OooO00o = i2;
        if (i2 == bArr.length) {
            m16904OooO00o(bArr, 0);
        }
        OooO0Oo();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }
}
