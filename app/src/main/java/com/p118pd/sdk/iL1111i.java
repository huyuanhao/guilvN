package com.p118pd.sdk;

import java.io.InputStream;
import java.security.Provider;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.iL1111i */
public class iL1111i {
    public ii1I11l OooO00o = new ILLli();

    /* renamed from: com.pd.sdk.iL1111i$OooO00o */
    public class OooO00o implements AbstractC6429iliL {

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6456l1ilL f17653OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Cipher f17654OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ byte[] f17655OooO00o;

        /* renamed from: com.pd.sdk.iL1111i$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4934OooO00o implements AbstractC5475Illli {
            public C4934OooO00o() {
            }

            @Override // com.p118pd.sdk.AbstractC5475Illli
            public C6456l1ilL OooO00o() {
                return OooO00o.this.f17653OooO00o;
            }

            @Override // com.p118pd.sdk.AbstractC5475Illli
            public InputStream OooO00o(InputStream inputStream) {
                return new CipherInputStream(inputStream, OooO00o.this.f17654OooO00o);
            }
        }

        public OooO00o(byte[] bArr) {
            this.f17655OooO00o = bArr;
        }

        @Override // com.p118pd.sdk.AbstractC6429iliL
        public AbstractC5475Illli OooO00o(C6456l1ilL r6) throws OperatorCreationException {
            Cipher cipher;
            AlgorithmParameterSpec r3;
            this.f17653OooO00o = r6;
            LlLI1 OooO00o2 = r6.OooO00o();
            try {
                this.f17654OooO00o = iL1111i.this.OooO00o.m17224OooO00o(OooO00o2.m16387OooO0O0());
                SecretKeySpec secretKeySpec = new SecretKeySpec(this.f17655OooO00o, OooO00o2.m16387OooO0O0());
                AbstractC6854lLi1LL OooO0O0 = r6.m17587OooO0O0();
                if (OooO0O0 instanceof AbstractC6804llL1ii) {
                    cipher = this.f17654OooO00o;
                    r3 = new IvParameterSpec(AbstractC6804llL1ii.OooO00o(OooO0O0).m17938OooO00o());
                } else {
                    C9437II OooO00o3 = C9437II.OooO00o(OooO0O0);
                    cipher = this.f17654OooO00o;
                    r3 = new C9873i1(OooO00o3.OooO00o(), OooO00o3.m21474OooO00o());
                }
                cipher.init(2, secretKeySpec, r3);
                return new C4934OooO00o();
            } catch (Exception e) {
                throw new OperatorCreationException("unable to create InputDecryptor: " + e.getMessage(), e);
            }
        }
    }

    public iL1111i OooO00o(String str) {
        this.OooO00o = new C9588iIi(str);
        return this;
    }

    public iL1111i OooO00o(Provider provider) {
        this.OooO00o = new LLIlii(provider);
        return this;
    }

    public AbstractC6429iliL OooO00o(byte[] bArr) {
        return new OooO00o(C9586iIILl.m21630OooO00o(bArr));
    }
}
