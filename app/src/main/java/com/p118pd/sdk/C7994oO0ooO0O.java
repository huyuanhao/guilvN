package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.oO0ooO0O  reason: case insensitive filesystem */
public class C7994oO0ooO0O extends C7929oO0o0OoO<C7995oO0ooO0o> {
    public C7994oO0ooO0O(@NotNull C7995oO0ooO0o oo0ooo0o) {
        super(oo0ooo0o);
    }

    @Nullable
    public String OooO() {
        return OooO00o(4114, "Off", "On");
    }

    @Nullable
    public String OooO00o() {
        byte[] OooO00o = ((C7995oO0ooO0o) this.f20998OooO00o).m19651OooO00o(C7995oO0ooO0o.OoooOoo);
        if (OooO00o == null || OooO00o.length < 2) {
            return null;
        }
        String format = String.format("%d %d", Byte.valueOf(OooO00o[0]), Byte.valueOf(OooO00o[1]));
        if (format.equals("1 1")) {
            return "4:3";
        }
        if (format.equals("1 4")) {
            return "1:1";
        }
        if (format.equals("2 1")) {
            return "3:2 (RAW)";
        }
        if (format.equals("2 2")) {
            return "3:2";
        }
        if (format.equals("3 1")) {
            return "16:9 (RAW)";
        }
        if (format.equals("3 3")) {
            return "16:9";
        }
        if (format.equals("4 1")) {
            return "1:1 (RAW)";
        }
        if (format.equals("4 4")) {
            return "6:6";
        }
        if (format.equals("5 5")) {
            return "5:4";
        }
        if (format.equals("6 6")) {
            return "7:6";
        }
        if (format.equals("7 7")) {
            return "6:5";
        }
        if (format.equals("8 8")) {
            return "7:5";
        }
        if (format.equals("9 1")) {
            return "3:4 (RAW)";
        }
        if (format.equals("9 9")) {
            return "3:4";
        }
        return "Unknown (" + format + C3848l.f10402t;
    }

    @Nullable
    public String OooO0O0() {
        int[] OooO00o = ((C7995oO0ooO0o) this.f20998OooO00o).m19652OooO00o(512);
        if (OooO00o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < OooO00o.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            sb.append((int) ((short) OooO00o[i]));
        }
        return sb.toString();
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 0) {
            return OooO0Oo();
        }
        if (i == 512) {
            return OooO0O0();
        }
        if (i == 4124) {
            return OooO0oO();
        }
        if (i == 4370) {
            return OooO00o();
        }
        if (i == 6400) {
            return OooO0o0();
        }
        if (i == 6401) {
            return OooO0o();
        }
        switch (i) {
            case 4112:
                return OooO0oo();
            case 4113:
                return OooO0OO();
            case 4114:
                return OooO();
            default:
                return super.OooO0OO(i);
        }
    }

    @Nullable
    public String OooO0Oo() {
        return OooO0O0(0, 4);
    }

    @Nullable
    public String OooO0o() {
        return OooO00o(C7995oO0ooO0o.Ooooooo, "Vertical", "Horizontal");
    }

    @Nullable
    public String OooO0o0() {
        byte[] OooO00o = ((C7995oO0ooO0o) this.f20998OooO00o).m19651OooO00o(C7995oO0ooO0o.OoooooO);
        if (OooO00o == null || OooO00o.length < 2) {
            return null;
        }
        String format = String.format("%d %d", Byte.valueOf(OooO00o[0]), Byte.valueOf(OooO00o[1]));
        if (format.equals("0 0")) {
            return "Off";
        }
        if (format.equals("0 1")) {
            return "On";
        }
        return "Unknown (" + format + C3848l.f10402t;
    }

    @Nullable
    public String OooO0oO() {
        int[] OooO00o = ((C7995oO0ooO0o) this.f20998OooO00o).m19652OooO00o(4124);
        if (OooO00o == null) {
            Integer OooO00o2 = ((C7995oO0ooO0o) this.f20998OooO00o).m19639OooO00o(4124);
            if (OooO00o2 == null) {
                return null;
            }
            OooO00o = new int[]{OooO00o2.intValue()};
        }
        if (OooO00o.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        short s = (short) OooO00o[0];
        if (s == 0) {
            sb.append("Off");
        } else if (s == 2) {
            sb.append("On (2 frames)");
        } else if (s != 3) {
            sb.append("Unknown (");
            sb.append((int) ((short) OooO00o[0]));
            sb.append(C3848l.f10402t);
        } else {
            sb.append("On (3 frames)");
        }
        if (OooO00o.length > 1) {
            sb.append("; ");
            sb.append((int) ((short) OooO00o[1]));
        }
        return sb.toString();
    }

    @Nullable
    public String OooO0oo() {
        Integer OooO00o = ((C7995oO0ooO0o) this.f20998OooO00o).m19639OooO00o(4112);
        if (OooO00o == null) {
            return null;
        }
        if (OooO00o.intValue() == 0) {
            return "(none)";
        }
        StringBuilder sb = new StringBuilder();
        short shortValue = OooO00o.shortValue();
        if ((shortValue & 1) != 0) {
            sb.append("Noise Reduction, ");
        }
        if (((shortValue >> 1) & 1) != 0) {
            sb.append("Noise Filter, ");
        }
        if (((shortValue >> 2) & 1) != 0) {
            sb.append("Noise Filter (ISO Boost), ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    @Nullable
    public String OooO0OO() {
        return OooO00o(4113, "Off", "On");
    }
}
