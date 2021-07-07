package com.p118pd.sdk;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo00O0O  reason: case insensitive filesystem */
public class C8525oo00O0O {
    public static JSONObject OooO00o(long j, String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        JSONObject jSONObject = linkedHashMap == null ? new JSONObject() : OooO00o(linkedHashMap);
        try {
            if ("OnPause".equals(str2)) {
                jSONObject.put("_event_duration", j);
            }
            jSONObject.put("_activity_name", str);
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO("ThreadUtil", "getEventContent(): JSONException");
        }
        return jSONObject;
    }

    public static JSONObject OooO00o(String str, long j, LinkedHashMap<String, String> linkedHashMap, String str2) {
        return OooO00o(j, str, str2, linkedHashMap);
    }

    public static JSONObject OooO00o(LinkedHashMap<String, String> linkedHashMap) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            try {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
                AbstractC8536oo00OO0O.OooO0OO("ThreadUtil", "onEvent(): JSONException: mapValue");
            }
        }
        return jSONObject;
    }

    public static void OooO00o(AbstractRunnableC8546oo00Oo0 oo00oo0) {
        if (oo00oo0 == null) {
            AbstractC8536oo00OO0O.OooO0OO("ThreadUtil", "runTaskSessionHandler - task is null");
            return;
        }
        C8549oo00Oo0o OooO00o = C8549oo00Oo0o.OooO00o();
        if (OooO00o != null) {
            OooO00o.OooO00o(oo00oo0);
            return;
        }
        AbstractC8536oo00OO0O.OooO0OO("ThreadUtil", "SessionHandler is NULL, failed to call task: %s", oo00oo0.getClass().getSimpleName());
    }

    public static boolean OooO00o(String str, long j, long j2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return j - Long.parseLong(str) > j2;
        } catch (NumberFormatException unused) {
            AbstractC8536oo00OO0O.OooO0OO("ThreadUtil", "isTimeExpired(): Data type conversion error : number format !");
            return true;
        }
    }

    public static void OooO0O0(AbstractRunnableC8546oo00Oo0 oo00oo0) {
        if (oo00oo0 == null) {
            AbstractC8536oo00OO0O.OooO0OO("ThreadUtil", "runTaskMessageThread - task is null");
            return;
        }
        C8549oo00Oo0o OooO0O0 = C8549oo00Oo0o.OooO0O0();
        if (OooO0O0 != null) {
            OooO0O0.OooO00o(oo00oo0);
            return;
        }
        AbstractC8536oo00OO0O.OooO0OO("ThreadUtil", "runTaskMessageThread is NULL, failed to call task: %s", oo00oo0.getClass().getSimpleName());
    }
}
