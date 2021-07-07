package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lLI丨Li  reason: invalid class name and case insensitive filesystem */
public final class C6578lLILi {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6436l11LI f18495OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9486LL1iI1L f18496OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;
    public final int OooO0o0;

    public C6578lLILi(AbstractC6436l11LI r5) {
        if (r5 != null) {
            this.f18495OooO00o = r5;
            int OooO00o2 = C5532IiIllL.OooO00o(r5);
            this.OooO00o = OooO00o2;
            this.OooO0O0 = 16;
            double d = (double) (OooO00o2 * 8);
            double OooO00o3 = (double) C5532IiIllL.OooO00o(16);
            Double.isNaN(d);
            Double.isNaN(OooO00o3);
            int ceil = (int) Math.ceil(d / OooO00o3);
            this.OooO0Oo = ceil;
            int floor = ((int) Math.floor((double) (C5532IiIllL.OooO00o(ceil * (this.OooO0O0 - 1)) / C5532IiIllL.OooO00o(this.OooO0O0)))) + 1;
            this.OooO0o0 = floor;
            this.OooO0OO = this.OooO0Oo + floor;
            C9546LI11 OooO00o4 = C9546LI11.OooO00o(r5.OooO00o(), this.OooO00o, this.OooO0O0, this.OooO0OO);
            this.f18496OooO00o = OooO00o4;
            if (OooO00o4 == null) {
                throw new IllegalArgumentException("cannot find OID for digest algorithm: " + r5.OooO00o());
            }
            return;
        }
        throw new NullPointerException("digest == null");
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6436l11LI m17679OooO00o() {
        return this.f18495OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9486LL1iI1L m17680OooO00o() {
        return this.f18496OooO00o;
    }

    public int OooO0O0() {
        return this.OooO0OO;
    }

    public int OooO0OO() {
        return this.OooO0Oo;
    }

    public int OooO0Oo() {
        return this.OooO0o0;
    }

    public int OooO0o0() {
        return this.OooO0O0;
    }
}
