package com.p118pd.sdk;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateCrtKey;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.ExtendedInvalidKeySpecException;

/* renamed from: com.pd.sdk.I1I1l丨L  reason: invalid class name */
public class I1I1lL extends AbstractC6446l1IlIlI {
    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PrivateKey OooO00o(C5464IlilIi r4) throws IOException {
        LlLI1 OooO00o = r4.m15707OooO0O0().OooO00o();
        if (C6703lill.OooO00o(OooO00o)) {
            C6563lL1Ll OooO00o2 = C6563lL1Ll.OooO00o(r4.m15708OooO0O0());
            return OooO00o2.OooO00o().intValue() == 0 ? new BCRSAPrivateKey(OooO00o2) : new BCRSAPrivateCrtKey(r4);
        }
        throw new IOException("algorithm identifier " + OooO00o + " in key not recognised");
    }

    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PublicKey OooO00o(C6888ll r4) throws IOException {
        LlLI1 OooO00o = r4.m18041OooO00o().OooO00o();
        if (C6703lill.OooO00o(OooO00o)) {
            return new BCRSAPublicKey(r4);
        }
        throw new IOException("algorithm identifier " + OooO00o + " in key not recognised");
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return OooO00o(C5464IlilIi.OooO00o(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                try {
                    return new BCRSAPrivateCrtKey(C6563lL1Ll.OooO00o(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception unused) {
                    throw new ExtendedInvalidKeySpecException("unable to process key spec: " + e.toString(), e);
                }
            }
        } else if (keySpec instanceof RSAPrivateCrtKeySpec) {
            return new BCRSAPrivateCrtKey((RSAPrivateCrtKeySpec) keySpec);
        } else {
            if (keySpec instanceof RSAPrivateKeySpec) {
                return new BCRSAPrivateKey((RSAPrivateKeySpec) keySpec);
            }
            throw new InvalidKeySpecException("Unknown KeySpec type: " + keySpec.getClass().getName());
        }
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof RSAPublicKeySpec ? new BCRSAPublicKey((RSAPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(RSAPublicKeySpec.class) && (key instanceof RSAPublicKey)) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) key;
            return new RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        } else if (cls.isAssignableFrom(RSAPrivateKeySpec.class) && (key instanceof RSAPrivateKey)) {
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) key;
            return new RSAPrivateKeySpec(rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        } else if (!cls.isAssignableFrom(RSAPrivateCrtKeySpec.class) || !(key instanceof RSAPrivateCrtKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) key;
            return new RSAPrivateCrtKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
        }
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof RSAPublicKey) {
            return new BCRSAPublicKey((RSAPublicKey) key);
        }
        if (key instanceof RSAPrivateCrtKey) {
            return new BCRSAPrivateCrtKey((RSAPrivateCrtKey) key);
        }
        if (key instanceof RSAPrivateKey) {
            return new BCRSAPrivateKey((RSAPrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }
}
