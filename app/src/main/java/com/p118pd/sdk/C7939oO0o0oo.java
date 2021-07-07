package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oO0o0oo  reason: case insensitive filesystem */
public class C7939oO0o0oo extends C7929oO0o0OoO<C7940oO0o0ooO> {
    public C7939oO0o0oo(@NotNull C7940oO0o0ooO oo0o0ooo) {
        super(oo0o0ooo);
    }

    @Nullable
    public String OooO00o() {
        return OooO00o(30, 1, "Grayscale", "Lab", "RGB", "CMYK");
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    public String OooO0OO(int i) {
        switch (i) {
            case 28:
            case 29:
                return OooOO0O(i);
            case 30:
                return OooO00o();
            case 31:
            default:
                return ((C7940oO0o0ooO) this.f20998OooO00o).OooO0O0(i);
            case 32:
            case 33:
                return OooOO0(i);
        }
    }

    public String OooOO0(int i) {
        return ((C7940oO0o0ooO) this.f20998OooO00o).OooO0O0(i) + " bytes";
    }

    public String OooOO0O(int i) {
        return ((C7940oO0o0ooO) this.f20998OooO00o).OooO0O0(i) + " pixels";
    }
}
