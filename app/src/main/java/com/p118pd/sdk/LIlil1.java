package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LI丨lil1  reason: invalid class name */
public class LIlil1 extends AbstractC5738Lil implements AbstractC5855LLl, AbstractC5711LiLli {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5432IlIlIlL f16378OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iIilII1 f16379OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public l1LILI1 f16380OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f16381OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f16382OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6888ll f16383OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9431I f16384OooO00o;
    public C5432IlIlIlL OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public iIilII1 f16385OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public l1LILI1 f16386OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C6513lIiI f16387OooO0O0;

    public LIlil1(I11li1 i11li1) {
        int i;
        this.OooO00o = i11li1;
        if (i11li1.OooO00o(0) instanceof ILI1Ll) {
            this.f16382OooO00o = C6513lIiI.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(0), true);
            i = 0;
        } else {
            this.f16382OooO00o = new C6513lIiI(0);
            i = -1;
        }
        this.f16387OooO0O0 = C6513lIiI.OooO00o(i11li1.OooO00o(i + 1));
        this.f16381OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(i + 2));
        this.f16380OooO00o = l1LILI1.OooO00o(i11li1.OooO00o(i + 3));
        I11li1 i11li12 = (I11li1) i11li1.OooO00o(i + 4);
        this.f16378OooO00o = C5432IlIlIlL.OooO00o(i11li12.OooO00o(0));
        this.OooO0O0 = C5432IlIlIlL.OooO00o(i11li12.OooO00o(1));
        this.f16386OooO0O0 = l1LILI1.OooO00o(i11li1.OooO00o(i + 5));
        int i2 = i + 6;
        this.f16383OooO00o = C6888ll.OooO00o(i11li1.OooO00o(i2));
        for (int size = (i11li1.size() - i2) - 1; size > 0; size--) {
            ILI1Ll iLI1Ll = (ILI1Ll) i11li1.OooO00o(i2 + size);
            int OooO00o2 = iLI1Ll.OooO00o();
            if (OooO00o2 == 1) {
                this.f16379OooO00o = iIilII1.OooO00o((AbstractC5903LlLLL) iLI1Ll, false);
            } else if (OooO00o2 == 2) {
                this.f16385OooO0O0 = iIilII1.OooO00o((AbstractC5903LlLLL) iLI1Ll, false);
            } else if (OooO00o2 == 3) {
                this.f16384OooO00o = C9431I.OooO00o(iLI1Ll);
            }
        }
    }

    public static LIlil1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static LIlil1 OooO00o(Object obj) {
        if (obj instanceof LIlil1) {
            return (LIlil1) obj;
        }
        if (obj != null) {
            return new LIlil1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5432IlIlIlL OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iIilII1 m16151OooO00o() {
        return this.f16379OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l1LILI1 m16152OooO00o() {
        return this.f16380OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m16153OooO00o() {
        return this.f16381OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m16154OooO00o() {
        return this.f16387OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6888ll m16155OooO00o() {
        return this.f16383OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9431I m16156OooO00o() {
        return this.f16384OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.f16382OooO00o.m17647OooO0O0().intValue() + 1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C5432IlIlIlL m16157OooO0O0() {
        return this.f16378OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public iIilII1 m16158OooO0O0() {
        return this.f16385OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16159OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public l1LILI1 m16160OooO0O0() {
        return this.f16386OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6513lIiI m16161OooO0O0() {
        return this.f16382OooO00o;
    }
}
