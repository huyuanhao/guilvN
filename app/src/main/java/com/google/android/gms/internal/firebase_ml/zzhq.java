package com.google.android.gms.internal.firebase_ml;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzhq extends FilterInputStream {
    public final zzhp zzaac;

    public zzhq(InputStream inputStream, Logger logger, Level level, int i) {
        super(inputStream);
        this.zzaac = new zzhp(logger, level, i);
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() throws IOException {
        this.zzaac.close();
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read = super.read();
        this.zzaac.write(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.zzaac.write(bArr, i, read);
        }
        return read;
    }
}
