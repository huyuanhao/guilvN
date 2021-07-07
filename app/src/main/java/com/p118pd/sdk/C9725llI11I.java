package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨ll丨I11I  reason: invalid class name and case insensitive filesystem */
public class C9725llI11I extends AbstractC5738Lil {
    public final C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6804llL1ii f23357OooO00o;

    public C9725llI11I(I11li1 i11li1) {
        this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
        this.f23357OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(1));
    }

    public C9725llI11I(C6456l1ilL r1, byte[] bArr) {
        this.OooO00o = r1;
        this.f23357OooO00o = new C6487lIIiIlL(bArr);
    }

    public static C9725llI11I OooO00o(Object obj) {
        if (obj instanceof C9725llI11I) {
            return (C9725llI11I) obj;
        }
        if (obj != null) {
            return new C9725llI11I(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m21770OooO00o() {
        return this.f23357OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f23357OooO00o);
        return new C5707LiL1(r0);
    }
}
