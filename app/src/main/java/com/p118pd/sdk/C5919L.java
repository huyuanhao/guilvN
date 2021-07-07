package com.p118pd.sdk;

import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.L丨丨丨丨  reason: invalid class name and case insensitive filesystem */
public class C5919L {
    public OooO0O0 OooO00o = new OooO0O0();

    /* renamed from: com.pd.sdk.L丨丨丨丨$OooO0O0 */
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

    /* renamed from: com.pd.sdk.L丨丨丨丨$OooO0OO */
    public class OooO0OO extends OooO0O0 {
        public final String OooO00o;

        public OooO0OO(String str) {
            super();
            this.OooO00o = str;
        }

        @Override // com.p118pd.sdk.C5919L.OooO0O0
        public AbstractC6290ii OooO00o() throws OperatorCreationException {
            return new l1i1IL().OooO00o(this.OooO00o).OooO00o();
        }

        @Override // com.p118pd.sdk.C5919L.OooO0O0
        public AbstractC9449II OooO00o(PublicKey publicKey) throws OperatorCreationException {
            return new C5504IIL().OooO00o(this.OooO00o).OooO00o(publicKey);
        }

        @Override // com.p118pd.sdk.C5919L.OooO0O0
        public AbstractC9449II OooO00o(X509Certificate x509Certificate) throws OperatorCreationException {
            return new C5504IIL().OooO00o(this.OooO00o).OooO00o(x509Certificate);
        }

        @Override // com.p118pd.sdk.C5919L.OooO0O0
        public AbstractC9449II OooO00o(X509CertificateHolder x509CertificateHolder) throws OperatorCreationException, CertificateException {
            return new C5504IIL().OooO00o(this.OooO00o).OooO00o(x509CertificateHolder);
        }
    }

    /* renamed from: com.pd.sdk.L丨丨丨丨$OooO0Oo  reason: case insensitive filesystem */
    public class C5920OooO0Oo extends OooO0O0 {
        public final Provider OooO00o;

        public C5920OooO0Oo(Provider provider) {
            super();
            this.OooO00o = provider;
        }

        @Override // com.p118pd.sdk.C5919L.OooO0O0
        public AbstractC6290ii OooO00o() throws OperatorCreationException {
            return new l1i1IL().OooO00o(this.OooO00o).OooO00o();
        }

        @Override // com.p118pd.sdk.C5919L.OooO0O0
        public AbstractC9449II OooO00o(PublicKey publicKey) throws OperatorCreationException {
            return new C5504IIL().OooO00o(this.OooO00o).OooO00o(publicKey);
        }

        @Override // com.p118pd.sdk.C5919L.OooO0O0
        public AbstractC9449II OooO00o(X509Certificate x509Certificate) throws OperatorCreationException {
            return new C5504IIL().OooO00o(this.OooO00o).OooO00o(x509Certificate);
        }

        @Override // com.p118pd.sdk.C5919L.OooO0O0
        public AbstractC9449II OooO00o(X509CertificateHolder x509CertificateHolder) throws OperatorCreationException, CertificateException {
            return new C5504IIL().OooO00o(this.OooO00o).OooO00o(x509CertificateHolder);
        }
    }

    public C5919L OooO00o(String str) {
        this.OooO00o = new OooO0OO(str);
        return this;
    }

    public C5919L OooO00o(Provider provider) {
        this.OooO00o = new C5920OooO0Oo(provider);
        return this;
    }

    public iIiIliLi OooO00o(PublicKey publicKey) throws OperatorCreationException {
        return new iIiIliLi(new C9334I1I11(), new C5380Iil(), this.OooO00o.OooO00o(publicKey), this.OooO00o.OooO00o());
    }

    public iIiIliLi OooO00o(X509Certificate x509Certificate) throws OperatorCreationException {
        return new iIiIliLi(new C9334I1I11(), new C5380Iil(), this.OooO00o.OooO00o(x509Certificate), this.OooO00o.OooO00o());
    }

    public iIiIliLi OooO00o(X509CertificateHolder x509CertificateHolder) throws OperatorCreationException, CertificateException {
        return new iIiIliLi(new C9334I1I11(), new C5380Iil(), this.OooO00o.OooO00o(x509CertificateHolder), this.OooO00o.OooO00o());
    }
}
