package com.p118pd.sdk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;

/* renamed from: com.pd.sdk.I1LLi1II */
public class I1LLi1II implements AbstractC9660l1il {
    public final long OooO00o;

    /* renamed from: com.pd.sdk.I1LLi1II$OooO00o */
    public class OooO00o implements i1l1iI {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6456l1ilL f15348OooO00o;

        public OooO00o(C6456l1ilL r2) {
            this.f15348OooO00o = r2;
        }

        @Override // com.p118pd.sdk.i1l1iI
        public C6456l1ilL OooO00o() {
            return this.f15348OooO00o;
        }

        @Override // com.p118pd.sdk.i1l1iI
        public InputStream OooO00o(InputStream inputStream) {
            InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream);
            return I1LLi1II.this.OooO00o >= 0 ? new OooO0O0(inflaterInputStream, I1LLi1II.this.OooO00o) : inflaterInputStream;
        }
    }

    /* renamed from: com.pd.sdk.I1LLi1II$OooO0O0 */
    public static class OooO0O0 extends FilterInputStream {
        public long OooO00o;

        public OooO0O0(InputStream inputStream, long j) {
            super(inputStream);
            this.OooO00o = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
            if (r4 >= 0) goto L_0x001b;
         */
        @Override // java.io.FilterInputStream, java.io.InputStream
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int read() throws java.io.IOException {
            /*
                r8 = this;
                long r0 = r8.OooO00o
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L_0x001c
                java.io.InputStream r0 = r8.in
                int r0 = r0.read()
                if (r0 < 0) goto L_0x001b
                long r4 = r8.OooO00o
                r6 = 1
                long r4 = r4 - r6
                r8.OooO00o = r4
                int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r1 < 0) goto L_0x001c
            L_0x001b:
                return r0
            L_0x001c:
                org.bouncycastle.util.io.StreamOverflowException r0 = new org.bouncycastle.util.io.StreamOverflowException
                java.lang.String r1 = "expanded byte limit exceeded"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.I1LLi1II.OooO0O0.read():int");
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (i2 < 1) {
                return super.read(bArr, i, i2);
            }
            long j = this.OooO00o;
            if (j < 1) {
                read();
                return -1;
            }
            if (j <= ((long) i2)) {
                i2 = (int) j;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i, i2);
            if (read > 0) {
                this.OooO00o -= (long) read;
            }
            return read;
        }
    }

    public I1LLi1II() {
        this.OooO00o = -1;
    }

    public I1LLi1II(long j) {
        this.OooO00o = j;
    }

    @Override // com.p118pd.sdk.AbstractC9660l1il
    public i1l1iI OooO00o(C6456l1ilL r2) {
        return new OooO00o(r2);
    }
}
