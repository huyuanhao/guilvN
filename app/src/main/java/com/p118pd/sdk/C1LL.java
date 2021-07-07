package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.PublicKey;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.pd.sdk.丨1LL丨  reason: invalid class name */
public class C1LL extends C6104iIi111l {
    public C1LL(l1LILI1 r8, BigInteger bigInteger, Date date, Date date2, l1LILI1 r12, PublicKey publicKey) {
        super(r8, bigInteger, date, date2, r12, C6888ll.OooO00o(publicKey.getEncoded()));
    }

    public C1LL(X500Principal x500Principal, BigInteger bigInteger, Date date, Date date2, X500Principal x500Principal2, PublicKey publicKey) {
        super(l1LILI1.OooO00o(x500Principal.getEncoded()), bigInteger, date, date2, l1LILI1.OooO00o(x500Principal2.getEncoded()), C6888ll.OooO00o(publicKey.getEncoded()));
    }
}
