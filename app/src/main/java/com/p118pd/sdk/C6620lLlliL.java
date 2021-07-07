package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lLlliL  reason: case insensitive filesystem */
public class C6620lLlliL extends AbstractC5738Lil implements AbstractC5462Ilil {
    public AbstractC6122iIlLiL OooO00o = null;

    public C6620lLlliL(AbstractC5335ILl r2) {
        this.OooO00o = r2;
    }

    public C6620lLlliL(LlLI1 llLI1) {
        this.OooO00o = llLI1;
    }

    public C6620lLlliL(AbstractC6122iIlLiL iillil) {
        this.OooO00o = iillil;
    }

    public C6620lLlliL(C9387Iill r2) {
        this.OooO00o = r2.OooO0O0();
    }

    public static C6620lLlliL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(r0.OooO0o());
    }

    public static C6620lLlliL OooO00o(Object obj) {
        if (obj == null || (obj instanceof C6620lLlliL)) {
            return (C6620lLlliL) obj;
        }
        if (obj instanceof AbstractC6122iIlLiL) {
            return new C6620lLlliL((AbstractC6122iIlLiL) obj);
        }
        if (obj instanceof byte[]) {
            try {
                return new C6620lLlliL(AbstractC6122iIlLiL.OooO00o((byte[]) obj));
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse encoded data: " + e.getMessage());
            }
        } else {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
    }

    public boolean OooO00o() {
        return this.OooO00o instanceof AbstractC5335ILl;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m17705OooO0O0() {
        return this.OooO00o instanceof LlLI1;
    }

    public AbstractC6122iIlLiL OooO0Oo() {
        return this.OooO00o;
    }
}
