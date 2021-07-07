package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.iILlI  reason: case insensitive filesystem */
public class C6099iILlI implements AbstractC9875iiI {
    public li1l11I1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6642li1LI f17531OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17532OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17533OooO00o;
    public boolean OooO0O0;

    public C6099iILlI(li1l11I1 li1l11i1) {
        this(li1l11i1, false);
    }

    public C6099iILlI(li1l11I1 li1l11i1, boolean z) {
        this.f17533OooO00o = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};
        this.OooO00o = li1l11i1;
        this.f17532OooO00o = !z;
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public String OooO00o() {
        return this.OooO00o.m17732OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public void OooO00o(boolean z, AbstractC6370iIIIl r2) {
        this.OooO0O0 = z;
        if (r2 instanceof liLL1l) {
            r2 = ((liLL1l) r2).OooO00o();
        }
        if (r2 instanceof C6642li1LI) {
            this.f17531OooO00o = (C6642li1LI) r2;
        } else if (r2 instanceof C6274iilL1L) {
            C6274iilL1L r22 = (C6274iilL1L) r2;
            this.f17533OooO00o = r22.m17301OooO00o();
            this.f17531OooO00o = (C6642li1LI) r22.OooO00o();
            if (this.f17533OooO00o.length != 8) {
                throw new IllegalArgumentException("IV not equal to 8");
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public byte[] OooO00o(byte[] bArr, int i, int i2) {
        if (this.OooO0O0) {
            int i3 = i2 / 8;
            if (i3 * 8 == i2) {
                byte[] bArr2 = this.f17533OooO00o;
                byte[] bArr3 = new byte[(bArr2.length + i2)];
                byte[] bArr4 = new byte[(bArr2.length + 8)];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                System.arraycopy(bArr, i, bArr3, this.f17533OooO00o.length, i2);
                this.OooO00o.OooO00o(this.f17532OooO00o, this.f17531OooO00o);
                for (int i4 = 0; i4 != 6; i4++) {
                    for (int i5 = 1; i5 <= i3; i5++) {
                        System.arraycopy(bArr3, 0, bArr4, 0, this.f17533OooO00o.length);
                        int i6 = i5 * 8;
                        System.arraycopy(bArr3, i6, bArr4, this.f17533OooO00o.length, 8);
                        this.OooO00o.OooO00o(bArr4, 0, bArr4, 0);
                        int i7 = (i3 * i4) + i5;
                        int i8 = 1;
                        while (i7 != 0) {
                            int length = this.f17533OooO00o.length - i8;
                            bArr4[length] = (byte) (((byte) i7) ^ bArr4[length]);
                            i7 >>>= 8;
                            i8++;
                        }
                        System.arraycopy(bArr4, 0, bArr3, 0, 8);
                        System.arraycopy(bArr4, 8, bArr3, i6, 8);
                    }
                }
                return bArr3;
            }
            throw new DataLengthException("wrap data must be a multiple of 8 bytes");
        }
        throw new IllegalStateException("not set for wrapping");
    }

    @Override // com.p118pd.sdk.AbstractC9875iiI
    public byte[] OooO0O0(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (!this.OooO0O0) {
            int i3 = i2 / 8;
            if (i3 * 8 == i2) {
                byte[] bArr2 = this.f17533OooO00o;
                byte[] bArr3 = new byte[(i2 - bArr2.length)];
                byte[] bArr4 = new byte[bArr2.length];
                byte[] bArr5 = new byte[(bArr2.length + 8)];
                System.arraycopy(bArr, i, bArr4, 0, bArr2.length);
                byte[] bArr6 = this.f17533OooO00o;
                System.arraycopy(bArr, i + bArr6.length, bArr3, 0, i2 - bArr6.length);
                this.OooO00o.OooO00o(!this.f17532OooO00o, this.f17531OooO00o);
                int i4 = i3 - 1;
                for (int i5 = 5; i5 >= 0; i5--) {
                    for (int i6 = i4; i6 >= 1; i6--) {
                        System.arraycopy(bArr4, 0, bArr5, 0, this.f17533OooO00o.length);
                        int i7 = (i6 - 1) * 8;
                        System.arraycopy(bArr3, i7, bArr5, this.f17533OooO00o.length, 8);
                        int i8 = (i4 * i5) + i6;
                        int i9 = 1;
                        while (i8 != 0) {
                            int length = this.f17533OooO00o.length - i9;
                            bArr5[length] = (byte) (((byte) i8) ^ bArr5[length]);
                            i8 >>>= 8;
                            i9++;
                        }
                        this.OooO00o.OooO00o(bArr5, 0, bArr5, 0);
                        System.arraycopy(bArr5, 0, bArr4, 0, 8);
                        System.arraycopy(bArr5, 8, bArr3, i7, 8);
                    }
                }
                if (C9586iIILl.OooO0O0(bArr4, this.f17533OooO00o)) {
                    return bArr3;
                }
                throw new InvalidCipherTextException("checksum failed");
            }
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        throw new IllegalStateException("not set for unwrapping");
    }
}
