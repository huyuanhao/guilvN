package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oO0oOOo  reason: case insensitive filesystem */
public class C7961oO0oOOo extends C7929oO0o0OoO<C7963oO0oOOoO> {
    public C7961oO0oOOo(@NotNull C7963oO0oOOoO oo0ooooo) {
        super(oo0ooooo);
    }

    @Nullable
    public String OooO00o() {
        return OooO00o(10, 3, "HDR Image", "Original Image");
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i != 10) {
            return super.OooO0OO(i);
        }
        return OooO00o();
    }
}
