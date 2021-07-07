package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LILlIL */
public class LILlIL extends AbstractC5738Lil {
    public I11L OooO00o;

    public LILlIL(I11L i11l) {
        this.OooO00o = i11l;
    }

    public LILlIL(C5605L1ll r2) {
        this.OooO00o = new i1I1I1l(r2);
    }

    public LILlIL(LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(llLI1);
        r0.OooO00o(r3);
        this.OooO00o = new i1I1I1l(new C5707LiL1(r0));
    }

    public LILlIL(C5605L1ll[] r2) {
        this.OooO00o = new i1I1I1l(r2);
    }

    public static LILlIL OooO00o(Object obj) {
        if (obj instanceof LILlIL) {
            return (LILlIL) obj;
        }
        if (obj != null) {
            return new LILlIL(I11L.OooO00o(obj));
        }
        return null;
    }

    public C5605L1ll OooO00o() {
        if (this.OooO00o.size() == 0) {
            return null;
        }
        return C5605L1ll.OooO00o(this.OooO00o.OooO00o(0));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16060OooO00o() {
        return this.OooO00o.size() > 1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5605L1ll[] m16061OooO00o() {
        int size = this.OooO00o.size();
        C5605L1ll[] r1 = new C5605L1ll[size];
        for (int i = 0; i != size; i++) {
            r1[i] = C5605L1ll.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }

    public int size() {
        return this.OooO00o.size();
    }
}
