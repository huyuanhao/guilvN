package com.p118pd.sdk;

import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.pd.sdk.I丨i丨丨I  reason: invalid class name and case insensitive filesystem */
public class C5554IiI extends iIL1i {
    public C5554IiI(l1LILI1 r1, PublicKey publicKey) {
        super(r1, C6888ll.OooO00o(publicKey.getEncoded()));
    }

    public C5554IiI(X500Principal x500Principal, PublicKey publicKey) {
        super(l1LILI1.OooO00o(x500Principal.getEncoded()), C6888ll.OooO00o(publicKey.getEncoded()));
    }
}
