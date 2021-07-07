package com.p118pd.sdk;

/* renamed from: com.pd.sdk.il1L丨  reason: invalid class name and case insensitive filesystem */
public class C6295il1L extends AbstractC5738Lil {
    public i1IlIiLI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iIilII1 f17976OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f17977OooO00o;

    public C6295il1L(I11li1 i11li1) {
        int size = i11li1.size() - 1;
        this.f17976OooO00o = iIilII1.OooO00o(i11li1.OooO00o(size));
        for (int i = size - 1; i >= 0; i--) {
            AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) i11li1.OooO00o(i);
            if (r0.OooO00o() == 0) {
                this.f17977OooO00o = C6456l1ilL.OooO00o(r0, true);
            } else {
                this.OooO00o = i1IlIiLI.OooO00o(r0, true);
            }
        }
    }

    public C6295il1L(C6456l1ilL r1, i1IlIiLI i1iliili, iIilII1 iiilii1) {
        this.f17977OooO00o = r1;
        this.OooO00o = i1iliili;
        this.f17976OooO00o = iiilii1;
    }

    public C6295il1L(C6456l1ilL r2, i1IlIiLI i1iliili, byte[] bArr) {
        this(r2, i1iliili, new iIilII1(bArr));
    }

    public static C6295il1L OooO00o(Object obj) {
        if (obj instanceof C6295il1L) {
            return (C6295il1L) obj;
        }
        if (obj != null) {
            return new C6295il1L(I11li1.OooO00o(obj));
        }
        return null;
    }

    private void OooO00o(iILLL1 r3, int i, AbstractC6854lLi1LL r5) {
        if (r5 != null) {
            r3.OooO00o(new ILI1Ll(true, i, r5));
        }
    }

    public i1IlIiLI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iIilII1 m17318OooO00o() {
        return this.f17976OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17319OooO00o() {
        return this.f17977OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        OooO00o(r0, 0, this.f17977OooO00o);
        OooO00o(r0, 1, this.OooO00o);
        r0.OooO00o(this.f17976OooO00o);
        return new C5707LiL1(r0);
    }
}
