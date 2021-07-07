package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.Lii  reason: case insensitive filesystem */
public class C5714Lii extends OutputStream {
    public AbstractC93171I1 OooO00o;

    public C5714Lii(AbstractC93171I1 r1) {
        this.OooO00o = r1;
    }

    public AbstractC93171I1 OooO00o() {
        return this.OooO00o;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.OooO00o.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.OooO00o.update(bArr, i, i2);
    }
}
