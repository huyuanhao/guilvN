package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.iiLI1L丨L  reason: invalid class name and case insensitive filesystem */
public class C6245iiLI1LL {
    public Vector OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short f17865OooO00o;

    /* renamed from: com.pd.sdk.iiLI1L丨L$OooO00o */
    public class OooO00o extends ByteArrayOutputStream {
        public OooO00o() throws IOException {
            L1LL1Ii.OooO00o(0, (OutputStream) this);
        }

        public void OooO00o(OutputStream outputStream) throws IOException {
            int i = ((ByteArrayOutputStream) this).count - 2;
            L1LL1Ii.m15925OooO00o(i);
            L1LL1Ii.OooO00o(i, ((ByteArrayOutputStream) this).buf, 0);
            outputStream.write(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            ((ByteArrayOutputStream) this).buf = null;
        }
    }

    public C6245iiLI1LL(short s, Vector vector) {
        if (!I1I1.OooO00o(s)) {
            throw new IllegalArgumentException("'type' is not a valid CertChainType value");
        } else if (vector == null || vector.isEmpty()) {
            throw new IllegalArgumentException("'urlAndHashList' must have length > 0");
        } else {
            this.f17865OooO00o = s;
            this.OooO00o = vector;
        }
    }

    public static C6245iiLI1LL OooO00o(iL1liI il1lii, InputStream inputStream) throws IOException {
        short OooO00o2 = L1LL1Ii.m15923OooO00o(inputStream);
        if (I1I1.OooO00o(OooO00o2)) {
            int OooO00o3 = L1LL1Ii.OooO00o(inputStream);
            if (OooO00o3 >= 1) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(L1LL1Ii.OooO0O0(OooO00o3, inputStream));
                Vector vector = new Vector();
                while (byteArrayInputStream.available() > 0) {
                    vector.addElement(iILLL1il.OooO00o(il1lii, byteArrayInputStream));
                }
                return new C6245iiLI1LL(OooO00o2, vector);
            }
            throw new TlsFatalAlert(50);
        }
        throw new TlsFatalAlert(50);
    }

    public Vector OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public short m17249OooO00o() {
        return this.f17865OooO00o;
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        L1LL1Ii.OooO00o(this.f17865OooO00o, outputStream);
        OooO00o oooO00o = new OooO00o();
        for (int i = 0; i < this.OooO00o.size(); i++) {
            ((iILLL1il) this.OooO00o.elementAt(i)).OooO00o(oooO00o);
        }
        oooO00o.OooO00o(outputStream);
    }
}
