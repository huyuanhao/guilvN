package com.megvii.meglive_sdk.volley.toolbox;

import java.io.ByteArrayOutputStream;

/* renamed from: com.megvii.meglive_sdk.volley.toolbox.i */
public final class C1651i extends ByteArrayOutputStream {

    /* renamed from: a */
    public final C1640b f2954a;

    public C1651i(C1640b bVar, int i) {
        this.f2954a = bVar;
        ((ByteArrayOutputStream) this).buf = bVar.mo17368a(Math.max(i, 256));
    }

    /* renamed from: a */
    private void m2868a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i > ((ByteArrayOutputStream) this).buf.length) {
            byte[] a = this.f2954a.mo17368a((i2 + i) * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a, 0, ((ByteArrayOutputStream) this).count);
            this.f2954a.mo17367a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = a;
        }
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2954a.mo17367a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    @Override // java.lang.Object
    public final void finalize() {
        this.f2954a.mo17367a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        m2868a(i2);
        super.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream
    public final synchronized void write(int i) {
        m2868a(1);
        super.write(i);
    }
}
