package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.LlLL丨I丨1  reason: invalid class name */
public class LlLLI1 implements LLLi1iII {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f16725OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6370iIIIl f16726OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f16727OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16728OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16729OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public OooO00o f16730OooO0O0 = new OooO00o();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f16731OooO0O0;
    public byte[] OooO0OO;

    /* renamed from: com.pd.sdk.LlLL丨I丨1$OooO00o */
    public class OooO00o extends ByteArrayOutputStream {
        public OooO00o() {
        }

        public byte[] OooO0O0() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public LlLLI1(li1l11I1 li1l11i1) {
        this.f16727OooO00o = li1l11i1;
        int OooO00o2 = li1l11i1.OooO00o();
        this.OooO00o = OooO00o2;
        this.OooO0OO = new byte[OooO00o2];
        if (OooO00o2 != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    private int OooO00o() {
        int size = this.f16725OooO00o.size();
        byte[] bArr = this.f16731OooO0O0;
        return size + (bArr == null ? 0 : bArr.length);
    }

    private int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2) {
        C6170iLLL r0 = new C6170iLLL(this.f16727OooO00o, this.OooO0O0 * 8);
        r0.OooO00o(this.f16726OooO00o);
        byte[] bArr3 = new byte[16];
        if (m16390OooO00o()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i3 = 2;
        bArr3[0] = (byte) (bArr3[0] | ((((r0.OooO00o() - 2) / 2) & 7) << 3));
        byte b = bArr3[0];
        byte[] bArr4 = this.f16729OooO00o;
        bArr3[0] = (byte) (b | (((15 - bArr4.length) - 1) & 7));
        System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i4 = i2;
        int i5 = 1;
        while (i4 > 0) {
            bArr3[16 - i5] = (byte) (i4 & 255);
            i4 >>>= 8;
            i5++;
        }
        r0.update(bArr3, 0, 16);
        if (m16390OooO00o()) {
            int OooO00o2 = OooO00o();
            if (OooO00o2 < 65280) {
                r0.update((byte) (OooO00o2 >> 8));
                r0.update((byte) OooO00o2);
            } else {
                r0.update((byte) -1);
                r0.update((byte) -2);
                r0.update((byte) (OooO00o2 >> 24));
                r0.update((byte) (OooO00o2 >> 16));
                r0.update((byte) (OooO00o2 >> 8));
                r0.update((byte) OooO00o2);
                i3 = 6;
            }
            byte[] bArr5 = this.f16731OooO0O0;
            if (bArr5 != null) {
                r0.update(bArr5, 0, bArr5.length);
            }
            if (this.f16725OooO00o.size() > 0) {
                r0.update(this.f16725OooO00o.OooO0O0(), 0, this.f16725OooO00o.size());
            }
            int i6 = (i3 + OooO00o2) % 16;
            if (i6 != 0) {
                while (i6 != 16) {
                    r0.update((byte) 0);
                    i6++;
                }
            }
        }
        r0.update(bArr, i, i2);
        return r0.OooO00o(bArr2, 0);
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m16390OooO00o() {
        return OooO00o() > 0;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(byte b, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        this.f16730OooO0O0.write(b);
        return 0;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(int i) {
        int size = i + this.f16730OooO0O0.size();
        if (this.f16728OooO00o) {
            return size + this.OooO0O0;
        }
        int i2 = this.OooO0O0;
        if (size < i2) {
            return 0;
        }
        return size - i2;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        int OooO0O02 = OooO0O0(this.f16730OooO0O0.OooO0O0(), 0, this.f16730OooO0O0.size(), bArr, i);
        reset();
        return OooO0O02;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        if (bArr.length >= i + i2) {
            this.f16730OooO0O0.write(bArr, i, i2);
            return 0;
        }
        throw new DataLengthException("Input buffer too short");
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public li1l11I1 m16391OooO00o() {
        return this.f16727OooO00o;
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16392OooO00o() {
        return this.f16727OooO00o.m17732OooO00o() + "/CCM";
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(byte b) {
        this.f16725OooO00o.write(b);
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) throws IllegalArgumentException {
        AbstractC6370iIIIl r3;
        this.f16728OooO00o = z;
        if (r4 instanceof C5553Iili) {
            C5553Iili r42 = (C5553Iili) r4;
            this.f16729OooO00o = r42.OooO0O0();
            this.f16731OooO0O0 = r42.m15833OooO00o();
            this.OooO0O0 = r42.OooO00o() / 8;
            r3 = r42.m15832OooO00o();
        } else if (r4 instanceof C6274iilL1L) {
            C6274iilL1L r43 = (C6274iilL1L) r4;
            this.f16729OooO00o = r43.m17301OooO00o();
            this.f16731OooO0O0 = null;
            this.OooO0O0 = this.OooO0OO.length / 2;
            r3 = r43.OooO00o();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to CCM: " + r4.getClass().getName());
        }
        if (r3 != null) {
            this.f16726OooO00o = r3;
        }
        byte[] bArr = this.f16729OooO00o;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        reset();
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(byte[] bArr, int i, int i2) {
        this.f16725OooO00o.write(bArr, i, i2);
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16393OooO00o() {
        int i = this.OooO0O0;
        byte[] bArr = new byte[i];
        System.arraycopy(this.OooO0OO, 0, bArr, 0, i);
        return bArr;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16394OooO00o(byte[] bArr, int i, int i2) throws IllegalStateException, InvalidCipherTextException {
        int i3;
        if (this.f16728OooO00o) {
            i3 = this.OooO0O0 + i2;
        } else {
            int i4 = this.OooO0O0;
            if (i2 >= i4) {
                i3 = i2 - i4;
            } else {
                throw new InvalidCipherTextException("data too short");
            }
        }
        byte[] bArr2 = new byte[i3];
        OooO0O0(bArr, i, i2, bArr2, 0);
        return bArr2;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO0O0(int i) {
        return 0;
    }

    public int OooO0O0(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, InvalidCipherTextException, DataLengthException {
        int i4;
        if (this.f16726OooO00o != null) {
            int length = 15 - this.f16729OooO00o.length;
            if (length >= 4 || i2 < (1 << (length * 8))) {
                byte[] bArr3 = new byte[this.OooO00o];
                bArr3[0] = (byte) ((length - 1) & 7);
                byte[] bArr4 = this.f16729OooO00o;
                System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
                lIliL1l lilil1l = new lIliL1l(this.f16727OooO00o);
                lilil1l.OooO00o(this.f16728OooO00o, new C6274iilL1L(this.f16726OooO00o, bArr3));
                if (this.f16728OooO00o) {
                    int i5 = this.OooO0O0 + i2;
                    if (bArr2.length >= i5 + i3) {
                        OooO00o(bArr, i, i2, this.OooO0OO);
                        byte[] bArr5 = new byte[this.OooO00o];
                        lilil1l.OooO00o(this.OooO0OO, 0, bArr5, 0);
                        int i6 = i;
                        int i7 = i3;
                        while (true) {
                            int i8 = i + i2;
                            int i9 = this.OooO00o;
                            if (i6 < i8 - i9) {
                                lilil1l.OooO00o(bArr, i6, bArr2, i7);
                                int i10 = this.OooO00o;
                                i7 += i10;
                                i6 += i10;
                            } else {
                                byte[] bArr6 = new byte[i9];
                                int i11 = i8 - i6;
                                System.arraycopy(bArr, i6, bArr6, 0, i11);
                                lilil1l.OooO00o(bArr6, 0, bArr6, 0);
                                System.arraycopy(bArr6, 0, bArr2, i7, i11);
                                System.arraycopy(bArr5, 0, bArr2, i3 + i2, this.OooO0O0);
                                return i5;
                            }
                        }
                    } else {
                        throw new OutputLengthException("Output buffer too short.");
                    }
                } else {
                    int i12 = this.OooO0O0;
                    if (i2 >= i12) {
                        int i13 = i2 - i12;
                        if (bArr2.length >= i13 + i3) {
                            int i14 = i + i13;
                            System.arraycopy(bArr, i14, this.OooO0OO, 0, i12);
                            byte[] bArr7 = this.OooO0OO;
                            lilil1l.OooO00o(bArr7, 0, bArr7, 0);
                            int i15 = this.OooO0O0;
                            while (true) {
                                byte[] bArr8 = this.OooO0OO;
                                if (i15 == bArr8.length) {
                                    break;
                                }
                                bArr8[i15] = 0;
                                i15++;
                            }
                            int i16 = i;
                            int i17 = i3;
                            while (true) {
                                i4 = this.OooO00o;
                                if (i16 >= i14 - i4) {
                                    break;
                                }
                                lilil1l.OooO00o(bArr, i16, bArr2, i17);
                                int i18 = this.OooO00o;
                                i17 += i18;
                                i16 += i18;
                            }
                            byte[] bArr9 = new byte[i4];
                            int i19 = i13 - (i16 - i);
                            System.arraycopy(bArr, i16, bArr9, 0, i19);
                            lilil1l.OooO00o(bArr9, 0, bArr9, 0);
                            System.arraycopy(bArr9, 0, bArr2, i17, i19);
                            byte[] bArr10 = new byte[this.OooO00o];
                            OooO00o(bArr2, i3, i13, bArr10);
                            if (C9586iIILl.OooO0O0(this.OooO0OO, bArr10)) {
                                return i13;
                            }
                            throw new InvalidCipherTextException("mac check in CCM failed");
                        }
                        throw new OutputLengthException("Output buffer too short.");
                    }
                    throw new InvalidCipherTextException("data too short");
                }
            } else {
                throw new IllegalStateException("CCM packet too large for choice of q.");
            }
        } else {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void reset() {
        this.f16727OooO00o.reset();
        this.f16725OooO00o.reset();
        this.f16730OooO0O0.reset();
    }
}
