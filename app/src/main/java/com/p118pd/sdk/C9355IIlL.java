package com.p118pd.sdk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.丨IIlL  reason: invalid class name and case insensitive filesystem */
public class C9355IIlL extends FilterInputStream {
    public AbstractC6436l11LI OooO00o;

    public C9355IIlL(InputStream inputStream, AbstractC6436l11LI r2) {
        super(inputStream);
        this.OooO00o = r2;
    }

    public AbstractC6436l11LI OooO00o() {
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
