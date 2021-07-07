package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.liIIlL丨  reason: invalid class name and case insensitive filesystem */
public class C6649liIIlL extends AlgorithmParametersSpi {
    public String OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ECParameterSpec f18608OooO00o;

    public boolean OooO00o(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() throws IOException {
        return engineGetEncoded("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) throws IOException {
        C6620lLlliL llllil;
        if (OooO00o(str)) {
            ECParameterSpec eCParameterSpec = this.f18608OooO00o;
            if (eCParameterSpec == null) {
                llllil = new C6620lLlliL((AbstractC5335ILl) C6452l1Lll.OooO00o);
            } else {
                String str2 = this.OooO00o;
                if (str2 != null) {
                    llllil = new C6620lLlliL(IlllII1.OooO00o(str2));
                } else {
                    C6106iIiIl OooO00o2 = C6631lLlI.OooO00o(eCParameterSpec, false);
                    llllil = new C6620lLlliL(new C9387Iill(OooO00o2.OooO00o(), OooO00o2.m16969OooO00o(), OooO00o2.OooO0O0(), OooO00o2.m16970OooO00o(), OooO00o2.m16971OooO00o()));
                }
            }
            return llllil.getEncoded();
        }
        throw new IOException("Unknown parameters format in AlgorithmParameters object: " + str);
    }

    @Override // java.security.AlgorithmParametersSpi
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (ECParameterSpec.class.isAssignableFrom(cls) || cls == AlgorithmParameterSpec.class) {
            return this.f18608OooO00o;
        }
        if (ECGenParameterSpec.class.isAssignableFrom(cls)) {
            String str = this.OooO00o;
            if (str != null) {
                LlLI1 OooO00o2 = IlllII1.OooO00o(str);
                return OooO00o2 != null ? new ECGenParameterSpec(OooO00o2.m16387OooO0O0()) : new ECGenParameterSpec(this.OooO00o);
            }
            LlLI1 OooO00o3 = IlllII1.OooO00o(C6631lLlI.OooO00o(this.f18608OooO00o, false));
            if (OooO00o3 != null) {
                return new ECGenParameterSpec(OooO00o3.m16387OooO0O0());
            }
        }
        throw new InvalidParameterSpecException("EC AlgorithmParameters cannot convert to " + cls.getName());
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        ECParameterSpec eCParameterSpec;
        if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) algorithmParameterSpec;
            C9387Iill OooO00o2 = ILIIIlI.OooO00o(eCGenParameterSpec);
            if (OooO00o2 != null) {
                this.OooO00o = eCGenParameterSpec.getName();
                eCParameterSpec = C6631lLlI.OooO00o(OooO00o2);
            } else {
                throw new InvalidParameterSpecException("EC curve name not recognized: " + eCGenParameterSpec.getName());
            }
        } else if (algorithmParameterSpec instanceof ECParameterSpec) {
            this.OooO00o = algorithmParameterSpec instanceof L1L1l ? ((L1L1l) algorithmParameterSpec).OooO00o() : null;
            eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
        } else {
            throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
        }
        this.f18608OooO00o = eCParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        engineInit(bArr, "ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (OooO00o(str)) {
            C6620lLlliL OooO00o2 = C6620lLlliL.OooO00o(bArr);
            IIiLIli OooO00o3 = C6631lLlI.OooO00o(BouncyCastleProvider.CONFIGURATION, OooO00o2);
            if (OooO00o2.m17705OooO0O0()) {
                LlLI1 OooO00o4 = LlLI1.OooO00o((Object) OooO00o2.OooO0Oo());
                String OooO00o5 = C9857liL1l.m21941OooO00o(OooO00o4);
                this.OooO00o = OooO00o5;
                if (OooO00o5 == null) {
                    this.OooO00o = OooO00o4.m16387OooO0O0();
                }
            }
            this.f18608OooO00o = C6631lLlI.OooO00o(OooO00o2, OooO00o3);
            return;
        }
        throw new IOException("Unknown encoded parameters format in AlgorithmParameters object: " + str);
    }

    public String engineToString() {
        return "EC AlgorithmParameters ";
    }
}
