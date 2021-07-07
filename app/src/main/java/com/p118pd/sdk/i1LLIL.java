package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.i1LLIL */
public class i1LLIL {
    public static final AbstractC5335ILl OooO00o = C6452l1Lll.OooO00o;

    public static String OooO00o(LlLI1 llLI1) {
        String OooO00o2 = lil1Il1.OooO00o(llLI1);
        int indexOf = OooO00o2.indexOf(45);
        if (indexOf <= 0 || OooO00o2.startsWith("SHA3")) {
            return lil1Il1.OooO00o(llLI1);
        }
        return OooO00o2.substring(0, indexOf) + OooO00o2.substring(indexOf + 1);
    }

    public static String OooO00o(C6456l1ilL r6) {
        AbstractC6854lLi1LL OooO0O0 = r6.m17587OooO0O0();
        if (OooO0O0 != null && !OooO00o.equals(OooO0O0)) {
            if (r6.OooO00o().equals(AbstractC5711LiLli.Oooo00o)) {
                C6692lii OooO00o2 = C6692lii.OooO00o(OooO0O0);
                return OooO00o(OooO00o2.OooO00o().OooO00o()) + "withRSAandMGF1";
            } else if (r6.OooO00o().equals(AbstractC5420Il1iIL.o00O0o)) {
                I11li1 OooO00o3 = I11li1.OooO00o(OooO0O0);
                return OooO00o((LlLI1) OooO00o3.OooO00o(0)) + "withECDSA";
            }
        }
        Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (provider != null) {
            String property = provider.getProperty("Alg.Alias.Signature." + r6.OooO00o().m16387OooO0O0());
            if (property != null) {
                return property;
            }
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            Provider provider2 = providers[i];
            String property2 = provider2.getProperty("Alg.Alias.Signature." + r6.OooO00o().m16387OooO0O0());
            if (property2 != null) {
                return property2;
            }
        }
        return r6.OooO00o().m16387OooO0O0();
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
