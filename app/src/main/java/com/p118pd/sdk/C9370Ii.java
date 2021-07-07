package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨Ii  reason: invalid class name and case insensitive filesystem */
public class C9370Ii extends AbstractC5738Lil {
    public C5872LilIi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iIilII1 f22914OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f22915OooO00o;

    public C9370Ii(I11li1 i11li1) {
        if (i11li1.size() == 3) {
            this.OooO00o = C5872LilIi.OooO00o(i11li1.OooO00o(0));
            this.f22915OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
            this.f22914OooO00o = iIilII1.OooO00o(i11li1.OooO00o(2));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C9370Ii(C5872LilIi r1, C6456l1ilL r2, iIilII1 iiilii1) {
        this.OooO00o = r1;
        this.f22915OooO00o = r2;
        this.f22914OooO00o = iiilii1;
    }

    public static C9370Ii OooO00o(Object obj) {
        if (obj instanceof C9370Ii) {
            return (C9370Ii) obj;
        }
        if (obj != null) {
            return new C9370Ii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5872LilIi OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iIilII1 m21437OooO00o() {
        return this.f22914OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m21438OooO00o() {
        return this.f22915OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f22915OooO00o);
        r0.OooO00o(this.f22914OooO00o);
        return new C5707LiL1(r0);
    }
}
