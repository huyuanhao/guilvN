package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L1丨  reason: invalid class name */
public class L1 extends AbstractC5738Lil {
    public static final C6513lIiI OooO0O0 = new C6513lIiI(0);
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f16229OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f16230OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1II f16231OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9623il f16232OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f16233OooO0O0;

    public L1(I11li1 i11li1) {
        int i = 0;
        if (!(i11li1.OooO00o(0) instanceof AbstractC5903LlLLL) || ((AbstractC5903LlLLL) i11li1.OooO00o(0)).OooO00o() != 0) {
            this.f16230OooO00o = OooO0O0;
        } else {
            this.f16233OooO0O0 = true;
            this.f16230OooO00o = C6513lIiI.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(0), true);
            i = 1;
        }
        int i2 = i + 1;
        this.f16231OooO00o = C1II.OooO00o(i11li1.OooO00o(i));
        int i3 = i2 + 1;
        this.f16232OooO00o = C9623il.OooO00o(i11li1.OooO00o(i2));
        int i4 = i3 + 1;
        this.OooO00o = (I11li1) i11li1.OooO00o(i3);
        if (i11li1.size() > i4) {
            this.f16229OooO00o = iI11IL.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(i4), true);
        }
    }

    public L1(C6513lIiI r1, C1II r2, C9623il r3, I11li1 i11li1, iI11IL r5) {
        this.f16230OooO00o = r1;
        this.f16231OooO00o = r2;
        this.f16232OooO00o = r3;
        this.OooO00o = i11li1;
        this.f16229OooO00o = r5;
    }

    public L1(C1II r7, C9623il r8, I11li1 i11li1, iI11IL r10) {
        this(OooO0O0, r7, r8, i11li1, r10);
    }

    public L1(C1II r7, C9623il r8, I11li1 i11li1, C9431I r10) {
        this(OooO0O0, r7, C9623il.OooO00o((Object) r8), i11li1, iI11IL.OooO00o(r10));
    }

    public static L1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static L1 OooO00o(Object obj) {
        if (obj instanceof L1) {
            return (L1) obj;
        }
        if (obj != null) {
            return new L1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11li1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iI11IL m15996OooO00o() {
        return this.f16229OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m15997OooO00o() {
        return this.f16230OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1II m15998OooO00o() {
        return this.f16231OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9623il m15999OooO00o() {
        return this.f16232OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.f16233OooO0O0 || !this.f16230OooO00o.equals(OooO0O0)) {
            r0.OooO00o(new ILI1Ll(true, 0, this.f16230OooO00o));
        }
        r0.OooO00o(this.f16231OooO00o);
        r0.OooO00o(this.f16232OooO00o);
        r0.OooO00o(this.OooO00o);
        if (this.f16229OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 1, this.f16229OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
