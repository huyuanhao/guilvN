package com.p118pd.sdk;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.丨ili丨  reason: invalid class name and case insensitive filesystem */
public class C9637ili extends IIi1II {
    public boolean OooO0O0 = false;
    public boolean OooO0OO = true;
    public int o0ooOO0;
    public int o0ooOOo;

    public C9637ili(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.o0ooOO0 = inputStream.read();
        int read = inputStream.read();
        this.o0ooOOo = read;
        if (read >= 0) {
            OooO00o();
            return;
        }
        throw new EOFException();
    }

    private boolean OooO00o() {
        if (!this.OooO0O0 && this.OooO0OO && this.o0ooOO0 == 0 && this.o0ooOOo == 0) {
            this.OooO0O0 = true;
            OooO00o(true);
        }
        return this.OooO0O0;
    }

    public void OooO0O0(boolean z) {
        this.OooO0OO = z;
        OooO00o();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (OooO00o()) {
            return -1;
        }
        int read = this.OooO00o.read();
        if (read >= 0) {
            int i = this.o0ooOO0;
            this.o0ooOO0 = this.o0ooOOo;
            this.o0ooOOo = read;
            return i;
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.OooO0OO || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.OooO0O0) {
            return -1;
        }
        int read = this.OooO00o.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[i] = (byte) this.o0ooOO0;
            bArr[i + 1] = (byte) this.o0ooOOo;
            this.o0ooOO0 = this.OooO00o.read();
            int read2 = this.OooO00o.read();
            this.o0ooOOo = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }
}
