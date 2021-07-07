package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨iLL  reason: invalid class name and case insensitive filesystem */
public class C9606iLL extends AbstractC5738Lil {
    public I11li1 OooO00o;
    public I11li1 OooO0O0;

    public C9606iLL(I11li1 i11li1) {
        if (i11li1.size() < 1 || i11li1.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() > 1) {
            this.OooO0O0 = I11li1.OooO00o(i11li1.OooO00o(1));
        }
    }

    public C9606iLL(i1Ii11l r2) {
        this.OooO00o = new C5707LiL1(r2);
    }

    public static C9606iLL OooO00o(Object obj) {
        if (obj instanceof C9606iLL) {
            return (C9606iLL) obj;
        }
        if (obj != null) {
            return new C9606iLL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public i1Ii11l[] OooO00o() {
        i1Ii11l[] r0 = new i1Ii11l[this.OooO00o.size()];
        for (int i = 0; i != this.OooO00o.size(); i++) {
            r0[i] = i1Ii11l.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9879iI[] m21664OooO00o() {
        I11li1 i11li1 = this.OooO0O0;
        if (i11li1 == null) {
            return null;
        }
        C9879iI[] r0 = new C9879iI[i11li1.size()];
        for (int i = 0; i != this.OooO0O0.size(); i++) {
            r0[i] = C9879iI.OooO00o(this.OooO0O0.OooO00o(i));
        }
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        I11li1 i11li1 = this.OooO0O0;
        if (i11li1 != null) {
            r0.OooO00o(i11li1);
        }
        return new C5707LiL1(r0);
    }
}
