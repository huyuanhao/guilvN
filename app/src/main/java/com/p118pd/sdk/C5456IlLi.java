package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.IlL丨i  reason: invalid class name and case insensitive filesystem */
public class C5456IlLi implements LLLi1iII {
    public static final int OooO0OO = 4;
    public static final int OooO0Oo = 8;
    public static final int OooO0o = 64;
    public static final int OooO0o0 = 512;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f15849OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f15850OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15851OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15852OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public OooO00o f15853OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f15854OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f15855OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public byte[] f15856OooO0Oo;

    /* renamed from: OooO0o  reason: collision with other field name */
    public byte[] f15857OooO0o;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public byte[] f15858OooO0o0;
    public byte[] OooO0oO;
    public byte[] OooO0oo;

    /* renamed from: com.pd.sdk.IlL丨i$OooO00o */
    public class OooO00o extends ByteArrayOutputStream {
        public OooO00o() {
        }

        public byte[] OooO0O0() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public C5456IlLi(li1l11I1 li1l11i1) {
        this(li1l11i1, 4);
    }

    public C5456IlLi(li1l11I1 li1l11i1, int i) {
        this.f15849OooO00o = new OooO00o();
        this.f15853OooO0O0 = new OooO00o();
        this.OooO0O0 = 4;
        this.f15850OooO00o = li1l11i1;
        this.OooO00o = li1l11i1.OooO00o();
        this.f15856OooO0Oo = new byte[li1l11i1.OooO00o()];
        this.f15852OooO00o = new byte[li1l11i1.OooO00o()];
        this.f15854OooO0O0 = new byte[li1l11i1.OooO00o()];
        this.f15855OooO0OO = new byte[li1l11i1.OooO00o()];
        this.f15858OooO0o0 = new byte[li1l11i1.OooO00o()];
        this.f15857OooO0o = new byte[li1l11i1.OooO00o()];
        this.OooO0oO = new byte[li1l11i1.OooO00o()];
        this.OooO0oo = new byte[li1l11i1.OooO00o()];
        OooO00o(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047 A[LOOP:0: B:21:0x0040->B:23:0x0047, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte OooO00o(boolean r4, int r5) {
        /*
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "0"
            if (r4 == 0) goto L_0x000f
            java.lang.String r4 = "1"
            r0.append(r4)
            goto L_0x0012
        L_0x000f:
            r0.append(r1)
        L_0x0012:
            r4 = 8
            if (r5 == r4) goto L_0x0033
            r4 = 16
            if (r5 == r4) goto L_0x0030
            r4 = 32
            if (r5 == r4) goto L_0x002d
            r4 = 48
            if (r5 == r4) goto L_0x002a
            r4 = 64
            if (r5 == r4) goto L_0x0027
            goto L_0x0038
        L_0x0027:
            java.lang.String r4 = "110"
            goto L_0x0035
        L_0x002a:
            java.lang.String r4 = "101"
            goto L_0x0035
        L_0x002d:
            java.lang.String r4 = "100"
            goto L_0x0035
        L_0x0030:
            java.lang.String r4 = "011"
            goto L_0x0035
        L_0x0033:
            java.lang.String r4 = "010"
        L_0x0035:
            r0.append(r4)
        L_0x0038:
            int r4 = r3.OooO0O0
            int r4 = r4 + -1
            java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
        L_0x0040:
            int r5 = r4.length()
            r2 = 4
            if (r5 >= r2) goto L_0x0056
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>(r4)
            r4 = 0
            java.lang.StringBuffer r4 = r5.insert(r4, r1)
            java.lang.String r4 = r4.toString()
            goto L_0x0040
        L_0x0056:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5 = 2
            int r4 = java.lang.Integer.parseInt(r4, r5)
            byte r4 = (byte) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5456IlLi.OooO00o(boolean, int):byte");
    }

    @Override // com.p118pd.sdk.LLLi1iII
    private void OooO00o(int i) {
        if (i == 4 || i == 6 || i == 8) {
            this.OooO0O0 = i;
            return;
        }
        throw new IllegalArgumentException("Nb = 4 is recommended by DSTU7624 but can be changed to only 6 or 8 in this implementation");
    }

    private void OooO00o(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >> 24);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2] = (byte) i;
    }

    private void OooO00o(byte[] bArr, int i, int i2, int i3) {
        if (i2 - i < this.f15850OooO00o.OooO00o()) {
            throw new IllegalArgumentException("authText buffer too short");
        } else if (i2 % this.f15850OooO00o.OooO00o() == 0) {
            byte[] bArr2 = this.f15856OooO0Oo;
            System.arraycopy(bArr2, 0, this.f15858OooO0o0, 0, (bArr2.length - this.OooO0O0) - 1);
            OooO00o(i3, this.f15857OooO0o, 0);
            System.arraycopy(this.f15857OooO0o, 0, this.f15858OooO0o0, (this.f15856OooO0Oo.length - this.OooO0O0) - 1, 4);
            byte[] bArr3 = this.f15858OooO0o0;
            bArr3[bArr3.length - 1] = OooO00o(true, this.OooO00o);
            this.f15850OooO00o.OooO00o(this.f15858OooO0o0, 0, this.f15855OooO0OO, 0);
            OooO00o(i2, this.f15857OooO0o, 0);
            if (i2 <= this.f15850OooO00o.OooO00o() - this.OooO0O0) {
                for (int i4 = 0; i4 < i2; i4++) {
                    byte[] bArr4 = this.f15857OooO0o;
                    int i5 = this.OooO0O0 + i4;
                    bArr4[i5] = (byte) (bArr4[i5] ^ bArr[i + i4]);
                }
                for (int i6 = 0; i6 < this.f15850OooO00o.OooO00o(); i6++) {
                    byte[] bArr5 = this.f15855OooO0OO;
                    bArr5[i6] = (byte) (bArr5[i6] ^ this.f15857OooO0o[i6]);
                }
                li1l11I1 li1l11i1 = this.f15850OooO00o;
                byte[] bArr6 = this.f15855OooO0OO;
                li1l11i1.OooO00o(bArr6, 0, bArr6, 0);
                return;
            }
            for (int i7 = 0; i7 < this.f15850OooO00o.OooO00o(); i7++) {
                byte[] bArr7 = this.f15855OooO0OO;
                bArr7[i7] = (byte) (bArr7[i7] ^ this.f15857OooO0o[i7]);
            }
            li1l11I1 li1l11i12 = this.f15850OooO00o;
            byte[] bArr8 = this.f15855OooO0OO;
            li1l11i12.OooO00o(bArr8, 0, bArr8, 0);
            while (i2 != 0) {
                for (int i8 = 0; i8 < this.f15850OooO00o.OooO00o(); i8++) {
                    byte[] bArr9 = this.f15855OooO0OO;
                    bArr9[i8] = (byte) (bArr9[i8] ^ bArr[i8 + i]);
                }
                li1l11I1 li1l11i13 = this.f15850OooO00o;
                byte[] bArr10 = this.f15855OooO0OO;
                li1l11i13.OooO00o(bArr10, 0, bArr10, 0);
                i += this.f15850OooO00o.OooO00o();
                i2 -= this.f15850OooO00o.OooO00o();
            }
        } else {
            throw new IllegalArgumentException("padding not supported");
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII
    private void OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        while (true) {
            byte[] bArr3 = this.OooO0oo;
            if (i4 >= bArr3.length) {
                break;
            }
            byte[] bArr4 = this.OooO0oO;
            bArr4[i4] = (byte) (bArr4[i4] + bArr3[i4]);
            i4++;
        }
        this.f15850OooO00o.OooO00o(this.OooO0oO, 0, this.f15857OooO0o, 0);
        for (int i5 = 0; i5 < this.f15850OooO00o.OooO00o(); i5++) {
            bArr2[i3 + i5] = (byte) (this.f15857OooO0o[i5] ^ bArr[i + i5]);
        }
    }

    private void OooO0O0(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            for (int i3 = 0; i3 < this.f15850OooO00o.OooO00o(); i3++) {
                byte[] bArr2 = this.f15855OooO0OO;
                bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i + i3]);
            }
            li1l11I1 li1l11i1 = this.f15850OooO00o;
            byte[] bArr3 = this.f15855OooO0OO;
            li1l11i1.OooO00o(bArr3, 0, bArr3, 0);
            i2 -= this.f15850OooO00o.OooO00o();
            i += this.f15850OooO00o.OooO00o();
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(byte b, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        this.f15853OooO0O0.write(b);
        return 0;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m15681OooO00o(int i) {
        return i + this.OooO00o;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        int OooO0O02 = OooO0O0(this.f15853OooO0O0.OooO0O0(), 0, this.f15853OooO0O0.size(), bArr, i);
        reset();
        return OooO0O02;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m15682OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        if (bArr.length >= i + i2) {
            this.f15853OooO0O0.write(bArr, i, i2);
            return 0;
        }
        throw new DataLengthException("input buffer too short");
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    public li1l11I1 OooO00o() {
        return this.f15850OooO00o;
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15683OooO00o() {
        return this.f15850OooO00o.m17732OooO00o() + "/KCCM";
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(byte b) {
        this.f15849OooO00o.write(b);
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) throws IllegalArgumentException {
        AbstractC6370iIIIl r42;
        if (r4 instanceof C5553Iili) {
            C5553Iili r43 = (C5553Iili) r4;
            if (r43.OooO00o() > 512 || r43.OooO00o() < 64 || r43.OooO00o() % 8 != 0) {
                throw new IllegalArgumentException("Invalid mac size specified");
            }
            this.f15856OooO0Oo = r43.OooO0O0();
            this.OooO00o = r43.OooO00o() / 8;
            this.f15852OooO00o = r43.m15833OooO00o();
            r42 = r43.m15832OooO00o();
        } else if (r4 instanceof C6274iilL1L) {
            C6274iilL1L r44 = (C6274iilL1L) r4;
            this.f15856OooO0Oo = r44.m17301OooO00o();
            this.OooO00o = this.f15850OooO00o.OooO00o();
            this.f15852OooO00o = null;
            r42 = r44.OooO00o();
        } else {
            throw new IllegalArgumentException("Invalid parameters specified");
        }
        this.f15854OooO0O0 = new byte[this.OooO00o];
        this.f15851OooO00o = z;
        this.f15850OooO00o.OooO00o(true, r42);
        this.OooO0oo[0] = 1;
        byte[] bArr = this.f15852OooO00o;
        if (bArr != null) {
            OooO00o(bArr, 0, bArr.length);
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(byte[] bArr, int i, int i2) {
        this.f15849OooO00o.write(bArr, i, i2);
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15684OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f15854OooO0O0);
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO0O0(int i) {
        return i;
    }

    public int OooO0O0(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, InvalidCipherTextException {
        int i4;
        if (bArr.length - i < i2) {
            throw new DataLengthException("input buffer too short");
        } else if (bArr2.length - i3 >= i2) {
            if (this.f15849OooO00o.size() > 0) {
                if (this.f15851OooO00o) {
                    OooO00o(this.f15849OooO00o.OooO0O0(), 0, this.f15849OooO00o.size(), this.f15853OooO0O0.size());
                } else {
                    OooO00o(this.f15849OooO00o.OooO0O0(), 0, this.f15849OooO00o.size(), this.f15853OooO0O0.size() - this.OooO00o);
                }
            }
            if (this.f15851OooO00o) {
                if (i2 % this.f15850OooO00o.OooO00o() == 0) {
                    OooO0O0(bArr, i, i2);
                    this.f15850OooO00o.OooO00o(this.f15856OooO0Oo, 0, this.OooO0oO, 0);
                    int i5 = i2;
                    while (i5 > 0) {
                        OooO00o(bArr, i, i2, bArr2, i3);
                        i5 -= this.f15850OooO00o.OooO00o();
                        i += this.f15850OooO00o.OooO00o();
                        i3 += this.f15850OooO00o.OooO00o();
                    }
                    int i6 = 0;
                    while (true) {
                        byte[] bArr3 = this.OooO0oo;
                        if (i6 >= bArr3.length) {
                            break;
                        }
                        byte[] bArr4 = this.OooO0oO;
                        bArr4[i6] = (byte) (bArr4[i6] + bArr3[i6]);
                        i6++;
                    }
                    this.f15850OooO00o.OooO00o(this.OooO0oO, 0, this.f15857OooO0o, 0);
                    int i7 = 0;
                    while (true) {
                        int i8 = this.OooO00o;
                        if (i7 < i8) {
                            bArr2[i3 + i7] = (byte) (this.f15857OooO0o[i7] ^ this.f15855OooO0OO[i7]);
                            i7++;
                        } else {
                            System.arraycopy(this.f15855OooO0OO, 0, this.f15854OooO0O0, 0, i8);
                            reset();
                            return i2 + this.OooO00o;
                        }
                    }
                } else {
                    throw new DataLengthException("partial blocks not supported");
                }
            } else if ((i2 - this.OooO00o) % this.f15850OooO00o.OooO00o() == 0) {
                this.f15850OooO00o.OooO00o(this.f15856OooO0Oo, 0, this.OooO0oO, 0);
                int OooO00o2 = i2 / this.f15850OooO00o.OooO00o();
                for (int i9 = 0; i9 < OooO00o2; i9++) {
                    OooO00o(bArr, i, i2, bArr2, i3);
                    i += this.f15850OooO00o.OooO00o();
                    i3 += this.f15850OooO00o.OooO00o();
                }
                if (i2 > i) {
                    int i10 = 0;
                    while (true) {
                        byte[] bArr5 = this.OooO0oo;
                        if (i10 >= bArr5.length) {
                            break;
                        }
                        byte[] bArr6 = this.OooO0oO;
                        bArr6[i10] = (byte) (bArr6[i10] + bArr5[i10]);
                        i10++;
                    }
                    this.f15850OooO00o.OooO00o(this.OooO0oO, 0, this.f15857OooO0o, 0);
                    int i11 = 0;
                    while (true) {
                        i4 = this.OooO00o;
                        if (i11 >= i4) {
                            break;
                        }
                        bArr2[i3 + i11] = (byte) (this.f15857OooO0o[i11] ^ bArr[i + i11]);
                        i11++;
                    }
                    i3 += i4;
                }
                int i12 = 0;
                while (true) {
                    byte[] bArr7 = this.OooO0oo;
                    if (i12 >= bArr7.length) {
                        break;
                    }
                    byte[] bArr8 = this.OooO0oO;
                    bArr8[i12] = (byte) (bArr8[i12] + bArr7[i12]);
                    i12++;
                }
                this.f15850OooO00o.OooO00o(this.OooO0oO, 0, this.f15857OooO0o, 0);
                int i13 = this.OooO00o;
                System.arraycopy(bArr2, i3 - i13, this.f15857OooO0o, 0, i13);
                OooO0O0(bArr2, 0, i3 - this.OooO00o);
                System.arraycopy(this.f15855OooO0OO, 0, this.f15854OooO0O0, 0, this.OooO00o);
                int i14 = this.OooO00o;
                byte[] bArr9 = new byte[i14];
                System.arraycopy(this.f15857OooO0o, 0, bArr9, 0, i14);
                if (C9586iIILl.OooO0O0(this.f15854OooO0O0, bArr9)) {
                    reset();
                    return i2 - this.OooO00o;
                }
                throw new InvalidCipherTextException("mac check failed");
            } else {
                throw new DataLengthException("partial blocks not supported");
            }
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void reset() {
        C9586iIILl.OooO00o(this.f15858OooO0o0, (byte) 0);
        C9586iIILl.OooO00o(this.f15857OooO0o, (byte) 0);
        C9586iIILl.OooO00o(this.OooO0oo, (byte) 0);
        C9586iIILl.OooO00o(this.f15855OooO0OO, (byte) 0);
        this.OooO0oo[0] = 1;
        this.f15853OooO0O0.reset();
        this.f15849OooO00o.reset();
        byte[] bArr = this.f15852OooO00o;
        if (bArr != null) {
            OooO00o(bArr, 0, bArr.length);
        }
    }
}
