package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨Lii  reason: invalid class name and case insensitive filesystem */
public class C9509Lii extends AbstractC5738Lil {
    public ILI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5562Ill f23086OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6888ll f23087OooO00o;

    public C9509Lii(I11li1 i11li1) {
        AbstractC6854lLi1LL OooO00o2 = i11li1.OooO00o(0);
        if (OooO00o2 instanceof AbstractC5903LlLLL) {
            AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) OooO00o2;
            if (r0.OooO00o() == 0) {
                this.OooO00o = ILI.OooO00o(r0.OooO0o());
            } else {
                throw new IllegalArgumentException("Unknown authInfo tag: " + r0.OooO00o());
            }
        } else {
            this.f23086OooO00o = C5562Ill.OooO00o(OooO00o2);
        }
        this.f23087OooO00o = C6888ll.OooO00o(i11li1.OooO00o(1));
    }

    public C9509Lii(ILI ili, C6888ll r2) {
        this.OooO00o = ili;
        this.f23087OooO00o = r2;
    }

    public C9509Lii(C5562Ill r1, C6888ll r2) {
        this.f23086OooO00o = r1;
        this.f23087OooO00o = r2;
    }

    public static C9509Lii OooO00o(Object obj) {
        if (obj instanceof C9509Lii) {
            return (C9509Lii) obj;
        }
        if (obj != null) {
            return new C9509Lii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public ILI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5562Ill m21572OooO00o() {
        return this.f23086OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6888ll m21573OooO00o() {
        return this.f23087OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o != null ? new ILI1Ll(false, 0, this.OooO00o) : this.f23086OooO00o);
        r0.OooO00o(this.f23087OooO00o);
        return new C5707LiL1(r0);
    }
}
