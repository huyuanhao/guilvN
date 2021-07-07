package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Hashtable;

/* renamed from: com.pd.sdk.iI1I丨LL丨  reason: invalid class name and case insensitive filesystem */
public class C6076iI1ILL extends AbstractC5738Lil {
    public I11li1 OooO00o = null;

    public C6076iI1ILL(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public C6076iI1ILL(C6397iiL1 r2, C6397iiL1 r3) {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(r2);
        r0.OooO00o(r3);
        this.OooO00o = new C5707LiL1(new C5707LiL1(r0));
    }

    public C6076iI1ILL(Hashtable hashtable) {
        iILLL1 r0 = new iILLL1();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            iILLL1 r4 = new iILLL1();
            r4.OooO00o(new LlLI1(str));
            r4.OooO00o(new LlLI1((String) hashtable.get(str)));
            r0.OooO00o(new C5707LiL1(r4));
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public C6076iI1ILL(C6397iiL1[] r5, C6397iiL1[] r6) {
        iILLL1 r0 = new iILLL1();
        for (int i = 0; i != r5.length; i++) {
            iILLL1 r2 = new iILLL1();
            r2.OooO00o(r5[i]);
            r2.OooO00o(r6[i]);
            r0.OooO00o(new C5707LiL1(r2));
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public static C6076iI1ILL OooO00o(Object obj) {
        if (obj instanceof C6076iI1ILL) {
            return (C6076iI1ILL) obj;
        }
        if (obj != null) {
            return new C6076iI1ILL(I11li1.OooO00o(obj));
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
