package com.p118pd.sdk;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.i丨1丨Ii1  reason: invalid class name and case insensitive filesystem */
public class C6364i1Ii1 extends AbstractC6446l1IlIlI {
    private boolean OooO00o(LlLI1 llLI1) {
        return llLI1.equals(LLiII.OooO0oO) || llLI1.equals(LLiII.OooO0oo) || llLI1.equals(LLiII.OooOO0o) || llLI1.equals(LLiII.OooOOO0);
    }

    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PrivateKey OooO00o(C5464IlilIi r4) throws IOException {
        LlLI1 OooO00o = r4.m15707OooO0O0().OooO00o();
        if (OooO00o(OooO00o)) {
            return new BCECGOST3410_2012PrivateKey(r4);
        }
        throw new IOException("algorithm identifier " + OooO00o + " in key not recognised");
    }

    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PublicKey OooO00o(C6888ll r4) throws IOException {
        LlLI1 OooO00o = r4.m18041OooO00o().OooO00o();
        if (OooO00o(OooO00o)) {
            return new BCECGOST3410_2012PublicKey(r4);
        }
        throw new IOException("algorithm identifier " + OooO00o + " in key not recognised");
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof IL1IIl ? new BCECGOST3410_2012PrivateKey((IL1IIl) keySpec) : keySpec instanceof ECPrivateKeySpec ? new BCECGOST3410_2012PrivateKey((ECPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof C5769Ll1 ? new BCECGOST3410_2012PublicKey((C5769Ll1) keySpec, BouncyCastleProvider.CONFIGURATION) : keySpec instanceof ECPublicKeySpec ? new BCECGOST3410_2012PublicKey((ECPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(ECPublicKeySpec.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            C6106iIiIl OooO00o = BouncyCastleProvider.CONFIGURATION.OooO00o();
            return new ECPublicKeySpec(eCPublicKey.getW(), C6631lLlI.OooO00o(C6631lLlI.OooO00o(OooO00o.OooO00o(), OooO00o.m16971OooO00o()), OooO00o));
        } else if (cls.isAssignableFrom(ECPrivateKeySpec.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            C6106iIiIl OooO00o2 = BouncyCastleProvider.CONFIGURATION.OooO00o();
            return new ECPrivateKeySpec(eCPrivateKey.getS(), C6631lLlI.OooO00o(C6631lLlI.OooO00o(OooO00o2.OooO00o(), OooO00o2.m16971OooO00o()), OooO00o2));
        } else if (cls.isAssignableFrom(C5769Ll1.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new C5769Ll1(C6631lLlI.OooO00o(eCPublicKey2.getParams(), eCPublicKey2.getW(), false), C6631lLlI.OooO00o(eCPublicKey2.getParams(), false));
            }
            return new C5769Ll1(C6631lLlI.OooO00o(eCPublicKey2.getParams(), eCPublicKey2.getW(), false), BouncyCastleProvider.CONFIGURATION.OooO00o());
        } else if (!cls.isAssignableFrom(IL1IIl.class) || !(key instanceof ECPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new IL1IIl(eCPrivateKey2.getS(), C6631lLlI.OooO00o(eCPrivateKey2.getParams(), false));
            }
            return new IL1IIl(eCPrivateKey2.getS(), BouncyCastleProvider.CONFIGURATION.OooO00o());
        }
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("key type unknown");
    }
}
