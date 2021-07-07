package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.pd.sdk.L1lLI */
public class L1lLI extends PKIXParameters {
    public static final int o0ooOO0 = 0;
    public static final int o0ooOOo = 1;
    public AbstractC6317ilLi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f16215OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Set f16216OooO00o = new HashSet();
    public List OooO0O0 = new ArrayList();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Set f16217OooO0O0 = new HashSet();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f16218OooO0O0;
    public Set OooO0OO = new HashSet();

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f16219OooO0OO = false;
    public Set OooO0Oo = new HashSet();
    public int o00oO0O = 0;

    public L1lLI(Set set) throws InvalidAlgorithmParameterException {
        super(set);
    }

    public static L1lLI OooO00o(PKIXParameters pKIXParameters) {
        try {
            L1lLI l1lLI = new L1lLI(pKIXParameters.getTrustAnchors());
            l1lLI.m15986OooO00o(pKIXParameters);
            return l1lLI;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public int OooO00o() {
        return this.o00oO0O;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6317ilLi m15983OooO00o() {
        AbstractC6317ilLi illi = this.OooO00o;
        if (illi != null) {
            return (AbstractC6317ilLi) illi.clone();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List m15984OooO00o() {
        return Collections.unmodifiableList(this.OooO0O0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set m15985OooO00o() {
        return Collections.unmodifiableSet(this.OooO0Oo);
    }

    public void OooO00o(int i) {
        this.o00oO0O = i;
    }

    public void OooO00o(AbstractC6271iilI iili) {
        OooO0O0(iili);
    }

    public void OooO00o(AbstractC6317ilLi illi) {
        this.OooO00o = illi != null ? (AbstractC6317ilLi) illi.clone() : null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15986OooO00o(PKIXParameters pKIXParameters) {
        setDate(pKIXParameters.getDate());
        setCertPathCheckers(pKIXParameters.getCertPathCheckers());
        setCertStores(pKIXParameters.getCertStores());
        setAnyPolicyInhibited(pKIXParameters.isAnyPolicyInhibited());
        setExplicitPolicyRequired(pKIXParameters.isExplicitPolicyRequired());
        setPolicyMappingInhibited(pKIXParameters.isPolicyMappingInhibited());
        setRevocationEnabled(pKIXParameters.isRevocationEnabled());
        setInitialPolicies(pKIXParameters.getInitialPolicies());
        setPolicyQualifiersRejected(pKIXParameters.getPolicyQualifiersRejected());
        setSigProvider(pKIXParameters.getSigProvider());
        setTargetCertConstraints(pKIXParameters.getTargetCertConstraints());
        try {
            setTrustAnchors(pKIXParameters.getTrustAnchors());
            if (pKIXParameters instanceof L1lLI) {
                L1lLI l1lLI = (L1lLI) pKIXParameters;
                this.o00oO0O = l1lLI.o00oO0O;
                this.f16219OooO0OO = l1lLI.f16219OooO0OO;
                this.f16218OooO0O0 = l1lLI.f16218OooO0O0;
                AbstractC6317ilLi illi = l1lLI.OooO00o;
                this.OooO00o = illi == null ? null : (AbstractC6317ilLi) illi.clone();
                this.f16215OooO00o = new ArrayList(l1lLI.f16215OooO00o);
                this.OooO0O0 = new ArrayList(l1lLI.OooO0O0);
                this.f16216OooO00o = new HashSet(l1lLI.f16216OooO00o);
                this.OooO0OO = new HashSet(l1lLI.OooO0OO);
                this.f16217OooO0O0 = new HashSet(l1lLI.f16217OooO0O0);
                this.OooO0Oo = new HashSet(l1lLI.OooO0Oo);
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void OooO00o(List list) {
        if (list == null) {
            this.f16215OooO00o = new ArrayList();
            return;
        }
        for (Object obj : list) {
            if (!(obj instanceof AbstractC6271iilI)) {
                throw new ClassCastException("All elements of list must be of type org.bouncycastle.util.Store.");
            }
        }
        this.f16215OooO00o = new ArrayList(list);
    }

    public void OooO00o(Set set) {
        if (set == null) {
            this.OooO0Oo.clear();
            return;
        }
        for (Object obj : set) {
            if (!(obj instanceof lIi1IL)) {
                throw new ClassCastException("All elements of set must be of type " + lIi1IL.class.getName() + C9058ooOoOoOO.OooOO0);
            }
        }
        this.OooO0Oo.clear();
        this.OooO0Oo.addAll(set);
    }

    public void OooO00o(boolean z) {
        this.f16218OooO0O0 = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15987OooO00o() {
        return this.f16218OooO0O0;
    }

    public List OooO0O0() {
        return Collections.unmodifiableList(new ArrayList(this.f16215OooO00o));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Set m15988OooO0O0() {
        return Collections.unmodifiableSet(this.f16217OooO0O0);
    }

    public void OooO0O0(AbstractC6271iilI iili) {
        if (iili != null) {
            this.OooO0O0.add(iili);
        }
    }

    public void OooO0O0(Set set) {
        if (set == null) {
            this.f16217OooO0O0.clear();
            return;
        }
        for (Object obj : set) {
            if (!(obj instanceof String)) {
                throw new ClassCastException("All elements of set must be of type String.");
            }
        }
        this.f16217OooO0O0.clear();
        this.f16217OooO0O0.addAll(set);
    }

    public void OooO0O0(boolean z) {
        this.f16219OooO0OO = z;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m15989OooO0O0() {
        return this.f16219OooO0OO;
    }

    public Set OooO0OO() {
        return Collections.unmodifiableSet(this.OooO0OO);
    }

    public void OooO0OO(AbstractC6271iilI iili) {
        if (iili != null) {
            this.f16215OooO00o.add(iili);
        }
    }

    public void OooO0OO(Set set) {
        if (set == null) {
            this.OooO0OO.clear();
            return;
        }
        for (Object obj : set) {
            if (!(obj instanceof String)) {
                throw new ClassCastException("All elements of set must be of type String.");
            }
        }
        this.OooO0OO.clear();
        this.OooO0OO.addAll(set);
    }

    public Set OooO0Oo() {
        return Collections.unmodifiableSet(this.f16216OooO00o);
    }

    public void OooO0Oo(Set set) {
        if (set == null) {
            this.f16216OooO00o.clear();
            return;
        }
        for (Object obj : set) {
            if (!(obj instanceof TrustAnchor)) {
                throw new ClassCastException("All elements of set must be of type " + TrustAnchor.class.getName() + C9058ooOoOoOO.OooOO0);
            }
        }
        this.f16216OooO00o.clear();
        this.f16216OooO00o.addAll(set);
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            L1lLI l1lLI = new L1lLI(getTrustAnchors());
            l1lLI.m15986OooO00o((PKIXParameters) this);
            return l1lLI;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override // java.security.cert.PKIXParameters
    public void setCertStores(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                addCertStore((CertStore) it.next());
            }
        }
    }

    public void setTargetCertConstraints(CertSelector certSelector) {
        super.setTargetCertConstraints(certSelector);
        this.OooO00o = certSelector != null ? C6175iLLl.OooO00o((X509CertSelector) certSelector) : null;
    }
}
