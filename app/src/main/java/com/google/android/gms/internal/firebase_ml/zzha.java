package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.OutputStream;

public final class zzha extends OutputStream {
    public long zzyj;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.zzyj += (long) i2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.zzyj++;
    }
}
