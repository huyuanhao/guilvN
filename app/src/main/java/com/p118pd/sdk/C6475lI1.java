package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lI1  reason: case insensitive filesystem */
public class C6475lI1 extends AbstractC5738Lil {
    public AbstractC6804llL1ii OooO00o;

    public C6475lI1(AbstractC6804llL1ii r1) {
        this.OooO00o = r1;
    }

    public C6475lI1(byte[] bArr) {
        this(new C6487lIIiIlL(bArr));
    }

    public static C6475lI1 OooO00o(Object obj) {
        if (obj instanceof C6475lI1) {
            return (C6475lI1) obj;
        }
        if (obj != null) {
            return new C6475lI1(AbstractC6804llL1ii.OooO00o(obj));
        }
        return null;
    }

    public AbstractC6804llL1ii OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
