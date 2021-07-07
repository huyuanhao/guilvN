package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iL丨  reason: invalid class name and case insensitive filesystem */
public class C6198iL extends AbstractC5738Lil {
    public I1iIl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IiLIl1I f17800OooO00o;
    public LlLI1 o00OoOOo;

    public C6198iL(I11li1 i11li1) {
        if (i11li1.size() == 2 || i11li1.size() == 3) {
            this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
            this.f17800OooO00o = IiLIl1I.OooO00o(i11li1.OooO00o(1));
            if (i11li1.size() == 3) {
                this.OooO00o = I1iIl.OooO00o(i11li1.OooO00o(2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C6198iL(LlLI1 llLI1, IiLIl1I iiLIl1I) {
        this(llLI1, iiLIl1I, null);
    }

    public C6198iL(LlLI1 llLI1, IiLIl1I iiLIl1I, I1iIl i1iIl) {
        this.o00OoOOo = llLI1;
        this.f17800OooO00o = iiLIl1I;
        this.OooO00o = i1iIl;
    }

    public static C6198iL OooO00o(Object obj) {
        if (obj instanceof C6198iL) {
            return (C6198iL) obj;
        }
        if (obj != null) {
            return new C6198iL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I1iIl OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public IiLIl1I m17171OooO00o() {
        return this.f17800OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m17172OooO00o() {
        return new LlLI1(this.o00OoOOo.m16387OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(this.f17800OooO00o);
        I1iIl i1iIl = this.OooO00o;
        if (i1iIl != null) {
            r0.OooO00o(i1iIl);
        }
        return new C5707LiL1(r0);
    }
}
