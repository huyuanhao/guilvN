package com.p118pd.sdk;

import android.text.TextUtils;

/* renamed from: com.pd.sdk.o0OoOOo0  reason: case insensitive filesystem */
public class C7496o0OoOOo0 {
    public static String OooO00o(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("&");
        if (split.length == 0) {
            return "";
        }
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        for (String str6 : split) {
            if (TextUtils.isEmpty(str2)) {
                str2 = OooO0O0(str6);
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = OooO0OO(str6);
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = OooO0Oo(str6);
            }
            if (TextUtils.isEmpty(str5)) {
                str5 = OooO0o(str6);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str2)) {
            sb.append("biz_type=" + str2 + C7522o0Ooo0o.OooO0O0);
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append("biz_no=" + str3 + C7522o0Ooo0o.OooO0O0);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append("trade_no=" + str4 + C7522o0Ooo0o.OooO0O0);
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append("app_userid=" + str5 + C7522o0Ooo0o.OooO0O0);
        }
        String sb2 = sb.toString();
        return sb2.endsWith(C7522o0Ooo0o.OooO0O0) ? sb2.substring(0, sb2.length() - 1) : sb2;
    }

    public static String OooO0O0(String str) {
        if (!str.contains("biz_type")) {
            return null;
        }
        return OooO0o0(str);
    }

    public static String OooO0OO(String str) {
        if (!str.contains("biz_no")) {
            return null;
        }
        return OooO0o0(str);
    }

    public static String OooO0Oo(String str) {
        if (!str.contains(C7482o0OoO0OO.o00Oo0) || str.startsWith(C7482o0OoO0OO.o00O0O)) {
            return null;
        }
        return OooO0o0(str);
    }

    public static String OooO0o(String str) {
        if (!str.contains("app_userid")) {
            return null;
        }
        return OooO0o0(str);
    }

    public static String OooO0o0(String str) {
        String[] split = str.split(C8932ooOOO0o.OooO0Oo);
        if (split.length <= 1) {
            return null;
        }
        String str2 = split[1];
        return str2.contains("\"") ? str2.replaceAll("\"", "") : str2;
    }
}
