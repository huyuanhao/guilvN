package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.ooOOoOOO  reason: case insensitive filesystem */
public class C8980ooOOoOOO extends AbstractC7915oO0o<C7949oO0oO0Oo> {
    public C8980ooOOoOOO(@NotNull C7949oO0oO0Oo oo0oo0oo) {
        super(oo0oo0oo);
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO, com.p118pd.sdk.AbstractC7915oO0o
    @Nullable
    public String OooO0OO(int i) {
        if (i == 513) {
            return o00oO0O();
        }
        if (i != 514) {
            return super.OooO0OO(i);
        }
        return o00oO0o();
    }

    @Nullable
    public String o00oO0O() {
        String OooO0O0 = ((C7949oO0oO0Oo) this.f20998OooO00o).OooO0O0(513);
        if (OooO0O0 == null) {
            return null;
        }
        return OooO0O0 + " bytes";
    }

    @Nullable
    public String o00oO0o() {
        String OooO0O0 = ((C7949oO0oO0Oo) this.f20998OooO00o).OooO0O0(514);
        if (OooO0O0 == null) {
            return null;
        }
        return OooO0O0 + " bytes";
    }
}
