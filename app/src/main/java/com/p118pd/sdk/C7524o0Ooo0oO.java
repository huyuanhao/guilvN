package com.p118pd.sdk;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;

/* renamed from: com.pd.sdk.o0Ooo0oO  reason: case insensitive filesystem */
public class C7524o0Ooo0oO {
    public static String OooO00o;

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19176OooO00o(Context context, String str) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context).contains(str);
        } catch (Throwable th) {
            C7620o0oOOOoo.m19257OooO00o(th);
            return false;
        }
    }

    public static void OooO00o(Context context, String str) {
        try {
            PreferenceManager.getDefaultSharedPreferences(context).edit().remove(str).commit();
        } catch (Throwable th) {
            C7620o0oOOOoo.m19257OooO00o(th);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m19175OooO00o(Context context, String str, String str2) {
        try {
            String OooO00o2 = C7493o0OoOOOO.OooO00o(OooO00o(context), str2, str);
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(OooO00o2)) {
                C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOOO0, C7482o0OoO0OO.Oooo0O0, String.format("%s,%s", str, str2));
            }
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, OooO00o2).commit();
        } catch (Throwable th) {
            C7620o0oOOOoo.m19257OooO00o(th);
        }
    }

    public static String OooO00o(Context context, String str, String str2) {
        String str3 = null;
        try {
            String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
            if (!TextUtils.isEmpty(string)) {
                str3 = C7493o0OoOOOO.OooO0O0(OooO00o(context), string, str);
            }
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(str3)) {
                C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOOO0, C7482o0OoO0OO.Oooo0, String.format("%s,%s", str, string));
            }
        } catch (Exception e) {
            C7620o0oOOOoo.m19257OooO00o((Throwable) e);
        }
        return str3;
    }

    public static String OooO00o(Context context) {
        String str;
        if (TextUtils.isEmpty(OooO00o)) {
            try {
                str = context.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                C7620o0oOOOoo.m19257OooO00o(th);
                str = "";
            }
            OooO00o = (str + "0000000000000000000000000000").substring(0, 24);
        }
        return OooO00o;
    }
}
