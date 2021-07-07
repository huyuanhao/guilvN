package com.p118pd.sdk;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.pd.sdk.丨Llll丨l1  reason: invalid class name */
public class Lllll1 implements CertSelector, AbstractC6317ilLi {
    public final AbstractC6854lLi1LL OooO00o;

    public Lllll1(C6653liIl liil) {
        this.OooO00o = liil.m17742OooO0O0();
    }

    public Lllll1(C6790lll1I11 r4) {
        this.OooO00o = new C6298il1liL(C5845LIillll.OooO00o(new C5707LiL1(new ILI(r4))));
    }

    public Lllll1(X500Principal x500Principal) throws IOException {
        this(new C6790lll1I11(x500Principal.getEncoded()));
    }

    private boolean OooO00o(X500Principal x500Principal, C5845LIillll r7) {
        ILI[] OooO00o2 = r7.OooO00o();
        for (int i = 0; i != OooO00o2.length; i++) {
            ILI ili = OooO00o2[i];
            if (ili.OooO00o() == 4) {
                try {
                    if (new X500Principal(ili.m15483OooO0O0().OooO0O0().getEncoded()).equals(x500Principal)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    private Object[] OooO00o() {
        AbstractC6854lLi1LL r0 = this.OooO00o;
        ILI[] OooO00o2 = (r0 instanceof C6298il1liL ? ((C6298il1liL) r0).m17329OooO00o() : (C5845LIillll) r0).OooO00o();
        ArrayList arrayList = new ArrayList(OooO00o2.length);
        for (int i = 0; i != OooO00o2.length; i++) {
            if (OooO00o2[i].OooO00o() == 4) {
                try {
                    arrayList.add(new X500Principal(OooO00o2[i].m15483OooO0O0().OooO0O0().getEncoded()));
                } catch (IOException unused) {
                    throw new RuntimeException("badly formed Name object");
                }
            }
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    @Override // com.p118pd.sdk.AbstractC6317ilLi
    public boolean OooO00o(Object obj) {
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        return match((Certificate) obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Principal[] m21591OooO00o() {
        Object[] OooO00o2 = OooO00o();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != OooO00o2.length; i++) {
            if (OooO00o2[i] instanceof Principal) {
                arrayList.add(OooO00o2[i]);
            }
        }
        return (Principal[]) arrayList.toArray(new Principal[arrayList.size()]);
    }

    @Override // java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        return new Lllll1(C6653liIl.OooO00o(this.OooO00o));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Lllll1)) {
            return false;
        }
        return this.OooO00o.equals(((Lllll1) obj).OooO00o);
    }

    public int hashCode() {
        return this.OooO00o.hashCode();
    }

    public boolean match(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        AbstractC6854lLi1LL r0 = this.OooO00o;
        if (r0 instanceof C6298il1liL) {
            C6298il1liL il1lil = (C6298il1liL) r0;
            if (il1lil.m17330OooO00o() != null) {
                return il1lil.m17330OooO00o().m21308OooO00o().m17647OooO0O0().equals(x509Certificate.getSerialNumber()) && OooO00o(x509Certificate.getIssuerX500Principal(), il1lil.m17330OooO00o().OooO00o());
            }
            if (OooO00o(x509Certificate.getSubjectX500Principal(), il1lil.m17329OooO00o())) {
                return true;
            }
        } else {
            if (OooO00o(x509Certificate.getSubjectX500Principal(), (C5845LIillll) r0)) {
                return true;
            }
        }
        return false;
    }
}
