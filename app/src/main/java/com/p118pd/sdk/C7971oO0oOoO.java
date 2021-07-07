package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.oO0oOoO  reason: case insensitive filesystem */
public class C7971oO0oOoO extends C7929oO0o0OoO<C7978oO0oOooo> {
    public C7971oO0oOoO(@NotNull C7978oO0oOooo oo0ooooo) {
        super(oo0ooooo);
    }

    @Nullable
    private String OooOo() {
        return OooO0O0(0, 2);
    }

    @Nullable
    public String OooO() {
        Integer OooO00o = ((C7978oO0oOooo) this.f20998OooO00o).m19639OooO00o(4148);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 256) {
            return "HR (High Resolution)";
        }
        if (intValue == 512) {
            return "SN (Signal to Noise Priority)";
        }
        if (intValue == 768) {
            return "DR (Dynamic Range Priority)";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooO00o() {
        return OooO00o(4352, "Off", "On", "No Flash & Flash");
    }

    @Nullable
    public String OooO0O0() {
        return OooO00o(C7978oO0oOooo.OooOoOO, "AE Good", "Over Exposed");
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 0) {
            return OooOo();
        }
        if (i == 4102) {
            return OooO0o0();
        }
        if (i == 4107) {
            return OooOOo();
        }
        if (i == 4110) {
            return OooOOOo();
        }
        if (i == 4352) {
            return OooO00o();
        }
        if (i == 4624) {
            return OooOO0O();
        }
        if (i == 4112) {
            return OooOOO0();
        }
        if (i == 4113) {
            return OooOO0o();
        }
        if (i == 4128) {
            return OooOOo0();
        }
        if (i == 4129) {
            return OooOOO();
        }
        if (i == 4144) {
            return OooOo0();
        }
        if (i == 4145) {
            return OooOOoo();
        }
        if (i == 4147) {
            return OooO0oo();
        }
        if (i == 4148) {
            return OooO();
        }
        switch (i) {
            case 4097:
                return OooOo00();
            case 4098:
                return OooOo0o();
            case 4099:
                return OooO0Oo();
            case 4100:
                return OooOo0O();
            default:
                switch (i) {
                    case C7978oO0oOooo.OooOoO0 /*{ENCODED_INT: 4864}*/:
                        return OooO0OO();
                    case C7978oO0oOooo.OooOoO /*{ENCODED_INT: 4865}*/:
                        return OooOOOO();
                    case C7978oO0oOooo.OooOoOO /*{ENCODED_INT: 4866}*/:
                        return OooO0O0();
                    default:
                        switch (i) {
                            case 5120:
                                return OooO0o();
                            case C7978oO0oOooo.OooOooO /*{ENCODED_INT: 5121}*/:
                                return OooOO0();
                            case C7978oO0oOooo.OooOooo /*{ENCODED_INT: 5122}*/:
                                return OooO0oO();
                            default:
                                return super.OooO0OO(i);
                        }
                }
        }
    }

