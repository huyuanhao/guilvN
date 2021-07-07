package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.LLILiL11 */
public abstract class LLILiL11 {
    public final SecureRandom OooO00o;

    public LLILiL11(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.OooO00o = secureRandom;
            return;
        }
        throw new IllegalArgumentException("'secureRandom' cannot be null");
    }

    public static short OooO00o(boolean z, Hashtable hashtable, Hashtable hashtable2, short s) throws IOException {
        short OooO00o2 = C6115iIiL.m17003OooO00o(hashtable2);
        if (OooO00o2 < 0 || (ii1l1L.OooO00o(OooO00o2) && (z || OooO00o2 == C6115iIiL.m17003OooO00o(hashtable)))) {
            return OooO00o2;
        }
        throw new TlsFatalAlert(s);
    }

    public static void OooO00o(int i, short s) throws IOException {
        int OooO0O0 = L1LL1Ii.OooO0O0(i);
        if (OooO0O0 == 1 || OooO0O0 == 2) {
            throw new TlsFatalAlert(s);
        }
    }

    public static void OooO00o(C1IlLiL1 r1, short s) throws IOException {
        if (s < 0) {
            return;
        }
        if (ii1l1L.OooO00o(s)) {
            r1.OooO00o(1 << (s + 8));
            return;
        }
        throw new TlsFatalAlert(80);
    }

    public static byte[] OooO00o(C6827lIIi1I1 r1) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        r1.OooO00o(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] OooO00o(Vector vector) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AbstractC6892l1.OooO00o(byteArrayOutputStream, vector);
        return byteArrayOutputStream.toByteArray();
    }

    public void OooO00o(byte[] bArr, byte[] bArr2) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byte[] OooO0O0 = L1LL1Ii.OooO0O0(bArr2.length, byteArrayInputStream);
        AbstractC6892l1.OooO0O0(byteArrayInputStream);
        if (!C9586iIILl.OooO0O0(bArr2, OooO0O0)) {
            throw new TlsFatalAlert(40);
        }
    }
}
