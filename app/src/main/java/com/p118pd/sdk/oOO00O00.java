package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oOO00O00 */
public class oOO00O00 extends C7929oO0o0OoO<oOO00O0> {
    public oOO00O00(@NotNull oOO00O0 ooo00o0) {
        super(ooo00o0);
    }

    @Nullable
    private String OooO00o() {
        Long OooO00o = ((oOO00O0) this.f20998OooO00o).m19641OooO00o(2);
        if (OooO00o == null) {
            return null;
        }
        return Long.toString(OooO00o.longValue()) + " bytes";
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i != 2) {
            return super.OooO0OO(i);
        }
        return OooO00o();
    }
}
