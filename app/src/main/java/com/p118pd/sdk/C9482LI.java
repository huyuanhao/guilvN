package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨LI丨  reason: invalid class name and case insensitive filesystem */
public class C9482LI extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ILI f23054OooO00o;

    public C9482LI(I11li1 i11li1) {
        AbstractC6854lLi1LL r5;
        int size = i11li1.size();
        if (size == 1) {
            r5 = i11li1.OooO00o(0);
        } else if (size == 2) {
            this.f23054OooO00o = ILI.OooO00o(i11li1.OooO00o(0));
            r5 = i11li1.OooO00o(1);
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        this.OooO00o = I11li1.OooO00o(r5);
    }

    public C9482LI(ILI ili, I11li1 i11li1) {
        this.f23054OooO00o = ili;
        this.OooO00o = i11li1;
    }

    public static C9482LI OooO00o(Object obj) {
        if (obj == null || (obj instanceof C9482LI)) {
            return (C9482LI) obj;
        }
        if (obj instanceof I11li1) {
            return new C9482LI((I11li1) obj);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public ILI OooO00o() {
        return this.f23054OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5556Il[] m21536OooO00o() {
        C5556Il[] r0 = new C5556Il[this.OooO00o.size()];
        Enumeration OooO00o2 = this.OooO00o.m15236OooO00o();
        int i = 0;
        while (OooO00o2.hasMoreElements()) {
            r0[i] = C5556Il.OooO00o(OooO00o2.nextElement());
            i++;
        }
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        ILI ili = this.f23054OooO00o;
        if (ili != null) {
            r0.OooO00o(ili);
        }
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
