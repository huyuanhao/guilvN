package com.p118pd.sdk;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;

/* renamed from: com.pd.sdk.lL丨iIIL  reason: invalid class name and case insensitive filesystem */
public class C6630lLiIIL extends lI11lI {
    public C6791lllI OooO00o;

    @Override // com.p118pd.sdk.lI11lI
    public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
        if (cls == C6791lllI.class || cls == AlgorithmParameterSpec.class) {
            return this.OooO00o;
        }
        if (cls == DHParameterSpec.class) {
            return new DHParameterSpec(this.OooO00o.OooO0O0(), this.OooO00o.OooO00o());
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            return new C5838L1lI(this.OooO00o.OooO0O0(), this.OooO00o.OooO00o()).OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding ElGamalParameters");
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
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        boolean z = algorithmParameterSpec instanceof C6791lllI;
        if (!z && !(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidParameterSpecException("DHParameterSpec required to initialise a ElGamal algorithm parameters object");
        } else if (z) {
            this.OooO00o = (C6791lllI) algorithmParameterSpec;
        } else {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.OooO00o = new C6791lllI(dHParameterSpec.getP(), dHParameterSpec.getG());
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        try {
            C5838L1lI OooO00o2 = C5838L1lI.OooO00o(AbstractC6122iIlLiL.OooO00o(bArr));
            this.OooO00o = new C6791lllI(OooO00o2.m16425OooO0O0(), OooO00o2.OooO00o());
        } catch (ClassCastException unused) {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
        } catch (ArrayIndexOutOfBoundsException unused2) {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
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
        return "ElGamal Parameters";
    }
}
