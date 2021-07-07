package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.IIIiiL */
public class IIIiiL {
    public static final Integer OooO00o = I11I.OooO00o(14);

    public static C6131iI OooO00o(Hashtable hashtable) throws IOException {
        byte[] OooO00o2 = L1LL1Ii.OooO00o(hashtable, OooO00o);
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o(OooO00o2);
    }

    public static C6131iI OooO00o(byte[] bArr) throws IOException {
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            int OooO00o2 = L1LL1Ii.OooO00o((InputStream) byteArrayInputStream);
            if (OooO00o2 < 2 || (OooO00o2 & 1) != 0) {
                throw new TlsFatalAlert(50);
            }
            int[] OooO00o3 = L1LL1Ii.m15934OooO00o(OooO00o2 / 2, (InputStream) byteArrayInputStream);
            byte[] OooO0OO = L1LL1Ii.m15946OooO0OO((InputStream) byteArrayInputStream);
            AbstractC6892l1.OooO0O0(byteArrayInputStream);
            return new C6131iI(OooO00o3, OooO0OO);
        }
        throw new IllegalArgumentException("'extensionData' cannot be null");
    }

    public static void OooO00o(Hashtable hashtable, C6131iI r2) throws IOException {
        hashtable.put(OooO00o, OooO00o(r2));
    }

    public static byte[] OooO00o(C6131iI r2) throws IOException {
        if (r2 != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            L1LL1Ii.OooO0O0(r2.m17034OooO00o(), byteArrayOutputStream);
            L1LL1Ii.OooO0OO(r2.OooO00o(), byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalArgumentException("'useSRTPData' cannot be null");
    }
}
