package com.p118pd.sdk;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.llILLI丨1  reason: invalid class name */
public class llILLI1 extends AbstractC6339ill {
    public int[][] OooO00o;
    public int OooO0OO;

    public llILLI1(int i, char c) {
        this(i, c, new SecureRandom());
    }

    public llILLI1(int i, char c, SecureRandom secureRandom) {
        if (i <= 0) {
            throw new ArithmeticException("Size of matrix is non-positive.");
        } else if (c == 'I') {
            OooO00o(i);
        } else if (c == 'L') {
            OooO00o(i, secureRandom);
        } else if (c == 'R') {
            OooO0O0(i, secureRandom);
        } else if (c == 'U') {
            OooO0OO(i, secureRandom);
        } else if (c == 'Z') {
            OooO00o(i, i);
        } else {
            throw new ArithmeticException("Unknown matrix type.");
        }
    }

    public llILLI1(int i, int i2) {
        if (i2 <= 0 || i <= 0) {
            throw new ArithmeticException("size of matrix is non-positive");
        }
        OooO00o(i, i2);
    }

    public llILLI1(int i, int[][] iArr) {
        if (iArr[0].length == ((i + 31) >> 5)) {
            this.f18083OooO0O0 = i;
            super.f18082OooO00o = iArr.length;
            this.OooO0OO = iArr[0].length;
            int i2 = i & 31;
            int i3 = i2 == 0 ? -1 : (1 << i2) - 1;
            for (int i4 = 0; i4 < super.f18082OooO00o; i4++) {
                int[] iArr2 = iArr[i4];
                int i5 = this.OooO0OO - 1;
                iArr2[i5] = iArr2[i5] & i3;
            }
            this.OooO00o = iArr;
            return;
        }
        throw new ArithmeticException("Int array does not match given number of columns.");
    }

