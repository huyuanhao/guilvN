package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParameters;

/* renamed from: com.pd.sdk.丨iiLII  reason: invalid class name and case insensitive filesystem */
public class C9616iiLII {
    public static AbstractC6854lLi1LL OooO00o(AlgorithmParameters algorithmParameters) throws IOException {
        try {
            return AbstractC6122iIlLiL.OooO00o(algorithmParameters.getEncoded("ASN.1"));
        } catch (Exception unused) {
            return AbstractC6122iIlLiL.OooO00o(algorithmParameters.getEncoded());
        }
    }

    public static String OooO00o(LlLI1 llLI1) {
        return AbstractC5711LiLli.Oooooo0.equals(llLI1) ? "MD5" : AbstractC9733l.OooO.equals(llLI1) ? "SHA1" : AbstractC5905LllI.OooO0o.equals(llLI1) ? "SHA224" : AbstractC5905LllI.OooO0OO.equals(llLI1) ? "SHA256" : AbstractC5905LllI.OooO0Oo.equals(llLI1) ? "SHA384" : AbstractC5905LllI.OooO0o0.equals(llLI1) ? "SHA512" : AbstractC9468L1lL.OooO0OO.equals(llLI1) ? "RIPEMD128" : AbstractC9468L1lL.OooO0O0.equals(llLI1) ? "RIPEMD160" : AbstractC9468L1lL.OooO0Oo.equals(llLI1) ? "RIPEMD256" : AbstractC5331ILi.OooO0O0.equals(llLI1) ? "GOST3411" : llLI1.m16387OooO0O0();
    }

    public static void OooO00o(AlgorithmParameters algorithmParameters, AbstractC6854lLi1LL r3) throws IOException {
        try {
            algorithmParameters.init(r3.OooO0O0().getEncoded(), "ASN.1");
        } catch (Exception unused) {
            algorithmParameters.init(r3.OooO0O0().getEncoded());
        }
    }
}
