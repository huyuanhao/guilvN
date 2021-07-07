package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* renamed from: com.pd.sdk.丨丨i1  reason: invalid class name and case insensitive filesystem */
public class C9830i1 extends AlgorithmParametersSpi {
    public lLi1lILl OooO00o;

    public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
        if (cls == C9683lIi.class || cls == AlgorithmParameterSpec.class) {
            return this.OooO00o;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to GOST3410 parameters object.");
    }

    public boolean OooO00o(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            return new C9574i1iIiI(new LlLI1(this.OooO00o.m17689OooO00o()), new LlLI1(this.OooO00o.OooO0O0()), new LlLI1(this.OooO00o.OooO0OO())).OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding GOST3410Parameters");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) {
        if (OooO00o(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls != null) {
            return OooO00o(cls);
        }
        throw new NullPointerException("argument to getParameterSpec must not be null");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof lLi1lILl) {
            this.OooO00o = (lLi1lILl) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("GOST3410ParameterSpec required to initialise a GOST3410 algorithm parameters object");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        try {
            this.OooO00o = lLi1lILl.OooO00o(new C9574i1iIiI((I11li1) AbstractC6122iIlLiL.OooO00o(bArr)));
        } catch (ClassCastException unused) {
            throw new IOException("Not a valid GOST3410 Parameter encoding.");
        } catch (ArrayIndexOutOfBoundsException unused2) {
            throw new IOException("Not a valid GOST3410 Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (OooO00o(str) || str.equalsIgnoreCase("X.509")) {
            engineInit(bArr);
            return;
        }
        throw new IOException("Unknown parameter format " + str);
    }

    public String engineToString() {
        return "GOST3410 Parameters";
    }
}
