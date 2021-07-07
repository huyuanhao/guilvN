package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Lii丨II丨  reason: invalid class name and case insensitive filesystem */
public class C5735LiiII {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f16637OooO00o;

    public C5735LiiII(AbstractC6436l11LI r1, int i) {
        this.OooO00o = i;
        this.f16637OooO00o = r1;
    }

    public int OooO00o() {
        int OooO0O0 = this.f16637OooO00o.OooO0O0();
        int i = this.OooO00o;
        int i2 = ((OooO0O0 << 3) + (i - 1)) / i;
        int OooO00o2 = OooO00o((i2 << i) + 1);
        int i3 = this.OooO00o;
        return OooO0O0 * (i2 + (((OooO00o2 + i3) - 1) / i3));
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

    public byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        int i;
        byte[] bArr3 = bArr2;
        int OooO0O0 = this.f16637OooO00o.OooO0O0();
        byte[] bArr4 = new byte[OooO0O0];
        int i2 = 0;
        this.f16637OooO00o.update(bArr, 0, bArr.length);
        int OooO0O02 = this.f16637OooO00o.OooO0O0();
        byte[] bArr5 = new byte[OooO0O02];
        this.f16637OooO00o.OooO00o(bArr5, 0);
        int i3 = OooO0O0 << 3;
        int i4 = this.OooO00o;
        int i5 = ((i4 - 1) + i3) / i4;
        int OooO00o2 = OooO00o((i5 << i4) + 1);
        int i6 = this.OooO00o;
        int i7 = ((((OooO00o2 + i6) - 1) / i6) + i5) * OooO0O0;
        if (i7 != bArr3.length) {
            return null;
        }
        byte[] bArr6 = new byte[i7];
        int i8 = 8;
        if (8 % i6 == 0) {
            int i9 = 8 / i6;
            int i10 = (1 << i6) - 1;
            byte[] bArr7 = new byte[OooO0O0];
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < OooO0O02) {
                while (i2 < i9) {
                    int i14 = bArr5[i11] & i10;
                    i12 += i14;
                    int i15 = i13 * OooO0O0;
                    System.arraycopy(bArr3, i15, bArr7, 0, OooO0O0);
                    int i16 = i14;
                    while (i16 < i10) {
                        this.f16637OooO00o.update(bArr7, 0, bArr7.length);
                        bArr7 = new byte[this.f16637OooO00o.OooO0O0()];
                        this.f16637OooO00o.OooO00o(bArr7, 0);
                        i16++;
                        i12 = i12;
                        i7 = i7;
                    }
                    System.arraycopy(bArr7, 0, bArr6, i15, OooO0O0);
                    bArr5[i11] = (byte) (bArr5[i11] >>> this.OooO00o);
                    i13++;
                    i2++;
                    OooO0O02 = OooO0O02;
                    bArr3 = bArr2;
                    i9 = i9;
                }
                i11++;
                bArr3 = bArr2;
                i2 = 0;
            }
            i = i7;
            int i17 = (i5 << this.OooO00o) - i12;
            int i18 = 0;
            while (i18 < OooO00o2) {
                int i19 = i13 * OooO0O0;
                System.arraycopy(bArr2, i19, bArr7, 0, OooO0O0);
                for (int i20 = i17 & i10; i20 < i10; i20++) {
                    this.f16637OooO00o.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.f16637OooO00o.OooO0O0()];
                    this.f16637OooO00o.OooO00o(bArr7, 0);
                }
                System.arraycopy(bArr7, 0, bArr6, i19, OooO0O0);
                int i21 = this.OooO00o;
                i17 >>>= i21;
                i13++;
                i18 += i21;
            }
        } else {
            i = i7;
            if (i6 < 8) {
                int i22 = OooO0O0 / i6;
                int i23 = (1 << i6) - 1;
                byte[] bArr8 = new byte[OooO0O0];
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                while (i24 < i22) {
                    int i28 = 0;
                    long j = 0;
                    while (i28 < this.OooO00o) {
                        j ^= (long) ((bArr5[i25] & 255) << (i28 << 3));
                        i25++;
                        i28++;
                        bArr8 = bArr8;
                    }
                    int i29 = 0;
                    while (i29 < i8) {
                        int i30 = (int) (j & ((long) i23));
                        i26 += i30;
                        int i31 = i27 * OooO0O0;
                        System.arraycopy(bArr3, i31, bArr8, 0, OooO0O0);
                        while (i30 < i23) {
                            this.f16637OooO00o.update(bArr8, 0, bArr8.length);
                            bArr8 = new byte[this.f16637OooO00o.OooO0O0()];
                            this.f16637OooO00o.OooO00o(bArr8, 0);
                            i30++;
                            i22 = i22;
                            i25 = i25;
                        }
                        System.arraycopy(bArr8, 0, bArr6, i31, OooO0O0);
                        j >>>= this.OooO00o;
                        i27++;
                        i29++;
                        i24 = i24;
                        i8 = 8;
                    }
                    i24++;
                    i8 = 8;
                }
                int i32 = OooO0O0 % this.OooO00o;
                long j2 = 0;
                for (int i33 = 0; i33 < i32; i33++) {
                    j2 ^= (long) ((bArr5[i25] & 255) << (i33 << 3));
                    i25++;
                }
                int i34 = i32 << 3;
                byte[] bArr9 = bArr8;
                int i35 = 0;
                while (i35 < i34) {
                    int i36 = (int) (j2 & ((long) i23));
                    i26 += i36;
                    int i37 = i27 * OooO0O0;
                    System.arraycopy(bArr3, i37, bArr9, 0, OooO0O0);
                    while (i36 < i23) {
                        this.f16637OooO00o.update(bArr9, 0, bArr9.length);
                        bArr9 = new byte[this.f16637OooO00o.OooO0O0()];
                        this.f16637OooO00o.OooO00o(bArr9, 0);
                        i36++;
                    }
                    System.arraycopy(bArr9, 0, bArr6, i37, OooO0O0);
                    int i38 = this.OooO00o;
                    j2 >>>= i38;
                    i27++;
                    i35 += i38;
                }
                int i39 = (i5 << this.OooO00o) - i26;
                int i40 = 0;
                while (i40 < OooO00o2) {
                    int i41 = i27 * OooO0O0;
                    System.arraycopy(bArr3, i41, bArr9, 0, OooO0O0);
                    for (int i42 = i39 & i23; i42 < i23; i42++) {
                        this.f16637OooO00o.update(bArr9, 0, bArr9.length);
                        bArr9 = new byte[this.f16637OooO00o.OooO0O0()];
                        this.f16637OooO00o.OooO00o(bArr9, 0);
                    }
                    System.arraycopy(bArr9, 0, bArr6, i41, OooO0O0);
                    int i43 = this.OooO00o;
                    i39 >>>= i43;
                    i27++;
                    i40 += i43;
                }
            } else if (i6 < 57) {
                int i44 = i3 - i6;
                int i45 = (1 << i6) - 1;
                byte[] bArr10 = new byte[OooO0O0];
                int i46 = 0;
                int i47 = 0;
                int i48 = 0;
                while (i47 <= i44) {
                    int i49 = i47 >>> 3;
                    int i50 = i47 % 8;
                    int i51 = i47 + this.OooO00o;
                    int i52 = (i51 + 7) >>> 3;
                    int i53 = 0;
                    long j3 = 0;
                    while (i49 < i52) {
                        j3 ^= (long) ((bArr5[i49] & 255) << (i53 << 3));
                        i53++;
                        i49++;
                        i44 = i44;
                        OooO00o2 = OooO00o2;
                        i5 = i5;
                    }
                    long j4 = (long) i45;
                    long j5 = (j3 >>> i50) & j4;
                    int i54 = i51;
                    i48 = (int) (((long) i48) + j5);
                    int i55 = i46 * OooO0O0;
                    System.arraycopy(bArr3, i55, bArr10, 0, OooO0O0);
                    while (j5 < j4) {
                        this.f16637OooO00o.update(bArr10, 0, bArr10.length);
                        bArr10 = new byte[this.f16637OooO00o.OooO0O0()];
                        this.f16637OooO00o.OooO00o(bArr10, 0);
                        j5++;
                        i54 = i54;
                        i48 = i48;
                    }
                    System.arraycopy(bArr10, 0, bArr6, i55, OooO0O0);
                    i46++;
                    i47 = i54;
                    i44 = i44;
                    OooO00o2 = OooO00o2;
                    i5 = i5;
                }
                int i56 = i47 >>> 3;
                if (i56 < OooO0O0) {
                    int i57 = i47 % 8;
                    int i58 = 0;
                    long j6 = 0;
                    while (i56 < OooO0O0) {
                        j6 ^= (long) ((bArr5[i56] & 255) << (i58 << 3));
                        i58++;
                        i56++;
                    }
                    long j7 = (long) i45;
                    long j8 = (j6 >>> i57) & j7;
                    i48 = (int) (((long) i48) + j8);
                    int i59 = i46 * OooO0O0;
                    System.arraycopy(bArr3, i59, bArr10, 0, OooO0O0);
                    while (j8 < j7) {
                        this.f16637OooO00o.update(bArr10, 0, bArr10.length);
                        bArr10 = new byte[this.f16637OooO00o.OooO0O0()];
                        this.f16637OooO00o.OooO00o(bArr10, 0);
                        j8++;
                    }
                    System.arraycopy(bArr10, 0, bArr6, i59, OooO0O0);
                    i46++;
                }
                int i60 = (i5 << this.OooO00o) - i48;
                int i61 = 0;
                while (i61 < OooO00o2) {
                    int i62 = i46 * OooO0O0;
                    System.arraycopy(bArr3, i62, bArr10, 0, OooO0O0);
                    for (long j9 = (long) (i60 & i45); j9 < ((long) i45); j9++) {
                        this.f16637OooO00o.update(bArr10, 0, bArr10.length);
                        bArr10 = new byte[this.f16637OooO00o.OooO0O0()];
                        this.f16637OooO00o.OooO00o(bArr10, 0);
                    }
                    System.arraycopy(bArr10, 0, bArr6, i62, OooO0O0);
                    int i63 = this.OooO00o;
                    i60 >>>= i63;
                    i46++;
                    i61 += i63;
                }
            }
        }
        byte[] bArr11 = new byte[OooO0O0];
        this.f16637OooO00o.update(bArr6, 0, i);
        byte[] bArr12 = new byte[this.f16637OooO00o.OooO0O0()];
        this.f16637OooO00o.OooO00o(bArr12, 0);
        return bArr12;
    }
}
