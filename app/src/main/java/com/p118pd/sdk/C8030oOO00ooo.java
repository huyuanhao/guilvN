package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.umeng.message.proguard.C3817f;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;

/* renamed from: com.pd.sdk.oOO00ooo  reason: case insensitive filesystem */
public class C8030oOO00ooo extends C7929oO0o0OoO<C8022oOO00o0O> {
    public static final int OooO00o = 1952807028;
    public static final int OooO0O0 = 1684370275;
    public static final int OooO0OO = 1936287520;
    public static final int OooO0Oo = 1835360627;
    public static final int OooO0o = 1835824483;
    public static final int OooO0o0 = 1482250784;
    public static final int OooO0oO = 1668641398;

    public C8030oOO00ooo(@NotNull C8022oOO00o0O ooo00o0o) {
        super(ooo00o0o);
    }

    @NotNull
    public static String OooO00o(double d, int i, boolean z) {
        int i2 = i;
        String str = "";
        boolean z2 = true;
        if (i2 < 1) {
            return str + Math.round(d);
        }
        long abs = Math.abs((long) d);
        double abs2 = Math.abs(d);
        double d2 = (double) abs;
        Double.isNaN(d2);
        long round = (long) ((int) Math.round((abs2 - d2) * Math.pow(10.0d, (double) i2)));
        String str2 = str;
        long j = round;
        while (i2 > 0) {
            byte abs3 = (byte) ((int) Math.abs(j % 10));
            j /= 10;
            if (str2.length() > 0 || z || abs3 != 0 || i2 == 1) {
                str2 = ((int) abs3) + str2;
            }
            i2--;
        }
        long j2 = abs + j;
        if (d >= AbstractC8352oOoOOoO0.OooO0O0 || (j2 == 0 && round == 0)) {
            z2 = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z2) {
            str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        sb.append(str);
        sb.append(j2);
        sb.append(C9058ooOoOoOO.OooOO0);
        sb.append(str2);
        return sb.toString();
    }

    @Nullable
    private String OooO0O0() {
        String OooO0O02 = ((C8022oOO00o0O) this.f20998OooO00o).OooO0O0(12);
        if (OooO0O02 == null) {
            return null;
        }
        try {
            switch (OooO00o(OooO0O02)) {
                case 1633842036:
                    return "Abstract";
                case 1818848875:
                    return "DeviceLink";
                case 1835955314:
                    return "Display Device";
                case 1852662636:
                    return "Named Color";
                case 1886549106:
                    return "Output Device";
                case 1935896178:
                    return "Input Device";
                case 1936744803:
                    return "ColorSpace Conversion";
                default:
                    return String.format("Unknown (%s)", OooO0O02);
            }
        } catch (IOException unused) {
            return OooO0O02;
        }
    }

    @Nullable
    private String OooO0Oo() {
        return OooO00o(64, "Perceptual", "Media-Relative Colorimetric", ExifInterface.o00000oO, "ICC-Absolute Colorimetric");
    }

    @Nullable
    private String OooOO0(int i) {
        String str;
        String str2;
        String str3;
        try {
            byte[] OooO00o2 = ((C8022oOO00o0O) this.f20998OooO00o).m19651OooO00o(i);
            if (OooO00o2 == null) {
                return ((C8022oOO00o0O) this.f20998OooO00o).OooO0O0(i);
            }
            oO0Oo0 oo0oo0 = new oO0Oo0(OooO00o2);
            int i2 = 0;
            int OooO0O02 = oo0oo0.m19604OooO0O0(0);
            switch (OooO0O02) {
                case OooO0o0 /*{ENCODED_INT: 1482250784}*/:
                    StringBuilder sb = new StringBuilder();
                    DecimalFormat decimalFormat = new DecimalFormat("0.####");
                    int length = (OooO00o2.length - 8) / 12;
                    while (i2 < length) {
                        int i3 = (i2 * 12) + 8;
                        float OooO0O03 = oo0oo0.m19603OooO0O0(i3);
                        float OooO0O04 = oo0oo0.m19603OooO0O0(i3 + 4);
                        float OooO0O05 = oo0oo0.m19603OooO0O0(i3 + 8);
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(C3848l.f10401s);
                        sb.append(decimalFormat.format((double) OooO0O03));
                        sb.append(", ");
                        sb.append(decimalFormat.format((double) OooO0O04));
                        sb.append(", ");
                        sb.append(decimalFormat.format((double) OooO0O05));
                        sb.append(C3848l.f10402t);
                        i2++;
                    }
                    return sb.toString();
                case OooO0oO /*{ENCODED_INT: 1668641398}*/:
                    int OooO0O06 = oo0oo0.m19604OooO0O0(8);
                    StringBuilder sb2 = new StringBuilder();
                    for (int i4 = 0; i4 < OooO0O06; i4++) {
                        if (i4 != 0) {
                            sb2.append(", ");
                        }
                        double OooO0OO2 = (double) ((float) oo0oo0.OooO0OO((i4 * 2) + 12));
                        Double.isNaN(OooO0OO2);
                        sb2.append(OooO00o(OooO0OO2 / 65535.0d, 7, false));
                    }
                    return sb2.toString();
                case 1684370275:
                    return new String(OooO00o2, 12, oo0oo0.m19604OooO0O0(8) - 1);
                case 1835360627:
                    int OooO0O07 = oo0oo0.m19604OooO0O0(8);
                    float OooO0O08 = oo0oo0.m19603OooO0O0(12);
                    float OooO0O09 = oo0oo0.m19603OooO0O0(16);
                    float OooO0O010 = oo0oo0.m19603OooO0O0(20);
                    int OooO0O011 = oo0oo0.m19604OooO0O0(24);
                    float OooO0O012 = oo0oo0.m19603OooO0O0(28);
                    int OooO0O013 = oo0oo0.m19604OooO0O0(32);
                    String str4 = "Unknown";
                    if (OooO0O07 == 0) {
                        str = str4;
                    } else if (OooO0O07 == 1) {
                        str = "1931 2°";
                    } else if (OooO0O07 != 2) {
                        str = String.format("Unknown %d", Integer.valueOf(OooO0O07));
                    } else {
                        str = "1964 10°";
                    }
                    if (OooO0O011 != 0) {
                        if (OooO0O011 == 1) {
                            str4 = "0/45 or 45/0";
                        } else if (OooO0O011 != 2) {
                            str4 = String.format("Unknown %d", Integer.valueOf(OooO0O07));
                        } else {
                            str4 = "0/d or d/0";
                        }
                    }
                    switch (OooO0O013) {
                        case 0:
                            str2 = "unknown";
                            break;
                        case 1:
                            str2 = "D50";
                            break;
                        case 2:
                            str2 = "D65";
                            break;
                        case 3:
                            str2 = "D93";
                            break;
                        case 4:
                            str2 = "F2";
                            break;
                        case 5:
                            str2 = "D55";
                            break;
                        case 6:
                            str2 = ExifInterface.o000oo0O;
                            break;
                        case 7:
                            str2 = "Equi-Power (E)";
                            break;
                        case 8:
                            str2 = "F8";
                            break;
                        default:
                            str2 = String.format("Unknown %d", Integer.valueOf(OooO0O013));
                            break;
                    }
                    DecimalFormat decimalFormat2 = new DecimalFormat(AbstractC7922oO0o0O0O.OooO00o);
                    return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", str, decimalFormat2.format((double) OooO0O08), decimalFormat2.format((double) OooO0O09), decimalFormat2.format((double) OooO0O010), str4, Integer.valueOf(Math.round(OooO0O012 * 100.0f)), str2);
                case OooO0o /*{ENCODED_INT: 1835824483}*/:
                    int OooO0O014 = oo0oo0.m19604OooO0O0(8);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(OooO0O014);
                    while (i2 < OooO0O014) {
                        int i5 = (i2 * 12) + 16;
                        String OooO00o3 = C8023oOO00o0o.OooO00o(oo0oo0.m19604OooO0O0(i5));
                        int OooO0O015 = oo0oo0.m19604OooO0O0(i5 + 4);
                        int OooO0O016 = oo0oo0.m19604OooO0O0(i5 + 8);
                        try {
                            str3 = new String(OooO00o2, OooO0O016, OooO0O015, C3817f.f10342d);
                        } catch (UnsupportedEncodingException unused) {
                            str3 = new String(OooO00o2, OooO0O016, OooO0O015);
                        }
                        sb3.append(" ");
                        sb3.append(OooO00o3);
                        sb3.append(C3848l.f10401s);
                        sb3.append(str3);
                        sb3.append(C3848l.f10402t);
                        i2++;
                    }
                    return sb3.toString();
                case OooO0OO /*{ENCODED_INT: 1936287520}*/:
                    return C8023oOO00o0o.OooO00o(oo0oo0.m19604OooO0O0(8));
                case OooO00o /*{ENCODED_INT: 1952807028}*/:
                    try {
                        return new String(OooO00o2, 8, (OooO00o2.length - 8) - 1, "ASCII");
                    } catch (UnsupportedEncodingException unused2) {
                        return new String(OooO00o2, 8, (OooO00o2.length - 8) - 1);
                    }
                default:
                    return String.format("%s (0x%08X): %d bytes", C8023oOO00o0o.OooO00o(OooO0O02), Integer.valueOf(OooO0O02), Integer.valueOf(OooO00o2.length));
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    public String OooO0OO(int i) {
        if (i == 8) {
            return OooO0OO();
        }
        if (i == 12) {
            return OooO0O0();
        }
        if (i == 40) {
            return OooO00o();
        }
        if (i == 64) {
            return OooO0Oo();
        }
        if (i <= 538976288 || i >= 2054847098) {
            return super.OooO0OO(i);
        }
        return OooOO0(i);
    }

    @Nullable
    private String OooO0OO() {
        Integer OooO00o2 = ((C8022oOO00o0O) this.f20998OooO00o).m19639OooO00o(8);
        if (OooO00o2 == null) {
            return null;
        }
        return String.format("%d.%d.%d", Integer.valueOf((OooO00o2.intValue() & -16777216) >> 24), Integer.valueOf((OooO00o2.intValue() & 15728640) >> 20), Integer.valueOf((OooO00o2.intValue() & 983040) >> 16));
    }

    @Nullable
    private String OooO00o() {
        String OooO0O02 = ((C8022oOO00o0O) this.f20998OooO00o).OooO0O0(40);
        if (OooO0O02 == null) {
            return null;
        }
        try {
            switch (OooO00o(OooO0O02)) {
                case 1095782476:
                    return "Apple Computer, Inc.";
                case 1297303124:
                    return "Microsoft Corporation";
                case 1397180704:
                    return "Silicon Graphics, Inc.";
                case 1398099543:
                    return "Sun Microsystems, Inc.";
                case 1413959252:
                    return "Taligent, Inc.";
                default:
                    return String.format("Unknown (%s)", OooO0O02);
            }
        } catch (IOException unused) {
            return OooO0O02;
        }
    }

    public static int OooO00o(@NotNull String str) throws IOException {
        return new oO0Oo0(str.getBytes()).m19604OooO0O0(0);
    }
}
