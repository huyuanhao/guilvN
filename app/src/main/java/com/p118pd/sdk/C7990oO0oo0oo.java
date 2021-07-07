package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.text.DecimalFormat;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0oo0oo  reason: case insensitive filesystem */
public class C7990oO0oo0oo extends C7929oO0o0OoO<C7979oO0oo> {
    public static final HashMap<String, String> OooO00o = new HashMap<>();
    public static final HashMap<String, String> OooO0O0 = new HashMap<>();

    static {
        OooO00o.put("0 00 00", "None");
        OooO00o.put("0 01 00", "Olympus Zuiko Digital ED 50mm F2.0 Macro");
        OooO00o.put("0 01 01", "Olympus Zuiko Digital 40-150mm F3.5-4.5");
        OooO00o.put("0 01 10", "Olympus M.Zuiko Digital ED 14-42mm F3.5-5.6");
        OooO00o.put("0 02 00", "Olympus Zuiko Digital ED 150mm F2.0");
        OooO00o.put("0 02 10", "Olympus M.Zuiko Digital 17mm F2.8 Pancake");
        OooO00o.put("0 03 00", "Olympus Zuiko Digital ED 300mm F2.8");
        OooO00o.put("0 03 10", "Olympus M.Zuiko Digital ED 14-150mm F4.0-5.6 [II]");
        OooO00o.put("0 04 10", "Olympus M.Zuiko Digital ED 9-18mm F4.0-5.6");
        OooO00o.put("0 05 00", "Olympus Zuiko Digital 14-54mm F2.8-3.5");
        OooO00o.put("0 05 01", "Olympus Zuiko Digital Pro ED 90-250mm F2.8");
        OooO00o.put("0 05 10", "Olympus M.Zuiko Digital ED 14-42mm F3.5-5.6 L");
        OooO00o.put("0 06 00", "Olympus Zuiko Digital ED 50-200mm F2.8-3.5");
        OooO00o.put("0 06 01", "Olympus Zuiko Digital ED 8mm F3.5 Fisheye");
        OooO00o.put("0 06 10", "Olympus M.Zuiko Digital ED 40-150mm F4.0-5.6");
        OooO00o.put("0 07 00", "Olympus Zuiko Digital 11-22mm F2.8-3.5");
        OooO00o.put("0 07 01", "Olympus Zuiko Digital 18-180mm F3.5-6.3");
        OooO00o.put("0 07 10", "Olympus M.Zuiko Digital ED 12mm F2.0");
        OooO00o.put("0 08 01", "Olympus Zuiko Digital 70-300mm F4.0-5.6");
        OooO00o.put("0 08 10", "Olympus M.Zuiko Digital ED 75-300mm F4.8-6.7");
        OooO00o.put("0 09 10", "Olympus M.Zuiko Digital 14-42mm F3.5-5.6 II");
        OooO00o.put("0 10 01", "Kenko Tokina Reflex 300mm F6.3 MF Macro");
        OooO00o.put("0 10 10", "Olympus M.Zuiko Digital ED 12-50mm F3.5-6.3 EZ");
        OooO00o.put("0 11 10", "Olympus M.Zuiko Digital 45mm F1.8");
        OooO00o.put("0 12 10", "Olympus M.Zuiko Digital ED 60mm F2.8 Macro");
        OooO00o.put("0 13 10", "Olympus M.Zuiko Digital 14-42mm F3.5-5.6 II R");
        OooO00o.put("0 14 10", "Olympus M.Zuiko Digital ED 40-150mm F4.0-5.6 R");
        OooO00o.put("0 15 00", "Olympus Zuiko Digital ED 7-14mm F4.0");
        OooO00o.put("0 15 10", "Olympus M.Zuiko Digital ED 75mm F1.8");
        OooO00o.put("0 16 10", "Olympus M.Zuiko Digital 17mm F1.8");
        OooO00o.put("0 17 00", "Olympus Zuiko Digital Pro ED 35-100mm F2.0");
        OooO00o.put("0 18 00", "Olympus Zuiko Digital 14-45mm F3.5-5.6");
        OooO00o.put("0 18 10", "Olympus M.Zuiko Digital ED 75-300mm F4.8-6.7 II");
        OooO00o.put("0 19 10", "Olympus M.Zuiko Digital ED 12-40mm F2.8 Pro");
        OooO00o.put("0 20 00", "Olympus Zuiko Digital 35mm F3.5 Macro");
        OooO00o.put("0 20 10", "Olympus M.Zuiko Digital ED 40-150mm F2.8 Pro");
        OooO00o.put("0 21 10", "Olympus M.Zuiko Digital ED 14-42mm F3.5-5.6 EZ");
        OooO00o.put("0 22 00", "Olympus Zuiko Digital 17.5-45mm F3.5-5.6");
        OooO00o.put("0 22 10", "Olympus M.Zuiko Digital 25mm F1.8");
        OooO00o.put("0 23 00", "Olympus Zuiko Digital ED 14-42mm F3.5-5.6");
        OooO00o.put("0 23 10", "Olympus M.Zuiko Digital ED 7-14mm F2.8 Pro");
        OooO00o.put("0 24 00", "Olympus Zuiko Digital ED 40-150mm F4.0-5.6");
        OooO00o.put("0 24 10", "Olympus M.Zuiko Digital ED 300mm F4.0 IS Pro");
        OooO00o.put("0 25 10", "Olympus M.Zuiko Digital ED 8mm F1.8 Fisheye Pro");
        OooO00o.put("0 30 00", "Olympus Zuiko Digital ED 50-200mm F2.8-3.5 SWD");
        OooO00o.put("0 31 00", "Olympus Zuiko Digital ED 12-60mm F2.8-4.0 SWD");
        OooO00o.put("0 32 00", "Olympus Zuiko Digital ED 14-35mm F2.0 SWD");
        OooO00o.put("0 33 00", "Olympus Zuiko Digital 25mm F2.8");
        OooO00o.put("0 34 00", "Olympus Zuiko Digital ED 9-18mm F4.0-5.6");
        OooO00o.put("0 35 00", "Olympus Zuiko Digital 14-54mm F2.8-3.5 II");
        OooO00o.put("1 01 00", "Sigma 18-50mm F3.5-5.6 DC");
        OooO00o.put("1 01 10", "Sigma 30mm F2.8 EX DN");
        OooO00o.put("1 02 00", "Sigma 55-200mm F4.0-5.6 DC");
        OooO00o.put("1 02 10", "Sigma 19mm F2.8 EX DN");
        OooO00o.put("1 03 00", "Sigma 18-125mm F3.5-5.6 DC");
        OooO00o.put("1 03 10", "Sigma 30mm F2.8 DN | A");
        OooO00o.put("1 04 00", "Sigma 18-125mm F3.5-5.6 DC");
        OooO00o.put("1 04 10", "Sigma 19mm F2.8 DN | A");
        OooO00o.put("1 05 00", "Sigma 30mm F1.4 EX DC HSM");
        OooO00o.put("1 05 10", "Sigma 60mm F2.8 DN | A");
        OooO00o.put("1 06 00", "Sigma APO 50-500mm F4.0-6.3 EX DG HSM");
        OooO00o.put("1 07 00", "Sigma Macro 105mm F2.8 EX DG");
        OooO00o.put("1 08 00", "Sigma APO Macro 150mm F2.8 EX DG HSM");
        OooO00o.put("1 09 00", "Sigma 18-50mm F2.8 EX DC Macro");
        OooO00o.put("1 10 00", "Sigma 24mm F1.8 EX DG Aspherical Macro");
        OooO00o.put("1 11 00", "Sigma APO 135-400mm F4.5-5.6 DG");
        OooO00o.put("1 12 00", "Sigma APO 300-800mm F5.6 EX DG HSM");
        OooO00o.put("1 13 00", "Sigma 30mm F1.4 EX DC HSM");
        OooO00o.put("1 14 00", "Sigma APO 50-500mm F4.0-6.3 EX DG HSM");
        OooO00o.put("1 15 00", "Sigma 10-20mm F4.0-5.6 EX DC HSM");
        OooO00o.put("1 16 00", "Sigma APO 70-200mm F2.8 II EX DG Macro HSM");
        OooO00o.put("1 17 00", "Sigma 50mm F1.4 EX DG HSM");
        OooO00o.put("2 01 00", "Leica D Vario Elmarit 14-50mm F2.8-3.5 Asph.");
        OooO00o.put("2 01 10", "Lumix G Vario 14-45mm F3.5-5.6 Asph. Mega OIS");
        OooO00o.put("2 02 00", "Leica D Summilux 25mm F1.4 Asph.");
        OooO00o.put("2 02 10", "Lumix G Vario 45-200mm F4.0-5.6 Mega OIS");
        OooO00o.put("2 03 00", "Leica D Vario Elmar 14-50mm F3.8-5.6 Asph. Mega OIS");
        OooO00o.put("2 03 01", "Leica D Vario Elmar 14-50mm F3.8-5.6 Asph.");
        OooO00o.put("2 03 10", "Lumix G Vario HD 14-140mm F4.0-5.8 Asph. Mega OIS");
        OooO00o.put("2 04 00", "Leica D Vario Elmar 14-150mm F3.5-5.6");
        OooO00o.put("2 04 10", "Lumix G Vario 7-14mm F4.0 Asph.");
        OooO00o.put("2 05 10", "Lumix G 20mm F1.7 Asph.");
        OooO00o.put("2 06 10", "Leica DG Macro-Elmarit 45mm F2.8 Asph. Mega OIS");
        OooO00o.put("2 07 10", "Lumix G Vario 14-42mm F3.5-5.6 Asph. Mega OIS");
        OooO00o.put("2 08 10", "Lumix G Fisheye 8mm F3.5");
        OooO00o.put("2 09 10", "Lumix G Vario 100-300mm F4.0-5.6 Mega OIS");
        OooO00o.put("2 10 10", "Lumix G 14mm F2.5 Asph.");
        OooO00o.put("2 11 10", "Lumix G 12.5mm F12 3D");
        OooO00o.put("2 12 10", "Leica DG Summilux 25mm F1.4 Asph.");
        OooO00o.put("2 13 10", "Lumix G X Vario PZ 45-175mm F4.0-5.6 Asph. Power OIS");
        OooO00o.put("2 14 10", "Lumix G X Vario PZ 14-42mm F3.5-5.6 Asph. Power OIS");
        OooO00o.put("2 15 10", "Lumix G X Vario 12-35mm F2.8 Asph. Power OIS");
        OooO00o.put("2 16 10", "Lumix G Vario 45-150mm F4.0-5.6 Asph. Mega OIS");
        OooO00o.put("2 17 10", "Lumix G X Vario 35-100mm F2.8 Power OIS");
        OooO00o.put("2 18 10", "Lumix G Vario 14-42mm F3.5-5.6 II Asph. Mega OIS");
        OooO00o.put("2 19 10", "Lumix G Vario 14-140mm F3.5-5.6 Asph. Power OIS");
        OooO00o.put("2 20 10", "Lumix G Vario 12-32mm F3.5-5.6 Asph. Mega OIS");
        OooO00o.put("2 21 10", "Leica DG Nocticron 42.5mm F1.2 Asph. Power OIS");
        OooO00o.put("2 22 10", "Leica DG Summilux 15mm F1.7 Asph.");
        OooO00o.put("2 24 10", "Lumix G Macro 30mm F2.8 Asph. Mega OIS");
        OooO00o.put("2 25 10", "Lumix G 42.5mm F1.7 Asph. Power OIS");
        OooO00o.put("3 01 00", "Leica D Vario Elmarit 14-50mm F2.8-3.5 Asph.");
        OooO00o.put("3 02 00", "Leica D Summilux 25mm F1.4 Asph.");
        OooO00o.put("5 01 10", "Tamron 14-150mm F3.5-5.8 Di III");
        OooO0O0.put("0 00", "None");
        OooO0O0.put("0 04", "Olympus Zuiko Digital EC-14 1.4x Teleconverter");
        OooO0O0.put("0 08", "Olympus EX-25 Extension Tube");
        OooO0O0.put("0 10", "Olympus Zuiko Digital EC-20 2.0x Teleconverter");
    }

