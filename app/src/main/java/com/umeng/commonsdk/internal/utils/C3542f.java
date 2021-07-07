package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.internal.utils.C3529a;
import com.umeng.commonsdk.statistics.common.ULog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.utils.f */
public class C3542f {

    /* renamed from: a */
    public static final String f9102a = "info";

    /* renamed from: b */
    public static final String f9103b = "a_dc";

    /* renamed from: c */
    public static final String f9104c = "bssid";

    /* renamed from: d */
    public static final String f9105d = "ssid";

    /* renamed from: e */
    public static final String f9106e = "a_fcy";

    /* renamed from: f */
    public static final String f9107f = "a_hssid";

    /* renamed from: g */
    public static final String f9108g = "a_ip";

    /* renamed from: h */
    public static final String f9109h = "a_ls";

    /* renamed from: i */
    public static final String f9110i = "a_mac";

    /* renamed from: j */
    public static final String f9111j = "a_nid";

    /* renamed from: k */
    public static final String f9112k = "rssi";

    /* renamed from: l */
    public static final String f9113l = "sta";

    /* renamed from: m */
    public static final String f9114m = "ts";

    /* renamed from: n */
    public static final String f9115n = "wifiinfo";

    /* renamed from: o */
    public static final String f9116o = "ua";

    /* renamed from: a */
    public static JSONArray m9159a(Context context) {
        String string;
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("info", 0);
            if (sharedPreferences == null || (string = sharedPreferences.getString(f9115n, null)) == null) {
                return null;
            }
            return new JSONArray(string);
        } catch (Exception e) {
            ULog.m9823e(e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static void m9162b(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("info", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove(f9115n).commit();
        }
    }

    /* renamed from: c */
    public static String m9163c(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("info", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getString(f9116o, null);
        }
        return null;
    }

    /* renamed from: a */
    public static void m9160a(Context context, C3529a.C3531b bVar) {
        JSONArray jSONArray;
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("info", 0);
            String str = null;
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(f9115n, null);
                if (string == null) {
                    jSONArray = new JSONArray();
                } else {
                    jSONArray = new JSONArray(string);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(f9103b, bVar.f9062a);
                jSONObject.put("bssid", bVar.f9063b);
                jSONObject.put(f9105d, bVar.f9064c);
                jSONObject.put(f9106e, bVar.f9065d);
                jSONObject.put(f9107f, bVar.f9066e);
                jSONObject.put(f9108g, bVar.f9067f);
                jSONObject.put(f9109h, bVar.f9068g);
                jSONObject.put(f9110i, bVar.f9069h);
                jSONObject.put(f9111j, bVar.f9070i);
                jSONObject.put(f9112k, bVar.f9071j);
                jSONObject.put(f9113l, bVar.f9072k);
                jSONObject.put("ts", bVar.f9073l);
                jSONArray.put(jSONObject);
                str = jSONArray.toString();
            }
            if (str != null) {
                sharedPreferences.edit().putString(f9115n, str).commit();
            }
        } catch (Exception e) {
            ULog.m9823e(e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m9161a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("info", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(f9116o, str).commit();
        }
    }
}
