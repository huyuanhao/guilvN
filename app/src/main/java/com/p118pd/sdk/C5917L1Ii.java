package com.p118pd.sdk;

import java.security.Provider;
import java.security.cert.CertificateException;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.L丨丨丨1Ii丨  reason: invalid class name and case insensitive filesystem */
public class C5917L1Ii implements AbstractC5603L1lLi {
    public C5504IIL OooO00o = new C5504IIL();

    public C5917L1Ii OooO00o(String str) {
        this.OooO00o.OooO00o(str);
        return this;
    }

    public C5917L1Ii OooO00o(Provider provider) {
        this.OooO00o.OooO00o(provider);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC5603L1lLi
    public AbstractC9449II OooO00o(C6888ll r2) throws OperatorCreationException {
        return this.OooO00o.OooO00o(r2);
    }

    @Override // com.p118pd.sdk.AbstractC5603L1lLi
    public AbstractC9449II OooO00o(X509CertificateHolder x509CertificateHolder) throws OperatorCreationException {
        try {
            return this.OooO00o.OooO00o(x509CertificateHolder);
        } catch (CertificateException e) {
            throw new OperatorCreationException("Unable to process certificate: " + e.getMessage(), e);
        }
    }
}
