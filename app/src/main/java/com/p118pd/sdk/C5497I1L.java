package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I丨1L  reason: invalid class name and case insensitive filesystem */
public class C5497I1L extends AbstractC5738Lil {
    public C5190I1lIiL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5753LiI1 f15948OooO00o;

    public C5497I1L(I11li1 i11li1) {
        this.f15948OooO00o = C5753LiI1.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() == 2) {
            this.OooO00o = C5190I1lIiL.OooO00o(i11li1.OooO00o(1));
        }
    }

    public C5497I1L(C5753LiI1 r1) {
        this.f15948OooO00o = r1;
    }

    public static C5497I1L OooO00o(Object obj) {
        if (obj instanceof C5497I1L) {
            return (C5497I1L) obj;
        }
        if (obj != null) {
            return new C5497I1L(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5190I1lIiL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5753LiI1 m15734OooO00o() {
        return this.f15948OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public C5190I1lIiL OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m15735OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f15948OooO00o);
        C5190I1lIiL r1 = this.OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }
}
