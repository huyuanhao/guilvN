package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.pd.sdk.li1iIl  reason: case insensitive filesystem */
public class C6639li1iIl extends C93031i {
    public C6639li1iIl(BigInteger bigInteger) {
        super(bigInteger);
    }

    public C6639li1iIl OooO00o(PublicKey publicKey) {
        OooO00o(C6888ll.OooO00o(publicKey.getEncoded()));
        return this;
    }

    public C6639li1iIl OooO00o(X500Principal x500Principal) {
        if (x500Principal != null) {
            OooO00o(new ILI(l1LILI1.OooO00o(x500Principal.getEncoded())));
        }
        return this;
    }

    public C6639li1iIl OooO0O0(X500Principal x500Principal) {
        if (x500Principal != null) {
            OooO0O0(l1LILI1.OooO00o(x500Principal.getEncoded()));
        }
        return this;
    }

    public C6639li1iIl OooO0OO(X500Principal x500Principal) {
        if (x500Principal != null) {
            OooO0OO(l1LILI1.OooO00o(x500Principal.getEncoded()));
        }
        return this;
    }
}
