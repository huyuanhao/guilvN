package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.umeng.message.proguard.C3848l;
import java.io.IOException;
import java.text.DecimalFormat;

/* renamed from: com.pd.sdk.oO0oooOo  reason: case insensitive filesystem */
public class C8001oO0oooOo extends C7929oO0o0OoO<C8278oOo000OO> {
    public static final String[] OooO00o = {ReactProgressBarViewManager.DEFAULT_STYLE, "Portrait", "Scenery", "Sports", "Night Portrait", "Program", "Aperture Priority", "Shutter Priority", "Macro", "Spot", "Manual", "Movie Preview", "Panning", "Simple", "Color Effects", "Self Portrait", "Economy", "Fireworks", "Party", "Snow", "Night Scenery", "Food", "Baby", "Soft Skin", "Candlelight", "Starry Night", "High Sensitivity", "Panorama Assist", "Underwater", "Beach", "Aerial Photo", "Sunset", "Pet", "Intelligent ISO", ClipboardModule.NAME, "High Speed Continuous Shooting", "Intelligent Auto", null, "Multi-aspect", null, "Transform", "Flash Burst", "Pin Hole", "Film Grain", "My Color", "Photo Frame", null, null, null, null, "HDR"};

    public C8001oO0oooOo(@NotNull C8278oOo000OO ooo000oo) {
        super(ooo000oo);
    }

