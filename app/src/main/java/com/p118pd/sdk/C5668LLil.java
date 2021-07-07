package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.LLi丨l  reason: invalid class name and case insensitive filesystem */
public class C5668LLil extends AbstractC5738Lil implements AbstractC5462Ilil {
    public final C6518lIlIl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9863l1L f16499OooO00o;

    public C5668LLil(C6518lIlIl lilil) {
        this.OooO00o = lilil;
        this.f16499OooO00o = null;
    }

    public C5668LLil(C9863l1L r2) {
        this.OooO00o = null;
        this.f16499OooO00o = r2;
    }

    public static C5668LLil OooO00o(Object obj) {
        if (obj instanceof C5668LLil) {
            return (C5668LLil) obj;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof AbstractC6854lLi1LL) {
            AbstractC6122iIlLiL OooO0O0 = ((AbstractC6854lLi1LL) obj).OooO0O0();
            if (OooO0O0 instanceof C6513lIiI) {
                return new C5668LLil(C6518lIlIl.OooO00o(OooO0O0));
            }
            if (OooO0O0 instanceof I11li1) {
                return new C5668LLil(C9863l1L.OooO00o(OooO0O0));
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

    public C6518lIlIl OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9863l1L m16238OooO00o() {
        return this.f16499OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16239OooO00o() {
        return this.OooO00o != null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        C6518lIlIl lilil = this.OooO00o;
        return lilil != null ? lilil.OooO0O0() : this.f16499OooO00o.OooO0O0();
    }
}
