package com.p118pd.sdk;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.pd.sdk.ooOOO0OO  reason: case insensitive filesystem */
public interface AbstractC8930ooOOO0OO extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(OOOO000 oooo000, long j) throws IOException;

    C9193oooOoo timeout();
}
