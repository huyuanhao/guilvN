package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.pd.sdk.oOoooo  reason: case insensitive filesystem */
public abstract class AbstractC8478oOoooo {
    public static String OooO00o(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(AbstractC8452oOooOoO.OooO0OO(str, str2))) {
            return AbstractC8452oOooOoO.OooO0OO(str, str2);
        }
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "getAndroidId(): to getConfigByType()");
        return OooO0OO(context, str, str2);
    }

    public static String OooO00o(String str, String str2) {
        return AbstractC8454oOooOoOo.OooO0o0(str, str2);
    }

    public static void OooO00o(int i) {
        C8480oOooooO0.OooO00o().m20150OooO00o().OooO00o(i);
    }

    public static void OooO00o(String str) {
        C8480oOooooO0.OooO00o().m20150OooO00o().OooO0oo(str);
    }

    public static void OooO00o(boolean z) {
        C8480oOooooO0.OooO00o().m20150OooO00o().OooO0O0(z);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20145OooO00o(String str, String str2) {
        return AbstractC8454oOooOoOo.m20102OooO00o(str, str2);
    }

    public static String OooO0O0(Context context, String str, String str2) {
        if ("oper".equals(str2)) {
            return OooO0Oo(context, str, str2);
        }
        if ("maint".equals(str2)) {
            return OooO0Oo(context, str, str2);
        }
        if ("diffprivacy".equals(str2)) {
            return OooO0Oo(context, str, str2);
        }
        if ("preins".equals(str2)) {
            return OooO0Oo(context, str, str2);
        }
        AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "getChannel(): Invalid type: " + str2);
        return "";
    }

    public static String OooO0O0(String str, String str2) {
        return AbstractC8454oOooOoOo.OooO0Oo(str, str2);
    }

    public static String OooO0OO(Context context, String str, String str2) {
        if (!AbstractC8452oOooOoO.OooO0o0(str, str2)) {
            return "";
        }
        if (TextUtils.isEmpty(AbstractC8453oOooOoOO.OooO0OO())) {
            C8480oOooooO0.OooO00o().m20150OooO00o().OooO0o(AbstractC8475oOoooO0O.OooO0Oo(context));
        }
        return AbstractC8453oOooOoOO.OooO0OO();
    }

    public static String OooO0Oo(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(AbstractC8454oOooOoOo.m20103OooO0O0(str, str2))) {
            return AbstractC8454oOooOoOo.m20103OooO0O0(str, str2);
        }
        C8483oOooooo OooO00o = C8480oOooooO0.OooO00o().m20150OooO00o();
        if (TextUtils.isEmpty(OooO00o.m20165OooO0O0())) {
            String OooO0o = AbstractC8475oOoooO0O.OooO0o(context);
            if (!C8591oo0O00O.OooO00o("channel", OooO0o, 256)) {
                OooO0o = "";
            }
            OooO00o.OooO0O0(OooO0o);
        }
        return OooO00o.m20165OooO0O0();
    }
}
