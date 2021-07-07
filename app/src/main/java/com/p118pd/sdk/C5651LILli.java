package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: com.pd.sdk.LI丨丨L丨li  reason: invalid class name and case insensitive filesystem */
public class C5651LILli extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Hashtable f16390OooO00o = new Hashtable();

    public C5651LILli(I11li1 i11li1) {
        this.OooO00o = i11li1;
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC6854lLi1LL r0 = (AbstractC6854lLi1LL) OooO00o2.nextElement();
            if (r0.OooO0O0() instanceof LlLI1) {
                this.f16390OooO00o.put(r0, r0);
            } else {
                throw new IllegalArgumentException("Only ASN1ObjectIdentifiers allowed in ExtendedKeyUsage.");
            }
        }
    }

    public C5651LILli(C5869LiLL r2) {
        this.OooO00o = new C5707LiL1(r2);
        this.f16390OooO00o.put(r2, r2);
    }

    public C5651LILli(Vector vector) {
        iILLL1 r0 = new iILLL1();
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            C5869LiLL OooO00o2 = C5869LiLL.OooO00o(elements.nextElement());
            r0.OooO00o(OooO00o2);
            this.f16390OooO00o.put(OooO00o2, OooO00o2);
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public C5651LILli(C5869LiLL[] r6) {
        iILLL1 r0 = new iILLL1();
        for (int i = 0; i != r6.length; i++) {
            r0.OooO00o(r6[i]);
            this.f16390OooO00o.put(r6[i], r6[i]);
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public static C5651LILli OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C5651LILli OooO00o(iI11IL r1) {
        return OooO00o(r1.m17472OooO00o(C5237III.o00o00O0));
    }

    public static C5651LILli OooO00o(Object obj) {
        if (obj instanceof C5651LILli) {
            return (C5651LILli) obj;
        }
        if (obj != null) {
            return new C5651LILli(I11li1.OooO00o(obj));
        }
        return null;
    }

    public boolean OooO00o(C5869LiLL r2) {
        return this.f16390OooO00o.get(r2) != null;
    }

    public C5869LiLL[] OooO00o() {
        C5869LiLL[] r0 = new C5869LiLL[this.OooO00o.size()];
        Enumeration OooO00o2 = this.OooO00o.m15236OooO00o();
        int i = 0;
        while (OooO00o2.hasMoreElements()) {
            r0[i] = C5869LiLL.OooO00o(OooO00o2.nextElement());
            i++;
        }
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }

    public int size() {
        return this.f16390OooO00o.size();
    }
}
