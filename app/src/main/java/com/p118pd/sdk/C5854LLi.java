package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.L丨Li  reason: invalid class name and case insensitive filesystem */
public class C5854LLi {
    public short OooO00o;

    public C5854LLi(short s) {
        if (C9559L.OooO00o(s)) {
            this.OooO00o = s;
            return;
        }
        throw new IllegalArgumentException("'mode' is not a valid HeartbeatMode value");
    }

    public static C5854LLi OooO00o(InputStream inputStream) throws IOException {
        short OooO00o2 = L1LL1Ii.m15923OooO00o(inputStream);
        if (C9559L.OooO00o(OooO00o2)) {
            return new C5854LLi(OooO00o2);
        }
        throw new TlsFatalAlert(47);
    }

    public short OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        L1LL1Ii.OooO00o(this.OooO00o, outputStream);
    }
}
