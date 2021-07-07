package com.p118pd.sdk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.LillI丨丨  reason: invalid class name and case insensitive filesystem */
public class C5745LillI extends FilterInputStream {
    public AbstractC93171I1 OooO00o;

    public C5745LillI(InputStream inputStream, AbstractC93171I1 r2) {
        super(inputStream);
        this.OooO00o = r2;
    }

    public AbstractC93171I1 OooO00o() {
        return this.OooO00o;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            this.OooO00o.update((byte) read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read > 0) {
            this.OooO00o.update(bArr, i, read);
        }
        return read;
    }
}
