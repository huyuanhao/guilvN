package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨1ILLL1  reason: invalid class name */
public class C1ILLL1 extends AbstractC5738Lil {
    public I11L OooO00o;
    public I11L OooO0O0;

    public C1ILLL1(I11L i11l, I11L i11l2) {
        this.OooO00o = i11l;
        this.OooO0O0 = i11l2;
    }

    public C1ILLL1(I11li1 i11li1) {
        AbstractC5903LlLLL r5;
        int size = i11li1.size();
        if (size != 0) {
            if (size == 1) {
                r5 = (AbstractC5903LlLLL) i11li1.OooO00o(0);
                int OooO00o2 = r5.OooO00o();
                if (OooO00o2 == 0) {
                    this.OooO00o = I11L.OooO00o(r5, false);
                    return;
                } else if (OooO00o2 != 1) {
                    throw new IllegalArgumentException("Bad tag in OriginatorInfo: " + r5.OooO00o());
                }
            } else if (size == 2) {
                this.OooO00o = I11L.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(0), false);
                r5 = (AbstractC5903LlLLL) i11li1.OooO00o(1);
            } else {
                throw new IllegalArgumentException("OriginatorInfo too big");
            }
            this.OooO0O0 = I11L.OooO00o(r5, false);
        }
    }

    public static C1ILLL1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C1ILLL1 OooO00o(Object obj) {
        if (obj instanceof C1ILLL1) {
            return (C1ILLL1) obj;
        }
        if (obj != null) {
            return new C1ILLL1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11L OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public I11L OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m21271OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.OooO00o));
        }
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.OooO0O0));
        }
        return new C5707LiL1(r0);
    }
}
