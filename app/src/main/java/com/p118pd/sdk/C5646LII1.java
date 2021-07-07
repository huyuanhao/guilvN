package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.LI丨I1  reason: invalid class name and case insensitive filesystem */
public class C5646LII1 extends AbstractC5738Lil {
    public static final ILI OooO0OO = new ILI(l1LILI1.OooO00o(new C5707LiL1()));
    public static final int o00oO0O = 1;
    public static final int o0ooOO0 = 2;
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ILI f16364OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f16365OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f16366OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f16367OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9623il f16368OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9752I11 f16369OooO00o;
    public ILI OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public AbstractC6804llL1ii f16370OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public AbstractC6804llL1ii f16371OooO0OO;
    public AbstractC6804llL1ii OooO0Oo;
    public AbstractC6804llL1ii OooO0o0;

    public C5646LII1(int i, ILI ili, ILI ili2) {
        this(new C6513lIiI((long) i), ili, ili2);
    }

    public C5646LII1(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.f16366OooO00o = C6513lIiI.OooO00o(OooO00o2.nextElement());
        this.f16364OooO00o = ILI.OooO00o(OooO00o2.nextElement());
        this.OooO0O0 = ILI.OooO00o(OooO00o2.nextElement());
        while (OooO00o2.hasMoreElements()) {
            AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) OooO00o2.nextElement();
            switch (r0.OooO00o()) {
                case 0:
                    this.f16368OooO00o = C9623il.OooO00o(r0, true);
                    break;
                case 1:
                    this.f16365OooO00o = C6456l1ilL.OooO00o(r0, true);
                    break;
                case 2:
                    this.f16367OooO00o = AbstractC6804llL1ii.OooO00o(r0, true);
                    break;
                case 3:
                    this.f16370OooO0O0 = AbstractC6804llL1ii.OooO00o(r0, true);
                    break;
                case 4:
                    this.f16371OooO0OO = AbstractC6804llL1ii.OooO00o(r0, true);
                    break;
                case 5:
                    this.OooO0Oo = AbstractC6804llL1ii.OooO00o(r0, true);
                    break;
                case 6:
                    this.OooO0o0 = AbstractC6804llL1ii.OooO00o(r0, true);
                    break;
                case 7:
                    this.f16369OooO00o = C9752I11.OooO00o(r0, true);
                    break;
                case 8:
                    this.OooO00o = I11li1.OooO00o(r0, true);
                    break;
                default:
                    throw new IllegalArgumentException("unknown tag number: " + r0.OooO00o());
            }
        }
    }

    public C5646LII1(C6513lIiI r1, ILI ili, ILI ili2) {
        this.f16366OooO00o = r1;
        this.f16364OooO00o = ili;
        this.OooO0O0 = ili2;
    }

    public static C5646LII1 OooO00o(Object obj) {
        if (obj instanceof C5646LII1) {
            return (C5646LII1) obj;
        }
        if (obj != null) {
            return new C5646LII1(I11li1.OooO00o(obj));
        }
        return null;
    }

    private void OooO00o(iILLL1 r3, int i, AbstractC6854lLi1LL r5) {
        if (r5 != null) {
            r3.OooO00o(new ILI1Ll(true, i, r5));
        }
    }

    public ILI OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m16143OooO00o() {
        return this.f16365OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m16144OooO00o() {
        return this.f16366OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m16145OooO00o() {
        return this.f16370OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9623il m16146OooO00o() {
        return this.f16368OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9752I11 m16147OooO00o() {
        return this.f16369OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LLI[] m16148OooO00o() {
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 == null) {
            return null;
        }
        int size = i11li1.size();
        LLI[] lliArr = new LLI[size];
        for (int i = 0; i < size; i++) {
            lliArr[i] = LLI.OooO00o(this.OooO00o.OooO00o(i));
        }
        return lliArr;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public ILI OooO0O0() {
        return this.f16364OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16149OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16366OooO00o);
        r0.OooO00o(this.f16364OooO00o);
        r0.OooO00o(this.OooO0O0);
        OooO00o(r0, 0, this.f16368OooO00o);
        OooO00o(r0, 1, this.f16365OooO00o);
        OooO00o(r0, 2, this.f16367OooO00o);
        OooO00o(r0, 3, this.f16370OooO0O0);
        OooO00o(r0, 4, this.f16371OooO0OO);
        OooO00o(r0, 5, this.OooO0Oo);
        OooO00o(r0, 6, this.OooO0o0);
        OooO00o(r0, 7, this.f16369OooO00o);
        OooO00o(r0, 8, this.OooO00o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6804llL1ii m16150OooO0O0() {
        return this.OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public AbstractC6804llL1ii OooO0OO() {
        return this.f16367OooO00o;
    }

    public AbstractC6804llL1ii OooO0Oo() {
        return this.OooO0Oo;
    }

    public AbstractC6804llL1ii OooO0o0() {
        return this.f16371OooO0OO;
    }
}
