package com.p118pd.sdk;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0OOo0  reason: case insensitive filesystem */
public class C8642oo0OOo0 {
    public static String OooO00o(Map map) {
        if (map == null || map.isEmpty() || map.size() == 0) {
            return "{}";
        }
        String str = "{";
        for (Map.Entry entry : map.entrySet()) {
            str = (str + "'" + entry.getKey() + "':") + "'" + entry.getValue() + "',";
        }
        return str.substring(0, str.lastIndexOf(Constants.ACCEPT_TIME_SEPARATOR_SP)) + C7522o0Ooo0o.OooO0Oo;
    }

    public static SpannableStringBuilder OooO00o(Context context, String str, int i) {
        String[] split = str.split("<em>|</em>");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i2 = 0; i2 < split.length; i2++) {
            if (1 == i2 % 2) {
                spannableStringBuilder.append((CharSequence) C9054ooOoOo0.OooO00o("", split[i2], "", context.getResources().getColor(i)));
            } else {
                spannableStringBuilder.append((CharSequence) split[i2]);
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static float m20259OooO00o(String str) {
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public static double OooO00o(String str) {
        try {
            return Double.parseDouble(str);
        } catch (Exception unused) {
            return AbstractC8352oOoOOoO0.OooO0O0;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m20261OooO00o(String str) {
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int m20260OooO00o(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }
}
