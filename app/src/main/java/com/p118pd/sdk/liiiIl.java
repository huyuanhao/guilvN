package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.l丨iiiIl  reason: invalid class name */
public class liiiIl {
    public Object OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short f18937OooO00o;

    public liiiIl(short s, Object obj) {
        if (OooO00o(s, obj)) {
            this.f18937OooO00o = s;
            this.OooO00o = obj;
            return;
        }
        throw new IllegalArgumentException("'name' is not an instance of the correct type");
    }

    public static liiiIl OooO00o(InputStream inputStream) throws IOException {
        short OooO00o2 = L1LL1Ii.m15923OooO00o(inputStream);
        if (OooO00o2 == 0) {
            byte[] OooO00o3 = L1LL1Ii.m15931OooO00o(inputStream);
            if (OooO00o3.length >= 1) {
                return new liiiIl(OooO00o2, new String(OooO00o3, "ASCII"));
            }
            throw new TlsFatalAlert(50);
        }
        throw new TlsFatalAlert(50);
    }

    public static boolean OooO00o(short s, Object obj) {
        if (s == 0) {
            return obj instanceof String;
        }
        throw new IllegalArgumentException("'nameType' is an unsupported NameType");
    }

    public Object OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18015OooO00o() {
        if (OooO00o(0, this.OooO00o)) {
            return (String) this.OooO00o;
        }
        throw new IllegalStateException("'name' is not a HostName string");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public short m18016OooO00o() {
        return this.f18937OooO00o;
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        L1LL1Ii.OooO00o(this.f18937OooO00o, outputStream);
        if (this.f18937OooO00o == 0) {
            byte[] bytes = ((String) this.OooO00o).getBytes("ASCII");
            if (bytes.length >= 1) {
                L1LL1Ii.OooO00o(bytes, outputStream);
                return;
            }
            throw new TlsFatalAlert(80);
        }
        throw new TlsFatalAlert(80);
    }
}
