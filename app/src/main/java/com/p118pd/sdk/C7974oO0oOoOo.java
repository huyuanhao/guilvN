package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.oO0oOoOo  reason: case insensitive filesystem */
public class C7974oO0oOoOo extends C7929oO0o0OoO<C7976oO0oOoo0> {
    public C7974oO0oOoOo(@NotNull C7976oO0oOoo0 oo0oooo0) {
        super(oo0oooo0);
    }

    @Nullable
    public String OooO() {
        return OooO00o(64, "Auto", ExifInterface.f14327oo000o, "Tungsten", "Daylight");
    }

    @Nullable
    public String OooO00o() {
        return OooO00o(10, "Off", "On");
    }

    @Nullable
    public String OooO0O0() {
        Integer OooO00o = ((C7976oO0oOoo0) this.f20998OooO00o).m19639OooO00o(102);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 1) {
            return "B&W";
        }
        if (intValue == 2) {
            return "Sepia";
        }
        if (intValue == 3) {
            return "B&W Yellow Filter";
        }
        if (intValue == 4) {
            return "B&W Red Filter";
        }
        if (intValue == 32) {
            return "Saturated Color";
        }
        if (intValue == 64) {
            return "Neutral Color";
        }
        if (intValue == 256) {
            return "Saturated Color";
        }
        if (intValue == 512) {
            return "Neutral Color";
        }
        if (intValue == 8192) {
            return "B&W";
        }
        if (intValue == 16384) {
            return "Sepia";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 9) {
            return OooO0o();
        }
        if (i == 10) {
            return OooO00o();
        }
        if (i == 27) {
            return OooO0oo();
        }
        if (i == 56) {
            return OooO0o0();
        }
        if (i == 64) {
            return OooO();
        }
        if (i == 102) {
            return OooO0O0();
        }
        if (i == 107) {
            return OooO0oO();
        }
        if (i == 92) {
            return OooO0Oo();
        }
        if (i != 93) {
            return super.OooO0OO(i);
        }
        return OooO0OO();
    }

    @Nullable
    public String OooO0Oo() {
        Integer OooO00o = ((C7976oO0oOoo0) this.f20998OooO00o).m19639OooO00o(92);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Auto";
        }
        if (intValue == 1) {
            return "Fill Flash";
        }
        if (intValue == 2) {
            return "Off";
        }
        if (intValue == 3) {
            return "Red Eye";
        }
        if (intValue == 16) {
            return "Fill Flash";
        }
        if (intValue == 32) {
            return "Off";
        }
        if (intValue == 64) {
            return "Red Eye";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooO0o() {
        return OooO00o(9, 1, "Fine", ReactProgressBarViewManager.DEFAULT_STYLE);
    }

    @Nullable
    public String OooO0o0() {
        return OooO00o(56, ReactProgressBarViewManager.DEFAULT_STYLE, null, "Macro");
    }

    @Nullable
    public String OooO0oO() {
        return OooO00o(107, ReactProgressBarViewManager.DEFAULT_STYLE);
    }

    @Nullable
    public String OooO0oo() {
        Integer OooO00o = ((C7976oO0oOoo0) this.f20998OooO00o).m19639OooO00o(27);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Auto";
        }
        if (intValue == 8) {
            return "Aperture Priority";
        }
        if (intValue == 32) {
            return "Manual";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooO0OO() {
        return OooO00o(93, "No", "Yes");
    }
}
