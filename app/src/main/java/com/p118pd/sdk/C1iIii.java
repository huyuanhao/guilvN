package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;

/* renamed from: com.pd.sdk.丨1i丨Ii丨i  reason: invalid class name */
public class C1iIii {
    public static final AbstractC5335ILl OooO00o = C6452l1Lll.OooO00o;

    public static String OooO00o(LlLI1 llLI1) {
        return AbstractC5711LiLli.Oooooo0.equals(llLI1) ? "MD5" : AbstractC9733l.OooO.equals(llLI1) ? "SHA1" : AbstractC5905LllI.OooO0o.equals(llLI1) ? "SHA224" : AbstractC5905LllI.OooO0OO.equals(llLI1) ? "SHA256" : AbstractC5905LllI.OooO0Oo.equals(llLI1) ? "SHA384" : AbstractC5905LllI.OooO0o0.equals(llLI1) ? "SHA512" : AbstractC9468L1lL.OooO0OO.equals(llLI1) ? "RIPEMD128" : AbstractC9468L1lL.OooO0O0.equals(llLI1) ? "RIPEMD160" : AbstractC9468L1lL.OooO0Oo.equals(llLI1) ? "RIPEMD256" : AbstractC5331ILi.OooO0O0.equals(llLI1) ? "GOST3411" : llLI1.m16387OooO0O0();
    }

    public static String OooO00o(C6456l1ilL r3) {
        AbstractC6854lLi1LL OooO0O0 = r3.m17587OooO0O0();
        if (OooO0O0 != null && !OooO00o.equals(OooO0O0)) {
            if (r3.OooO00o().equals(AbstractC5711LiLli.Oooo00o)) {
                C6692lii OooO00o2 = C6692lii.OooO00o(OooO0O0);
                return OooO00o(OooO00o2.OooO00o().OooO00o()) + "withRSAandMGF1";
            } else if (r3.OooO00o().equals(AbstractC5420Il1iIL.o00O0o)) {
                I11li1 OooO00o3 = I11li1.OooO00o(OooO0O0);
                return OooO00o(LlLI1.OooO00o(OooO00o3.OooO00o(0))) + "withECDSA";
            }
        }
        return r3.OooO00o().m16387OooO0O0();
    }

    public static void OooO00o(Signature signature, AbstractC6854lLi1LL r3) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (r3 != null && !OooO00o.equals(r3)) {
            AlgorithmParameters instance = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
            try {
                instance.init(r3.OooO0O0().getEncoded());
                if (signature.getAlgorithm().endsWith("MGF1")) {
                    try {
                        signature.setParameter(instance.getParameterSpec(PSSParameterSpec.class));
                    } catch (GeneralSecurityException e) {
                        throw new SignatureException("Exception extracting parameters: " + e.getMessage());
                    }
                }
            } catch (IOException e2) {
                throw new SignatureException("IOException decoding parameters: " + e2.getMessage());
            }
        }
    }
}
