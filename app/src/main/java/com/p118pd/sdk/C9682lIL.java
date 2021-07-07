package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨lIL丨  reason: invalid class name and case insensitive filesystem */
public class C9682lIL extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L1iI1 f23288OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6888ll f23289OooO00o;

    public C9682lIL(I11li1 i11li1) {
        this.OooO00o = i11li1;
        this.f23289OooO00o = C6888ll.OooO00o(i11li1.OooO00o(0));
        this.f23288OooO00o = L1iI1.OooO00o(i11li1.OooO00o(1));
    }

    public static C9682lIL OooO00o(Object obj) {
        if (obj instanceof C9682lIL) {
            return (C9682lIL) obj;
        }
        if (obj != null) {
            return new C9682lIL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public L1iI1 OooO00o() {
        return this.f23288OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6888ll m21727OooO00o() {
        return this.f23289OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
