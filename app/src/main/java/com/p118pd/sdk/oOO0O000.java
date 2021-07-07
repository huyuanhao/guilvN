package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oOO0O000 */
public class oOO0O000 extends C7929oO0o0OoO<oOO0O00O> {
    public oOO0O000(@NotNull oOO0O00O ooo0o00o) {
        super(ooo0o00o);
    }

    @Nullable
    public String OooO00o() {
        Integer OooO00o = ((oOO0O00O) this.f20998OooO00o).m19639OooO00o(5);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 16) {
            return "Thumbnail coded using JPEG";
        }
        if (intValue == 17) {
            return "Thumbnail stored using 1 byte/pixel";
        }
        if (intValue == 19) {
            return "Thumbnail stored using 3 bytes/pixel";
        }
        return "Unknown extension code " + OooO00o;
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i != 5) {
            return super.OooO0OO(i);
        }
        return OooO00o();
    }
}
