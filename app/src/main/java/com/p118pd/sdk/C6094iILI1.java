package com.p118pd.sdk;

import java.lang.reflect.Array;

/* renamed from: com.pd.sdk.iILI丨丨丨1  reason: invalid class name and case insensitive filesystem */
public class C6094iILI1 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6237iiL f17510OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f17511OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[][] f17512OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o0;

    public C6094iILI1(byte[] bArr, AbstractC6436l11LI r8, int i) {
        this.OooO0OO = i;
        this.f17511OooO00o = r8;
        this.f17510OooO00o = new C6237iiL(r8);
        int OooO0O02 = this.f17511OooO00o.OooO0O0();
        this.OooO00o = OooO0O02;
        double d = (double) (OooO0O02 << 3);
        double d2 = (double) i;
        Double.isNaN(d);
        Double.isNaN(d2);
        int ceil = (int) Math.ceil(d / d2);
        this.OooO0Oo = ceil;
        int OooO00o2 = OooO00o((ceil << i) + 1);
        this.OooO0o0 = OooO00o2;
        int i2 = this.OooO0Oo;
        double d3 = (double) OooO00o2;
        Double.isNaN(d3);
        Double.isNaN(d2);
        int ceil2 = i2 + ((int) Math.ceil(d3 / d2));
        this.OooO0O0 = ceil2;
        int[] iArr = new int[2];
        iArr[1] = this.OooO00o;
        iArr[0] = ceil2;
        this.f17512OooO00o = (byte[][]) Array.newInstance(byte.class, iArr);
        int i3 = this.OooO00o;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        for (int i4 = 0; i4 < this.OooO0O0; i4++) {
            this.f17512OooO00o[i4] = this.f17510OooO00o.m17248OooO00o(bArr2);
        }
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

    public byte[] OooO00o() {
        int i = this.OooO0O0;
        int i2 = this.OooO00o;
        int i3 = i * i2;
        byte[] bArr = new byte[i3];
        byte[] bArr2 = new byte[i2];
        int i4 = 1 << this.OooO0OO;
        for (int i5 = 0; i5 < this.OooO0O0; i5++) {
            AbstractC6436l11LI r5 = this.f17511OooO00o;
            byte[][] bArr3 = this.f17512OooO00o;
            r5.update(bArr3[i5], 0, bArr3[i5].length);
            byte[] bArr4 = new byte[this.f17511OooO00o.OooO0O0()];
            this.f17511OooO00o.OooO00o(bArr4, 0);
            for (int i6 = 2; i6 < i4; i6++) {
                this.f17511OooO00o.update(bArr4, 0, bArr4.length);
                bArr4 = new byte[this.f17511OooO00o.OooO0O0()];
                this.f17511OooO00o.OooO00o(bArr4, 0);
            }
            int i7 = this.OooO00o;
            System.arraycopy(bArr4, 0, bArr, i7 * i5, i7);
        }
        this.f17511OooO00o.update(bArr, 0, i3);
        byte[] bArr5 = new byte[this.f17511OooO00o.OooO0O0()];
        this.f17511OooO00o.OooO00o(bArr5, 0);
        return bArr5;
    }

    public byte[] OooO00o(byte[] bArr) {
        int i;
        int i2 = this.OooO0O0;
        int i3 = this.OooO00o;
        byte[] bArr2 = new byte[(i2 * i3)];
        byte[] bArr3 = new byte[i3];
        this.f17511OooO00o.update(bArr, 0, bArr.length);
        int OooO0O02 = this.f17511OooO00o.OooO0O0();
        byte[] bArr4 = new byte[OooO0O02];
        this.f17511OooO00o.OooO00o(bArr4, 0);
        int i4 = this.OooO0OO;
        int i5 = 8;
        if (8 % i4 == 0) {
            int i6 = 8 / i4;
            int i7 = (1 << i4) - 1;
            byte[] bArr5 = new byte[this.OooO00o];
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < OooO0O02; i10++) {
                for (int i11 = 0; i11 < i6; i11++) {
                    int i12 = bArr4[i10] & i7;
                    i8 += i12;
                    System.arraycopy(this.f17512OooO00o[i9], 0, bArr5, 0, this.OooO00o);
                    while (i12 > 0) {
                        this.f17511OooO00o.update(bArr5, 0, bArr5.length);
                        bArr5 = new byte[this.f17511OooO00o.OooO0O0()];
                        this.f17511OooO00o.OooO00o(bArr5, 0);
                        i12--;
                    }
                    int i13 = this.OooO00o;
                    System.arraycopy(bArr5, 0, bArr2, i9 * i13, i13);
                    bArr4[i10] = (byte) (bArr4[i10] >>> this.OooO0OO);
                    i9++;
                }
            }
            int i14 = (this.OooO0Oo << this.OooO0OO) - i8;
            int i15 = 0;
            while (i15 < this.OooO0o0) {
                System.arraycopy(this.f17512OooO00o[i9], 0, bArr5, 0, this.OooO00o);
                for (int i16 = i14 & i7; i16 > 0; i16--) {
                    this.f17511OooO00o.update(bArr5, 0, bArr5.length);
                    bArr5 = new byte[this.f17511OooO00o.OooO0O0()];
                    this.f17511OooO00o.OooO00o(bArr5, 0);
                }
                int i17 = this.OooO00o;
                System.arraycopy(bArr5, 0, bArr2, i9 * i17, i17);
                int i18 = this.OooO0OO;
                i14 >>>= i18;
                i9++;
                i15 += i18;
            }
        } else if (i4 < 8) {
            int i19 = this.OooO00o;
            int i20 = i19 / i4;
            int i21 = (1 << i4) - 1;
            byte[] bArr6 = new byte[i19];
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (i22 < i20) {
                long j = 0;
                for (int i26 = 0; i26 < this.OooO0OO; i26++) {
                    j ^= (long) ((bArr4[i23] & 255) << (i26 << 3));
                    i23++;
                }
                int i27 = 0;
                while (i27 < i5) {
                    int i28 = (int) (j & ((long) i21));
                    i25 += i28;
                    System.arraycopy(this.f17512OooO00o[i24], 0, bArr6, 0, this.OooO00o);
                    while (i28 > 0) {
                        this.f17511OooO00o.update(bArr6, 0, bArr6.length);
                        bArr6 = new byte[this.f17511OooO00o.OooO0O0()];
                        this.f17511OooO00o.OooO00o(bArr6, 0);
                        i28--;
                    }
                    int i29 = this.OooO00o;
                    System.arraycopy(bArr6, 0, bArr2, i24 * i29, i29);
                    j >>>= this.OooO0OO;
                    i24++;
                    i27++;
                    i20 = i20;
                    i5 = 8;
                }
                i22++;
                i5 = 8;
            }
            int i30 = this.OooO00o % this.OooO0OO;
            int i31 = 0;
            long j2 = 0;
            while (i31 < i30) {
                j2 ^= (long) ((bArr4[i23] & 255) << (i31 << 3));
                i23++;
                i31++;
                i30 = i30;
            }
            int i32 = i30 << 3;
            int i33 = 0;
            while (i33 < i32) {
                int i34 = (int) (((long) i21) & j2);
                i25 += i34;
                System.arraycopy(this.f17512OooO00o[i24], 0, bArr6, 0, this.OooO00o);
                while (i34 > 0) {
                    this.f17511OooO00o.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[this.f17511OooO00o.OooO0O0()];
                    this.f17511OooO00o.OooO00o(bArr6, 0);
                    i34--;
                }
                int i35 = this.OooO00o;
                System.arraycopy(bArr6, 0, bArr2, i24 * i35, i35);
                int i36 = this.OooO0OO;
                j2 >>>= i36;
                i24++;
                i33 += i36;
            }
            int i37 = (this.OooO0Oo << this.OooO0OO) - i25;
            int i38 = 0;
            while (i38 < this.OooO0o0) {
                System.arraycopy(this.f17512OooO00o[i24], 0, bArr6, 0, this.OooO00o);
                for (int i39 = i37 & i21; i39 > 0; i39--) {
                    this.f17511OooO00o.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[this.f17511OooO00o.OooO0O0()];
                    this.f17511OooO00o.OooO00o(bArr6, 0);
                }
                int i40 = this.OooO00o;
                System.arraycopy(bArr6, 0, bArr2, i24 * i40, i40);
                int i41 = this.OooO0OO;
                i37 >>>= i41;
                i24++;
                i38 += i41;
            }
        } else if (i4 < 57) {
            int i42 = this.OooO00o;
            int i43 = (i42 << 3) - i4;
            int i44 = (1 << i4) - 1;
            byte[] bArr7 = new byte[i42];
            int i45 = 0;
            int i46 = 0;
            int i47 = 0;
            while (i46 <= i43) {
                int i48 = i46 % 8;
                i46 += this.OooO0OO;
                int i49 = (i46 + 7) >>> 3;
                int i50 = 0;
                long j3 = 0;
                for (int i51 = i46 >>> 3; i51 < i49; i51++) {
                    j3 ^= (long) ((bArr4[i51] & 255) << (i50 << 3));
                    i50++;
                }
                long j4 = (j3 >>> i48) & ((long) i44);
                i45 = (int) (((long) i45) + j4);
                System.arraycopy(this.f17512OooO00o[i47], 0, bArr7, 0, this.OooO00o);
                while (j4 > 0) {
                    this.f17511OooO00o.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.f17511OooO00o.OooO0O0()];
                    this.f17511OooO00o.OooO00o(bArr7, 0);
                    j4--;
                }
                int i52 = this.OooO00o;
                System.arraycopy(bArr7, 0, bArr2, i47 * i52, i52);
                i47++;
            }
            int i53 = i46 >>> 3;
            if (i53 < this.OooO00o) {
                int i54 = i46 % 8;
                int i55 = 0;
                long j5 = 0;
                while (true) {
                    i = this.OooO00o;
                    if (i53 >= i) {
                        break;
                    }
                    j5 ^= (long) ((bArr4[i53] & 255) << (i55 << 3));
                    i55++;
                    i53++;
                }
                long j6 = (j5 >>> i54) & ((long) i44);
                i45 = (int) (((long) i45) + j6);
                System.arraycopy(this.f17512OooO00o[i47], 0, bArr7, 0, i);
                while (j6 > 0) {
                    this.f17511OooO00o.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.f17511OooO00o.OooO0O0()];
                    this.f17511OooO00o.OooO00o(bArr7, 0);
                    j6--;
                }
                int i56 = this.OooO00o;
                System.arraycopy(bArr7, 0, bArr2, i47 * i56, i56);
                i47++;
            }
            int i57 = (this.OooO0Oo << this.OooO0OO) - i45;
            int i58 = i47;
            int i59 = 0;
            while (i59 < this.OooO0o0) {
                System.arraycopy(this.f17512OooO00o[i58], 0, bArr7, 0, this.OooO00o);
                for (long j7 = (long) (i57 & i44); j7 > 0; j7--) {
                    this.f17511OooO00o.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.f17511OooO00o.OooO0O0()];
                    this.f17511OooO00o.OooO00o(bArr7, 0);
                }
                int i60 = this.OooO00o;
                System.arraycopy(bArr7, 0, bArr2, i58 * i60, i60);
                int i61 = this.OooO0OO;
                i57 >>>= i61;
                i58++;
                i59 += i61;
            }
        }
        return bArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[][] m16961OooO00o() {
        return this.f17512OooO00o;
    }
}
