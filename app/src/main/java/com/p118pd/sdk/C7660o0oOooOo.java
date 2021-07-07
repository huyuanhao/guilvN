package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.o0oOooOo  reason: case insensitive filesystem */
public final class C7660o0oOooOo extends OutputStream {
    public AbstractC7707o0ooO00O OooO00o;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OutputStream f20539OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f20540OooO00o;
    public int o00oO0O;

    public C7660o0oOooOo(@NonNull OutputStream outputStream, @NonNull AbstractC7707o0ooO00O o0ooo00o) {
        this(outputStream, o0ooo00o, 65536);
    }

    private void OooO00o() throws IOException {
        int i = this.o00oO0O;
        if (i > 0) {
            this.f20539OooO00o.write(this.f20540OooO00o, 0, i);
            this.o00oO0O = 0;
        }
    }

    private void OooO0O0() throws IOException {
        if (this.o00oO0O == this.f20540OooO00o.length) {
            OooO00o();
        }
    }

    private void OooO0OO() {
        byte[] bArr = this.f20540OooO00o;
        if (bArr != null) {
            this.OooO00o.OooO00o(bArr);
            this.f20540OooO00o = null;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f20539OooO00o.close();
            OooO0OO();
        } catch (Throwable th) {
            this.f20539OooO00o.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OooO00o();
        this.f20539OooO00o.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f20540OooO00o;
        int i2 = this.o00oO0O;
        this.o00oO0O = i2 + 1;
        bArr[i2] = (byte) i;
        OooO0O0();
    }

    @VisibleForTesting
    public C7660o0oOooOo(@NonNull OutputStream outputStream, AbstractC7707o0ooO00O o0ooo00o, int i) {
        this.f20539OooO00o = outputStream;
        this.OooO00o = o0ooo00o;
        this.f20540OooO00o = (byte[]) o0ooo00o.OooO0O0(i, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.o00oO0O != 0 || i4 < this.f20540OooO00o.length) {
                int min = Math.min(i4, this.f20540OooO00o.length - this.o00oO0O);
                System.arraycopy(bArr, i5, this.f20540OooO00o, this.o00oO0O, min);
                this.o00oO0O += min;
                i3 += min;
                OooO0O0();
            } else {
                this.f20539OooO00o.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
