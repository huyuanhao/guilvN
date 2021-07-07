package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨Iill丨  reason: invalid class name and case insensitive filesystem */
public class C9387Iill extends AbstractC5738Lil implements AbstractC5420Il1iIL {
    public static final BigInteger OooO0OO = BigInteger.valueOf(1);
    public IIiLIli OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6147iL1 f22937OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public liilIl1 f22938OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f22939OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f22940OooO00o;
    public BigInteger OooO0O0;

    public C9387Iill(I11li1 i11li1) {
        if (!(i11li1.OooO00o(0) instanceof C6513lIiI) || !((C6513lIiI) i11li1.OooO00o(0)).m17647OooO0O0().equals(OooO0OO)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        this.f22939OooO00o = ((C6513lIiI) i11li1.OooO00o(4)).m17647OooO0O0();
        if (i11li1.size() == 6) {
            this.OooO0O0 = ((C6513lIiI) i11li1.OooO00o(5)).m17647OooO0O0();
        }
        C5742LilI r0 = new C5742LilI(liilIl1.OooO00o(i11li1.OooO00o(1)), this.f22939OooO00o, this.OooO0O0, I11li1.OooO00o(i11li1.OooO00o(2)));
        this.OooO00o = r0.m16330OooO00o();
        AbstractC6854lLi1LL OooO00o2 = i11li1.OooO00o(3);
        if (OooO00o2 instanceof C6147iL1) {
            this.f22937OooO00o = (C6147iL1) OooO00o2;
        } else {
            this.f22937OooO00o = new C6147iL1(this.OooO00o, (AbstractC6804llL1ii) OooO00o2);
        }
        this.f22940OooO00o = r0.m16331OooO00o();
    }

    public C9387Iill(IIiLIli r7, C6147iL1 il1, BigInteger bigInteger, BigInteger bigInteger2) {
        this(r7, il1, bigInteger, bigInteger2, (byte[]) null);
    }

    public C9387Iill(IIiLIli r2, C6147iL1 il1, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        liilIl1 liilil1;
        this.OooO00o = r2;
        this.f22937OooO00o = il1;
        this.f22939OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.f22940OooO00o = bArr;
        if (Lii1I.OooO0O0(r2)) {
            liilil1 = new liilIl1(r2.m15391OooO00o().OooO00o());
        } else if (Lii1I.OooO00o(r2)) {
            int[] OooO00o2 = ((LiliILiI) r2.m15391OooO00o()).OooO00o().m21891OooO00o();
            if (OooO00o2.length == 3) {
                liilil1 = new liilIl1(OooO00o2[2], OooO00o2[1]);
            } else if (OooO00o2.length == 5) {
                liilil1 = new liilIl1(OooO00o2[4], OooO00o2[1], OooO00o2[2], OooO00o2[3]);
            } else {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
        } else {
            throw new IllegalArgumentException("'curve' is of an unsupported type");
        }
        this.f22938OooO00o = liilil1;
    }

    public C9387Iill(IIiLIli r7, AbstractC9738llL1L r8, BigInteger bigInteger) {
        this(r7, r8, bigInteger, (BigInteger) null, (byte[]) null);
    }

    public C9387Iill(IIiLIli r7, AbstractC9738llL1L r8, BigInteger bigInteger, BigInteger bigInteger2) {
        this(r7, r8, bigInteger, bigInteger2, (byte[]) null);
    }

    public C9387Iill(IIiLIli r7, AbstractC9738llL1L r8, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this(r7, new C6147iL1(r8), bigInteger, bigInteger2, bArr);
    }

    public static C9387Iill OooO00o(Object obj) {
        if (obj instanceof C9387Iill) {
            return (C9387Iill) obj;
        }
        if (obj != null) {
            return new C9387Iill(I11li1.OooO00o(obj));
        }
        return null;
    }

    public IIiLIli OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5742LilI m21454OooO00o() {
        return new C5742LilI(this.OooO00o, this.f22940OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6147iL1 m21455OooO00o() {
        return this.f22937OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public liilIl1 m21456OooO00o() {
        return this.f22938OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9738llL1L m21457OooO00o() {
        return this.f22937OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21458OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21459OooO00o() {
        return this.f22940OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI(OooO0OO));
        r0.OooO00o(this.f22938OooO00o);
        r0.OooO00o(new C5742LilI(this.OooO00o, this.f22940OooO00o));
        r0.OooO00o(this.f22937OooO00o);
        r0.OooO00o(new C6513lIiI(this.f22939OooO00o));
        BigInteger bigInteger = this.OooO0O0;
        if (bigInteger != null) {
            r0.OooO00o(new C6513lIiI(bigInteger));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m21460OooO0O0() {
        return this.f22939OooO00o;
    }
}
