package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lI11lLL */
public class lI11lLL extends AbstractC5738Lil {
    public final C5801LllI11 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6854lLi1LL f18321OooO00o;

    public lI11lLL(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            AbstractC6854lLi1LL OooO00o2 = i11li1.OooO00o(0);
            if (!(OooO00o2 instanceof C9725llI11I) && !(OooO00o2 instanceof C6378iLI)) {
                I11li1 OooO00o3 = I11li1.OooO00o(OooO00o2);
                OooO00o2 = OooO00o3.size() == 2 ? C9725llI11I.OooO00o(OooO00o3) : C6378iLI.OooO00o(OooO00o3);
            }
            this.f18321OooO00o = OooO00o2;
            this.OooO00o = C5801LllI11.OooO00o(i11li1.OooO00o(1));
            return;
        }
        throw new IllegalArgumentException("malformed sequence");
    }

    public lI11lLL(C6378iLI r1, C5801LllI11 r2) {
        this.f18321OooO00o = r1;
        this.OooO00o = r2;
    }

    public lI11lLL(C9725llI11I r1, C5801LllI11 r2) {
        this.f18321OooO00o = r1;
        this.OooO00o = r2;
    }

    public static lI11lLL OooO00o(Object obj) {
        if (obj instanceof lI11lLL) {
            return (lI11lLL) obj;
        }
        if (obj != null) {
            return new lI11lLL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5801LllI11 OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18321OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m17612OooO0O0() {
        return this.f18321OooO00o;
    }
}
