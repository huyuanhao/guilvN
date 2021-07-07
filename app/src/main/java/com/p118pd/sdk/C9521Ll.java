package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨Ll  reason: invalid class name and case insensitive filesystem */
public class C9521Ll extends AbstractC5738Lil {
    public static final int o00oO0O = 1;
    public static final int o0ooOO0 = 999;
    public static final int o0ooOOo = 1;
    public static final int o0ooOoO = 999;
    public C6513lIiI OooO00o;
    public C6513lIiI OooO0O0;
    public C6513lIiI OooO0OO;

    public C9521Ll() {
    }

    public C9521Ll(I11li1 i11li1) {
        this.OooO00o = null;
        this.OooO0O0 = null;
        this.OooO0OO = null;
        for (int i = 0; i < i11li1.size(); i++) {
            if (i11li1.OooO00o(i) instanceof C6513lIiI) {
                this.OooO00o = (C6513lIiI) i11li1.OooO00o(i);
            } else if (!(i11li1.OooO00o(i) instanceof AbstractC5903LlLLL)) {
                continue;
            } else {
                AbstractC5903LlLLL r2 = (AbstractC5903LlLLL) i11li1.OooO00o(i);
                int OooO00o2 = r2.OooO00o();
                if (OooO00o2 == 0) {
                    C6513lIiI OooO00o3 = C6513lIiI.OooO00o(r2, false);
                    this.OooO0O0 = OooO00o3;
                    if (OooO00o3.m17647OooO0O0().intValue() < 1 || this.OooO0O0.m17647OooO0O0().intValue() > 999) {
                        throw new IllegalArgumentException("Invalid millis field : not in (1..999).");
                    }
                } else if (OooO00o2 == 1) {
                    C6513lIiI OooO00o4 = C6513lIiI.OooO00o(r2, false);
                    this.OooO0OO = OooO00o4;
                    if (OooO00o4.m17647OooO0O0().intValue() < 1 || this.OooO0OO.m17647OooO0O0().intValue() > 999) {
                        throw new IllegalArgumentException("Invalid micros field : not in (1..999).");
                    }
                } else {
                    throw new IllegalArgumentException("Invalig tag number");
                }
            }
        }
    }

    public C9521Ll(C6513lIiI r3, C6513lIiI r4, C6513lIiI r5) {
        this.OooO00o = r3;
        if (r4 == null || (r4.m17647OooO0O0().intValue() >= 1 && r4.m17647OooO0O0().intValue() <= 999)) {
            this.OooO0O0 = r4;
            if (r5 == null || (r5.m17647OooO0O0().intValue() >= 1 && r5.m17647OooO0O0().intValue() <= 999)) {
                this.OooO0OO = r5;
                return;
            }
            throw new IllegalArgumentException("Invalid micros field : not in (1..999)");
        }
        throw new IllegalArgumentException("Invalid millis field : not in (1..999)");
    }

    public static C9521Ll OooO00o(Object obj) {
        if (obj instanceof C9521Ll) {
            return (C9521Ll) obj;
        }
        if (obj != null) {
            return new C9521Ll(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6513lIiI OooO00o() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        C6513lIiI r1 = this.OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.OooO0O0));
        }
        if (this.OooO0OO != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.OooO0OO));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6513lIiI m21582OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public C6513lIiI OooO0OO() {
        return this.OooO00o;
    }
}
