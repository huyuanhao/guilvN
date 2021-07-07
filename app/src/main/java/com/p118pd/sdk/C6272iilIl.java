package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iilI丨l丨  reason: invalid class name and case insensitive filesystem */
public class C6272iilIl extends AbstractC5738Lil {
    public I11li1 OooO00o;
    public I11li1 OooO0O0;

    public C6272iilIl(I11li1 i11li1) {
        if (i11li1.size() < 1 || i11li1.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() > 1) {
            this.OooO0O0 = I11li1.OooO00o(i11li1.OooO00o(1));
        }
    }

    public C6272iilIl(C6172iLLlI illli) {
        this.OooO00o = new C5707LiL1(illli);
    }

    public C6272iilIl(C6172iLLlI[] illliArr) {
        iILLL1 r0 = new iILLL1();
        for (C6172iLLlI illli : illliArr) {
            r0.OooO00o(illli);
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public C6272iilIl(C6172iLLlI[] illliArr, C9879iI[] r6) {
        iILLL1 r0 = new iILLL1();
        for (C6172iLLlI illli : illliArr) {
            r0.OooO00o(illli);
        }
        this.OooO00o = new C5707LiL1(r0);
        if (r6 != null) {
            iILLL1 r5 = new iILLL1();
            for (C9879iI r02 : r6) {
                r5.OooO00o(r02);
            }
            this.OooO0O0 = new C5707LiL1(r5);
        }
    }

    public static C6272iilIl OooO00o(Object obj) {
        if (obj == null || (obj instanceof C6272iilIl)) {
            return (C6272iilIl) obj;
        }
        if (obj instanceof I11li1) {
            return new C6272iilIl((I11li1) obj);
        }
        return null;
    }

    public C6172iLLlI[] OooO00o() {
        C6172iLLlI[] illliArr = new C6172iLLlI[this.OooO00o.size()];
        for (int i = 0; i != this.OooO00o.size(); i++) {
            illliArr[i] = C6172iLLlI.OooO00o(this.OooO00o.OooO00o(i));
        }
        return illliArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9879iI[] m17300OooO00o() {
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
