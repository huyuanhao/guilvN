package com.p118pd.sdk;

/* renamed from: com.pd.sdk.IliI  reason: case insensitive filesystem */
public class C5458IliI extends AbstractC5738Lil {
    public ILI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LILIIiLl f15866OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final l1LILI1 f15867OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9623il f15868OooO00o;

    public C5458IliI(I11li1 i11li1) {
        int i = 1;
        if (i11li1.size() < 1 || i11li1.size() > 4) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f15867OooO00o = l1LILI1.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() > 1 && (i11li1.OooO00o(1).OooO0O0() instanceof AbstractC5903LlLLL)) {
            this.OooO00o = ILI.OooO00o(i11li1.OooO00o(1));
            i = 2;
        }
        if (i11li1.size() > i && (i11li1.OooO00o(i).OooO0O0() instanceof C9623il)) {
            this.f15868OooO00o = C9623il.OooO00o(i11li1.OooO00o(i));
            i++;
        }
        if (i11li1.size() > i && (i11li1.OooO00o(i).OooO0O0() instanceof iIilII1)) {
            this.f15866OooO00o = new LILIIiLl(iIilII1.OooO00o(i11li1.OooO00o(i)));
        }
    }

    public C5458IliI(l1LILI1 r1, ILI ili, C9623il r3, LILIIiLl lILIIiLl) {
        this.f15867OooO00o = r1;
        this.OooO00o = ili;
        this.f15868OooO00o = r3;
        this.f15866OooO00o = lILIIiLl;
    }

    public static C5458IliI OooO00o(Object obj) {
        if (obj instanceof C5458IliI) {
            return (C5458IliI) obj;
        }
        if (obj != null) {
            return new C5458IliI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public ILI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LILIIiLl m15688OooO00o() {
        return this.f15866OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l1LILI1 m15689OooO00o() {
        return this.f15867OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9623il m15690OooO00o() {
        return this.f15868OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f15867OooO00o);
        ILI ili = this.OooO00o;
        if (ili != null) {
            r0.OooO00o(ili);
        }
        C9623il r1 = this.f15868OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        LILIIiLl lILIIiLl = this.f15866OooO00o;
        if (lILIIiLl != null) {
            r0.OooO00o(lILIIiLl);
        }
        return new C5707LiL1(r0);
    }
}
