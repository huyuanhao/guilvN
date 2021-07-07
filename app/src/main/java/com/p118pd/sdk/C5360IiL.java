package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.IiL丨丨  reason: invalid class name and case insensitive filesystem */
public class C5360IiL extends AbstractC5738Lil implements AbstractC5462Ilil {
    public static final int o0ooOO0 = 0;
    public static final int o0ooOOo = 1;
    public static final int o0ooOoO = 2;
    public final AbstractC6854lLi1LL OooO00o;
    public final int o00oO0O = 2;

    public C5360IiL(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public C5360IiL(C5309ILiL iLiL) {
        this.OooO00o = iLiL;
    }

    public C5360IiL(LLii1I lLii1I) {
        this.OooO00o = lLii1I;
    }

    public static C5360IiL OooO00o(Object obj) {
        if (obj instanceof C5360IiL) {
            return (C5360IiL) obj;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof AbstractC6854lLi1LL) {
            AbstractC5903LlLLL OooO00o2 = AbstractC5903LlLLL.OooO00o((Object) ((AbstractC6854lLi1LL) obj).OooO0O0());
            int OooO00o3 = OooO00o2.OooO00o();
            if (OooO00o3 == 0) {
                return new C5360IiL(LLii1I.OooO00o(OooO00o2, false));
            }
            if (OooO00o3 == 1) {
                return new C5360IiL(C5309ILiL.OooO00o(OooO00o2, false));
            }
            if (OooO00o3 == 2) {
                return new C5360IiL(I11li1.OooO00o(OooO00o2, false));
            }
            throw new IllegalArgumentException("unknown tag in getInstance(): " + OooO00o2.OooO00o());
        } else if (obj instanceof byte[]) {
            try {
                return OooO00o(AbstractC6122iIlLiL.OooO00o((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("unknown encoding in getInstance()");
            }
        } else {
            throw new IllegalArgumentException("unknown object in getInstance(): " + obj.getClass().getName());
        }
    }

    public int OooO00o() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new ILI1Ll(false, this.o00oO0O, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m15610OooO0O0() {
        return this.OooO00o;
    }
}
