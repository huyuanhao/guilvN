package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.LlLl111l */
public class LlLl111l extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public LlLl111l(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public LlLl111l(C6513lIiI r3) {
        this(new C5707LiL1(new C5707LiL1(r3)));
    }

    public LlLl111l(BigInteger bigInteger) {
        this(new C6513lIiI(bigInteger));
    }

    public LlLl111l(C6513lIiI[] r2) {
        this(new C5707LiL1(OooO00o(r2)));
    }

    public LlLl111l(BigInteger[] bigIntegerArr) {
        this(OooO00o(bigIntegerArr));
    }

    public static LlLl111l OooO00o(Object obj) {
        if (obj instanceof LlLl111l) {
            return (LlLl111l) obj;
        }
        if (obj != null) {
            return new LlLl111l(I11li1.OooO00o(obj));
        }
        return null;
    }

    public static C5707LiL1[] OooO00o(C6513lIiI[] r5) {
        int length = r5.length;
        C5707LiL1[] liL1Arr = new C5707LiL1[length];
        for (int i = 0; i != length; i++) {
            liL1Arr[i] = new C5707LiL1(r5[i]);
        }
        return liL1Arr;
    }

    public static C6513lIiI[] OooO00o(I11li1 i11li1) {
        int size = i11li1.size();
        C6513lIiI[] r1 = new C6513lIiI[size];
        for (int i = 0; i != size; i++) {
            r1[i] = C6513lIiI.OooO00o(i11li1.OooO00o(i));
        }
        return r1;
    }

    public static C6513lIiI[] OooO00o(BigInteger[] bigIntegerArr) {
        int length = bigIntegerArr.length;
        C6513lIiI[] r1 = new C6513lIiI[length];
        for (int i = 0; i != length; i++) {
            r1[i] = new C6513lIiI(bigIntegerArr[i]);
        }
        return r1;
    }

    public BigInteger[] OooO00o() {
        int size = this.OooO00o.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i != size; i++) {
            bigIntegerArr[i] = C6513lIiI.OooO00o(I11li1.OooO00o(this.OooO00o.OooO00o(i)).OooO00o(0)).m17647OooO0O0();
        }
        return bigIntegerArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI[][] m16396OooO00o() {
        int size = this.OooO00o.size();
        C6513lIiI[][] r1 = new C6513lIiI[size][];
        for (int i = 0; i != size; i++) {
            r1[i] = OooO00o((I11li1) this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
