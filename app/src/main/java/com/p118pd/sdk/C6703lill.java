package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/* renamed from: com.pd.sdk.lill  reason: case insensitive filesystem */
public class C6703lill {
    public static final LlLI1[] OooO00o = {AbstractC5711LiLli.OooOoO0, AbstractC5855LLl.o00O000, AbstractC5711LiLli.OooOooo, AbstractC5711LiLli.Oooo00o};

    public static liLI1l1i OooO00o(RSAPrivateKey rSAPrivateKey) {
        if (!(rSAPrivateKey instanceof RSAPrivateCrtKey)) {
            return new liLI1l1i(true, rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) rSAPrivateKey;
        return new C11lI(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
    }

    public static liLI1l1i OooO00o(RSAPublicKey rSAPublicKey) {
        return new liLI1l1i(false, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
    }

    public static String OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
        return new IiiiL1(C9586iIILl.m21645OooO0O0(bigInteger.toByteArray(), bigInteger2.toByteArray())).toString();
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
