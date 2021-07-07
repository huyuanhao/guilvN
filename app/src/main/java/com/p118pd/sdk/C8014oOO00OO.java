package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oOO00OO  reason: case insensitive filesystem */
public class C8014oOO00OO extends C7929oO0o0OoO<oOO00OOO> {
    public C8014oOO00OO(@NotNull oOO00OOO ooo00ooo) {
        super(ooo00ooo);
    }

    @Nullable
    public String OooO00o() {
        Integer OooO00o = ((oOO00OOO) this.f20998OooO00o).m19639OooO00o(1);
        if (OooO00o == null) {
            return null;
        }
        if (OooO00o.intValue() == 0) {
            return "Infinite";
        }
        if (OooO00o.intValue() == 1) {
            return "Once";
        }
        if (OooO00o.intValue() == 2) {
            return "Twice";
        }
        return OooO00o.toString() + " times";
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i != 1) {
            return super.OooO0OO(i);
        }
        return OooO00o();
    }
}
