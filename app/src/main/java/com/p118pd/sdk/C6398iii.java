package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.i丨ii  reason: invalid class name and case insensitive filesystem */
public class C6398iii extends OutputStream {
    public AbstractC6892l1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18208OooO00o = new byte[1];

    public C6398iii(AbstractC6892l1 r2) {
        this.OooO00o = r2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.OooO00o.OooO0Oo();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.OooO00o.OooO0oO();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f18208OooO00o;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.OooO00o.m18058OooO0O0(bArr, i, i2);
    }
}
