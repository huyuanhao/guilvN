package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.iiIili丨  reason: invalid class name and case insensitive filesystem */
public class C6232iiIili {
    public final List OooO00o;
    public final List OooO0O0;

    public C6232iiIili(AbstractC6271iilI iili) throws CMSException {
        this(iili, null);
    }

    public C6232iiIili(AbstractC6271iilI iili, AbstractC6271iilI iili2) throws CMSException {
        this.OooO00o = C5799LllI.OooO0OO(iili);
        this.OooO0O0 = iili2 != null ? C5799LllI.OooO0O0(iili2) : null;
    }

    public C6232iiIili(X509CertificateHolder x509CertificateHolder) {
        ArrayList arrayList = new ArrayList(1);
        this.OooO00o = arrayList;
        this.OooO0O0 = null;
        arrayList.add(x509CertificateHolder.toASN1Structure());
    }

    public C6065i1lL OooO00o() {
        return this.OooO0O0 != null ? new C6065i1lL(new C1ILLL1(C5799LllI.OooO0O0(this.OooO00o), C5799LllI.OooO0O0(this.OooO0O0))) : new C6065i1lL(new C1ILLL1(C5799LllI.OooO0O0(this.OooO00o), null));
    }
}
