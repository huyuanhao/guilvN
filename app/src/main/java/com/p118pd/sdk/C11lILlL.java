package com.p118pd.sdk;

import com.p118pd.sdk.C6422iIi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.pd.sdk.丨11lILlL  reason: invalid class name */
public class C11lILlL implements CertPathParameters {
    public static final int o0ooOO0 = 0;
    public static final int o0ooOOo = 1;
    public final C6422iIi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final PKIXParameters f22721OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Date f22722OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<AbstractC9687lLi> f22723OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<ILI, AbstractC9687lLi> f22724OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Set<TrustAnchor> f22725OooO00o;
    public final List<AbstractC6466l11> OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Map<ILI, AbstractC6466l11> f22726OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final boolean f22727OooO0O0;
    public final boolean OooO0OO;
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.丨11lILlL$OooO0O0 */
    public static class OooO0O0 {
        public int OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6422iIi f22728OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final PKIXParameters f22729OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Date f22730OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<AbstractC9687lLi> f22731OooO00o = new ArrayList();

        /* renamed from: OooO00o  reason: collision with other field name */
        public Map<ILI, AbstractC9687lLi> f22732OooO00o = new HashMap();

        /* renamed from: OooO00o  reason: collision with other field name */
        public Set<TrustAnchor> f22733OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f22734OooO00o;
        public List<AbstractC6466l11> OooO0O0 = new ArrayList();

        /* renamed from: OooO0O0  reason: collision with other field name */
        public Map<ILI, AbstractC6466l11> f22735OooO0O0 = new HashMap();

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f22736OooO0O0 = false;

        public OooO0O0(C11lILlL r3) {
            this.f22729OooO00o = r3.f22721OooO00o;
            this.f22730OooO00o = r3.f22722OooO00o;
            this.f22728OooO00o = r3.OooO00o;
            this.f22731OooO00o = new ArrayList(r3.f22723OooO00o);
            this.f22732OooO00o = new HashMap(r3.f22724OooO00o);
            this.OooO0O0 = new ArrayList(r3.OooO0O0);
            this.f22735OooO0O0 = new HashMap(r3.f22726OooO0O0);
            this.f22736OooO0O0 = r3.OooO0OO;
            this.OooO00o = r3.o00oO0O;
            this.f22734OooO00o = r3.m21250OooO0Oo();
            this.f22733OooO00o = r3.m21247OooO0O0();
        }

        public OooO0O0(PKIXParameters pKIXParameters) {
            this.f22729OooO00o = (PKIXParameters) pKIXParameters.clone();
            CertSelector targetCertConstraints = pKIXParameters.getTargetCertConstraints();
            if (targetCertConstraints != null) {
                this.f22728OooO00o = new C6422iIi.OooO0O0(targetCertConstraints).OooO00o();
            }
            Date date = pKIXParameters.getDate();
            this.f22730OooO00o = date == null ? new Date() : date;
            this.f22734OooO00o = pKIXParameters.isRevocationEnabled();
            this.f22733OooO00o = pKIXParameters.getTrustAnchors();
        }

        public OooO0O0 OooO00o(int i) {
            this.OooO00o = i;
            return this;
        }

        public OooO0O0 OooO00o(ILI ili, AbstractC6466l11 r3) {
            this.f22735OooO0O0.put(ili, r3);
            return this;
        }

        public OooO0O0 OooO00o(ILI ili, AbstractC9687lLi r3) {
            this.f22732OooO00o.put(ili, r3);
            return this;
        }

        public OooO0O0 OooO00o(C6422iIi r1) {
            this.f22728OooO00o = r1;
            return this;
        }

        public OooO0O0 OooO00o(AbstractC6466l11 r2) {
            this.OooO0O0.add(r2);
            return this;
        }

        public OooO0O0 OooO00o(AbstractC9687lLi r2) {
            this.f22731OooO00o.add(r2);
            return this;
        }

        public OooO0O0 OooO00o(TrustAnchor trustAnchor) {
            this.f22733OooO00o = Collections.singleton(trustAnchor);
            return this;
        }

        public OooO0O0 OooO00o(Set<TrustAnchor> set) {
            this.f22733OooO00o = set;
            return this;
        }

        public OooO0O0 OooO00o(boolean z) {
            this.f22736OooO0O0 = z;
            return this;
        }

        public C11lILlL OooO00o() {
            return new C11lILlL(this);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m21251OooO00o(boolean z) {
            this.f22734OooO00o = z;
        }
    }

    public C11lILlL(OooO0O0 oooO0O0) {
        this.f22721OooO00o = oooO0O0.f22729OooO00o;
        this.f22722OooO00o = oooO0O0.f22730OooO00o;
        this.f22723OooO00o = Collections.unmodifiableList(oooO0O0.f22731OooO00o);
        this.f22724OooO00o = Collections.unmodifiableMap(new HashMap(oooO0O0.f22732OooO00o));
        this.OooO0O0 = Collections.unmodifiableList(oooO0O0.OooO0O0);
        this.f22726OooO0O0 = Collections.unmodifiableMap(new HashMap(oooO0O0.f22735OooO0O0));
        this.OooO00o = oooO0O0.f22728OooO00o;
        this.f22727OooO0O0 = oooO0O0.f22734OooO00o;
        this.OooO0OO = oooO0O0.f22736OooO0O0;
        this.o00oO0O = oooO0O0.OooO00o;
        this.f22725OooO00o = Collections.unmodifiableSet(oooO0O0.f22733OooO00o);
    }

    public int OooO00o() {
        return this.o00oO0O;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6422iIi m21239OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Date m21240OooO00o() {
        return new Date(this.f22722OooO00o.getTime());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<AbstractC6466l11> m21241OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<ILI, AbstractC6466l11> m21242OooO00o() {
        return this.f22726OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set m21243OooO00o() {
        return this.f22721OooO00o.getInitialPolicies();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21244OooO00o() {
        return this.f22721OooO00o.isAnyPolicyInhibited();
    }

    public String OooO0O0() {
        return this.f22721OooO00o.getSigProvider();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public List m21245OooO0O0() {
        return this.f22721OooO00o.getCertPathCheckers();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Map<ILI, AbstractC9687lLi> m21246OooO0O0() {
        return this.f22724OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Set m21247OooO0O0() {
        return this.f22725OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21248OooO0O0() {
        return this.f22721OooO00o.isExplicitPolicyRequired();
    }

    public List<CertStore> OooO0OO() {
        return this.f22721OooO00o.getCertStores();
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m21249OooO0OO() {
        return this.f22721OooO00o.isPolicyMappingInhibited();
    }

    public List<AbstractC9687lLi> OooO0Oo() {
        return this.f22723OooO00o;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m21250OooO0Oo() {
        return this.f22727OooO0O0;
    }

    public boolean OooO0o0() {
        return this.OooO0OO;
    }

    @Override // java.lang.Object
    public Object clone() {
        return this;
    }
}
