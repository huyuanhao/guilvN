package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* renamed from: com.pd.sdk.L丨1丨111I  reason: invalid class name */
public class L1111I extends AlgorithmParametersSpi {
    public DSAParameterSpec OooO00o;

    public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
        if (cls == DSAParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.OooO00o;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to DSA parameters object.");
    }

    public boolean OooO00o(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            return new C6847lLI(this.OooO00o.getP(), this.OooO00o.getQ(), this.OooO00o.getG()).OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding DSAParameters");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) {
        if (OooO00o(str)) {
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
        if (algorithmParameterSpec instanceof DSAParameterSpec) {
            this.OooO00o = (DSAParameterSpec) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("DSAParameterSpec required to initialise a DSA algorithm parameters object");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        try {
            C6847lLI OooO00o2 = C6847lLI.OooO00o(AbstractC6122iIlLiL.OooO00o(bArr));
            this.OooO00o = new DSAParameterSpec(OooO00o2.m17999OooO0O0(), OooO00o2.OooO0OO(), OooO00o2.OooO00o());
        } catch (ClassCastException unused) {
            throw new IOException("Not a valid DSA Parameter encoding.");
        } catch (ArrayIndexOutOfBoundsException unused2) {
            throw new IOException("Not a valid DSA Parameter encoding.");
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
        return "DSA Parameters";
    }
}
