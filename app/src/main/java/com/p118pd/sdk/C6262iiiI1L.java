package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.iiiI1L  reason: case insensitive filesystem */
public class C6262iiiI1L implements li1l11I1 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f17901OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17902OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17903OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17904OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f17905OooO0O0;
    public byte[] OooO0OO;
    public byte[] OooO0Oo;

    public C6262iiiI1L(li1l11I1 li1l11i1, boolean z) {
        this.f17901OooO00o = li1l11i1;
        this.f17904OooO0O0 = z;
        int OooO00o2 = li1l11i1.OooO00o();
        this.OooO0O0 = OooO00o2;
        this.f17903OooO00o = new byte[OooO00o2];
        this.f17905OooO0O0 = new byte[OooO00o2];
        this.OooO0OO = new byte[OooO00o2];
        this.OooO0Oo = new byte[OooO00o2];
    }

    private byte OooO00o(byte b, int i) {
        return (byte) (b ^ this.OooO0OO[i]);
    }

    private int OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3 = this.OooO0O0;
        if (i + i3 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 <= bArr2.length) {
            int i4 = 0;
            this.f17901OooO00o.OooO00o(this.f17905OooO0O0, 0, this.OooO0OO, 0);
            for (int i5 = 0; i5 < this.OooO0O0; i5++) {
                bArr2[i2 + i5] = OooO00o(bArr[i + i5], i5);
            }
            while (true) {
                int i6 = this.OooO0O0;
                if (i4 >= i6) {
                    return i6;
                }
                this.f17905OooO0O0[i4] = bArr[i + i4];
                i4++;
            }
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    private int OooO0OO(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3;
        int i4 = this.OooO0O0;
        if (i + i4 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + i4 <= bArr2.length) {
            int i5 = this.OooO00o;
            if (i5 == 0) {
                for (int i6 = 0; i6 < this.OooO0O0; i6++) {
                    this.f17905OooO0O0[i6] = bArr[i + i6];
                }
                this.f17901OooO00o.OooO00o(this.f17905OooO0O0, 0, this.OooO0OO, 0);
                this.OooO00o += this.OooO0O0;
                return 0;
            } else if (i5 == i4) {
                System.arraycopy(bArr, i, this.OooO0Oo, 0, i4);
                byte[] bArr3 = this.f17905OooO0O0;
                System.arraycopy(bArr3, 2, bArr3, 0, this.OooO0O0 - 2);
                byte[] bArr4 = this.f17905OooO0O0;
                int i7 = this.OooO0O0;
                byte[] bArr5 = this.OooO0Oo;
                bArr4[i7 - 2] = bArr5[0];
                bArr4[i7 - 1] = bArr5[1];
                this.f17901OooO00o.OooO00o(bArr4, 0, this.OooO0OO, 0);
                int i8 = 0;
                while (true) {
                    int i9 = this.OooO0O0;
                    if (i8 < i9 - 2) {
                        bArr2[i2 + i8] = OooO00o(this.OooO0Oo[i8 + 2], i8);
                        i8++;
                    } else {
                        System.arraycopy(this.OooO0Oo, 2, this.f17905OooO0O0, 0, i9 - 2);
                        this.OooO00o += 2;
                        return this.OooO0O0 - 2;
                    }
                }
            } else {
                if (i5 >= i4 + 2) {
                    System.arraycopy(bArr, i, this.OooO0Oo, 0, i4);
                    bArr2[i2 + 0] = OooO00o(this.OooO0Oo[0], this.OooO0O0 - 2);
                    bArr2[i2 + 1] = OooO00o(this.OooO0Oo[1], this.OooO0O0 - 1);
                    System.arraycopy(this.OooO0Oo, 0, this.f17905OooO0O0, this.OooO0O0 - 2, 2);
                    this.f17901OooO00o.OooO00o(this.f17905OooO0O0, 0, this.OooO0OO, 0);
                    int i10 = 0;
                    while (true) {
                        i3 = this.OooO0O0;
                        if (i10 >= i3 - 2) {
                            break;
                        }
                        bArr2[i2 + i10 + 2] = OooO00o(this.OooO0Oo[i10 + 2], i10);
                        i10++;
                    }
                    System.arraycopy(this.OooO0Oo, 2, this.f17905OooO0O0, 0, i3 - 2);
                }
                return this.OooO0O0;
            }
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    private int OooO0Oo(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3 = this.OooO0O0;
        if (i + i3 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 <= bArr2.length) {
            int i4 = 0;
            this.f17901OooO00o.OooO00o(this.f17905OooO0O0, 0, this.OooO0OO, 0);
            for (int i5 = 0; i5 < this.OooO0O0; i5++) {
                bArr2[i2 + i5] = OooO00o(bArr[i + i5], i5);
            }
            while (true) {
                int i6 = this.OooO0O0;
                if (i4 >= i6) {
                    return i6;
                }
                this.f17905OooO0O0[i4] = bArr2[i2 + i4];
                i4++;
            }
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    private int OooO0o0(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3;
        int i4;
        int i5 = this.OooO0O0;
        if (i + i5 <= bArr.length) {
            int i6 = this.OooO00o;
            if (i6 != 0) {
                if (i6 >= i5 + 2) {
                    if (i5 + i2 <= bArr2.length) {
                        this.f17901OooO00o.OooO00o(this.f17905OooO0O0, 0, this.OooO0OO, 0);
                        int i7 = 0;
                        while (true) {
                            i3 = this.OooO0O0;
                            if (i7 >= i3) {
                                break;
                            }
                            bArr2[i2 + i7] = OooO00o(bArr[i + i7], i7);
                            i7++;
                        }
                        System.arraycopy(bArr2, i2, this.f17905OooO0O0, 0, i3);
                    } else {
                        throw new OutputLengthException("output buffer too short");
                    }
                }
                return this.OooO0O0;
            } else if ((i5 * 2) + i2 + 2 <= bArr2.length) {
                this.f17901OooO00o.OooO00o(this.f17905OooO0O0, 0, this.OooO0OO, 0);
                int i8 = 0;
                while (true) {
                    i4 = this.OooO0O0;
                    if (i8 >= i4) {
                        break;
                    }
                    bArr2[i2 + i8] = OooO00o(this.f17903OooO00o[i8], i8);
                    i8++;
                }
                System.arraycopy(bArr2, i2, this.f17905OooO0O0, 0, i4);
                this.f17901OooO00o.OooO00o(this.f17905OooO0O0, 0, this.OooO0OO, 0);
                int i9 = this.OooO0O0;
                bArr2[i2 + i9] = OooO00o(this.f17903OooO00o[i9 - 2], 0);
                int i10 = this.OooO0O0;
                bArr2[i2 + i10 + 1] = OooO00o(this.f17903OooO00o[i10 - 1], 1);
                System.arraycopy(bArr2, i2 + 2, this.f17905OooO0O0, 0, this.OooO0O0);
                this.f17901OooO00o.OooO00o(this.f17905OooO0O0, 0, this.OooO0OO, 0);
                int i11 = 0;
                while (true) {
                    int i12 = this.OooO0O0;
                    if (i11 < i12) {
                        bArr2[i12 + i2 + 2 + i11] = OooO00o(bArr[i + i11], i11);
                        i11++;
                    } else {
                        System.arraycopy(bArr2, i2 + i12 + 2, this.f17905OooO0O0, 0, i12);
                        int i13 = this.OooO00o;
                        int i14 = this.OooO0O0;
                        this.OooO00o = i13 + (i14 * 2) + 2;
                        return (i14 * 2) + 2;
                    }
                }
            } else {
                throw new OutputLengthException("output buffer too short");
            }
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return this.f17901OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        return this.f17904OooO0O0 ? this.f17902OooO00o ? OooO0o0(bArr, i, bArr2, i2) : OooO0OO(bArr, i, bArr2, i2) : this.f17902OooO00o ? OooO0Oo(bArr, i, bArr2, i2) : OooO0O0(bArr, i, bArr2, i2);
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public li1l11I1 m17275OooO00o() {
        return this.f17901OooO00o;
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17276OooO00o() {
        StringBuilder sb;
        String str;
        if (this.f17904OooO0O0) {
            sb = new StringBuilder();
            sb.append(this.f17901OooO00o.m17732OooO00o());
            str = "/PGPCFBwithIV";
        } else {
            sb = new StringBuilder();
            sb.append(this.f17901OooO00o.m17732OooO00o());
            str = "/PGPCFB";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r8) throws IllegalArgumentException {
        li1l11I1 li1l11i1;
        this.f17902OooO00o = z;
        if (r8 instanceof C6274iilL1L) {
            C6274iilL1L r82 = (C6274iilL1L) r8;
            byte[] OooO00o2 = r82.m17301OooO00o();
            int length = OooO00o2.length;
            byte[] bArr = this.f17903OooO00o;
            if (length < bArr.length) {
                System.arraycopy(OooO00o2, 0, bArr, bArr.length - OooO00o2.length, OooO00o2.length);
                int i = 0;
                while (true) {
                    byte[] bArr2 = this.f17903OooO00o;
                    if (i >= bArr2.length - OooO00o2.length) {
                        break;
                    }
                    bArr2[i] = 0;
                    i++;
                }
            } else {
                System.arraycopy(OooO00o2, 0, bArr, 0, bArr.length);
            }
            reset();
            li1l11i1 = this.f17901OooO00o;
            r8 = r82.OooO00o();
        } else {
            reset();
            li1l11i1 = this.f17901OooO00o;
        }
        li1l11i1.OooO00o(true, r8);
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
        this.OooO00o = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f17905OooO0O0;
            if (i != bArr.length) {
                if (this.f17904OooO0O0) {
                    bArr[i] = 0;
                } else {
                    bArr[i] = this.f17903OooO00o[i];
                }
                i++;
            } else {
                this.f17901OooO00o.reset();
                return;
            }
        }
    }
}
