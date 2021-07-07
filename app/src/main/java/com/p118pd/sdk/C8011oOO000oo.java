package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oOO000oo  reason: case insensitive filesystem */
public class C8011oOO000oo extends C7929oO0o0OoO<oOO00> {
    public C8011oOO000oo(@NotNull oOO00 ooo00) {
        super(ooo00);
    }

    @Nullable
    public String OooO00o() {
        return OooO0O0(8192, 2);
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i != 8192) {
            return super.OooO0OO(i);
        }
        return OooO00o();
    }
}
