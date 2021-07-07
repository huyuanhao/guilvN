package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨丨丨1  reason: invalid class name and case insensitive filesystem */
public class C98661 extends AbstractC5738Lil {
    public C6903lil[] OooO00o;
    public boolean OooO0O0 = true;

    public C98661(I11li1 i11li1) {
        this.OooO00o = new C6903lil[i11li1.size()];
        int i = 0;
        while (true) {
            C6903lil[] r1 = this.OooO00o;
            if (i != r1.length) {
                r1[i] = C6903lil.OooO00o(i11li1.OooO00o(i));
                i++;
            } else {
                this.OooO0O0 = i11li1 instanceof C6351ill;
                return;
            }
        }
    }

    public C98661(C6903lil[] r2) {
        this.OooO00o = r2;
    }

    public static C98661 OooO00o(Object obj) {
        if (obj instanceof C98661) {
            return (C98661) obj;
        }
        if (obj != null) {
            return new C98661(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6903lil[] OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        int i = 0;
        while (true) {
            C6903lil[] r2 = this.OooO00o;
            if (i == r2.length) {
                break;
            }
            r0.OooO00o(r2[i]);
            i++;
        }
        return this.OooO0O0 ? new C6351ill(r0) : new C6120iIlL1(r0);
    }
}
