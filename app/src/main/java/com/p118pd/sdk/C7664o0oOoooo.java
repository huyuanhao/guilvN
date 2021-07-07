package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.o0oOoooo  reason: case insensitive filesystem */
public final class C7664o0oOoooo extends FilterInputStream {
    public static final byte[] OooO00o;
    public static final int o0ooOO0 = 2;
    public static final int o0ooOOo;
    public static final int o0ooOoO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte f20542OooO00o;
    public int o00oO0O;

    static {
        byte[] bArr = {-1, ExifInterface.OooOOo, 0, C8026oOO00oOo.OooO00o, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        OooO00o = bArr;
        int length = bArr.length;
        o0ooOOo = length;
        o0ooOoO = length + 2;
    }

    public C7664o0oOoooo(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f20542OooO00o = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i;
        int i2;
        int i3 = this.o00oO0O;
        if (i3 < 2 || i3 > (i2 = o0ooOoO)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f20542OooO00o;
        } else {
            i = OooO00o[i3 - 2] & 255;
        }
        if (i != -1) {
            this.o00oO0O++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.o00oO0O = (int) (((long) this.o00oO0O) + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.o00oO0O;
        int i5 = o0ooOoO;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f20542OooO00o;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(OooO00o, this.o00oO0O - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.o00oO0O += i3;
        }
        return i3;
    }
}
