package com.p118pd.sdk;

import java.security.Provider;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.li1l丨I  reason: invalid class name and case insensitive filesystem */
public class C6640li1lI extends LLIlii {
    public static volatile Provider OooO0O0;

    public C6640li1lI() {
        super(OooO00o());
    }

    public static Provider OooO00o() {
        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) != null) {
            return Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        }
        if (OooO0O0 != null) {
            return OooO0O0;
        }
        OooO0O0 = new BouncyCastleProvider();
        return OooO0O0;
    }
}
