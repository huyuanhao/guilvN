package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.L丨LL丨l  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5853LLLl extends OutputStream {
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
