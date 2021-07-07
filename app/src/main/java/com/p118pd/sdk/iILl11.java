package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.iI丨Ll11  reason: invalid class name */
public class iILl11 {
    public static final Integer OooO00o = I11I.OooO00o(12);

    public static BigInteger OooO00o(InputStream inputStream) throws IOException {
        return new BigInteger(1, L1LL1Ii.m15931OooO00o(inputStream));
    }

    public static void OooO00o(BigInteger bigInteger, OutputStream outputStream) throws IOException {
        L1LL1Ii.OooO00o(IIiL.OooO00o(bigInteger), outputStream);
    }

    public static void OooO00o(Hashtable hashtable, byte[] bArr) throws IOException {
        hashtable.put(OooO00o, OooO00o(bArr));
    }

    public static boolean OooO00o(int i) {
        switch (i) {
            case Lillilli.o0000o0o:
            case Lillilli.o0000o:
            case Lillilli.o0000oO0:
            case Lillilli.o0000oOO:
            case Lillilli.o0000oOo:
            case Lillilli.o0000oo0:
            case Lillilli.o0000ooO:
            case Lillilli.o000:
            case Lillilli.o000O000:
                return true;
            default:
                return false;
        }
    }

    public static byte[] OooO00o(Hashtable hashtable) throws IOException {
        byte[] OooO00o2 = L1LL1Ii.OooO00o(hashtable, OooO00o);
        if (OooO00o2 == null) {
            return null;
        }
        return OooO0O0(OooO00o2);
    }

    public static byte[] OooO00o(byte[] bArr) throws IOException {
        if (bArr != null) {
            return L1LL1Ii.m15933OooO00o(bArr);
        }
        throw new TlsFatalAlert(80);
    }

    public static byte[] OooO0O0(byte[] bArr) throws IOException {
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] OooO0OO = L1LL1Ii.m15946OooO0OO((InputStream) byteArrayInputStream);
            AbstractC6892l1.OooO0O0(byteArrayInputStream);
            return OooO0OO;
        }
        throw new IllegalArgumentException("'extensionData' cannot be null");
    }
}
