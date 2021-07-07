package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.llL1iiLi */
public class llL1iiLi {
    public static final String OooO00o = "1.2.840.113549.1.9.16.3.8";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f18756OooO00o;

    /* renamed from: com.pd.sdk.llL1iiLi$OooO00o */
    public class OooO00o extends OutputStream {

        /* renamed from: OooO00o  reason: collision with other field name */
        public C4984 f18757OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OutputStream f18758OooO00o;
        public C4984 OooO0O0;
        public C4984 OooO0OO;

        public OooO00o(OutputStream outputStream, C4984 r3, C4984 r4, C4984 r5) {
            this.f18758OooO00o = outputStream;
            this.f18757OooO00o = r3;
            this.OooO0O0 = r4;
            this.OooO0OO = r5;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f18758OooO00o.close();
            this.OooO0OO.OooO0O0();
            this.OooO0O0.OooO0O0();
            this.f18757OooO00o.OooO0O0();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f18758OooO00o.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f18758OooO00o.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f18758OooO00o.write(bArr, i, i2);
        }
    }

    public OutputStream OooO00o(LlLI1 llLI1, OutputStream outputStream, IIlL1l iIlL1l) throws IOException {
        C4984 r3 = new C4984(outputStream);
        r3.OooO00o(AbstractC6252iiLl.OooO0oo);
        C4984 r4 = new C4984(r3.OooO00o(), 0, true);
        r4.OooO00o(new C6513lIiI(0));
        r4.OooO00o(iIlL1l.OooO00o());
        C4984 r5 = new C4984(r4.OooO00o());
        r5.OooO00o(llLI1);
        return new OooO00o(iIlL1l.OooO00o(C5799LllI.OooO00o(r5.OooO00o(), 0, true, this.f18756OooO00o)), r3, r4, r5);
    }

    public OutputStream OooO00o(OutputStream outputStream, IIlL1l iIlL1l) throws IOException {
        return OooO00o(AbstractC6252iiLl.OooO00o, outputStream, iIlL1l);
    }

    public void OooO00o(int i) {
        this.f18756OooO00o = i;
    }
}
