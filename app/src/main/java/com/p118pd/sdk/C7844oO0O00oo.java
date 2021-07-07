package com.p118pd.sdk;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.oO0O00oo  reason: case insensitive filesystem */
public class C7844oO0O00oo extends FilterInputStream {
    public static final int o0ooOO0 = Integer.MIN_VALUE;
    public static final int o0ooOOo = -1;
    public int o00oO0O = Integer.MIN_VALUE;

    public C7844oO0O00oo(@NonNull InputStream inputStream) {
        super(inputStream);
    }

    private long OooO00o(long j) {
        int i = this.o00oO0O;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    private void OooO0OO(long j) {
        int i = this.o00oO0O;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.o00oO0O = (int) (((long) i) - j);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.o00oO0O;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.o00oO0O = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (OooO00o(1) == -1) {
            return -1;
        }
        int read = super.read();
        OooO0OO(1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.o00oO0O = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long OooO00o = OooO00o(j);
        if (OooO00o == -1) {
            return 0;
        }
        long skip = super.skip(OooO00o);
        OooO0OO(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int OooO00o = (int) OooO00o((long) i2);
        if (OooO00o == -1) {
            return -1;
        }
        int read = super.read(bArr, i, OooO00o);
        OooO0OO((long) read);
        return read;
    }
}
