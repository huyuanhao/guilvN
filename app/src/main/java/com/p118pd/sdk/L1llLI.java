package com.p118pd.sdk;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: com.pd.sdk.L1llLI丨  reason: invalid class name */
public class L1llLI extends lI11lI {
    public byte[] OooO00o;

    @Override // com.p118pd.sdk.lI11lI
    public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
        if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return new IvParameterSpec(this.OooO00o);
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() throws IOException {
        return engineGetEncoded("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) throws IOException {
        if (OooO00o(str)) {
            return new C6487lIIiIlL(engineGetEncoded("RAW")).getEncoded();
        }
        if (str.equals("RAW")) {
            return C9586iIILl.m21630OooO00o(this.OooO00o);
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            this.OooO00o = ((IvParameterSpec) algorithmParameterSpec).getIV();
            return;
        }
        throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        if (bArr.length % 8 != 0 && bArr[0] == 4 && bArr[1] == bArr.length - 2) {
            bArr = ((AbstractC6804llL1ii) AbstractC6122iIlLiL.OooO00o(bArr)).m17938OooO00o();
        }
        this.OooO00o = C9586iIILl.m21630OooO00o(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (OooO00o(str)) {
            try {
                engineInit(((AbstractC6804llL1ii) AbstractC6122iIlLiL.OooO00o(bArr)).m17938OooO00o());
            } catch (Exception e) {
                throw new IOException("Exception decoding: " + e);
            }
        } else if (str.equals("RAW")) {
            engineInit(bArr);
        } else {
            throw new IOException("Unknown parameters format in IV parameters object");
        }
    }

    public String engineToString() {
        return "IV Parameters";
    }
}
