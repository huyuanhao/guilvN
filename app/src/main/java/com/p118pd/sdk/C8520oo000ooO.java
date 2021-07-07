package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;
import com.facebook.react.modules.netinfo.NetInfoModule;
import com.huawei.hianalytics.util.C1105e;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo000ooO  reason: case insensitive filesystem */
public class C8520oo000ooO {
    public static String OooO00o(Context context) {
        Locale locale;
        Configuration configuration = context.getResources().getConfiguration();
        return (configuration == null || (locale = configuration.locale) == null) ? "" : locale.toString();
    }

    public static String OooO00o(String str, String str2) {
        return C1105e.OooO0O0(str, str2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static JSONObject m20189OooO00o(Context context) {
        String OooO00o = OooO00o(context);
        String str = Build.MANUFACTURER;
        if (str == null) {
            str = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        }
        String str2 = Build.VERSION.RELEASE;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        String OooO00o2 = OooO00o("ro.product.CustCVersion", "");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_sys_language", OooO00o);
            jSONObject.put("_cust_version", OooO00o2);
            jSONObject.put("_manufacturer", str);
            jSONObject.put("_os", "android");
            jSONObject.put("_os_ver", str2);
            jSONObject.put("_screen_height", i);
            jSONObject.put("_screen_width", i2);
            return jSONObject;
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "getDeviceInfo() json Exc,A parameter error!");
            return null;
        }
    }

    public static JSONObject OooO00o(Context context, String str, String str2) {
        String str3;
        JSONObject OooO00o = m20189OooO00o(context);
        if (OooO00o != null) {
            try {
                OooO00o.put("_start_type", str);
                OooO00o.put("_start_cmd", str2);
                return OooO00o;
            } catch (JSONException unused) {
                str3 = "startType or startCMD error";
            }
        } else {
            str3 = "getInfoJson is null";
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", str3);
            return null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static JSONObject m20190OooO00o(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_old_app_version", str2);
            jSONObject.put("_current_app_version", str);
            return jSONObject;
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "Json Exc : app ver error");
            return null;
        }
    }
}
