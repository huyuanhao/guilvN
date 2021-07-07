package com.p118pd.sdk;

/* renamed from: com.pd.sdk.II丨LLi  reason: invalid class name and case insensitive filesystem */
public class C5239IILLi extends AbstractC5738Lil {
    public AbstractC6854lLi1LL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C93041iI1l f15520OooO00o;

    public C5239IILLi(I11li1 i11li1) {
        if (i11li1.size() < 1 || i11li1.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        boolean z = i11li1.OooO00o(0).OooO0O0() instanceof AbstractC6804llL1ii;
        AbstractC6854lLi1LL OooO00o2 = i11li1.OooO00o(0);
        this.OooO00o = z ? AbstractC6804llL1ii.OooO00o(OooO00o2) : C6052i1l.OooO00o(OooO00o2);
        if (i11li1.size() > 1) {
            this.f15520OooO00o = C93041iI1l.OooO00o(i11li1.OooO00o(1));
        }
    }

    public C5239IILLi(C6456l1ilL r2, byte[] bArr) {
        this.OooO00o = new C6052i1l(r2, bArr);
    }

    public C5239IILLi(C6456l1ilL r2, byte[] bArr, C93041iI1l r4) {
        this.OooO00o = new C6052i1l(r2, bArr);
        this.f15520OooO00o = r4;
    }

    public static C5239IILLi OooO00o(Object obj) {
        if (obj instanceof C5239IILLi) {
            return (C5239IILLi) obj;
        }
        if (obj != null) {
            return new C5239IILLi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o.OooO0O0() instanceof AbstractC6804llL1ii ? new C6456l1ilL(AbstractC9733l.OooO) : C6052i1l.OooO00o(this.OooO00o).OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C93041iI1l m15439OooO00o() {
        return this.f15520OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15440OooO00o() {
        return this.OooO00o.OooO0O0() instanceof AbstractC6804llL1ii ? ((AbstractC6804llL1ii) this.OooO00o.OooO0O0()).m17938OooO00o() : C6052i1l.OooO00o(this.OooO00o).m16916OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        C93041iI1l r1 = this.f15520OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }
}
