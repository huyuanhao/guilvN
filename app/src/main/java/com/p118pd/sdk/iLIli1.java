package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.iLIl丨i1丨  reason: invalid class name */
public class iLIli1 implements LLLi1iII {
    public static final int OooO0o0 = 16;
    public byte[] OooO;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f17700OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5568IL1 f17701OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f17702OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9827L f17703OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17704OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17705OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f17706OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17707OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f17708OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public long f17709OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f17710OooO0OO;
    public int OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public byte[] f17711OooO0Oo;
    public byte[] OooO0o;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public byte[] f17712OooO0o0;
    public byte[] OooO0oO;
    public byte[] OooO0oo;
    public byte[] OooOO0;
    public byte[] OooOO0O;
    public byte[] OooOO0o;

    public iLIli1(li1l11I1 li1l11i1) {
        this(li1l11i1, null);
    }

    public iLIli1(li1l11I1 li1l11i1, AbstractC5568IL1 r4) {
        if (li1l11i1.OooO00o() == 16) {
            r4 = r4 == null ? new C1677Il() : r4;
            this.f17702OooO00o = li1l11i1;
            this.f17701OooO00o = r4;
            return;
        }
        throw new IllegalArgumentException("cipher required with a block size of 16.");
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    private void OooO00o() {
        if (this.f17707OooO0O0) {
            return;
        }
        if (this.f17704OooO00o) {
            throw new IllegalStateException("GCM cipher cannot be reused for encryption");
        }
        throw new IllegalStateException("GCM cipher needs to be initialised");
    }

    private void OooO00o(boolean z) {
        this.f17702OooO00o.reset();
        this.OooO0oo = new byte[16];
        this.OooO = new byte[16];
        this.OooOO0 = new byte[16];
        this.OooOO0o = new byte[16];
        this.OooO0Oo = 0;
        this.f17706OooO0O0 = 0;
        this.f17709OooO0OO = 0;
        this.OooOO0O = C9586iIILl.m21630OooO00o(this.f17712OooO0o0);
        this.OooO0O0 = -2;
        this.OooO0OO = 0;
        this.f17700OooO00o = 0;
        byte[] bArr = this.OooO0o;
        if (bArr != null) {
            C9586iIILl.OooO00o(bArr, (byte) 0);
        }
        if (z) {
            this.OooO0oO = null;
        }
        if (this.f17704OooO00o) {
            this.f17707OooO0O0 = false;
            return;
        }
        byte[] bArr2 = this.f17710OooO0OO;
        if (bArr2 != null) {
            OooO00o(bArr2, 0, bArr2.length);
        }
    }

    private void OooO00o(byte[] bArr) {
        int i = this.OooO0O0;
        if (i != 0) {
            this.OooO0O0 = i - 1;
            byte[] bArr2 = this.OooOO0O;
            int i2 = (bArr2[15] & 255) + 1;
            bArr2[15] = (byte) i2;
            int i3 = (i2 >>> 8) + (bArr2[14] & 255);
            bArr2[14] = (byte) i3;
            int i4 = (i3 >>> 8) + (bArr2[13] & 255);
            bArr2[13] = (byte) i4;
            bArr2[12] = (byte) ((i4 >>> 8) + (bArr2[12] & 255));
            this.f17702OooO00o.OooO00o(bArr2, 0, bArr, 0);
            return;
        }
        throw new IllegalStateException("Attempt to process too many blocks");
    }

    @Override // com.p118pd.sdk.LLLi1iII
    private void OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3 = new byte[16];
        OooO00o(bArr3);
        if (this.f17704OooO00o) {
            liL1I.OooO00o(bArr, i, bArr3, 0, i2);
            OooO00o(this.OooO0oo, bArr, i, i2);
        } else {
            OooO00o(this.OooO0oo, bArr, i, i2);
            liL1I.OooO00o(bArr, i, bArr3, 0, i2);
        }
        System.arraycopy(bArr, i, bArr2, i3, i2);
        this.f17700OooO00o += (long) i2;
    }

