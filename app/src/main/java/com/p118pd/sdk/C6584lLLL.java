package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lLLL  reason: case insensitive filesystem */
public class C6584lLLL extends AbstractC5738Lil {
    public byte[] OooO00o;

    public C6584lLLL(AbstractC6804llL1ii r1) {
        this(r1.m17938OooO00o());
    }

    public C6584lLLL(byte[] bArr) {
        this.OooO00o = C9586iIILl.m21630OooO00o(bArr);
    }

    public static C6584lLLL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(AbstractC6804llL1ii.OooO00o(r0, z));
    }

    public static C6584lLLL OooO00o(iI11IL r1) {
        return OooO00o(r1.m17472OooO00o(C5237III.o00OoOo));
    }

    public static C6584lLLL OooO00o(Object obj) {
        if (obj instanceof C6584lLLL) {
            return (C6584lLLL) obj;
        }
        if (obj != null) {
            return new C6584lLLL(AbstractC6804llL1ii.OooO00o(obj));
        }
        return null;
    }

    public byte[] OooO00o() {
        return C9586iIILl.m21630OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C6487lIIiIlL(OooO00o());
    }
}
