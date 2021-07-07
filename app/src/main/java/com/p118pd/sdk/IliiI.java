package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.IliiI */
public class IliiI extends AbstractC5738Lil {
    public C9623il OooO00o;
    public C9623il OooO0O0;

    public IliiI(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) OooO00o2.nextElement();
            if (r0.OooO00o() == 0) {
                this.OooO00o = C9623il.OooO00o(r0, false);
            } else if (r0.OooO00o() == 1) {
                this.OooO0O0 = C9623il.OooO00o(r0, false);
            }
        }
    }

    public static IliiI OooO00o(Object obj) {
        if (obj instanceof IliiI) {
            return (IliiI) obj;
        }
        if (obj != null) {
            return new IliiI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C9623il OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.OooO00o));
        }
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.OooO0O0));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C9623il m15696OooO0O0() {
        return this.OooO00o;
    }
}
