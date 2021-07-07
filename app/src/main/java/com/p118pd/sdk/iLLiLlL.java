package com.p118pd.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.iLLiLl丨L  reason: invalid class name */
public class iLLiLlL {
    public static final String OooO00o = "org.bouncycastle.jcajce.provider.asymmetric.ec.";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map<String, String> f17738OooO00o;

    /* renamed from: com.pd.sdk.iLLiLl丨L$OooO00o */
    public static class OooO00o extends Il1LIlll {
        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Signature.SM3WITHSM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi$sm3WithSM2");
            r3.addAlgorithm("Alg.Alias.Signature." + AbstractC6041i1l.OooooO0, "SM3WITHSM2");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f17738OooO00o = hashMap;
        hashMap.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        f17738OooO00o.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
