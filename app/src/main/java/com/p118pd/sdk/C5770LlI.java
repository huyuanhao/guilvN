package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.LlI  reason: case insensitive filesystem */
public class C5770LlI implements AbstractC6427ii {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6383iLl1 f16683OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16684OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f16685OooO0O0;

    public C5770LlI(AbstractC6436l11LI r2) {
        this.f16683OooO00o = new C6383iLl1(r2);
        this.OooO00o = r2.OooO0O0();
    }

    private C6642li1LI OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            this.f16683OooO00o.OooO00o(new C6642li1LI(new byte[this.OooO00o]));
        } else {
            this.f16683OooO00o.OooO00o(new C6642li1LI(bArr));
        }
        this.f16683OooO00o.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.OooO00o];
        this.f16683OooO00o.OooO00o(bArr3, 0);
        return new C6642li1LI(bArr3);
    }

    private void OooO00o() throws DataLengthException {
        int i = this.OooO0O0;
        int i2 = this.OooO00o;
        int i3 = (i / i2) + 1;
        if (i3 < 256) {
            if (i != 0) {
                this.f16683OooO00o.update(this.f16685OooO0O0, 0, i2);
            }
            C6383iLl1 r0 = this.f16683OooO00o;
            byte[] bArr = this.f16684OooO00o;
            r0.update(bArr, 0, bArr.length);
            this.f16683OooO00o.update((byte) i3);
            this.f16683OooO00o.OooO00o(this.f16685OooO0O0, 0);
            return;
        }
        throw new DataLengthException("HKDF cannot generate more than 255 blocks of HashLen size");
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public int OooO00o(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = this.OooO0O0;
        int i4 = i3 + i2;
        int i5 = this.OooO00o;
        if (i4 <= i5 * 255) {
            if (i3 % i5 == 0) {
                OooO00o();
            }
            int i6 = this.OooO0O0;
            int i7 = this.OooO00o;
            int i8 = i6 % i7;
            int min = Math.min(i7 - (i6 % i7), i2);
            System.arraycopy(this.f16685OooO0O0, i8, bArr, i, min);
            this.OooO0O0 += min;
            int i9 = i2 - min;
            while (true) {
                i += min;
                if (i9 <= 0) {
                    return i2;
                }
                OooO00o();
                min = Math.min(this.OooO00o, i9);
                System.arraycopy(this.f16685OooO0O0, 0, bArr, i, min);
                this.OooO0O0 += min;
                i9 -= min;
            }
        } else {
            throw new DataLengthException("HKDF may only be used for 255 * HashLen bytes of output");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6436l11LI m16362OooO00o() {
        return this.f16683OooO00o.m17500OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public void OooO00o(AbstractC93201li r4) {
        C6642li1LI r1;
        C6383iLl1 r0;
        if (r4 instanceof C6018i1I1) {
            C6018i1I1 r42 = (C6018i1I1) r4;
            if (r42.OooO00o()) {
                r0 = this.f16683OooO00o;
                r1 = new C6642li1LI(r42.m16867OooO00o());
            } else {
                r0 = this.f16683OooO00o;
                r1 = OooO00o(r42.OooO0OO(), r42.m16867OooO00o());
            }
            r0.OooO00o(r1);
            this.f16684OooO00o = r42.OooO0O0();
            this.OooO0O0 = 0;
            this.f16685OooO0O0 = new byte[this.OooO00o];
            return;
        }
        throw new IllegalArgumentException("HKDF parameters required for HKDFBytesGenerator");
    }
}
