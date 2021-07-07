package com.p118pd.sdk;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey;
import org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey;

/* renamed from: com.pd.sdk.IIi  reason: case insensitive filesystem */
public class C5206IIi {
    public static C6213iL11I OooO00o(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof BCRainbowPrivateKey) {
            BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) privateKey;
            return new iiLIiL(bCRainbowPrivateKey.getInvA1(), bCRainbowPrivateKey.getB1(), bCRainbowPrivateKey.getInvA2(), bCRainbowPrivateKey.getB2(), bCRainbowPrivateKey.getVi(), bCRainbowPrivateKey.getLayers());
        }
        throw new InvalidKeyException("can't identify Rainbow private key.");
    }

    public static C6213iL11I OooO00o(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCRainbowPublicKey) {
            BCRainbowPublicKey bCRainbowPublicKey = (BCRainbowPublicKey) publicKey;
            return new C6195iLllLLIi(bCRainbowPublicKey.getDocLength(), bCRainbowPublicKey.getCoeffQuadratic(), bCRainbowPublicKey.getCoeffSingular(), bCRainbowPublicKey.getCoeffScalar());
        }
        throw new InvalidKeyException("can't identify Rainbow public key: " + publicKey.getClass().getName());
    }
}
