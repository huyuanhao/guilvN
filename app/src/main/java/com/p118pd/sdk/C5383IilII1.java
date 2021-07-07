package com.p118pd.sdk;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.IilII丨1  reason: invalid class name and case insensitive filesystem */
public class C5383IilII1 extends KeyFactorySpi {
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                C5464IlilIi OooO00o = C5464IlilIi.OooO00o(((PKCS8EncodedKeySpec) keySpec).getEncoded());
                PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(OooO00o);
                if (privateKey != null) {
                    return privateKey;
                }
                throw new InvalidKeySpecException("no factory found for OID: " + OooO00o.m15707OooO0O0().OooO00o());
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException("Unknown KeySpec type: " + keySpec.getClass().getName());
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                C6888ll OooO00o = C6888ll.OooO00o(((X509EncodedKeySpec) keySpec).getEncoded());
                PublicKey publicKey = BouncyCastleProvider.getPublicKey(OooO00o);
                if (publicKey != null) {
                    return publicKey;
                }
                throw new InvalidKeySpecException("no factory found for OID: " + OooO00o.m18041OooO00o().OooO00o());
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException("Unknown KeySpec type: " + keySpec.getClass().getName());
        }
    }

    @Override // java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(PKCS8EncodedKeySpec.class) && key.getFormat().equals("PKCS#8")) {
            return new PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (cls.isAssignableFrom(X509EncodedKeySpec.class) && key.getFormat().equals("X.509")) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException("not implemented yet " + key + " " + cls);
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("not implemented yet " + key);
    }
}
