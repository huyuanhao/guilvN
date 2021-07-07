package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iL1丨1ll  reason: invalid class name and case insensitive filesystem */
public class C6155iL11ll extends AbstractC5738Lil {
    public final C5360IiL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5753LiI1 f17688OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6456l1ilL f17689OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f17690OooO00o;
    public final C6456l1ilL OooO0O0;

    public C6155iL11ll(I11li1 i11li1) {
        if (i11li1.size() == 5) {
            this.OooO00o = C5360IiL.OooO00o(i11li1.OooO00o(0));
            this.f17688OooO00o = C5753LiI1.OooO00o(i11li1.OooO00o(1));
            this.f17689OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(2));
            this.OooO0O0 = C6456l1ilL.OooO00o(i11li1.OooO00o(3));
            this.f17690OooO00o = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(4)).m17938OooO00o());
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public C6155iL11ll(C5360IiL r1, C5753LiI1 r2, C6456l1ilL r3, C6456l1ilL r4, byte[] bArr) {
        this.OooO00o = r1;
        this.f17688OooO00o = r2;
        this.f17689OooO00o = r3;
        this.OooO0O0 = r4;
        this.f17690OooO00o = C9586iIILl.m21630OooO00o(bArr);
    }

    public static C6155iL11ll OooO00o(Object obj) {
        if (obj instanceof C6155iL11ll) {
            return (C6155iL11ll) obj;
        }
        if (obj != null) {
            return new C6155iL11ll(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5360IiL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5753LiI1 m17080OooO00o() {
        return this.f17688OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17081OooO00o() {
        return this.f17689OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17082OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f17690OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f17688OooO00o);
        r0.OooO00o(this.f17689OooO00o);
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(new C6487lIIiIlL(this.f17690OooO00o));
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m17083OooO0O0() {
        return this.OooO0O0;
    }
}
