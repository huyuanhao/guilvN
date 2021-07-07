package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨li  reason: invalid class name and case insensitive filesystem */
public class C9697li extends AbstractC5738Lil {
    public C6731ll1i OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f23319OooO00o;

    public C9697li(I11li1 i11li1) {
        this.OooO00o = C6731ll1i.OooO00o(i11li1.OooO00o(0));
        this.f23319OooO00o = (AbstractC6804llL1ii) i11li1.OooO00o(1);
    }

    public C9697li(C6731ll1i ll1i, AbstractC6804llL1ii r2) {
        this.OooO00o = ll1i;
        this.f23319OooO00o = r2;
    }

    public static C9697li OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C9697li OooO00o(Object obj) {
        if (obj instanceof C9697li) {
            return (C9697li) obj;
        }
        if (obj != null) {
            return new C9697li(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6731ll1i OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m21732OooO00o() {
        return this.f23319OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f23319OooO00o);
        return new C5707LiL1(r0);
    }
}
