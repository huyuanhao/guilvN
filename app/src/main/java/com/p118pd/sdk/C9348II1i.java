package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.BCDSAPublicKey;

/* renamed from: com.pd.sdk.丨II1i  reason: invalid class name and case insensitive filesystem */
public class C9348II1i {
    public static final LlLI1[] OooO00o = {AbstractC5420Il1iIL.o00OOooo, AbstractC9733l.OooOO0, AbstractC5420Il1iIL.o00OoOoO};

    public static L1llLl1 OooO00o(DSAParams dSAParams) {
        if (dSAParams != null) {
            return new L1llLl1(dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
        }
        return null;
    }

    public static C6213iL11I OooO00o(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof DSAPrivateKey) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) privateKey;
            return new C5907Ll1LI(dSAPrivateKey.getX(), new L1llLl1(dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG()));
        }
        throw new InvalidKeyException("can't identify DSA private key.");
    }

    public static C6213iL11I OooO00o(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCDSAPublicKey) {
            return ((BCDSAPublicKey) publicKey).engineGetKeyParameters();
        }
        if (publicKey instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) publicKey).engineGetKeyParameters();
        }
        try {
            return new BCDSAPublicKey(C6888ll.OooO00o(publicKey.getEncoded())).engineGetKeyParameters();
        } catch (Exception unused) {
            throw new InvalidKeyException("can't identify DSA public key: " + publicKey.getClass().getName());
        }
    }

    public static String OooO00o(BigInteger bigInteger, DSAParams dSAParams) {
        return new IiiiL1(C9586iIILl.OooO00o(bigInteger.toByteArray(), dSAParams.getP().toByteArray(), dSAParams.getQ().toByteArray(), dSAParams.getG().toByteArray())).toString();
    }

    public static boolean OooO00o(LlLI1 llLI1) {
        int i = 0;
        while (true) {
            LlLI1[] llLI1Arr = OooO00o;
            if (i == llLI1Arr.length) {
                return false;
            }
            if (llLI1.equals(llLI1Arr[i])) {
                return true;
            }
            i++;
        }
    }
}
