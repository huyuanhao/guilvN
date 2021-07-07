package com.p118pd.sdk;

import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.LLl丨L  reason: invalid class name and case insensitive filesystem */
public class C5672LLlL implements AbstractC9875iiI {
    public li1l11I1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6642li1LI f16514OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16515OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16516OooO00o;
    public byte[] OooO0O0;
    public byte[] OooO0OO = null;

    public C5672LLlL(li1l11I1 li1l11i1) {
        byte[] bArr = {-90, 89, 89, -90};
        this.f16516OooO00o = bArr;
        this.OooO0O0 = bArr;
        this.OooO00o = li1l11i1;
    }

    private byte[] OooO00o(byte[] bArr) {
        int length = bArr.length;
        int i = (8 - (length % 8)) % 8;
        byte[] bArr2 = new byte[(length + i)];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        if (i != 0) {
            System.arraycopy(new byte[i], 0, bArr2, length, i);
        }
        return bArr2;
    }

    private byte[] OooO0OO(byte[] bArr, int i, int i2) {
        int i3 = i2 - 8;
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[8];
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, i, bArr3, 0, 8);
        System.arraycopy(bArr, i + 8, bArr2, 0, i3);
        this.OooO00o.OooO00o(false, this.f16514OooO00o);
        int i4 = (i2 / 8) - 1;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = i4; i6 >= 1; i6--) {
                System.arraycopy(bArr3, 0, bArr4, 0, 8);
                int i7 = (i6 - 1) * 8;
                System.arraycopy(bArr2, i7, bArr4, 8, 8);
                int i8 = (i4 * i5) + i6;
                int i9 = 1;
                while (i8 != 0) {
                    int i10 = 8 - i9;
                    bArr4[i10] = (byte) (((byte) i8) ^ bArr4[i10]);
                    i8 >>>= 8;
                    i9++;
                }
                this.OooO00o.OooO00o(bArr4, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr2, i7, 8);
            }
        }
        this.OooO0OO = bArr3;
        return bArr2;
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public String OooO00o() {
        return this.OooO00o.m17732OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public void OooO00o(boolean z, AbstractC6370iIIIl r2) {
        this.f16515OooO00o = z;
        if (r2 instanceof liLL1l) {
            r2 = ((liLL1l) r2).OooO00o();
        }
        if (r2 instanceof C6642li1LI) {
            this.f16514OooO00o = (C6642li1LI) r2;
            this.OooO0O0 = this.f16516OooO00o;
        } else if (r2 instanceof C6274iilL1L) {
            C6274iilL1L r22 = (C6274iilL1L) r2;
            this.OooO0O0 = r22.m17301OooO00o();
            this.f16514OooO00o = (C6642li1LI) r22.OooO00o();
            if (this.OooO0O0.length != 4) {
                throw new IllegalArgumentException("IV length not equal to 4");
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public byte[] OooO00o(byte[] bArr, int i, int i2) {
        if (this.f16515OooO00o) {
            byte[] bArr2 = new byte[8];
            byte[] OooO00o2 = AbstractC6464l1l.OooO00o(i2);
            byte[] bArr3 = this.OooO0O0;
            int i3 = 0;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
            System.arraycopy(OooO00o2, 0, bArr2, this.OooO0O0.length, OooO00o2.length);
            byte[] bArr4 = new byte[i2];
            System.arraycopy(bArr, i, bArr4, 0, i2);
            byte[] OooO00o3 = OooO00o(bArr4);
            if (OooO00o3.length == 8) {
                int length = OooO00o3.length + 8;
                byte[] bArr5 = new byte[length];
                System.arraycopy(bArr2, 0, bArr5, 0, 8);
                System.arraycopy(OooO00o3, 0, bArr5, 8, OooO00o3.length);
                this.OooO00o.OooO00o(true, this.f16514OooO00o);
                while (i3 < length) {
                    this.OooO00o.OooO00o(bArr5, i3, bArr5, i3);
                    i3 += this.OooO00o.OooO00o();
                }
                return bArr5;
            }
            C6099iILlI iilli = new C6099iILlI(this.OooO00o);
            iilli.OooO00o(true, new C6274iilL1L(this.f16514OooO00o, bArr2));
            return iilli.OooO00o(OooO00o3, 0, OooO00o3.length);
        }
        throw new IllegalStateException("not set for wrapping");
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public byte[] OooO0O0(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArr2;
        if (!this.f16515OooO00o) {
            int i3 = i2 / 8;
            if (i3 * 8 != i2) {
                throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
            } else if (i3 != 1) {
                byte[] bArr3 = new byte[i2];
                System.arraycopy(bArr, i, bArr3, 0, i2);
                byte[] bArr4 = new byte[i2];
                if (i3 == 2) {
                    this.OooO00o.OooO00o(false, this.f16514OooO00o);
                    int i4 = 0;
                    while (i4 < i2) {
                        this.OooO00o.OooO00o(bArr3, i4, bArr4, i4);
                        i4 += this.OooO00o.OooO00o();
                    }
                    byte[] bArr5 = new byte[8];
                    this.OooO0OO = bArr5;
                    System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
                    byte[] bArr6 = this.OooO0OO;
                    int length = i2 - bArr6.length;
                    bArr2 = new byte[length];
                    System.arraycopy(bArr4, bArr6.length, bArr2, 0, length);
                } else {
                    bArr2 = OooO0OO(bArr, i, i2);
                }
                byte[] bArr7 = new byte[4];
                byte[] bArr8 = new byte[4];
                System.arraycopy(this.OooO0OO, 0, bArr7, 0, 4);
                System.arraycopy(this.OooO0OO, 4, bArr8, 0, 4);
                int OooO00o2 = AbstractC6464l1l.OooO00o(bArr8, 0);
                boolean OooO0O02 = C9586iIILl.OooO0O0(bArr7, this.OooO0O0);
                int length2 = bArr2.length;
                if (OooO00o2 <= length2 - 8) {
                    OooO0O02 = false;
                }
                if (OooO00o2 > length2) {
                    OooO0O02 = false;
                }
                int i5 = length2 - OooO00o2;
                if (i5 >= bArr2.length) {
                    i5 = bArr2.length;
                    OooO0O02 = false;
                }
                byte[] bArr9 = new byte[i5];
                System.arraycopy(bArr2, bArr2.length - i5, bArr9, 0, i5);
                if (!C9586iIILl.OooO0O0(bArr9, new byte[i5])) {
                    OooO0O02 = false;
                }
                if (OooO0O02) {
                    byte[] bArr10 = new byte[OooO00o2];
                    System.arraycopy(bArr2, 0, bArr10, 0, OooO00o2);
                    return bArr10;
                }
                throw new InvalidCipherTextException("checksum failed");
            } else {
                throw new InvalidCipherTextException("unwrap data must be at least 16 bytes");
            }
        } else {
            throw new IllegalStateException("not set for unwrapping");
        }
    }
}
