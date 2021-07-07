package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.I丨1丨丨丨ii  reason: invalid class name and case insensitive filesystem */
public class C5501I1ii extends AbstractC5738Lil {
    public I11li1 OooO00o;
    public I11li1 OooO0O0;
    public I11li1 OooO0OO;

    public C5501I1ii(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.OooO00o = I11li1.OooO00o(OooO00o2.nextElement());
        while (OooO00o2.hasMoreElements()) {
            AbstractC5903LlLLL OooO00o3 = AbstractC5903LlLLL.OooO00o(OooO00o2.nextElement());
            int OooO00o4 = OooO00o3.OooO00o();
            I11li1 OooO00o5 = I11li1.OooO00o(OooO00o3, true);
            if (OooO00o4 == 0) {
                this.OooO0O0 = OooO00o5;
            } else {
                this.OooO0OO = OooO00o5;
            }
        }
    }

    public static C5501I1ii OooO00o(Object obj) {
        if (obj instanceof C5501I1ii) {
            return (C5501I1ii) obj;
        }
        if (obj != null) {
            return new C5501I1ii(I11li1.OooO00o(obj));
        }
        return null;
    }

    private void OooO00o(iILLL1 r3, int i, AbstractC6854lLi1LL r5) {
        if (r5 != null) {
            r3.OooO00o(new ILI1Ll(true, i, r5));
        }
    }

    public C5190I1lIiL[] OooO00o() {
        I11li1 i11li1 = this.OooO0OO;
        if (i11li1 == null) {
            return null;
        }
        int size = i11li1.size();
        C5190I1lIiL[] r1 = new C5190I1lIiL[size];
        for (int i = 0; i != size; i++) {
            r1[i] = C5190I1lIiL.OooO00o(this.OooO0OO.OooO00o(i));
        }
        return r1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public II1LL[] m15750OooO00o() {
        int size = this.OooO00o.size();
        II1LL[] r1 = new II1LL[size];
        for (int i = 0; i != size; i++) {
            r1[i] = II1LL.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public i1IlIiLI[] m15751OooO00o() {
        I11li1 i11li1 = this.OooO0O0;
        if (i11li1 == null) {
            return null;
        }
        int size = i11li1.size();
        i1IlIiLI[] i1iliiliArr = new i1IlIiLI[size];
        for (int i = 0; i != size; i++) {
            i1iliiliArr[i] = i1IlIiLI.OooO00o(this.OooO0O0.OooO00o(i));
        }
        return i1iliiliArr;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        OooO00o(r0, 0, this.OooO0O0);
        OooO00o(r0, 1, this.OooO0OO);
        return new C5707LiL1(r0);
    }
}
