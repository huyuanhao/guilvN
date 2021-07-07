package com.p118pd.sdk;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.Il1Ii1 */
public final class Il1Ii1 {

    /* renamed from: com.pd.sdk.Il1Ii1$OooO00o */
    public static class OooO00o extends II1ii1 {
        public static final String OooO00o = Il1Ii1.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("SecretKeyFactory.PBKDF-OPENSSL", OooO00o + "$PBKDF");
        }
    }

    /* renamed from: com.pd.sdk.Il1Ii1$OooO0O0 */
    public static class OooO0O0 extends C6338illll {
        public OooO0O0() {
            super("PBKDF-OpenSSL", null);
        }

        @Override // javax.crypto.SecretKeyFactorySpi, com.p118pd.sdk.C6338illll
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
                if (pBEKeySpec.getSalt() == null) {
                    throw new InvalidKeySpecException("missing required salt");
                } else if (pBEKeySpec.getIterationCount() <= 0) {
                    throw new InvalidKeySpecException("positive iteration count required: " + pBEKeySpec.getIterationCount());
                } else if (pBEKeySpec.getKeyLength() <= 0) {
                    throw new InvalidKeySpecException("positive key length required: " + pBEKeySpec.getKeyLength());
                } else if (pBEKeySpec.getPassword().length != 0) {
                    C9695lLlLL r0 = new C9695lLlLL();
                    r0.OooO00o(Strings.OooO00o(pBEKeySpec.getPassword()), pBEKeySpec.getSalt());
                    return new SecretKeySpec(((C6642li1LI) r0.OooO0O0(pBEKeySpec.getKeyLength())).OooO00o(), "OpenSSLPBKDF");
                } else {
                    throw new IllegalArgumentException("password empty");
                }
            } else {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
        }
    }
}
