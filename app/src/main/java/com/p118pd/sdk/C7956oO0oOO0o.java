package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oO0oOO0o  reason: case insensitive filesystem */
public class C7956oO0oOO0o extends C7929oO0o0OoO<C7957oO0oOOO> {
    public C7956oO0oOO0o(@NotNull C7957oO0oOOO oo0oooo) {
        super(oo0oooo);
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 1 || i == 4 || i == 7 || i == 10 || i == 13 || i == 16 || i == 19) {
            return OooOO0(i);
        }
        return super.OooO0OO(i);
    }

    @Nullable
    public String OooOO0(int i) {
        Integer OooO00o = ((C7957oO0oOOO) this.f20998OooO00o).m19639OooO00o(i);
        if (OooO00o == null) {
            return null;
        }
        return super.OooO00o(OooO00o.shortValue());
    }
}
