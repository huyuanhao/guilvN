package com.p118pd.sdk;

import java.io.InputStream;
import java.security.Provider;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.crypto.PasswordConverter;
import org.bouncycastle.jcajce.PBKDF1Key;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.丨I1liLii  reason: invalid class name and case insensitive filesystem */
public class C9343I1liLii {
    public Illiiil OooO00o = C9702liIIL.OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ii1I11l f22876OooO00o = new ILLli();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22877OooO00o = false;

    /* renamed from: com.pd.sdk.丨I1liLii$OooO00o */
    public class OooO00o implements AbstractC6429iliL {
        public C6456l1ilL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Cipher f22879OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ char[] f22880OooO00o;

        /* renamed from: com.pd.sdk.丨I1liLii$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4977OooO00o implements AbstractC5475Illli {
            public C4977OooO00o() {
            }

            @Override // com.p118pd.sdk.AbstractC5475Illli
            public C6456l1ilL OooO00o() {
                return OooO00o.this.OooO00o;
            }

            @Override // com.p118pd.sdk.AbstractC5475Illli
            public InputStream OooO00o(InputStream inputStream) {
                return new CipherInputStream(inputStream, OooO00o.this.f22879OooO00o);
            }
        }

        public OooO00o(char[] cArr) {
            this.f22880OooO00o = cArr;
        }

        @Override // com.p118pd.sdk.AbstractC6429iliL
        public AbstractC5475Illli OooO00o(C6456l1ilL r13) throws OperatorCreationException {
            SecretKey secretKey;
            Cipher cipher;
            AlgorithmParameterSpec r3;
            LlLI1 OooO00o2 = r13.OooO00o();
            try {
                if (OooO00o2.OooO00o(AbstractC5711LiLli.o000o0O)) {
                    C6263iiiL OooO00o3 = C6263iiiL.OooO00o(r13.m17587OooO0O0());
                    Cipher OooO00o4 = C9343I1liLii.this.f22876OooO00o.m17224OooO00o(OooO00o2.m16387OooO0O0());
                    this.f22879OooO00o = OooO00o4;
                    OooO00o4.init(2, new PKCS12KeyWithParameters(this.f22880OooO00o, C9343I1liLii.this.f22877OooO00o, OooO00o3.m17277OooO00o(), OooO00o3.OooO00o().intValue()));
                    this.OooO00o = r13;
                } else if (OooO00o2.equals(AbstractC5711LiLli.OoooOOo)) {
                    C9545LI OooO00o5 = C9545LI.OooO00o(r13.m17587OooO0O0());
                    if (AbstractC5702Li111.Oooo0o0.equals(OooO00o5.OooO00o().OooO00o())) {
                        C5789LlLL OooO00o6 = C5789LlLL.OooO00o(OooO00o5.OooO00o().m15646OooO0O0());
                        secretKey = C9343I1liLii.this.f22876OooO00o.m17228OooO00o("SCRYPT").generateSecret(new lLlllI(this.f22880OooO00o, OooO00o6.m16388OooO00o(), OooO00o6.m16389OooO0O0().intValue(), OooO00o6.OooO00o().intValue(), OooO00o6.OooO0Oo().intValue(), C9343I1liLii.this.OooO00o.OooO00o(C6456l1ilL.OooO00o(OooO00o5.m21604OooO00o()))));
                    } else {
                        SecretKeyFactory OooO00o7 = C9343I1liLii.this.f22876OooO00o.m17228OooO00o(OooO00o5.OooO00o().OooO00o().m16387OooO0O0());
                        C5772LlIII OooO00o8 = C5772LlIII.OooO00o(OooO00o5.OooO00o().m15646OooO0O0());
                        C6456l1ilL OooO00o9 = C6456l1ilL.OooO00o(OooO00o5.m21604OooO00o());
                        secretKey = OooO00o8.m16366OooO00o() ? OooO00o7.generateSecret(new PBEKeySpec(this.f22880OooO00o, OooO00o8.m16367OooO00o(), OooO00o8.m16365OooO00o().intValue(), C9343I1liLii.this.OooO00o.OooO00o(OooO00o9))) : OooO00o7.generateSecret(new C6143iIlIii(this.f22880OooO00o, OooO00o8.m16367OooO00o(), OooO00o8.m16365OooO00o().intValue(), C9343I1liLii.this.OooO00o.OooO00o(OooO00o9), OooO00o8.OooO00o()));
                    }
                    this.f22879OooO00o = C9343I1liLii.this.f22876OooO00o.m17224OooO00o(OooO00o5.m21604OooO00o().OooO00o().m16387OooO0O0());
                    this.OooO00o = C6456l1ilL.OooO00o(OooO00o5.m21604OooO00o());
                    AbstractC6854lLi1LL OooO0O0 = OooO00o5.m21604OooO00o().m17683OooO0O0();
                    if (OooO0O0 instanceof AbstractC6804llL1ii) {
                        cipher = this.f22879OooO00o;
                        r3 = new IvParameterSpec(AbstractC6804llL1ii.OooO00o(OooO0O0).m17938OooO00o());
                    } else {
                        C9437II OooO00o10 = C9437II.OooO00o(OooO0O0);
                        cipher = this.f22879OooO00o;
                        r3 = new C9873i1(OooO00o10.OooO00o(), OooO00o10.m21474OooO00o());
                    }
                    cipher.init(2, secretKey, r3);
                } else {
                    if (!OooO00o2.equals(AbstractC5711LiLli.OoooO)) {
                        if (!OooO00o2.equals(AbstractC5711LiLli.o000oOoO)) {
                            throw new OperatorCreationException("unable to create InputDecryptor: algorithm " + OooO00o2 + " unknown.");
                        }
                    }
                    Lllii OooO00o11 = Lllii.OooO00o(r13.m17587OooO0O0());
                    Cipher OooO00o12 = C9343I1liLii.this.f22876OooO00o.m17224OooO00o(OooO00o2.m16387OooO0O0());
                    this.f22879OooO00o = OooO00o12;
                    OooO00o12.init(2, new PBKDF1Key(this.f22880OooO00o, PasswordConverter.ASCII), new PBEParameterSpec(OooO00o11.m16403OooO00o(), OooO00o11.OooO00o().intValue()));
                }
                return new C4977OooO00o();
            } catch (Exception e) {
                throw new OperatorCreationException("unable to create InputDecryptor: " + e.getMessage(), e);
            }
        }
    }

    public AbstractC6429iliL OooO00o(char[] cArr) {
        return new OooO00o(cArr);
    }

    public C9343I1liLii OooO00o(Illiiil r1) {
        this.OooO00o = r1;
        return this;
    }

    public C9343I1liLii OooO00o(String str) {
        this.f22876OooO00o = new C9588iIi(str);
        return this;
    }

    public C9343I1liLii OooO00o(Provider provider) {
        this.f22876OooO00o = new LLIlii(provider);
        return this;
    }

    public C9343I1liLii OooO00o(boolean z) {
        this.f22877OooO00o = z;
        return this;
    }
}
