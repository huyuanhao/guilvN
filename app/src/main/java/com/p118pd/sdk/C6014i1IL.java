package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i1IL  reason: case insensitive filesystem */
public class C6014i1IL extends AbstractC5738Lil {
    public C6513lIiI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f17349OooO00o;

    public C6014i1IL(I11li1 i11li1) {
        this.f17349OooO00o = (AbstractC6804llL1ii) i11li1.OooO00o(0);
        this.OooO00o = (C6513lIiI) i11li1.OooO00o(1);
    }

    public C6014i1IL(byte[] bArr, int i) {
        this.f17349OooO00o = new C6487lIIiIlL(C9586iIILl.m21630OooO00o(bArr));
        this.OooO00o = new C6513lIiI((long) i);
    }

    public static C6014i1IL OooO00o(Object obj) {
        if (obj instanceof C6014i1IL) {
            return (C6014i1IL) obj;
        }
        if (obj != null) {
            return new C6014i1IL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public byte[] OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f17349OooO00o.m17938OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.OooO00o.m17647OooO0O0().intValue();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16858OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f17349OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
