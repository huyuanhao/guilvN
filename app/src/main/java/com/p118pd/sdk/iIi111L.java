package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKey;
import org.bouncycastle.jcajce.PBKDF1KeyWithParameters;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.openssl.PEMException;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.iIi111L丨  reason: invalid class name */
public class iIi111L {
    public ii1I11l OooO00o = new ILLli();

    /* renamed from: com.pd.sdk.iIi111L丨$OooO00o */
    public class OooO00o implements AbstractC6429iliL {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ char[] f17536OooO00o;

        /* renamed from: com.pd.sdk.iIi111L丨$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4933OooO00o implements AbstractC6385iL {
            public C4933OooO00o() {
            }

            @Override // com.p118pd.sdk.AbstractC6385iL
            public byte[] convert(char[] cArr) {
                return Strings.OooO00o(cArr);
            }

            @Override // com.p118pd.sdk.AbstractC6385iL
            public String getType() {
                return "ASCII";
            }
        }

        /* renamed from: com.pd.sdk.iIi111L丨$OooO00o$OooO0O0 */
        public class OooO0O0 implements AbstractC5475Illli {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C6456l1ilL f17537OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ Cipher f17538OooO00o;

            public OooO0O0(C6456l1ilL r2, Cipher cipher) {
                this.f17537OooO00o = r2;
                this.f17538OooO00o = cipher;
            }

            @Override // com.p118pd.sdk.AbstractC5475Illli
            public C6456l1ilL OooO00o() {
                return this.f17537OooO00o;
            }

            @Override // com.p118pd.sdk.AbstractC5475Illli
            public InputStream OooO00o(InputStream inputStream) {
                return new CipherInputStream(inputStream, this.f17538OooO00o);
            }
        }

        public OooO00o(char[] cArr) {
            this.f17536OooO00o = cArr;
        }

        @Override // com.p118pd.sdk.AbstractC6429iliL
        public AbstractC5475Illli OooO00o(C6456l1ilL r12) throws OperatorCreationException {
            Cipher cipher;
            Key pBKDF1KeyWithParameters;
            try {
                if (C6437l11.OooO0OO(r12.OooO00o())) {
                    C9545LI OooO00o2 = C9545LI.OooO00o(r12.m17587OooO0O0());
                    Il1iLLi OooO00o3 = OooO00o2.OooO00o();
                    C6579lLL OooO00o4 = OooO00o2.m21604OooO00o();
                    C5772LlIII llIII = (C5772LlIII) OooO00o3.m15646OooO0O0();
                    int intValue = llIII.m16365OooO00o().intValue();
                    byte[] OooO00o5 = llIII.m16367OooO00o();
                    String OooO0O02 = OooO00o4.OooO00o().m16387OooO0O0();
                    SecretKey OooO00o6 = C6437l11.OooO00o(llIII.OooO00o()) ? C6437l11.OooO00o(iIi111L.this.OooO00o, OooO0O02, this.f17536OooO00o, OooO00o5, intValue) : C6437l11.OooO00o(iIi111L.this.OooO00o, OooO0O02, this.f17536OooO00o, OooO00o5, intValue, llIII.OooO00o());
                    cipher = iIi111L.this.OooO00o.m17224OooO00o(OooO0O02);
                    AlgorithmParameters OooO00o7 = iIi111L.this.OooO00o.m17217OooO00o(OooO0O02);
                    OooO00o7.init(OooO00o4.m17683OooO0O0().OooO0O0().getEncoded());
                    cipher.init(2, OooO00o6, OooO00o7);
                } else {
                    if (C6437l11.m17554OooO00o(r12.OooO00o())) {
                        C6263iiiL OooO00o8 = C6263iiiL.OooO00o(r12.m17587OooO0O0());
                        cipher = iIi111L.this.OooO00o.m17224OooO00o(r12.OooO00o().m16387OooO0O0());
                        pBKDF1KeyWithParameters = new PKCS12KeyWithParameters(this.f17536OooO00o, OooO00o8.m17277OooO00o(), OooO00o8.OooO00o().intValue());
                    } else if (C6437l11.OooO0O0(r12.OooO00o())) {
                        Lllii OooO00o9 = Lllii.OooO00o(r12.m17587OooO0O0());
                        cipher = iIi111L.this.OooO00o.m17224OooO00o(r12.OooO00o().m16387OooO0O0());
                        pBKDF1KeyWithParameters = new PBKDF1KeyWithParameters(this.f17536OooO00o, new C4933OooO00o(), OooO00o9.m16403OooO00o(), OooO00o9.OooO00o().intValue());
                    } else {
                        throw new PEMException("Unknown algorithm: " + r12.OooO00o());
                    }
                    cipher.init(2, pBKDF1KeyWithParameters);
                }
                return new OooO0O0(r12, cipher);
            } catch (IOException e) {
                throw new OperatorCreationException(r12.OooO00o() + " not available: " + e.getMessage(), e);
            } catch (GeneralSecurityException e2) {
                throw new OperatorCreationException(r12.OooO00o() + " not available: " + e2.getMessage(), e2);
            }
        }
    }

    public iIi111L OooO00o(String str) {
        this.OooO00o = new C9588iIi(str);
        return this;
    }

    public iIi111L OooO00o(Provider provider) {
        this.OooO00o = new LLIlii(provider);
        return this;
    }

    public AbstractC6429iliL OooO00o(char[] cArr) throws OperatorCreationException {
        return new OooO00o(cArr);
    }
}
