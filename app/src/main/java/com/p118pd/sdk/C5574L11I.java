package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.L11I丨  reason: invalid class name and case insensitive filesystem */
public class C5574L11I extends InputStream {
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final InputStream f16115OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OutputStream f16116OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Long f16117OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f16118OooO00o = new byte[1024];
    public boolean OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final byte[] f16119OooO0O0 = new byte[768];
    public int o00oO0O;
    public int o0ooOO0;

    /* renamed from: com.pd.sdk.L11I丨$OooO00o */
    public class OooO00o extends OutputStream {
        public OooO00o() {
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            C5574L11I r0 = C5574L11I.this;
            byte[] bArr = r0.f16119OooO0O0;
            int i2 = r0.o0ooOO0;
            r0.o0ooOO0 = i2 + 1;
            bArr[i2] = (byte) i;
        }
    }

    public C5574L11I(InputStream inputStream, Long l) {
        this.f16115OooO00o = inputStream;
        this.f16116OooO00o = new OooO00o();
        this.f16117OooO00o = l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054 A[SYNTHETIC, Splitter:B:21:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int OooO0O0() throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5574L11I.OooO0O0():int");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.f16115OooO00o.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.o00oO0O == this.o0ooOO0) {
            this.o00oO0O = 0;
            this.o0ooOO0 = 0;
            int OooO0O02 = OooO0O0();
            if (OooO0O02 == -1) {
                return OooO0O02;
            }
        }
        byte[] bArr = this.f16119OooO0O0;
        int i = this.o00oO0O;
        this.o00oO0O = i + 1;
        return bArr[i] & 255;
    }
}
