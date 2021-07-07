package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oO0o0o0O  reason: case insensitive filesystem */
public class C7934oO0o0o0O extends C7929oO0o0OoO<C7935oO0o0o0o> {
    public C7934oO0o0o0O(@NotNull C7935oO0o0o0o oo0o0o0o) {
        super(oo0o0o0o);
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 6 || i == 7) {
            return OooOO0(i);
        }
        return super.OooO0OO(i);
    }

    public String OooOO0(int i) {
        return ((C7935oO0o0o0o) this.f20998OooO00o).OooO0O0(i) + " pixels";
    }
}
