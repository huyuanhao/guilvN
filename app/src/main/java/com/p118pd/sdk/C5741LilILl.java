package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.LilILl丨丨  reason: invalid class name and case insensitive filesystem */
public class C5741LilILl extends OutputStream {
    public OutputStream OooO00o;
    public OutputStream OooO0O0;

    public C5741LilILl(OutputStream outputStream, OutputStream outputStream2) {
        this.OooO00o = outputStream;
        this.OooO0O0 = outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.OooO00o.close();
        this.OooO0O0.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.OooO00o.flush();
        this.OooO0O0.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.OooO00o.write(i);
        this.OooO0O0.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.OooO00o.write(bArr);
        this.OooO0O0.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.OooO00o.write(bArr, i, i2);
        this.OooO0O0.write(bArr, i, i2);
    }
}
