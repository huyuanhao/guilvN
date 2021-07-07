package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨I1丨丨II1  reason: invalid class name and case insensitive filesystem */
public class C9346I1II1 extends AbstractC5738Lil {
    public AbstractC6804llL1ii OooO00o;

    public C9346I1II1(I11li1 i11li1) {
        this.OooO00o = i11li1.size() == 1 ? (AbstractC6804llL1ii) i11li1.OooO00o(0) : null;
    }

    public C9346I1II1(byte[] bArr) {
        this.OooO00o = new C6487lIIiIlL(bArr);
    }

    public static C9346I1II1 OooO00o(Object obj) {
        if (obj instanceof C9346I1II1) {
            return (C9346I1II1) obj;
        }
        if (obj != null) {
            return new C9346I1II1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public byte[] OooO00o() {
        AbstractC6804llL1ii r0 = this.OooO00o;
        if (r0 != null) {
            return C9586iIILl.m21630OooO00o(r0.m17938OooO00o());
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        AbstractC6804llL1ii r1 = this.OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }
}
