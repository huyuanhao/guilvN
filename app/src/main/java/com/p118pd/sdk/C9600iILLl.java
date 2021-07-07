package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.丨iI丨丨LLl  reason: invalid class name and case insensitive filesystem */
public class C9600iILLl extends l1IIi1 {

    /* renamed from: com.pd.sdk.丨iI丨丨LLl$OooO00o */
    public class OooO00o extends OutputStream {
        public C6119iIl1il OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f23174OooO00o;
        public int o00oO0O = 0;

        public OooO00o(byte[] bArr) {
            this.f23174OooO00o = bArr;
            this.OooO00o = new C6119iIl1il(((ILL) C9600iILLl.this).OooO00o);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            int i = this.o00oO0O;
            if (i != 0) {
                byte[] bArr = new byte[i];
                System.arraycopy(this.f23174OooO00o, 0, bArr, 0, i);
                C6487lIIiIlL.OooO00o(this.OooO00o, bArr);
            }
            C9600iILLl.this.m17558OooO00o();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            byte[] bArr = this.f23174OooO00o;
            int i2 = this.o00oO0O;
            int i3 = i2 + 1;
            this.o00oO0O = i3;
            bArr[i2] = (byte) i;
            if (i3 == bArr.length) {
                C6487lIIiIlL.OooO00o(this.OooO00o, bArr);
                this.o00oO0O = 0;
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            while (i2 > 0) {
                int min = Math.min(i2, this.f23174OooO00o.length - this.o00oO0O);
                System.arraycopy(bArr, i, this.f23174OooO00o, this.o00oO0O, min);
                int i3 = this.o00oO0O + min;
                this.o00oO0O = i3;
                byte[] bArr2 = this.f23174OooO00o;
                if (i3 >= bArr2.length) {
                    C6487lIIiIlL.OooO00o(this.OooO00o, bArr2);
                    this.o00oO0O = 0;
                    i += min;
                    i2 -= min;
                } else {
                    return;
                }
            }
        }
    }

    public C9600iILLl(OutputStream outputStream) throws IOException {
        super(outputStream);
        OooO00o(36);
    }

    public C9600iILLl(OutputStream outputStream, int i, boolean z) throws IOException {
        super(outputStream, i, z);
        OooO00o(36);
    }

    public OutputStream OooO00o(byte[] bArr) {
        return new OooO00o(bArr);
    }

    public OutputStream OooO0O0() {
        return OooO00o(new byte[1000]);
    }
}
