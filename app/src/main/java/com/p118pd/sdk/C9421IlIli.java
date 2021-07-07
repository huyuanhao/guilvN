package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨IlI丨li  reason: invalid class name and case insensitive filesystem */
public class C9421IlIli extends AbstractC5738Lil {
    public static final int o0ooOO0 = 0;
    public static final int o0ooOOo = 1;
    public Ii111 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5845LIillll f22957OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C93041iI1l f22958OooO00o;
    public int o00oO0O;

    public C9421IlIli(I11li1 i11li1) {
        this.o00oO0O = 1;
        if (i11li1.size() <= 3) {
            for (int i = 0; i != i11li1.size(); i++) {
                AbstractC5903LlLLL OooO00o2 = AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(i));
                int OooO00o3 = OooO00o2.OooO00o();
                if (OooO00o3 == 0) {
                    this.f22958OooO00o = C93041iI1l.OooO00o(OooO00o2, false);
                } else if (OooO00o3 == 1) {
                    this.f22957OooO00o = C5845LIillll.OooO00o(OooO00o2, false);
                } else if (OooO00o3 == 2) {
                    this.OooO00o = Ii111.OooO00o(OooO00o2, false);
                } else {
                    throw new IllegalArgumentException("unknown tag in Holder");
                }
            }
            this.o00oO0O = 1;
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C9421IlIli(Ii111 r2) {
        this.o00oO0O = 1;
        this.OooO00o = r2;
    }

    public C9421IlIli(C5845LIillll r2) {
        this(r2, 1);
    }

    public C9421IlIli(C5845LIillll r2, int i) {
        this.o00oO0O = 1;
        this.f22957OooO00o = r2;
        this.o00oO0O = i;
    }

    public C9421IlIli(AbstractC5903LlLLL r3) {
        this.o00oO0O = 1;
        int OooO00o2 = r3.OooO00o();
        if (OooO00o2 == 0) {
            this.f22958OooO00o = C93041iI1l.OooO00o(r3, true);
        } else if (OooO00o2 == 1) {
            this.f22957OooO00o = C5845LIillll.OooO00o(r3, true);
        } else {
            throw new IllegalArgumentException("unknown tag in Holder");
        }
        this.o00oO0O = 0;
    }

    public C9421IlIli(C93041iI1l r2) {
        this(r2, 1);
    }

    public C9421IlIli(C93041iI1l r2, int i) {
        this.o00oO0O = 1;
        this.f22958OooO00o = r2;
        this.o00oO0O = i;
    }

    public static C9421IlIli OooO00o(Object obj) {
        if (obj instanceof C9421IlIli) {
            return (C9421IlIli) obj;
        }
        if (obj instanceof AbstractC5903LlLLL) {
            return new C9421IlIli(AbstractC5903LlLLL.OooO00o(obj));
        }
        if (obj != null) {
            return new C9421IlIli(I11li1.OooO00o(obj));
        }
        return null;
    }

    public Ii111 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5845LIillll m21464OooO00o() {
        return this.f22957OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C93041iI1l m21465OooO00o() {
        return this.f22958OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m21466OooO0O0() {
        if (this.o00oO0O != 1) {
            return this.f22957OooO00o != null ? new ILI1Ll(true, 1, this.f22957OooO00o) : new ILI1Ll(true, 0, this.f22958OooO00o);
        }
        iILLL1 r0 = new iILLL1();
        if (this.f22958OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.f22958OooO00o));
        }
        if (this.f22957OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.f22957OooO00o));
        }
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 2, this.OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