    @Nullable
    public static String OooO00o(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    @Nullable
    private String OooOO0(int i) {
        byte[] OooO00o2 = ((C8278oOo000OO) this.f20998OooO00o).m19651OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        oO0Oo0 oo0oo0 = new oO0Oo0(OooO00o2);
        try {
            int OooO0OO = oo0oo0.OooO0OO(0);
            int OooO0OO2 = oo0oo0.OooO0OO(2);
            if (OooO0OO == -1 && OooO0OO2 == 1) {
                return "Slim Low";
            }
            if (OooO0OO == -3 && OooO0OO2 == 2) {
                return "Slim High";
            }
            if (OooO0OO == 0 && OooO0OO2 == 0) {
                return "Off";
            }
            if (OooO0OO == 1 && OooO0OO2 == 1) {
                return "Stretch Low";
            }
            if (OooO0OO == 3 && OooO0OO2 == 2) {
                return "Stretch High";
            }
            return "Unknown (" + OooO0OO + " " + OooO0OO2 + C3848l.f10402t;
        } catch (IOException unused) {
            return null;
        }
    }

    @Nullable
    public String OooO() {
        C7920oO0o0O0 OooO00o2 = ((C8278oOo000OO) this.f20998OooO00o).OooO00o(51);
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o2.m19629OooO00o();
    }

    @Nullable
    public String OooO0O0() {
        Integer OooO00o2 = ((C8278oOo000OO) this.f20998OooO00o).m19639OooO00o(142);
        if (OooO00o2 == null) {
            return null;
        }
        return String.valueOf((int) OooO00o2.shortValue());
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        switch (i) {
            case 1:
                return OoooO0();
            case 2:
                return o00Oo0();
            case 3:
                return o00Ooo();
            case 7:
                return OooOoOO();
            case 15:
                return OooO0o0();
            case 26:
                return OooOoo();
            case 28:
                return Oooo0o0();
            case 31:
                return OoooO();
            case 32:
                return OooO0oO();
            case 33:
                return ooOO();
            case 37:
                return Oooo00O();
            case 38:
                return OooOo0o();
            case 40:
                return OooOOOo();
            case 41:
                return o00O0O();
            case 42:
                return OooOO0o();
            case 44:
                return OooOOoo();
            case 45:
                return Oooo0oO();
            case 46:
                return OoooOOo();
            case 48:
                return o000oOoO();
            case 49:
                return OooO0o();
            case 50:
                return OooOOo0();
            case 51:
                return OooO();
            case 52:
                return Oooo0oo();
            case 53:
                return OooOo00();
            case 57:
                return OooOOo();
            case 58:
                return o00o0O();
            case 59:
                return OooooOo();
            case 61:
                return OooO0Oo();
            case 62:
                return Ooooo0o();
            case 69:
                return OooOO0O();
            case 72:
                return OooOo();
            case 73:
                return Oooo0OO();
            case 78:
                return OooOo0O();
            case 89:
                return o0OoOo0();
            case 93:
                return OooOooo();
            case 96:
                return Oooo0();
            case 97:
                return OoooO0O();
            case 98:
                return OooOoO();
            case 101:
                return Oooooo();
            case 102:
                return OooOO0();
            case 103:
                return Oooo0O0();
            case 105:
                return OooOo0();
            case 107:
                return OoooOoo();
            case 109:
                return OooOOO();
            case 111:
                return Oooo00o();
            case 112:
                return Oooo000();
            case 121:
                return OooOooO();
            case 124:
                return OooOOOO();
            case 137:
                return Oooo();
            case 138:
                return OoooOo0();
            case 140:
                return OooO0OO();
            case 141:
                return OooO00o();
            case 142:
                return OooO0O0();
            case 143:
                return OooOOO0();
            case 144:
                return OoooOO0();
            case 145:
                return OoooO00();
            case 147:
                return Ooooo00();
            case 150:
                return Oooooo0();
            case 158:
                return OooOoo0();
            case 159:
                return OoooOoO();
            case 171:
                return OoooooO();
            case 32768:
                return Oooo0o();
            case 32769:
                return OoooOOO();
            case 32775:
                return OooOoO0();
            case 32776:
                return OooooO0();
            case 32777:
                return OooooOO();
            case C8278oOo000OO.o0000oO /*{ENCODED_INT: 32784}*/:
                return OooO0oo();
            case C8278oOo000OO.o0000O0 /*{ENCODED_INT: 32786}*/:
                return Ooooooo();
            default:
                return super.OooO0OO(i);
        }
    }

    @Nullable
    public String OooO0Oo() {
        return OooO00o(61, 1, ReactProgressBarViewManager.DEFAULT_STYLE, "Outdoor/Illuminations/Flower/HDR Art", "Indoor/Architecture/Objects/HDR B&W", "Creative", "Auto", null, "Expressive", "Retro", "Pure", "Elegant", null, "Monochrome", "Dynamic Art", "Silhouette");
    }

    @Nullable
    public String OooO0o() {
        return OooO00o(49, 1, "Fired", "Enabled but not used", "Disabled but required", "Disabled and not required");
    }

    @Nullable
    public String OooO0o0() {
        int[] OooO00o2 = ((C8278oOo000OO) this.f20998OooO00o).m19652OooO00o(15);
        if (OooO00o2 == null || OooO00o2.length < 2) {
            return null;
        }
        int i = OooO00o2[0];
        if (i == 0) {
            int i2 = OooO00o2[1];
            if (i2 == 1) {
                return "Spot Mode On";
            }
            if (i2 == 16) {
                return "Spot Mode Off";
            }
            return "Unknown (" + OooO00o2[0] + " " + OooO00o2[1] + C3848l.f10402t;
        } else if (i == 1) {
            int i3 = OooO00o2[1];
            if (i3 == 0) {
                return "Spot Focusing";
            }
            if (i3 == 1) {
                return "5-area";
            }
            return "Unknown (" + OooO00o2[0] + " " + OooO00o2[1] + C3848l.f10402t;
        } else if (i == 16) {
            int i4 = OooO00o2[1];
            if (i4 == 0) {
                return "1-area";
            }
            if (i4 == 16) {
                return "1-area (high speed)";
            }
            return "Unknown (" + OooO00o2[0] + " " + OooO00o2[1] + C3848l.f10402t;
        } else if (i == 32) {
            int i5 = OooO00o2[1];
            if (i5 == 0) {
                return "Auto or Face Detect";
            }
            if (i5 == 1) {
                return "3-area (left)";
            }
            if (i5 == 2) {
                return "3-area (center)";
            }
            if (i5 == 3) {
                return "3-area (right)";
            }
            return "Unknown (" + OooO00o2[0] + " " + OooO00o2[1] + C3848l.f10402t;
        } else if (i == 64) {
            return "Face Detect";
        } else {
            return "Unknown (" + OooO00o2[0] + " " + OooO00o2[1] + C3848l.f10402t;
        }
    }

    @Nullable
    public String OooO0oO() {
        return OooO00o(32, 1, "Off", "On");
    }

    @Nullable
    public String OooO0oo() {
        C7920oO0o0O0 OooO00o2 = ((C8278oOo000OO) this.f20998OooO00o).OooO00o(C8278oOo000OO.o0000oO);
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o2.m19629OooO00o();
    }

    @Nullable
    public String OooOO0O() {
        return OooO00o(69, "No Bracket", "3 Images, Sequence 0/-/+", "3 Images, Sequence -/0/+", "5 Images, Sequence 0/-/+", "5 Images, Sequence -/0/+", "7 Images, Sequence 0/-/+", "7 Images, Sequence -/0/+");
    }

    @Nullable
    public String OooOO0o() {
        return OooO00o(42, "Off", null, "On", "Indefinite", "Unlimited");
    }

    @Nullable
    public String OooOOO() {
        return OooO00o(OooO00o(109, C7895oO0OoO00.OooO00o));
    }

    @Nullable
    public String OooOOO0() {
        return OooO00o(143, ReactProgressBarViewManager.DEFAULT_STYLE, "Rotate CW", "Rotate 180", "Rotate CCW", "Tilt Upwards", "Tile Downwards");
    }

    @Nullable
    public String OooOOOO() {
        return OooO00o(124, "Off", "On");
    }

    @Nullable
    public String OooOOOo() {
        return OooO00o(40, 1, "Off", "Warm", "Cool", "Black & White", "Sepia");
    }

    @Nullable
    public String OooOOo() {
        return OooO00o(57, ReactProgressBarViewManager.DEFAULT_STYLE);
    }

    @Nullable
    public String OooOOo0() {
        return OooO00o(50, ReactProgressBarViewManager.DEFAULT_STYLE, "Natural", "Vivid");
    }

    @Nullable
    public String OooOOoo() {
        Integer OooO00o2 = ((C8278oOo000OO) this.f20998OooO00o).m19639OooO00o(44);
        if (OooO00o2 == null) {
            return null;
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 0) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 1) {
            return "Low";
        }
        if (intValue == 2) {
            return "High";
        }
        if (intValue == 6) {
            return "Medium Low";
        }
        if (intValue == 7) {
            return "Medium High";
        }
        if (intValue == 256) {
            return "Low";
        }
        if (intValue == 272) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 288) {
            return "High";
        }
        return "Unknown (" + OooO00o2 + C3848l.f10402t;
    }

    @Nullable
    public String OooOo() {
        return OooO00o(72, "n/a", "1st", "2nd");
    }

    @Nullable
    public String OooOo0() {
        return OooO00o(OooO00o(105, C7895oO0OoO00.OooO00o));
    }

    @Nullable
    public String OooOo00() {
        return OooO00o(53, 1, "Off", "Wide", "Telephoto", "Macro");
    }

    @Nullable
    public String OooOo0O() {
        return OooO00o(((C8278oOo000OO) this.f20998OooO00o).m19978OooO00o());
    }

    @Nullable
    public String OooOo0o() {
        return OooO0O0(38, 2);
    }

    @Nullable
    public String OooOoO() {
        return OooO00o(98, "No", "Yes (Flash required but disabled)");
    }

    @Nullable
    public String OooOoO0() {
        return OooO00o(32775, 1, "Off", "On");
    }

    @Nullable
    public String OooOoOO() {
        return OooO00o(7, 1, "Auto", "Manual", null, "Auto, Focus Button", "Auto, Continuous");
    }

    @Nullable
    public String OooOoo() {
        return OooO00o(26, 2, "On, Mode 1", "Off", "On, Mode 2");
    }

    @Nullable
    public String OooOoo0() {
        Integer OooO00o2 = ((C8278oOo000OO) this.f20998OooO00o).m19639OooO00o(158);
        if (OooO00o2 == null) {
            return null;
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 100) {
            return "1 EV";
        }
        if (intValue == 200) {
            return "2 EV";
        }
        if (intValue == 300) {
            return "3 EV";
        }
        if (intValue == 32868) {
            return "1 EV (Auto)";
        }
        if (intValue == 32968) {
            return "2 EV (Auto)";
        }
        if (intValue == 33068) {
            return "3 EV (Auto)";
        }
        return String.format("Unknown (%d)", OooO00o2);
    }

    @Nullable
    public String OooOooO() {
        return OooO00o(121, "Off", "Low", "Standard", "High");
    }

    @Nullable
    public String OooOooo() {
        return OooO00o(93, "Off", "Low", "Standard", "High");
    }

    @Nullable
    public String Oooo() {
        return OooO00o(137, "Auto", "Standard or Custom", "Vivid", "Natural", "Monochrome", "Scenery", "Portrait");
    }

    @Nullable
    public String Oooo0() {
        byte[] OooO00o2 = ((C8278oOo000OO) this.f20998OooO00o).m19651OooO00o(96);
        if (OooO00o2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < OooO00o2.length; i++) {
            sb.append((int) OooO00o2[i]);
            if (i < OooO00o2.length - 1) {
                sb.append(C9058ooOoOoOO.OooOO0);
            }
        }
        return sb.toString();
    }

    @Nullable
    public String Oooo000() {
        return OooO00o(112, "Off", null, "Auto", "On");
    }

    @Nullable
    public String Oooo00O() {
        return OooO00o(37);
    }

    @Nullable
    public String Oooo00o() {
        return OooO00o(OooO00o(111, C7895oO0OoO00.OooO00o));
    }

    @Nullable
    public String Oooo0O0() {
        return OooO00o(OooO00o(103, C7895oO0OoO00.OooO00o));
    }

    @Nullable
    public String Oooo0OO() {
        return OooO00o(73, 1, "Off", "On");
    }

    @Nullable
    public String Oooo0o() {
        return OooO0O0(32768, 2);
    }

    @Nullable
    public String Oooo0o0() {
        return OooO00o(28, 1, "Off", "On");
    }

    @Nullable
    public String Oooo0oO() {
        return OooO00o(45, "Standard (0)", "Low (-1)", "High (+1)", "Lowest (-2)", "Highest (+2)");
    }

    @Nullable
    public String Oooo0oo() {
        return OooO00o(52, 1, "Standard", "Extended");
    }

    @Nullable
    public String OoooO() {
        return OooO00o(31, 1, OooO00o);
    }

    @Nullable
    public String OoooO0() {
        return OooO00o(1, 2, "High", ReactProgressBarViewManager.DEFAULT_STYLE, null, null, "Very High", "Raw", null, "Motion Picture");
    }

    @Nullable
    public String OoooO00() {
        Integer OooO00o2 = ((C8278oOo000OO) this.f20998OooO00o).m19639OooO00o(145);
        if (OooO00o2 == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        double d = (double) (-OooO00o2.shortValue());
        Double.isNaN(d);
        return decimalFormat.format(d / 10.0d);
    }

    @Nullable
    public String OoooO0O() {
        return OooO00o(((C8278oOo000OO) this.f20998OooO00o).OooO0O0());
    }

    @Nullable
    public String OoooOO0() {
        Integer OooO00o2 = ((C8278oOo000OO) this.f20998OooO00o).m19639OooO00o(144);
        if (OooO00o2 == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        double shortValue = (double) OooO00o2.shortValue();
        Double.isNaN(shortValue);
        return decimalFormat.format(shortValue / 10.0d);
    }

    @Nullable
    public String OoooOOO() {
        return OooO00o(32769, 1, OooO00o);
    }

    @Nullable
    public String OoooOOo() {
        return OooO00o(46, 1, "Off", "10 s", "2 s");
    }

    @Nullable
    public String OoooOo0() {
        return OooO00o(138, "Off", "On");
    }

    @Nullable
    public String OoooOoO() {
        return OooO00o(159, "Mechanical", "Electronic", "Hybrid");
    }

    @Nullable
    public String OoooOoo() {
        return OooO00o(OooO00o(107, C7895oO0OoO00.OooO00o));
    }

    @Nullable
    public String Ooooo00() {
        return OooO00o(147, "Off", "Left to Right", "Right to Left", "Top to Bottom", "Bottom to Top");
    }

    @Nullable
    public String Ooooo0o() {
        return OooO00o(62, 1, "Off", "On");
    }

    @Nullable
    public String OooooO0() {
        return OooO00o(32776, 1, "Off", "On");
    }

    @Nullable
    public String OooooOO() {
        return OooO00o(32777, 1, "Off", "On");
    }

    @Nullable
    public String OooooOo() {
        return OooO00o(59, 1, "Off", "On");
    }

    @Nullable
    public String Oooooo() {
        return OooO00o(OooO00o(101, C7895oO0OoO00.OooO00o));
    }

    @Nullable
    public String Oooooo0() {
        return OooO00o(150, "Off", "Time Lapse", "Stop-motion Animation");
    }

    @Nullable
    public String OoooooO() {
        return OooO00o(171, "Off", "On");
    }

    @Nullable
    public String Ooooooo() {
        return OooOO0(C8278oOo000OO.o0000O0);
    }

    @Nullable
    public String o000oOoO() {
        Integer OooO00o2 = ((C8278oOo000OO) this.f20998OooO00o).m19639OooO00o(48);
        if (OooO00o2 == null) {
            return null;
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 1) {
            return "Horizontal";
        }
        if (intValue == 3) {
            return "Rotate 180";
        }
        if (intValue == 6) {
            return "Rotate 90 CW";
        }
        if (intValue == 8) {
            return "Rotate 270 CW";
        }
        return "Unknown (" + OooO00o2 + C3848l.f10402t;
    }

    @Nullable
    public String o00O0O() {
        Integer OooO00o2 = ((C8278oOo000OO) this.f20998OooO00o).m19639OooO00o(41);
        if (OooO00o2 == null) {
            return null;
        }
        return (((float) OooO00o2.intValue()) / 100.0f) + " s";
    }

    @Nullable
    public String o00Oo0() {
        return OooO0O0(2, 2);
    }

    @Nullable
    public String o00Ooo() {
        return OooO00o(3, 1, "Auto", "Daylight", "Cloudy", "Incandescent", "Manual", null, null, ExifInterface.f14327oo000o, null, "Black & White", "Manual", "Shade");
    }

    @Nullable
    public String o00o0O() {
        return OooO00o(58, 1, "Home", "Destination");
    }

    @Nullable
    public String o0OoOo0() {
        return OooOO0(89);
    }

    @Nullable
    public String ooOO() {
        return OooO0O0(33);
    }

    @Nullable
    public String OooO00o() {
        Integer OooO00o2 = ((C8278oOo000OO) this.f20998OooO00o).m19639OooO00o(141);
        if (OooO00o2 == null) {
            return null;
        }
        return String.valueOf((int) OooO00o2.shortValue());
    }

    @Nullable
    private String OooO00o(@Nullable C7919oO0o0O[] oo0o0oArr) {
        if (oo0o0oArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < oo0o0oArr.length) {
            sb.append("Face ");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(": ");
            sb.append(oo0o0oArr[i].toString());
            sb.append("\n");
            i = i2;
        }
        if (sb.length() > 0) {
            return sb.substring(0, sb.length() - 1);
        }
        return null;
    }

    @Nullable
    public String OooOO0() {
        return OooO00o(OooO00o(102, C7895oO0OoO00.OooO00o));
    }

    @Nullable
    public String OooO0OO() {
        Integer OooO00o2 = ((C8278oOo000OO) this.f20998OooO00o).m19639OooO00o(140);
        if (OooO00o2 == null) {
            return null;
        }
        return String.valueOf((int) OooO00o2.shortValue());
    }
}
