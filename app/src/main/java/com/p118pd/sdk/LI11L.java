package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨丨LI11丨L  reason: invalid class name */
public class LI11L {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC97491iL f23404OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23405OooO00o;

    public LI11L(AbstractC97491iL r1, int i) {
        this.f23404OooO00o = r1;
        if (i % r1.OooO0O0() == 0) {
            this.f23405OooO00o = new byte[i];
            this.OooO00o = 0;
            return;
        }
        throw new IllegalArgumentException("buffer size not multiple of input block size");
    }

    public int OooO00o(byte b, byte[] bArr, int i) {
        byte[] bArr2 = this.f23405OooO00o;
        int i2 = this.OooO00o;
        int i3 = i2 + 1;
        this.OooO00o = i3;
        bArr2[i2] = b;
        if (i3 != bArr2.length) {
            return 0;
        }
        int OooO0O0 = this.f23404OooO00o.OooO0O0(bArr2, 0, bArr2.length, bArr, i);
        this.OooO00o = 0;
        return OooO0O0;
    }

    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 >= 0) {
            byte[] bArr3 = this.f23405OooO00o;
            int length = bArr3.length;
            int i4 = this.OooO00o;
            int i5 = length - i4;
            int i6 = 0;
            if (i2 > i5) {
                System.arraycopy(bArr, i, bArr3, i4, i5);
                AbstractC97491iL r4 = this.f23404OooO00o;
                byte[] bArr4 = this.f23405OooO00o;
                int OooO0O0 = r4.OooO0O0(bArr4, 0, bArr4.length, bArr2, i3) + 0;
                this.OooO00o = 0;
                int i7 = i2 - i5;
                int i8 = i + i5;
                int i9 = i3 + OooO0O0;
                int length2 = i7 - (i7 % this.f23405OooO00o.length);
                i6 = OooO0O0 + this.f23404OooO00o.OooO0O0(bArr, i8, length2, bArr2, i9);
                i2 = i7 - length2;
                i = i8 + length2;
            }
            if (i2 != 0) {
                System.arraycopy(bArr, i, this.f23405OooO00o, this.OooO00o, i2);
                this.OooO00o += i2;
            }
            return i6;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
