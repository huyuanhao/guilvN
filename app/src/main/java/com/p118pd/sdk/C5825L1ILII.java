package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.L丨1ILI丨I  reason: invalid class name and case insensitive filesystem */
public class C5825L1ILII extends AbstractC5738Lil implements AbstractC5462Ilil {
    public final LIIi OooO00o;
    public final LlLI1 o00OoOOo;

    public C5825L1ILII(LIIi r2) {
        this.o00OoOOo = null;
        this.OooO00o = r2;
    }

    public C5825L1ILII(LlLI1 llLI1) {
        this.o00OoOOo = llLI1;
        this.OooO00o = null;
    }

    public static C5825L1ILII OooO00o(Object obj) {
        if (obj instanceof C5825L1ILII) {
            return (C5825L1ILII) obj;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof AbstractC6854lLi1LL) {
            AbstractC6122iIlLiL OooO0O0 = ((AbstractC6854lLi1LL) obj).OooO0O0();
            if (OooO0O0 instanceof LlLI1) {
                return new C5825L1ILII(LlLI1.OooO00o((Object) OooO0O0));
            }
            if (OooO0O0 instanceof I11li1) {
                return new C5825L1ILII(LIIi.OooO00o(OooO0O0));
            }
        }
        if (obj instanceof byte[]) {
            try {
                return OooO00o(AbstractC6122iIlLiL.OooO00o((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("unknown encoding in getInstance()");
            }
        } else {
            throw new IllegalArgumentException("unknown object in getInstance(): " + obj.getClass().getName());
        }
    }

    public LIIi OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m16419OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16420OooO00o() {
        return this.o00OoOOo != null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        LlLI1 llLI1 = this.o00OoOOo;
        return llLI1 != null ? llLI1 : this.OooO00o.OooO0O0();
    }
}
