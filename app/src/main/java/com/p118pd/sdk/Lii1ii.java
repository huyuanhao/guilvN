package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Lii1i丨i  reason: invalid class name */
public class Lii1ii extends AbstractC5738Lil {
    public I11li1 OooO00o;
    public I11li1 OooO0O0;

    public Lii1ii(I11li1 i11li1) {
        int i = 1;
        if (i11li1.size() > 1) {
            this.OooO00o = I11li1.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(0), true);
        } else {
            i = 0;
        }
        this.OooO0O0 = I11li1.OooO00o(i11li1.OooO00o(i));
    }

    public Lii1ii(C9826LllL[] r5, LLIIllII[] lLIIllIIArr) {
        if (lLIIllIIArr != null) {
            if (r5 != null) {
                iILLL1 r1 = new iILLL1();
                for (C9826LllL r3 : r5) {
                    r1.OooO00o(r3);
                }
                this.OooO00o = new C5707LiL1(r1);
            }
            iILLL1 r52 = new iILLL1();
            for (LLIIllII lLIIllII : lLIIllIIArr) {
                r52.OooO00o(lLIIllII);
            }
            this.OooO0O0 = new C5707LiL1(r52);
            return;
        }
        throw new IllegalArgumentException("'response' cannot be null");
    }

    public static Lii1ii OooO00o(Object obj) {
        if (obj instanceof Lii1ii) {
            return (Lii1ii) obj;
        }
        if (obj != null) {
            return new Lii1ii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LLIIllII[] OooO00o() {
        int size = this.OooO0O0.size();
        LLIIllII[] lLIIllIIArr = new LLIIllII[size];
        for (int i = 0; i != size; i++) {
            lLIIllIIArr[i] = LLIIllII.OooO00o(this.OooO0O0.OooO00o(i));
        }
        return lLIIllIIArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9826LllL[] m16309OooO00o() {
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 == null) {
            return null;
        }
        int size = i11li1.size();
        C9826LllL[] r1 = new C9826LllL[size];
        for (int i = 0; i != size; i++) {
            r1[i] = C9826LllL.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 1, this.OooO00o));
        }
        r0.OooO00o(this.OooO0O0);
        return new C5707LiL1(r0);
    }
}
