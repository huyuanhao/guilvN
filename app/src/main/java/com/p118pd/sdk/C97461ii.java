package com.p118pd.sdk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.丨丨1ii丨  reason: invalid class name and case insensitive filesystem */
public class C97461ii extends FilterInputStream {
    public AbstractC6769llL1L OooO00o;

    public C97461ii(InputStream inputStream, AbstractC6769llL1L lll1l) {
        super(inputStream);
        this.OooO00o = lll1l;
    }

    public AbstractC6769llL1L OooO00o() {
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
        if (read >= 0) {
            this.OooO00o.update(bArr, i, read);
        }
        return read;
    }
}
