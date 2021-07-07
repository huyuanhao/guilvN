package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.Lll丨I11  reason: invalid class name and case insensitive filesystem */
public class C5801LllI11 extends AbstractC5738Lil implements AbstractC5462Ilil {
    public static final int o0ooOO0 = 0;
    public final AbstractC5738Lil OooO00o;
    public final int o00oO0O;

    public C5801LllI11(IL1 il1) {
        this((AbstractC6854lLi1LL) il1);
    }

    public C5801LllI11(AbstractC6854lLi1LL r2) {
        if ((r2 instanceof I11li1) || (r2 instanceof IL1)) {
            this.o00oO0O = 0;
            this.OooO00o = IL1.OooO00o(r2);
            return;
        }
        throw new IllegalArgumentException("Unknown check object in integrity check.");
    }

    public static C5801LllI11 OooO00o(Object obj) {
        if (obj instanceof C5801LllI11) {
            return (C5801LllI11) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return new C5801LllI11(AbstractC6122iIlLiL.OooO00o((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Unable to parse integrity check details.");
            }
        } else if (obj != null) {
            return new C5801LllI11((AbstractC6854lLi1LL) obj);
        } else {
            return null;
        }
    }

    public AbstractC5738Lil OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16404OooO0O0() {
        return this.OooO00o.OooO0O0();
    }
}
