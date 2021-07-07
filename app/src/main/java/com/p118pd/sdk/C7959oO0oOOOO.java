package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oO0oOOOO  reason: case insensitive filesystem */
public class C7959oO0oOOOO extends C7929oO0o0OoO<C7962oO0oOOo0> {
    public C7959oO0oOOOO(@NotNull C7962oO0oOOo0 oo0oooo0) {
        super(oo0oooo0);
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 0) {
            return super.OooO0OO(i);
        }
        Integer OooO00o = ((C7962oO0oOOo0) this.f20998OooO00o).m19639OooO00o(i);
        if (OooO00o == null) {
            return null;
        }
        return String.format("0x%08x", OooO00o);
    }
}
