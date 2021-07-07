package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.II丨iLIi  reason: invalid class name */
public class IIiLIi extends OutputStream {
    public final OutputStream OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f15523OooO00o;
    public int o00oO0O;

    public IIiLIi(OutputStream outputStream) {
        this.OooO00o = outputStream;
        this.f15523OooO00o = new byte[4096];
    }

    public IIiLIi(OutputStream outputStream, int i) {
        this.OooO00o = outputStream;
        this.f15523OooO00o = new byte[i];
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
        this.OooO00o.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.OooO00o.write(this.f15523OooO00o, 0, this.o00oO0O);
        this.o00oO0O = 0;
        C9586iIILl.OooO00o(this.f15523OooO00o, (byte) 0);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f15523OooO00o;
        int i2 = this.o00oO0O;
        int i3 = i2 + 1;
        this.o00oO0O = i3;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length) {
            flush();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        byte[] bArr3 = this.f15523OooO00o;
        int length = bArr3.length;
        int i3 = this.o00oO0O;
        if (i2 < length - i3) {
            System.arraycopy(bArr, i, bArr3, i3, i2);
        } else {
            int length2 = bArr3.length - i3;
            System.arraycopy(bArr, i, bArr3, i3, length2);
            this.o00oO0O += length2;
            flush();
            int i4 = i + length2;
            i2 -= length2;
            while (true) {
                bArr2 = this.f15523OooO00o;
                if (i2 < bArr2.length) {
                    break;
                }
                this.OooO00o.write(bArr, i4, bArr2.length);
                byte[] bArr4 = this.f15523OooO00o;
                i4 += bArr4.length;
                i2 -= bArr4.length;
            }
            if (i2 > 0) {
                System.arraycopy(bArr, i4, bArr2, this.o00oO0O, i2);
            } else {
                return;
            }
        }
        this.o00oO0O += i2;
    }
}
