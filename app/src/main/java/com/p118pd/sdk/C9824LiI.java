package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.丨丨Li丨I丨  reason: invalid class name and case insensitive filesystem */
public class C9824LiI {
    public Object OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short f23423OooO00o;

    public C9824LiI(short s, Object obj) {
        if (OooO00o(s, obj)) {
            this.f23423OooO00o = s;
            this.OooO00o = obj;
            return;
        }
        throw new IllegalArgumentException("'response' is not an instance of the correct type");
    }

    public static C9824LiI OooO00o(InputStream inputStream) throws IOException {
        short OooO00o2 = L1LL1Ii.m15923OooO00o(inputStream);
        if (OooO00o2 == 1) {
            return new C9824LiI(OooO00o2, C6682liLi.OooO00o(L1LL1Ii.OooO0O0(L1LL1Ii.m15942OooO0O0(inputStream))));
        }
        throw new TlsFatalAlert(50);
    }

    public static boolean OooO00o(short s, Object obj) {
        if (s == 1) {
            return obj instanceof C6682liLi;
        }
        throw new IllegalArgumentException("'statusType' is an unsupported CertificateStatusType");
    }

    public C6682liLi OooO00o() {
        if (OooO00o(1, this.OooO00o)) {
            return (C6682liLi) this.OooO00o;
        }
        throw new IllegalStateException("'response' is not an OCSPResponse");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m21911OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public short m21912OooO00o() {
        return this.f23423OooO00o;
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        L1LL1Ii.OooO00o(this.f23423OooO00o, outputStream);
        if (this.f23423OooO00o == 1) {
            L1LL1Ii.OooO0O0(((C6682liLi) this.OooO00o).OooO00o(AbstractC5533IiL.OooO00o), outputStream);
            return;
        }
        throw new TlsFatalAlert(80);
    }
}
