package com.p118pd.sdk;

import android.content.SharedPreferences;

/* renamed from: com.pd.sdk.ooo0O0oo  reason: case insensitive filesystem */
public class C9098ooo0O0oo {
    public static final String OooO00o = "deviceId";

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20766OooO00o() {
        return OooO00o("deviceId");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20767OooO00o(String str) {
        OooO00o("deviceId", str);
    }

    public static void OooO00o(String str, String str2) {
        SharedPreferences.Editor edit = OooO00o().edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public static String OooO00o(String str) {
        return OooO00o().getString(str, null);
    }

    public static SharedPreferences OooO00o() {
        return C8769oo0ooOOO.OooO00o().getSharedPreferences("NIMSDK_RnLib_Config_", 4);
    }
}
