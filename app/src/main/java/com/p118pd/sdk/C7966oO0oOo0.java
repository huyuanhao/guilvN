package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.oO0oOo0  reason: case insensitive filesystem */
public class C7966oO0oOo0 extends C7929oO0o0OoO<C7970oO0oOo0O> {
    public C7966oO0oOo0(@NotNull C7970oO0oOo0O oo0ooo0o) {
        super(oo0ooo0o);
    }

    @Nullable
    public String OooO() {
        return OooO00o(1, 1, "Single shutter", "Panorama", "Night scene", "Portrait", "Landscape");
    }

    @Nullable
    public String OooO00o() {
        Integer OooO00o = ((C7970oO0oOo0O) this.f20998OooO00o).m19639OooO00o(20);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 64) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 80) {
            return "Normal (ISO 80 equivalent)";
        }
        if (intValue == 100) {
            return "High";
        }
        if (intValue == 125) {
            return "+1.0";
        }
        if (intValue == 244) {
            return "+3.0";
        }
        if (intValue == 250) {
            return "+2.0";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooO0O0() {
        return OooO00o(12, ReactProgressBarViewManager.DEFAULT_STYLE, "Low", "High");
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 20) {
            return OooO00o();
        }
        switch (i) {
            case 1:
                return OooO();
            case 2:
                return OooO0oo();
            case 3:
                return OooO0o();
            case 4:
                return OooO0o0();
            case 5:
                return OooO0Oo();
            case 6:
                return OooO0oO();
            case 7:
                return OooOO0o();
            default:
                switch (i) {
                    case 10:
                        return OooO0OO();
                    case 11:
                        return OooOO0O();
                    case 12:
                        return OooO0O0();
                    case 13:
                        return OooOO0();
                    default:
                        return super.OooO0OO(i);
                }
        }
    }

    @Nullable
    public String OooO0Oo() {
        Integer OooO00o = ((C7970oO0oOo0O) this.f20998OooO00o).m19639OooO00o(5);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 11) {
            return "Weak";
        }
        if (intValue == 13) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 15) {
            return "Strong";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooO0o() {
        return OooO00o(3, 2, "Macro", "Auto focus", "Manual focus", "Infinity");
    }

    @Nullable
    public String OooO0o0() {
        return OooO00o(4, 1, "Auto", "On", "Off", "Red eye reduction");
    }

    @Nullable
    public String OooO0oO() {
        Integer OooO00o = ((C7970oO0oOo0O) this.f20998OooO00o).m19639OooO00o(6);
        if (OooO00o == null) {
            return null;
        }
        return C7929oO0o0OoO.OooO0O0((double) OooO00o.intValue());
    }

    @Nullable
    public String OooO0oo() {
        return OooO00o(2, 1, "Economy", ReactProgressBarViewManager.DEFAULT_STYLE, "Fine");
    }

    @Nullable
    public String OooOO0() {
        return OooO00o(13, ReactProgressBarViewManager.DEFAULT_STYLE, "Low", "High");
    }

    @Nullable
    public String OooOO0O() {
        return OooO00o(11, ReactProgressBarViewManager.DEFAULT_STYLE, "Soft", "Hard");
    }

    @Nullable
    public String OooOO0o() {
        Integer OooO00o = ((C7970oO0oOo0O) this.f20998OooO00o).m19639OooO00o(7);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 1) {
            return "Auto";
        }
        if (intValue == 2) {
            return "Tungsten";
        }
        if (intValue == 3) {
            return "Daylight";
        }
        if (intValue == 4) {
            return "Florescent";
        }
        if (intValue == 5) {
            return "Shade";
        }
        if (intValue == 129) {
            return "Manual";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooO0OO() {
        Integer OooO00o = ((C7970oO0oOo0O) this.f20998OooO00o).m19639OooO00o(10);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 65536) {
            return "No digital zoom";
        }
        if (intValue == 65537 || intValue == 131072) {
            return "2x digital zoom";
        }
        if (intValue == 262144) {
            return "4x digital zoom";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }
}
