package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨1II1L  reason: invalid class name */
public class C1II1L extends AbstractC5738Lil {
    public final I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9682lIL f22752OooO00o;

    public C1II1L(I11li1 i11li1) {
        this.OooO00o = i11li1;
        this.f22752OooO00o = C9682lIL.OooO00o(i11li1.OooO00o(0));
    }

    public static C1II1L OooO00o(Object obj) {
        if (obj instanceof C1II1L) {
            return (C1II1L) obj;
        }
        if (obj != null) {
            return new C1II1L(I11li1.OooO00o(obj));
        }
        return null;
    }

    public iIilII1 OooO00o() {
        return iIilII1.OooO00o(this.OooO00o.OooO00o(2));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m21264OooO00o() {
        return C6456l1ilL.OooO00o(this.OooO00o.OooO00o(1));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9682lIL m21265OooO00o() {
        return this.f22752OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
