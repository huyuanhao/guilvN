package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.pd.sdk.oOo00o00  reason: case insensitive filesystem */
public class C8297oOo00o00 extends C7929oO0o0OoO<C8004oO0ooooo> {
    public C8297oOo00o00(@NotNull C8004oO0ooooo oo0ooooo) {
        super(oo0ooooo);
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        switch (i) {
            case 0:
                return String.format("%d", ((C8004oO0ooooo) this.f20998OooO00o).m19639OooO00o(i));
            case 2:
                return ((C8004oO0ooooo) this.f20998OooO00o).OooO0O0(i);
            case 12:
                return ((C8004oO0ooooo) this.f20998OooO00o).OooO0O0(i);
            case 14:
                int[] OooO00o = ((C8004oO0ooooo) this.f20998OooO00o).m19652OooO00o(i);
                if (OooO00o == null) {
                    return null;
                }
                return String.format("%d/%d", Integer.valueOf(OooO00o[0]), Integer.valueOf(OooO00o[1]));
            case 18:
                return String.format("%d", ((C8004oO0ooooo) this.f20998OooO00o).m19639OooO00o(i));
            case 22:
                String OooO0O0 = ((C8004oO0ooooo) this.f20998OooO00o).OooO0O0(i);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
                    return simpleDateFormat.format(simpleDateFormat.parse(OooO0O0));
                } catch (ParseException unused) {
                    return null;
                }
            case 36:
                return OooO00o(i, "New", "Waxing Crescent", "First Quarter", "Waxing Gibbous", "Full", "Waning Gibbous", "Last Quarter", "Waning Crescent");
            case 38:
            case 40:
                return String.format("%d", ((C8004oO0ooooo) this.f20998OooO00o).m19639OooO00o(i));
            case 42:
                C7927oO0o0OOo OooO00o2 = ((C8004oO0ooooo) this.f20998OooO00o).m19635OooO00o(i);
                if (OooO00o2 == null) {
                    return null;
                }
                return OooO00o2.toString();
            case 72:
            case 74:
            case 76:
            case 78:
                return String.format("%d", ((C8004oO0ooooo) this.f20998OooO00o).m19639OooO00o(i));
            case 80:
                return OooO00o(i, "Off", "On");
            case 82:
                return String.format("%d", ((C8004oO0ooooo) this.f20998OooO00o).m19639OooO00o(i));
            case 84:
                Double OooO00o3 = ((C8004oO0ooooo) this.f20998OooO00o).m19637OooO00o(i);
                DecimalFormat decimalFormat = new DecimalFormat("0.000");
                if (OooO00o3 == null) {
                    return null;
                }
                return decimalFormat.format(OooO00o3);
            case 86:
                return ((C8004oO0ooooo) this.f20998OooO00o).OooO0O0(i);
            default:
                return super.OooO0OO(i);
        }
    }
}
