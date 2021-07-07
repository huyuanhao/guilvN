package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨丨1  reason: invalid class name and case insensitive filesystem */
public class C97411 extends AbstractC5738Lil implements AbstractC5462Ilil {
    public static final int o0000 = 21;
    public static final int o00000 = 12;
    public static final int o000000 = 9;
    public static final int o000000O = 10;
    public static final int o000000o = 11;
    public static final int o00000O = 14;
    public static final int o00000O0 = 13;
    public static final int o00000OO = 15;
    public static final int o00000Oo = 16;
    public static final int o00000o0 = 17;
    public static final int o00000oO = 19;
    public static final int o00000oo = 20;
    public static final int o0000O0 = 25;
    public static final int o0000O00 = 22;
    public static final int o0000O0O = 26;
    public static final int o0000Ooo = 18;
    public static final int o0000oO = 24;
    public static final int o0000oo = 23;
    public static final int o000OOo = 8;
    public static final int o0O0O00 = 7;
    public static final int o0OO00O = 5;
    public static final int o0OOO0o = 3;
    public static final int o0Oo0oo = 4;
    public static final int o0ooOO0 = 0;
    public static final int o0ooOOo = 1;
    public static final int o0ooOoO = 2;
    public static final int oo0o0Oo = 6;
    public AbstractC6854lLi1LL OooO00o;
    public int o00oO0O;

    public C97411(int i, AbstractC6854lLi1LL r2) {
        this.o00oO0O = i;
        this.OooO00o = OooO00o(i, r2);
    }

    public C97411(AbstractC5903LlLLL r2) {
        int OooO00o2 = r2.OooO00o();
        this.o00oO0O = OooO00o2;
        this.OooO00o = OooO00o(OooO00o2, r2.OooO0o());
    }

    public static AbstractC6854lLi1LL OooO00o(int i, AbstractC6854lLi1LL r3) {
        switch (i) {
            case 0:
                return C6305ilIlIiI.OooO00o(r3);
            case 1:
                return Lii1ii.OooO00o(r3);
            case 2:
                return C6305ilIlIiI.OooO00o(r3);
            case 3:
                return Lii1ii.OooO00o(r3);
            case 4:
                return C9764Il1.OooO00o(r3);
            case 5:
                return C6113iIi.OooO00o(r3);
            case 6:
                return LiiLI.OooO00o(r3);
            case 7:
                return C6305ilIlIiI.OooO00o(r3);
            case 8:
                return Lii1ii.OooO00o(r3);
            case 9:
                return C6305ilIlIiI.OooO00o(r3);
            case 10:
                return lIiILl1.OooO00o(r3);
            case 11:
                return C6387iLiiI.OooO00o(r3);
            case 12:
                return C5501I1ii.OooO00o(r3);
            case 13:
                return C6305ilIlIiI.OooO00o(r3);
            case 14:
                return Lii1ii.OooO00o(r3);
            case 15:
                return l1ILIl.OooO00o(r3);
            case 16:
                return C9826LllL.OooO00o(r3);
            case 17:
                return LLL1.OooO00o(r3);
            case 18:
                return C9795I.OooO00o(r3);
            case 19:
                return C9464L1l.OooO00o(r3);
            case 20:
                return I1II.OooO00o(r3);
            case 21:
                return L11LlL.OooO00o(r3);
            case 22:
                return lILi1lLl.OooO00o(r3);
            case 23:
                return C5699Li1iLi.OooO00o(r3);
            case 24:
                return C6593lLi.OooO00o(r3);
            case 25:
                return LlLl111l.OooO00o(r3);
            case 26:
                return C1689ii.OooO00o(r3);
            default:
                throw new IllegalArgumentException("unknown tag number: " + i);
        }
    }

    public static C97411 OooO00o(Object obj) {
        if (obj == null || (obj instanceof C97411)) {
            return (C97411) obj;
        }
        if (obj instanceof AbstractC5903LlLLL) {
            return new C97411((AbstractC5903LlLLL) obj);
        }
        throw new IllegalArgumentException("Invalid object: " + obj.getClass().getName());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m21825OooO0O0() {
        return new ILI1Ll(true, this.o00oO0O, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m21826OooO0O0() {
        return this.OooO00o;
    }
}
