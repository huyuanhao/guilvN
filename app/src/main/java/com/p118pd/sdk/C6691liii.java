package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.liii  reason: case insensitive filesystem */
public class C6691liii extends AbstractC5738Lil {
    public final byte[] OooO00o;
    public final byte[] OooO0O0;

    public C6691liii(I11li1 i11li1) {
        if (C6513lIiI.OooO00o(i11li1.OooO00o(0)).m17647OooO0O0().equals(BigInteger.valueOf(0))) {
            this.OooO00o = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(1)).m17938OooO00o());
            this.OooO0O0 = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(2)).m17938OooO00o());
            return;
        }
        throw new IllegalArgumentException("unknown version of sequence");
    }

    public C6691liii(byte[] bArr, byte[] bArr2) {
        this.OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.OooO0O0 = C9586iIILl.m21630OooO00o(bArr2);
    }

    public static C6691liii OooO00o(Object obj) {
        if (obj instanceof C6691liii) {
            return (C6691liii) obj;
        }
        if (obj != null) {
            return new C6691liii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public byte[] OooO00o() {
        return C9586iIILl.m21630OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI(0));
        r0.OooO00o(new C6487lIIiIlL(this.OooO00o));
        r0.OooO00o(new C6487lIIiIlL(this.OooO0O0));
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m17774OooO0O0() {
        return C9586iIILl.m21630OooO00o(this.OooO0O0);
    }
}