    @Nullable
    public String OooO0Oo() {
        Integer OooO00o = ((C7978oO0oOooo) this.f20998OooO00o).m19639OooO00o(4099);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 128) {
            return "Medium High";
        }
        if (intValue == 256) {
            return "High";
        }
        if (intValue == 384) {
            return "Medium Low";
        }
        if (intValue == 512) {
            return "Low";
        }
        if (intValue == 32768) {
            return "Film Simulation";
        }
        switch (intValue) {
            case 768:
                return "None (B&W)";
            case 769:
                return "B&W Green Filter";
            case 770:
                return "B&W Yellow Filter";
            case 771:
                return "B&W Blue Filter";
            case 772:
                return "B&W Sepia";
            default:
                return "Unknown (" + OooO00o + C3848l.f10402t;
        }
    }

    @Nullable
    public String OooO0o() {
        return OooO00o(5120, 1, "Standard", null, "Wide");
    }

    @Nullable
    public String OooO0o0() {
        Integer OooO00o = ((C7978oO0oOooo) this.f20998OooO00o).m19639OooO00o(4102);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 256) {
            return "High";
        }
        if (intValue == 768) {
            return "Low";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooO0oO() {
        Integer OooO00o = ((C7978oO0oOooo) this.f20998OooO00o).m19639OooO00o(C7978oO0oOooo.OooOooo);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Auto (100-400%)";
        }
        if (intValue == 1) {
            return "Manual";
        }
        if (intValue == 256) {
            return "Standard (100%)";
        }
        if (intValue == 32768) {
            return "Film Simulation";
        }
        if (intValue == 512) {
            return "Wide 1 (230%)";
        }
        if (intValue == 513) {
            return "Wide 2 (400%)";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooO0oo() {
        return OooO00o(4147, "Auto", "Manual");
    }

    @Nullable
    public String OooOO0() {
        Integer OooO00o = ((C7978oO0oOooo) this.f20998OooO00o).m19639OooO00o(C7978oO0oOooo.OooOooO);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "F0/Standard (Provia) ";
        }
        if (intValue == 256) {
            return "F1/Studio Portrait";
        }
        if (intValue == 272) {
            return "F1a/Studio Portrait Enhanced Saturation";
        }
        if (intValue == 288) {
            return "F1b/Studio Portrait Smooth Skin Tone (Astia)";
        }
        if (intValue == 304) {
            return "F1c/Studio Portrait Increased Sharpness";
        }
        if (intValue == 512) {
            return "F2/Fujichrome (Velvia)";
        }
        if (intValue == 768) {
            return "F3/Studio Portrait Ex";
        }
        if (intValue == 1024) {
            return "F4/Velvia";
        }
        if (intValue == 1280) {
            return "Pro Neg. Std";
        }
        if (intValue == 1281) {
            return "Pro Neg. Hi";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooOO0O() {
        Integer OooO00o = ((C7978oO0oOooo) this.f20998OooO00o).m19639OooO00o(C7978oO0oOooo.OooOo);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Standard";
        }
        if (intValue == 16) {
            return "Chrome";
        }
        if (intValue == 48) {
            return "B&W";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooOO0o() {
        Rational OooO00o = ((C7978oO0oOooo) this.f20998OooO00o).m19633OooO00o(4113);
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.toSimpleString(false) + " EV (Apex)";
    }

    @Nullable
    public String OooOOO() {
        return OooO00o(4129, "Auto Focus", "Manual Focus");
    }

    @Nullable
    public String OooOOO0() {
        return OooO00o(4112, "Auto", "On", "Off", "Red-eye Reduction", "External");
    }

    @Nullable
    public String OooOOOO() {
        return OooO00o(C7978oO0oOooo.OooOoO, "Good Focus", "Out Of Focus");
    }

    @Nullable
    public String OooOOOo() {
        Integer OooO00o = ((C7978oO0oOooo) this.f20998OooO00o).m19639OooO00o(4110);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 256) {
            return "Strong";
        }
        if (intValue == 512) {
            return "Weak";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooOOo() {
        Integer OooO00o = ((C7978oO0oOooo) this.f20998OooO00o).m19639OooO00o(4107);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 64) {
            return "Low";
        }
        if (intValue == 128) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 256) {
            return "N/A";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooOOo0() {
        return OooO00o(4128, "Off", "On");
    }

    @Nullable
    public String OooOOoo() {
        Integer OooO00o = ((C7978oO0oOooo) this.f20998OooO00o).m19639OooO00o(4145);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 27) {
            return "Dog Face Detection";
        }
        if (intValue == 28) {
            return "Cat Face Detection";
        }
        if (intValue == 256) {
            return "Aperture priority AE";
        }
        if (intValue == 512) {
            return "Shutter priority AE";
        }
        if (intValue == 768) {
            return "Manual exposure";
        }
        switch (intValue) {
            case 0:
                return "Auto";
            case 1:
                return "Portrait scene";
            case 2:
                return "Landscape scene";
            case 3:
                return "Macro";
            case 4:
                return "Sports scene";
            case 5:
                return "Night scene";
            case 6:
                return "Program AE";
            case 7:
                return "Natural Light";
            case 8:
                return "Anti-blur";
            case 9:
                return "Beach & Snow";
            case 10:
                return "Sunset";
            case 11:
                return "Museum";
            case 12:
                return "Party";
            case 13:
                return "Flower";
            case 14:
                return "Text";
            case 15:
                return "Natural Light & Flash";
            case 16:
                return "Beach";
            case 17:
                return "Snow";
            case 18:
                return "Fireworks";
            case 19:
                return "Underwater";
            case 20:
                return "Portrait with Skin Correction";
            default:
                switch (intValue) {
                    case 22:
                        return "Panorama";
                    case 23:
                        return "Night (Tripod)";
                    case 24:
                        return "Pro Low-light";
                    case 25:
                        return "Pro Focus";
                    default:
                        return "Unknown (" + OooO00o + C3848l.f10402t;
                }
        }
    }

    @Nullable
    public String OooOo0() {
        return OooO00o(4144, "Off", "On");
    }

    @Nullable
    public String OooOo00() {
        Integer OooO00o = ((C7978oO0oOooo) this.f20998OooO00o).m19639OooO00o(4097);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 1) {
            return "Softest";
        }
        if (intValue == 2) {
            return "Soft";
        }
        if (intValue == 3) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 4) {
            return "Hard";
        }
        if (intValue == 5) {
            return "Hardest";
        }
        if (intValue == 130) {
            return "Medium Soft";
        }
        if (intValue == 132) {
            return "Medium Hard";
        }
        if (intValue == 32768) {
            return "Film Simulation";
        }
        if (intValue == 65535) {
            return "N/A";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooOo0O() {
        Integer OooO00o = ((C7978oO0oOooo) this.f20998OooO00o).m19639OooO00o(4100);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 128) {
            return "Medium High";
        }
        if (intValue == 256) {
            return "High";
        }
        if (intValue == 384) {
            return "Medium Low";
        }
        if (intValue == 512) {
            return "Low";
        }
        if (intValue == 768) {
            return "None (B&W)";
        }
        if (intValue == 32768) {
            return "Film Simulation";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooOo0o() {
        Integer OooO00o = ((C7978oO0oOooo) this.f20998OooO00o).m19639OooO00o(4098);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Auto";
        }
        if (intValue == 256) {
            return "Daylight";
        }
        if (intValue == 512) {
            return "Cloudy";
        }
        if (intValue == 1024) {
            return "Incandescence";
        }
        if (intValue == 1280) {
            return ExifInterface.f14327oo000o;
        }
        if (intValue == 4080) {
            return "Kelvin";
        }
        switch (intValue) {
            case 768:
                return "Daylight Fluorescent";
            case 769:
                return "Day White Fluorescent";
            case 770:
                return "White Fluorescent";
            case 771:
                return "Warm White Fluorescent";
            case 772:
                return "Living Room Warm White Fluorescent";
            default:
                switch (intValue) {
                    case 3840:
                        return "Custom White Balance";
                    case C7997oO0ooOO0.Oooo0OO /*{ENCODED_INT: 3841}*/:
                        return "Custom White Balance 2";
                    case 3842:
                        return "Custom White Balance 3";
                    case 3843:
                        return "Custom White Balance 4";
                    case 3844:
                        return "Custom White Balance 5";
                    default:
                        return "Unknown (" + OooO00o + C3848l.f10402t;
                }
        }
    }

    @Nullable
    public String OooO0OO() {
        return OooO00o(C7978oO0oOooo.OooOoO0, "No Blur Warning", "Blur warning");
    }
}
