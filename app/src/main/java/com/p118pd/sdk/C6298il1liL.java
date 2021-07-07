package com.p118pd.sdk;

/* renamed from: com.pd.sdk.il1liL  reason: case insensitive filesystem */
public class C6298il1liL extends AbstractC5738Lil {
    public Ii111 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5845LIillll f17981OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C93041iI1l f17982OooO00o;

    public C6298il1liL(I11li1 i11li1) {
        int i;
        if (i11li1.size() <= 3) {
            if (!(i11li1.OooO00o(0) instanceof AbstractC5903LlLLL)) {
                this.f17981OooO00o = C5845LIillll.OooO00o(i11li1.OooO00o(0));
                i = 1;
            } else {
                i = 0;
            }
            while (i != i11li1.size()) {
                AbstractC5903LlLLL OooO00o2 = AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(i));
                if (OooO00o2.OooO00o() == 0) {
                    this.f17982OooO00o = C93041iI1l.OooO00o(OooO00o2, false);
                } else if (OooO00o2.OooO00o() == 1) {
                    this.OooO00o = Ii111.OooO00o(OooO00o2, false);
                } else {
                    throw new IllegalArgumentException("Bad tag number: " + OooO00o2.OooO00o());
                }
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C6298il1liL(C5845LIillll r2) {
        this(r2, null, null);
    }

    public C6298il1liL(C5845LIillll r2, Ii111 r3) {
        this(r2, null, r3);
    }

    public C6298il1liL(C5845LIillll r2, C93041iI1l r3) {
        this(r2, r3, null);
    }

    public C6298il1liL(C5845LIillll r1, C93041iI1l r2, Ii111 r3) {
        this.f17981OooO00o = r1;
        this.f17982OooO00o = r2;
        this.OooO00o = r3;
    }

    public static C6298il1liL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6298il1liL OooO00o(Object obj) {
        if (obj instanceof C6298il1liL) {
            return (C6298il1liL) obj;
        }
        if (obj != null) {
            return new C6298il1liL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public Ii111 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5845LIillll m17329OooO00o() {
        return this.f17981OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C93041iI1l m17330OooO00o() {
        return this.f17982OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        C5845LIillll r1 = this.f17981OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        if (this.f17982OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.f17982OooO00o));
        }
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
