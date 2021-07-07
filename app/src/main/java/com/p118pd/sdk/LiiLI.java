package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LiiLI */
public class LiiLI extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public LiiLI(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public static LiiLI OooO00o(Object obj) {
        if (obj instanceof LiiLI) {
            return (LiiLI) obj;
        }
        if (obj != null) {
            return new LiiLI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6513lIiI[] OooO00o() {
        int size = this.OooO00o.size();
        C6513lIiI[] r1 = new C6513lIiI[size];
        for (int i = 0; i != size; i++) {
            r1[i] = C6513lIiI.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
