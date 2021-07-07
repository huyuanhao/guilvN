package com.p118pd.sdk;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.pd.sdk.illll丨丨  reason: invalid class name and case insensitive filesystem */
public class C6338illll extends SecretKeyFactorySpi implements AbstractC6840lI {
    public LlLI1 o00OoOOo;
    public String o0ooOOo;

    public C6338illll(String str, LlLI1 llLI1) {
        this.o0ooOOo = str;
        this.o00OoOOo = llLI1;
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof SecretKeySpec) {
            return new SecretKeySpec(((SecretKeySpec) keySpec).getEncoded(), this.o0ooOOo);
        }
        throw new InvalidKeySpecException("Invalid KeySpec");
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec parameter is null");
        } else if (secretKey == null) {
            throw new InvalidKeySpecException("key parameter is null");
        } else if (SecretKeySpec.class.isAssignableFrom(cls)) {
            return new SecretKeySpec(secretKey.getEncoded(), this.o0ooOOo);
        } else {
            try {
                return (KeySpec) cls.getConstructor(byte[].class).newInstance(secretKey.getEncoded());
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        if (secretKey == null) {
            throw new InvalidKeyException("key parameter is null");
        } else if (secretKey.getAlgorithm().equalsIgnoreCase(this.o0ooOOo)) {
            return new SecretKeySpec(secretKey.getEncoded(), this.o0ooOOo);
        } else {
            throw new InvalidKeyException("Key not of type " + this.o0ooOOo + C9058ooOoOoOO.OooOO0);
        }
    }
}
