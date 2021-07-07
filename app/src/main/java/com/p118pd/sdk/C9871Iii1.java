package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.cert.ocsp.OCSPException;

/* renamed from: com.pd.sdk.丨丨丨Iii1  reason: invalid class name and case insensitive filesystem */
public class C9871Iii1 {
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 3;
    public static final int OooO0o = 6;
    public static final int OooO0o0 = 5;

    public C5198III OooO00o(int i, Object obj) throws OCSPException {
        if (obj == null) {
            return new C5198III(new C6682liLi(new C9762IiI1l(i), null));
        }
        if (obj instanceof C6685lii111) {
            try {
                return new C5198III(new C6682liLi(new C9762IiI1l(i), new C9505LiL(AbstractC6085iIIlIIL.OooO0O0, new C6487lIIiIlL(((C6685lii111) obj).getEncoded()))));
            } catch (IOException e) {
                throw new OCSPException("can't encode object.", e);
            }
        } else {
            throw new OCSPException("unknown response object");
        }
    }
}
