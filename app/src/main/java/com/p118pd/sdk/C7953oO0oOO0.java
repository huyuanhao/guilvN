package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oO0oOO0  reason: case insensitive filesystem */
public class C7953oO0oOO0 extends C7929oO0o0OoO<C7955oO0oOO0O> {
    public C7953oO0oOO0(@NotNull C7955oO0oOO0O oo0ooo0o) {
        super(oo0ooo0o);
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 1 || i == 5 || i == 9 || i == 13 || i == 17 || i == 21 || i == 25) {
            return OooOO0(i);
        }
        return super.OooO0OO(i);
    }

    @Nullable
    public String OooOO0(int i) {
        Integer OooO00o = ((C7955oO0oOO0O) this.f20998OooO00o).m19639OooO00o(i);
        if (OooO00o == null) {
            return null;
        }
        return super.OooO00o(OooO00o.shortValue());
    }
}
