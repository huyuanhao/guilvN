package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LliLiLl  reason: case insensitive filesystem */
public class C5794LliLiLl extends AbstractC5738Lil {
    public C6413ili OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f16732OooO00o;

    public C5794LliLiLl(I11li1 i11li1) {
        if (i11li1.size() == 1 || i11li1.size() == 2) {
            this.OooO00o = C6413ili.OooO00o(i11li1.OooO00o(0));
            if (i11li1.size() > 1) {
                this.f16732OooO00o = AbstractC6804llL1ii.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(1), true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Sequence has incorrect number of elements");
    }

    public C5794LliLiLl(C6413ili r1, AbstractC6804llL1ii r2) {
        if (r1 != null) {
            this.OooO00o = r1;
            this.f16732OooO00o = r2;
            return;
        }
        throw new IllegalArgumentException("Ephemeral public key cannot be null");
    }

    public static C5794LliLiLl OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C5794LliLiLl OooO00o(Object obj) {
        if (obj instanceof C5794LliLiLl) {
            return (C5794LliLiLl) obj;
        }
        if (obj != null) {
            return new C5794LliLiLl(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6413ili OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m16397OooO00o() {
        return this.f16732OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        if (this.f16732OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.f16732OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
