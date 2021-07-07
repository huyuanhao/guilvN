package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.dvcs.DVCSException;

/* renamed from: com.pd.sdk.LIliLil  reason: case insensitive filesystem */
public class C5642LIliLil extends C1I {
    public List OooO00o = new ArrayList();

    public C5642LIliLil() {
        super(new C6883lll(IiIllLI.OooO0OO));
    }

    public C5333ILiL OooO00o() throws DVCSException {
        List list = this.OooO00o;
        return OooO00o(new C5178I1iIi((C1706l[]) list.toArray(new C1706l[list.size()])));
    }

    public void OooO00o(C5237III r4) {
        this.OooO00o.add(new C1706l(new C6258iii(r4)));
    }

    public void OooO00o(liIIl1I r2) {
        this.OooO00o.add(r2.OooO00o());
    }

    public void OooO00o(Date date) {
        ((C1I) this).f22748OooO00o.OooO00o(new C5509IIiI(date));
    }

    public void OooO00o(X509CertificateHolder x509CertificateHolder) {
        this.OooO00o.add(new C1706l(new C6258iii(0, x509CertificateHolder.toASN1Structure())));
    }
}
