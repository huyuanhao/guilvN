package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.liilIl1 */
public class liilIl1 extends AbstractC5738Lil implements AbstractC5420Il1iIL {
    public AbstractC6122iIlLiL OooO00o;
    public LlLI1 o00OoOOo;

    public liilIl1(int i, int i2) {
        this(i, i2, 0, 0);
    }

    public liilIl1(int i, int i2, int i3, int i4) {
        this.o00OoOOo = AbstractC5420Il1iIL.o00O0Oo;
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI((long) i));
        if (i3 == 0) {
            if (i4 == 0) {
                r0.OooO00o(AbstractC5420Il1iIL.o00O0Ooo);
                r0.OooO00o(new C6513lIiI((long) i2));
            } else {
                throw new IllegalArgumentException("inconsistent k values");
            }
        } else if (i3 <= i2 || i4 <= i3) {
            throw new IllegalArgumentException("inconsistent k values");
        } else {
            r0.OooO00o(AbstractC5420Il1iIL.o00O0o00);
            iILLL1 r5 = new iILLL1();
            r5.OooO00o(new C6513lIiI((long) i2));
            r5.OooO00o(new C6513lIiI((long) i3));
            r5.OooO00o(new C6513lIiI((long) i4));
            r0.OooO00o(new C5707LiL1(r5));
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public liilIl1(I11li1 i11li1) {
        this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = i11li1.OooO00o(1).OooO0O0();
    }

    public liilIl1(BigInteger bigInteger) {
        this.o00OoOOo = AbstractC5420Il1iIL.oo0oOO0;
        this.OooO00o = new C6513lIiI(bigInteger);
    }

    public static liilIl1 OooO00o(Object obj) {
        if (obj instanceof liilIl1) {
            return (liilIl1) obj;
        }
        if (obj != null) {
            return new liilIl1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }

    public AbstractC6122iIlLiL OooO0Oo() {
        return this.OooO00o;
    }
}
