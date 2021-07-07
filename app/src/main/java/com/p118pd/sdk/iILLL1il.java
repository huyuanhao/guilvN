package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.tls.TlsFatalAlert;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.iILLL1il */
public class iILLL1il {
    public String OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17513OooO00o;

    public iILLL1il(String str, byte[] bArr) {
        if (str == null || str.length() < 1 || str.length() >= 65536) {
            throw new IllegalArgumentException("'url' must have length from 1 to (2^16 - 1)");
        } else if (bArr == null || bArr.length == 20) {
            this.OooO00o = str;
            this.f17513OooO00o = bArr;
        } else {
            throw new IllegalArgumentException("'sha1Hash' must have length == 20, if present");
        }
    }

    public static iILLL1il OooO00o(iL1liI il1lii, InputStream inputStream) throws IOException {
        byte[] OooO00o2 = L1LL1Ii.m15931OooO00o(inputStream);
        if (OooO00o2.length >= 1) {
            String OooO00o3 = Strings.OooO00o(OooO00o2);
            byte[] bArr = null;
            short OooO00o4 = L1LL1Ii.m15923OooO00o(inputStream);
            if (OooO00o4 != 0) {
                if (OooO00o4 == 1) {
                    bArr = L1LL1Ii.OooO0O0(20, inputStream);
                } else {
                    throw new TlsFatalAlert(47);
                }
            } else if (L1LL1Ii.OooO0OO(il1lii)) {
                throw new TlsFatalAlert(47);
            }
            return new iILLL1il(OooO00o3, bArr);
        }
        throw new TlsFatalAlert(47);
    }

    public String OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        L1LL1Ii.OooO00o(Strings.m22985OooO00o(this.OooO00o), outputStream);
        if (this.f17513OooO00o == null) {
            L1LL1Ii.OooO0OO(0, outputStream);
            return;
        }
        L1LL1Ii.OooO0OO(1, outputStream);
        outputStream.write(this.f17513OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16962OooO00o() {
        return this.f17513OooO00o;
    }
}
