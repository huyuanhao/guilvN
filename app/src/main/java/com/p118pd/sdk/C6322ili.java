package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ili  reason: case insensitive filesystem */
public class C6322ili extends AbstractC5738Lil {
    public static final C6513lIiI OooO0O0 = new C6513lIiI(0);
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ILI f18035OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f18036OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f18037OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f18038OooO0O0;

    public C6322ili(I11li1 i11li1) {
        int i = 0;
        if (!(i11li1.OooO00o(0) instanceof AbstractC5903LlLLL) || ((AbstractC5903LlLLL) i11li1.OooO00o(0)).OooO00o() != 0) {
            this.f18037OooO00o = OooO0O0;
        } else {
            this.f18038OooO0O0 = true;
            this.f18037OooO00o = C6513lIiI.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(0), true);
            i = 1;
        }
        if (i11li1.OooO00o(i) instanceof AbstractC5903LlLLL) {
            this.f18035OooO00o = ILI.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(i), true);
            i++;
        }
        int i2 = i + 1;
        this.OooO00o = (I11li1) i11li1.OooO00o(i);
        if (i11li1.size() == i2 + 1) {
            this.f18036OooO00o = iI11IL.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(i2), true);
        }
    }

    public C6322ili(ILI ili, I11li1 i11li1, iI11IL r4) {
        this.f18037OooO00o = OooO0O0;
        this.f18035OooO00o = ili;
        this.OooO00o = i11li1;
        this.f18036OooO00o = r4;
    }

    public C6322ili(ILI ili, I11li1 i11li1, C9431I r4) {
        this.f18037OooO00o = OooO0O0;
        this.f18035OooO00o = ili;
        this.OooO00o = i11li1;
        this.f18036OooO00o = iI11IL.OooO00o(r4);
    }

    public static C6322ili OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6322ili OooO00o(Object obj) {
        if (obj instanceof C6322ili) {
            return (C6322ili) obj;
        }
        if (obj != null) {
            return new C6322ili(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11li1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ILI m17368OooO00o() {
        return this.f18035OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iI11IL m17369OooO00o() {
        return this.f18036OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m17370OooO00o() {
        return this.f18037OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (!this.f18037OooO00o.equals(OooO0O0) || this.f18038OooO0O0) {
            r0.OooO00o(new ILI1Ll(true, 0, this.f18037OooO00o));
        }
        if (this.f18035OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 1, this.f18035OooO00o));
        }
        r0.OooO00o(this.OooO00o);
        if (this.f18036OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 2, this.f18036OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
