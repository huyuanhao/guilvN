package com.p118pd.sdk;

import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.丨iL  reason: invalid class name and case insensitive filesystem */
public class C9601iL {
    public AbstractC6290ii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6861lii f23175OooO00o = new C9334I1I11();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9554Li f23176OooO00o = new C5380Iil();

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f23177OooO00o = new OooO0O0();

    /* renamed from: com.pd.sdk.丨iL$OooO0O0 */
    public class OooO0O0 {
        public OooO0O0() {
        }

        public AbstractC6290ii OooO00o() throws OperatorCreationException {
            return new l1i1IL().OooO00o();
        }

        public AbstractC9449II OooO00o(PublicKey publicKey) throws OperatorCreationException {
            return new C5504IIL().OooO00o(publicKey);
        }

        public AbstractC9449II OooO00o(X509Certificate x509Certificate) throws OperatorCreationException {
            return new C5504IIL().OooO00o(x509Certificate);
        }

        public AbstractC9449II OooO00o(X509CertificateHolder x509CertificateHolder) throws OperatorCreationException, CertificateException {
            return new C5504IIL().OooO00o(x509CertificateHolder);
        }
    }

    /* renamed from: com.pd.sdk.丨iL$OooO0OO */
    public class OooO0OO extends OooO0O0 {
        public final String OooO00o;

        public OooO0OO(String str) {
            super();
            this.OooO00o = str;
        }

        @Override // com.p118pd.sdk.C9601iL.OooO0O0
        public AbstractC6290ii OooO00o() throws OperatorCreationException {
            return new l1i1IL().OooO00o(this.OooO00o).OooO00o();
        }

        @Override // com.p118pd.sdk.C9601iL.OooO0O0
        public AbstractC9449II OooO00o(PublicKey publicKey) throws OperatorCreationException {
            return new C5504IIL().OooO00o(this.OooO00o).OooO00o(publicKey);
        }

        @Override // com.p118pd.sdk.C9601iL.OooO0O0
        public AbstractC9449II OooO00o(X509Certificate x509Certificate) throws OperatorCreationException {
            return new C5504IIL().OooO00o(this.OooO00o).OooO00o(x509Certificate);
        }

        @Override // com.p118pd.sdk.C9601iL.OooO0O0
        public AbstractC9449II OooO00o(X509CertificateHolder x509CertificateHolder) throws OperatorCreationException, CertificateException {
            return new C5504IIL().OooO00o(this.OooO00o).OooO00o(x509CertificateHolder);
        }
    }

    /* renamed from: com.pd.sdk.丨iL$OooO0Oo  reason: case insensitive filesystem */
    public class C9602OooO0Oo extends OooO0O0 {
        public final Provider OooO00o;

        public C9602OooO0Oo(Provider provider) {
            super();
            this.OooO00o = provider;
        }

        @Override // com.p118pd.sdk.C9601iL.OooO0O0
        public AbstractC6290ii OooO00o() throws OperatorCreationException {
            return new l1i1IL().OooO00o(this.OooO00o).OooO00o();
        }

        @Override // com.p118pd.sdk.C9601iL.OooO0O0
        public AbstractC9449II OooO00o(PublicKey publicKey) throws OperatorCreationException {
            return new C5504IIL().OooO00o(this.OooO00o).OooO00o(publicKey);
        }

        @Override // com.p118pd.sdk.C9601iL.OooO0O0
        public AbstractC9449II OooO00o(X509Certificate x509Certificate) throws OperatorCreationException {
            return new C5504IIL().OooO00o(this.OooO00o).OooO00o(x509Certificate);
        }

        @Override // com.p118pd.sdk.C9601iL.OooO0O0
        public AbstractC9449II OooO00o(X509CertificateHolder x509CertificateHolder) throws OperatorCreationException, CertificateException {
            return new C5504IIL().OooO00o(this.OooO00o).OooO00o(x509CertificateHolder);
        }
    }

    public C9601iL(AbstractC6290ii r3) {
        this.OooO00o = r3;
    }

    public iIiIliLi OooO00o(PublicKey publicKey) throws OperatorCreationException {
        return new iIiIliLi(this.f23175OooO00o, this.f23176OooO00o, this.f23177OooO00o.OooO00o(publicKey), this.OooO00o);
    }

    public iIiIliLi OooO00o(X509Certificate x509Certificate) throws OperatorCreationException {
        return new iIiIliLi(this.f23175OooO00o, this.f23176OooO00o, this.f23177OooO00o.OooO00o(x509Certificate), this.OooO00o);
    }

    public iIiIliLi OooO00o(X509CertificateHolder x509CertificateHolder) throws OperatorCreationException, CertificateException {
        return new iIiIliLi(this.f23175OooO00o, this.f23176OooO00o, this.f23177OooO00o.OooO00o(x509CertificateHolder), this.OooO00o);
    }

    public C9601iL OooO00o(AbstractC6861lii r1) {
        this.f23175OooO00o = r1;
        return this;
    }

    public C9601iL OooO00o(AbstractC9554Li r1) {
        this.f23176OooO00o = r1;
        return this;
    }

    public C9601iL OooO00o(String str) {
        this.f23177OooO00o = new OooO0OO(str);
        return this;
    }

    public C9601iL OooO00o(Provider provider) {
        this.f23177OooO00o = new C9602OooO0Oo(provider);
        return this;
    }
}
