package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oOOOO00o  reason: case insensitive filesystem */
public class C8116oOOOO00o extends C7929oO0o0OoO<oOOOO0O0> {
    public C8116oOOOO00o(@NotNull oOOOO0O0 ooooo0o0) {
        super(ooooo0o0);
    }

    @Nullable
    public String OooO00o() {
        return OooO00o(10, 3, "24-bit color", "16 colors");
    }

    @Nullable
    public String OooO0O0() {
        return OooO00o(12, 1, "Color or B&W", "Grayscale");
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    public String OooO0OO(int i) {
        if (i == 1) {
            return OooO0OO();
        }
        if (i == 10) {
            return OooO00o();
        }
        if (i != 12) {
            return super.OooO0OO(i);
        }
        return OooO0O0();
    }

    @Nullable
    public String OooO0OO() {
        return OooO00o(1, "2.5 with fixed EGA palette information", null, "2.8 with modifiable EGA palette information", "2.8 without palette information (default palette)", "PC Paintbrush for Windows", "3.0 or better");
    }
}
