package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Il1LIlll */
public abstract class Il1LIlll extends II1ii1 {
    public void OooO00o(l1I1L r3, LlLI1 llLI1, String str) {
        r3.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + llLI1, str);
        r3.addAlgorithm("Alg.Alias.AlgorithmParameters." + llLI1, str);
    }

    public void OooO00o(l1I1L r3, LlLI1 llLI1, String str, AbstractC5416IilI r6) {
        r3.addAlgorithm("Alg.Alias.KeyFactory." + llLI1, str);
        r3.addAlgorithm("Alg.Alias.KeyPairGenerator." + llLI1, str);
        r3.addKeyInfoConverter(llLI1, r6);
    }

    public void OooO00o(l1I1L r5, String str, String str2, String str3, LlLI1 llLI1) {
        String str4 = str + "WITH" + str2;
        String str5 = str + "with" + str2;
        String str6 = str + "With" + str2;
        r5.addAlgorithm("Signature." + str4, str3);
        r5.addAlgorithm("Alg.Alias.Signature." + str5, str4);
        r5.addAlgorithm("Alg.Alias.Signature." + str6, str4);
        r5.addAlgorithm("Alg.Alias.Signature." + (str + C8932ooOOO0o.OooO0OO + str2), str4);
        r5.addAlgorithm("Alg.Alias.Signature." + llLI1, str4);
        r5.addAlgorithm("Alg.Alias.Signature.OID." + llLI1, str4);
    }

    public void OooO0O0(l1I1L r3, LlLI1 llLI1, String str) {
        r3.addAlgorithm("Alg.Alias.AlgorithmParameters." + llLI1, str);
    }
}
