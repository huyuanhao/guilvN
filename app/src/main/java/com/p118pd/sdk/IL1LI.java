package com.p118pd.sdk;

import java.util.ArrayList;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.IL1丨LI  reason: invalid class name */
public class IL1LI implements AbstractC6317ilLi {
    public final AbstractC6854lLi1LL OooO00o;

    public IL1LI(l1LILI1 r4) {
        this.OooO00o = new C6298il1liL(new C5845LIillll(new ILI(r4)));
    }

    public IL1LI(C6653liIl liil) {
        this.OooO00o = liil.m17742OooO0O0();
    }

    private boolean OooO00o(l1LILI1 r6, C5845LIillll r7) {
        ILI[] OooO00o2 = r7.OooO00o();
        for (int i = 0; i != OooO00o2.length; i++) {
            ILI ili = OooO00o2[i];
            if (ili.OooO00o() == 4 && l1LILI1.OooO00o(ili.m15483OooO0O0()).equals(r6)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC6317ilLi
    public boolean OooO00o(Object obj) {
        if (!(obj instanceof X509CertificateHolder)) {
            return false;
        }
        X509CertificateHolder x509CertificateHolder = (X509CertificateHolder) obj;
        AbstractC6854lLi1LL r0 = this.OooO00o;
        if (r0 instanceof C6298il1liL) {
            C6298il1liL il1lil = (C6298il1liL) r0;
            if (il1lil.m17330OooO00o() != null) {
                return il1lil.m17330OooO00o().m21308OooO00o().m17647OooO0O0().equals(x509CertificateHolder.getSerialNumber()) && OooO00o(x509CertificateHolder.getIssuer(), il1lil.m17330OooO00o().OooO00o());
            }
            if (OooO00o(x509CertificateHolder.getSubject(), il1lil.m17329OooO00o())) {
                return true;
            }
        } else {
            if (OooO00o(x509CertificateHolder.getSubject(), (C5845LIillll) r0)) {
                return true;
            }
        }
        return false;
    }

    public l1LILI1[] OooO00o() {
        AbstractC6854lLi1LL r0 = this.OooO00o;
        ILI[] OooO00o2 = (r0 instanceof C6298il1liL ? ((C6298il1liL) r0).m17329OooO00o() : (C5845LIillll) r0).OooO00o();
        ArrayList arrayList = new ArrayList(OooO00o2.length);
        for (int i = 0; i != OooO00o2.length; i++) {
            if (OooO00o2[i].OooO00o() == 4) {
                arrayList.add(l1LILI1.OooO00o(OooO00o2[i].m15483OooO0O0()));
            }
        }
        return (l1LILI1[]) arrayList.toArray(new l1LILI1[arrayList.size()]);
    }

    @Override // java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        return new IL1LI(C6653liIl.OooO00o(this.OooO00o));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IL1LI)) {
            return false;
        }
        return this.OooO00o.equals(((IL1LI) obj).OooO00o);
    }

    public int hashCode() {
        return this.OooO00o.hashCode();
    }
}
