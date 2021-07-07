package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.li1丨I  reason: invalid class name and case insensitive filesystem */
public class C6641li1I {
    public Vector OooO00o;

    public C6641li1I(Vector vector) {
        if (vector != null) {
            this.OooO00o = vector;
            return;
        }
        throw new IllegalArgumentException("'serverNameList' must not be null");
    }

    public static C6641li1I OooO00o(InputStream inputStream) throws IOException {
        int OooO00o2 = L1LL1Ii.OooO00o(inputStream);
        if (OooO00o2 >= 1) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(L1LL1Ii.OooO0O0(OooO00o2, inputStream));
            short[] sArr = new short[0];
            Vector vector = new Vector();
            while (byteArrayInputStream.available() > 0) {
                liiiIl OooO00o3 = liiiIl.OooO00o(byteArrayInputStream);
                sArr = OooO00o(sArr, OooO00o3.m18016OooO00o());
                if (sArr != null) {
                    vector.addElement(OooO00o3);
                } else {
                    throw new TlsFatalAlert(47);
                }
            }
            return new C6641li1I(vector);
        }
        throw new TlsFatalAlert(50);
    }

    public static short[] OooO00o(short[] sArr, short s) {
        if (!C6802llI.OooO00o(s) || C9586iIILl.m21629OooO00o(sArr, s)) {
            return null;
        }
        return C9586iIILl.m21643OooO00o(sArr, s);
    }

    public Vector OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        short[] sArr = new short[0];
        for (int i = 0; i < this.OooO00o.size(); i++) {
            liiiIl r3 = (liiiIl) this.OooO00o.elementAt(i);
            sArr = OooO00o(sArr, r3.m18016OooO00o());
            if (sArr != null) {
                r3.OooO00o(byteArrayOutputStream);
            } else {
                throw new TlsFatalAlert(80);
            }
        }
        L1LL1Ii.m15925OooO00o(byteArrayOutputStream.size());
        L1LL1Ii.OooO00o(byteArrayOutputStream.size(), outputStream);
        C6304ilIi1.OooO00o(byteArrayOutputStream, outputStream);
    }
}
