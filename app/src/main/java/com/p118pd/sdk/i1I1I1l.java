package com.p118pd.sdk;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.i丨1I1I1l  reason: invalid class name */
public class i1I1I1l extends I11L {
    public int o00oO0O = -1;

    public i1I1I1l() {
    }

    public i1I1I1l(iILLL1 r2) {
        super(r2, true);
    }

    public i1I1I1l(iILLL1 r1, boolean z) {
        super(r1, z);
    }

    public i1I1I1l(AbstractC6854lLi1LL r1) {
        super(r1);
    }

    public i1I1I1l(AbstractC6854lLi1LL[] r2) {
        super(r2, true);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    private int OooO0OO() throws IOException {
        if (this.o00oO0O < 0) {
            int i = 0;
            Enumeration OooO00o = m15215OooO00o();
            while (OooO00o.hasMoreElements()) {
                i += ((AbstractC6854lLi1LL) OooO00o.nextElement()).OooO0O0().OooO0Oo().OooO0O0();
            }
            this.o00oO0O = i;
        }
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.I11L
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        C6103iIi1 OooO00o = iii1.OooO00o();
        int OooO0OO = OooO0OO();
        iii1.OooO00o(49);
        iii1.OooO0O0(OooO0OO);
        Enumeration OooO00o2 = m15215OooO00o();
        while (OooO00o2.hasMoreElements()) {
            OooO00o.OooO00o((AbstractC6854lLi1LL) OooO00o2.nextElement());
        }
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() throws IOException {
        int OooO0OO = OooO0OO();
        return L1li1.OooO00o(OooO0OO) + 1 + OooO0OO;
    }
}
