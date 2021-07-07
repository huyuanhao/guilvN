package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* renamed from: com.pd.sdk.lII丨丨  reason: invalid class name and case insensitive filesystem */
public class C6500lII extends AlgorithmParametersSpi {
    public C6680liLl1i OooO00o;

    public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
        if (cls == C6680liLl1i.class || cls == AlgorithmParameterSpec.class) {
            return this.OooO00o;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
    }

    public boolean OooO00o(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            iILLL1 r0 = new iILLL1();
            if (this.OooO00o.m17756OooO00o() != null) {
                r0.OooO00o(new ILI1Ll(false, 0, new C6487lIIiIlL(this.OooO00o.m17756OooO00o())));
            }
            if (this.OooO00o.m17757OooO0O0() != null) {
                r0.OooO00o(new ILI1Ll(false, 1, new C6487lIIiIlL(this.OooO00o.m17757OooO0O0())));
            }
            r0.OooO00o(new C6513lIiI((long) this.OooO00o.OooO0O0()));
            if (this.OooO00o.OooO0OO() != null) {
                iILLL1 r1 = new iILLL1();
                r1.OooO00o(new C6513lIiI((long) this.OooO00o.OooO00o()));
                r1.OooO00o(new C6513lIiI(this.OooO00o.OooO0OO()));
                r0.OooO00o(new C5707LiL1(r1));
            }
            return new C5707LiL1(r0).OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding IESParameters");
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
        if (algorithmParameterSpec instanceof C6680liLl1i) {
            this.OooO00o = (C6680liLl1i) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("IESParameterSpec required to initialise a IES algorithm parameters object");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        try {
            I11li1 i11li1 = (I11li1) AbstractC6122iIlLiL.OooO00o(bArr);
            if (i11li1.size() == 1) {
                this.OooO00o = new C6680liLl1i(null, null, C6513lIiI.OooO00o(i11li1.OooO00o(0)).m17647OooO0O0().intValue());
            } else if (i11li1.size() == 2) {
                AbstractC5903LlLLL OooO00o2 = AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(0));
                this.OooO00o = OooO00o2.OooO00o() == 0 ? new C6680liLl1i(AbstractC6804llL1ii.OooO00o(OooO00o2, false).m17938OooO00o(), null, C6513lIiI.OooO00o(i11li1.OooO00o(1)).m17647OooO0O0().intValue()) : new C6680liLl1i(null, AbstractC6804llL1ii.OooO00o(OooO00o2, false).m17938OooO00o(), C6513lIiI.OooO00o(i11li1.OooO00o(1)).m17647OooO0O0().intValue());
            } else if (i11li1.size() == 3) {
                this.OooO00o = new C6680liLl1i(AbstractC6804llL1ii.OooO00o(AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(0)), false).m17938OooO00o(), AbstractC6804llL1ii.OooO00o(AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(1)), false).m17938OooO00o(), C6513lIiI.OooO00o(i11li1.OooO00o(2)).m17647OooO0O0().intValue());
            } else if (i11li1.size() == 4) {
                AbstractC5903LlLLL OooO00o3 = AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(0));
                AbstractC5903LlLLL OooO00o4 = AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(1));
                I11li1 OooO00o5 = I11li1.OooO00o(i11li1.OooO00o(3));
                this.OooO00o = new C6680liLl1i(AbstractC6804llL1ii.OooO00o(OooO00o3, false).m17938OooO00o(), AbstractC6804llL1ii.OooO00o(OooO00o4, false).m17938OooO00o(), C6513lIiI.OooO00o(i11li1.OooO00o(2)).m17647OooO0O0().intValue(), C6513lIiI.OooO00o(OooO00o5.OooO00o(0)).m17647OooO0O0().intValue(), AbstractC6804llL1ii.OooO00o(OooO00o5.OooO00o(1)).m17938OooO00o());
            }
        } catch (ClassCastException unused) {
            throw new IOException("Not a valid IES Parameter encoding.");
        } catch (ArrayIndexOutOfBoundsException unused2) {
            throw new IOException("Not a valid IES Parameter encoding.");
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
        return "IES Parameters";
    }
}
