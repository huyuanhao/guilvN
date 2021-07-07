package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedHashMap;

/* renamed from: com.pd.sdk.oOooOoo  reason: case insensitive filesystem */
public class C8455oOooOoo {
    public static final String OooO00o = "ABTest";

    public static String OooO00o(String str, String str2) {
        AbstractC8536oo00OO0O.OooO0O0(OooO00o, "getExpParam() is execute");
        if (TextUtils.isEmpty(str)) {
            AbstractC8536oo00OO0O.OooO0OO(OooO00o, "paramkey is null");
        } else {
            String OooO00o2 = C8460oOooo0.OooO00o().OooO00o(str);
            if (!TextUtils.isEmpty(OooO00o2)) {
                return OooO00o2;
            }
        }
        return str2;
    }

    public static void OooO00o() {
        AbstractC8536oo00OO0O.OooO0O0(OooO00o, "onReport() is execute");
        C8460oOooo0.OooO00o().m20116OooO00o();
    }

    public static void OooO00o(int i) {
        AbstractC8536oo00OO0O.OooO0O0(OooO00o, "setExpSyncInterval() is execute");
        if (i < 10) {
            i = 10;
        }
        C8460oOooo0.OooO00o().OooO00o(i);
    }

    public static void OooO00o(Context context, C8458oOooOooo oooooooo) {
        AbstractC8536oo00OO0O.OooO0O0(OooO00o, "initABTest() is execute");
        C8460oOooo0.OooO00o().OooO00o(context, oooooooo);
    }

    public static void OooO00o(String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        AbstractC8536oo00OO0O.OooO0O0(OooO00o, "onEvent() is execute");
        if (TextUtils.isEmpty(str)) {
            AbstractC8536oo00OO0O.OooO0OO(OooO00o, "onEvent() paramkey is null");
        } else {
            C8460oOooo0.OooO00o().OooO00o(str, str2, linkedHashMap);
        }
    }

    public static void OooO0O0() {
        AbstractC8536oo00OO0O.OooO0O0(OooO00o, "syncExpParameters() is execute");
        C8460oOooo0.OooO00o().OooO0O0();
    }
}
