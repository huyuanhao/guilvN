package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l丨l  reason: invalid class name and case insensitive filesystem */
public class C6870ll extends AbstractC5738Lil {
    public C6513lIiI OooO00o = new C6513lIiI(0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public LilIiIl[] f18952OooO00o;

    public C6870ll(I11li1 i11li1) {
        if (i11li1 == null || i11li1.size() == 0) {
            throw new IllegalArgumentException("null or empty sequence passed.");
        } else if (i11li1.size() == 2) {
            int i = 0;
            this.OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
            I11L OooO00o2 = I11L.OooO00o((Object) i11li1.OooO00o(1));
            this.f18952OooO00o = new LilIiIl[OooO00o2.size()];
            while (true) {
                LilIiIl[] lilIiIlArr = this.f18952OooO00o;
                if (i < lilIiIlArr.length) {
                    lilIiIlArr[i] = LilIiIl.OooO00o(OooO00o2.OooO00o(i));
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Incorrect sequence size: " + i11li1.size());
        }
    }

    public C6870ll(LilIiIl[] lilIiIlArr) {
        this.f18952OooO00o = OooO00o(lilIiIlArr);
    }

    public static C6870ll OooO00o(Object obj) {
        if (obj instanceof C6870ll) {
            return (C6870ll) obj;
        }
        if (obj != null) {
            return new C6870ll(I11li1.OooO00o(obj));
        }
        return null;
    }

    private LilIiIl[] OooO00o(LilIiIl[] lilIiIlArr) {
        int length = lilIiIlArr.length;
        LilIiIl[] lilIiIlArr2 = new LilIiIl[length];
        for (int i = 0; i != length; i++) {
            lilIiIlArr2[i] = lilIiIlArr[i];
        }
        return lilIiIlArr2;
    }

    public LilIiIl[] OooO00o() {
        return OooO00o(this.f18952OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.OooO00o.m17647OooO0O0().intValue();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m18039OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        iILLL1 r1 = new iILLL1();
        int i = 0;
        while (true) {
            LilIiIl[] lilIiIlArr = this.f18952OooO00o;
            if (i < lilIiIlArr.length) {
                r1.OooO00o(lilIiIlArr[i]);
                i++;
            } else {
                r0.OooO00o(new i1I1I1l(r1));
                return new C5707LiL1(r0);
            }
        }
    }
}
