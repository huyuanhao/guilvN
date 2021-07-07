package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.LIlIlIL */
public class LIlIlIL extends AbstractC5738Lil implements AbstractC5462Ilil {
    public final C5747LilI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6101iIL f16343OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final IlL1ll1 f16344OooO00o;

    public LIlIlIL(C5747LilI r2) {
        this(null, null, r2);
    }

    public LIlIlIL(C6101iIL r2) {
        this(null, r2, null);
    }

    public LIlIlIL(IlL1ll1 r2) {
        this(r2, null, null);
    }

    public LIlIlIL(IlL1ll1 r1, C6101iIL r2, C5747LilI r3) {
        this.f16344OooO00o = r1;
        this.f16343OooO00o = r2;
        this.OooO00o = r3;
    }

    public static LIlIlIL OooO00o(Object obj) {
        if (obj instanceof LIlIlIL) {
            return (LIlIlIL) obj;
        }
        if (obj instanceof AbstractC6854lLi1LL) {
            AbstractC6122iIlLiL OooO0O0 = ((AbstractC6854lLi1LL) obj).OooO0O0();
            if (OooO0O0 instanceof C6513lIiI) {
                return new LIlIlIL(IlL1ll1.OooO00o(OooO0O0));
            }
            if (OooO0O0 instanceof I11li1) {
                return ((I11li1) OooO0O0).OooO00o(0) instanceof LlLI1 ? new LIlIlIL(C5747LilI.OooO00o(OooO0O0)) : new LIlIlIL(C6101iIL.OooO00o(OooO0O0));
            }
        } else if (obj instanceof byte[]) {
            try {
                return OooO00o(AbstractC6122iIlLiL.OooO00o((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("parsing error: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance(): " + obj.getClass().getName());
    }

    public boolean OooO00o() {
        return this.OooO00o != null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        C6101iIL r0 = this.f16343OooO00o;
        if (r0 != null) {
            return r0.OooO0O0();
        }
        IlL1ll1 r02 = this.f16344OooO00o;
        return r02 != null ? r02.OooO0O0() : this.OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16117OooO0O0() {
        return this.f16344OooO00o != null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public boolean OooO0OO() {
        return this.f16343OooO00o != null;
    }
}
