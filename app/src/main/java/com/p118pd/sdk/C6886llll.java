package com.p118pd.sdk;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.jce.interfaces.GOST3410PrivateKey;
import org.bouncycastle.jce.interfaces.GOST3410PublicKey;

/* renamed from: com.pd.sdk.l丨lll丨  reason: invalid class name and case insensitive filesystem */
public class C6886llll {
    public static C6213iL11I OooO00o(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof GOST3410PrivateKey) {
            GOST3410PrivateKey gOST3410PrivateKey = (GOST3410PrivateKey) privateKey;
            C9683lIi OooO00o = gOST3410PrivateKey.getParameters().OooO00o();
            return new C6463l1lI(gOST3410PrivateKey.getX(), new Ii1lIl(OooO00o.OooO0O0(), OooO00o.OooO0OO(), OooO00o.OooO00o()));
        }
        throw new InvalidKeyException("can't identify GOST3410 private key.");
    }

    public static C6213iL11I OooO00o(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof GOST3410PublicKey) {
            GOST3410PublicKey gOST3410PublicKey = (GOST3410PublicKey) publicKey;
            C9683lIi OooO00o = gOST3410PublicKey.getParameters().OooO00o();
            return new C5201IIL(gOST3410PublicKey.getY(), new Ii1lIl(OooO00o.OooO0O0(), OooO00o.OooO0OO(), OooO00o.OooO00o()));
        }
        throw new InvalidKeyException("can't identify GOST3410 public key: " + publicKey.getClass().getName());
    }
}
