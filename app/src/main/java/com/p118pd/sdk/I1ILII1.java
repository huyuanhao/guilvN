package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I1IL丨II1  reason: invalid class name */
public class I1ILII1 extends AbstractC5738Lil {
    public I11li1 OooO00o;
    public LlLI1 o00OoOOo;

    public I1ILII1(I11li1 i11li1) {
        this.o00OoOOo = (LlLI1) i11li1.OooO00o(0);
        if (i11li1.size() > 1) {
            this.OooO00o = (I11li1) i11li1.OooO00o(1);
        }
    }

    public I1ILII1(LlLI1 llLI1) {
        this.o00OoOOo = llLI1;
    }

    public I1ILII1(LlLI1 llLI1, I11li1 i11li1) {
        this.o00OoOOo = llLI1;
        this.OooO00o = i11li1;
    }

    public static I1ILII1 OooO00o(Object obj) {
        return (obj == null || (obj instanceof I1ILII1)) ? (I1ILII1) obj : new I1ILII1(I11li1.OooO00o(obj));
    }

    public I11li1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m15268OooO00o() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 != null) {
            r0.OooO00o(i11li1);
        }
        return new C5707LiL1(r0);
    }
}
