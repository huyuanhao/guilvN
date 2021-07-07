package com.p118pd.sdk;

import com.bumptech.glide.load.engine.GlideException;
import java.lang.reflect.Array;

/* renamed from: com.pd.sdk.iL丨L  reason: invalid class name and case insensitive filesystem */
public class C6206iLL {
    public int OooO;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f17808OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6237iiL f17809OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f17810OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17811OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f17812OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f17813OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f17814OooO0OO;
    public int OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public byte[] f17815OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public int OooOO0O;
    public int OooOO0o;

    public C6206iLL(AbstractC6436l11LI r3, int i, int i2) {
        this.f17810OooO00o = r3;
        this.f17809OooO00o = new C6237iiL(r3);
        int OooO0O02 = this.f17810OooO00o.OooO0O0();
        this.OooO00o = OooO0O02;
        this.OooO0OO = i;
        this.OooOO0o = i2;
        this.OooO0o0 = (1 << i) - 1;
        double d = (double) (OooO0O02 << 3);
        double d2 = (double) i;
        Double.isNaN(d);
        Double.isNaN(d2);
        this.OooO0Oo = (int) Math.ceil(d / d2);
    }

    public C6206iLL(AbstractC6436l11LI r15, byte[][] bArr, int[] iArr) {
        this.f17810OooO00o = r15;
        this.f17809OooO00o = new C6237iiL(r15);
        this.OooO0oo = iArr[0];
        this.OooO0oO = iArr[1];
        this.OooO = iArr[2];
        this.OooO0o = iArr[3];
        this.OooOO0 = iArr[4];
        this.OooO0O0 = iArr[5];
        this.OooOO0o = iArr[6];
        this.OooO0OO = iArr[7];
        this.OooOO0O = iArr[8];
        int OooO0O02 = this.f17810OooO00o.OooO0O0();
        this.OooO00o = OooO0O02;
        int i = this.OooO0OO;
        this.OooO0o0 = (1 << i) - 1;
        double d = (double) (OooO0O02 << 3);
        double d2 = (double) i;
        Double.isNaN(d);
        Double.isNaN(d2);
        this.OooO0Oo = (int) Math.ceil(d / d2);
        this.f17811OooO00o = bArr[0];
        this.f17815OooO0Oo = bArr[1];
        this.f17813OooO0O0 = bArr[2];
        this.f17814OooO0OO = bArr[3];
        this.f17808OooO00o = (((long) (bArr[4][1] & 255)) << 8) | ((long) (bArr[4][0] & 255)) | (((long) (bArr[4][2] & 255)) << 16) | (((long) (bArr[4][3] & 255)) << 24) | (((long) (bArr[4][4] & 255)) << 32) | (((long) (bArr[4][5] & 255)) << 40) | (((long) (bArr[4][6] & 255)) << 48) | (((long) (bArr[4][7] & 255)) << 56);
        this.f17812OooO0O0 = ((long) (bArr[4][8] & 255)) | (((long) (bArr[4][9] & 255)) << 8) | (((long) (bArr[4][10] & 255)) << 16) | (((long) (bArr[4][11] & 255)) << 24) | (((long) (bArr[4][12] & 255)) << 32) | (((long) (bArr[4][13] & 255)) << 40) | (((long) (bArr[4][14] & 255)) << 48) | (((long) (bArr[4][15] & 255)) << 56);
    }

