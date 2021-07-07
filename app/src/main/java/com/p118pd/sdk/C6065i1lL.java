package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Enumeration;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.i1丨l丨L  reason: invalid class name and case insensitive filesystem */
public class C6065i1lL {
    public C1ILLL1 OooO00o;

    public C6065i1lL(C1ILLL1 r1) {
        this.OooO00o = r1;
    }

    public AbstractC6271iilI OooO00o() {
        I11L OooO00o2 = this.OooO00o.OooO00o();
        if (OooO00o2 == null) {
            return new C5607LI1I1iI(new ArrayList());
        }
        ArrayList arrayList = new ArrayList(OooO00o2.size());
        Enumeration OooO00o3 = OooO00o2.m15215OooO00o();
        while (OooO00o3.hasMoreElements()) {
            AbstractC6122iIlLiL OooO0O0 = ((AbstractC6854lLi1LL) OooO00o3.nextElement()).OooO0O0();
            if (OooO0O0 instanceof I11li1) {
                arrayList.add(new X509CRLHolder(C5190I1lIiL.OooO00o(OooO0O0)));
            }
        }
        return new C5607LI1I1iI(arrayList);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1ILLL1 m16925OooO00o() {
        return this.OooO00o;
    }

    public AbstractC6271iilI OooO0O0() {
        I11L OooO0O0 = this.OooO00o.OooO0O0();
        if (OooO0O0 == null) {
            return new C5607LI1I1iI(new ArrayList());
        }
        ArrayList arrayList = new ArrayList(OooO0O0.size());
        Enumeration OooO00o2 = OooO0O0.m15215OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC6122iIlLiL OooO0O02 = ((AbstractC6854lLi1LL) OooO00o2.nextElement()).OooO0O0();
            if (OooO0O02 instanceof I11li1) {
                arrayList.add(new X509CertificateHolder(LilIiIl.OooO00o(OooO0O02)));
            }
        }
        return new C5607LI1I1iI(arrayList);
    }
}
