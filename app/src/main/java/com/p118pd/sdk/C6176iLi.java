package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iLi  reason: case insensitive filesystem */
public class C6176iLi extends AbstractC5738Lil {
    public iIilII1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f17746OooO00o;

    public C6176iLi(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.OooO00o = iIilII1.OooO00o(i11li1.OooO00o(0));
            this.f17746OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(1));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C6176iLi(iIilII1 iiilii1, C6513lIiI r2) {
        if (iiilii1 == null) {
            throw new IllegalArgumentException("'seed' cannot be null");
        } else if (r2 != null) {
            this.OooO00o = iiilii1;
            this.f17746OooO00o = r2;
        } else {
            throw new IllegalArgumentException("'pgenCounter' cannot be null");
        }
    }

    public static C6176iLi OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6176iLi OooO00o(Object obj) {
        if (obj instanceof C6176iLi) {
            return (C6176iLi) obj;
        }
        if (obj != null) {
            return new C6176iLi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public iIilII1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m17127OooO00o() {
        return this.f17746OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f17746OooO00o);
        return new C5707LiL1(r0);
    }
}
