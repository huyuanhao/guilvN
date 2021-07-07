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
import org.bouncycastle.jcajce.provider.asymmetric.p290dh.BCDHPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.p290dh.BCDHPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.ExtendedInvalidKeySpecException;

/* renamed from: com.pd.sdk.丨ilLi丨lI  reason: invalid class name and case insensitive filesystem */
public class C9629ilLilI extends AbstractC6446l1IlIlI {
    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PrivateKey OooO00o(C5464IlilIi r4) throws IOException {
        LlLI1 OooO00o = r4.m15707OooO0O0().OooO00o();
        if (OooO00o.equals(AbstractC5711LiLli.Oooo)) {
            return new BCDHPrivateKey(r4);
        }
        if (OooO00o.equals(AbstractC5420Il1iIL.o00Oo0Oo)) {
            return new BCDHPrivateKey(r4);
        }
        throw new IOException("algorithm identifier " + OooO00o + " in key not recognised");
    }

    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PublicKey OooO00o(C6888ll r4) throws IOException {
        LlLI1 OooO00o = r4.m18041OooO00o().OooO00o();
        if (OooO00o.equals(AbstractC5711LiLli.Oooo)) {
            return new BCDHPublicKey(r4);
        }
        if (OooO00o.equals(AbstractC5420Il1iIL.o00Oo0Oo)) {
            return new BCDHPublicKey(r4);
        }
        throw new IOException("algorithm identifier " + OooO00o + " in key not recognised");
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof DHPrivateKeySpec ? new BCDHPrivateKey((DHPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof DHPublicKeySpec)) {
            return super.engineGeneratePublic(keySpec);
        }
        try {
            return new BCDHPublicKey((DHPublicKeySpec) keySpec);
        } catch (IllegalArgumentException e) {
            throw new ExtendedInvalidKeySpecException(e.getMessage(), e);
        }
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
            return new BCDHPublicKey((DHPublicKey) key);
        }
        if (key instanceof DHPrivateKey) {
            return new BCDHPrivateKey((DHPrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }
}
