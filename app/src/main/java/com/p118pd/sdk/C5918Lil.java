package com.p118pd.sdk;

import java.io.InputStream;

/* renamed from: com.pd.sdk.L丨丨丨il丨丨  reason: invalid class name and case insensitive filesystem */
public class C5918Lil extends InputStream {
    public C5802Llli OooO00o = new C5802Llli();

    public int OooO00o(byte[] bArr) {
        int min = Math.min(this.OooO00o.OooO00o(), bArr.length);
        this.OooO00o.OooO00o(bArr, 0, min, 0);
        return min;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16494OooO00o(byte[] bArr) {
        this.OooO00o.OooO00o(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.OooO00o.OooO00o();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.OooO00o.OooO00o() == 0) {
            return -1;
        }
        return this.OooO00o.OooO00o(1, 0)[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int min = Math.min(this.OooO00o.OooO00o(), i2);
        this.OooO00o.OooO0O0(bArr, i, min, 0);
        return min;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        int min = Math.min((int) j, this.OooO00o.OooO00o());
        this.OooO00o.m16407OooO00o(min);
        return (long) min;
    }
}
