package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.III */
public class III extends AbstractC5738Lil {
    public C5497I1L[] OooO00o;

    public III(I11li1 i11li1) {
        this.OooO00o = new C5497I1L[i11li1.size()];
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        int i = 0;
        while (OooO00o2.hasMoreElements()) {
            this.OooO00o[i] = C5497I1L.OooO00o(OooO00o2.nextElement());
            i++;
        }
    }

    public III(C5497I1L r3) {
        C5497I1L[] r0 = new C5497I1L[1];
        this.OooO00o = r0;
        r0[0] = r3;
    }

    public III(C5497I1L[] r1) {
        this.OooO00o = r1;
    }

    public static III OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static III OooO00o(Object obj) {
        if (obj instanceof III) {
            return (III) obj;
        }
        if (obj != null) {
            return new III(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5497I1L[] OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        int i = 0;
        while (true) {
            C5497I1L[] r2 = this.OooO00o;
            if (i == r2.length) {
                return new C5707LiL1(r0);
            }
            r0.OooO00o(r2[i]);
            i++;
        }
    }
}
