package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.LlLL  reason: case insensitive filesystem */
public class C5789LlLL extends AbstractC5738Lil {
    public final BigInteger OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f16724OooO00o;
    public final BigInteger OooO0O0;
    public final BigInteger OooO0OO;
    public final BigInteger OooO0Oo;

    public C5789LlLL(I11li1 i11li1) {
        if (i11li1.size() == 4 || i11li1.size() == 5) {
            this.f16724OooO00o = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(0)).m17938OooO00o());
            this.OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(1)).m17647OooO0O0();
            this.OooO0O0 = C6513lIiI.OooO00o(i11li1.OooO00o(2)).m17647OooO0O0();
            this.OooO0OO = C6513lIiI.OooO00o(i11li1.OooO00o(3)).m17647OooO0O0();
            this.OooO0Oo = i11li1.size() == 5 ? C6513lIiI.OooO00o(i11li1.OooO00o(4)).m17647OooO0O0() : null;
            return;
        }
        throw new IllegalArgumentException("invalid sequence: size = " + i11li1.size());
    }

    public C5789LlLL(byte[] bArr, int i, int i2, int i3) {
        this(bArr, BigInteger.valueOf((long) i), BigInteger.valueOf((long) i2), BigInteger.valueOf((long) i3), (BigInteger) null);
    }

    public C5789LlLL(byte[] bArr, int i, int i2, int i3, int i4) {
        this(bArr, BigInteger.valueOf((long) i), BigInteger.valueOf((long) i2), BigInteger.valueOf((long) i3), BigInteger.valueOf((long) i4));
    }

    public C5789LlLL(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f16724OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.OooO0OO = bigInteger3;
        this.OooO0Oo = bigInteger4;
    }

    public static C5789LlLL OooO00o(Object obj) {
        if (obj instanceof C5789LlLL) {
            return (C5789LlLL) obj;
        }
        if (obj != null) {
            return new C5789LlLL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public BigInteger OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16388OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f16724OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6487lIIiIlL(this.f16724OooO00o));
        r0.OooO00o(new C6513lIiI(this.OooO00o));
        r0.OooO00o(new C6513lIiI(this.OooO0O0));
        r0.OooO00o(new C6513lIiI(this.OooO0OO));
        BigInteger bigInteger = this.OooO0Oo;
        if (bigInteger != null) {
            r0.OooO00o(new C6513lIiI(bigInteger));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m16389OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public BigInteger OooO0OO() {
        return this.OooO0Oo;
    }

    public BigInteger OooO0Oo() {
        return this.OooO0OO;
    }
}
