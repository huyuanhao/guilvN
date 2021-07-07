package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.i1I  reason: case insensitive filesystem */
public class C6011i1I extends AbstractC5738Lil {
    public C6513lIiI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f17343OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9543L1 f17344OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f17345OooO00o = BigInteger.valueOf(0);
    public C6513lIiI OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public AbstractC6804llL1ii f17346OooO0O0;

    public C6011i1I(I11li1 i11li1) {
        int i = 0;
        if (i11li1.OooO00o(0) instanceof AbstractC5903LlLLL) {
            AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) i11li1.OooO00o(0);
            if (!r0.OooO0O0() || r0.OooO00o() != 0) {
                throw new IllegalArgumentException("object parse error");
            }
            this.f17345OooO00o = C6513lIiI.OooO00o((Object) r0.m16487OooO00o()).m17647OooO0O0();
            i = 1;
        }
        this.f17344OooO00o = C9543L1.OooO00o(i11li1.OooO00o(i));
        int i2 = i + 1;
        this.OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(i2));
        int i3 = i2 + 1;
        this.f17343OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(i3));
        int i4 = i3 + 1;
        this.OooO0O0 = C6513lIiI.OooO00o(i11li1.OooO00o(i4));
        this.f17346OooO0O0 = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(i4 + 1));
    }

    public C6011i1I(C5600L1iLL r8) {
        C9543L1 r2;
        IIiLIli OooO00o2 = r8.OooO00o();
        if (Lii1I.OooO00o(OooO00o2)) {
            int[] OooO00o3 = ((LiliILiI) OooO00o2.m15391OooO00o()).OooO00o().m21891OooO00o();
            if (OooO00o3.length == 3) {
                r2 = new C9543L1(OooO00o3[2], OooO00o3[1]);
            } else if (OooO00o3.length == 5) {
                r2 = new C9543L1(OooO00o3[4], OooO00o3[1], OooO00o3[2], OooO00o3[3]);
            } else {
                throw new IllegalArgumentException("curve must have a trinomial or pentanomial basis");
            }
            this.f17344OooO00o = r2;
            this.OooO00o = new C6513lIiI(OooO00o2.m15394OooO00o().m21859OooO00o());
            this.f17343OooO00o = new C6487lIIiIlL(OooO00o2.m15400OooO0O0().m21861OooO00o());
            this.OooO0O0 = new C6513lIiI(r8.OooO0OO());
            this.f17346OooO0O0 = new C6487lIIiIlL(AbstractC5755LiL.OooO00o(r8.m16003OooO00o()));
            return;
        }
        throw new IllegalArgumentException("only binary domain is possible");
    }

    public static C6011i1I OooO00o(Object obj) {
        if (obj instanceof C6011i1I) {
            return (C6011i1I) obj;
        }
        if (obj != null) {
            return new C6011i1I(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C9543L1 OooO00o() {
        return this.f17344OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16853OooO00o() {
        return this.OooO00o.m17647OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16854OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f17343OooO00o.m17938OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.f17345OooO00o.compareTo(BigInteger.valueOf(0)) != 0) {
            r0.OooO00o(new ILI1Ll(true, 0, new C6513lIiI(this.f17345OooO00o)));
        }
        r0.OooO00o(this.f17344OooO00o);
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f17343OooO00o);
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(this.f17346OooO0O0);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m16855OooO0O0() {
        return this.OooO0O0.m17647OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m16856OooO0O0() {
        return C9586iIILl.m21630OooO00o(this.f17346OooO0O0.m17938OooO00o());
    }
}
