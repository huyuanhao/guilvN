package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I丨i111  reason: invalid class name */
public class Ii111 extends AbstractC5738Lil {
    public static final int o00oO0O = 0;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    public C5841L11I OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iIilII1 f16039OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f16040OooO00o;
    public LlLI1 o00OoOOo;

    public Ii111(int i, LlLI1 llLI1, C6456l1ilL r4, byte[] bArr) {
        this.OooO00o = new C5841L11I(i);
        if (i == 2) {
            this.o00OoOOo = llLI1;
        }
        this.f16040OooO00o = r4;
        this.f16039OooO00o = new iIilII1(bArr);
    }

    public Ii111(I11li1 i11li1) {
        if (i11li1.size() > 4 || i11li1.size() < 3) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        int i = 0;
        this.OooO00o = C5841L11I.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() == 4) {
            this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(1));
            i = 1;
        }
        this.f16040OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(i + 1));
        this.f16039OooO00o = iIilII1.OooO00o(i11li1.OooO00o(i + 2));
    }

    public static Ii111 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static Ii111 OooO00o(Object obj) {
        if (obj instanceof Ii111) {
            return (Ii111) obj;
        }
        if (obj != null) {
            return new Ii111(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5841L11I m15800OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iIilII1 m15801OooO00o() {
        return this.f16039OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m15802OooO00o() {
        return this.f16040OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        LlLI1 llLI1 = this.o00OoOOo;
        if (llLI1 != null) {
            r0.OooO00o(llLI1);
        }
        r0.OooO00o(this.f16040OooO00o);
        r0.OooO00o(this.f16039OooO00o);
        return new C5707LiL1(r0);
    }
}
