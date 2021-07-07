package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨lilI  reason: invalid class name and case insensitive filesystem */
public class C9709lilI extends AbstractC5738Lil {
    public I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5753LiI1 f23343OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f23344OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f23345OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f23346OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1ILLL1 f23347OooO00o;
    public I11L OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C6456l1ilL f23348OooO0O0;
    public I11L OooO0OO;

    public C9709lilI(I11li1 i11li1) {
        this.f23345OooO00o = (C6513lIiI) i11li1.OooO00o(0);
        AbstractC6854lLi1LL OooO00o2 = i11li1.OooO00o(1);
        int i = 2;
        if (OooO00o2 instanceof AbstractC5903LlLLL) {
            this.f23347OooO00o = C1ILLL1.OooO00o((AbstractC5903LlLLL) OooO00o2, false);
            OooO00o2 = i11li1.OooO00o(2);
            i = 3;
        }
        this.OooO00o = I11L.OooO00o((Object) OooO00o2);
        int i2 = i + 1;
        this.f23344OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(i));
        int i3 = i2 + 1;
        AbstractC6854lLi1LL OooO00o3 = i11li1.OooO00o(i2);
        if (OooO00o3 instanceof AbstractC5903LlLLL) {
            this.f23348OooO0O0 = C6456l1ilL.OooO00o((AbstractC5903LlLLL) OooO00o3, false);
            int i4 = i3 + 1;
            AbstractC6854lLi1LL OooO00o4 = i11li1.OooO00o(i3);
            i3 = i4;
            OooO00o3 = OooO00o4;
        }
        this.f23343OooO00o = C5753LiI1.OooO00o(OooO00o3);
        int i5 = i3 + 1;
        AbstractC6854lLi1LL OooO00o5 = i11li1.OooO00o(i3);
        if (OooO00o5 instanceof AbstractC5903LlLLL) {
            this.OooO0O0 = I11L.OooO00o((AbstractC5903LlLLL) OooO00o5, false);
            OooO00o5 = i11li1.OooO00o(i5);
            i5++;
        }
        this.f23346OooO00o = AbstractC6804llL1ii.OooO00o(OooO00o5);
        if (i11li1.size() > i5) {
            this.OooO0OO = I11L.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(i5), false);
        }
    }

    public C9709lilI(C1ILLL1 r4, I11L i11l, C6456l1ilL r6, C6456l1ilL r7, C5753LiI1 r8, I11L i11l2, AbstractC6804llL1ii r10, I11L i11l3) {
        if (!(r7 == null && i11l2 == null) && (r7 == null || i11l2 == null)) {
            throw new IllegalArgumentException("digestAlgorithm and authAttrs must be set together");
        }
        this.f23345OooO00o = new C6513lIiI((long) OooO00o(r4));
        this.f23347OooO00o = r4;
        this.f23344OooO00o = r6;
        this.f23348OooO0O0 = r7;
        this.OooO00o = i11l;
        this.f23343OooO00o = r8;
        this.OooO0O0 = i11l2;
        this.f23346OooO00o = r10;
        this.OooO0OO = i11l3;
    }

    public static int OooO00o(C1ILLL1 r7) {
        int i = 0;
        if (r7 == null) {
            return 0;
        }
        Enumeration OooO00o2 = r7.OooO0O0().m15215OooO00o();
        while (true) {
            if (!OooO00o2.hasMoreElements()) {
                break;
            }
            Object nextElement = OooO00o2.nextElement();
            if (nextElement instanceof AbstractC5903LlLLL) {
                AbstractC5903LlLLL r2 = (AbstractC5903LlLLL) nextElement;
                if (r2.OooO00o() == 2) {
                    i = 1;
                } else if (r2.OooO00o() == 3) {
                    i = 3;
                    break;
                }
            }
        }
        if (r7.OooO00o() != null) {
            Enumeration OooO00o3 = r7.OooO00o().m15215OooO00o();
            while (OooO00o3.hasMoreElements()) {
                Object nextElement2 = OooO00o3.nextElement();
                if ((nextElement2 instanceof AbstractC5903LlLLL) && ((AbstractC5903LlLLL) nextElement2).OooO00o() == 1) {
                    return 3;
                }
            }
        }
        return i;
    }

    public static C9709lilI OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C9709lilI OooO00o(Object obj) {
        if (obj instanceof C9709lilI) {
            return (C9709lilI) obj;
        }
        if (obj != null) {
            return new C9709lilI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11L OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5753LiI1 m21741OooO00o() {
        return this.f23343OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m21742OooO00o() {
        return this.f23348OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m21743OooO00o() {
        return this.f23345OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m21744OooO00o() {
        return this.f23346OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1ILLL1 m21745OooO00o() {
        return this.f23347OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public I11L OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m21746OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f23345OooO00o);
        if (this.f23347OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.f23347OooO00o));
        }
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f23344OooO00o);
        if (this.f23348OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.f23348OooO0O0));
        }
        r0.OooO00o(this.f23343OooO00o);
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 2, this.OooO0O0));
        }
        r0.OooO00o(this.f23346OooO00o);
        if (this.OooO0OO != null) {
            r0.OooO00o(new ILI1Ll(false, 3, this.OooO0OO));
        }
        return new C6351ill(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m21747OooO0O0() {
        return this.f23344OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public I11L OooO0OO() {
        return this.OooO0OO;
    }
}
