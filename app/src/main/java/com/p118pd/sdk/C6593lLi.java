package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lLi  reason: case insensitive filesystem */
public class C6593lLi extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public C6593lLi(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public static C6593lLi OooO00o(Object obj) {
        if (obj instanceof C6593lLi) {
            return (C6593lLi) obj;
        }
        if (obj != null) {
            return new C6593lLi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LLlIiil[] OooO00o() {
        int size = this.OooO00o.size();
        LLlIiil[] lLlIiilArr = new LLlIiil[size];
        for (int i = 0; i != size; i++) {
            lLlIiilArr[i] = LLlIiil.OooO00o(this.OooO00o.OooO00o(i));
        }
        return lLlIiilArr;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
