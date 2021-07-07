package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I11II丨i  reason: invalid class name */
public class I11IIi extends AbstractC5738Lil {
    public final C6845lLIL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LilIiIl[] f15270OooO00o;

    public I11IIi(I11li1 i11li1) {
        int i = 0;
        this.OooO00o = C6845lLIL.OooO00o(i11li1.OooO00o(0));
        I11li1 OooO00o2 = I11li1.OooO00o(i11li1.OooO00o(1));
        this.f15270OooO00o = new LilIiIl[OooO00o2.size()];
        while (true) {
            LilIiIl[] lilIiIlArr = this.f15270OooO00o;
            if (i != lilIiIlArr.length) {
                lilIiIlArr[i] = LilIiIl.OooO00o(OooO00o2.OooO00o(i));
                i++;
            } else {
                return;
            }
        }
    }

    public I11IIi(C6845lLIL r3, LilIiIl[] lilIiIlArr) {
        this.OooO00o = r3;
        LilIiIl[] lilIiIlArr2 = new LilIiIl[lilIiIlArr.length];
        this.f15270OooO00o = lilIiIlArr2;
        System.arraycopy(lilIiIlArr, 0, lilIiIlArr2, 0, lilIiIlArr.length);
    }

    public static I11IIi OooO00o(Object obj) {
        if (obj instanceof I11IIi) {
            return (I11IIi) obj;
        }
        if (obj != null) {
            return new I11IIi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6845lLIL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LilIiIl[] m15214OooO00o() {
        LilIiIl[] lilIiIlArr = this.f15270OooO00o;
        LilIiIl[] lilIiIlArr2 = new LilIiIl[lilIiIlArr.length];
        System.arraycopy(lilIiIlArr, 0, lilIiIlArr2, 0, lilIiIlArr.length);
        return lilIiIlArr2;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(new C5707LiL1(this.f15270OooO00o));
        return new C5707LiL1(r0);
    }
}
