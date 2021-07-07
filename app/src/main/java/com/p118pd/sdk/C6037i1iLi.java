package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParameters;

/* renamed from: com.pd.sdk.i1iLi  reason: case insensitive filesystem */
public class C6037i1iLi {
    public static AbstractC6854lLi1LL OooO00o(AlgorithmParameters algorithmParameters) throws IOException {
        try {
            return AbstractC6122iIlLiL.OooO00o(algorithmParameters.getEncoded("ASN.1"));
        } catch (Exception unused) {
            return AbstractC6122iIlLiL.OooO00o(algorithmParameters.getEncoded());
        }
    }

    public static void OooO00o(AlgorithmParameters algorithmParameters, AbstractC6854lLi1LL r3) throws IOException {
        try {
            algorithmParameters.init(r3.OooO0O0().getEncoded(), "ASN.1");
        } catch (Exception unused) {
            algorithmParameters.init(r3.OooO0O0().getEncoded());
        }
    }
}
