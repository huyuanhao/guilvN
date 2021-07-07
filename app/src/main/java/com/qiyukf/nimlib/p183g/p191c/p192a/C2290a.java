package com.qiyukf.nimlib.p183g.p191c.p192a;

/* renamed from: com.qiyukf.nimlib.g.c.a.a */
public final class C2290a {

    /* renamed from: a */
    public byte[] f4583a = new byte[256];

    /* renamed from: b */
    public int f4584b;

    /* renamed from: c */
    public int f4585c;

    public C2290a(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f4583a[i] = (byte) i;
        }
        this.f4584b = 0;
        this.f4585c = 0;
        if (bArr == null || bArr.length == 0) {
            throw null;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            byte[] bArr2 = this.f4583a;
            i3 = ((bArr[i2] & 255) + (bArr2[i4] & 255) + i3) & 255;
            byte b = bArr2[i4];
            bArr2[i4] = bArr2[i3];
            bArr2[i3] = b;
            i2 = (i2 + 1) % bArr.length;
        }
    }

    /* renamed from: a */
    public final void mo34952a(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i < 0 || i2 < 0 || (i3 = i2 + i) > bArr.length) {
            throw new IllegalArgumentException("illegal rc4 transform arguments");
        }
        while (i < i3) {
            byte b = bArr[i];
            int i4 = (this.f4584b + 1) & 255;
            this.f4584b = i4;
            byte[] bArr2 = this.f4583a;
            int i5 = ((bArr2[i4] & 255) + this.f4585c) & 255;
            this.f4585c = i5;
            byte b2 = bArr2[i4];
            bArr2[i4] = bArr2[i5];
            bArr2[i5] = b2;
            bArr[i] = (byte) (b ^ bArr2[((bArr2[i4] & 255) + (bArr2[i5] & 255)) & 255]);
            i++;
        }
    }
}
