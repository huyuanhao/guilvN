package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LLL1 */
public class LLL1 extends AbstractC5738Lil {
    public i1IlIiLI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f16445OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6720lilI1 f16446OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9623il f16447OooO00o;
    public C9623il OooO0O0;

    public LLL1(I11li1 i11li1) {
        this.f16446OooO00o = C6720lilI1.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = i1IlIiLI.OooO00o(i11li1.OooO00o(1));
        this.f16447OooO00o = C9623il.OooO00o(i11li1.OooO00o(2));
        this.OooO0O0 = C9623il.OooO00o(i11li1.OooO00o(3));
        if (i11li1.size() > 4) {
            this.f16445OooO00o = iI11IL.OooO00o(i11li1.OooO00o(4));
        }
    }

    public static LLL1 OooO00o(Object obj) {
        if (obj instanceof LLL1) {
            return (LLL1) obj;
        }
        if (obj != null) {
            return new LLL1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public i1IlIiLI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iI11IL m16217OooO00o() {
        return this.f16445OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6720lilI1 m16218OooO00o() {
        return this.f16446OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9623il m16219OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16446OooO00o);
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f16447OooO00o);
        r0.OooO00o(this.OooO0O0);
        iI11IL r1 = this.f16445OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C9623il m16220OooO0O0() {
        return this.f16447OooO00o;
    }
}
