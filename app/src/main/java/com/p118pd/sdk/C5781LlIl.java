package com.p118pd.sdk;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.LlIl丨  reason: invalid class name and case insensitive filesystem */
public class C5781LlIl extends I11L {
    public C5781LlIl() {
    }

    public C5781LlIl(iILLL1 r2) {
        super(r2, false);
    }

    public C5781LlIl(AbstractC6854lLi1LL r1) {
        super(r1);
    }

    public C5781LlIl(AbstractC6854lLi1LL[] r2) {
        super(r2, false);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.I11L
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        iii1.OooO00o(49);
        iii1.OooO00o(128);
        Enumeration OooO00o = m15215OooO00o();
        while (OooO00o.hasMoreElements()) {
            iii1.OooO00o((AbstractC6854lLi1LL) OooO00o.nextElement());
        }
        iii1.OooO00o(0);
        iii1.OooO00o(0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() throws IOException {
        Enumeration OooO00o = m15215OooO00o();
        int i = 0;
        while (OooO00o.hasMoreElements()) {
            i += ((AbstractC6854lLi1LL) OooO00o.nextElement()).OooO0O0().OooO0O0();
        }
        return i + 2 + 2;
    }
}
