package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.IL丨I1lI  reason: invalid class name */
public class ILI1lI implements li1l11I1 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f15648OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15649OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15650OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f15651OooO0O0;
    public byte[] OooO0OO;

    public ILI1lI(li1l11I1 li1l11i1) {
        this.f15648OooO00o = li1l11i1;
        int OooO00o2 = li1l11i1.OooO00o();
        this.OooO0O0 = OooO00o2;
        this.f15650OooO00o = new byte[OooO00o2];
        this.f15651OooO0O0 = new byte[OooO00o2];
        this.OooO0OO = new byte[OooO00o2];
    }

    private byte OooO00o(byte b, int i) {
        return (byte) (b ^ this.OooO0OO[i]);
    }

    private int OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3;
        int i4;
        int i5;
        int i6 = this.OooO0O0;
        if (i + i6 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + i6 <= bArr2.length) {
            int i7 = this.OooO00o;
            int i8 = 2;
            int i9 = 0;
            if (i7 > i6) {
                byte b = bArr[i];
                this.f15651OooO0O0[i6 - 2] = b;
                bArr2[i2] = OooO00o(b, i6 - 2);
                byte b2 = bArr[i + 1];
                byte[] bArr3 = this.f15651OooO0O0;
                int i10 = this.OooO0O0;
                bArr3[i10 - 1] = b2;
                bArr2[i2 + 1] = OooO00o(b2, i10 - 1);
                this.f15648OooO00o.OooO00o(this.f15651OooO0O0, 0, this.OooO0OO, 0);
                while (i8 < this.OooO0O0) {
                    byte b3 = bArr[i + i8];
                    int i11 = i8 - 2;
                    this.f15651OooO0O0[i11] = b3;
                    bArr2[i2 + i8] = OooO00o(b3, i11);
                    i8++;
                }
            } else {
                if (i7 == 0) {
                    this.f15648OooO00o.OooO00o(this.f15651OooO0O0, 0, this.OooO0OO, 0);
                    while (true) {
                        i5 = this.OooO0O0;
                        if (i9 >= i5) {
                            break;
                        }
                        int i12 = i + i9;
                        this.f15651OooO0O0[i9] = bArr[i12];
                        bArr2[i9] = OooO00o(bArr[i12], i9);
                        i9++;
                    }
                    i4 = this.OooO00o + i5;
                } else if (i7 == i6) {
                    this.f15648OooO00o.OooO00o(this.f15651OooO0O0, 0, this.OooO0OO, 0);
                    byte b4 = bArr[i];
                    byte b5 = bArr[i + 1];
                    bArr2[i2] = OooO00o(b4, 0);
                    bArr2[i2 + 1] = OooO00o(b5, 1);
                    byte[] bArr4 = this.f15651OooO0O0;
                    System.arraycopy(bArr4, 2, bArr4, 0, this.OooO0O0 - 2);
                    byte[] bArr5 = this.f15651OooO0O0;
                    int i13 = this.OooO0O0;
                    bArr5[i13 - 2] = b4;
                    bArr5[i13 - 1] = b5;
                    this.f15648OooO00o.OooO00o(bArr5, 0, this.OooO0OO, 0);
                    while (true) {
                        i3 = this.OooO0O0;
                        if (i8 >= i3) {
                            break;
                        }
                        byte b6 = bArr[i + i8];
                        int i14 = i8 - 2;
                        this.f15651OooO0O0[i14] = b6;
                        bArr2[i2 + i8] = OooO00o(b6, i14);
                        i8++;
                    }
                    i4 = this.OooO00o + i3;
                }
                this.OooO00o = i4;
            }
            return this.OooO0O0;
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
            int i6 = 2;
            int i7 = 0;
            if (i5 > i4) {
                byte[] bArr3 = this.f15651OooO0O0;
                int i8 = i4 - 2;
                byte OooO00o2 = OooO00o(bArr[i], i4 - 2);
                bArr2[i2] = OooO00o2;
                bArr3[i8] = OooO00o2;
                byte[] bArr4 = this.f15651OooO0O0;
                int i9 = this.OooO0O0;
                int i10 = i9 - 1;
                byte OooO00o3 = OooO00o(bArr[i + 1], i9 - 1);
                bArr2[i2 + 1] = OooO00o3;
                bArr4[i10] = OooO00o3;
                this.f15648OooO00o.OooO00o(this.f15651OooO0O0, 0, this.OooO0OO, 0);
                while (i6 < this.OooO0O0) {
                    byte[] bArr5 = this.f15651OooO0O0;
                    int i11 = i6 - 2;
                    byte OooO00o4 = OooO00o(bArr[i + i6], i11);
                    bArr2[i2 + i6] = OooO00o4;
                    bArr5[i11] = OooO00o4;
                    i6++;
                }
            } else {
                if (i5 != 0) {
                    if (i5 == i4) {
                        this.f15648OooO00o.OooO00o(this.f15651OooO0O0, 0, this.OooO0OO, 0);
                        bArr2[i2] = OooO00o(bArr[i], 0);
                        bArr2[i2 + 1] = OooO00o(bArr[i + 1], 1);
                        byte[] bArr6 = this.f15651OooO0O0;
                        System.arraycopy(bArr6, 2, bArr6, 0, this.OooO0O0 - 2);
                        System.arraycopy(bArr2, i2, this.f15651OooO0O0, this.OooO0O0 - 2, 2);
                        this.f15648OooO00o.OooO00o(this.f15651OooO0O0, 0, this.OooO0OO, 0);
                        while (true) {
                            i3 = this.OooO0O0;
                            if (i6 >= i3) {
                                break;
                            }
                            byte[] bArr7 = this.f15651OooO0O0;
                            int i12 = i6 - 2;
                            byte OooO00o5 = OooO00o(bArr[i + i6], i12);
                            bArr2[i2 + i6] = OooO00o5;
                            bArr7[i12] = OooO00o5;
                            i6++;
                        }
                    }
                } else {
                    this.f15648OooO00o.OooO00o(this.f15651OooO0O0, 0, this.OooO0OO, 0);
                    while (true) {
                        i3 = this.OooO0O0;
                        if (i7 >= i3) {
                            break;
                        }
                        byte[] bArr8 = this.f15651OooO0O0;
                        byte OooO00o6 = OooO00o(bArr[i + i7], i7);
                        bArr2[i2 + i7] = OooO00o6;
                        bArr8[i7] = OooO00o6;
                        i7++;
                    }
                }
                this.OooO00o += i3;
            }
            return this.OooO0O0;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return this.f15648OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        return this.f15649OooO00o ? OooO0OO(bArr, i, bArr2, i2) : OooO0O0(bArr, i, bArr2, i2);
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public li1l11I1 m15535OooO00o() {
        return this.f15648OooO00o;
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15536OooO00o() {
        return this.f15648OooO00o.m17732OooO00o() + "/OpenPGPCFB";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r3) throws IllegalArgumentException {
        this.f15649OooO00o = z;
        reset();
        this.f15648OooO00o.OooO00o(true, r3);
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
        this.OooO00o = 0;
        byte[] bArr = this.f15650OooO00o;
        byte[] bArr2 = this.f15651OooO0O0;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f15648OooO00o.reset();
    }
}
