package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.iIii丨i  reason: invalid class name and case insensitive filesystem */
public class C6112iIiii extends AbstractC5738Lil {
    public static final BigInteger OooO00o = BigInteger.valueOf(0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f17572OooO00o;
    public int[] OooO0O0;
    public int[] OooO0OO;
    public int o00oO0O;

    public C6112iIiii(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        this.o00oO0O = i;
        this.f17572OooO00o = iArr;
        this.OooO0O0 = iArr2;
        this.OooO0OO = iArr3;
    }

    public C6112iIiii(I11li1 i11li1) {
        if (i11li1.size() == 4) {
            this.o00oO0O = OooO00o(((C6513lIiI) i11li1.OooO00o(0)).m17647OooO0O0());
            I11li1 i11li12 = (I11li1) i11li1.OooO00o(1);
            I11li1 i11li13 = (I11li1) i11li1.OooO00o(2);
            I11li1 i11li14 = (I11li1) i11li1.OooO00o(3);
            if (i11li12.size() == this.o00oO0O && i11li13.size() == this.o00oO0O && i11li14.size() == this.o00oO0O) {
                this.f17572OooO00o = new int[i11li12.size()];
                this.OooO0O0 = new int[i11li13.size()];
                this.OooO0OO = new int[i11li14.size()];
                for (int i = 0; i < this.o00oO0O; i++) {
                    this.f17572OooO00o[i] = OooO00o(((C6513lIiI) i11li12.OooO00o(i)).m17647OooO0O0());
                    this.OooO0O0[i] = OooO00o(((C6513lIiI) i11li13.OooO00o(i)).m17647OooO0O0());
                    this.OooO0OO[i] = OooO00o(((C6513lIiI) i11li14.OooO00o(i)).m17647OooO0O0());
                }
                return;
            }
            throw new IllegalArgumentException("invalid size of sequences");
        }
        throw new IllegalArgumentException("sie of seqOfParams = " + i11li1.size());
    }

    public static int OooO00o(BigInteger bigInteger) {
        if (bigInteger.compareTo(BigInteger.valueOf(2147483647L)) <= 0 && bigInteger.compareTo(OooO00o) > 0) {
            return bigInteger.intValue();
        }
        throw new IllegalArgumentException("BigInteger not in Range: " + bigInteger.toString());
    }

    public static C6112iIiii OooO00o(Object obj) {
        if (obj instanceof C6112iIiii) {
            return (C6112iIiii) obj;
        }
        if (obj != null) {
            return new C6112iIiii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public int[] OooO00o() {
        return C9586iIILl.m21635OooO00o(this.f17572OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16994OooO0O0() {
        iILLL1 r0 = new iILLL1();
        iILLL1 r1 = new iILLL1();
        iILLL1 r2 = new iILLL1();
        int i = 0;
        while (true) {
            int[] iArr = this.f17572OooO00o;
            if (i < iArr.length) {
                r0.OooO00o(new C6513lIiI((long) iArr[i]));
                r1.OooO00o(new C6513lIiI((long) this.OooO0O0[i]));
                r2.OooO00o(new C6513lIiI((long) this.OooO0OO[i]));
                i++;
            } else {
                iILLL1 r3 = new iILLL1();
                r3.OooO00o(new C6513lIiI((long) this.o00oO0O));
                r3.OooO00o(new C5707LiL1(r0));
                r3.OooO00o(new C5707LiL1(r1));
                r3.OooO00o(new C5707LiL1(r2));
                return new C5707LiL1(r3);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int[] m16995OooO0O0() {
        return C9586iIILl.m21635OooO00o(this.OooO0OO);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public int[] OooO0OO() {
        return C9586iIILl.m21635OooO00o(this.OooO0O0);
    }
}
