package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.oO0oooo0  reason: case insensitive filesystem */
public class C8003oO0oooo0 extends C7929oO0o0OoO<C8002oO0oooo> {
    public C8003oO0oooo0(@NotNull C8002oO0oooo oo0oooo) {
        super(oo0oooo);
    }

    @Nullable
    public String OooO() {
        return OooO00o(13, ReactProgressBarViewManager.DEFAULT_STYLE, "Low", "High");
    }

    @Nullable
    public String OooO00o() {
        return OooO00o(1, "Auto", "Night-scene", "Manual", null, "Multiple");
    }

    @Nullable
    public String OooO0O0() {
        return OooO00o(23, 1, ReactProgressBarViewManager.DEFAULT_STYLE, "Black & White", "Sepia");
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 1) {
            return OooO00o();
        }
        if (i == 2) {
            return OooO0oo();
        }
        if (i == 3) {
            return OooO0o();
        }
        if (i == 4) {
            return OooO0o0();
        }
        if (i == 7) {
            return OooOO0O();
        }
        if (i == 20) {
            return OooO0oO();
        }
        if (i == 23) {
            return OooO0O0();
        }
        switch (i) {
            case 10:
                return OooO0Oo();
            case 11:
                return OooOO0();
            case 12:
                return OooO0OO();
            case 13:
                return OooO();
            default:
                return super.OooO0OO(i);
        }
    }

    @Nullable
    public String OooO0Oo() {
        Float OooO00o = ((C8002oO0oooo) this.f20998OooO00o).m19638OooO00o(10);
        if (OooO00o == null) {
            return null;
        }
        if (OooO00o.floatValue() == 0.0f) {
            return "Off";
        }
        return Float.toString(OooO00o.floatValue());
    }

    @Nullable
    public String OooO0o() {
        return OooO00o(3, 2, "Custom", "Auto");
    }

    @Nullable
    public String OooO0o0() {
        return OooO00o(4, 1, "Auto", "Flash On", null, "Flash Off", null, "Red-eye Reduction");
    }

    @Nullable
    public String OooO0oO() {
        Integer OooO00o = ((C8002oO0oooo) this.f20998OooO00o).m19639OooO00o(20);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 10) {
            return "ISO 100";
        }
        if (intValue == 16) {
            return "ISO 200";
        }
        if (intValue == 100) {
            return "ISO 100";
        }
        if (intValue == 200) {
            return "ISO 200";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooO0oo() {
        return OooO00o(2, "Good", "Better", "Best");
    }

    @Nullable
    public String OooOO0() {
        return OooO00o(11, ReactProgressBarViewManager.DEFAULT_STYLE, "Soft", "Hard");
    }

    @Nullable
    public String OooOO0O() {
        return OooO00o(7, "Auto", "Daylight", "Shade", "Tungsten", "Fluorescent", "Manual");
    }

    @Nullable
    public String OooO0OO() {
        return OooO00o(12, ReactProgressBarViewManager.DEFAULT_STYLE, "Low", "High");
    }
}
