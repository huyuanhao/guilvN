package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨丨I11  reason: invalid class name and case insensitive filesystem */
public class C9752I11 extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public C9752I11(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            if (!(OooO00o2.nextElement() instanceof LII)) {
                throw new IllegalArgumentException("attempt to insert non UTF8 STRING into PKIFreeText");
            }
        }
        this.OooO00o = i11li1;
    }

    public C9752I11(LII lii) {
        this.OooO00o = new C5707LiL1(lii);
    }

    public C9752I11(String str) {
        this(new LII(str));
    }

    public C9752I11(LII[] liiArr) {
        this.OooO00o = new C5707LiL1(liiArr);
    }

    public C9752I11(String[] strArr) {
        iILLL1 r0 = new iILLL1();
        for (String str : strArr) {
            r0.OooO00o(new LII(str));
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public static C9752I11 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C9752I11 OooO00o(Object obj) {
        if (obj instanceof C9752I11) {
            return (C9752I11) obj;
        }
        if (obj != null) {
            return new C9752I11(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LII OooO00o(int i) {
        return (LII) this.OooO00o.OooO00o(i);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }

    public int size() {
        return this.OooO00o.size();
    }
}
