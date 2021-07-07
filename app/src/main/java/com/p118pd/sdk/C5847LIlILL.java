package com.p118pd.sdk;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.PBEParameterSpec;

/* renamed from: com.pd.sdk.L丨IlILL  reason: invalid class name and case insensitive filesystem */
public class C5847LIlILL {

    /* renamed from: com.pd.sdk.L丨IlILL$OooO00o */
    public static class OooO00o extends lI11lI {
        public Lllii OooO00o;

        @Override // com.p118pd.sdk.lI11lI
        public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class) {
                return new PBEParameterSpec(this.OooO00o.m16403OooO00o(), this.OooO00o.OooO00o().intValue());
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PBKDF1 PBE parameters object.");
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
                this.OooO00o = new Lllii(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
                return;
            }
            throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF1 PBE parameters algorithm parameters object");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.OooO00o = Lllii.OooO00o(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (OooO00o(str)) {
                engineInit(bArr);
                return;
            }
            throw new IOException("Unknown parameters format in PBKDF2 parameters object");
        }

        public String engineToString() {
            return "PBKDF1 Parameters";
        }
    }

    /* renamed from: com.pd.sdk.L丨IlILL$OooO0O0 */
    public static class OooO0O0 extends II1ii1 {
        public static final String OooO00o = C5847LIlILL.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r5) {
            r5.addAlgorithm("AlgorithmParameters.PBKDF1", OooO00o + "$AlgParams");
            r5.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5711LiLli.OoooO0, "PBKDF1");
            r5.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5711LiLli.OoooO, "PBKDF1");
            r5.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5711LiLli.OoooOO0, "PBKDF1");
            r5.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5711LiLli.o000oOoO, "PBKDF1");
            r5.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5711LiLli.OoooOOO, "PBKDF1");
        }
    }
}
