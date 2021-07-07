package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LLIIllII */
public class LLIIllII extends AbstractC5738Lil {
    public II1LL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5414IiLi f16414OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f16415OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f16416OooO00o;

    public LLIIllII(I11li1 i11li1) {
        AbstractC6854lLi1LL r4;
        this.f16415OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = II1LL.OooO00o(i11li1.OooO00o(1));
        if (i11li1.size() >= 3) {
            if (i11li1.size() == 3) {
                r4 = i11li1.OooO00o(2);
                if (!(r4 instanceof AbstractC6804llL1ii)) {
                    this.f16414OooO00o = C5414IiLi.OooO00o(r4);
                    return;
                }
            } else {
                this.f16414OooO00o = C5414IiLi.OooO00o(i11li1.OooO00o(2));
                r4 = i11li1.OooO00o(3);
            }
            this.f16416OooO00o = AbstractC6804llL1ii.OooO00o(r4);
        }
    }

    public LLIIllII(C6513lIiI r2, II1LL r3) {
        this(r2, r3, null, null);
    }

    public LLIIllII(C6513lIiI r1, II1LL r2, C5414IiLi r3, AbstractC6804llL1ii r4) {
        if (r1 == null) {
            throw new IllegalArgumentException("'certReqId' cannot be null");
        } else if (r2 != null) {
            this.f16415OooO00o = r1;
            this.OooO00o = r2;
            this.f16414OooO00o = r3;
            this.f16416OooO00o = r4;
        } else {
            throw new IllegalArgumentException("'status' cannot be null");
        }
    }

    public static LLIIllII OooO00o(Object obj) {
        if (obj instanceof LLIIllII) {
            return (LLIIllII) obj;
        }
        if (obj != null) {
            return new LLIIllII(I11li1.OooO00o(obj));
        }
        return null;
    }

    public II1LL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5414IiLi m16190OooO00o() {
        return this.f16414OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m16191OooO00o() {
        return this.f16415OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16415OooO00o);
        r0.OooO00o(this.OooO00o);
        C5414IiLi r1 = this.f16414OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        AbstractC6804llL1ii r12 = this.f16416OooO00o;
        if (r12 != null) {
            r0.OooO00o(r12);
        }
        return new C5707LiL1(r0);
    }
}
