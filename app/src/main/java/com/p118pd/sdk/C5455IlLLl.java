package com.p118pd.sdk;

/* renamed from: com.pd.sdk.IlL丨Ll  reason: invalid class name and case insensitive filesystem */
public class C5455IlLLl extends AbstractC5738Lil {
    public final C9502Li OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9592iIIi1 f15847OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9863l1L f15848OooO00o;
    public final boolean OooO0O0;

    public C5455IlLLl(I11li1 i11li1) {
        AbstractC6854lLi1LL r6;
        if (i11li1.size() == 4 || i11li1.size() == 3) {
            this.f15848OooO00o = C9863l1L.OooO00o(i11li1.OooO00o(0));
            this.f15847OooO00o = C9592iIIi1.OooO00o(i11li1.OooO00o(1));
            if (i11li1.size() == 4) {
                this.OooO0O0 = C5514IL.OooO00o(i11li1.OooO00o(2)).m15792OooO0O0();
                r6 = i11li1.OooO00o(3);
            } else {
                this.OooO0O0 = true;
                r6 = i11li1.OooO00o(2);
            }
            this.OooO00o = C9502Li.OooO00o(r6);
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public C5455IlLLl(C9863l1L r1, C9592iIIi1 r2, boolean z, C9502Li r4) {
        this.f15848OooO00o = r1;
        this.f15847OooO00o = r2;
        this.OooO0O0 = z;
        this.OooO00o = r4;
    }

    public static C5455IlLLl OooO00o(Object obj) {
        if (obj instanceof C5455IlLLl) {
            return (C5455IlLLl) obj;
        }
        if (obj != null) {
            return new C5455IlLLl(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C9502Li OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9592iIIi1 m15678OooO00o() {
        return this.f15847OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9863l1L m15679OooO00o() {
        return this.f15848OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15680OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f15848OooO00o);
        r0.OooO00o(this.f15847OooO00o);
        boolean z = this.OooO0O0;
        if (!z) {
            r0.OooO00o(C5514IL.OooO00o(z));
        }
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
