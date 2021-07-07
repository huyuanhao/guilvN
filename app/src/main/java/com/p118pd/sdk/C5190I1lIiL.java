package com.p118pd.sdk;

import com.p118pd.sdk.C6782lli11;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.I1l丨丨IiL  reason: invalid class name and case insensitive filesystem */
public class C5190I1lIiL extends AbstractC5738Lil {
    public iIilII1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f15418OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6782lli11 f15419OooO00o;
    public boolean OooO0O0 = false;
    public int o00oO0O;

    public C5190I1lIiL(I11li1 i11li1) {
        if (i11li1.size() == 3) {
            this.f15419OooO00o = C6782lli11.OooO00o(i11li1.OooO00o(0));
            this.f15418OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
            this.OooO00o = iIilII1.OooO00o(i11li1.OooO00o(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for CertificateList");
    }

    public static C5190I1lIiL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C5190I1lIiL OooO00o(Object obj) {
        if (obj instanceof C5190I1lIiL) {
            return (C5190I1lIiL) obj;
        }
        if (obj != null) {
            return new C5190I1lIiL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5432IlIlIlL OooO00o() {
        return this.f15419OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iIilII1 m15323OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l1LILI1 m15324OooO00o() {
        return this.f15419OooO00o.m17902OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m15325OooO00o() {
        return this.f15418OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6782lli11 m15326OooO00o() {
        return this.f15419OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Enumeration m15327OooO00o() {
        return this.f15419OooO00o.m17905OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6782lli11.OooO0O0[] m15328OooO00o() {
        return this.f15419OooO00o.m17906OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.f15419OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C5432IlIlIlL m15329OooO0O0() {
        return this.f15419OooO00o.m17907OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m15330OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f15419OooO00o);
        r0.OooO00o(this.f15418OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public int hashCode() {
        if (!this.OooO0O0) {
            this.o00oO0O = super.hashCode();
            this.OooO0O0 = true;
        }
        return this.o00oO0O;
    }
}
