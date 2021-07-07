package com.p118pd.sdk;

import java.lang.reflect.Array;

/* renamed from: com.pd.sdk.LLLL1 */
public class LLLL1 {
    public short[] OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[][] f16463OooO00o;

    private void OooO00o() throws RuntimeException {
        for (int length = this.f16463OooO00o.length - 1; length > 0; length--) {
            for (int i = length - 1; i >= 0; i--) {
                short[][] sArr = this.f16463OooO00o;
                short s = sArr[i][length];
                short OooO0OO = C6275iili.OooO0OO(sArr[length][length]);
                if (OooO0OO != 0) {
                    int i2 = length;
                    while (true) {
                        short[][] sArr2 = this.f16463OooO00o;
                        if (i2 >= sArr2.length * 2) {
                            break;
                        }
                        short OooO0O0 = C6275iili.OooO0O0(s, C6275iili.OooO0O0(sArr2[length][i2], OooO0OO));
                        short[][] sArr3 = this.f16463OooO00o;
                        sArr3[i][i2] = C6275iili.OooO00o(sArr3[i][i2], OooO0O0);
                        i2++;
                    }
                } else {
                    throw new RuntimeException("The matrix is not invertible");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r0 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO00o(boolean r10) throws java.lang.RuntimeException {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x0008
            short[][] r10 = r9.f16463OooO00o
            int r10 = r10.length
            int r10 = r10 * 2
            goto L_0x000d
        L_0x0008:
            short[][] r10 = r9.f16463OooO00o
            int r10 = r10.length
            int r10 = r10 + 1
        L_0x000d:
            r0 = 0
        L_0x000e:
            short[][] r1 = r9.f16463OooO00o
            int r1 = r1.length
            int r1 = r1 + -1
            if (r0 >= r1) goto L_0x005a
            int r1 = r0 + 1
            r2 = r1
        L_0x0018:
            short[][] r3 = r9.f16463OooO00o
            int r4 = r3.length
            if (r2 >= r4) goto L_0x0058
            r4 = r3[r2]
            short r4 = r4[r0]
            r3 = r3[r0]
            short r3 = r3[r0]
            short r3 = com.p118pd.sdk.C6275iili.OooO0OO(r3)
            if (r3 == 0) goto L_0x0050
            r5 = r0
        L_0x002c:
            if (r5 >= r10) goto L_0x004d
            short[][] r6 = r9.f16463OooO00o
            r6 = r6[r0]
            short r6 = r6[r5]
            short r6 = com.p118pd.sdk.C6275iili.OooO0O0(r6, r3)
            short r6 = com.p118pd.sdk.C6275iili.OooO0O0(r4, r6)
            short[][] r7 = r9.f16463OooO00o
            r8 = r7[r2]
            r7 = r7[r2]
            short r7 = r7[r5]
            short r6 = com.p118pd.sdk.C6275iili.OooO00o(r7, r6)
            r8[r5] = r6
            int r5 = r5 + 1
            goto L_0x002c
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0050:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Matrix not invertible! We have to choose another one!"
            r10.<init>(r0)
            throw r10
        L_0x0058:
            r0 = r1
            goto L_0x000e
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.LLLL1.OooO00o(boolean):void");
    }

    private void OooO0O0() throws IllegalStateException {
        short[][] sArr = this.f16463OooO00o;
        short OooO0OO = C6275iili.OooO0OO(sArr[sArr.length - 1][sArr.length - 1]);
        if (OooO0OO != 0) {
            short[] sArr2 = this.OooO00o;
            short[][] sArr3 = this.f16463OooO00o;
            sArr2[sArr3.length - 1] = C6275iili.OooO0O0(sArr3[sArr3.length - 1][sArr3.length], OooO0OO);
            for (int length = this.f16463OooO00o.length - 2; length >= 0; length--) {
                short[][] sArr4 = this.f16463OooO00o;
                short s = sArr4[length][sArr4.length];
                for (int length2 = sArr4.length - 1; length2 > length; length2--) {
                    s = C6275iili.OooO00o(s, C6275iili.OooO0O0(this.f16463OooO00o[length][length2], this.OooO00o[length2]));
                }
                short OooO0OO2 = C6275iili.OooO0OO(this.f16463OooO00o[length][length]);
                if (OooO0OO2 != 0) {
                    this.OooO00o[length] = C6275iili.OooO0O0(s, OooO0OO2);
                } else {
                    throw new IllegalStateException("Not solvable equation system");
                }
            }
            return;
        }
        throw new IllegalStateException("The equation system is not solvable");
    }

    public short[] OooO00o(short s, short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        for (int i = 0; i < length; i++) {
            sArr2[i] = C6275iili.OooO0O0(s, sArr[i]);
        }
        return sArr2;
    }

    public short[] OooO00o(short[] sArr, short[] sArr2) {
        if (sArr.length == sArr2.length) {
            int length = sArr.length;
            short[] sArr3 = new short[length];
            for (int i = 0; i < length; i++) {
                sArr3[i] = C6275iili.OooO00o(sArr[i], sArr2[i]);
            }
            return sArr3;
        }
        throw new RuntimeException("Multiplication is not possible!");
    }

    public short[] OooO00o(short[][] sArr, short[] sArr2) throws RuntimeException {
        if (sArr[0].length == sArr2.length) {
            short[] sArr3 = new short[sArr.length];
            for (int i = 0; i < sArr.length; i++) {
                for (int i2 = 0; i2 < sArr2.length; i2++) {
                    sArr3[i] = C6275iili.OooO00o(sArr3[i], C6275iili.OooO0O0(sArr[i][i2], sArr2[i2]));
                }
            }
            return sArr3;
        }
        throw new RuntimeException("Multiplication is not possible!");
    }

    public short[][] OooO00o(short s, short[][] sArr) {
        int length = sArr.length;
        int[] iArr = new int[2];
        iArr[1] = sArr[0].length;
        iArr[0] = length;
        short[][] sArr2 = (short[][]) Array.newInstance(short.class, iArr);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i][i2] = C6275iili.OooO0O0(s, sArr[i][i2]);
            }
        }
        return sArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public short[][] m16222OooO00o(short[] sArr, short[] sArr2) {
        if (sArr.length == sArr2.length) {
            int length = sArr.length;
            int[] iArr = new int[2];
            iArr[1] = sArr2.length;
            iArr[0] = length;
            short[][] sArr3 = (short[][]) Array.newInstance(short.class, iArr);
            for (int i = 0; i < sArr.length; i++) {
                for (int i2 = 0; i2 < sArr2.length; i2++) {
                    sArr3[i][i2] = C6275iili.OooO0O0(sArr[i], sArr2[i2]);
                }
            }
            return sArr3;
        }
        throw new RuntimeException("Multiplication is not possible!");
    }

    public short[][] OooO00o(short[][] sArr) {
        try {
            int length = sArr.length;
            int[] iArr = new int[2];
            iArr[1] = sArr.length * 2;
            iArr[0] = length;
            this.f16463OooO00o = (short[][]) Array.newInstance(short.class, iArr);
            if (sArr.length == sArr[0].length) {
                for (int i = 0; i < sArr.length; i++) {
                    for (int i2 = 0; i2 < sArr.length; i2++) {
                        this.f16463OooO00o[i][i2] = sArr[i][i2];
                    }
                    for (int length2 = sArr.length; length2 < sArr.length * 2; length2++) {
                        this.f16463OooO00o[i][length2] = 0;
                    }
                    this.f16463OooO00o[i][this.f16463OooO00o.length + i] = 1;
                }
                OooO00o(true);
                for (int i3 = 0; i3 < this.f16463OooO00o.length; i3++) {
                    short OooO0OO = C6275iili.OooO0OO(this.f16463OooO00o[i3][i3]);
                    for (int i4 = i3; i4 < this.f16463OooO00o.length * 2; i4++) {
                        this.f16463OooO00o[i3][i4] = C6275iili.OooO0O0(this.f16463OooO00o[i3][i4], OooO0OO);
                    }
                }
                OooO00o();
                int length3 = this.f16463OooO00o.length;
                int[] iArr2 = new int[2];
                iArr2[1] = this.f16463OooO00o.length;
                iArr2[0] = length3;
                short[][] sArr2 = (short[][]) Array.newInstance(short.class, iArr2);
                for (int i5 = 0; i5 < this.f16463OooO00o.length; i5++) {
                    for (int length4 = this.f16463OooO00o.length; length4 < this.f16463OooO00o.length * 2; length4++) {
                        sArr2[i5][length4 - this.f16463OooO00o.length] = this.f16463OooO00o[i5][length4];
                    }
                }
                return sArr2;
            }
            throw new RuntimeException("The matrix is not invertible. Please choose another one!");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] OooO00o(short[][] sArr, short[][] sArr2) {
        if (sArr.length == sArr2.length && sArr[0].length == sArr2[0].length) {
            int length = sArr.length;
            int[] iArr = new int[2];
            iArr[1] = sArr.length;
            iArr[0] = length;
            short[][] sArr3 = (short[][]) Array.newInstance(short.class, iArr);
            for (int i = 0; i < sArr.length; i++) {
                for (int i2 = 0; i2 < sArr2.length; i2++) {
                    sArr3[i][i2] = C6275iili.OooO00o(sArr[i][i2], sArr2[i][i2]);
                }
            }
            return sArr3;
        }
        throw new RuntimeException("Addition is not possible!");
    }

    public short[] OooO0O0(short[][] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return null;
        }
        try {
            int length = sArr.length;
            int[] iArr = new int[2];
            iArr[1] = sArr.length + 1;
            iArr[0] = length;
            this.f16463OooO00o = (short[][]) Array.newInstance(short.class, iArr);
            this.OooO00o = new short[sArr.length];
            for (int i = 0; i < sArr.length; i++) {
                for (int i2 = 0; i2 < sArr[0].length; i2++) {
                    this.f16463OooO00o[i][i2] = sArr[i][i2];
                }
            }
            for (int i3 = 0; i3 < sArr2.length; i3++) {
                this.f16463OooO00o[i3][sArr2.length] = C6275iili.OooO00o(sArr2[i3], this.f16463OooO00o[i3][sArr2.length]);
            }
            OooO00o(false);
            OooO0O0();
            return this.OooO00o;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] OooO0O0(short[][] sArr, short[][] sArr2) throws RuntimeException {
        if (sArr[0].length == sArr2.length) {
            int length = sArr.length;
            int[] iArr = new int[2];
            iArr[1] = sArr2[0].length;
            iArr[0] = length;
            this.f16463OooO00o = (short[][]) Array.newInstance(short.class, iArr);
            for (int i = 0; i < sArr.length; i++) {
                for (int i2 = 0; i2 < sArr2.length; i2++) {
                    for (int i3 = 0; i3 < sArr2[0].length; i3++) {
                        short OooO0O0 = C6275iili.OooO0O0(sArr[i][i2], sArr2[i2][i3]);
                        short[][] sArr3 = this.f16463OooO00o;
                        sArr3[i][i3] = C6275iili.OooO00o(sArr3[i][i3], OooO0O0);
                    }
                }
            }
            return this.f16463OooO00o;
        }
        throw new RuntimeException("Multiplication is not possible!");
    }
}
