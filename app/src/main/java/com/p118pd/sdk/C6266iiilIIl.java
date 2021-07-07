package com.p118pd.sdk;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey;
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey;

/* renamed from: com.pd.sdk.iiilIIl  reason: case insensitive filesystem */
public class C6266iiilIIl {
    public static C6213iL11I OooO00o(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof BCMcElieceCCA2PrivateKey) {
            return ((BCMcElieceCCA2PrivateKey) privateKey).getKeyParams();
        }
        throw new InvalidKeyException("can't identify McElieceCCA2 private key.");
    }

    public static C6213iL11I OooO00o(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCMcElieceCCA2PublicKey) {
            return ((BCMcElieceCCA2PublicKey) publicKey).getKeyParams();
        }
        throw new InvalidKeyException("can't identify McElieceCCA2 public key: " + publicKey.getClass().getName());
    }
}
