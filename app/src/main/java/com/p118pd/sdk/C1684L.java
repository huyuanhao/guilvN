package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L丨 */
public class C1684L extends AbstractC5738Lil {
    public C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f16780OooO00o;
    public LlLI1 o00OoOOo;

    public C1684L(I11li1 i11li1) {
        if (i11li1.size() >= 2) {
            this.o00OoOOo = (LlLI1) i11li1.OooO00o(0);
            this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
            if (i11li1.size() > 2) {
                this.f16780OooO00o = AbstractC6804llL1ii.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(2), false);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Truncated Sequence Found");
    }

    public C1684L(LlLI1 llLI1, C6456l1ilL r2, AbstractC6804llL1ii r3) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r2;
        this.f16780OooO00o = r3;
    }

    public static C1684L OooO00o(Object obj) {
        if (obj instanceof C1684L) {
            return (C1684L) obj;
        }
        if (obj != null) {
            return new C1684L(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m16414OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m16415OooO00o() {
        return this.f16780OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(this.OooO00o);
        AbstractC6804llL1ii r1 = this.f16780OooO00o;
        if (r1 != null) {
            r0.OooO00o(new C6881lliiI1(false, 0, r1));
        }
        return new C6351ill(r0);
    }
}
