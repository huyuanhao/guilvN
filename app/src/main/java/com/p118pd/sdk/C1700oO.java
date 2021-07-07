package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.pd.sdk.oO */
public class C1700oO extends C7929oO0o0OoO<oOO00000> {
    public C1700oO(@NotNull oOO00000 ooo00000) {
        super(ooo00000);
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        switch (i) {
            case 0:
                return ((oOO00000) this.f20998OooO00o).OooO0O0(i);
            case 10:
                return String.format("0x%08X", ((oOO00000) this.f20998OooO00o).m19639OooO00o(i));
            case 14:
                return String.format("%d", ((oOO00000) this.f20998OooO00o).m19639OooO00o(i));
            case 18:
                return String.format("0x%08X", ((oOO00000) this.f20998OooO00o).m19639OooO00o(i));
            case 22:
                return String.format("%d", ((oOO00000) this.f20998OooO00o).m19639OooO00o(i));
            case 24:
            case 31:
            case 38:
            case 45:
            case 52:
                return ((oOO00000) this.f20998OooO00o).OooO0O0(i);
            case 53:
                int[] OooO00o = ((oOO00000) this.f20998OooO00o).m19652OooO00o(i);
                if (OooO00o == null) {
                    return null;
                }
                return String.format("%d/%d", Integer.valueOf(OooO00o[0]), Integer.valueOf(OooO00o[1]));
            case 55:
                return String.format("%d", ((oOO00000) this.f20998OooO00o).m19639OooO00o(i));
            case 59:
                String OooO0O0 = ((oOO00000) this.f20998OooO00o).OooO0O0(i);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
                    return simpleDateFormat.format(simpleDateFormat.parse(OooO0O0));
                } catch (ParseException unused) {
                    return null;
                }
            case 67:
                return OooO00o(i, "New", "Waxing Crescent", "First Quarter", "Waxing Gibbous", "Full", "Waning Gibbous", "Last Quarter", "Waning Crescent");
            case 68:
            case 70:
                return String.format("%d", ((oOO00000) this.f20998OooO00o).m19639OooO00o(i));
            case 72:
                return OooO00o(i, "Off", "On");
            case 73:
                Double OooO00o2 = ((oOO00000) this.f20998OooO00o).m19637OooO00o(i);
                DecimalFormat decimalFormat = new DecimalFormat("0.000");
                if (OooO00o2 == null) {
                    return null;
                }
                return decimalFormat.format(OooO00o2);
            case 75:
                C7927oO0o0OOo OooO00o3 = ((oOO00000) this.f20998OooO00o).m19635OooO00o(i);
                if (OooO00o3 == null) {
                    return null;
                }
                return OooO00o3.toString();
            case 80:
                return ((oOO00000) this.f20998OooO00o).OooO0O0(i);
            default:
                return super.OooO0OO(i);
        }
    }
}
