package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.pd.sdk.o0Ooo0o  reason: case insensitive filesystem */
public class C7522o0Ooo0o {
    public static final String OooO00o = "pref_trade_token";
    public static final String OooO0O0 = ";";
    public static final String OooO0OO = "result={";
    public static final String OooO0Oo = "}";
    public static final String OooO0o = "\"";
    public static final String OooO0o0 = "trade_token=\"";
    public static final String OooO0oO = "trade_token=";

    public static void OooO00o(Context context, String str) {
        try {
            String OooO00o2 = OooO00o(str);
            C7620o0oOOOoo.OooO0O0("", "PayResultUtil::saveTradeToken > tradeToken:" + OooO00o2);
            if (!TextUtils.isEmpty(OooO00o2)) {
                C7524o0Ooo0oO.m19175OooO00o(context, OooO00o, OooO00o2);
            }
        } catch (Throwable th) {
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.Oooo0o0, th);
            C7620o0oOOOoo.m19257OooO00o(th);
        }
    }

    public static String OooO00o(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(OooO0O0);
        for (int i = 0; i < split.length; i++) {
            if (split[i].startsWith(OooO0OO) && split[i].endsWith(OooO0Oo)) {
                String[] split2 = split[i].substring(8, split[i].length() - 1).split("&");
                int i2 = 0;
                while (true) {
                    if (i2 >= split2.length) {
                        break;
                    } else if (split2[i2].startsWith(OooO0o0) && split2[i2].endsWith("\"")) {
                        str2 = split2[i2].substring(13, split2[i2].length() - 1);
                        break;
                    } else if (split2[i2].startsWith(OooO0oO)) {
                        str2 = split2[i2].substring(12);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        return str2;
    }

    public static String OooO00o(Context context) {
        String OooO00o2 = C7524o0Ooo0oO.OooO00o(context, OooO00o, "");
        C7620o0oOOOoo.OooO0O0("", "PayResultUtil::fetchTradeToken > tradeToken:" + OooO00o2);
        return OooO00o2;
    }
}
