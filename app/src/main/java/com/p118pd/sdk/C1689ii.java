package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ii */
public class C1689ii extends AbstractC5738Lil {
    public C6513lIiI[] OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9752I11[] f17832OooO00o;
    public C6513lIiI[] OooO0O0;

    public C1689ii(I11li1 i11li1) {
        this.OooO00o = new C6513lIiI[i11li1.size()];
        this.OooO0O0 = new C6513lIiI[i11li1.size()];
        this.f17832OooO00o = new C9752I11[i11li1.size()];
        for (int i = 0; i != i11li1.size(); i++) {
            I11li1 OooO00o2 = I11li1.OooO00o(i11li1.OooO00o(i));
            this.OooO00o[i] = C6513lIiI.OooO00o(OooO00o2.OooO00o(0));
            this.OooO0O0[i] = C6513lIiI.OooO00o(OooO00o2.OooO00o(1));
            if (OooO00o2.size() > 2) {
                this.f17832OooO00o[i] = C9752I11.OooO00o(OooO00o2.OooO00o(2));
            }
        }
    }

    public C1689ii(C6513lIiI r2, C6513lIiI r3) {
        this(r2, r3, null);
    }

    public C1689ii(C6513lIiI r5, C6513lIiI r6, C9752I11 r7) {
        C6513lIiI[] r1 = new C6513lIiI[1];
        this.OooO00o = r1;
        C6513lIiI[] r2 = new C6513lIiI[1];
        this.OooO0O0 = r2;
        C9752I11[] r0 = new C9752I11[1];
        this.f17832OooO00o = r0;
        r1[0] = r5;
        r2[0] = r6;
        r0[0] = r7;
    }

    public static C1689ii OooO00o(Object obj) {
        if (obj instanceof C1689ii) {
            return (C1689ii) obj;
        }
        if (obj != null) {
            return new C1689ii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6513lIiI OooO00o(int i) {
        return this.OooO00o[i];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9752I11 m17207OooO00o(int i) {
        return this.f17832OooO00o[i];
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        for (int i = 0; i != this.OooO00o.length; i++) {
            iILLL1 r2 = new iILLL1();
            r2.OooO00o(this.OooO00o[i]);
            r2.OooO00o(this.OooO0O0[i]);
            C9752I11[] r3 = this.f17832OooO00o;
            if (r3[i] != null) {
                r2.OooO00o(r3[i]);
            }
            r0.OooO00o(new C5707LiL1(r2));
        }
        return new C5707LiL1(r0);
    }

    public C6513lIiI OooO0O0(int i) {
        return this.OooO0O0[i];
    }

    public int size() {
        return this.OooO00o.length;
    }
}
