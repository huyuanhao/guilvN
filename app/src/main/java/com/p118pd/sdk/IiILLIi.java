package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.IiILLI丨i  reason: invalid class name */
public final class IiILLIi {

    /* renamed from: com.pd.sdk.IiILLI丨i$OooO00o */
    public static class OooO00o extends AbstractC6384iLll1 {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                ((AbstractC6384iLll1) this).f18184OooO00o = IIllii.OooO00o();
            }
            ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(bArr);
            try {
                AlgorithmParameters OooO00o = OooO00o("CAST5");
                OooO00o.init(new IvParameterSpec(bArr));
                return OooO00o;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for CAST5 parameter generation.");
        }
    }

    /* renamed from: com.pd.sdk.IiILLI丨i$OooO0O0 */
    public static class OooO0O0 extends lI11lI {
        public int OooO00o = 128;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f15688OooO00o;

        @Override // com.p118pd.sdk.lI11lI
        public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f15688OooO00o);
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to CAST5 parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            byte[] bArr = this.f15688OooO00o;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (OooO00o(str)) {
                return new C6014i1IL(engineGetEncoded(), this.OooO00o).getEncoded();
            }
            if (str.equals("RAW")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.f15688OooO00o = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            throw new InvalidParameterSpecException("IvParameterSpec required to initialise a CAST5 parameters algorithm parameters object");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            byte[] bArr2 = new byte[bArr.length];
            this.f15688OooO00o = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (OooO00o(str)) {
                C6014i1IL OooO00o2 = C6014i1IL.OooO00o(new C5805Ll1(bArr).OooO00o());
                this.OooO00o = OooO00o2.OooO0O0();
                this.f15688OooO00o = OooO00o2.OooO00o();
            } else if (str.equals("RAW")) {
                engineInit(bArr);
            } else {
                throw new IOException("Unknown parameters format in IV parameters object");
            }
        }

        public String engineToString() {
            return "CAST5 Parameters";
        }
    }

    /* renamed from: com.pd.sdk.IiILLI丨i$OooO0OO */
    public static class OooO0OO extends BaseBlockCipher {
        public OooO0OO() {
            super(new C6927lll1(new LlIlLI()), 64);
        }
    }

    /* renamed from: com.pd.sdk.IiILLI丨i$OooO0Oo  reason: case insensitive filesystem */
    public static class C5349OooO0Oo extends BaseBlockCipher {
        public C5349OooO0Oo() {
            super(new LlIlLI());
        }
    }

    /* renamed from: com.pd.sdk.IiILLI丨i$OooO0o */
    public static class OooO0o extends II1ii1 {
        public static final String OooO00o = IiILLIi.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r5) {
            r5.addAlgorithm("AlgorithmParameters.CAST5", OooO00o + "$AlgParams");
            r5.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113533.7.66.10", "CAST5");
            r5.addAlgorithm("AlgorithmParameterGenerator.CAST5", OooO00o + "$AlgParamGen");
            r5.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.1.2.840.113533.7.66.10", "CAST5");
            r5.addAlgorithm("Cipher.CAST5", OooO00o + "$ECB");
            LlLI1 llLI1 = AbstractC5702Li111.OooOo0;
            r5.addAlgorithm("Cipher", llLI1, OooO00o + "$CBC");
            r5.addAlgorithm("KeyGenerator.CAST5", OooO00o + "$KeyGen");
            r5.addAlgorithm("Alg.Alias.KeyGenerator", AbstractC5702Li111.OooOo0, "CAST5");
        }
    }

    /* renamed from: com.pd.sdk.IiILLI丨i$OooO0o0  reason: case insensitive filesystem */
    public static class C5350OooO0o0 extends C5597L11llL {
        public C5350OooO0o0() {
            super("CAST5", 128, new C5706LiL());
        }
    }
}
