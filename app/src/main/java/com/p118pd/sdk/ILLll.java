package com.p118pd.sdk;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import org.bouncycastle.crypto.PasswordConverter;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;

/* renamed from: com.pd.sdk.ILLl丨l  reason: invalid class name */
public class ILLll {

    /* renamed from: com.pd.sdk.ILLl丨l$OooO00o */
    public static class OooO00o extends C6338illll {
        public int o00oO0O;

        public OooO00o(String str, int i) {
            super(str, AbstractC5702Li111.Oooo0o0);
            this.o00oO0O = i;
        }

        @Override // javax.crypto.SecretKeyFactorySpi, com.p118pd.sdk.C6338illll
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof lLlllI) {
                lLlllI llllli = (lLlllI) keySpec;
                if (llllli.m17706OooO00o() == null) {
                    throw new IllegalArgumentException("Salt S must be provided.");
                } else if (llllli.OooO0O0() <= 1) {
                    throw new IllegalArgumentException("Cost parameter N must be > 1.");
                } else if (llllli.OooO0OO() <= 0) {
                    throw new InvalidKeySpecException("positive key length required: " + llllli.OooO0OO());
                } else if (llllli.m17707OooO00o().length != 0) {
                    return new BCPBEKey(this.o0ooOOo, llllli, new C6642li1LI(C9661l1l.OooO0O0(PasswordConverter.UTF8.convert(llllli.m17707OooO00o()), llllli.m17706OooO00o(), llllli.OooO0O0(), llllli.OooO00o(), llllli.OooO0Oo(), llllli.OooO0OO() / 8)));
                } else {
                    throw new IllegalArgumentException("password empty");
                }
            } else {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
        }
    }

    /* renamed from: com.pd.sdk.ILLl丨l$OooO0O0 */
    public static class OooO0O0 extends II1ii1 {
        public static final String OooO00o = ILLll.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r5) {
            r5.addAlgorithm("SecretKeyFactory.SCRYPT", OooO00o + "$ScryptWithUTF8");
            LlLI1 llLI1 = AbstractC5702Li111.Oooo0o0;
            r5.addAlgorithm("SecretKeyFactory", llLI1, OooO00o + "$ScryptWithUTF8");
        }
    }

    /* renamed from: com.pd.sdk.ILLl丨l$OooO0OO */
    public static class OooO0OO extends OooO00o {
        public OooO0OO() {
            super("SCRYPT", 5);
        }
    }
}
