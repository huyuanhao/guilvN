package com.p118pd.sdk;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.gost.BCGOST3410PrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.gost.BCGOST3410PublicKey;
import org.bouncycastle.jce.interfaces.GOST3410PrivateKey;
import org.bouncycastle.jce.interfaces.GOST3410PublicKey;

/* renamed from: com.pd.sdk.丨LlL1  reason: invalid class name and case insensitive filesystem */
public class C9527LlL1 extends AbstractC6446l1IlIlI {
    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PrivateKey OooO00o(C5464IlilIi r4) throws IOException {
        LlLI1 OooO00o = r4.m15707OooO0O0().OooO00o();
        if (OooO00o.equals(AbstractC5331ILi.OooOO0o)) {
            return new BCGOST3410PrivateKey(r4);
        }
        throw new IOException("algorithm identifier " + OooO00o + " in key not recognised");
    }

    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PublicKey OooO00o(C6888ll r4) throws IOException {
        LlLI1 OooO00o = r4.m18041OooO00o().OooO00o();
        if (OooO00o.equals(AbstractC5331ILi.OooOO0o)) {
            return new BCGOST3410PublicKey(r4);
        }
        throw new IOException("algorithm identifier " + OooO00o + " in key not recognised");
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof C9344I1ll ? new BCGOST3410PrivateKey((C9344I1ll) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof C5569ILi1LL ? new BCGOST3410PublicKey((C5569ILi1LL) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(C5569ILi1LL.class) && (key instanceof GOST3410PublicKey)) {
            GOST3410PublicKey gOST3410PublicKey = (GOST3410PublicKey) key;
            C9683lIi OooO00o = gOST3410PublicKey.getParameters().OooO00o();
            return new C5569ILi1LL(gOST3410PublicKey.getY(), OooO00o.OooO0O0(), OooO00o.OooO0OO(), OooO00o.OooO00o());
        } else if (!cls.isAssignableFrom(C9344I1ll.class) || !(key instanceof GOST3410PrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            GOST3410PrivateKey gOST3410PrivateKey = (GOST3410PrivateKey) key;
            C9683lIi OooO00o2 = gOST3410PrivateKey.getParameters().OooO00o();
            return new C9344I1ll(gOST3410PrivateKey.getX(), OooO00o2.OooO0O0(), OooO00o2.OooO0OO(), OooO00o2.OooO00o());
        }
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof GOST3410PublicKey) {
            return new BCGOST3410PublicKey((GOST3410PublicKey) key);
        }
        if (key instanceof GOST3410PrivateKey) {
            return new BCGOST3410PrivateKey((GOST3410PrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }
}
