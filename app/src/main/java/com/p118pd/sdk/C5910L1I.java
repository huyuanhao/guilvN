package com.p118pd.sdk;

import com.umeng.commonsdk.proguard.C3587az;
import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.L丨丨1丨I  reason: invalid class name and case insensitive filesystem */
public class C5910L1I implements AbstractC6769llL1L {
    public int OooO00o = 8;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16925OooO00o = true;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16926OooO00o = new byte[8];

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f16927OooO00o = null;
    public int OooO0O0 = 4;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f16928OooO0O0 = new byte[8];
    public int OooO0OO = 0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f16929OooO0OO = null;
    public byte[] OooO0Oo = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, C3587az.f9268l, 15, 12, 0, 13, 5, 3, 7, C3587az.f9268l, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, C3587az.f9268l, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, C3587az.f9268l, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, C3587az.f9268l, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, C3587az.f9268l, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, C3587az.f9268l, 11, 10, 15, 5, 0, 12, C3587az.f9268l, 8, 6, 2, 3, 9, 1, 7, 13, 4};

    private int OooO00o(int i, int i2) {
        int i3 = i2 + i;
        byte[] bArr = this.OooO0Oo;
        int i4 = (bArr[((i3 >> 0) & 15) + 0] << 0) + (bArr[((i3 >> 4) & 15) + 16] << 4) + (bArr[((i3 >> 8) & 15) + 32] << 8) + (bArr[((i3 >> 12) & 15) + 48] << 12) + (bArr[((i3 >> 16) & 15) + 64] << 16) + (bArr[((i3 >> 20) & 15) + 80] << 20) + (bArr[((i3 >> 24) & 15) + 96] << 24) + (bArr[((i3 >> 28) & 15) + 112] << C8026oOO00oOo.OooO00o);
        return (i4 << 11) | (i4 >>> 21);
    }

    private void OooO00o(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    private void OooO00o(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        int OooO0O02 = OooO0O0(bArr, i);
        int OooO0O03 = OooO0O0(bArr, i + 4);
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = 0;
            while (i4 < 8) {
                i4++;
                OooO0O02 = OooO0O03 ^ OooO00o(OooO0O02, iArr[i4]);
                OooO0O03 = OooO0O02;
            }
        }
        OooO00o(OooO0O02, bArr2, i2);
        OooO00o(OooO0O03, bArr2, i2 + 4);
    }

    private byte[] OooO00o(byte[] bArr, int i, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr.length - i)];
        System.arraycopy(bArr, i, bArr3, 0, bArr2.length);
        for (int i2 = 0; i2 != bArr2.length; i2++) {
            bArr3[i2] = (byte) (bArr3[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    private int[] OooO00o(byte[] bArr) {
        if (bArr.length == 32) {
            int[] iArr = new int[8];
            for (int i = 0; i != 8; i++) {
                iArr[i] = OooO0O0(bArr, i * 4);
            }
            return iArr;
        }
        throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
    }

    private int OooO0O0(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & -16777216) + ((bArr[i + 2] << 16) & C7265o0O000oo.OooOo0O) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        while (true) {
            int i2 = this.OooO0OO;
            if (i2 >= this.OooO00o) {
                break;
            }
            this.f16926OooO00o[i2] = 0;
            this.OooO0OO = i2 + 1;
        }
        byte[] bArr2 = this.f16926OooO00o;
        byte[] bArr3 = new byte[bArr2.length];
        System.arraycopy(bArr2, 0, bArr3, 0, this.f16928OooO0O0.length);
        if (this.f16925OooO00o) {
            this.f16925OooO00o = false;
        } else {
            bArr3 = OooO00o(this.f16926OooO00o, 0, this.f16928OooO0O0);
        }
        OooO00o(this.f16927OooO00o, bArr3, 0, this.f16928OooO0O0, 0);
        byte[] bArr4 = this.f16928OooO0O0;
        int i3 = this.OooO0O0;
        System.arraycopy(bArr4, (bArr4.length / 2) - i3, bArr, i, i3);
        reset();
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16491OooO00o() {
        return "GOST28147Mac";
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void OooO00o(AbstractC6370iIIIl r5) throws IllegalArgumentException {
        reset();
        this.f16926OooO00o = new byte[this.OooO00o];
        this.f16929OooO0OO = null;
        if (r5 instanceof C9374IiI) {
            C9374IiI r52 = (C9374IiI) r5;
            System.arraycopy(r52.m21446OooO00o(), 0, this.OooO0Oo, 0, r52.m21446OooO00o().length);
            if (r52.OooO00o() != null) {
                this.f16927OooO00o = OooO00o(((C6642li1LI) r52.OooO00o()).OooO00o());
            }
        } else if (r5 instanceof C6642li1LI) {
            this.f16927OooO00o = OooO00o(((C6642li1LI) r5).OooO00o());
        } else if (r5 instanceof C6274iilL1L) {
            C6274iilL1L r53 = (C6274iilL1L) r5;
            this.f16927OooO00o = OooO00o(((C6642li1LI) r53.OooO00o()).OooO00o());
            byte[] OooO00o2 = r53.m17301OooO00o();
            byte[] bArr = this.f16928OooO0O0;
            System.arraycopy(OooO00o2, 0, bArr, 0, bArr.length);
            this.f16929OooO0OO = r53.m17301OooO00o();
        } else {
            throw new IllegalArgumentException("invalid parameter passed to GOST28147 init - " + r5.getClass().getName());
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f16926OooO00o;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.OooO0OO = 0;
                this.f16925OooO00o = true;
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte b) throws IllegalStateException {
        int i = this.OooO0OO;
        byte[] bArr = this.f16926OooO00o;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, this.f16928OooO0O0.length);
            if (this.f16925OooO00o) {
                this.f16925OooO00o = false;
                byte[] bArr3 = this.f16929OooO0OO;
                if (bArr3 != null) {
                    bArr2 = OooO00o(this.f16926OooO00o, 0, bArr3);
                }
            } else {
                bArr2 = OooO00o(this.f16926OooO00o, 0, this.f16928OooO0O0);
            }
            OooO00o(this.f16927OooO00o, bArr2, 0, this.f16928OooO0O0, 0);
            this.OooO0OO = 0;
        }
        byte[] bArr4 = this.f16926OooO00o;
        int i2 = this.OooO0OO;
        this.OooO0OO = i2 + 1;
        bArr4[i2] = b;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        if (i2 >= 0) {
            int i3 = this.OooO00o;
            int i4 = this.OooO0OO;
            int i5 = i3 - i4;
            if (i2 > i5) {
                System.arraycopy(bArr, i, this.f16926OooO00o, i4, i5);
                byte[] bArr2 = this.f16926OooO00o;
                byte[] bArr3 = new byte[bArr2.length];
                System.arraycopy(bArr2, 0, bArr3, 0, this.f16928OooO0O0.length);
                if (this.f16925OooO00o) {
                    this.f16925OooO00o = false;
                    byte[] bArr4 = this.f16929OooO0OO;
                    if (bArr4 != null) {
                        bArr3 = OooO00o(this.f16926OooO00o, 0, bArr4);
                    }
                } else {
                    bArr3 = OooO00o(this.f16926OooO00o, 0, this.f16928OooO0O0);
                }
                OooO00o(this.f16927OooO00o, bArr3, 0, this.f16928OooO0O0, 0);
                this.OooO0OO = 0;
                while (true) {
                    i2 -= i5;
                    i += i5;
                    if (i2 <= this.OooO00o) {
                        break;
                    }
                    OooO00o(this.f16927OooO00o, OooO00o(bArr, i, this.f16928OooO0O0), 0, this.f16928OooO0O0, 0);
                    i5 = this.OooO00o;
                }
            }
            System.arraycopy(bArr, i, this.f16926OooO00o, this.OooO0OO, i2);
            this.OooO0OO += i2;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
