package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.umeng.message.proguard.C3848l;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0ooOO  reason: case insensitive filesystem */
public class C7996oO0ooOO extends C7929oO0o0OoO<C8298oOo00o0O> {
    public static final HashMap<Integer, String> OooO00o;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        OooO00o = hashMap;
        hashMap.put(0, "Off");
        OooO00o.put(1, "Soft Focus");
        OooO00o.put(2, "Pop Art");
        OooO00o.put(3, "Pale & Light Color");
        OooO00o.put(4, "Light Tone");
        OooO00o.put(5, "Pin Hole");
        OooO00o.put(6, "Grainy Film");
        OooO00o.put(9, "Diorama");
        OooO00o.put(10, "Cross Process");
        OooO00o.put(12, "Fish Eye");
        OooO00o.put(13, "Drawing");
        OooO00o.put(14, "Gentle Sepia");
        OooO00o.put(15, "Pale & Light Color II");
        OooO00o.put(16, "Pop Art II");
        OooO00o.put(17, "Pin Hole II");
        OooO00o.put(18, "Pin Hole III");
        OooO00o.put(19, "Grainy Film II");
        OooO00o.put(20, "Dramatic Tone");
        OooO00o.put(21, "Punk");
        OooO00o.put(22, "Soft Focus 2");
        OooO00o.put(23, "Sparkle");
        OooO00o.put(24, "Watercolor");
        OooO00o.put(25, "Key Line");
        OooO00o.put(26, "Key Line II");
        OooO00o.put(27, "Miniature");
        OooO00o.put(28, "Reflection");
        OooO00o.put(29, "Fragmented");
        OooO00o.put(31, "Cross Process II");
        OooO00o.put(32, "Dramatic Tone II");
        OooO00o.put(33, "Watercolor I");
        OooO00o.put(34, "Watercolor II");
        OooO00o.put(35, "Diorama II");
        OooO00o.put(36, "Vintage");
        OooO00o.put(37, "Vintage II");
        OooO00o.put(38, "Vintage III");
        OooO00o.put(39, "Partial Color");
        OooO00o.put(40, "Partial Color II");
        OooO00o.put(41, "Partial Color III");
    }

    public C7996oO0ooOO(@NotNull C8298oOo00o0O ooo00o0o) {
        super(ooo00o0o);
    }

    @Nullable
    public String OooO() {
        return OooO0O0(0, 4);
    }

    @Nullable
    public String OooO00o() {
        return OooOO0(289);
    }

    @Nullable
    public String OooO0O0() {
        return OooO00o(265, "sRGB", "Adobe RGB", "Pro Photo RGB");
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 0) {
            return OooO();
        }
        if (i == 256) {
            return OooO0Oo();
        }
        if (i == 289) {
            return OooO00o();
        }
        if (i == 272) {
            return OooO0oO();
        }
        if (i == 273) {
            return OooO0oo();
        }
        switch (i) {
            case 265:
                return OooO0O0();
            case 266:
                return OooO0o0();
            case 267:
                return OooO0OO();
            case 268:
                return OooO0o();
            default:
                return super.OooO0OO(i);
        }
    }

    @Nullable
    public String OooO0Oo() {
        return OooO00o(256, 1, "Color Temperature", "Gray Point");
    }

    @Nullable
    public String OooO0o() {
        Integer OooO00o2 = ((C8298oOo00o0O) this.f20998OooO00o).m19639OooO00o(268);
        if (OooO00o2 == null) {
            return null;
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 1) {
            return "Vivid";
        }
        if (intValue == 2) {
            return "Natural";
        }
        if (intValue == 3) {
            return "Muted";
        }
        if (intValue == 256) {
            return "Monotone";
        }
        if (intValue == 512) {
            return "Sepia";
        }
        return "Unknown (" + OooO00o2 + C3848l.f10402t;
    }

    @Nullable
    public String OooO0o0() {
        Integer OooO00o2 = ((C8298oOo00o0O) this.f20998OooO00o).m19639OooO00o(266);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2.intValue() == 0) {
            return "(none)";
        }
        StringBuilder sb = new StringBuilder();
        int intValue = OooO00o2.intValue();
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
    public String OooO0oO() {
        return OooO00o(272, "Neutral", "Yellow", "Orange", "Red", "Green");
    }

    @Nullable
    public String OooO0oo() {
        return OooO00o(273, "Neutral", "Sepia", "Blue", "Purple", "Green");
    }

    @Nullable
    public String OooOO0(int i) {
        int[] OooO00o2 = ((C8298oOo00o0O) this.f20998OooO00o).m19652OooO00o(i);
        if (OooO00o2 == null || OooO00o2.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < OooO00o2.length; i2++) {
            if (i2 == 0) {
                sb.append(OooO00o.containsKey(Integer.valueOf(OooO00o2[i2])) ? OooO00o.get(Integer.valueOf(OooO00o2[i2])) : "[unknown]");
            } else {
                sb.append(OooO00o2[i2]);
                sb.append("; ");
            }
            sb.append("; ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    @Nullable
    public String OooO0OO() {
        return OooO00o(267, "High Speed", "High Function", "Advanced High Speed", "Advanced High Function");
    }
}
