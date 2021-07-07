package com.p118pd.sdk;

import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.oO0ooO00  reason: case insensitive filesystem */
public class C7993oO0ooO00 extends C7929oO0o0OoO<C7992oO0ooO0> {
    public C7993oO0ooO00(@NotNull C7992oO0ooO0 oo0ooo0) {
        super(oo0ooo0);
    }

    @Nullable
    public String OooO() {
        return OooO00o(C7992oO0ooO0.OooOOoo, "Off", "On");
    }

    @Nullable
    public String OooO00o() {
        Integer OooO00o = ((C7992oO0ooO0) this.f20998OooO00o).m19639OooO00o(C7992oO0ooO0.OooOO0O);
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.toString();
    }

    @Nullable
    public String OooO0O0() {
        return OooO00o(521, "Off", "On");
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 0) {
            return OooO0oO();
        }
        if (i == 521) {
            return OooO0O0();
        }
        if (i == 773) {
            return OooO0o();
        }
        if (i == 776) {
            return OooO00o();
        }
        if (i == 4609) {
            return OooO0Oo();
        }
        if (i == 5376) {
            return OooOO0O();
        }
        if (i == 5632) {
            return OooO0oo();
        }
        if (i == 4612) {
            return OooO0OO();
        }
        if (i == 4613) {
            return OooO0o0();
        }
        if (i == 4617) {
            return OooOO0();
        }
        if (i != 4618) {
            return super.OooO0OO(i);
        }
        return OooO();
    }

    @Nullable
    public String OooO0Oo() {
        int[] OooO00o = ((C7992oO0ooO0) this.f20998OooO00o).m19652OooO00o(4609);
        if (OooO00o == null || OooO00o.length < 2) {
            return null;
        }
        String format = String.format("%d %d", Short.valueOf((short) OooO00o[0]), Short.valueOf((short) OooO00o[1]));
        if (format.equals("0 0")) {
            return "Off";
        }
        if (format.equals("1 0")) {
            return "On";
        }
        return "Unknown (" + format + C3848l.f10402t;
    }

    @Nullable
    public String OooO0o() {
        Rational OooO00o = ((C7992oO0ooO0) this.f20998OooO00o).m19633OooO00o(773);
        if (OooO00o == null || OooO00o.getNumerator() == 4294967295L || OooO00o.getNumerator() == 0) {
            return "inf";
        }
        StringBuilder sb = new StringBuilder();
        double numerator = (double) OooO00o.getNumerator();
        Double.isNaN(numerator);
        sb.append(numerator / 1000.0d);
        sb.append(" m");
        return sb.toString();
    }

    @Nullable
    public String OooO0o0() {
        int[] OooO00o = ((C7992oO0ooO0) this.f20998OooO00o).m19652OooO00o(C7992oO0ooO0.OooOOOo);
        if (OooO00o == null) {
            Integer OooO00o2 = ((C7992oO0ooO0) this.f20998OooO00o).m19639OooO00o(C7992oO0ooO0.OooOOOo);
            if (OooO00o2 == null) {
                return null;
            }
            OooO00o = new int[]{OooO00o2.intValue()};
        }
        if (OooO00o.length == 0) {
            return null;
        }
        String format = String.format("%d", Short.valueOf((short) OooO00o[0]));
        if (OooO00o.length > 1) {
            format = format + " " + String.format("%d", Short.valueOf((short) OooO00o[1]));
        }
        if (format.equals("0")) {
            return "Off";
        }
        if (format.equals("1")) {
            return "On";
        }
        if (format.equals("0 0")) {
            return "Off";
        }
        if (format.equals("1 0")) {
            return "On";
        }
        return "Unknown (" + format + C3848l.f10402t;
    }

    @Nullable
    public String OooO0oO() {
        return OooO0O0(0, 4);
    }

    @Nullable
    public String OooO0oo() {
        byte[] OooO00o = ((C7992oO0ooO0) this.f20998OooO00o).m19651OooO00o(C7992oO0ooO0.OooOo0);
        if (OooO00o == null) {
            return null;
        }
        if ((OooO00o[0] | OooO00o[1] | OooO00o[2] | OooO00o[3]) == 0) {
            return "Off";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("On, ");
        sb.append((OooO00o[43] & 1) > 0 ? "Mode 1" : "Mode 2");
        return sb.toString();
    }

    @Nullable
    public String OooOO0() {
        int[] OooO00o = ((C7992oO0ooO0) this.f20998OooO00o).m19652OooO00o(C7992oO0ooO0.OooOOo);
        if (OooO00o == null) {
            return null;
        }
        if (((short) OooO00o[0]) == 0) {
            return "Off";
        }
        if (((short) OooO00o[1]) == 1) {
            return "Full";
        }
        return "On (1/" + ((int) ((short) OooO00o[1])) + " strength)";
    }

    @Nullable
    public String OooOO0O() {
        return ((C7992oO0ooO0) this.f20998OooO00o).OooO0O0(C7992oO0ooO0.OooOo00);
    }

    @Nullable
    public String OooO0OO() {
        return OooO00o(C7992oO0ooO0.OooOOOO, "Bounce or Off", "Direct");
    }
}
