package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* renamed from: com.pd.sdk.丨丨IIil  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC9755IIil extends AlgorithmParametersSpi {

    /* renamed from: com.pd.sdk.丨丨IIil$OooO00o */
    public static class OooO00o extends AbstractC9755IIil {
        public OAEPParameterSpec OooO00o;

        @Override // com.p118pd.sdk.AbstractC9755IIil
        public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
            if (cls == OAEPParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.OooO00o;
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to OAEP parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            try {
                return new C6496lIIlil(new C6456l1ilL(C9487LL1i.OooO00o(this.OooO00o.getDigestAlgorithm()), C6452l1Lll.OooO00o), new C6456l1ilL(AbstractC5711LiLli.Oooo000, new C6456l1ilL(C9487LL1i.OooO00o(((MGF1ParameterSpec) this.OooO00o.getMGFParameters()).getDigestAlgorithm()), C6452l1Lll.OooO00o)), new C6456l1ilL(AbstractC5711LiLli.Oooo00O, new C6487lIIiIlL(((PSource.PSpecified) this.OooO00o.getPSource()).getValue()))).OooO00o(AbstractC5533IiL.OooO00o);
            } catch (IOException unused) {
                throw new RuntimeException("Error encoding OAEPParameters");
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
            if (algorithmParameterSpec instanceof OAEPParameterSpec) {
                this.OooO00o = (OAEPParameterSpec) algorithmParameterSpec;
                return;
            }
            throw new InvalidParameterSpecException("OAEPParameterSpec required to initialise an OAEP algorithm parameters object");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            try {
                C6496lIIlil OooO00o2 = C6496lIIlil.OooO00o(bArr);
                if (OooO00o2.m17632OooO0O0().OooO00o().equals(AbstractC5711LiLli.Oooo000)) {
                    this.OooO00o = new OAEPParameterSpec(lil1Il1.OooO00o(OooO00o2.OooO00o().OooO00o()), OAEPParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(lil1Il1.OooO00o(C6456l1ilL.OooO00o(OooO00o2.m17632OooO0O0().m17587OooO0O0()).OooO00o())), new PSource.PSpecified(AbstractC6804llL1ii.OooO00o(OooO00o2.OooO0OO().m17587OooO0O0()).m17938OooO00o()));
                    return;
                }
                throw new IOException("unknown mask generation function: " + OooO00o2.m17632OooO0O0().OooO00o());
            } catch (ClassCastException unused) {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            } catch (ArrayIndexOutOfBoundsException unused2) {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
                engineInit(bArr);
                return;
            }
            throw new IOException("Unknown parameter format " + str);
        }

        public String engineToString() {
            return "OAEP Parameters";
        }
    }

    /* renamed from: com.pd.sdk.丨丨IIil$OooO0O0 */
    public static class OooO0O0 extends AbstractC9755IIil {
        public PSSParameterSpec OooO00o;

        @Override // com.p118pd.sdk.AbstractC9755IIil
        public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
            PSSParameterSpec pSSParameterSpec;
            if (cls == PSSParameterSpec.class && (pSSParameterSpec = this.OooO00o) != null) {
                return pSSParameterSpec;
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PSS parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            PSSParameterSpec pSSParameterSpec = this.OooO00o;
            return new C6692lii(new C6456l1ilL(C9487LL1i.OooO00o(pSSParameterSpec.getDigestAlgorithm()), C6452l1Lll.OooO00o), new C6456l1ilL(AbstractC5711LiLli.Oooo000, new C6456l1ilL(C9487LL1i.OooO00o(((MGF1ParameterSpec) pSSParameterSpec.getMGFParameters()).getDigestAlgorithm()), C6452l1Lll.OooO00o)), new C6513lIiI((long) pSSParameterSpec.getSaltLength()), new C6513lIiI((long) pSSParameterSpec.getTrailerField())).OooO00o(AbstractC5533IiL.OooO00o);
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof PSSParameterSpec) {
                this.OooO00o = (PSSParameterSpec) algorithmParameterSpec;
                return;
            }
            throw new InvalidParameterSpecException("PSSParameterSpec required to initialise an PSS algorithm parameters object");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            try {
                C6692lii OooO00o2 = C6692lii.OooO00o(bArr);
                if (OooO00o2.m17777OooO0O0().OooO00o().equals(AbstractC5711LiLli.Oooo000)) {
                    this.OooO00o = new PSSParameterSpec(lil1Il1.OooO00o(OooO00o2.OooO00o().OooO00o()), PSSParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(lil1Il1.OooO00o(C6456l1ilL.OooO00o(OooO00o2.m17777OooO0O0().m17587OooO0O0()).OooO00o())), OooO00o2.m17776OooO00o().intValue(), OooO00o2.m17778OooO0O0().intValue());
                    return;
                }
                throw new IOException("unknown mask generation function: " + OooO00o2.m17777OooO0O0().OooO00o());
            } catch (ClassCastException unused) {
                throw new IOException("Not a valid PSS Parameter encoding.");
            } catch (ArrayIndexOutOfBoundsException unused2) {
                throw new IOException("Not a valid PSS Parameter encoding.");
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
            return "PSS Parameters";
        }
    }

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
