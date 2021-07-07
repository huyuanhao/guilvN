package com.p118pd.sdk;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.Li丨ii  reason: invalid class name and case insensitive filesystem */
public class C5758Liii extends FilterOutputStream {
    public C5758Liii(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public void close() {
        throw new RuntimeException("close() called on UncloseableOutputStream");
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
