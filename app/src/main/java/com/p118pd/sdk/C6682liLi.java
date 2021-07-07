package com.p118pd.sdk;

/* renamed from: com.pd.sdk.liL丨i  reason: invalid class name and case insensitive filesystem */
public class C6682liLi extends AbstractC5738Lil {
    public C9505LiL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9762IiI1l f18623OooO00o;

    public C6682liLi(I11li1 i11li1) {
        this.f18623OooO00o = C9762IiI1l.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() == 2) {
            this.OooO00o = C9505LiL.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(1), true);
        }
    }

    public C6682liLi(C9762IiI1l r1, C9505LiL r2) {
        this.f18623OooO00o = r1;
        this.OooO00o = r2;
    }

    public static C6682liLi OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6682liLi OooO00o(Object obj) {
        if (obj instanceof C6682liLi) {
            return (C6682liLi) obj;
        }
        if (obj != null) {
            return new C6682liLi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C9505LiL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9762IiI1l m17758OooO00o() {
        return this.f18623OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18623OooO00o);
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
