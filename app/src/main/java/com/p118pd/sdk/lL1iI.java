package com.p118pd.sdk;

import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.lL1iI */
public class lL1iI {
    public OooO0O0 OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9852lIli f18456OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18457OooO00o;
    public AbstractC9852lIli OooO0O0;

    /* renamed from: com.pd.sdk.lL1iI$OooO0O0 */
    public class OooO0O0 {
        public OooO0O0() {
        }

        public Lii1ii1 OooO00o(String str, PrivateKey privateKey) throws OperatorCreationException {
            return new C6746llI1(str).OooO00o(privateKey);
        }

        public AbstractC6290ii OooO00o() throws OperatorCreationException {
            return new l1i1IL().OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.lL1iI$OooO0OO */
    public class OooO0OO extends OooO0O0 {
        public final String OooO00o;

        public OooO0OO(String str) {
            super();
            this.OooO00o = str;
        }

        @Override // com.p118pd.sdk.lL1iI.OooO0O0
        public Lii1ii1 OooO00o(String str, PrivateKey privateKey) throws OperatorCreationException {
            return new C6746llI1(str).OooO00o(this.OooO00o).OooO00o(privateKey);
        }

        @Override // com.p118pd.sdk.lL1iI.OooO0O0
        public AbstractC6290ii OooO00o() throws OperatorCreationException {
            return new l1i1IL().OooO00o(this.OooO00o).OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.lL1iI$OooO0Oo  reason: case insensitive filesystem */
    public class C6559OooO0Oo extends OooO0O0 {
        public final Provider OooO00o;

        public C6559OooO0Oo(Provider provider) {
            super();
            this.OooO00o = provider;
        }

        @Override // com.p118pd.sdk.lL1iI.OooO0O0
        public Lii1ii1 OooO00o(String str, PrivateKey privateKey) throws OperatorCreationException {
            return new C6746llI1(str).OooO00o(this.OooO00o).OooO00o(privateKey);
        }

        @Override // com.p118pd.sdk.lL1iI.OooO0O0
        public AbstractC6290ii OooO00o() throws OperatorCreationException {
            return new l1i1IL().OooO00o(this.OooO00o).OooO00o();
        }
    }

    private C5812LlLiL OooO00o() throws OperatorCreationException {
        C5812LlLiL r0 = new C5812LlLiL(this.OooO00o.OooO00o());
        r0.OooO00o(this.f18457OooO00o);
        r0.OooO00o(this.f18456OooO00o);
        r0.OooO0O0(this.OooO0O0);
        return r0;
    }

    public C6248iiLLi OooO00o(String str, PrivateKey privateKey, X509Certificate x509Certificate) throws OperatorCreationException, CertificateEncodingException {
        return OooO00o().OooO00o(this.OooO00o.OooO00o(str, privateKey), new JcaX509CertificateHolder(x509Certificate));
    }

    public C6248iiLLi OooO00o(String str, PrivateKey privateKey, byte[] bArr) throws OperatorCreationException, CertificateEncodingException {
        return OooO00o().OooO00o(this.OooO00o.OooO00o(str, privateKey), bArr);
    }

    public lL1iI OooO00o(C9731lL1 r2) {
        this.f18456OooO00o = new C9561i111(r2);
        return this;
    }

    public lL1iI OooO00o(AbstractC9852lIli r1) {
        this.f18456OooO00o = r1;
        return this;
    }

    public lL1iI OooO00o(String str) throws OperatorCreationException {
        this.OooO00o = new OooO0OO(str);
        return this;
    }

    public lL1iI OooO00o(Provider provider) throws OperatorCreationException {
        this.OooO00o = new C6559OooO0Oo(provider);
        return this;
    }

    public lL1iI OooO00o(boolean z) {
        this.f18457OooO00o = z;
        return this;
    }

    public lL1iI OooO0O0(AbstractC9852lIli r1) {
        this.OooO0O0 = r1;
        return this;
    }
}
