package com.p118pd.sdk;

import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.oO0oooOO  reason: case insensitive filesystem */
public class C8000oO0oooOO extends C7929oO0o0OoO<C8303oOo00oo0> {
    public C8000oO0oooOO(@NotNull C8303oOo00oo0 ooo00oo0) {
        super(ooo00oo0);
    }

    @Nullable
    public String OooO00o() {
        int[] OooO00o = ((C8303oOo00oo0) this.f20998OooO00o).m19652OooO00o(512);
        if (OooO00o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < OooO00o.length; i++) {
            sb.append((int) ((short) OooO00o[i]));
            if (i < OooO00o.length - 1) {
                sb.append(" ");
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    @Nullable
    public String OooO0O0() {
        Integer OooO00o = ((C8303oOo00oo0) this.f20998OooO00o).m19639OooO00o(4096);
        if (OooO00o == null) {
            return null;
        }
        short shortValue = OooO00o.shortValue();
        if (shortValue == 0) {
            return "Unknown";
        }
        if (shortValue == 20) {
            return "Tungsten (Incandescent)";
        }
        if (shortValue == 22) {
            return "Evening Sunlight";
        }
        if (shortValue == 256) {
            return "One Touch White Balance";
        }
        if (shortValue == 512) {
            return "Custom 1-4";
        }
        switch (shortValue) {
            case 16:
                return "Shade";
            case 17:
                return "Cloudy";
            case 18:
                return "Fine Weather";
            default:
                switch (shortValue) {
                    case 33:
                        return "Daylight Fluorescent";
                    case 34:
                        return "Day White Fluorescent";
                    case 35:
                        return "Cool White Fluorescent";
                    case 36:
                        return "White Fluorescent";
                    default:
                        return "Unknown (" + OooO00o + C3848l.f10402t;
                }
        }
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 0) {
            return OooO0O0(0, 4);
        }
        if (i == 512) {
            return OooO00o();
        }
        if (i == 1537) {
            return OooO0OO();
        }
        if (i != 4096) {
            return super.OooO0OO(i);
        }
        return OooO0O0();
    }

    @Nullable
    public String OooO0OO() {
        int[] OooO00o = ((C8303oOo00oo0) this.f20998OooO00o).m19652OooO00o(1537);
        if (OooO00o == null) {
            return null;
        }
        int length = OooO00o.length / 2;
        Rational[] rationalArr = new Rational[length];
        for (int i = 0; i < OooO00o.length / 2; i++) {
            int i2 = i * 2;
            rationalArr[i] = new Rational((long) ((short) OooO00o[i2]), (long) ((short) OooO00o[i2 + 1]));
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < length; i3++) {
            sb.append(rationalArr[i3].doubleValue());
            if (i3 < length - 1) {
                sb.append(" ");
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }
}
