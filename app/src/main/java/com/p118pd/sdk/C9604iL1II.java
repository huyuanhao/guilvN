package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨iL1II  reason: invalid class name and case insensitive filesystem */
public class C9604iL1II extends AbstractC5738Lil {
    public I11li1 OooO00o;
    public I11li1 OooO0O0;

    public C9604iL1II(I11li1 i11li1) {
        if (i11li1.size() < 1 || i11li1.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() > 1) {
            this.OooO0O0 = I11li1.OooO00o(i11li1.OooO00o(1));
        }
    }

    public C9604iL1II(C5239IILLi r2) {
        this.OooO00o = new C5707LiL1(r2);
    }

    public static C9604iL1II OooO00o(Object obj) {
        if (obj instanceof C9604iL1II) {
            return (C9604iL1II) obj;
        }
        if (obj != null) {
            return new C9604iL1II(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5239IILLi[] OooO00o() {
        C5239IILLi[] r0 = new C5239IILLi[this.OooO00o.size()];
        for (int i = 0; i != this.OooO00o.size(); i++) {
            r0[i] = C5239IILLi.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9879iI[] m21661OooO00o() {
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
