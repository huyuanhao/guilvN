package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨iIli1  reason: invalid class name and case insensitive filesystem */
public class C9591iIli1 extends AbstractC5738Lil {
    public final C5237III[] OooO00o;

    public C9591iIli1(I11li1 i11li1) {
        this.OooO00o = new C5237III[i11li1.size()];
        for (int i = 0; i != i11li1.size(); i++) {
            this.OooO00o[i] = C5237III.OooO00o(i11li1.OooO00o(i));
        }
    }

    public C9591iIli1(C5237III r3) {
        this.OooO00o = new C5237III[]{r3};
    }

    public C9591iIli1(C5237III[] r1) {
        this.OooO00o = LIIIiI.OooO00o(r1);
    }

    public static C9591iIli1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C9591iIli1 OooO00o(Object obj) {
        if (obj instanceof C9591iIli1) {
            return (C9591iIli1) obj;
        }
        if (obj != null) {
            return new C9591iIli1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5237III[] OooO00o() {
        return LIIIiI.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C5707LiL1(this.OooO00o);
    }
}
