package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.facebook.react.views.text.FontMetricsUtil;
import com.umeng.message.proguard.C3817f;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.pd.sdk.oOOOO0oO  reason: case insensitive filesystem */
public class C8121oOOOO0oO extends C7929oO0o0OoO<C8122oOOOO0oo> {
    public C8121oOOOO0oO(@NotNull C8122oOOOO0oo ooooo0oo) {
        super(ooooo0oo);
    }

    @Nullable
    private String OooOOO(int i) {
        byte[] OooO00o = ((C8122oOOOO0oo) this.f20998OooO00o).m19651OooO00o(i);
        if (OooO00o == null) {
            return null;
        }
        return String.format("%d bytes binary data", Integer.valueOf(OooO00o.length));
    }

    @Nullable
    private String OooOOO0(int i) {
        byte[] OooO00o = ((C8122oOOOO0oo) this.f20998OooO00o).m19651OooO00o(i);
        if (OooO00o == null) {
            return null;
        }
        try {
            return String.format("%d", Integer.valueOf(new oO0Oo0(OooO00o).m19604OooO0O0(0)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Nullable
    private String OooOOOO(int i) {
        byte[] OooO00o = ((C8122oOOOO0oo) this.f20998OooO00o).m19651OooO00o(i);
        if (OooO00o == null || OooO00o.length == 0) {
            return null;
        }
        return OooO00o[0] == 0 ? "No" : "Yes";
    }

    @Nullable
    private String OooOOOo(int i) {
        byte[] OooO00o = ((C8122oOOOO0oo) this.f20998OooO00o).m19651OooO00o(i);
        if (OooO00o == null) {
            return null;
        }
        return new String(OooO00o);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053 A[Catch:{ IOException -> 0x00ab }] */
    @com.drew.lang.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String OooO00o() {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8121oOOOO0oO.OooO00o():java.lang.String");
    }

    @Nullable
    public String OooO0O0() {
        try {
            byte[] OooO00o = ((C8122oOOOO0oo) this.f20998OooO00o).m19651OooO00o(C8122oOOOO0oo.Ooooo00);
            if (OooO00o == null) {
                return null;
            }
            return Double.toString(new oO0Oo0(OooO00o).m19593OooO00o(4));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    public String OooO0OO(int i) {
        if (i != 1002) {
            if (i == 1005) {
                return OooO0Oo();
            }
            if (i == 1028) {
                return OooOOO(i);
            }
            if (i == 1030) {
                return OooO00o();
            }
            if (!(i == 1044 || i == 1054)) {
                if (i == 1057) {
                    return OooO0o();
                }
                if (i == 1062) {
                    return OooO0OO();
                }
                if (i == 1064) {
                    return OooO0O0();
                }
                if (i == 2999) {
                    return OooOO0(i);
                }
                if (i != 1049) {
                    if (i == 1050) {
                        return OooO0o0();
                    }
                    switch (i) {
                        case C8122oOOOO0oo.OooOoo0 /*{ENCODED_INT: 1033}*/:
                        case C8122oOOOO0oo.OooOooo /*{ENCODED_INT: 1036}*/:
                            return OooOO0o(i);
                        case C8122oOOOO0oo.OooOoo /*{ENCODED_INT: 1034}*/:
                            return OooOOOO(i);
                        case C8122oOOOO0oo.OooOooO /*{ENCODED_INT: 1035}*/:
                            break;
                        case 1037:
                            break;
                        default:
                            if (i < 2000 || i > 2998) {
                                return super.OooO0OO(i);
                            }
                            return OooOO0O(i);
                    }
                }
            }
            return OooOOO0(i);
        }
        return OooOOOo(i);
    }

    @Nullable
    public String OooO0Oo() {
        try {
            byte[] OooO00o = ((C8122oOOOO0oo) this.f20998OooO00o).m19651OooO00o(1005);
            if (OooO00o == null) {
                return null;
            }
            oO0Oo0 oo0oo0 = new oO0Oo0(OooO00o);
            float OooO0O0 = oo0oo0.m19603OooO0O0(0);
            float OooO0O02 = oo0oo0.m19603OooO0O0(8);
            DecimalFormat decimalFormat = new DecimalFormat("0.##");
            return decimalFormat.format((double) OooO0O0) + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + decimalFormat.format((double) OooO0O02) + " DPI";
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public String OooO0o() {
        try {
            byte[] OooO00o = ((C8122oOOOO0oo) this.f20998OooO00o).m19651OooO00o(C8122oOOOO0oo.o000oOoO);
            if (OooO00o == null) {
                return null;
            }
            oO0Oo0 oo0oo0 = new oO0Oo0(OooO00o);
            int OooO0O0 = oo0oo0.m19604OooO0O0(0);
            int OooO0O02 = oo0oo0.m19604OooO0O0(5) * 2;
            String OooO00o2 = oo0oo0.OooO00o(9, OooO0O02, C3817f.f10341c);
            int i = 9 + OooO0O02;
            int OooO0O03 = oo0oo0.m19604OooO0O0(i);
            int i2 = i + 4;
            int i3 = OooO0O03 * 2;
            return String.format("%d (%s, %s) %d", Integer.valueOf(OooO0O0), OooO00o2, oo0oo0.OooO00o(i2, i3, C3817f.f10341c), Integer.valueOf(oo0oo0.m19604OooO0O0(i2 + i3)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Nullable
    public String OooO0o0() {
        try {
            byte[] OooO00o = ((C8122oOOOO0oo) this.f20998OooO00o).m19651OooO00o(C8122oOOOO0oo.OoooO00);
            if (OooO00o == null) {
                return null;
            }
            oO0Oo0 oo0oo0 = new oO0Oo0(OooO00o);
            int OooO0O0 = oo0oo0.m19604OooO0O0(20) * 2;
            return String.format("%s (%d,%d,%d,%d) %d Slices", oo0oo0.OooO00o(24, OooO0O0, C3817f.f10341c), Integer.valueOf(oo0oo0.m19604OooO0O0(4)), Integer.valueOf(oo0oo0.m19604OooO0O0(8)), Integer.valueOf(oo0oo0.m19604OooO0O0(12)), Integer.valueOf(oo0oo0.m19604OooO0O0(16)), Integer.valueOf(oo0oo0.m19604OooO0O0(OooO0O0 + 24)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Nullable
    public String OooOO0(int i) {
        try {
            byte[] OooO00o = ((C8122oOOOO0oo) this.f20998OooO00o).m19651OooO00o(i);
            if (OooO00o == null) {
                return null;
            }
            oO0Oo0 oo0oo0 = new oO0Oo0(OooO00o);
            return new String(oo0oo0.m19568OooO00o(1, (int) oo0oo0.OooO00o(0)), "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public String OooOO0O(int i) {
        String str;
        String str2;
        int i2;
        int i3;
        C8119oOOOO0o ooooo0o;
        oOOOOo0O oooooo0o;
        oO0Oo0 oo0oo0;
        C8119oOOOO0o ooooo0o2;
        String str3 = C3848l.f10402t;
        String str4 = Constants.ACCEPT_TIME_SEPARATOR_SP;
        try {
            byte[] OooO00o = ((C8122oOOOO0oo) this.f20998OooO00o).m19651OooO00o(i);
            if (OooO00o == null) {
                return null;
            }
            oO0Oo0 oo0oo02 = new oO0Oo0(OooO00o);
            short s = 1;
            int OooO00o2 = ((int) ((oo0oo02.OooO00o() - ((long) oo0oo02.OooO00o(((int) oo0oo02.OooO00o()) - 1))) - 1)) / 26;
            oOOOOo0O oooooo0o2 = new oOOOOo0O();
            oOOOOo0O oooooo0o3 = new oOOOOo0O();
            ArrayList arrayList = new ArrayList();
            String str5 = null;
            int i4 = 0;
            while (i4 < OooO00o2) {
                int i5 = i4 * 26;
                try {
                    short OooO00o3 = oo0oo02.m19598OooO00o(i5);
                    if (OooO00o3 != 0) {
                        i2 = i4;
                        if (OooO00o3 == s || OooO00o3 == 2) {
                            str2 = str3;
                            str = str4;
                            i3 = OooO00o2;
                            oO0Oo0 oo0oo03 = oo0oo02;
                            if (OooO00o3 == 1) {
                                ooooo0o = new C8119oOOOO0o("Linked");
                            } else {
                                ooooo0o = new C8119oOOOO0o("Unlinked");
                            }
                            int i6 = 0;
                            while (i6 < 6) {
                                int i7 = i6 * 4;
                                double OooO0O0 = (double) oo0oo03.OooO0O0(i7 + 2 + i5);
                                double OooO00o4 = (double) oo0oo03.m19595OooO00o(i7 + 3 + i5);
                                double pow = Math.pow(2.0d, 24.0d);
                                Double.isNaN(OooO00o4);
                                Double.isNaN(OooO0O0);
                                ooooo0o.OooO00o(i6, OooO0O0 + (OooO00o4 / pow));
                                i6++;
                                i5 = i5;
                                oo0oo03 = oo0oo03;
                            }
                            oo0oo02 = oo0oo03;
                            oooooo0o2 = oooooo0o2;
                            oooooo0o2.OooO00o(ooooo0o);
                        } else {
                            if (OooO00o3 != 3) {
                                short s2 = 4;
                                if (OooO00o3 != 4) {
                                    if (OooO00o3 != 5) {
                                        if (OooO00o3 == 8) {
                                            str5 = oo0oo02.m19598OooO00o(i5 + 2) == 1 ? "with all pixels" : "without all pixels";
                                        }
                                        str2 = str3;
                                        str = str4;
                                        i3 = OooO00o2;
                                    } else {
                                        s2 = 4;
                                    }
                                }
                                if (OooO00o3 == s2) {
                                    ooooo0o2 = new C8119oOOOO0o("Linked");
                                } else {
                                    ooooo0o2 = new C8119oOOOO0o("Unlinked");
                                }
                                int i8 = 0;
                                int i9 = 6;
                                while (i8 < i9) {
                                    int i10 = i8 * 4;
                                    double OooO0O02 = (double) oo0oo02.OooO0O0(i10 + 2 + i5);
                                    double OooO00o5 = (double) oo0oo02.m19595OooO00o(i10 + 3 + i5);
                                    double pow2 = Math.pow(2.0d, 24.0d);
                                    Double.isNaN(OooO00o5);
                                    Double.isNaN(OooO0O02);
                                    ooooo0o2.OooO00o(i8, OooO0O02 + (OooO00o5 / pow2));
                                    i8++;
                                    i9 = 6;
                                    OooO00o2 = OooO00o2;
                                    str3 = str3;
                                    str4 = str4;
                                    oo0oo02 = oo0oo02;
                                    oooooo0o2 = oooooo0o2;
                                }
                                str2 = str3;
                                str = str4;
                                i3 = OooO00o2;
                                oo0oo0 = oo0oo02;
                                oooooo0o = oooooo0o2;
                                oooooo0o3.OooO00o(ooooo0o2);
                            } else {
                                str2 = str3;
                                str = str4;
                                i3 = OooO00o2;
                                oo0oo0 = oo0oo02;
                                oooooo0o = oooooo0o2;
                                if (oooooo0o3.OooO00o() != 0) {
                                    arrayList.add(oooooo0o3);
                                }
                                oooooo0o3 = new oOOOOo0O("Open Subpath");
                            }
                            oo0oo02 = oo0oo0;
                            oooooo0o2 = oooooo0o;
                        }
                    } else {
                        str2 = str3;
                        str = str4;
                        i3 = OooO00o2;
                        i2 = i4;
                        if (oooooo0o2.OooO00o() != 0) {
                            arrayList.add(oooooo0o2);
                        }
                        oooooo0o2 = new oOOOOo0O("Closed Subpath");
                    }
                    i4 = i2 + 1;
                    s = 1;
                    OooO00o2 = i3;
                    str3 = str2;
                    str4 = str;
                } catch (Exception unused) {
                    return null;
                }
            }
            String str6 = str3;
            String str7 = str4;
            if (oooooo0o2.OooO00o() != 0) {
                arrayList.add(oooooo0o2);
            }
            if (oooooo0o3.OooO00o() != 0) {
                arrayList.add(oooooo0o3);
            }
            byte OooO00o6 = oo0oo02.OooO00o(((int) oo0oo02.OooO00o()) - 1);
            String OooO0O03 = oo0oo02.m19606OooO0O0((((int) oo0oo02.OooO00o()) - OooO00o6) - 1, (int) OooO00o6, C7895oO0OoO00.OooO0Oo);
            StringBuilder sb = new StringBuilder();
            sb.append(C8318oOo0oooo.OooO00o);
            sb.append(OooO0O03);
            sb.append(C8318oOo0oooo.OooO00o);
            sb.append(" having ");
            if (str5 != null) {
                sb.append("initial fill rule \"");
                sb.append(str5);
                sb.append("\" and ");
            }
            sb.append(arrayList.size());
            sb.append(arrayList.size() == 1 ? " subpath:" : " subpaths:");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                oOOOOo0O oooooo0o4 = (oOOOOo0O) it.next();
                sb.append("\n- ");
                sb.append(oooooo0o4.m19784OooO00o());
                sb.append(" with ");
                sb.append(arrayList.size());
                sb.append(arrayList.size() == 1 ? " knot:" : " knots:");
                for (C8119oOOOO0o ooooo0o3 : oooooo0o4.m19783OooO00o()) {
                    sb.append("\n  - ");
                    sb.append(ooooo0o3.OooO00o());
                    sb.append(" (");
                    sb.append(ooooo0o3.OooO00o(0));
                    sb.append(str7);
                    sb.append(ooooo0o3.OooO00o(1));
                    sb.append(str6);
                    sb.append(" (");
                    sb.append(ooooo0o3.OooO00o(2));
                    sb.append(str7);
                    sb.append(ooooo0o3.OooO00o(3));
                    sb.append(str6);
                    sb.append(" (");
                    sb.append(ooooo0o3.OooO00o(4));
                    sb.append(str7);
                    sb.append(ooooo0o3.OooO00o(5));
                    sb.append(str6);
                    str7 = str7;
                    str6 = str6;
                }
            }
            return sb.toString();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Nullable
    public String OooOO0o(int i) {
        try {
            byte[] OooO00o = ((C8122oOOOO0oo) this.f20998OooO00o).m19651OooO00o(i);
            if (OooO00o == null) {
                return null;
            }
            oO0Oo0 oo0oo0 = new oO0Oo0(OooO00o);
            int OooO0O0 = oo0oo0.m19604OooO0O0(0);
            int OooO0O02 = oo0oo0.m19604OooO0O0(4);
            int OooO0O03 = oo0oo0.m19604OooO0O0(8);
            int OooO0O04 = oo0oo0.m19604OooO0O0(16);
            int OooO0O05 = oo0oo0.m19604OooO0O0(20);
            int OooO0O06 = oo0oo0.m19604OooO0O0(24);
            Object[] objArr = new Object[6];
            objArr[0] = OooO0O0 == 1 ? "JpegRGB" : "RawRGB";
            objArr[1] = Integer.valueOf(OooO0O02);
            objArr[2] = Integer.valueOf(OooO0O03);
            objArr[3] = Integer.valueOf(OooO0O04);
            objArr[4] = Integer.valueOf(OooO0O06);
            objArr[5] = Integer.valueOf(OooO0O05);
            return String.format("%s, %dx%d, Decomp %d bytes, %d bpp, %d bytes", objArr);
        } catch (IOException unused) {
            return null;
        }
    }

    @Nullable
    public String OooO0OO() {
        try {
            byte[] OooO00o = ((C8122oOOOO0oo) this.f20998OooO00o).m19651OooO00o(C8122oOOOO0oo.OoooOoo);
            if (OooO00o == null) {
                return null;
            }
            oO0Oo0 oo0oo0 = new oO0Oo0(OooO00o);
            int OooO0O0 = oo0oo0.m19604OooO0O0(0);
            float OooO00o2 = oo0oo0.m19594OooO00o(2);
            float OooO00o3 = oo0oo0.m19594OooO00o(6);
            float OooO00o4 = oo0oo0.m19594OooO00o(10);
            if (OooO0O0 == 0) {
                return "Centered, Scale " + OooO00o4;
            } else if (OooO0O0 == 1) {
                return "Size to fit";
            } else {
                if (OooO0O0 != 2) {
                    return String.format("Unknown %04X, X:%s Y:%s, Scale:%s", Integer.valueOf(OooO0O0), Float.valueOf(OooO00o2), Float.valueOf(OooO00o3), Float.valueOf(OooO00o4));
                }
                return String.format("User defined, X:%s Y:%s, Scale:%s", Float.valueOf(OooO00o2), Float.valueOf(OooO00o3), Float.valueOf(OooO00o4));
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
