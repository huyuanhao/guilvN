package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.LllI11 */
public class LllI11 extends InputStream {
    public final InputStream OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OutputStream f16739OooO00o;

    public LllI11(InputStream inputStream, OutputStream outputStream) {
        this.OooO00o = inputStream;
        this.f16739OooO00o = outputStream;
    }

    public OutputStream OooO0O0() {
        return this.f16739OooO00o;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.OooO00o.close();
        this.f16739OooO00o.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = this.OooO00o.read();
        if (read >= 0) {
            this.f16739OooO00o.write(read);
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.OooO00o.read(bArr, i, i2);
        if (read > 0) {
            this.f16739OooO00o.write(bArr, i, read);
        }
        return read;
    }
}
