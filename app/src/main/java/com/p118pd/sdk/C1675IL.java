package com.p118pd.sdk;

/* renamed from: com.pd.sdk.IL */
public class C1675IL extends AbstractC5738Lil {
    public byte[] OooO00o;
    public int o00oO0O;

    public C1675IL(I11li1 i11li1) {
        this.OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(0)).m17938OooO00o();
        this.o00oO0O = i11li1.size() == 2 ? C6513lIiI.OooO00o(i11li1.OooO00o(1)).m17647OooO0O0().intValue() : 12;
    }

    public C1675IL(byte[] bArr, int i) {
        this.OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.o00oO0O = i;
    }

    public static C1675IL OooO00o(Object obj) {
        if (obj instanceof C1675IL) {
            return (C1675IL) obj;
        }
        if (obj != null) {
            return new C1675IL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public byte[] OooO00o() {
        return C9586iIILl.m21630OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m15464OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6487lIIiIlL(this.OooO00o));
        int i = this.o00oO0O;
        if (i != 12) {
            r0.OooO00o(new C6513lIiI((long) i));
        }
        return new C5707LiL1(r0);
    }
}
