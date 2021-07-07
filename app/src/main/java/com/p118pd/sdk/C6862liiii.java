package com.p118pd.sdk;

import java.io.OutputStream;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.l丨iiii  reason: invalid class name and case insensitive filesystem */
public class C6862liiii implements LILi {
    public ii1I11l OooO00o = new ILLli();

    /* renamed from: com.pd.sdk.l丨iiii$OooO00o */
    public class OooO00o implements IL {
        public final /* synthetic */ C6456l1ilL OooO00o;

        /* renamed from: com.pd.sdk.l丨iiii$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4950OooO00o implements AbstractC6296il1il1 {
            public final /* synthetic */ LlLI1 OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C6263iiiL f18939OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ Mac f18941OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ SecretKey f18942OooO00o;

            public C4950OooO00o(LlLI1 llLI1, C6263iiiL iiil, Mac mac, SecretKey secretKey) {
                this.OooO00o = llLI1;
                this.f18939OooO00o = iiil;
                this.f18941OooO00o = mac;
                this.f18942OooO00o = secretKey;
            }

            @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
            public LIiI11 OooO00o() {
                return new LIiI11(m18017OooO00o(), this.f18942OooO00o.getEncoded());
            }

            @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
            /* renamed from: OooO00o  reason: collision with other method in class */
            public C6456l1ilL m18017OooO00o() {
                return new C6456l1ilL(this.OooO00o, this.f18939OooO00o);
            }

            @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
            /* renamed from: OooO00o  reason: collision with other method in class */
            public OutputStream m18018OooO00o() {
                return new C9615iiL(this.f18941OooO00o);
            }

            @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
            /* renamed from: OooO00o  reason: collision with other method in class */
            public byte[] m18019OooO00o() {
                return this.f18941OooO00o.doFinal();
            }
        }

        public OooO00o(C6456l1ilL r2) {
            this.OooO00o = r2;
        }

        @Override // com.p118pd.sdk.IL
        public AbstractC6296il1il1 OooO00o(char[] cArr) throws OperatorCreationException {
            C6263iiiL OooO00o2 = C6263iiiL.OooO00o(this.OooO00o.m17587OooO0O0());
            try {
                LlLI1 OooO00o3 = this.OooO00o.OooO00o();
                Mac OooO00o4 = C6862liiii.this.OooO00o.m17227OooO00o(OooO00o3.m16387OooO0O0());
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(OooO00o2.m17277OooO00o(), OooO00o2.OooO00o().intValue());
                PKCS12Key pKCS12Key = new PKCS12Key(cArr);
                OooO00o4.init(pKCS12Key, pBEParameterSpec);
                return new C4950OooO00o(OooO00o3, OooO00o2, OooO00o4, pKCS12Key);
            } catch (Exception e) {
                throw new OperatorCreationException("unable to create MAC calculator: " + e.getMessage(), e);
            }
        }

        @Override // com.p118pd.sdk.IL
        public C6456l1ilL OooO00o() {
            return new C6456l1ilL(this.OooO00o.OooO00o(), C6452l1Lll.OooO00o);
        }
    }

    @Override // com.p118pd.sdk.LILi
    public IL OooO00o(C6456l1ilL r2) {
        return new OooO00o(r2);
    }

    public C6862liiii OooO00o(String str) {
        this.OooO00o = new C9588iIi(str);
        return this;
    }

    public C6862liiii OooO00o(Provider provider) {
        this.OooO00o = new LLIlii(provider);
        return this;
    }
}
