package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.Ii1I1LlI */
public class Ii1I1LlI extends AbstractC5738Lil {
    public I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1684L f15666OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f15667OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1ILLL1 f15668OooO00o;
    public I11L OooO0O0;

    public Ii1I1LlI(I11li1 i11li1) {
        this.f15667OooO00o = (C6513lIiI) i11li1.OooO00o(0);
        AbstractC6854lLi1LL OooO00o2 = i11li1.OooO00o(1);
        int i = 2;
        if (OooO00o2 instanceof AbstractC5903LlLLL) {
            this.f15668OooO00o = C1ILLL1.OooO00o((AbstractC5903LlLLL) OooO00o2, false);
            OooO00o2 = i11li1.OooO00o(2);
            i = 3;
        }
        this.OooO00o = I11L.OooO00o((Object) OooO00o2);
        int i2 = i + 1;
        this.f15666OooO00o = C1684L.OooO00o(i11li1.OooO00o(i));
        if (i11li1.size() > i2) {
            this.OooO0O0 = I11L.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(i2), false);
        }
    }

    public Ii1I1LlI(C1ILLL1 r4, I11L i11l, C1684L r6, I11L i11l2) {
        this.f15667OooO00o = new C6513lIiI((long) OooO00o(r4, i11l, i11l2));
        this.f15668OooO00o = r4;
        this.OooO00o = i11l;
        this.f15666OooO00o = r6;
        this.OooO0O0 = i11l2;
    }

    public Ii1I1LlI(C1ILLL1 r4, I11L i11l, C1684L r6, l1iII r7) {
        this.f15667OooO00o = new C6513lIiI((long) OooO00o(r4, i11l, I11L.OooO00o((Object) r7)));
        this.f15668OooO00o = r4;
        this.OooO00o = i11l;
        this.f15666OooO00o = r6;
        this.OooO0O0 = I11L.OooO00o((Object) r7);
    }

    public static int OooO00o(C1ILLL1 r1, I11L i11l, I11L i11l2) {
        if (r1 != null || i11l2 != null) {
            return 2;
        }
        Enumeration OooO00o2 = i11l.m15215OooO00o();
        while (OooO00o2.hasMoreElements()) {
            if (C1lIii.OooO00o(OooO00o2.nextElement()).OooO00o().m17647OooO0O0().intValue() != 0) {
                return 2;
            }
        }
        return 0;
    }

    public static Ii1I1LlI OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static Ii1I1LlI OooO00o(Object obj) {
        if (obj instanceof Ii1I1LlI) {
            return (Ii1I1LlI) obj;
        }
        if (obj != null) {
            return new Ii1I1LlI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11L OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1684L m15548OooO00o() {
        return this.f15666OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m15549OooO00o() {
        return this.f15667OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1ILLL1 m15550OooO00o() {
        return this.f15668OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public I11L OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m15551OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f15667OooO00o);
        if (this.f15668OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.f15668OooO00o));
        }
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f15666OooO00o);
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.OooO0O0));
        }
        return new C6351ill(r0);
    }
}
