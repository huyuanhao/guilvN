package com.p118pd.sdk;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPrivateKey;
import org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPublicKey;

/* renamed from: com.pd.sdk.i1LILL1 */
public class i1LILL1 extends KeyFactorySpi implements AbstractC5416IilI {
    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PrivateKey OooO00o(C5464IlilIi r2) throws IOException {
        return new BCNHPrivateKey(r2);
    }

    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PublicKey OooO00o(C6888ll r2) throws IOException {
        return new BCNHPublicKey(r2);
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return OooO00o(C5464IlilIi.OooO00o(AbstractC6122iIlLiL.OooO00o(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + C9058ooOoOoOO.OooOO0);
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return OooO00o(C6888ll.OooO00o(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException("Unknown key specification: " + keySpec + C9058ooOoOoOO.OooOO0);
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof BCNHPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (!(key instanceof BCNHPublicKey)) {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + C9058ooOoOoOO.OooOO0);
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + C9058ooOoOoOO.OooOO0);
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof BCNHPrivateKey) || (key instanceof BCNHPublicKey)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
