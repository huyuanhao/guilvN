package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iIli  reason: case insensitive filesystem */
public class C6124iIli {
    public iILLL1 OooO00o = new iILLL1();
    public iILLL1 OooO0O0 = new iILLL1();
    public iILLL1 OooO0OO = new iILLL1();

    public C5501I1ii OooO00o() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C5707LiL1(this.OooO00o));
        if (this.OooO0O0.OooO00o() != 0) {
            r0.OooO00o(new ILI1Ll(true, 0, new C5707LiL1(this.OooO0O0)));
        }
        if (this.OooO0OO.OooO00o() != 0) {
            r0.OooO00o(new ILI1Ll(true, 1, new C5707LiL1(this.OooO0OO)));
        }
        return C5501I1ii.OooO00o(new C5707LiL1(r0));
    }

    public C6124iIli OooO00o(C5190I1lIiL r2) {
        this.OooO0OO.OooO00o(r2);
        return this;
    }

    public C6124iIli OooO00o(II1LL r2) {
        this.OooO00o.OooO00o(r2);
        return this;
    }

    public C6124iIli OooO00o(II1LL r3, i1IlIiLI i1iliili) {
        if (this.OooO00o.OooO00o() == this.OooO0O0.OooO00o()) {
            this.OooO00o.OooO00o(r3);
            this.OooO0O0.OooO00o(i1iliili);
            return this;
        }
        throw new IllegalStateException("status and revCerts sequence must be in common order");
    }
}
