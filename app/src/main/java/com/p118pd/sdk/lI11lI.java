package com.p118pd.sdk;

import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* renamed from: com.pd.sdk.l丨I11lI  reason: invalid class name */
public abstract class lI11lI extends AlgorithmParametersSpi {
    public abstract AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException;

    public boolean OooO00o(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls != null) {
            return OooO00o(cls);
        }
        throw new NullPointerException("argument to getParameterSpec must not be null");
    }
}
