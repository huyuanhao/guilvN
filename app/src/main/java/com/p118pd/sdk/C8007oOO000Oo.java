package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oOO000Oo  reason: case insensitive filesystem */
public class C8007oOO000Oo extends C7929oO0o0OoO<C8009oOO000o0> {
    public C8007oOO000Oo(@NotNull C8009oOO000o0 ooo000o0) {
        super(ooo000o0);
    }

    @Nullable
    private String OooO00o() {
        String OooO0O0 = ((C8009oOO000o0) this.f20998OooO00o).OooO0O0(8);
        if (OooO0O0 == null || OooO0O0.length() == 0) {
            return null;
        }
        char charAt = OooO0O0.charAt(0);
        if (charAt == 'A') {
            return "Aperture Priority AE";
        }
        if (charAt == 'M') {
            return "Manual";
        }
        if (charAt != 'P') {
            return charAt != 'S' ? OooO0O0 : "Shutter Speed Priority AE";
        }
        return "Program AE";
    }

    @Nullable
    private String OooO0O0() {
        String OooO0O0 = ((C8009oOO000o0) this.f20998OooO00o).OooO0O0(9);
        if (OooO0O0 == null || OooO0O0.length() == 0) {
            return null;
        }
        char charAt = OooO0O0.charAt(0);
        if (charAt == '8') {
            return "Multi Segment";
        }
        if (charAt != 'A') {
            return charAt != 'C' ? OooO0O0 : "Center Weighted Average";
        }
        return "Average";
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    public String OooO0OO(int i) {
        if (i == 8) {
            return OooO00o();
        }
        if (i != 9) {
            return super.OooO0OO(i);
        }
        return OooO0O0();
    }
}
