package com.p118pd.sdk;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.elgamal.BCElGamalPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.elgamal.BCElGamalPublicKey;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;

/* renamed from: com.pd.sdk.iIl丨LIl  reason: invalid class name and case insensitive filesystem */
public class C6129iIlLIl extends AbstractC6446l1IlIlI {
    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PrivateKey OooO00o(C5464IlilIi r4) throws IOException {
        LlLI1 OooO00o = r4.m15707OooO0O0().OooO00o();
        if (OooO00o.equals(AbstractC5711LiLli.Oooo)) {
            return new BCElGamalPrivateKey(r4);
        }
        if (OooO00o.equals(AbstractC5420Il1iIL.o00Oo0Oo)) {
            return new BCElGamalPrivateKey(r4);
        }
        if (OooO00o.equals(AbstractC9733l.OooOO0o)) {
            return new BCElGamalPrivateKey(r4);
        }
        throw new IOException("algorithm identifier " + OooO00o + " in key not recognised");
    }

    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PublicKey OooO00o(C6888ll r4) throws IOException {
        LlLI1 OooO00o = r4.m18041OooO00o().OooO00o();
        if (OooO00o.equals(AbstractC5711LiLli.Oooo)) {
            return new BCElGamalPublicKey(r4);
        }
        if (OooO00o.equals(AbstractC5420Il1iIL.o00Oo0Oo)) {
            return new BCElGamalPublicKey(r4);
        }
        if (OooO00o.equals(AbstractC9733l.OooOO0o)) {
            return new BCElGamalPublicKey(r4);
        }
        throw new IOException("algorithm identifier " + OooO00o + " in key not recognised");
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof C6020i1Il ? new BCElGamalPrivateKey((C6020i1Il) keySpec) : keySpec instanceof DHPrivateKeySpec ? new BCElGamalPrivateKey((DHPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof C9534Llil ? new BCElGamalPublicKey((C9534Llil) keySpec) : keySpec instanceof DHPublicKeySpec ? new BCElGamalPublicKey((DHPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(DHPrivateKeySpec.class) && (key instanceof DHPrivateKey)) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            return new DHPrivateKeySpec(dHPrivateKey.getX(), dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
        } else if (!cls.isAssignableFrom(DHPublicKeySpec.class) || !(key instanceof DHPublicKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            DHPublicKey dHPublicKey = (DHPublicKey) key;
            return new DHPublicKeySpec(dHPublicKey.getY(), dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
        }
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DHPublicKey) {
            return new BCElGamalPublicKey((DHPublicKey) key);
        }
        if (key instanceof DHPrivateKey) {
            return new BCElGamalPrivateKey((DHPrivateKey) key);
        }
        if (key instanceof ElGamalPublicKey) {
            return new BCElGamalPublicKey((ElGamalPublicKey) key);
        }
        if (key instanceof ElGamalPrivateKey) {
            return new BCElGamalPrivateKey((ElGamalPrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }
}
