package com.p118pd.sdk;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;

/* renamed from: com.pd.sdk.iil  reason: case insensitive filesystem */
public class C6268iil {
    public static C6213iL11I OooO00o(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
            return new C6389ii(dHPrivateKey.getX(), new C6017i1Il(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG(), null, dHPrivateKey.getParams().getL()));
        }
        throw new InvalidKeyException("can't identify DH private key.");
    }

    public static C6213iL11I OooO00o(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
            return new LiIiLii(dHPublicKey.getY(), new C6017i1Il(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG(), null, dHPublicKey.getParams().getL()));
        }
        throw new InvalidKeyException("can't identify DH public key.");
    }
}
