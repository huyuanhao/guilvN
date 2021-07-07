package com.p118pd.sdk;

import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.umeng.message.proguard.C3848l;
import java.text.DecimalFormat;

/* renamed from: com.pd.sdk.oO0oo0OO  reason: case insensitive filesystem */
public class C7986oO0oo0OO extends C7929oO0o0OoO<C7987oO0oo0Oo> {
    public C7986oO0oo0OO(@NotNull C7987oO0oo0Oo oo0oo0oo) {
        super(oo0oo0oo);
    }

    @Nullable
    public String OooO() {
        return OooO0O0(1, 2);
    }

    @Nullable
    public String OooO00o() {
        Integer OooO00o = ((C7987oO0oo0Oo) this.f20998OooO00o).m19639OooO00o(34);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "Light";
        }
        if (intValue == 3) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 5) {
            return "High";
        }
        if (intValue == 7) {
            return "Extra High";
        }
        if (intValue == 65535) {
            return "Auto";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooO0O0() {
        return OooOO0(18);
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 1) {
            return OooO();
        }
        if (i == 2) {
            return OooOOOO();
        }
        if (i == 13) {
            return OooOo0O();
        }
        if (i == 14) {
            return OooO0oO();
        }
        if (i == 18) {
            return OooO0O0();
        }
        if (i == 28) {
            return OooO0oo();
        }
        if (i == 30) {
            return OooO0o0();
        }
        if (i == 34) {
            return OooO00o();
        }
        if (i == 42) {
            return OooOo();
        }
        if (i == 139) {
            return OooOOo();
        }
        if (i == 141) {
            return OooO0Oo();
        }
        if (i == 177) {
            return OooOOO0();
        }
        if (i == 182) {
            return OooOo0();
        }
        if (i == 23) {
            return OooOO0O();
        }
        if (i == 24) {
            return OooOO0();
        }
        if (i == 131) {
            return OooOOoo();
        }
        if (i == 132) {
            return OooOOOo();
        }
        if (i == 146) {
            return OooOOO();
        }
        if (i == 147) {
            return OooOo00();
        }
        switch (i) {
            case 134:
                return OooO0o();
            case 135:
                return OooOO0o();
            case 136:
                return OooO0OO();
            case 137:
                return OooOo0o();
            default:
                return super.OooO0OO(i);
        }
    }

    @Nullable
    public String OooO0Oo() {
        String OooO0O0 = ((C7987oO0oo0Oo) this.f20998OooO00o).OooO0O0(141);
        if (OooO0O0 == null) {
            return null;
        }
        return OooO0O0.startsWith("MODE1") ? "Mode I (sRGB)" : OooO0O0;
    }

    @Nullable
    public String OooO0o() {
        Rational OooO00o = ((C7987oO0oo0Oo) this.f20998OooO00o).m19633OooO00o(134);
        if (OooO00o == null) {
            return null;
        }
        if (OooO00o.intValue() == 1) {
            return "No digital zoom";
        }
        return OooO00o.toSimpleString(true) + "x digital zoom";
    }

    @Nullable
    public String OooO0o0() {
        return OooO00o(30, 1, "sRGB", "Adobe RGB");
    }

    @Nullable
    public String OooO0oO() {
        return OooOO0(14);
    }

    @Nullable
    public String OooO0oo() {
        return OooOO0(28);
    }

    @Nullable
    public String OooOO0() {
        return OooOO0(24);
    }

    @Nullable
    public String OooOO0O() {
        return OooOO0(23);
    }

    @Nullable
    public String OooOO0o() {
        return OooO00o(135, "Flash Not Used", "Manual Flash", null, "Flash Not Ready", null, null, null, "External Flash", "Fired, Commander Mode", "Fired, TTL Mode");
    }

    @Nullable
    public String OooOOO() {
        return OooO0OO(146, "%s degrees");
    }

    @Nullable
    public String OooOOO0() {
        return OooO00o(177, "Off", "Minimal", "Low", null, ReactProgressBarViewManager.DEFAULT_STYLE, null, "High");
    }

    @Nullable
    public String OooOOOO() {
        int[] OooO00o = ((C7987oO0oo0Oo) this.f20998OooO00o).m19652OooO00o(2);
        if (OooO00o == null) {
            return null;
        }
        if (OooO00o[0] != 0 || OooO00o[1] == 0) {
            return "Unknown (" + ((C7987oO0oo0Oo) this.f20998OooO00o).OooO0O0(2) + C3848l.f10402t;
        }
        return "ISO " + OooO00o[1];
    }

    @Nullable
    public String OooOOOo() {
        return OooO0o0(132);
    }

    @Nullable
    public String OooOOo() {
        return OooOO0(139);
    }

    @Nullable
    public String OooOOo0() {
        int[] OooO0O0 = ((C7987oO0oo0Oo) this.f20998OooO00o).OooO0O0(152);
        if (OooO0O0 == null || OooO0O0.length < 11) {
            return null;
        }
        return String.format("%.2fm", Double.valueOf(OooO00o(OooO0O0[10])));
    }

    @Nullable
    public String OooOOoo() {
        return OooO00o(131, new String[]{"AF", "MF"}, "D", "G", "VR");
    }

    @Nullable
    public String OooOo() {
        Integer OooO00o = ((C7987oO0oo0Oo) this.f20998OooO00o).m19639OooO00o(42);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "Low";
        }
        if (intValue == 3) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 5) {
            return "High";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooOo0() {
        return OooO0Oo(182);
    }

    @Nullable
    public String OooOo00() {
        return OooO00o(147, 1, "Lossy (Type 1)", null, "Uncompressed", null, null, null, "Lossless", "Lossy (Type 2)");
    }

    @Nullable
    public String OooOo0O() {
        return OooOO0(13);
    }

    @Nullable
    public String OooOo0o() {
        return OooO00o(137, new String[]{"Single Frame", "Continuous"}, "Delay", null, "PC Control", "Exposure Bracketing", "Auto ISO", "White-Balance Bracketing", "IR Control");
    }

    @Nullable
    private String OooOO0(int i) {
        int[] OooO00o = ((C7987oO0oo0Oo) this.f20998OooO00o).m19652OooO00o(i);
        if (OooO00o == null || OooO00o.length < 2 || OooO00o.length < 3 || OooO00o[2] == 0) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        double d = (double) (OooO00o[0] * OooO00o[1]);
        double d2 = (double) OooO00o[2];
        Double.isNaN(d);
        Double.isNaN(d2);
        return decimalFormat.format(d / d2) + " EV";
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    private double OooO00o(int i) {
        if (i < 0) {
            i += 256;
        }
        return Math.pow(10.0d, (double) (((float) i) / 40.0f)) * 0.01d;
    }

    @Nullable
    public String OooO0OO() {
        int[] OooO00o = ((C7987oO0oo0Oo) this.f20998OooO00o).m19652OooO00o(136);
        if (OooO00o == null) {
            return null;
        }
        if (OooO00o.length == 4 && OooO00o[0] == 0 && OooO00o[2] == 0 && OooO00o[3] == 0) {
            int i = OooO00o[1];
            if (i == 0) {
                return "Centre";
            }
            if (i == 1) {
                return "Top";
            }
            if (i == 2) {
                return "Bottom";
            }
            if (i == 3) {
                return "Left";
            }
            if (i == 4) {
                return "Right";
            }
            return "Unknown (" + OooO00o[1] + C3848l.f10402t;
        }
        return "Unknown (" + ((C7987oO0oo0Oo) this.f20998OooO00o).OooO0O0(136) + C3848l.f10402t;
    }
}
