package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.pd.sdk.ooOoOOo  reason: case insensitive filesystem */
public class C9049ooOoOOo {
    public static String OooO00o(String str, int i, int i2) {
        int length = str.length();
        if (length == 0) {
            return "--";
        }
        if (length == 1 || i2 > length) {
            return str;
        }
        String substring = str.substring(0, i);
        for (int i3 = 0; i3 < i2 - i; i3++) {
            substring = substring + "*";
        }
        return substring + str.substring(i2, length);
    }

    public static String OooO0O0(double d) {
        if (d > 10000.0d) {
            return OooO00o(d / 10000.0d) + "万";
        }
        return OooO00o(d) + "元";
    }

    public static String OooO0O0(String str) {
        if (str.length() != 6) {
            return str;
        }
        return ((str.substring(0, 2) + Constants.COLON_SEPARATOR) + str.substring(2, 4) + Constants.COLON_SEPARATOR) + str.substring(4, 6);
    }

    public static String OooO00o(String str, int i, int i2, String str2) {
        int length = str.length();
        if (length == 0) {
            return "--";
        }
        if (length == 1 || i2 > length) {
            return str;
        }
        String substring = str.substring(0, i);
        for (int i3 = 0; i3 < i2 - i; i3++) {
            substring = substring + str2;
        }
        return substring + str.substring(i2, length);
    }

    public static String OooO00o(String str) {
        if ("".equals(str)) {
            return "--";
        }
        double parseDouble = Double.parseDouble(str);
        if (parseDouble >= 10000.0d) {
            return OooO00o(parseDouble / 10000.0d) + "万";
        }
        return String.valueOf(str) + "元";
    }

    public static String OooO00o(int i) {
        String valueOf = String.valueOf(i);
        if (valueOf.length() != 8) {
            return valueOf;
        }
        return ((valueOf.substring(0, 4) + Constants.ACCEPT_TIME_SEPARATOR_SERVER) + valueOf.substring(4, 6) + Constants.ACCEPT_TIME_SEPARATOR_SERVER) + valueOf.substring(6, 8);
    }

    public static String OooO00o(double d) {
        double round = (double) Math.round(d * 100.0d);
        Double.isNaN(round);
        double d2 = round / 100.0d;
        if (d2 % 1.0d == AbstractC8352oOoOOoO0.OooO0O0) {
            return String.valueOf((long) d2);
        }
        return String.valueOf(d2);
    }
}
