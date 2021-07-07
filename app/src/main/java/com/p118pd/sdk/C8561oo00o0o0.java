package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.multidex.MultiDexExtractor;
import com.taobao.accs.common.Constants;
import com.umeng.commonsdk.statistics.idtracking.C3692t;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo00o0o0  reason: case insensitive filesystem */
public class C8561oo00o0o0 {
    public static String OooO00o(Context context) {
        String OooO0O0 = OooO0O0(context);
        String str = Build.MODEL;
        String str2 = Build.DISPLAY;
        String OooO0O02 = AbstractC8475oOoooO0O.OooO0O0();
        String str3 = Build.VERSION.RELEASE;
        String OooO0Oo = AbstractC8456oOooOoo0.m20112OooO0Oo();
        return String.format(Locale.getDefault(), "%s=%s&%s=%s&%s=%s&%s=%s&%s=%s&%s=%s", "shaSN", OooO0O0, Constants.KEY_MODEL, str, "romVersion", str2, "emuiVersion", OooO0O02, "osVersion", str3, "countryCode", OooO0Oo);
    }

    public static String OooO00o(Context context, boolean z, boolean z2) {
        String format = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        String OooO00o = C8476oOoooO0o.OooO00o().m20137OooO00o();
        if (TextUtils.isEmpty(OooO00o)) {
            OooO00o = AbstractC8453oOooOoOO.OooO0oO();
            if (TextUtils.isEmpty(OooO00o)) {
                OooO00o = OooO0OO(context);
                AbstractC8453oOooOoOO.OooO0OO(OooO00o);
            }
        }
        String OooO00o2 = C8556oo00Oooo.OooO00o(OooO00o);
        if (z) {
            return "/Eventid_" + OooO00o2 + "_" + format + "_ALL.zip";
        } else if (z2) {
            return "/Crash_" + OooO00o2 + "_" + format + MultiDexExtractor.o0OO00O;
        } else {
            return "/Eventid_" + OooO00o2 + "_" + format + MultiDexExtractor.o0OO00O;
        }
    }

    public static String OooO00o(String str, String str2) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0O0("LogStringUtil", "collectErrorLog() MetaData is not a JSON format!");
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(str, str2);
            } catch (JSONException unused2) {
                AbstractC8536oo00OO0O.OooO0OO("LogStringUtil", "checkMetaMsg() An exception occurred in json.put ");
            }
            jSONObject = jSONObject2;
        }
        return jSONObject.toString();
    }

    public static String OooO0O0(Context context) {
        return C8556oo00Oooo.OooO00o(OooO0OO(context));
    }

    public static String OooO0OO(Context context) {
        SharedPreferences OooO00o = C8559oo00o000.OooO00o(context, "global_v2");
        if (OooO00o == null) {
            return UUID.randomUUID().toString();
        }
        String str = (String) C8559oo00o000.OooO00o(OooO00o, C3692t.f9678a, (Object) "");
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String replace = UUID.randomUUID().toString().replace(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        OooO00o.edit().putString(C3692t.f9678a, replace).apply();
        return replace;
    }
}
