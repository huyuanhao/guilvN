package com.p118pd.sdk;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.LiL1  reason: case insensitive filesystem */
public class C5707LiL1 extends I11li1 {
    public int o00oO0O = -1;

    public C5707LiL1() {
    }

    public C5707LiL1(iILLL1 r1) {
        super(r1);
    }

    public C5707LiL1(AbstractC6854lLi1LL r1) {
        super(r1);
    }

    public C5707LiL1(AbstractC6854lLi1LL[] r1) {
        super(r1);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    private int OooO0OO() throws IOException {
        if (this.o00oO0O < 0) {
            int i = 0;
            Enumeration OooO00o = m15236OooO00o();
            while (OooO00o.hasMoreElements()) {
                i += ((AbstractC6854lLi1LL) OooO00o.nextElement()).OooO0O0().OooO0Oo().OooO0O0();
            }
            this.o00oO0O = i;
        }
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.I11li1, com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        C6103iIi1 OooO00o = iii1.OooO00o();
        int OooO0OO = OooO0OO();
        iii1.OooO00o(48);
        iii1.OooO0O0(OooO0OO);
        Enumeration OooO00o2 = m15236OooO00o();
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