    private void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr2.length - i2 >= 16) {
            if (this.f17700OooO00o == 0) {
                OooO0O0();
            }
            byte[] bArr3 = new byte[16];
            OooO00o(bArr3);
            if (this.f17704OooO00o) {
                liL1I.OooO00o(bArr3, bArr, i);
                OooO00o(this.OooO0oo, bArr3);
                System.arraycopy(bArr3, 0, bArr2, i2, 16);
            } else {
                OooO0O0(this.OooO0oo, bArr, i);
                liL1I.OooO00o(bArr3, 0, bArr, i, bArr2, i2);
            }
            this.f17700OooO00o += 16;
            return;
        }
        throw new OutputLengthException("Output buffer too short");
    }

    private void OooO00o(byte[] bArr, byte[] bArr2) {
        liL1I.OooO0O0(bArr, bArr2);
        this.f17701OooO00o.OooO0O0(bArr);
    }

    private void OooO00o(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2 += 16) {
            OooO00o(bArr, bArr2, i2, Math.min(i - i2, 16));
        }
    }

    private void OooO00o(byte[] bArr, byte[] bArr2, int i, int i2) {
        liL1I.OooO00o(bArr, bArr2, i, i2);
        this.f17701OooO00o.OooO0O0(bArr);
    }

    private void OooO0O0() {
        if (this.f17706OooO0O0 > 0) {
            System.arraycopy(this.OooO, 0, this.OooOO0, 0, 16);
            this.f17709OooO0OO = this.f17706OooO0O0;
        }
        int i = this.OooO0Oo;
        if (i > 0) {
            OooO00o(this.OooOO0, this.OooOO0o, 0, i);
            this.f17709OooO0OO += (long) this.OooO0Oo;
        }
        if (this.f17709OooO0OO > 0) {
            System.arraycopy(this.OooOO0, 0, this.OooO0oo, 0, 16);
        }
    }

    private void OooO0O0(byte[] bArr, byte[] bArr2, int i) {
        liL1I.OooO00o(bArr, bArr2, i);
        this.f17701OooO00o.OooO0O0(bArr);
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(byte b, byte[] bArr, int i) throws DataLengthException {
        OooO00o();
        byte[] bArr2 = this.OooO0o;
        int i2 = this.OooO0OO;
        bArr2[i2] = b;
        int i3 = i2 + 1;
        this.OooO0OO = i3;
        if (i3 != bArr2.length) {
            return 0;
        }
        OooO00o(bArr2, 0, bArr, i);
        if (this.f17704OooO00o) {
            this.OooO0OO = 0;
        } else {
            byte[] bArr3 = this.OooO0o;
            System.arraycopy(bArr3, 16, bArr3, 0, this.OooO00o);
            this.OooO0OO = this.OooO00o;
        }
        return 16;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(int i) {
        int i2 = i + this.OooO0OO;
        if (this.f17704OooO00o) {
            return i2 + this.OooO00o;
        }
        int i3 = this.OooO00o;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        OooO00o();
        if (this.f17700OooO00o == 0) {
            OooO0O0();
        }
        int i2 = this.OooO0OO;
        if (!this.f17704OooO00o) {
            int i3 = this.OooO00o;
            if (i2 >= i3) {
                i2 -= i3;
                if (bArr.length - i < i2) {
                    throw new OutputLengthException("Output buffer too short");
                }
            } else {
                throw new InvalidCipherTextException("data too short");
            }
        } else if (bArr.length - i < this.OooO00o + i2) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (i2 > 0) {
            OooO00o(this.OooO0o, 0, i2, bArr, i);
        }
        long j = this.f17706OooO0O0;
        int i4 = this.OooO0Oo;
        long j2 = j + ((long) i4);
        this.f17706OooO0O0 = j2;
        if (j2 > this.f17709OooO0OO) {
            if (i4 > 0) {
                OooO00o(this.OooO, this.OooOO0o, 0, i4);
            }
            if (this.f17709OooO0OO > 0) {
                liL1I.OooO0O0(this.OooO, this.OooOO0);
            }
            long j3 = ((this.f17700OooO00o * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.f17703OooO00o == null) {
                LIllL11 r4 = new LIllL11();
                this.f17703OooO00o = r4;
                r4.OooO00o(this.f17711OooO0Oo);
            }
            this.f17703OooO00o.OooO00o(j3, bArr2);
            liL1I.OooO00o(this.OooO, bArr2);
            liL1I.OooO0O0(this.OooO0oo, this.OooO);
        }
        byte[] bArr3 = new byte[16];
        AbstractC6464l1l.OooO00o(this.f17706OooO0O0 * 8, bArr3, 0);
        AbstractC6464l1l.OooO00o(this.f17700OooO00o * 8, bArr3, 8);
        OooO00o(this.OooO0oo, bArr3);
        byte[] bArr4 = new byte[16];
        this.f17702OooO00o.OooO00o(this.f17712OooO0o0, 0, bArr4, 0);
        liL1I.OooO0O0(bArr4, this.OooO0oo);
        int i5 = this.OooO00o;
        byte[] bArr5 = new byte[i5];
        this.OooO0oO = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, i5);
        if (this.f17704OooO00o) {
            System.arraycopy(this.OooO0oO, 0, bArr, i + this.OooO0OO, this.OooO00o);
            i2 += this.OooO00o;
        } else {
            int i6 = this.OooO00o;
            byte[] bArr6 = new byte[i6];
            System.arraycopy(this.OooO0o, i2, bArr6, 0, i6);
            if (!C9586iIILl.OooO0O0(this.OooO0oO, bArr6)) {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        OooO00o(false);
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034 A[LOOP:1: B:12:0x0032->B:13:0x0034, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    @Override // com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int m17103OooO00o(byte[] r8, int r9, int r10, byte[] r11, int r12) throws org.bouncycastle.crypto.DataLengthException {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.iLIli1.m17103OooO00o(byte[], int, int, byte[], int):int");
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public li1l11I1 m17104OooO00o() {
        return this.f17702OooO00o;
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17105OooO00o() {
        return this.f17702OooO00o.m17732OooO00o() + "/GCM";
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(byte b) {
        OooO00o();
        byte[] bArr = this.OooOO0o;
        int i = this.OooO0Oo;
        bArr[i] = b;
        int i2 = i + 1;
        this.OooO0Oo = i2;
        if (i2 == 16) {
            OooO00o(this.OooO, bArr);
            this.OooO0Oo = 0;
            this.f17706OooO0O0 += 16;
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(boolean z, AbstractC6370iIIIl r9) throws IllegalArgumentException {
        C6642li1LI r92;
        byte[] bArr;
        byte[] bArr2;
        this.f17704OooO00o = z;
        this.OooO0oO = null;
        this.f17707OooO0O0 = true;
        if (r9 instanceof C5553Iili) {
            C5553Iili r93 = (C5553Iili) r9;
            bArr = r93.OooO0O0();
            this.f17710OooO0OO = r93.m15833OooO00o();
            int OooO00o2 = r93.OooO00o();
            if (OooO00o2 < 32 || OooO00o2 > 128 || OooO00o2 % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + OooO00o2);
            }
            this.OooO00o = OooO00o2 / 8;
            r92 = r93.m15832OooO00o();
        } else if (r9 instanceof C6274iilL1L) {
            C6274iilL1L r94 = (C6274iilL1L) r9;
            bArr = r94.m17301OooO00o();
            this.f17710OooO0OO = null;
            this.OooO00o = 16;
            r92 = (C6642li1LI) r94.OooO00o();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to GCM");
        }
        this.OooO0o = new byte[(z ? 16 : this.OooO00o + 16)];
        if (bArr == null || bArr.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z && (bArr2 = this.f17708OooO0O0) != null && C9586iIILl.m21627OooO00o(bArr2, bArr)) {
            if (r92 != null) {
                byte[] bArr3 = this.f17705OooO00o;
                if (bArr3 != null && C9586iIILl.m21627OooO00o(bArr3, r92.OooO00o())) {
                    throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                }
            } else {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.f17708OooO0O0 = bArr;
        if (r92 != null) {
            this.f17705OooO00o = r92.OooO00o();
        }
        if (r92 != null) {
            this.f17702OooO00o.OooO00o(true, r92);
            byte[] bArr4 = new byte[16];
            this.f17711OooO0Oo = bArr4;
            this.f17702OooO00o.OooO00o(bArr4, 0, bArr4, 0);
            this.f17701OooO00o.OooO00o(this.f17711OooO0Oo);
            this.f17703OooO00o = null;
        } else if (this.f17711OooO0Oo == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr5 = new byte[16];
        this.f17712OooO0o0 = bArr5;
        byte[] bArr6 = this.f17708OooO0O0;
        if (bArr6.length == 12) {
            System.arraycopy(bArr6, 0, bArr5, 0, bArr6.length);
            this.f17712OooO0o0[15] = 1;
        } else {
            OooO00o(bArr5, bArr6, bArr6.length);
            byte[] bArr7 = new byte[16];
            AbstractC6464l1l.OooO00o(((long) this.f17708OooO0O0.length) * 8, bArr7, 8);
            OooO00o(this.f17712OooO0o0, bArr7);
        }
        this.OooO0oo = new byte[16];
        this.OooO = new byte[16];
        this.OooOO0 = new byte[16];
        this.OooOO0o = new byte[16];
        this.OooO0Oo = 0;
        this.f17706OooO0O0 = 0;
        this.f17709OooO0OO = 0;
        this.OooOO0O = C9586iIILl.m21630OooO00o(this.f17712OooO0o0);
        this.OooO0O0 = -2;
        this.OooO0OO = 0;
        this.f17700OooO00o = 0;
        byte[] bArr8 = this.f17710OooO0OO;
        if (bArr8 != null) {
            OooO00o(bArr8, 0, bArr8.length);
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(byte[] bArr, int i, int i2) {
        OooO00o();
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.OooOO0o;
            int i4 = this.OooO0Oo;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.OooO0Oo = i5;
            if (i5 == 16) {
                OooO00o(this.OooO, bArr2);
                this.OooO0Oo = 0;
                this.f17706OooO0O0 += 16;
            }
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17106OooO00o() {
        byte[] bArr = this.OooO0oO;
        return bArr == null ? new byte[this.OooO00o] : C9586iIILl.m21630OooO00o(bArr);
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO0O0(int i) {
        int i2 = i + this.OooO0OO;
        if (!this.f17704OooO00o) {
            int i3 = this.OooO00o;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % 16);
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void reset() {
        OooO00o(true);
    }
}
