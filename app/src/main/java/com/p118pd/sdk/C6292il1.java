package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;

/* renamed from: com.pd.sdk.il1  reason: case insensitive filesystem */
public class C6292il1 extends AlgorithmParametersSpi {
    public DHParameterSpec OooO00o;

    public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
        if (cls == DHParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.OooO00o;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to DH parameters object.");
    }

    public boolean OooO00o(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            return new C5866Li1(this.OooO00o.getP(), this.OooO00o.getG(), this.OooO00o.getL()).OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding DHParameters");
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
        if (algorithmParameterSpec instanceof DHParameterSpec) {
            this.OooO00o = (DHParameterSpec) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("DHParameterSpec required to initialise a Diffie-Hellman algorithm parameters object");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        try {
            C5866Li1 OooO00o2 = C5866Li1.OooO00o(bArr);
            this.OooO00o = OooO00o2.m16445OooO0O0() != null ? new DHParameterSpec(OooO00o2.OooO0OO(), OooO00o2.OooO00o(), OooO00o2.m16445OooO0O0().intValue()) : new DHParameterSpec(OooO00o2.OooO0OO(), OooO00o2.OooO00o());
        } catch (ClassCastException unused) {
            throw new IOException("Not a valid DH Parameter encoding.");
        } catch (ArrayIndexOutOfBoundsException unused2) {
            throw new IOException("Not a valid DH Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (OooO00o(str)) {
            engineInit(bArr);
            return;
        }
        throw new IOException("Unknown parameter format " + str);
    }

    public String engineToString() {
        return "Diffie-Hellman Parameters";
    }
}
