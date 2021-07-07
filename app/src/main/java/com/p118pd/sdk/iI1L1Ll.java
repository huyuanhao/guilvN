package com.p118pd.sdk;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.iI1L1丨Ll  reason: invalid class name */
public class iI1L1Ll extends IIi1II {
    public static final byte[] OooO00o = new byte[0];
    public final int o0ooOO0;
    public int o0ooOOo;

    public iI1L1Ll(InputStream inputStream, int i) {
        super(inputStream, i);
        if (i >= 0) {
            this.o0ooOO0 = i;
            this.o0ooOOo = i;
            if (i == 0) {
                OooO00o(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("negative lengths not allowed");
    }

    @Override // com.p118pd.sdk.IIi1II
    public int OooO0O0() {
        return this.o0ooOOo;
    }

    @Override // com.p118pd.sdk.IIi1II
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m16938OooO0O0() throws IOException {
        int i = this.o0ooOOo;
        if (i == 0) {
            return OooO00o;
        }
        byte[] bArr = new byte[i];
        int OooO00o2 = i - C6304ilIi1.OooO00o(this.OooO00o, bArr);
        this.o0ooOOo = OooO00o2;
        if (OooO00o2 == 0) {
            OooO00o(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this.o0ooOO0 + " object truncated by " + this.o0ooOOo);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.o0ooOOo == 0) {
            return -1;
        }
        int read = this.OooO00o.read();
        if (read >= 0) {
            int i = this.o0ooOOo - 1;
            this.o0ooOOo = i;
            if (i == 0) {
                OooO00o(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.o0ooOO0 + " object truncated by " + this.o0ooOOo);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.o0ooOOo;
        if (i3 == 0) {
            return -1;
        }
        int read = this.OooO00o.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.o0ooOOo - read;
            this.o0ooOOo = i4;
            if (i4 == 0) {
                OooO00o(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.o0ooOO0 + " object truncated by " + this.o0ooOOo);
    }
}
