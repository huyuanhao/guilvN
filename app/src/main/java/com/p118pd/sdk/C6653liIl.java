package com.p118pd.sdk;

/* renamed from: com.pd.sdk.liIl  reason: case insensitive filesystem */
public class C6653liIl extends AbstractC5738Lil implements AbstractC5462Ilil {
    public AbstractC6122iIlLiL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6854lLi1LL f18609OooO00o;

    public C6653liIl(C5845LIillll r1) {
        this.f18609OooO00o = r1;
        this.OooO00o = r1.OooO0O0();
    }

    public C6653liIl(C6298il1liL il1lil) {
        this.f18609OooO00o = il1lil;
        this.OooO00o = new ILI1Ll(false, 0, this.f18609OooO00o);
    }

    public static C6653liIl OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(r0.OooO0o());
    }

    public static C6653liIl OooO00o(Object obj) {
        if (obj == null || (obj instanceof C6653liIl)) {
            return (C6653liIl) obj;
        }
        if (obj instanceof C6298il1liL) {
            return new C6653liIl(C6298il1liL.OooO00o(obj));
        }
        if (obj instanceof C5845LIillll) {
            return new C6653liIl((C5845LIillll) obj);
        }
        if (obj instanceof AbstractC5903LlLLL) {
            return new C6653liIl(C6298il1liL.OooO00o((AbstractC5903LlLLL) obj, false));
        }
        if (obj instanceof I11li1) {
            return new C6653liIl(C5845LIillll.OooO00o(obj));
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m17742OooO0O0() {
        return this.f18609OooO00o;
    }
}
