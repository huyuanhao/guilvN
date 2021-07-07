package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨丨IiiLLI  reason: invalid class name and case insensitive filesystem */
public class C9761IiiLLI extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public C9761IiiLLI(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public C9761IiiLLI(IIl1LLl r2) {
        this.OooO00o = new C5707LiL1(r2);
    }

    public C9761IiiLLI(C5620LII[] r2) {
        this(new IIl1LLl(r2));
    }

    public static C9761IiiLLI OooO00o(Object obj) {
        if (obj instanceof C9761IiiLLI) {
            return (C9761IiiLLI) obj;
        }
        if (obj != null) {
            return new C9761IiiLLI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public IIl1LLl[] OooO00o() {
        IIl1LLl[] r0 = new IIl1LLl[this.OooO00o.size()];
        Enumeration OooO00o2 = this.OooO00o.m15236OooO00o();
        int i = 0;
        while (OooO00o2.hasMoreElements()) {
            r0[i] = IIl1LLl.OooO00o(OooO00o2.nextElement());
            i++;
        }
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
