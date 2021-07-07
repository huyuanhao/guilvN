package com.p118pd.sdk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.bouncycastle.crypto.p289io.InvalidCipherTextIOException;

/* renamed from: com.pd.sdk.ilIL丨I1L  reason: invalid class name */
public class ilILI1L extends FilterInputStream {
    public final Cipher OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f17986OooO00o = new byte[512];
    public boolean OooO0O0 = false;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f17987OooO0O0;
    public int o00oO0O;
    public int o0ooOO0;

    public ilILI1L(InputStream inputStream, Cipher cipher) {
        super(inputStream);
        this.OooO00o = cipher;
    }

    private int OooO0O0() throws IOException {
        if (this.OooO0O0) {
            return -1;
        }
        this.o0ooOO0 = 0;
        this.o00oO0O = 0;
        while (true) {
            int i = this.o00oO0O;
            if (i != 0) {
                return i;
            }
            int read = ((FilterInputStream) this).in.read(this.f17986OooO00o);
            if (read == -1) {
                byte[] OooO0O02 = m17336OooO0O0();
                this.f17987OooO0O0 = OooO0O02;
                if (OooO0O02 == null || OooO0O02.length == 0) {
                    return -1;
                }
                int length = OooO0O02.length;
                this.o00oO0O = length;
                return length;
            }
            byte[] update = this.OooO00o.update(this.f17986OooO00o, 0, read);
            this.f17987OooO0O0 = update;
            if (update != null) {
                this.o00oO0O = update.length;
            }
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private byte[] m17336OooO0O0() throws InvalidCipherTextIOException {
        try {
            this.OooO0O0 = true;
            return this.OooO00o.doFinal();
        } catch (GeneralSecurityException e) {
            throw new InvalidCipherTextIOException("Error finalising cipher", e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.o00oO0O - this.o0ooOO0;
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        try {
            ((FilterInputStream) this).in.close();
            this.o0ooOO0 = 0;
            this.o00oO0O = 0;
        } finally {
            if (!this.OooO0O0) {
                m17336OooO0O0();
            }
        }
    }

    public void mark(int i) {
    }

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.o0ooOO0 >= this.o00oO0O && OooO0O0() < 0) {
            return -1;
        }
        byte[] bArr = this.f17987OooO0O0;
        int i = this.o0ooOO0;
        this.o0ooOO0 = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.o0ooOO0 >= this.o00oO0O && OooO0O0() < 0) {
            return -1;
        }
        int min = Math.min(i2, available());
        System.arraycopy(this.f17987OooO0O0, this.o0ooOO0, bArr, i, min);
        this.o0ooOO0 += min;
        return min;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0;
        }
        int min = (int) Math.min(j, (long) available());
        this.o0ooOO0 += min;
        return (long) min;
    }
}
