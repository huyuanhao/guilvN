package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨L */
public class C1704L extends AbstractC5738Lil {
    public final I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LII f23004OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LIlIlIL f23005OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C1682Li f23006OooO00o;

    public C1704L(I11li1 i11li1) {
        AbstractC6854lLi1LL OooO00o2;
        if (i11li1.size() < 2 || i11li1.size() > 4) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f23006OooO00o = C1682Li.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(1));
        if (i11li1.size() > 2) {
            if (i11li1.size() == 4) {
                this.f23004OooO00o = LII.OooO00o(i11li1.OooO00o(2));
                OooO00o2 = i11li1.OooO00o(3);
            } else if (i11li1.OooO00o(2) instanceof LII) {
                this.f23004OooO00o = LII.OooO00o(i11li1.OooO00o(2));
            } else {
                this.f23004OooO00o = null;
                OooO00o2 = i11li1.OooO00o(2);
            }
            this.f23005OooO00o = LIlIlIL.OooO00o(OooO00o2);
            return;
        }
        this.f23004OooO00o = null;
        this.f23005OooO00o = null;
    }

    public C1704L(C1682Li li, I11li1 i11li1, LII lii, LIlIlIL lIlIlIL) {
        this.f23006OooO00o = li;
        this.OooO00o = i11li1;
        this.f23004OooO00o = lii;
        this.f23005OooO00o = lIlIlIL;
    }

    public static C1704L OooO00o(Object obj) {
        if (obj instanceof C1704L) {
            return (C1704L) obj;
        }
        if (obj != null) {
            return new C1704L(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LII OooO00o() {
        return this.f23004OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LIlIlIL m21498OooO00o() {
        return this.f23005OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1682Li m21499OooO00o() {
        return this.f23006OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21500OooO00o() {
        return this.f23005OooO00o != null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6518lIlIl[] m21501OooO00o() {
        return LIIIiI.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f23006OooO00o);
        r0.OooO00o(this.OooO00o);
        LII lii = this.f23004OooO00o;
        if (lii != null) {
            r0.OooO00o(lii);
        }
        LIlIlIL lIlIlIL = this.f23005OooO00o;
        if (lIlIlIL != null) {
            r0.OooO00o(lIlIlIL);
        }
        return new C5707LiL1(r0);
    }
}
