package com.p118pd.sdk;

import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.丨i丨L  reason: invalid class name and case insensitive filesystem */
public class C9647iL {
    public C6156iL1iil OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6290ii f23240OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6861lii f23241OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9554Li f23242OooO00o;

    public C9647iL(AbstractC6861lii r1, AbstractC9554Li r2, AbstractC6092iILIii r3, AbstractC6290ii r4) {
        this.f23241OooO00o = r1;
        this.f23242OooO00o = r2;
        this.OooO00o = new C6156iL1iil(r3);
        this.f23240OooO00o = r4;
    }

    public iIiIliLi OooO00o(C6213iL11I r5) throws OperatorCreationException {
        return new iIiIliLi(this.f23241OooO00o, this.f23242OooO00o, this.OooO00o.OooO00o(r5), this.f23240OooO00o);
    }

    public iIiIliLi OooO00o(X509CertificateHolder x509CertificateHolder) throws OperatorCreationException {
        return new iIiIliLi(this.f23241OooO00o, this.f23242OooO00o, this.OooO00o.OooO00o(x509CertificateHolder), this.f23240OooO00o);
    }
}
