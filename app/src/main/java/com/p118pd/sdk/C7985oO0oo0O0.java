package com.p118pd.sdk;

import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: com.pd.sdk.oO0oo0O0  reason: case insensitive filesystem */
public class C7985oO0oo0O0 extends C7929oO0o0OoO<C7984oO0oo0O> {
    public C7985oO0oo0O0(@NotNull C7984oO0oo0O oo0oo0o) {
        super(oo0oo0o);
    }

    @Nullable
    public String OooO00o() {
        return OooO00o(6, "ISO80", null, "ISO160", null, "ISO320", "ISO100");
    }

    @Nullable
    public String OooO0O0() {
        return OooO00o(4, 1, "Color", "Monochrome");
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        switch (i) {
            case 3:
                return OooO0oO();
            case 4:
                return OooO0O0();
            case 5:
                return OooO0o();
            case 6:
                return OooO00o();
            case 7:
                return OooO0oo();
            case 8:
                return OooO0o0();
            case 9:
            default:
                return super.OooO0OO(i);
            case 10:
                return OooO0Oo();
            case 11:
                return OooO0OO();
        }
    }

    @Nullable
    public String OooO0Oo() {
        Rational OooO00o = ((C7984oO0oo0O) this.f20998OooO00o).m19633OooO00o(10);
        if (OooO00o == null) {
            return null;
        }
        if (OooO00o.getNumerator() == 0) {
            return "No digital zoom";
        }
        return OooO00o.toSimpleString(true) + "x digital zoom";
    }

    @Nullable
    public String OooO0o() {
        return OooO00o(5, ReactProgressBarViewManager.DEFAULT_STYLE, "Bright +", "Bright -", "Contrast +", "Contrast -");
    }

    @Nullable
    public String OooO0o0() {
        Rational OooO00o = ((C7984oO0oo0O) this.f20998OooO00o).m19633OooO00o(8);
        if (OooO00o == null) {
            return null;
        }
        return (OooO00o.getNumerator() == 1 && OooO00o.getDenominator() == 0) ? "Infinite" : OooO00o.toSimpleString(true);
    }

    @Nullable
    public String OooO0oO() {
        return OooO00o(3, 1, "VGA Basic", "VGA Normal", "VGA Fine", "SXGA Basic", "SXGA Normal", "SXGA Fine");
    }

    @Nullable
    public String OooO0oo() {
        return OooO00o(7, "Auto", "Preset", "Daylight", "Incandescence", "Florescence", "Cloudy", "SpeedLight");
    }

    @Nullable
    public String OooO0OO() {
        return OooO00o(11, "None", "Fisheye converter");
    }
}