    public C7990oO0oo0oo(@NotNull C7979oO0oo oo0oo) {
        super(oo0oo);
    }

    @Nullable
    public String OooO() {
        Integer OooO00o2 = ((C7979oO0oo) this.f20998OooO00o).m19639OooO00o(523);
        if (OooO00o2 == null) {
            return null;
        }
        return String.format("0x%04X", OooO00o2);
    }

    @Nullable
    public String OooO00o() {
        Integer OooO00o2 = ((C7979oO0oo) this.f20998OooO00o).m19639OooO00o(260);
        if (OooO00o2 == null) {
            return null;
        }
        String format = String.format("%04X", OooO00o2);
        return String.format("%s.%s", format.substring(0, format.length() - 3), format.substring(format.length() - 3));
    }

    @Nullable
    public String OooO0O0() {
        String OooO0O02 = ((C7979oO0oo) this.f20998OooO00o).OooO0O0(256);
        if (OooO0O02 == null) {
            return null;
        }
        return C7997oO0ooOO0.f21035OooO0O0.containsKey(OooO0O02) ? C7997oO0ooOO0.f21035OooO0O0.get(OooO0O02) : OooO0O02;
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 0) {
            return OooO0OO();
        }
        if (i == 256) {
            return OooO0O0();
        }
        if (i == 513) {
            return OooOO0();
        }
        if (i == 769) {
            return OooO0Oo();
        }
        if (i == 259) {
            return OooO0oO();
        }
        if (i == 260) {
            return OooO00o();
        }
        if (i == 522) {
            return OooOOO0();
        }
        if (i == 523) {
            return OooO();
        }
        if (i == 4096) {
            return OooO0o();
        }
        if (i == 4097) {
            return OooO0o0();
        }
        switch (i) {
            case 516:
                return OooO0oo();
            case 517:
                return OooOO0o();
            case 518:
                return OooOO0O();
            default:
                return super.OooO0OO(i);
        }
    }

    @Nullable
    public String OooO0Oo() {
        String OooO0O02 = ((C7979oO0oo) this.f20998OooO00o).OooO0O0(769);
        if (OooO0O02 == null) {
            return null;
        }
        String[] split = OooO0O02.split(" ");
        if (split.length < 6) {
            return null;
        }
        try {
            return OooO0O0.get(String.format("%X %02X", Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[2]))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    public String OooO0o() {
        return OooO00o(4096, "None", null, "Simple E-System", "E-System");
    }

    @Nullable
    public String OooO0o0() {
        return OooO00o(4097, "None", "FL-20", "FL-50", "RF-11", "TF-22", "FL-36", "FL-50R", "FL-36R");
    }

    @Nullable
    public String OooO0oO() {
        return ((C7979oO0oo) this.f20998OooO00o).OooO0O0(259) + " mm";
    }

    @Nullable
    public String OooO0oo() {
        Integer OooO00o2 = ((C7979oO0oo) this.f20998OooO00o).m19639OooO00o(516);
        if (OooO00o2 == null) {
            return null;
        }
        String format = String.format("%04X", OooO00o2);
        return String.format("%s.%s", format.substring(0, format.length() - 3), format.substring(format.length() - 3));
    }

    @Nullable
    public String OooOO0() {
        String OooO0O02 = ((C7979oO0oo) this.f20998OooO00o).OooO0O0(513);
        if (OooO0O02 == null) {
            return null;
        }
        String[] split = OooO0O02.split(" ");
        if (split.length < 6) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            return OooO00o.get(String.format("%X %02X %02X", Integer.valueOf(parseInt), Integer.valueOf(parseInt2), Integer.valueOf(parseInt3)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    public String OooOO0O() {
        Integer OooO00o2 = ((C7979oO0oo) this.f20998OooO00o).m19639OooO00o(518);
        if (OooO00o2 == null) {
            return null;
        }
        return new DecimalFormat("0.#").format(OooO00o(OooO00o2.intValue()));
    }

    @Nullable
    public String OooOO0o() {
        Integer OooO00o2 = ((C7979oO0oo) this.f20998OooO00o).m19639OooO00o(517);
        if (OooO00o2 == null) {
            return null;
        }
        return new DecimalFormat("0.#").format(OooO00o(OooO00o2.intValue()));
    }

    @Nullable
    public String OooOOO0() {
        Integer OooO00o2 = ((C7979oO0oo) this.f20998OooO00o).m19639OooO00o(522);
        if (OooO00o2 == null) {
            return null;
        }
        return new DecimalFormat("0.#").format(OooO00o(OooO00o2.intValue()));
    }

    public static double OooO00o(int i) {
        double sqrt = Math.sqrt(2.0d);
        double d = (double) i;
        Double.isNaN(d);
        return Math.pow(sqrt, d / 256.0d);
    }

    @Nullable
    public String OooO0OO() {
        return OooO0O0(0, 4);
    }
}
