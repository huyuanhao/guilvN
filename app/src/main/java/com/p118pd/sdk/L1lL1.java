package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.L1丨lL1  reason: invalid class name */
public class L1lL1 extends InputStream {
    public AbstractC6892l1 OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16254OooO00o = new byte[1];

    public L1lL1(AbstractC6892l1 r2) {
        this.OooO00o = r2;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.OooO00o.OooO00o();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.OooO00o.OooO0Oo();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f16254OooO00o) < 0) {
            return -1;
        }
        return this.f16254OooO00o[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.OooO00o.OooO00o(bArr, i, i2);
    }
}