    private void OooO00o() {
        long j;
        int i;
        int i2 = this.OooO0OO;
        if (8 % i2 == 0) {
            int i3 = this.OooO0oO;
            if (i3 == 0) {
                this.f17811OooO00o = this.f17809OooO00o.m17248OooO00o(this.f17815OooO0Oo);
                int i4 = this.OooO;
                if (i4 < this.OooO00o) {
                    byte[] bArr = this.f17813OooO0O0;
                    this.OooO0oO = bArr[i4] & this.OooO0o0;
                    bArr[i4] = (byte) (bArr[i4] >>> this.OooO0OO);
                } else {
                    int i5 = this.OooOO0O;
                    this.OooO0oO = this.OooO0o0 & i5;
                    this.OooOO0O = i5 >>> this.OooO0OO;
                }
            } else if (i3 > 0) {
                AbstractC6436l11LI r0 = this.f17810OooO00o;
                byte[] bArr2 = this.f17811OooO00o;
                r0.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.f17810OooO00o.OooO0O0()];
                this.f17811OooO00o = bArr3;
                this.f17810OooO00o.OooO00o(bArr3, 0);
                this.OooO0oO--;
            }
            if (this.OooO0oO == 0) {
                byte[] bArr4 = this.f17811OooO00o;
                byte[] bArr5 = this.f17814OooO0OO;
                int i6 = this.OooO0oo;
                int i7 = this.OooO00o;
                System.arraycopy(bArr4, 0, bArr5, i6 * i7, i7);
                int i8 = this.OooO0oo + 1;
                this.OooO0oo = i8;
                if (i8 % (8 / this.OooO0OO) == 0) {
                    this.OooO++;
                    return;
                }
                return;
            }
            return;
        }
        if (i2 < 8) {
            int i9 = this.OooO0oO;
            if (i9 == 0) {
                int i10 = this.OooO0oo;
                if (i10 % 8 == 0 && this.OooO < (i = this.OooO00o)) {
                    this.f17812OooO0O0 = 0;
                    if (i10 < ((i / i2) << 3)) {
                        for (int i11 = 0; i11 < this.OooO0OO; i11++) {
                            long j2 = this.f17812OooO0O0;
                            byte[] bArr6 = this.f17813OooO0O0;
                            int i12 = this.OooO;
                            this.f17812OooO0O0 = j2 ^ ((long) ((bArr6[i12] & 255) << (i11 << 3)));
                            this.OooO = i12 + 1;
                        }
                    } else {
                        for (int i13 = 0; i13 < this.OooO00o % this.OooO0OO; i13++) {
                            long j3 = this.f17812OooO0O0;
                            byte[] bArr7 = this.f17813OooO0O0;
                            int i14 = this.OooO;
                            this.f17812OooO0O0 = j3 ^ ((long) ((bArr7[i14] & 255) << (i13 << 3)));
                            this.OooO = i14 + 1;
                        }
                    }
                }
                if (this.OooO0oo == this.OooO0Oo) {
                    this.f17812OooO0O0 = (long) this.OooOO0O;
                }
                this.OooO0oO = (int) (this.f17812OooO0O0 & ((long) this.OooO0o0));
                this.f17811OooO00o = this.f17809OooO00o.m17248OooO00o(this.f17815OooO0Oo);
            } else if (i9 > 0) {
                AbstractC6436l11LI r02 = this.f17810OooO00o;
                byte[] bArr8 = this.f17811OooO00o;
                r02.update(bArr8, 0, bArr8.length);
                byte[] bArr9 = new byte[this.f17810OooO00o.OooO0O0()];
                this.f17811OooO00o = bArr9;
                this.f17810OooO00o.OooO00o(bArr9, 0);
                this.OooO0oO--;
            }
            if (this.OooO0oO == 0) {
                byte[] bArr10 = this.f17811OooO00o;
                byte[] bArr11 = this.f17814OooO0OO;
                int i15 = this.OooO0oo;
                int i16 = this.OooO00o;
                System.arraycopy(bArr10, 0, bArr11, i15 * i16, i16);
                this.f17812OooO0O0 >>>= this.OooO0OO;
            } else {
                return;
            }
        } else if (i2 < 57) {
            long j4 = this.f17808OooO00o;
            if (j4 == 0) {
                this.f17812OooO0O0 = 0;
                this.OooO = 0;
                int i17 = this.OooO0o;
                int i18 = i17 % 8;
                int i19 = i17 >>> 3;
                int i20 = this.OooO00o;
                if (i19 < i20) {
                    if (i17 <= (i20 << 3) - i2) {
                        int i21 = i17 + i2;
                        this.OooO0o = i21;
                        i20 = (i21 + 7) >>> 3;
                    } else {
                        this.OooO0o = i17 + i2;
                    }
                    while (true) {
                        j = this.f17812OooO0O0;
                        if (i19 >= i20) {
                            break;
                        }
                        int i22 = this.OooO;
                        this.f17812OooO0O0 = j ^ ((long) ((this.f17813OooO0O0[i19] & 255) << (i22 << 3)));
                        this.OooO = i22 + 1;
                        i19++;
                    }
                    long j5 = j >>> i18;
                    this.f17812OooO0O0 = j5;
                    this.f17808OooO00o = j5 & ((long) this.OooO0o0);
                } else {
                    int i23 = this.OooOO0O;
                    this.f17808OooO00o = (long) (this.OooO0o0 & i23);
                    this.OooOO0O = i23 >>> i2;
                }
                this.f17811OooO00o = this.f17809OooO00o.m17248OooO00o(this.f17815OooO0Oo);
            } else if (j4 > 0) {
                AbstractC6436l11LI r03 = this.f17810OooO00o;
                byte[] bArr12 = this.f17811OooO00o;
                r03.update(bArr12, 0, bArr12.length);
                byte[] bArr13 = new byte[this.f17810OooO00o.OooO0O0()];
                this.f17811OooO00o = bArr13;
                this.f17810OooO00o.OooO00o(bArr13, 0);
                this.f17808OooO00o--;
            }
            if (this.f17808OooO00o == 0) {
                byte[] bArr14 = this.f17811OooO00o;
                byte[] bArr15 = this.f17814OooO0OO;
                int i24 = this.OooO0oo;
                int i25 = this.OooO00o;
                System.arraycopy(bArr14, 0, bArr15, i24 * i25, i25);
            } else {
                return;
            }
        } else {
            return;
        }
        this.OooO0oo++;
    }

    public int OooO00o(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    public void OooO00o(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        this.f17813OooO0O0 = new byte[this.OooO00o];
        this.f17810OooO00o.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.f17810OooO00o.OooO0O0()];
        this.f17813OooO0O0 = bArr3;
        this.f17810OooO00o.OooO00o(bArr3, 0);
        int i3 = this.OooO00o;
        byte[] bArr4 = new byte[i3];
        System.arraycopy(this.f17813OooO0O0, 0, bArr4, 0, i3);
        int OooO00o2 = OooO00o((this.OooO0Oo << this.OooO0OO) + 1);
        int i4 = this.OooO0OO;
        int i5 = 8;
        if (8 % i4 == 0) {
            int i6 = 8 / i4;
            i = 0;
            for (int i7 = 0; i7 < this.OooO00o; i7++) {
                for (int i8 = 0; i8 < i6; i8++) {
                    i += bArr4[i7] & this.OooO0o0;
                    bArr4[i7] = (byte) (bArr4[i7] >>> this.OooO0OO);
                }
            }
            int i9 = (this.OooO0Oo << this.OooO0OO) - i;
            this.OooOO0O = i9;
            int i10 = 0;
            while (i10 < OooO00o2) {
                i += this.OooO0o0 & i9;
                int i11 = this.OooO0OO;
                i9 >>>= i11;
                i10 += i11;
            }
        } else if (i4 < 8) {
            int i12 = this.OooO00o / i4;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < i12) {
                long j = 0;
                for (int i16 = 0; i16 < this.OooO0OO; i16++) {
                    j ^= (long) ((bArr4[i14] & 255) << (i16 << 3));
                    i14++;
                }
                int i17 = 0;
                while (i17 < i5) {
                    i15 += (int) (((long) this.OooO0o0) & j);
                    j >>>= this.OooO0OO;
                    i17++;
                    i12 = i12;
                    i5 = 8;
                }
                i13++;
                i5 = 8;
            }
            int i18 = this.OooO00o % this.OooO0OO;
            long j2 = 0;
            for (int i19 = 0; i19 < i18; i19++) {
                j2 ^= (long) ((bArr4[i14] & 255) << (i19 << 3));
                i14++;
            }
            int i20 = i18 << 3;
            int i21 = 0;
            while (i21 < i20) {
                i15 += (int) (((long) this.OooO0o0) & j2);
                int i22 = this.OooO0OO;
                j2 >>>= i22;
                i21 += i22;
            }
            int i23 = (this.OooO0Oo << this.OooO0OO) - i15;
            this.OooOO0O = i23;
            i = i15;
            int i24 = 0;
            while (i24 < OooO00o2) {
                i += this.OooO0o0 & i23;
                int i25 = this.OooO0OO;
                i23 >>>= i25;
                i24 += i25;
            }
        } else if (i4 < 57) {
            int i26 = 0;
            int i27 = 0;
            while (true) {
                i2 = this.OooO00o;
                int i28 = this.OooO0OO;
                if (i26 > (i2 << 3) - i28) {
                    break;
                }
                int i29 = i26 % 8;
                i26 += i28;
                int i30 = (i26 + 7) >>> 3;
                long j3 = 0;
                int i31 = 0;
                for (int i32 = i26 >>> 3; i32 < i30; i32++) {
                    j3 ^= (long) ((bArr4[i32] & 255) << (i31 << 3));
                    i31++;
                }
                i27 = (int) (((long) i27) + ((j3 >>> i29) & ((long) this.OooO0o0)));
            }
            int i33 = i26 >>> 3;
            if (i33 < i2) {
                int i34 = i26 % 8;
                int i35 = 0;
                long j4 = 0;
                while (i33 < this.OooO00o) {
                    j4 ^= (long) ((bArr4[i33] & 255) << (i35 << 3));
                    i35++;
                    i33++;
                }
                i27 = (int) (((long) i27) + ((j4 >>> i34) & ((long) this.OooO0o0)));
            }
            int i36 = (this.OooO0Oo << this.OooO0OO) - i27;
            this.OooOO0O = i36;
            i = i27;
            int i37 = 0;
            while (i37 < OooO00o2) {
                i += this.OooO0o0 & i36;
                int i38 = this.OooO0OO;
                i36 >>>= i38;
                i37 += i38;
            }
        } else {
            i = 0;
        }
        int i39 = this.OooO0Oo;
        double d = (double) OooO00o2;
        double d2 = (double) this.OooO0OO;
        Double.isNaN(d);
        Double.isNaN(d2);
        int ceil = i39 + ((int) Math.ceil(d / d2));
        this.OooO0O0 = ceil;
        double d3 = (double) (ceil + i);
        double d4 = (double) (1 << this.OooOO0o);
        Double.isNaN(d3);
        Double.isNaN(d4);
        this.OooOO0 = (int) Math.ceil(d3 / d4);
        int i40 = this.OooO0O0;
        int i41 = this.OooO00o;
        this.f17814OooO0OO = new byte[(i40 * i41)];
        this.OooO0oo = 0;
        this.OooO0oO = 0;
        this.OooO = 0;
        this.f17808OooO00o = 0;
        this.OooO0o = 0;
        this.f17811OooO00o = new byte[i41];
        byte[] bArr5 = new byte[i41];
        this.f17815OooO0Oo = bArr5;
        System.arraycopy(bArr, 0, bArr5, 0, i41);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17182OooO00o() {
        for (int i = 0; i < this.OooOO0; i++) {
            if (this.OooO0oo < this.OooO0O0) {
                OooO00o();
            }
            if (this.OooO0oo == this.OooO0O0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17183OooO00o() {
        return this.f17814OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m17184OooO00o() {
        return new int[]{this.OooO0oo, this.OooO0oO, this.OooO, this.OooO0o, this.OooOO0, this.OooO0O0, this.OooOO0o, this.OooO0OO, this.OooOO0O};
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[][] m17185OooO00o() {
        int[] iArr = new int[2];
        iArr[1] = this.OooO00o;
        iArr[0] = 5;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        bArr[0] = this.f17811OooO00o;
        bArr[1] = this.f17815OooO0Oo;
        bArr[2] = this.f17813OooO0O0;
        bArr[3] = this.f17814OooO0OO;
        bArr[4] = OooO0O0();
        return bArr;
    }

    public byte[] OooO0O0() {
        long j = this.f17808OooO00o;
        long j2 = this.f17812OooO0O0;
        return new byte[]{(byte) ((int) (j & 255)), (byte) ((int) ((j >> 8) & 255)), (byte) ((int) ((j >> 16) & 255)), (byte) ((int) ((j >> 24) & 255)), (byte) ((int) ((j >> 32) & 255)), (byte) ((int) ((j >> 40) & 255)), (byte) ((int) ((j >> 48) & 255)), (byte) ((int) ((j >> 56) & 255)), (byte) ((int) (j2 & 255)), (byte) ((int) ((j2 >> 8) & 255)), (byte) ((int) ((j2 >> 16) & 255)), (byte) ((int) ((j2 >> 24) & 255)), (byte) ((int) ((j2 >> 32) & 255)), (byte) ((int) ((j2 >> 40) & 255)), (byte) ((int) ((j2 >> 48) & 255)), (byte) ((int) ((j2 >> 56) & 255))};
    }

    public String toString() {
        String str = "" + this.f17812OooO0O0 + GlideException.OooO00o.o0ooOoO;
        int[] OooO00o2 = m17184OooO00o();
        int[] iArr = new int[2];
        iArr[1] = this.OooO00o;
        iArr[0] = 5;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        byte[][] OooO00o3 = m17185OooO00o();
        for (int i = 0; i < 9; i++) {
            str = str + OooO00o2[i] + " ";
        }
        for (int i2 = 0; i2 < 5; i2++) {
            str = str + new String(C6472l1l1l.OooO0O0(OooO00o3[i2])) + " ";
        }
        return str;
    }
}
