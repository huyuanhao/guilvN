package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨Lill丨IL  reason: invalid class name and case insensitive filesystem */
public class C9515LillIL extends AbstractC5738Lil {
    public static final int o00oO0O = 1;
    public static final int o0ooOO0 = 2;
    public final C6456l1ilL OooO00o;
    public final C6456l1ilL OooO0O0;
    public final C6456l1ilL OooO0OO;

    public C9515LillIL(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
            AbstractC5903LlLLL OooO00o2 = AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(1));
            if (OooO00o2.OooO00o() == 1) {
                this.OooO0O0 = C6456l1ilL.OooO00o(OooO00o2, false);
                this.OooO0OO = null;
            } else if (OooO00o2.OooO00o() == 2) {
                this.OooO0O0 = null;
                this.OooO0OO = C6456l1ilL.OooO00o(OooO00o2, false);
            } else {
                throw new IllegalArgumentException("Unknown tag found: " + OooO00o2.OooO00o());
            }
        } else {
            throw new IllegalArgumentException("Sequence wrong size: One of signatureAlgorithm or macAlgorithm must be present");
        }
    }

    public C9515LillIL(C6456l1ilL r2, int i, C6456l1ilL r4) {
        if (r2 == null || r4 == null) {
            throw new NullPointerException("AlgorithmIdentifiers cannot be null");
        }
        this.OooO00o = r2;
        if (i == 1) {
            this.OooO0O0 = r4;
            this.OooO0OO = null;
        } else if (i == 2) {
            this.OooO0O0 = null;
            this.OooO0OO = r4;
        } else {
            throw new IllegalArgumentException("Unknown type: " + i);
        }
    }

    public static C9515LillIL OooO00o(Object obj) {
        if (obj instanceof C9515LillIL) {
            return (C9515LillIL) obj;
        }
        if (obj != null) {
            return new C9515LillIL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.OooO0O0));
        }
        if (this.OooO0OO != null) {
            r0.OooO00o(new ILI1Ll(false, 2, this.OooO0OO));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m21581OooO0O0() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public C6456l1ilL OooO0OO() {
        return this.OooO0O0;
    }
}
