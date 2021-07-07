package com.p118pd.sdk;

import java.util.Arrays;

/* renamed from: com.pd.sdk.丨丨lLILiL  reason: invalid class name and case insensitive filesystem */
public class C9856lLILiL extends AbstractC5738Lil {
    public C9879iI[] OooO00o;
    public boolean OooO0O0 = false;
    public boolean OooO0OO = false;
    public boolean OooO0Oo = false;

    public C9856lLILiL(C9879iI[] r2) {
        this.OooO00o = r2;
    }

    public C9856lLILiL(C9879iI[] r2, boolean z, boolean z2, boolean z3) {
        this.OooO00o = r2;
        this.OooO0O0 = z;
        this.OooO0OO = z2;
        this.OooO0Oo = z3;
    }

    public static C9856lLILiL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o((Object) I11li1.OooO00o(r0, z));
    }

    public static C9856lLILiL OooO00o(Object obj) {
        if (obj instanceof C9856lLILiL) {
            return (C9856lLILiL) obj;
        }
        if (obj == null) {
            return null;
        }
        I11li1 OooO00o2 = I11li1.OooO00o(obj);
        C9856lLILiL r2 = new C9856lLILiL(OooO00o(I11li1.OooO00o(OooO00o2.OooO00o(0))));
        for (int i = 1; i < OooO00o2.size(); i++) {
            AbstractC6854lLi1LL OooO00o3 = OooO00o2.OooO00o(i);
            if (OooO00o3 instanceof C5514IL) {
                r2.OooO0OO(C5514IL.OooO00o(OooO00o3).m15792OooO0O0());
            } else if (!(OooO00o3 instanceof AbstractC5903LlLLL)) {
                continue;
            } else {
                AbstractC5903LlLLL OooO00o4 = AbstractC5903LlLLL.OooO00o(OooO00o3);
                int OooO00o5 = OooO00o4.OooO00o();
                if (OooO00o5 == 0) {
                    r2.OooO00o(C5514IL.OooO00o(OooO00o4, false).m15792OooO0O0());
                } else if (OooO00o5 == 1) {
                    r2.OooO0O0(C5514IL.OooO00o(OooO00o4, false).m15792OooO0O0());
                } else {
                    throw new IllegalArgumentException("Unknown tag encountered: " + OooO00o4.OooO00o());
                }
            }
        }
        return r2;
    }

    private void OooO00o(boolean z) {
        this.OooO0OO = z;
    }

    public static C9879iI[] OooO00o(I11li1 i11li1) {
        int size = i11li1.size();
        C9879iI[] r1 = new C9879iI[size];
        for (int i = 0; i != size; i++) {
            r1[i] = C9879iI.OooO00o(i11li1.OooO00o(i));
        }
        return r1;
    }

    private void OooO0O0(boolean z) {
        this.OooO0Oo = z;
    }

    private void OooO0OO(boolean z) {
        this.OooO0O0 = z;
    }

    public boolean OooO00o() {
        return this.OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9879iI[] m21938OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        iILLL1 r1 = new iILLL1();
        int i = 0;
        while (true) {
            C9879iI[] r4 = this.OooO00o;
            if (i == r4.length) {
                break;
            }
            r1.OooO00o(r4[i]);
            i++;
        }
        r0.OooO00o(new C5707LiL1(r1));
        boolean z = this.OooO0O0;
        if (z) {
            r0.OooO00o(C5514IL.OooO00o(z));
        }
        if (this.OooO0OO) {
            r0.OooO00o(new ILI1Ll(false, 0, C5514IL.OooO00o(this.OooO0OO)));
        }
        if (this.OooO0Oo) {
            r0.OooO00o(new ILI1Ll(false, 1, C5514IL.OooO00o(this.OooO0Oo)));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21939OooO0O0() {
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public boolean OooO0OO() {
        return this.OooO0O0;
    }

    public String toString() {
        return "PathProcInput: {\nacceptablePolicySet: " + Arrays.asList(this.OooO00o) + "\ninhibitPolicyMapping: " + this.OooO0O0 + "\nexplicitPolicyReqd: " + this.OooO0OO + "\ninhibitAnyPolicy: " + this.OooO0Oo + "\n}\n";
    }
}
