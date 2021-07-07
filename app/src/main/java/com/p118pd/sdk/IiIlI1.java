package com.p118pd.sdk;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;

/* renamed from: com.pd.sdk.IiIlI1 */
public class IiIlI1 {
    public static C6213iL11I OooO00o(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof ElGamalPrivateKey) {
            ElGamalPrivateKey elGamalPrivateKey = (ElGamalPrivateKey) privateKey;
            return new C6336illiIil(elGamalPrivateKey.getX(), new C5312ILl(elGamalPrivateKey.getParameters().OooO0O0(), elGamalPrivateKey.getParameters().OooO00o()));
        } else if (privateKey instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
            return new C6336illiIil(dHPrivateKey.getX(), new C5312ILl(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG()));
        } else {
            throw new InvalidKeyException("can't identify private key for El Gamal.");
        }
    }

    public static C6213iL11I OooO00o(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof ElGamalPublicKey) {
            ElGamalPublicKey elGamalPublicKey = (ElGamalPublicKey) publicKey;
            return new i1I1L(elGamalPublicKey.getY(), new C5312ILl(elGamalPublicKey.getParameters().OooO0O0(), elGamalPublicKey.getParameters().OooO00o()));
        } else if (publicKey instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
            return new i1I1L(dHPublicKey.getY(), new C5312ILl(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG()));
        } else {
            throw new InvalidKeyException("can't identify public key for El Gamal.");
        }
    }
}
