package com.p118pd.sdk;

import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.cert.ocsp.OCSPException;

/* renamed from: com.pd.sdk.丨IiLl  reason: invalid class name and case insensitive filesystem */
public class C9380IiLl extends C9613ii {
    public C9380IiLl(PublicKey publicKey, I111LIL r2) throws OCSPException {
        super(C6888ll.OooO00o(publicKey.getEncoded()), r2);
    }

    public C9380IiLl(X500Principal x500Principal) {
        super(l1LILI1.OooO00o(x500Principal.getEncoded()));
    }
}
