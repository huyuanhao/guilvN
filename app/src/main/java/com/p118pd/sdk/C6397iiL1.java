package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨iL丨丨1  reason: invalid class name and case insensitive filesystem */
public class C6397iiL1 extends AbstractC5738Lil {
    public LlLI1 o00OoOOo;

    public C6397iiL1(LlLI1 llLI1) {
        this.o00OoOOo = llLI1;
    }

    public static C6397iiL1 OooO00o(Object obj) {
        if (obj instanceof C6397iiL1) {
            return (C6397iiL1) obj;
        }
        if (obj != null) {
            return new C6397iiL1(LlLI1.OooO00o(obj));
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m17517OooO0O0() {
        return this.o00OoOOo.m16387OooO0O0();
    }
}
