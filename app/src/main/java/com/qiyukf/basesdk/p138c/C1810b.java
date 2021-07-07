package com.qiyukf.basesdk.p138c;

import android.text.TextUtils;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.qiyukf.basesdk.c.b */
public final class C1810b {
    /* renamed from: a */
    public static String m3419a(JSONArray jSONArray, int i) {
        if (jSONArray == null) {
            return null;
        }
        return jSONArray.optString(i);
    }

    /* renamed from: a */
    public static JSONObject m3420a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return new JSONObject(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m3421a(JSONArray jSONArray, Object obj) {
        try {
            jSONArray.put(obj);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m3422a(JSONObject jSONObject, String str, int i) {
        try {
            jSONObject.put(str, i);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m3423a(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m3424a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m3425a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static boolean m3426a(JSONObject jSONObject, String str) {
        return jSONObject != null && jSONObject.optBoolean(str);
    }

    /* renamed from: b */
    public static int m3427b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optInt(str);
    }

    /* renamed from: b */
    public static JSONArray m3428b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return new JSONArray(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static JSONObject m3429b(JSONArray jSONArray, int i) {
        if (jSONArray == null) {
            return null;
        }
        return jSONArray.optJSONObject(i);
    }

    /* renamed from: c */
    public static long m3430c(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optLong(str);
    }

    /* renamed from: d */
    public static double m3431d(JSONObject jSONObject, String str) {
        return jSONObject == null ? AbstractC8352oOoOOoO0.OooO0O0 : jSONObject.optDouble(str);
    }

    /* renamed from: e */
    public static String m3432e(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* renamed from: f */
    public static JSONObject m3433f(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optJSONObject(str);
    }

    /* renamed from: g */
    public static JSONArray m3434g(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optJSONArray(str);
    }
}
