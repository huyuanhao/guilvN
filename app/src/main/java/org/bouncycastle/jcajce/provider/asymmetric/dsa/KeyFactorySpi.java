package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.p118pd.sdk.AbstractC6446l1IlIlI;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C9348II1i;
import com.p118pd.sdk.LlLI1;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class KeyFactorySpi extends AbstractC6446l1IlIlI {
    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PrivateKey OooO00o(C5464IlilIi r4) throws IOException {
        LlLI1 OooO00o = r4.m15707OooO0O0().OooO00o();
        if (C9348II1i.OooO00o(OooO00o)) {
            return new BCDSAPrivateKey(r4);
        }
        throw new IOException("algorithm identifier " + OooO00o + " in key not recognised");
    }

    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PublicKey OooO00o(C6888ll r4) throws IOException {
        LlLI1 OooO00o = r4.m18041OooO00o().OooO00o();
        if (C9348II1i.OooO00o(OooO00o)) {
            return new BCDSAPublicKey(r4);
        }
        throw new IOException("algorithm identifier " + OooO00o + " in key not recognised");
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof DSAPrivateKeySpec ? new BCDSAPrivateKey((DSAPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof DSAPublicKeySpec)) {
            return super.engineGeneratePublic(keySpec);
        }
        try {
            return new BCDSAPublicKey((DSAPublicKeySpec) keySpec);
        } catch (Exception e) {
            throw new InvalidKeySpecException("invalid KeySpec: " + e.getMessage()) {
                /* class org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi.C48351 */

                public Throwable getCause() {
                    return e;
                }
            };
        }
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(DSAPublicKeySpec.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey) key;
            return new DSAPublicKeySpec(dSAPublicKey.getY(), dSAPublicKey.getParams().getP(), dSAPublicKey.getParams().getQ(), dSAPublicKey.getParams().getG());
        } else if (!cls.isAssignableFrom(DSAPrivateKeySpec.class) || !(key instanceof DSAPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) key;
            return new DSAPrivateKeySpec(dSAPrivateKey.getX(), dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG());
        }
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) key);
        }
        if (key instanceof DSAPrivateKey) {
            return new BCDSAPrivateKey((DSAPrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }
}
