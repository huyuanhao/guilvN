package com.p118pd.sdk;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOOoO0o0  reason: case insensitive filesystem */
public interface AbstractC8210oOOoO0o0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    @Override // java.io.Flushable
    void flush() throws IOException;

    C9193oooOoo timeout();

    void write(OOOO000 oooo000, long j) throws IOException;
}
