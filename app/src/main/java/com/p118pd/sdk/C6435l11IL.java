package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l11IL  reason: case insensitive filesystem */
public class C6435l11IL extends AbstractC5738Lil {
    public iIilII1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f18245OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9509Lii f18246OooO00o;

    public C6435l11IL(I11li1 i11li1) {
        int i = 0;
        if (i11li1.OooO00o(0) instanceof AbstractC5903LlLLL) {
            AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) i11li1.OooO00o(0);
            if (r0.OooO00o() == 0) {
                this.f18246OooO00o = C9509Lii.OooO00o(r0.OooO0o());
                i = 1;
            } else {
                throw new IllegalArgumentException("Unknown POPOSigningKeyInput tag: " + r0.OooO00o());
            }
        }
        this.f18245OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(i));
        this.OooO00o = iIilII1.OooO00o(i11li1.OooO00o(i + 1));
    }

    public C6435l11IL(C9509Lii r1, C6456l1ilL r2, iIilII1 iiilii1) {
        this.f18246OooO00o = r1;
        this.f18245OooO00o = r2;
        this.OooO00o = iiilii1;
    }

    public static C6435l11IL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6435l11IL OooO00o(Object obj) {
        if (obj instanceof C6435l11IL) {
            return (C6435l11IL) obj;
        }
        if (obj != null) {
            return new C6435l11IL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public iIilII1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17548OooO00o() {
        return this.f18245OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9509Lii m17549OooO00o() {
        return this.f18246OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.f18246OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.f18246OooO00o));
        }
        r0.OooO00o(this.f18245OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
