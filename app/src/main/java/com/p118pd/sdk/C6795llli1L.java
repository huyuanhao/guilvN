package com.p118pd.sdk;

import com.umeng.commonsdk.proguard.C3587az;

/* renamed from: com.pd.sdk.llli1L丨  reason: invalid class name and case insensitive filesystem */
public class C6795llli1L implements lIL1i11 {
    public static final byte[][] OooO00o = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, C3587az.f9268l, 15}, new byte[]{C3587az.f9268l, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, C3587az.f9268l, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, C3587az.f9268l, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, C3587az.f9268l, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, C3587az.f9268l, 1, 9}, new byte[]{12, 5, 1, 15, C3587az.f9268l, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, C3587az.f9268l, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, C3587az.f9268l, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, C3587az.f9268l, 3, 12, 13, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, C3587az.f9268l, 15}, new byte[]{C3587az.f9268l, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}};
    public static final long[] OooO0OO = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};
    public static int OooO0Oo = 12;
    public static final int OooO0o0 = 128;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f18825OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f18826OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18827OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long[] f18828OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f18829OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18830OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long[] f18831OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f18832OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public long f18833OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f18834OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public byte[] f18835OooO0Oo;

    public C6795llli1L() {
        this(512);
    }

    public C6795llli1L(int i) {
        this.f18825OooO00o = 64;
        this.OooO0O0 = 0;
        this.f18827OooO00o = null;
        this.f18830OooO0O0 = null;
        this.f18834OooO0OO = null;
        this.f18835OooO0Oo = null;
        this.f18832OooO0OO = 0;
        this.f18828OooO00o = new long[16];
        this.f18831OooO0O0 = null;
        this.f18826OooO00o = 0;
        this.f18829OooO0O0 = 0;
        this.f18833OooO0OO = 0;
        if (i < 8 || i > 512 || i % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512");
        }
        this.f18835OooO0Oo = new byte[128];
        this.OooO0O0 = 0;
        this.f18825OooO00o = i / 8;
        OooO0Oo();
    }

    public C6795llli1L(C6795llli1L r3) {
        this.f18825OooO00o = 64;
        this.OooO0O0 = 0;
        this.f18827OooO00o = null;
        this.f18830OooO0O0 = null;
        this.f18834OooO0OO = null;
        this.f18835OooO0Oo = null;
        this.f18832OooO0OO = 0;
        this.f18828OooO00o = new long[16];
        this.f18831OooO0O0 = null;
        this.f18826OooO00o = 0;
        this.f18829OooO0O0 = 0;
        this.f18833OooO0OO = 0;
        this.f18832OooO0OO = r3.f18832OooO0OO;
        this.f18835OooO0Oo = C9586iIILl.m21630OooO00o(r3.f18835OooO0Oo);
        this.OooO0O0 = r3.OooO0O0;
        this.f18834OooO0OO = C9586iIILl.m21630OooO00o(r3.f18834OooO0OO);
        this.f18825OooO00o = r3.f18825OooO00o;
        this.f18831OooO0O0 = C9586iIILl.m21639OooO00o(r3.f18831OooO0O0);
        this.f18830OooO0O0 = C9586iIILl.m21630OooO00o(r3.f18830OooO0O0);
        this.f18827OooO00o = C9586iIILl.m21630OooO00o(r3.f18827OooO00o);
        this.f18826OooO00o = r3.f18826OooO00o;
        this.f18829OooO0O0 = r3.f18829OooO0O0;
        this.f18833OooO0OO = r3.f18833OooO0OO;
    }

    public C6795llli1L(byte[] bArr) {
        this.f18825OooO00o = 64;
        this.OooO0O0 = 0;
        this.f18827OooO00o = null;
        this.f18830OooO0O0 = null;
        this.f18834OooO0OO = null;
        this.f18835OooO0Oo = null;
        this.f18832OooO0OO = 0;
        this.f18828OooO00o = new long[16];
        this.f18831OooO0O0 = null;
        this.f18826OooO00o = 0;
        this.f18829OooO0O0 = 0;
        this.f18833OooO0OO = 0;
        this.f18835OooO0Oo = new byte[128];
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.f18834OooO0OO = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            if (bArr.length <= 64) {
                this.OooO0O0 = bArr.length;
                System.arraycopy(bArr, 0, this.f18835OooO0Oo, 0, bArr.length);
                this.f18832OooO0OO = 128;
            } else {
                throw new IllegalArgumentException("Keys > 64 are not supported");
            }
        }
        this.f18825OooO00o = 64;
        OooO0Oo();
    }

    public C6795llli1L(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        this.f18825OooO00o = 64;
        this.OooO0O0 = 0;
        this.f18827OooO00o = null;
        this.f18830OooO0O0 = null;
        this.f18834OooO0OO = null;
        this.f18835OooO0Oo = null;
        this.f18832OooO0OO = 0;
        this.f18828OooO00o = new long[16];
        this.f18831OooO0O0 = null;
        this.f18826OooO00o = 0;
        this.f18829OooO0O0 = 0;
        this.f18833OooO0OO = 0;
        this.f18835OooO0Oo = new byte[128];
        if (i < 1 || i > 64) {
            throw new IllegalArgumentException("Invalid digest length (required: 1 - 64)");
        }
        this.f18825OooO00o = i;
        if (bArr2 != null) {
            if (bArr2.length == 16) {
                byte[] bArr4 = new byte[16];
                this.f18827OooO00o = bArr4;
                System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
            } else {
                throw new IllegalArgumentException("salt length must be exactly 16 bytes");
            }
        }
        if (bArr3 != null) {
            if (bArr3.length == 16) {
                byte[] bArr5 = new byte[16];
                this.f18830OooO0O0 = bArr5;
                System.arraycopy(bArr3, 0, bArr5, 0, bArr3.length);
            } else {
                throw new IllegalArgumentException("personalization length must be exactly 16 bytes");
            }
        }
        if (bArr != null) {
            byte[] bArr6 = new byte[bArr.length];
            this.f18834OooO0OO = bArr6;
            System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
            if (bArr.length <= 64) {
                this.OooO0O0 = bArr.length;
                System.arraycopy(bArr, 0, this.f18835OooO0Oo, 0, bArr.length);
                this.f18832OooO0OO = 128;
            } else {
                throw new IllegalArgumentException("Keys > 64 are not supported");
            }
        }
        OooO0Oo();
    }

    public static long OooO00o(long j, int i) {
        return (j << (64 - i)) | (j >>> i);
    }

    private void OooO00o(long j, long j2, int i, int i2, int i3, int i4) {
        long[] jArr = this.f18828OooO00o;
        jArr[i] = jArr[i] + jArr[i2] + j;
        jArr[i4] = OooO00o(jArr[i4] ^ jArr[i], 32);
        long[] jArr2 = this.f18828OooO00o;
        jArr2[i3] = jArr2[i3] + jArr2[i4];
        jArr2[i2] = OooO00o(jArr2[i2] ^ jArr2[i3], 24);
        long[] jArr3 = this.f18828OooO00o;
        jArr3[i] = jArr3[i] + jArr3[i2] + j2;
        jArr3[i4] = OooO00o(jArr3[i4] ^ jArr3[i], 16);
        long[] jArr4 = this.f18828OooO00o;
        jArr4[i3] = jArr4[i3] + jArr4[i4];
        jArr4[i2] = OooO00o(jArr4[i2] ^ jArr4[i3], 63);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    private void OooO00o(byte[] bArr, int i) {
        OooO0o0();
        long[] jArr = new long[16];
        int i2 = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            jArr[i3] = AbstractC6464l1l.m17601OooO0O0(bArr, (i3 * 8) + i);
        }
        for (int i4 = 0; i4 < OooO0Oo; i4++) {
            byte[][] bArr2 = OooO00o;
            OooO00o(jArr[bArr2[i4][0]], jArr[bArr2[i4][1]], 0, 4, 8, 12);
            byte[][] bArr3 = OooO00o;
            OooO00o(jArr[bArr3[i4][2]], jArr[bArr3[i4][3]], 1, 5, 9, 13);
            byte[][] bArr4 = OooO00o;
            OooO00o(jArr[bArr4[i4][4]], jArr[bArr4[i4][5]], 2, 6, 10, 14);
            byte[][] bArr5 = OooO00o;
            OooO00o(jArr[bArr5[i4][6]], jArr[bArr5[i4][7]], 3, 7, 11, 15);
            byte[][] bArr6 = OooO00o;
            OooO00o(jArr[bArr6[i4][8]], jArr[bArr6[i4][9]], 0, 5, 10, 15);
            byte[][] bArr7 = OooO00o;
            OooO00o(jArr[bArr7[i4][10]], jArr[bArr7[i4][11]], 1, 6, 11, 12);
            byte[][] bArr8 = OooO00o;
            OooO00o(jArr[bArr8[i4][12]], jArr[bArr8[i4][13]], 2, 7, 8, 13);
            byte[][] bArr9 = OooO00o;
            OooO00o(jArr[bArr9[i4][14]], jArr[bArr9[i4][15]], 3, 4, 9, 14);
        }
        while (true) {
            long[] jArr2 = this.f18831OooO0O0;
            if (i2 < jArr2.length) {
                long j = jArr2[i2];
                long[] jArr3 = this.f18828OooO00o;
                jArr2[i2] = (j ^ jArr3[i2]) ^ jArr3[i2 + 8];
                i2++;
            } else {
                return;
            }
        }
    }

    private void OooO0Oo() {
        if (this.f18831OooO0O0 == null) {
            long[] jArr = new long[8];
            this.f18831OooO0O0 = jArr;
            long[] jArr2 = OooO0OO;
            jArr[0] = jArr2[0] ^ ((long) ((this.f18825OooO00o | (this.OooO0O0 << 8)) | 16842752));
            jArr[1] = jArr2[1];
            jArr[2] = jArr2[2];
            jArr[3] = jArr2[3];
            jArr[4] = jArr2[4];
            jArr[5] = jArr2[5];
            byte[] bArr = this.f18827OooO00o;
            if (bArr != null) {
                jArr[4] = jArr[4] ^ AbstractC6464l1l.m17601OooO0O0(bArr, 0);
                long[] jArr3 = this.f18831OooO0O0;
                jArr3[5] = jArr3[5] ^ AbstractC6464l1l.m17601OooO0O0(this.f18827OooO00o, 8);
            }
            long[] jArr4 = this.f18831OooO0O0;
            long[] jArr5 = OooO0OO;
            jArr4[6] = jArr5[6];
            jArr4[7] = jArr5[7];
            byte[] bArr2 = this.f18830OooO0O0;
            if (bArr2 != null) {
                jArr4[6] = AbstractC6464l1l.m17601OooO0O0(bArr2, 0) ^ jArr4[6];
                long[] jArr6 = this.f18831OooO0O0;
                jArr6[7] = jArr6[7] ^ AbstractC6464l1l.m17601OooO0O0(this.f18830OooO0O0, 8);
            }
        }
    }

    private void OooO0o0() {
        long[] jArr = this.f18831OooO0O0;
        System.arraycopy(jArr, 0, this.f18828OooO00o, 0, jArr.length);
        System.arraycopy(OooO0OO, 0, this.f18828OooO00o, this.f18831OooO0O0.length, 4);
        long[] jArr2 = this.f18828OooO00o;
        long j = this.f18826OooO00o;
        long[] jArr3 = OooO0OO;
        jArr2[12] = j ^ jArr3[4];
        jArr2[13] = this.f18829OooO0O0 ^ jArr3[5];
        jArr2[14] = this.f18833OooO0OO ^ jArr3[6];
        jArr2[15] = jArr3[7];
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o() {
        return 128;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m17926OooO00o(byte[] bArr, int i) {
        int i2;
        this.f18833OooO0OO = -1;
        long j = this.f18826OooO00o;
        int i3 = this.f18832OooO0OO;
        long j2 = j + ((long) i3);
        this.f18826OooO00o = j2;
        if (i3 > 0 && j2 == 0) {
            this.f18829OooO0O0++;
        }
        OooO00o(this.f18835OooO0Oo, 0);
        C9586iIILl.OooO00o(this.f18835OooO0Oo, (byte) 0);
        C9586iIILl.OooO00o(this.f18828OooO00o, 0L);
        int i4 = 0;
        while (true) {
            long[] jArr = this.f18831OooO0O0;
            if (i4 >= jArr.length || (i2 = i4 * 8) >= this.f18825OooO00o) {
                C9586iIILl.OooO00o(this.f18831OooO0O0, 0L);
                reset();
            } else {
                byte[] OooO0O02 = AbstractC6464l1l.OooO0O0(jArr[i4]);
                int i5 = this.f18825OooO00o;
                if (i2 < i5 - 8) {
                    System.arraycopy(OooO0O02, 0, bArr, i2 + i, 8);
                } else {
                    System.arraycopy(OooO0O02, 0, bArr, i + i2, i5 - i2);
                }
                i4++;
            }
        }
        C9586iIILl.OooO00o(this.f18831OooO0O0, 0L);
        reset();
        return this.f18825OooO00o;
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17927OooO00o() {
        return "BLAKE2b";
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public int OooO0O0() {
        return this.f18825OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m17928OooO0O0() {
        byte[] bArr = this.f18834OooO0OO;
        if (bArr != null) {
            C9586iIILl.OooO00o(bArr, (byte) 0);
            C9586iIILl.OooO00o(this.f18835OooO0Oo, (byte) 0);
        }
    }

    public void OooO0OO() {
        byte[] bArr = this.f18827OooO00o;
        if (bArr != null) {
            C9586iIILl.OooO00o(bArr, (byte) 0);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        this.f18832OooO0OO = 0;
        this.f18833OooO0OO = 0;
        this.f18826OooO00o = 0;
        this.f18829OooO0O0 = 0;
        this.f18831OooO0O0 = null;
        C9586iIILl.OooO00o(this.f18835OooO0Oo, (byte) 0);
        byte[] bArr = this.f18834OooO0OO;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.f18835OooO0Oo, 0, bArr.length);
            this.f18832OooO0OO = 128;
        }
        OooO0Oo();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte b) {
        int i = this.f18832OooO0OO;
        if (128 - i == 0) {
            long j = this.f18826OooO00o + 128;
            this.f18826OooO00o = j;
            if (j == 0) {
                this.f18829OooO0O0++;
            }
            OooO00o(this.f18835OooO0Oo, 0);
            C9586iIILl.OooO00o(this.f18835OooO0Oo, (byte) 0);
            this.f18835OooO0Oo[0] = b;
            this.f18832OooO0OO = 1;
            return;
        }
        this.f18835OooO0Oo[i] = b;
        this.f18832OooO0OO = i + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    @Override // com.p118pd.sdk.AbstractC6436l11LI
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void update(byte[] r12, int r13, int r14) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x0061
            if (r14 != 0) goto L_0x0005
            goto L_0x0061
        L_0x0005:
            int r0 = r11.f18832OooO0OO
            r1 = 1
            r3 = 0
            r5 = 128(0x80, double:6.32E-322)
            r7 = 0
            if (r0 == 0) goto L_0x003f
            int r8 = 128 - r0
            if (r8 >= r14) goto L_0x0034
            byte[] r9 = r11.f18835OooO0Oo
            java.lang.System.arraycopy(r12, r13, r9, r0, r8)
            long r9 = r11.f18826OooO00o
            long r9 = r9 + r5
            r11.f18826OooO00o = r9
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0027
            long r9 = r11.f18829OooO0O0
            long r9 = r9 + r1
            r11.f18829OooO0O0 = r9
        L_0x0027:
            byte[] r0 = r11.f18835OooO0Oo
            r11.OooO00o(r0, r7)
            r11.f18832OooO0OO = r7
            byte[] r0 = r11.f18835OooO0Oo
            com.p118pd.sdk.C9586iIILl.OooO00o(r0, r7)
            goto L_0x0040
        L_0x0034:
            byte[] r1 = r11.f18835OooO0Oo
            java.lang.System.arraycopy(r12, r13, r1, r0, r14)
        L_0x0039:
            int r12 = r11.f18832OooO0OO
            int r12 = r12 + r14
            r11.f18832OooO0OO = r12
            return
        L_0x003f:
            r8 = 0
        L_0x0040:
            int r14 = r14 + r13
            int r0 = r14 + -128
            int r13 = r13 + r8
        L_0x0044:
            if (r13 >= r0) goto L_0x005a
            long r8 = r11.f18826OooO00o
            long r8 = r8 + r5
            r11.f18826OooO00o = r8
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 != 0) goto L_0x0054
            long r8 = r11.f18829OooO0O0
            long r8 = r8 + r1
            r11.f18829OooO0O0 = r8
        L_0x0054:
            r11.OooO00o(r12, r13)
            int r13 = r13 + 128
            goto L_0x0044
        L_0x005a:
            byte[] r0 = r11.f18835OooO0Oo
            int r14 = r14 - r13
            java.lang.System.arraycopy(r12, r13, r0, r7, r14)
            goto L_0x0039
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6795llli1L.update(byte[], int, int):void");
    }
}