    public llILLI1(llILLI1 r4) {
        this.f18083OooO0O0 = r4.OooO00o();
        super.f18082OooO00o = r4.OooO0O0();
        this.OooO0OO = r4.OooO0OO;
        this.OooO00o = new int[r4.OooO00o.length][];
        int i = 0;
        while (true) {
            int[][] iArr = this.OooO00o;
            if (i < iArr.length) {
                iArr[i] = lllILI.m17914OooO00o(r4.OooO00o[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public llILLI1(byte[] bArr) {
        if (bArr.length >= 9) {
            super.f18082OooO00o = IlIl11.OooO00o(bArr, 0);
            int OooO00o2 = IlIl11.OooO00o(bArr, 4);
            this.f18083OooO0O0 = OooO00o2;
            int i = super.f18082OooO00o;
            int i2 = ((OooO00o2 + 7) >>> 3) * i;
            if (i > 0) {
                int i3 = 8;
                if (i2 == bArr.length - 8) {
                    int i4 = (OooO00o2 + 31) >>> 5;
                    this.OooO0OO = i4;
                    int[] iArr = new int[2];
                    iArr[1] = i4;
                    iArr[0] = i;
                    this.OooO00o = (int[][]) Array.newInstance(int.class, iArr);
                    int i5 = this.f18083OooO0O0;
                    int i6 = i5 >> 5;
                    int i7 = i5 & 31;
                    for (int i8 = 0; i8 < super.f18082OooO00o; i8++) {
                        int i9 = 0;
                        while (i9 < i6) {
                            this.OooO00o[i8][i9] = IlIl11.OooO00o(bArr, i3);
                            i9++;
                            i3 += 4;
                        }
                        int i10 = 0;
                        while (i10 < i7) {
                            int[] iArr2 = this.OooO00o[i8];
                            iArr2[i6] = ((bArr[i3] & 255) << i10) ^ iArr2[i6];
                            i10 += 8;
                            i3++;
                        }
                    }
                    return;
                }
            }
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }

    private void OooO00o(int i) {
        super.f18082OooO00o = i;
        this.f18083OooO0O0 = i;
        int i2 = (i + 31) >>> 5;
        this.OooO0OO = i2;
        int[] iArr = new int[2];
        iArr[1] = i2;
        iArr[0] = i;
        this.OooO00o = (int[][]) Array.newInstance(int.class, iArr);
        for (int i3 = 0; i3 < super.f18082OooO00o; i3++) {
            for (int i4 = 0; i4 < this.OooO0OO; i4++) {
                this.OooO00o[i3][i4] = 0;
            }
        }
        for (int i5 = 0; i5 < super.f18082OooO00o; i5++) {
            this.OooO00o[i5][i5 >>> 5] = 1 << (i5 & 31);
        }
    }

    private void OooO00o(int i, int i2) {
        super.f18082OooO00o = i;
        this.f18083OooO0O0 = i2;
        int i3 = (i2 + 31) >>> 5;
        this.OooO0OO = i3;
        int[] iArr = new int[2];
        iArr[1] = i3;
        iArr[0] = i;
        this.OooO00o = (int[][]) Array.newInstance(int.class, iArr);
        for (int i4 = 0; i4 < super.f18082OooO00o; i4++) {
            for (int i5 = 0; i5 < this.OooO0OO; i5++) {
                this.OooO00o[i4][i5] = 0;
            }
        }
    }

    private void OooO00o(int i, SecureRandom secureRandom) {
        super.f18082OooO00o = i;
        this.f18083OooO0O0 = i;
        int i2 = (i + 31) >>> 5;
        this.OooO0OO = i2;
        int[] iArr = new int[2];
        iArr[1] = i2;
        iArr[0] = i;
        this.OooO00o = (int[][]) Array.newInstance(int.class, iArr);
        for (int i3 = 0; i3 < super.f18082OooO00o; i3++) {
            int i4 = i3 >>> 5;
            int i5 = i3 & 31;
            int i6 = 31 - i5;
            int i7 = 1 << i5;
            for (int i8 = 0; i8 < i4; i8++) {
                this.OooO00o[i3][i8] = secureRandom.nextInt();
            }
            this.OooO00o[i3][i4] = i7 | (secureRandom.nextInt() >>> i6);
            while (true) {
                i4++;
                if (i4 >= this.OooO0OO) {
                    break;
                }
                this.OooO00o[i3][i4] = 0;
            }
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int i) {
        for (int length = iArr2.length - 1; length >= i; length--) {
            iArr2[length] = iArr[length] ^ iArr2[length];
        }
    }

    public static void OooO00o(int[][] iArr, int i, int i2) {
        int[] iArr2 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = iArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static llILLI1[] m17855OooO00o(int i, SecureRandom secureRandom) {
        llILLI1[] r3 = new llILLI1[2];
        int i2 = (i + 31) >> 5;
        llILLI1 r5 = new llILLI1(i, AbstractC6339ill.OooO0OO, secureRandom);
        llILLI1 r6 = new llILLI1(i, AbstractC6339ill.OooO0Oo, secureRandom);
        llILLI1 r7 = (llILLI1) r5.OooO00o(r6);
        C6051i1lli i1lli = new C6051i1lli(i, secureRandom);
        int[] OooO00o2 = i1lli.m16915OooO00o();
        int[] iArr = new int[2];
        iArr[1] = i2;
        iArr[0] = i;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        for (int i3 = 0; i3 < i; i3++) {
            System.arraycopy(r7.OooO00o[OooO00o2[i3]], 0, iArr2[i3], 0, i2);
        }
        r3[0] = new llILLI1(i, iArr2);
        llILLI1 r1 = new llILLI1(i, 'I');
        int i4 = 0;
        while (i4 < i) {
            int i5 = i4 >>> 5;
            int i6 = 1 << (i4 & 31);
            int i7 = i4 + 1;
            for (int i8 = i7; i8 < i; i8++) {
                if ((r5.OooO00o[i8][i5] & i6) != 0) {
                    for (int i9 = 0; i9 <= i5; i9++) {
                        int[][] iArr3 = r1.OooO00o;
                        int[] iArr4 = iArr3[i8];
                        iArr4[i9] = iArr4[i9] ^ iArr3[i4][i9];
                    }
                }
            }
            i4 = i7;
        }
        llILLI1 r52 = new llILLI1(i, 'I');
        for (int i10 = i - 1; i10 >= 0; i10--) {
            int i11 = i10 >>> 5;
            int i12 = 1 << (i10 & 31);
            for (int i13 = i10 - 1; i13 >= 0; i13--) {
                if ((r6.OooO00o[i13][i11] & i12) != 0) {
                    for (int i14 = i11; i14 < i2; i14++) {
                        int[][] iArr5 = r52.OooO00o;
                        int[] iArr6 = iArr5[i13];
                        iArr6[i14] = iArr5[i10][i14] ^ iArr6[i14];
                    }
                }
            }
        }
        r3[1] = (llILLI1) r52.OooO00o(r1.OooO00o(i1lli));
        return r3;
    }

    private void OooO0O0(int i, SecureRandom secureRandom) {
        super.f18082OooO00o = i;
        this.f18083OooO0O0 = i;
        int i2 = (i + 31) >>> 5;
        this.OooO0OO = i2;
        int[] iArr = new int[2];
        iArr[1] = i2;
        iArr[0] = i;
        this.OooO00o = (int[][]) Array.newInstance(int.class, iArr);
        llILLI1 r1 = (llILLI1) new llILLI1(i, AbstractC6339ill.OooO0OO, secureRandom).OooO00o(new llILLI1(i, AbstractC6339ill.OooO0Oo, secureRandom));
        int[] OooO00o2 = new C6051i1lli(i, secureRandom).m16915OooO00o();
        for (int i3 = 0; i3 < i; i3++) {
            System.arraycopy(r1.OooO00o[i3], 0, this.OooO00o[OooO00o2[i3]], 0, this.OooO0OO);
        }
    }

    private void OooO0OO(int i, SecureRandom secureRandom) {
        int i2;
        super.f18082OooO00o = i;
        this.f18083OooO0O0 = i;
        int i3 = (i + 31) >>> 5;
        this.OooO0OO = i3;
        int[] iArr = new int[2];
        iArr[1] = i3;
        iArr[0] = i;
        this.OooO00o = (int[][]) Array.newInstance(int.class, iArr);
        int i4 = i & 31;
        int i5 = i4 == 0 ? -1 : (1 << i4) - 1;
        for (int i6 = 0; i6 < super.f18082OooO00o; i6++) {
            int i7 = i6 >>> 5;
            int i8 = i6 & 31;
            int i9 = 1 << i8;
            for (int i10 = 0; i10 < i7; i10++) {
                this.OooO00o[i6][i10] = 0;
            }
            this.OooO00o[i6][i7] = (secureRandom.nextInt() << i8) | i9;
            while (true) {
                i7++;
                i2 = this.OooO0OO;
                if (i7 >= i2) {
                    break;
                }
                this.OooO00o[i6][i7] = secureRandom.nextInt();
            }
            int[] iArr2 = this.OooO00o[i6];
            int i11 = i2 - 1;
            iArr2[i11] = iArr2[i11] & i5;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill
    public double OooO00o() {
        int i = this.f18083OooO0O0 & 31;
        int i2 = this.OooO0OO;
        if (i != 0) {
            i2--;
        }
        double d = AbstractC8352oOoOOoO0.OooO0O0;
        double d2 = 0.0d;
        for (int i3 = 0; i3 < super.f18082OooO00o; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.OooO00o[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    double d3 = (double) ((i5 >>> i6) & 1);
                    Double.isNaN(d3);
                    d += d3;
                    d2 += 1.0d;
                }
            }
            int i7 = this.OooO00o[i3][this.OooO0OO - 1];
            for (int i8 = 0; i8 < i; i8++) {
                double d4 = (double) ((i7 >>> i8) & 1);
                Double.isNaN(d4);
                d += d4;
                d2 += 1.0d;
            }
        }
        return d / d2;
    }

    @Override // com.p118pd.sdk.AbstractC6339ill
    public L1LL111 OooO00o(L1LL111 l1ll111) {
        if (!(l1ll111 instanceof l11ILi)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        } else if (l1ll111.OooO00o == super.f18082OooO00o) {
            int[] OooO00o2 = ((l11ILi) l1ll111).m17553OooO00o();
            int[] iArr = new int[this.OooO0OO];
            int i = super.f18082OooO00o;
            int i2 = i >> 5;
            int i3 = 1 << (i & 31);
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = 1;
                do {
                    if ((OooO00o2[i5] & i6) != 0) {
                        for (int i7 = 0; i7 < this.OooO0OO; i7++) {
                            iArr[i7] = iArr[i7] ^ this.OooO00o[i4][i7];
                        }
                    }
                    i4++;
                    i6 <<= 1;
                } while (i6 != 0);
            }
            for (int i8 = 1; i8 != i3; i8 <<= 1) {
                if ((OooO00o2[i2] & i8) != 0) {
                    for (int i9 = 0; i9 < this.OooO0OO; i9++) {
                        iArr[i9] = iArr[i9] ^ this.OooO00o[i4][i9];
                    }
                }
                i4++;
            }
            return new l11ILi(iArr, this.f18083OooO0O0);
        } else {
            throw new ArithmeticException("length mismatch");
        }
    }

    @Override // com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6339ill m17856OooO00o() {
        int i = super.f18082OooO00o;
        if (i == this.f18083OooO0O0) {
            int[] iArr = new int[2];
            iArr[1] = this.OooO0OO;
            iArr[0] = i;
            int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
            for (int i2 = super.f18082OooO00o - 1; i2 >= 0; i2--) {
                iArr2[i2] = lllILI.m17914OooO00o(this.OooO00o[i2]);
            }
            int i3 = super.f18082OooO00o;
            int[] iArr3 = new int[2];
            iArr3[1] = this.OooO0OO;
            iArr3[0] = i3;
            int[][] iArr4 = (int[][]) Array.newInstance(int.class, iArr3);
            for (int i4 = super.f18082OooO00o - 1; i4 >= 0; i4--) {
                iArr4[i4][i4 >> 5] = 1 << (i4 & 31);
            }
            for (int i5 = 0; i5 < super.f18082OooO00o; i5++) {
                int i6 = i5 >> 5;
                int i7 = 1 << (i5 & 31);
                if ((iArr2[i5][i6] & i7) == 0) {
                    int i8 = i5 + 1;
                    boolean z = false;
                    while (i8 < super.f18082OooO00o) {
                        if ((iArr2[i8][i6] & i7) != 0) {
                            OooO00o(iArr2, i5, i8);
                            OooO00o(iArr4, i5, i8);
                            i8 = super.f18082OooO00o;
                            z = true;
                        }
                        i8++;
                    }
                    if (!z) {
                        throw new ArithmeticException("Matrix is not invertible.");
                    }
                }
                for (int i9 = super.f18082OooO00o - 1; i9 >= 0; i9--) {
                    if (!(i9 == i5 || (iArr2[i9][i6] & i7) == 0)) {
                        OooO00o(iArr2[i5], iArr2[i9], i6);
                        OooO00o(iArr4[i5], iArr4[i9], 0);
                    }
                }
            }
            return new llILLI1(this.f18083OooO0O0, iArr4);
        }
        throw new ArithmeticException("Matrix is not invertible.");
    }

    @Override // com.p118pd.sdk.AbstractC6339ill
    public AbstractC6339ill OooO00o(C6051i1lli i1lli) {
        int[] OooO00o2 = i1lli.m16915OooO00o();
        int length = OooO00o2.length;
        int i = this.f18083OooO0O0;
        if (length == i) {
            llILLI1 r0 = new llILLI1(super.f18082OooO00o, i);
            for (int i2 = this.f18083OooO0O0 - 1; i2 >= 0; i2--) {
                int i3 = i2 >>> 5;
                int i4 = i2 & 31;
                int i5 = OooO00o2[i2] >>> 5;
                int i6 = OooO00o2[i2] & 31;
                for (int i7 = super.f18082OooO00o - 1; i7 >= 0; i7--) {
                    int[] iArr = r0.OooO00o[i7];
                    iArr[i3] = iArr[i3] | (((this.OooO00o[i7][i5] >>> i6) & 1) << i4);
                }
            }
            return r0;
        }
        throw new ArithmeticException("length mismatch");
    }

    @Override // com.p118pd.sdk.AbstractC6339ill
    public AbstractC6339ill OooO00o(AbstractC6339ill r15) {
        if (!(r15 instanceof llILLI1)) {
            throw new ArithmeticException("matrix is not defined over GF(2)");
        } else if (r15.f18082OooO00o == this.f18083OooO0O0) {
            llILLI1 r0 = (llILLI1) r15;
            llILLI1 r1 = new llILLI1(super.f18082OooO00o, r15.f18083OooO0O0);
            int i = this.f18083OooO0O0 & 31;
            int i2 = this.OooO0OO;
            if (i != 0) {
                i2--;
            }
            for (int i3 = 0; i3 < super.f18082OooO00o; i3++) {
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = this.OooO00o[i3][i5];
                    for (int i7 = 0; i7 < 32; i7++) {
                        if (((1 << i7) & i6) != 0) {
                            for (int i8 = 0; i8 < r0.OooO0OO; i8++) {
                                int[] iArr = r1.OooO00o[i3];
                                iArr[i8] = iArr[i8] ^ r0.OooO00o[i4][i8];
                            }
                        }
                        i4++;
                    }
                }
                int i9 = this.OooO00o[i3][this.OooO0OO - 1];
                for (int i10 = 0; i10 < i; i10++) {
                    if (((1 << i10) & i9) != 0) {
                        for (int i11 = 0; i11 < r0.OooO0OO; i11++) {
                            int[] iArr2 = r1.OooO00o[i3];
                            iArr2[i11] = iArr2[i11] ^ r0.OooO00o[i4][i11];
                        }
                    }
                    i4++;
                }
            }
            return r1;
        } else {
            throw new ArithmeticException("length mismatch");
        }
    }

    @Override // com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill
    /* renamed from: OooO00o  reason: collision with other method in class */
    public llILLI1 m17857OooO00o() {
        int i = this.f18083OooO0O0;
        int i2 = super.f18082OooO00o;
        llILLI1 r2 = new llILLI1(i2, i + i2);
        int i3 = super.f18082OooO00o;
        int i4 = (i3 - 1) + this.f18083OooO0O0;
        int i5 = i3 - 1;
        while (i5 >= 0) {
            System.arraycopy(this.OooO00o[i5], 0, r2.OooO00o[i5], 0, this.OooO0OO);
            int[] iArr = r2.OooO00o[i5];
            int i6 = i4 >> 5;
            iArr[i6] = iArr[i6] | (1 << (i4 & 31));
            i5--;
            i4--;
        }
        return r2;
    }

    @Override // com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17858OooO00o() {
        for (int i = 0; i < super.f18082OooO00o; i++) {
            for (int i2 = 0; i2 < this.OooO0OO; i2++) {
                if (this.OooO00o[i][i2] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17859OooO00o() {
        int i = super.f18082OooO00o;
        int i2 = 8;
        byte[] bArr = new byte[((((this.f18083OooO0O0 + 7) >>> 3) * i) + 8)];
        IlIl11.OooO00o(i, bArr, 0);
        IlIl11.OooO00o(this.f18083OooO0O0, bArr, 4);
        int i3 = this.f18083OooO0O0;
        int i4 = i3 >>> 5;
        int i5 = i3 & 31;
        for (int i6 = 0; i6 < super.f18082OooO00o; i6++) {
            int i7 = 0;
            while (i7 < i4) {
                IlIl11.OooO00o(this.OooO00o[i6][i7], bArr, i2);
                i7++;
                i2 += 4;
            }
            int i8 = 0;
            while (i8 < i5) {
                bArr[i2] = (byte) ((this.OooO00o[i6][i4] >>> i8) & 255);
                i8 += 8;
                i2++;
            }
        }
        return bArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m17860OooO00o(int i) {
        return this.OooO00o[i];
    }

    @Override // com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill, com.p118pd.sdk.AbstractC6339ill
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[][] m17861OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6339ill
    public L1LL111 OooO0O0(L1LL111 l1ll111) {
        if (!(l1ll111 instanceof l11ILi)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        } else if (l1ll111.OooO00o == this.f18083OooO0O0) {
            int[] OooO00o2 = ((l11ILi) l1ll111).m17553OooO00o();
            int[] iArr = new int[((super.f18082OooO00o + 31) >>> 5)];
            int i = 0;
            while (true) {
                int i2 = super.f18082OooO00o;
                if (i >= i2) {
                    return new l11ILi(iArr, i2);
                }
                int i3 = 0;
                for (int i4 = 0; i4 < this.OooO0OO; i4++) {
                    i3 ^= this.OooO00o[i][i4] & OooO00o2[i4];
                }
                int i5 = 0;
                for (int i6 = 0; i6 < 32; i6++) {
                    i5 ^= (i3 >>> i6) & 1;
                }
                if (i5 == 1) {
                    int i7 = i >>> 5;
                    iArr[i7] = iArr[i7] | (1 << (i & 31));
                }
                i++;
            }
        } else {
            throw new ArithmeticException("length mismatch");
        }
    }

    @Override // com.p118pd.sdk.AbstractC6339ill
    public AbstractC6339ill OooO0O0() {
        int i = this.f18083OooO0O0;
        int[] iArr = new int[2];
        iArr[1] = (super.f18082OooO00o + 31) >>> 5;
        iArr[0] = i;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i2 = 0;
        while (true) {
            int i3 = super.f18082OooO00o;
            if (i2 >= i3) {
                return new llILLI1(i3, iArr2);
            }
            for (int i4 = 0; i4 < this.f18083OooO0O0; i4++) {
                int i5 = i2 >>> 5;
                int i6 = i2 & 31;
                if (((this.OooO00o[i2][i4 >>> 5] >>> (i4 & 31)) & 1) == 1) {
                    int[] iArr3 = iArr2[i4];
                    iArr3[i5] = (1 << i6) | iArr3[i5];
                }
            }
            i2++;
        }
    }

    public AbstractC6339ill OooO0O0(C6051i1lli i1lli) {
        int[] OooO00o2 = i1lli.m16915OooO00o();
        int length = OooO00o2.length;
        int i = super.f18082OooO00o;
        if (length == i) {
            int[][] iArr = new int[i][];
            for (int i2 = i - 1; i2 >= 0; i2--) {
                iArr[i2] = lllILI.m17914OooO00o(this.OooO00o[OooO00o2[i2]]);
            }
            return new llILLI1(super.f18082OooO00o, iArr);
        }
        throw new ArithmeticException("length mismatch");
    }

    @Override // com.p118pd.sdk.AbstractC6339ill
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public llILLI1 m17862OooO0O0() {
        int i;
        int i2 = super.f18082OooO00o;
        llILLI1 r0 = new llILLI1(i2, this.f18083OooO0O0 + i2);
        int i3 = super.f18082OooO00o;
        int i4 = i3 >> 5;
        int i5 = i3 & 31;
        for (int i6 = i3 - 1; i6 >= 0; i6--) {
            int[][] iArr = r0.OooO00o;
            int[] iArr2 = iArr[i6];
            int i7 = i6 >> 5;
            iArr2[i7] = iArr2[i7] | (1 << (i6 & 31));
            int i8 = 0;
            if (i5 != 0) {
                int i9 = i4;
                while (true) {
                    i = this.OooO0OO;
                    if (i8 >= i - 1) {
                        break;
                    }
                    int i10 = this.OooO00o[i6][i8];
                    int[][] iArr3 = r0.OooO00o;
                    int[] iArr4 = iArr3[i6];
                    int i11 = i9 + 1;
                    iArr4[i9] = iArr4[i9] | (i10 << i5);
                    int[] iArr5 = iArr3[i6];
                    iArr5[i11] = (i10 >>> (32 - i5)) | iArr5[i11];
                    i8++;
                    i9 = i11;
                }
                int i12 = this.OooO00o[i6][i - 1];
                int[][] iArr6 = r0.OooO00o;
                int[] iArr7 = iArr6[i6];
                int i13 = i9 + 1;
                iArr7[i9] = iArr7[i9] | (i12 << i5);
                if (i13 < r0.OooO0OO) {
                    int[] iArr8 = iArr6[i6];
                    iArr8[i13] = (i12 >>> (32 - i5)) | iArr8[i13];
                }
            } else {
                System.arraycopy(this.OooO00o[i6], 0, iArr[i6], i4, this.OooO0OO);
            }
        }
        return r0;
    }

    public int OooO0OO() {
        return this.OooO0OO;
    }

    public L1LL111 OooO0OO(L1LL111 l1ll111) {
        if (!(l1ll111 instanceof l11ILi)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        } else if (l1ll111.OooO00o == super.f18082OooO00o) {
            int[] OooO00o2 = ((l11ILi) l1ll111).m17553OooO00o();
            int i = super.f18082OooO00o;
            int[] iArr = new int[(((this.f18083OooO0O0 + i) + 31) >>> 5)];
            int i2 = i >>> 5;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = 1;
                do {
                    if ((OooO00o2[i4] & i5) != 0) {
                        for (int i6 = 0; i6 < this.OooO0OO; i6++) {
                            iArr[i6] = iArr[i6] ^ this.OooO00o[i3][i6];
                        }
                        int i7 = this.f18083OooO0O0;
                        int i8 = (i7 + i3) >>> 5;
                        iArr[i8] = (1 << ((i7 + i3) & 31)) | iArr[i8];
                    }
                    i3++;
                    i5 <<= 1;
                } while (i5 != 0);
            }
            int i9 = 1 << (super.f18082OooO00o & 31);
            for (int i10 = 1; i10 != i9; i10 <<= 1) {
                if ((OooO00o2[i2] & i10) != 0) {
                    for (int i11 = 0; i11 < this.OooO0OO; i11++) {
                        iArr[i11] = iArr[i11] ^ this.OooO00o[i3][i11];
                    }
                    int i12 = this.f18083OooO0O0;
                    int i13 = (i12 + i3) >>> 5;
                    iArr[i13] = (1 << ((i12 + i3) & 31)) | iArr[i13];
                }
                i3++;
            }
            return new l11ILi(iArr, super.f18082OooO00o + this.f18083OooO0O0);
        } else {
            throw new ArithmeticException("length mismatch");
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public llILLI1 m17863OooO0OO() {
        int i = this.f18083OooO0O0;
        int i2 = super.f18082OooO00o;
        if (i > i2) {
            int i3 = (i2 + 31) >> 5;
            int[] iArr = new int[2];
            iArr[1] = i3;
            iArr[0] = i2;
            int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
            int i4 = (1 << (super.f18082OooO00o & 31)) - 1;
            if (i4 == 0) {
                i4 = -1;
            }
            for (int i5 = super.f18082OooO00o - 1; i5 >= 0; i5--) {
                System.arraycopy(this.OooO00o[i5], 0, iArr2[i5], 0, i3);
                int[] iArr3 = iArr2[i5];
                int i6 = i3 - 1;
                iArr3[i6] = iArr3[i6] & i4;
            }
            return new llILLI1(super.f18082OooO00o, iArr2);
        }
        throw new ArithmeticException("empty submatrix");
    }

    public L1LL111 OooO0Oo(L1LL111 l1ll111) {
        if (!(l1ll111 instanceof l11ILi)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        } else if (l1ll111.OooO00o == this.f18083OooO0O0 + super.f18082OooO00o) {
            int[] OooO00o2 = ((l11ILi) l1ll111).m17553OooO00o();
            int i = super.f18082OooO00o;
            int[] iArr = new int[((i + 31) >>> 5)];
            int i2 = i >> 5;
            int i3 = i & 31;
            int i4 = 0;
            while (true) {
                int i5 = super.f18082OooO00o;
                if (i4 >= i5) {
                    return new l11ILi(iArr, i5);
                }
                int i6 = i4 >> 5;
                int i7 = i4 & 31;
                int i8 = (OooO00o2[i6] >>> i7) & 1;
                int i9 = i2;
                int i10 = 0;
                if (i3 != 0) {
                    while (i10 < this.OooO0OO - 1) {
                        int i11 = i9 + 1;
                        i8 ^= ((OooO00o2[i9] >>> i3) | (OooO00o2[i11] << (32 - i3))) & this.OooO00o[i4][i10];
                        i10++;
                        i9 = i11;
                    }
                    int i12 = i9 + 1;
                    int i13 = OooO00o2[i9] >>> i3;
                    if (i12 < OooO00o2.length) {
                        i13 |= OooO00o2[i12] << (32 - i3);
                    }
                    i8 ^= this.OooO00o[i4][this.OooO0OO - 1] & i13;
                } else {
                    while (i10 < this.OooO0OO) {
                        i8 ^= OooO00o2[i9] & this.OooO00o[i4][i10];
                        i10++;
                        i9++;
                    }
                }
                int i14 = 0;
                for (int i15 = 0; i15 < 32; i15++) {
                    i14 ^= i8 & 1;
                    i8 >>>= 1;
                }
                if (i14 == 1) {
                    iArr[i6] = iArr[i6] | (1 << i7);
                }
                i4++;
            }
        } else {
            throw new ArithmeticException("length mismatch");
        }
    }

    public llILLI1 OooO0Oo() {
        int i;
        int i2 = this.f18083OooO0O0;
        int i3 = super.f18082OooO00o;
        if (i2 > i3) {
            int i4 = i3 >> 5;
            int i5 = i3 & 31;
            llILLI1 r4 = new llILLI1(i3, i2 - i3);
            for (int i6 = super.f18082OooO00o - 1; i6 >= 0; i6--) {
                int i7 = 0;
                if (i5 != 0) {
                    int i8 = i4;
                    while (true) {
                        i = r4.OooO0OO;
                        if (i7 >= i - 1) {
                            break;
                        }
                        int[] iArr = r4.OooO00o[i6];
                        int[][] iArr2 = this.OooO00o;
                        int i9 = i8 + 1;
                        iArr[i7] = (iArr2[i6][i8] >>> i5) | (iArr2[i6][i9] << (32 - i5));
                        i7++;
                        i8 = i9;
                    }
                    int[][] iArr3 = r4.OooO00o;
                    int[][] iArr4 = this.OooO00o;
                    int i10 = i8 + 1;
                    iArr3[i6][i - 1] = iArr4[i6][i8] >>> i5;
                    if (i10 < this.OooO0OO) {
                        int[] iArr5 = iArr3[i6];
                        int i11 = i - 1;
                        iArr5[i11] = iArr5[i11] | (iArr4[i6][i10] << (32 - i5));
                    }
                } else {
                    System.arraycopy(this.OooO00o[i6], i4, r4.OooO00o[i6], 0, r4.OooO0OO);
                }
            }
            return r4;
        }
        throw new ArithmeticException("empty submatrix");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof llILLI1)) {
            return false;
        }
        llILLI1 r5 = (llILLI1) obj;
        if (!(super.f18082OooO00o == ((AbstractC6339ill) r5).f18082OooO00o && this.f18083OooO0O0 == r5.f18083OooO0O0 && this.OooO0OO == r5.OooO0OO)) {
            return false;
        }
        for (int i = 0; i < super.f18082OooO00o; i++) {
            if (!lllILI.OooO00o(this.OooO00o[i], r5.OooO00o[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = (((super.f18082OooO00o * 31) + this.f18083OooO0O0) * 31) + this.OooO0OO;
        for (int i2 = 0; i2 < super.f18082OooO00o; i2++) {
            i = (i * 31) + this.OooO00o[i2].hashCode();
        }
        return i;
    }

    @Override // com.p118pd.sdk.AbstractC6339ill
    public String toString() {
        int i = this.f18083OooO0O0 & 31;
        int i2 = this.OooO0OO;
        if (i != 0) {
            i2--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < super.f18082OooO00o; i3++) {
            stringBuffer.append(i3 + ": ");
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.OooO00o[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i7 = this.OooO00o[i3][this.OooO0OO - 1];
            for (int i8 = 0; i8 < i; i8++) {
                if (((i7 >>> i8) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }
}
