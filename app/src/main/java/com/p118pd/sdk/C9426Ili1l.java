package com.p118pd.sdk;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.cert.CRLException;
import java.security.cert.CertStore;
import java.security.cert.CertificateException;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509CRLConverter;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;

/* renamed from: com.pd.sdk.丨Ili1丨l  reason: invalid class name and case insensitive filesystem */
public class C9426Ili1l {
    public Object OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f22963OooO00o = "Collection";

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f22964OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public JcaX509CRLConverter f22965OooO00o = new JcaX509CRLConverter();

    /* renamed from: OooO00o  reason: collision with other field name */
    public JcaX509CertificateConverter f22966OooO00o = new JcaX509CertificateConverter();
    public List OooO0O0 = new ArrayList();

    private CollectionCertStoreParameters OooO00o(JcaX509CertificateConverter jcaX509CertificateConverter, JcaX509CRLConverter jcaX509CRLConverter) throws CertificateException, CRLException {
        ArrayList arrayList = new ArrayList(this.f22964OooO00o.size() + this.OooO0O0.size());
        for (X509CertificateHolder x509CertificateHolder : this.f22964OooO00o) {
            arrayList.add(jcaX509CertificateConverter.OooO00o(x509CertificateHolder));
        }
        for (X509CRLHolder x509CRLHolder : this.OooO0O0) {
            arrayList.add(jcaX509CRLConverter.OooO00o(x509CRLHolder));
        }
        return new CollectionCertStoreParameters(arrayList);
    }

    public C9426Ili1l OooO00o(AbstractC6271iilI iili) {
        this.OooO0O0.addAll(iili.OooO00o(null));
        return this;
    }

    public C9426Ili1l OooO00o(String str) {
        this.f22966OooO00o.OooO00o(str);
        this.f22965OooO00o.OooO00o(str);
        this.OooO00o = str;
        return this;
    }

    public C9426Ili1l OooO00o(Provider provider) {
        this.f22966OooO00o.OooO00o(provider);
        this.f22965OooO00o.OooO00o(provider);
        this.OooO00o = provider;
        return this;
    }

    public C9426Ili1l OooO00o(X509CRLHolder x509CRLHolder) {
        this.OooO0O0.add(x509CRLHolder);
        return this;
    }

    public C9426Ili1l OooO00o(X509CertificateHolder x509CertificateHolder) {
        this.f22964OooO00o.add(x509CertificateHolder);
        return this;
    }

    public CertStore OooO00o() throws GeneralSecurityException {
        CollectionCertStoreParameters OooO00o2 = OooO00o(this.f22966OooO00o, this.f22965OooO00o);
        Object obj = this.OooO00o;
        return obj instanceof String ? CertStore.getInstance(this.f22963OooO00o, OooO00o2, (String) obj) : obj instanceof Provider ? CertStore.getInstance(this.f22963OooO00o, OooO00o2, (Provider) obj) : CertStore.getInstance(this.f22963OooO00o, OooO00o2);
    }

    public C9426Ili1l OooO0O0(AbstractC6271iilI iili) {
        this.f22964OooO00o.addAll(iili.OooO00o(null));
        return this;
    }

    public C9426Ili1l OooO0O0(String str) {
        this.f22963OooO00o = str;
        return this;
    }
}
