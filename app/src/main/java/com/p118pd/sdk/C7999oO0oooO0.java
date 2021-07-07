package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.oO0oooO0  reason: case insensitive filesystem */
public class C7999oO0oooO0 extends C7929oO0o0OoO<C7998oO0oooO> {
    public C7999oO0oooO0(@NotNull C7998oO0oooO oo0oooo) {
        super(oo0oooo);
    }

    @Nullable
    public String OooO00o() {
        return OooO00o(264, "sRGB", "Adobe RGB", "Pro Photo RGB");
    }

    @Nullable
    public String OooO0O0() {
        Integer OooO00o = ((C7998oO0oooO) this.f20998OooO00o).m19639OooO00o(267);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Original";
        }
        if (intValue == 1) {
            return "Edited (Landscape)";
        }
        if (intValue == 6 || intValue == 8) {
            return "Edited (Portrait)";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 0) {
            return OooO0o();
        }
        switch (i) {
            case 264:
                return OooO00o();
            case 265:
                return OooO0OO();
            case 266:
                return OooO0Oo();
            case 267:
                return OooO0O0();
            case 268:
                return OooO0o0();
            default:
                return super.OooO0OO(i);
        }
    }

    @Nullable
    public String OooO0Oo() {
        Integer OooO00o = ((C7998oO0oooO) this.f20998OooO00o).m19639OooO00o(266);
        if (OooO00o == null) {
            return null;
        }
        if (OooO00o.intValue() == 0) {
            return "(none)";
        }
        StringBuilder sb = new StringBuilder();
        int intValue = OooO00o.intValue();
        if ((intValue & 1) != 0) {
            sb.append("Noise Reduction, ");
        }
        if (((intValue >> 1) & 1) != 0) {
            sb.append("Noise Filter, ");
        }
        if (((intValue >> 2) & 1) != 0) {
            sb.append("Noise Filter (ISO Boost), ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    @Nullable
    public String OooO0o() {
        return OooO0O0(0, 4);
    }

    @Nullable
    public String OooO0o0() {
        Integer OooO00o = ((C7998oO0oooO) this.f20998OooO00o).m19639OooO00o(268);
        if (OooO00o == null) {
            return null;
        }
        if (OooO00o.intValue() == 0) {
            return "(none)";
        }
        StringBuilder sb = new StringBuilder();
        int intValue = OooO00o.intValue();
        if ((intValue & 1) != 0) {
            sb.append("WB Color Temp, ");
        }
        if (((intValue >> 1) & 1) != 0) {
            sb.append("WB Gray Point, ");
        }
        if (((intValue >> 2) & 1) != 0) {
            sb.append("Saturation, ");
        }
        if (((intValue >> 3) & 1) != 0) {
            sb.append("Contrast, ");
        }
        if (((intValue >> 4) & 1) != 0) {
            sb.append("Sharpness, ");
        }
        if (((intValue >> 5) & 1) != 0) {
            sb.append("Color Space, ");
        }
        if (((intValue >> 6) & 1) != 0) {
            sb.append("High Function, ");
        }
        if (((intValue >> 7) & 1) != 0) {
            sb.append("Noise Reduction, ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    @Nullable
    public String OooO0OO() {
        return OooO00o(265, "High Speed", "High Function", "Advanced High Speed", "Advanced High Function");
    }
}
