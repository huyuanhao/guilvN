package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L丨Il丨丨  reason: invalid class name and case insensitive filesystem */
public class C5848LIl {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC97491iL f16815OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16816OooO00o;

    public C5848LIl(AbstractC97491iL r1, int i) {
        this.f16815OooO00o = r1;
        if (i % r1.OooO0O0() == 0) {
            this.f16816OooO00o = new byte[i];
            this.OooO00o = 0;
            return;
        }
        throw new IllegalArgumentException("buffer size not multiple of input block size");
    }

    public int OooO00o(byte b, byte[] bArr, int i) {
        byte[] bArr2 = this.f16816OooO00o;
        int i2 = this.OooO00o;
        int i3 = i2 + 1;
        this.OooO00o = i3;
        bArr2[i2] = b;
        if (i3 != bArr2.length) {
            return 0;
        }
        int OooO00o2 = this.f16815OooO00o.OooO00o(bArr2, 0, bArr2.length, bArr, i);
        this.OooO00o = 0;
        return OooO00o2;
    }

    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 >= 0) {
            byte[] bArr3 = this.f16816OooO00o;
            int length = bArr3.length;
            int i4 = this.OooO00o;
            int i5 = length - i4;
            int i6 = 0;
            if (i2 > i5) {
                System.arraycopy(bArr, i, bArr3, i4, i5);
                AbstractC97491iL r4 = this.f16815OooO00o;
                byte[] bArr4 = this.f16816OooO00o;
                int OooO00o2 = r4.OooO00o(bArr4, 0, bArr4.length, bArr2, i3) + 0;
                this.OooO00o = 0;
                int i7 = i2 - i5;
                int i8 = i + i5;
                int i9 = i3 + OooO00o2;
                int length2 = i7 - (i7 % this.f16816OooO00o.length);
                i6 = OooO00o2 + this.f16815OooO00o.OooO00o(bArr, i8, length2, bArr2, i9);
                i2 = i7 - length2;
                i = i8 + length2;
            }
            if (i2 != 0) {
                System.arraycopy(bArr, i, this.f16816OooO00o, this.OooO00o, i2);
                this.OooO00o += i2;
            }
            return i6;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
