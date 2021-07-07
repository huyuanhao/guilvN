package com.p118pd.sdk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.ooO0oO0O  reason: case insensitive filesystem */
public class C8871ooO0oO0O {
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final JSONObject m20512OooO00o(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final JSONArray OooO00o(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final int m20507OooO00o(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getInt(str);
        } catch (JSONException unused) {
            return 0;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m20508OooO00o(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getLong(str);
        } catch (JSONException unused) {
            return 0;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m20515OooO00o(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return false;
        }
    }

    public static final double OooO00o(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getDouble(str);
        } catch (JSONException unused) {
            return AbstractC8352oOoOOoO0.OooO0O0;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final String m20510OooO00o(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final JSONObject m20514OooO00o(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final JSONArray m20511OooO00o(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONArray(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final String m20509OooO00o(JSONArray jSONArray, int i) {
        try {
            return jSONArray.getString(i);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final long OooO00o(JSONArray jSONArray, int i) {
        try {
            return jSONArray.getLong(i);
        } catch (JSONException unused) {
            return 0;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final JSONObject m20513OooO00o(JSONArray jSONArray, int i) {
        try {
            return jSONArray.getJSONObject(i);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final void OooO00o(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    public static final void OooO00o(JSONObject jSONObject, String str, int i) {
        try {
            jSONObject.put(str, i);
        } catch (JSONException unused) {
        }
    }

    public static final void OooO00o(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (JSONException unused) {
        }
    }

    public static final void OooO00o(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException unused) {
        }
    }

    public static final void OooO00o(JSONObject jSONObject, String str, JSONArray jSONArray) {
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException unused) {
        }
    }

    public static final void OooO00o(JSONObject jSONObject, String str, boolean z) {
        try {
            jSONObject.put(str, z);
        } catch (JSONException unused) {
        }
    }

    public static Map<String, String> OooO00o(JSONObject jSONObject) {
        Throwable th;
        HashMap hashMap = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            HashMap hashMap2 = new HashMap();
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap2.put(next, jSONObject.getString(next));
                }
                return hashMap2;
            } catch (Throwable th2) {
                th = th2;
                hashMap = hashMap2;
                th.printStackTrace();
                return hashMap;
            }
        } catch (Throwable th3) {
            th = th3;
            th.printStackTrace();
            return hashMap;
        }
    }
}
