package com.google.android.gms.internal.firebase_ml;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class zzey extends BufferedOutputStream {
    public zzey(zzex zzex, OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            flush();
        } catch (IOException unused) {
        }
    }
}
