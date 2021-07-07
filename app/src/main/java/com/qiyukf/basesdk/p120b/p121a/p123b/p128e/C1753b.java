package com.qiyukf.basesdk.p120b.p121a.p123b.p128e;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.qiyukf.basesdk.p119a.C1709a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.qiyukf.basesdk.b.a.b.e.b */
public class C1753b {

    /* renamed from: a */
    public static final String f3238a = C1754c.m3225a(C1753b.class);

    /* renamed from: a */
    public static String m3213a(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(str, null);
    }

    /* renamed from: a */
    public static String m3214a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        String str = "";
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                str = str + jSONArray.getString(i);
                if (i != jSONArray.length() - 1) {
                    str = str + C7522o0Ooo0o.OooO0O0;
                }
            } catch (JSONException e) {
                C1709a.m3015b(f3238a, "get json string exception", e);
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m3215a(Context context, String str, String str2) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString(str, str2);
        edit.commit();
    }

    /* renamed from: a */
    public static void m3216a(Context context, JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("lbs");
            String str = f3238a;
            C1709a.m3018d(str, "lbs ip: " + string);
            String a = m3214a(jSONObject.getJSONArray("upload"));
            String str2 = f3238a;
            C1709a.m3018d(str2, "upload server ip string: " + a);
            if (!TextUtils.isEmpty(string)) {
                m3215a(context, "netease_pomelo_nos_lbs", string);
            }
            if (!TextUtils.isEmpty(a)) {
                m3215a(context, "netease_pomelo_nos_server", a);
                String str3 = f3238a;
                C1709a.m3018d(str3, "save http upload server ip: " + a);
                String replaceAll = a.replaceAll("http://", "https://");
                m3215a(context, "netease_pomelo_nos_https_server", replaceAll);
                String str4 = f3238a;
                C1709a.m3018d(str4, "save https upload server ip: " + replaceAll);
            }
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
            edit.putLong("netease_pomelo_nos_last_save_time", currentTimeMillis);
            edit.commit();
            C1709a.m3018d(f3238a, "save lbs response data");
        } catch (JSONException e) {
            C1709a.m3015b(f3238a, "get json array exception", e);
        }
    }

    /* renamed from: a */
    public static boolean m3217a(Context context) {
        long j = PreferenceManager.getDefaultSharedPreferences(context).getLong("netease_pomelo_nos_last_save_time", 0);
        boolean z = false;
        if (j <= 0) {
            return false;
        }
        if (System.currentTimeMillis() - j <= 86400000) {
            z = true;
        }
        if (!z) {
            m3215a(context, "netease_pomelo_nos_lbs", null);
        }
        return z;
    }

    /* renamed from: a */
    public static String[] m3218a(Context context, boolean z) {
        String a = m3213a(context, !z ? "netease_pomelo_nos_server" : "netease_pomelo_nos_https_server");
        if (a == null) {
            return null;
        }
        return a.split(C7522o0Ooo0o.OooO0O0);
    }

    /* renamed from: b */
    public static String m3219b(Context context) {
        return m3213a(context, "netease_pomelo_nos_lbs");
    }

    /* renamed from: c */
    public static void m3220c(Context context) {
        m3215a(context, "netease_pomelo_nos_lbs", null);
    }
}
