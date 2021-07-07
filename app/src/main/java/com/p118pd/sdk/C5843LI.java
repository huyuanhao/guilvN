package com.p118pd.sdk;

import java.security.PrivateKey;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.pd.sdk.L丨I  reason: invalid class name and case insensitive filesystem */
public class C5843LI extends C9860liliL {
    public C5843LI(PrivateKey privateKey, ILI ili) {
        super(C5464IlilIi.OooO00o(privateKey.getEncoded()), ili);
    }

    public C5843LI(PrivateKey privateKey, l1LILI1 r3) {
        this(privateKey, new ILI(r3));
    }

    public C5843LI(PrivateKey privateKey, X500Principal x500Principal) {
        this(privateKey, l1LILI1.OooO00o(x500Principal.getEncoded()));
    }
}
