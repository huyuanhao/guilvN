package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L丨i  reason: invalid class name and case insensitive filesystem */
public class C5865Li extends AbstractC5738Lil {
    public final C5825L1ILII[] OooO00o;

    public C5865Li(I11li1 i11li1) {
        this.OooO00o = new C5825L1ILII[i11li1.size()];
        for (int i = 0; i != i11li1.size(); i++) {
            this.OooO00o[i] = C5825L1ILII.OooO00o(i11li1.OooO00o(i));
        }
    }

    public C5865Li(C5825L1ILII r3) {
        this.OooO00o = new C5825L1ILII[]{r3};
    }

    public C5865Li(C5825L1ILII[] r1) {
        this.OooO00o = LiI1III.OooO00o(r1);
    }

    public static C5865Li OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C5865Li OooO00o(Object obj) {
        if (obj instanceof C5865Li) {
            return (C5865Li) obj;
        }
        if (obj != null) {
            return new C5865Li(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5825L1ILII[] OooO00o() {
        return LiI1III.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C5707LiL1(this.OooO00o);
    }

    public int size() {
        return this.OooO00o.length;
    }
}
