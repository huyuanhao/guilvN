package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.II丨l1LLl  reason: invalid class name */
public class IIl1LLl extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public IIl1LLl(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public IIl1LLl(C5620LII[] r2) {
        this.OooO00o = new C5707LiL1(r2);
    }

    public static IIl1LLl OooO00o(Object obj) {
        if (obj instanceof IIl1LLl) {
            return (IIl1LLl) obj;
        }
        if (obj != null) {
            return new IIl1LLl(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5620LII[] OooO00o() {
        C5620LII[] r0 = new C5620LII[this.OooO00o.size()];
        Enumeration OooO00o2 = this.OooO00o.m15236OooO00o();
        int i = 0;
        while (OooO00o2.hasMoreElements()) {
            r0[i] = C5620LII.OooO00o(OooO00o2.nextElement());
            i++;
        }
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
