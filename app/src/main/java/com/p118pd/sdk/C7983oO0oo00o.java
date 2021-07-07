package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oO0oo00o  reason: case insensitive filesystem */
public class C7983oO0oo00o extends C7929oO0o0OoO<C7980oO0oo0> {
    public C7983oO0oo00o(@NotNull C7980oO0oo0 oo0oo0) {
        super(oo0oo0);
    }

    @Nullable
    public String OooO00o() {
        byte[] OooO00o = ((C7980oO0oo0) this.f20998OooO00o).m19651OooO00o(1037);
        if (OooO00o == null || OooO00o.length < 4) {
            return null;
        }
        String format = String.format("%d %d %d %d", Byte.valueOf(OooO00o[0]), Byte.valueOf(OooO00o[1]), Byte.valueOf(OooO00o[2]), Byte.valueOf(OooO00o[3]));
        if (format.equals("0 0 0 0")) {
            return "Program AE";
        }
        if (format.equals("1 0 0 0")) {
            return "Aperture-priority AE";
        }
        if (format.equals("1 1 0 0")) {
            return "Aperture-priority AE (1)";
        }
        if (format.equals("2 0 0 0")) {
            return "Shutter speed priority AE";
        }
        if (format.equals("3 0 0 0")) {
            return "Manual";
        }
        return String.format("Unknown (%s)", format);
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i != 1037) {
            return super.OooO0OO(i);
        }
        return OooO00o();
    }
}
