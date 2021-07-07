package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.o0OOo0Oo  reason: case insensitive filesystem */
public final class C7422o0OOo0Oo extends OutputStream {
    public final OutputStream OooO00o;
    public int o00oO0O = 0;

    public C7422o0OOo0Oo(OutputStream outputStream) {
        this.OooO00o = outputStream;
    }

    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.OooO00o.write(i);
        this.o00oO0O++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.OooO00o.write(bArr);
        this.o00oO0O += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.OooO00o.write(bArr, i, i2);
        this.o00oO0O += i2;
    }
}
