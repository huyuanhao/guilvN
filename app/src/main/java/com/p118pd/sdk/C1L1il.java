package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨1L1il  reason: invalid class name */
public class C1L1il extends AbstractC5738Lil implements AbstractC5462Ilil {
    public IiLIl1I OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f22778OooO00o;

    public C1L1il(IiLIl1I iiLIl1I) {
        this.OooO00o = iiLIl1I;
    }

    public C1L1il(AbstractC6804llL1ii r1) {
        this.f22778OooO00o = r1;
    }

    public C1L1il(byte[] bArr) {
        this.f22778OooO00o = new C6487lIIiIlL(bArr);
    }

    public static C1L1il OooO00o(Object obj) {
        return obj instanceof C1L1il ? (C1L1il) obj : obj instanceof AbstractC6804llL1ii ? new C1L1il((AbstractC6804llL1ii) obj) : new C1L1il(IiLIl1I.OooO00o(obj));
    }

    public C6456l1ilL OooO00o() {
        IiLIl1I iiLIl1I = this.OooO00o;
        return iiLIl1I == null ? new C6456l1ilL(AbstractC9733l.OooO) : iiLIl1I.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21300OooO00o() {
        IiLIl1I iiLIl1I = this.OooO00o;
        return (iiLIl1I == null ? this.f22778OooO00o : iiLIl1I.m15593OooO00o()).m17938OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        IiLIl1I iiLIl1I = this.OooO00o;
        return iiLIl1I == null ? this.f22778OooO00o : iiLIl1I.OooO0O0();
    }
}
