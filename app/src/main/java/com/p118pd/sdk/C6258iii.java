package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iii  reason: case insensitive filesystem */
public class C6258iii extends AbstractC5738Lil implements AbstractC5462Ilil {
    public static final boolean[] OooO00o = {false, true, false, true, false, true, false, false, true};
    public static final int o000OOo = 8;
    public static final int o0O0O00 = 7;
    public static final int o0OO00O = 5;
    public static final int o0OOO0o = 3;
    public static final int o0Oo0oo = 4;
    public static final int o0ooOO0 = 0;
    public static final int o0ooOOo = 1;
    public static final int o0ooOoO = 2;
    public static final int oo0o0Oo = 6;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5237III f17898OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6854lLi1LL f17899OooO00o;
    public int o00oO0O;

    public C6258iii(int i, AbstractC6854lLi1LL r2) {
        this.o00oO0O = i;
        this.f17899OooO00o = r2;
    }

    public C6258iii(C5237III r2) {
        this.o00oO0O = -1;
        this.f17898OooO00o = r2;
    }

    public C6258iii(AbstractC5903LlLLL r3) {
        AbstractC6854lLi1LL r32;
        int OooO00o2 = r3.OooO00o();
        this.o00oO0O = OooO00o2;
        switch (OooO00o2) {
            case 0:
                r32 = LilIiIl.OooO00o(r3, false);
                break;
            case 1:
                r32 = i1Ii11l.OooO00o(r3.OooO0o());
                break;
            case 2:
                r32 = II1LL.OooO00o(r3, false);
                break;
            case 3:
                r32 = C5753LiI1.OooO00o(r3.OooO0o());
                break;
            case 4:
                r32 = C5190I1lIiL.OooO00o(r3, false);
                break;
            case 5:
                r32 = C9450IL1L.OooO00o(r3.OooO0o());
                break;
            case 6:
                r32 = C6353i1.OooO00o(r3, false);
                break;
            case 7:
                r32 = C6682liLi.OooO00o(r3, false);
                break;
            case 8:
                r32 = C6789lll.OooO00o(r3.OooO0o());
                break;
            default:
                throw new IllegalArgumentException("Unknown tag: " + this.o00oO0O);
        }
        this.f17899OooO00o = r32;
    }

    public static C6258iii OooO00o(Object obj) {
        if (obj instanceof C6258iii) {
            return (C6258iii) obj;
        }
        if (obj instanceof AbstractC5903LlLLL) {
            return new C6258iii((AbstractC5903LlLLL) obj);
        }
        if (obj != null) {
            return new C6258iii(C5237III.OooO00o(obj));
        }
        return null;
    }

    public static C6258iii[] OooO00o(I11li1 i11li1) {
        int size = i11li1.size();
        C6258iii[] iiiArr = new C6258iii[size];
        for (int i = 0; i != size; i++) {
            iiiArr[i] = OooO00o(i11li1.OooO00o(i));
        }
        return iiiArr;
    }

    public int OooO00o() {
        return this.o00oO0O;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5237III m17265OooO00o() {
        return this.f17898OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        C5237III r0 = this.f17898OooO00o;
        if (r0 != null) {
            return r0.OooO0O0();
        }
        boolean[] zArr = OooO00o;
        int i = this.o00oO0O;
        return new ILI1Ll(zArr[i], i, this.f17899OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m17266OooO0O0() {
        return this.f17899OooO00o;
    }

    public String toString() {
        return "CertEtcToken {\n" + this.f17899OooO00o + "}\n";
    }
}
