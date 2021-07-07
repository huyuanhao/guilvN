package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨LIL1li  reason: invalid class name and case insensitive filesystem */
public class C9476LIL1li extends AbstractC5738Lil {
    public I11L OooO00o;
    public LlLI1 o00OoOOo;

    public C9476LIL1li(I11li1 i11li1) {
        this.o00OoOOo = (LlLI1) i11li1.OooO00o(0);
        this.OooO00o = (I11L) i11li1.OooO00o(1);
    }

    public C9476LIL1li(LlLI1 llLI1, I11L i11l) {
        this.o00OoOOo = llLI1;
        this.OooO00o = i11l;
    }

    public static C9476LIL1li OooO00o(Object obj) {
        if (obj instanceof C9476LIL1li) {
            return (C9476LIL1li) obj;
        }
        if (obj != null) {
            return new C9476LIL1li(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11L OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m21530OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6854lLi1LL[] m21531OooO00o() {
        return this.OooO00o.m15218OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
