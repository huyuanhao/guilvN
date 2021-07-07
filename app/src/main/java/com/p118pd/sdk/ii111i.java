package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨ii丨111i  reason: invalid class name */
public class ii111i extends AbstractC5738Lil {
    public iI11IL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9502Li f23205OooO00o;

    public ii111i(I11li1 i11li1) {
        this.f23205OooO00o = C9502Li.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() > 1) {
            this.OooO00o = iI11IL.OooO00o(i11li1.OooO00o(1));
        }
    }

    public ii111i(C9502Li r1) {
        this.f23205OooO00o = r1;
    }

    public ii111i(C9502Li r1, iI11IL r2) {
        this.f23205OooO00o = r1;
        this.OooO00o = r2;
    }

    public ii111i(C9502Li r1, C9431I r2) {
        this.f23205OooO00o = r1;
        this.OooO00o = iI11IL.OooO00o(r2.OooO0O0());
    }

    public static ii111i OooO00o(Object obj) {
        if (obj instanceof ii111i) {
            return (ii111i) obj;
        }
        if (obj != null) {
            return new ii111i(I11li1.OooO00o(obj));
        }
        return null;
    }

    public iI11IL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9502Li m21681OooO00o() {
        return this.f23205OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f23205OooO00o);
        iI11IL r1 = this.OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }
}
