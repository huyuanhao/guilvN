package com.p118pd.sdk;

import java.text.DecimalFormat;

/* renamed from: com.pd.sdk.ooOoOo00  reason: case insensitive filesystem */
public class C9055ooOoOo00 {
    public static final int OooO00o = 1073741824;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final DecimalFormat f22359OooO00o = new DecimalFormat("0.##");
    public static final int OooO0O0 = 1048576;
    public static final int OooO0OO = 1024;

    public static CharSequence OooO00o(long j) {
        if (j <= 0) {
            return "0M";
        }
        if (j >= 1073741824) {
            StringBuilder sb = new StringBuilder(16);
            DecimalFormat decimalFormat = f22359OooO00o;
            double d = (double) j;
            Double.isNaN(d);
            sb.append(decimalFormat.format(d / 1.073741824E9d));
            sb.append("G");
            return sb;
        } else if (j >= 1048576) {
            StringBuilder sb2 = new StringBuilder(16);
            DecimalFormat decimalFormat2 = f22359OooO00o;
            double d2 = (double) j;
            Double.isNaN(d2);
            sb2.append(decimalFormat2.format(d2 / 1048576.0d));
            sb2.append("M");
            return sb2;
        } else if (j >= 1024) {
            StringBuilder sb3 = new StringBuilder(16);
            DecimalFormat decimalFormat3 = f22359OooO00o;
            double d3 = (double) j;
            Double.isNaN(d3);
            sb3.append(decimalFormat3.format(d3 / 1024.0d));
            sb3.append("K");
            return sb3;
        } else {
            return j + "B";
        }
    }
}
