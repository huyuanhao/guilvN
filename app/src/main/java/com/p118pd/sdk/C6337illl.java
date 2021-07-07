package com.p118pd.sdk;

/* renamed from: com.pd.sdk.illl  reason: case insensitive filesystem */
public class C6337illl extends AbstractC5738Lil {
    public final C5360IiL[] OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final IlILil[] f18075OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5457Ili[] f18076OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6448l1L[] f18077OooO00o;

    public C6337illl(I11li1 i11li1) {
        if (i11li1.size() == 4) {
            int i = 0;
            I11li1 i11li12 = (I11li1) i11li1.OooO00o(0);
            this.f18075OooO00o = new IlILil[i11li12.size()];
            int i2 = 0;
            while (true) {
                IlILil[] r3 = this.f18075OooO00o;
                if (i2 >= r3.length) {
                    break;
                }
                r3[i2] = IlILil.OooO00o(i11li12.OooO00o(i2));
                i2++;
            }
            I11li1 i11li13 = (I11li1) i11li1.OooO00o(1);
            this.OooO00o = new C5360IiL[i11li13.size()];
            int i3 = 0;
            while (true) {
                C5360IiL[] r32 = this.OooO00o;
                if (i3 >= r32.length) {
                    break;
                }
                r32[i3] = C5360IiL.OooO00o(i11li13.OooO00o(i3));
                i3++;
            }
            I11li1 i11li14 = (I11li1) i11li1.OooO00o(2);
            this.f18076OooO00o = new C5457Ili[i11li14.size()];
            int i4 = 0;
            while (true) {
                C5457Ili[] iliArr = this.f18076OooO00o;
                if (i4 >= iliArr.length) {
                    break;
                }
                iliArr[i4] = C5457Ili.OooO00o(i11li14.OooO00o(i4));
                i4++;
            }
            I11li1 i11li15 = (I11li1) i11li1.OooO00o(3);
            this.f18077OooO00o = new C6448l1L[i11li15.size()];
            while (true) {
                C6448l1L[] l1lArr = this.f18077OooO00o;
                if (i < l1lArr.length) {
                    l1lArr[i] = C6448l1L.OooO00o(i11li15.OooO00o(i));
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sequence not 4 elements.");
        }
    }

    public C6337illl(IlILil[] r1, C5360IiL[] r2, C5457Ili[] iliArr, C6448l1L[] l1lArr) {
        this.f18075OooO00o = r1;
        this.OooO00o = r2;
        this.f18076OooO00o = iliArr;
        this.f18077OooO00o = l1lArr;
    }

    public static C6337illl OooO00o(Object obj) {
        if (obj instanceof C6337illl) {
            return (C6337illl) obj;
        }
        if (obj != null) {
            return new C6337illl(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5360IiL[] OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public IlILil[] m17397OooO00o() {
        return this.f18075OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5457Ili[] m17398OooO00o() {
        return this.f18076OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6448l1L[] m17399OooO00o() {
        return this.f18077OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C5707LiL1(new AbstractC6854lLi1LL[]{new C5707LiL1(this.f18075OooO00o), new C5707LiL1(this.OooO00o), new C5707LiL1(this.f18076OooO00o), new C5707LiL1(this.f18077OooO00o)});
    }
}
