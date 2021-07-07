package com.p118pd.sdk;

import java.security.NoSuchAlgorithmException;
import java.security.Signature;

/* renamed from: com.pd.sdk.iIlLLIiL */
public class iIlLLIiL extends AbstractC6617lLlIII {
    @Override // com.p118pd.sdk.AbstractC6617lLlIII
    public Signature OooO00o(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str);
    }
}
