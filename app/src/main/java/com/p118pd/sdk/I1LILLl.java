package com.p118pd.sdk;

import com.umeng.commonsdk.proguard.C3587az;

/* renamed from: com.pd.sdk.I1LI丨LLl  reason: invalid class name */
public class I1LILLl implements lIL1i11 {
    public static final byte[][] OooO00o = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, C3587az.f9268l, 15}, new byte[]{C3587az.f9268l, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, C3587az.f9268l, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, C3587az.f9268l, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, C3587az.f9268l, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, C3587az.f9268l, 1, 9}, new byte[]{12, 5, 1, 15, C3587az.f9268l, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, C3587az.f9268l, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, C3587az.f9268l, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, C3587az.f9268l, 3, 12, 13, 0}};
    public static final int[] OooO0OO = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
    public static final int OooO0oO = 10;
    public static final int OooO0oo = 64;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f15340OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15341OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f15342OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f15343OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f15344OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f15345OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f15346OooO0OO;
    public int OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public byte[] f15347OooO0Oo;
    public int OooO0o;
    public int OooO0o0;

    public I1LILLl() {
        this(256);
    }

    public I1LILLl(int i) {
        this.f15340OooO00o = 32;
        this.OooO0O0 = 0;
        this.f15341OooO00o = null;
        this.f15343OooO0O0 = null;
        this.f15346OooO0OO = null;
        this.f15347OooO0Oo = null;
        this.f15345OooO0OO = 0;
        this.f15342OooO00o = new int[16];
        this.f15344OooO0O0 = null;
        this.OooO0Oo = 0;
        this.OooO0o0 = 0;
        this.OooO0o = 0;
        if (i < 8 || i > 256 || i % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2s digest bit length must be a multiple of 8 and not greater than 256");
        }
        this.f15347OooO0Oo = new byte[64];
        this.OooO0O0 = 0;
        this.f15340OooO00o = i / 8;
        OooO0Oo();
    }

    public I1LILLl(I1LILLl r4) {
        this.f15340OooO00o = 32;
        this.OooO0O0 = 0;
        this.f15341OooO00o = null;
        this.f15343OooO0O0 = null;
        this.f15346OooO0OO = null;
        this.f15347OooO0Oo = null;
        this.f15345OooO0OO = 0;
        this.f15342OooO00o = new int[16];
        this.f15344OooO0O0 = null;
        this.OooO0Oo = 0;
        this.OooO0o0 = 0;
        this.OooO0o = 0;
        this.f15345OooO0OO = r4.f15345OooO0OO;
        this.f15347OooO0Oo = C9586iIILl.m21630OooO00o(r4.f15347OooO0Oo);
        this.OooO0O0 = r4.OooO0O0;
        this.f15346OooO0OO = C9586iIILl.m21630OooO00o(r4.f15346OooO0OO);
        this.f15340OooO00o = r4.f15340OooO00o;
        this.f15344OooO0O0 = C9586iIILl.m21635OooO00o(r4.f15344OooO0O0);
        this.f15343OooO0O0 = C9586iIILl.m21630OooO00o(r4.f15343OooO0O0);
    }

    public I1LILLl(byte[] bArr) {
        this.f15340OooO00o = 32;
        this.OooO0O0 = 0;
        this.f15341OooO00o = null;
        this.f15343OooO0O0 = null;
        this.f15346OooO0OO = null;
        this.f15347OooO0Oo = null;
        this.f15345OooO0OO = 0;
        this.f15342OooO00o = new int[16];
        this.f15344OooO0O0 = null;
        this.OooO0Oo = 0;
        this.OooO0o0 = 0;
        this.OooO0o = 0;
        this.f15347OooO0Oo = new byte[64];
        if (bArr != null) {
            if (bArr.length <= 32) {
                byte[] bArr2 = new byte[bArr.length];
                this.f15346OooO0OO = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.OooO0O0 = bArr.length;
                System.arraycopy(bArr, 0, this.f15347OooO0Oo, 0, bArr.length);
                this.f15345OooO0OO = 64;
            } else {
                throw new IllegalArgumentException("Keys > 32 are not supported");
            }
        }
        this.f15340OooO00o = 32;
        OooO0Oo();
    }

    public I1LILLl(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        this.f15340OooO00o = 32;
        this.OooO0O0 = 0;
        this.f15341OooO00o = null;
        this.f15343OooO0O0 = null;
        this.f15346OooO0OO = null;
        this.f15347OooO0Oo = null;
        this.f15345OooO0OO = 0;
        this.f15342OooO00o = new int[16];
        this.f15344OooO0O0 = null;
        this.OooO0Oo = 0;
        this.OooO0o0 = 0;
        this.OooO0o = 0;
        this.f15347OooO0Oo = new byte[64];
        if (i < 1 || i > 32) {
            throw new IllegalArgumentException("Invalid digest length (required: 1 - 32)");
        }
        this.f15340OooO00o = i;
        if (bArr2 != null) {
            if (bArr2.length == 8) {
                byte[] bArr4 = new byte[8];
                this.f15341OooO00o = bArr4;
                System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
            } else {
                throw new IllegalArgumentException("Salt length must be exactly 8 bytes");
            }
        }
        if (bArr3 != null) {
            if (bArr3.length == 8) {
                byte[] bArr5 = new byte[8];
                this.f15343OooO0O0 = bArr5;
                System.arraycopy(bArr3, 0, bArr5, 0, bArr3.length);
            } else {
                throw new IllegalArgumentException("Personalization length must be exactly 8 bytes");
            }
        }
        if (bArr != null) {
            if (bArr.length <= 32) {
                byte[] bArr6 = new byte[bArr.length];
                this.f15346OooO0OO = bArr6;
                System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
                this.OooO0O0 = bArr.length;
                System.arraycopy(bArr, 0, this.f15347OooO0Oo, 0, bArr.length);
                this.f15345OooO0OO = 64;
            } else {
                throw new IllegalArgumentException("Keys > 32 bytes are not supported");
            }
        }
        OooO0Oo();
    }

    private int OooO00o(int i, int i2) {
        return (i << (32 - i2)) | (i >>> i2);
    }

    private void OooO00o(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this.f15342OooO00o;
        iArr[i3] = iArr[i3] + iArr[i4] + i;
        iArr[i6] = OooO00o(iArr[i6] ^ iArr[i3], 16);
        int[] iArr2 = this.f15342OooO00o;
        iArr2[i5] = iArr2[i5] + iArr2[i6];
        iArr2[i4] = OooO00o(iArr2[i4] ^ iArr2[i5], 12);
        int[] iArr3 = this.f15342OooO00o;
        iArr3[i3] = iArr3[i3] + iArr3[i4] + i2;
        iArr3[i6] = OooO00o(iArr3[i6] ^ iArr3[i3], 8);
        int[] iArr4 = this.f15342OooO00o;
        iArr4[i5] = iArr4[i5] + iArr4[i6];
        iArr4[i4] = OooO00o(iArr4[i4] ^ iArr4[i5], 7);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    private void OooO00o(byte[] bArr, int i) {
        OooO0o0();
        int[] iArr = new int[16];
        int i2 = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            iArr[i3] = AbstractC6464l1l.OooO0O0(bArr, (i3 * 4) + i);
        }
        for (int i4 = 0; i4 < 10; i4++) {
            byte[][] bArr2 = OooO00o;
            OooO00o(iArr[bArr2[i4][0]], iArr[bArr2[i4][1]], 0, 4, 8, 12);
            byte[][] bArr3 = OooO00o;
            OooO00o(iArr[bArr3[i4][2]], iArr[bArr3[i4][3]], 1, 5, 9, 13);
            byte[][] bArr4 = OooO00o;
            OooO00o(iArr[bArr4[i4][4]], iArr[bArr4[i4][5]], 2, 6, 10, 14);
            byte[][] bArr5 = OooO00o;
            OooO00o(iArr[bArr5[i4][6]], iArr[bArr5[i4][7]], 3, 7, 11, 15);
            byte[][] bArr6 = OooO00o;
            OooO00o(iArr[bArr6[i4][8]], iArr[bArr6[i4][9]], 0, 5, 10, 15);
            byte[][] bArr7 = OooO00o;
            OooO00o(iArr[bArr7[i4][10]], iArr[bArr7[i4][11]], 1, 6, 11, 12);
            byte[][] bArr8 = OooO00o;
            OooO00o(iArr[bArr8[i4][12]], iArr[bArr8[i4][13]], 2, 7, 8, 13);
            byte[][] bArr9 = OooO00o;
            OooO00o(iArr[bArr9[i4][14]], iArr[bArr9[i4][15]], 3, 4, 9, 14);
        }
        while (true) {
            int[] iArr2 = this.f15344OooO0O0;
            if (i2 < iArr2.length) {
                int i5 = iArr2[i2];
                int[] iArr3 = this.f15342OooO00o;
                iArr2[i2] = (i5 ^ iArr3[i2]) ^ iArr3[i2 + 8];
                i2++;
            } else {
                return;
            }
        }
    }

    private void OooO0Oo() {
        if (this.f15344OooO0O0 == null) {
            int[] iArr = new int[8];
            this.f15344OooO0O0 = iArr;
            int[] iArr2 = OooO0OO;
            iArr[0] = (((this.OooO0O0 << 8) | this.f15340OooO00o) | 16842752) ^ iArr2[0];
            iArr[1] = iArr2[1];
            iArr[2] = iArr2[2];
            iArr[3] = iArr2[3];
            iArr[4] = iArr2[4];
            iArr[5] = iArr2[5];
            byte[] bArr = this.f15341OooO00o;
            if (bArr != null) {
                iArr[4] = AbstractC6464l1l.OooO0O0(bArr, 0) ^ iArr[4];
                int[] iArr3 = this.f15344OooO0O0;
                iArr3[5] = iArr3[5] ^ AbstractC6464l1l.OooO0O0(this.f15341OooO00o, 4);
            }
            int[] iArr4 = this.f15344OooO0O0;
            int[] iArr5 = OooO0OO;
            iArr4[6] = iArr5[6];
            iArr4[7] = iArr5[7];
            byte[] bArr2 = this.f15343OooO0O0;
            if (bArr2 != null) {
                iArr4[6] = AbstractC6464l1l.OooO0O0(bArr2, 0) ^ iArr4[6];
                int[] iArr6 = this.f15344OooO0O0;
                iArr6[7] = AbstractC6464l1l.OooO0O0(this.f15343OooO0O0, 4) ^ iArr6[7];
            }
        }
    }

    private void OooO0o0() {
        int[] iArr = this.f15344OooO0O0;
        System.arraycopy(iArr, 0, this.f15342OooO00o, 0, iArr.length);
        System.arraycopy(OooO0OO, 0, this.f15342OooO00o, this.f15344OooO0O0.length, 4);
        int[] iArr2 = this.f15342OooO00o;
        int i = this.OooO0Oo;
        int[] iArr3 = OooO0OO;
        iArr2[12] = i ^ iArr3[4];
        iArr2[13] = this.OooO0o0 ^ iArr3[5];
        iArr2[14] = this.OooO0o ^ iArr3[6];
        iArr2[15] = iArr3[7];
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o() {
        return 64;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m15280OooO00o(byte[] bArr, int i) {
        int i2;
        this.OooO0o = -1;
        int i3 = this.OooO0Oo;
        int i4 = this.f15345OooO0OO;
        int i5 = i3 + i4;
        this.OooO0Oo = i5;
        if (i5 < 0 && i4 > (-i5)) {
            this.OooO0o0++;
        }
        OooO00o(this.f15347OooO0Oo, 0);
        C9586iIILl.OooO00o(this.f15347OooO0Oo, (byte) 0);
        C9586iIILl.OooO00o(this.f15342OooO00o, 0);
        int i6 = 0;
        while (true) {
            int[] iArr = this.f15344OooO0O0;
            if (i6 >= iArr.length || (i2 = i6 * 4) >= this.f15340OooO00o) {
                C9586iIILl.OooO00o(this.f15344OooO0O0, 0);
                reset();
            } else {
                byte[] OooO0O02 = AbstractC6464l1l.OooO0O0(iArr[i6]);
                int i7 = this.f15340OooO00o;
                if (i2 < i7 - 4) {
                    System.arraycopy(OooO0O02, 0, bArr, i2 + i, 4);
                } else {
                    System.arraycopy(OooO0O02, 0, bArr, i + i2, i7 - i2);
                }
                i6++;
            }
        }
        C9586iIILl.OooO00o(this.f15344OooO0O0, 0);
        reset();
        return this.f15340OooO00o;
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15281OooO00o() {
        return "BLAKE2s";
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public int OooO0O0() {
        return this.f15340OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m15282OooO0O0() {
        byte[] bArr = this.f15346OooO0OO;
        if (bArr != null) {
            C9586iIILl.OooO00o(bArr, (byte) 0);
            C9586iIILl.OooO00o(this.f15347OooO0Oo, (byte) 0);
        }
    }

    public void OooO0OO() {
        byte[] bArr = this.f15341OooO00o;
        if (bArr != null) {
            C9586iIILl.OooO00o(bArr, (byte) 0);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        this.f15345OooO0OO = 0;
        this.OooO0o = 0;
        this.OooO0Oo = 0;
        this.OooO0o0 = 0;
        this.f15344OooO0O0 = null;
        C9586iIILl.OooO00o(this.f15347OooO0Oo, (byte) 0);
        byte[] bArr = this.f15346OooO0OO;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.f15347OooO0Oo, 0, bArr.length);
            this.f15345OooO0OO = 64;
        }
        OooO0Oo();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte b) {
        int i = this.f15345OooO0OO;
        if (64 - i == 0) {
            int i2 = this.OooO0Oo + 64;
            this.OooO0Oo = i2;
            if (i2 == 0) {
                this.OooO0o0++;
            }
            OooO00o(this.f15347OooO0Oo, 0);
            C9586iIILl.OooO00o(this.f15347OooO0Oo, (byte) 0);
            this.f15347OooO0Oo[0] = b;
            this.f15345OooO0OO = 1;
            return;
        }
        this.f15347OooO0Oo[i] = b;
        this.f15345OooO0OO = i + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    @Override // com.p118pd.sdk.AbstractC6436l11LI
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void update(byte[] r5, int r6, int r7) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x005b
            if (r7 != 0) goto L_0x0005
            goto L_0x005b
        L_0x0005:
            int r0 = r4.f15345OooO0OO
            r1 = 0
            if (r0 == 0) goto L_0x0039
            int r2 = 64 - r0
            if (r2 >= r7) goto L_0x002e
            byte[] r3 = r4.f15347OooO0Oo
            java.lang.System.arraycopy(r5, r6, r3, r0, r2)
            int r0 = r4.OooO0Oo
            int r0 = r0 + 64
            r4.OooO0Oo = r0
            if (r0 != 0) goto L_0x0021
            int r0 = r4.OooO0o0
            int r0 = r0 + 1
            r4.OooO0o0 = r0
        L_0x0021:
            byte[] r0 = r4.f15347OooO0Oo
            r4.OooO00o(r0, r1)
            r4.f15345OooO0OO = r1
            byte[] r0 = r4.f15347OooO0Oo
            com.p118pd.sdk.C9586iIILl.OooO00o(r0, r1)
            goto L_0x003a
        L_0x002e:
            byte[] r1 = r4.f15347OooO0Oo
            java.lang.System.arraycopy(r5, r6, r1, r0, r7)
        L_0x0033:
            int r5 = r4.f15345OooO0OO
            int r5 = r5 + r7
            r4.f15345OooO0OO = r5
            return
        L_0x0039:
            r2 = 0
        L_0x003a:
            int r7 = r7 + r6
            int r0 = r7 + -64
            int r6 = r6 + r2
        L_0x003e:
            if (r6 >= r0) goto L_0x0054
            int r2 = r4.OooO0Oo
            int r2 = r2 + 64
            r4.OooO0Oo = r2
            if (r2 != 0) goto L_0x004e
            int r2 = r4.OooO0o0
            int r2 = r2 + 1
            r4.OooO0o0 = r2
        L_0x004e:
            r4.OooO00o(r5, r6)
            int r6 = r6 + 64
            goto L_0x003e
        L_0x0054:
            byte[] r0 = r4.f15347OooO0Oo
            int r7 = r7 - r6
            java.lang.System.arraycopy(r5, r6, r0, r1, r7)
            goto L_0x0033
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.I1LILLl.update(byte[], int, int):void");
    }
}
