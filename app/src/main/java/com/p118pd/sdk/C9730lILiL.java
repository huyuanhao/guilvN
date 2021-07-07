package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨l丨ILiL  reason: invalid class name and case insensitive filesystem */
public class C9730lILiL extends AbstractC5738Lil {
    public C6513lIiI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public liliiL1 f23362OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9502Li f23363OooO00o;

    public C9730lILiL(int i, C9502Li r5, liliiL1 liliil1) {
        this(new C6513lIiI((long) i), r5, liliil1);
    }

    public C9730lILiL(I11li1 i11li1) {
        this.OooO00o = new C6513lIiI(C6513lIiI.OooO00o(i11li1.OooO00o(0)).m17647OooO0O0());
        this.f23363OooO00o = C9502Li.OooO00o(i11li1.OooO00o(1));
        if (i11li1.size() > 2) {
            this.f23362OooO00o = liliiL1.OooO00o(i11li1.OooO00o(2));
        }
    }

    public C9730lILiL(C6513lIiI r1, C9502Li r2, liliiL1 liliil1) {
        this.OooO00o = r1;
        this.f23363OooO00o = r2;
        this.f23362OooO00o = liliil1;
    }

    public static C9730lILiL OooO00o(Object obj) {
        if (obj instanceof C9730lILiL) {
            return (C9730lILiL) obj;
        }
        if (obj != null) {
            return new C9730lILiL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6513lIiI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public liliiL1 m21783OooO00o() {
        return this.f23362OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9502Li m21784OooO00o() {
        return this.f23363OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f23363OooO00o);
        liliiL1 liliil1 = this.f23362OooO00o;
        if (liliil1 != null) {
            r0.OooO00o(liliil1);
        }
        return new C5707LiL1(r0);
    }
}
