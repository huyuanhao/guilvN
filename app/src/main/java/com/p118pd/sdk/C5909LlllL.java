package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.L丨l丨ll丨L  reason: invalid class name and case insensitive filesystem */
public class C5909LlllL extends AbstractC5738Lil implements Ii11I1 {
    public static final int o00oO0O = 16;
    public C1688iL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f16922OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f16923OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ll11IIi[] f16924OooO00o;

    public C5909LlllL(I11li1 i11li1) {
        this.f16923OooO00o = new C6513lIiI(0);
        if (i11li1 == null || i11li1.size() == 0) {
            throw new IllegalArgumentException("null or empty sequence passed.");
        }
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.f16923OooO00o = C6513lIiI.OooO00o(OooO00o2.nextElement());
        this.f16922OooO00o = C6456l1ilL.OooO00o(OooO00o2.nextElement());
        I11li1 OooO00o3 = I11li1.OooO00o(OooO00o2.nextElement());
        if (this.f16923OooO00o.m17647OooO0O0().intValue() == 1) {
            this.OooO00o = C1688iL.OooO00o(OooO00o2.nextElement());
        }
        OooO00o(OooO00o3.size());
        this.f16924OooO00o = new ll11IIi[OooO00o3.size()];
        for (int i = 0; i < OooO00o3.size(); i++) {
            this.f16924OooO00o[i] = ll11IIi.OooO00o(OooO00o3.OooO00o(i));
        }
    }

    public C5909LlllL(C6456l1ilL r4, ll11IIi[] ll11iiiArr) {
        this.f16923OooO00o = new C6513lIiI(0);
        this.f16923OooO00o = new C6513lIiI(0);
        this.f16922OooO00o = r4;
        this.f16924OooO00o = ll11iiiArr;
        OooO00o(ll11iiiArr.length);
    }

    public C5909LlllL(C6456l1ilL r4, ll11IIi[] ll11iiiArr, C1688iL iLVar) {
        this.f16923OooO00o = new C6513lIiI(0);
        this.f16923OooO00o = new C6513lIiI(1);
        this.f16922OooO00o = r4;
        this.f16924OooO00o = ll11iiiArr;
        this.OooO00o = iLVar;
        OooO00o(ll11iiiArr.length);
    }

    public static C5909LlllL OooO00o(Object obj) {
        if (obj instanceof C5909LlllL) {
            return (C5909LlllL) obj;
        }
        if (obj != null) {
            return new C5909LlllL(I11li1.OooO00o(obj));
        }
        return null;
    }

    private void OooO00o(int i) {
        if (i < 2 || i > 16) {
            throw new IllegalArgumentException("wrong size in DataGroupHashValues : not in (2..16)");
        }
    }

    public C1688iL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m16488OooO00o() {
        return this.f16922OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ll11IIi[] m16489OooO00o() {
        return this.f16924OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.f16923OooO00o.m17647OooO0O0().intValue();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16490OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16923OooO00o);
        r0.OooO00o(this.f16922OooO00o);
        iILLL1 r1 = new iILLL1();
        int i = 0;
        while (true) {
            ll11IIi[] ll11iiiArr = this.f16924OooO00o;
            if (i >= ll11iiiArr.length) {
                break;
            }
            r1.OooO00o(ll11iiiArr[i]);
            i++;
        }
        r0.OooO00o(new C5707LiL1(r1));
        C1688iL iLVar = this.OooO00o;
        if (iLVar != null) {
            r0.OooO00o(iLVar);
        }
        return new C5707LiL1(r0);
    }
}
