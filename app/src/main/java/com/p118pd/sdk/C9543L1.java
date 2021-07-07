package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨L丨1  reason: invalid class name and case insensitive filesystem */
public class C9543L1 extends AbstractC5738Lil {
    public int o00oO0O;
    public int o0ooOO0;
    public int o0ooOOo;
    public int o0ooOoO;

    public C9543L1(int i, int i2) {
        this(i, i2, 0, 0);
    }

    public C9543L1(int i, int i2, int i3, int i4) {
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
        this.o0ooOOo = i3;
        this.o0ooOoO = i4;
    }

    public C9543L1(I11li1 i11li1) {
        this.o00oO0O = C6513lIiI.OooO00o(i11li1.OooO00o(0)).OooO00o().intValue();
        if (i11li1.OooO00o(1) instanceof C6513lIiI) {
            this.o0ooOO0 = ((C6513lIiI) i11li1.OooO00o(1)).OooO00o().intValue();
        } else if (i11li1.OooO00o(1) instanceof I11li1) {
            I11li1 OooO00o = I11li1.OooO00o(i11li1.OooO00o(1));
            this.o0ooOO0 = C6513lIiI.OooO00o(OooO00o.OooO00o(0)).OooO00o().intValue();
            this.o0ooOOo = C6513lIiI.OooO00o(OooO00o.OooO00o(1)).OooO00o().intValue();
            this.o0ooOoO = C6513lIiI.OooO00o(OooO00o.OooO00o(2)).OooO00o().intValue();
        } else {
            throw new IllegalArgumentException("object parse error");
        }
    }

    public static C9543L1 OooO00o(Object obj) {
        if (obj instanceof C9543L1) {
            return (C9543L1) obj;
        }
        if (obj != null) {
            return new C9543L1(I11li1.OooO00o(obj));
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o0ooOO0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m21603OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI((long) this.o00oO0O));
        if (this.o0ooOOo == 0) {
            r0.OooO00o(new C6513lIiI((long) this.o0ooOO0));
        } else {
            iILLL1 r1 = new iILLL1();
            r1.OooO00o(new C6513lIiI((long) this.o0ooOO0));
            r1.OooO00o(new C6513lIiI((long) this.o0ooOOo));
            r1.OooO00o(new C6513lIiI((long) this.o0ooOoO));
            r0.OooO00o(new C5707LiL1(r1));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public int OooO0OO() {
        return this.o0ooOOo;
    }

    public int OooO0Oo() {
        return this.o0ooOoO;
    }

    public int OooO0o0() {
        return this.o00oO0O;
    }
}
