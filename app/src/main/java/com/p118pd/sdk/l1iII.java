package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l1i丨I丨I丨  reason: invalid class name */
public class l1iII extends AbstractC5738Lil {
    public I11L OooO00o;

    public l1iII(I11L i11l) {
        this.OooO00o = i11l;
    }

    public l1iII(iILLL1 r2) {
        this.OooO00o = new C9361ILI(r2);
    }

    public static l1iII OooO00o(Object obj) {
        if (obj instanceof l1iII) {
            return (l1iII) obj;
        }
        if (obj != null) {
            return new l1iII(I11L.OooO00o(obj));
        }
        return null;
    }

    public C9476LIL1li[] OooO00o() {
        int size = this.OooO00o.size();
        C9476LIL1li[] r1 = new C9476LIL1li[size];
        for (int i = 0; i != size; i++) {
            r1[i] = C9476LIL1li.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
