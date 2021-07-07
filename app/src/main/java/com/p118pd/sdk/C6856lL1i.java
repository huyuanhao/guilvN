package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.l丨L丨1i  reason: invalid class name and case insensitive filesystem */
public class C6856lL1i {
    public Object OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short f18923OooO00o;

    public C6856lL1i(short s, Object obj) {
        if (OooO00o(s, obj)) {
            this.f18923OooO00o = s;
            this.OooO00o = obj;
            return;
        }
        throw new IllegalArgumentException("'request' is not an instance of the correct type");
    }

    public static C6856lL1i OooO00o(InputStream inputStream) throws IOException {
        short OooO00o2 = L1LL1Ii.m15923OooO00o(inputStream);
        if (OooO00o2 == 1) {
            return new C6856lL1i(OooO00o2, C6519lIlLiI.OooO00o(inputStream));
        }
        throw new TlsFatalAlert(50);
    }

    public static boolean OooO00o(short s, Object obj) {
        if (s == 1) {
            return obj instanceof C6519lIlLiI;
        }
        throw new IllegalArgumentException("'statusType' is an unsupported CertificateStatusType");
    }

    public C6519lIlLiI OooO00o() {
        if (OooO00o(1, this.OooO00o)) {
            return (C6519lIlLiI) this.OooO00o;
        }
        throw new IllegalStateException("'request' is not an OCSPStatusRequest");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m18005OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public short m18006OooO00o() {
        return this.f18923OooO00o;
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        L1LL1Ii.OooO00o(this.f18923OooO00o, outputStream);
        if (this.f18923OooO00o == 1) {
            ((C6519lIlLiI) this.OooO00o).OooO00o(outputStream);
            return;
        }
        throw new TlsFatalAlert(80);
    }
}
