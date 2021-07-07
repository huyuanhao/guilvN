package com.p118pd.sdk;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.PBEParameterSpec;

/* renamed from: com.pd.sdk.IIILIIl */
public class IIILIIl {

    /* renamed from: com.pd.sdk.IIILIIl$OooO00o */
    public static class OooO00o extends lI11lI {
        public C6263iiiL OooO00o;

        @Override // com.p118pd.sdk.lI11lI
        public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class) {
                return new PBEParameterSpec(this.OooO00o.m17277OooO00o(), this.OooO00o.OooO00o().intValue());
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PKCS12 PBE parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            try {
                return this.OooO00o.OooO00o(AbstractC5533IiL.OooO00o);
            } catch (IOException e) {
                throw new RuntimeException("Oooops! " + e.toString());
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
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                this.OooO00o = new C6263iiiL(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
                return;
            }
            throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PKCS12 PBE parameters algorithm parameters object");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.OooO00o = C6263iiiL.OooO00o(AbstractC6122iIlLiL.OooO00o(bArr));
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (OooO00o(str)) {
                engineInit(bArr);
                return;
            }
            throw new IOException("Unknown parameters format in PKCS12 PBE parameters object");
        }

        public String engineToString() {
            return "PKCS12 PBE Parameters";
        }
    }

    /* renamed from: com.pd.sdk.IIILIIl$OooO0O0 */
    public static class OooO0O0 extends II1ii1 {
        public static final String OooO00o = IIILIIl.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("AlgorithmParameters.PKCS12PBE", OooO00o + "$AlgParams");
        }
    }
}
