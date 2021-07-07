package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo0000O0  reason: case insensitive filesystem */
public class C8492oo0000O0 extends AbstractC8493oo0000OO {
    public Context OooO00o;

    public C8492oo0000O0() {
    }

    public C8492oo0000O0(Context context) {
        this.OooO00o = context;
    }

    public static Map<String, AbstractC8493oo0000OO[]> OooO00o(SharedPreferences sharedPreferences, Context context, String str, boolean z) {
        if (sharedPreferences == null || context == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            Map<String, String> OooO00o2 = AbstractC8521oo00O00.OooO00o(sharedPreferences);
            if (OooO00o2.size() > 200 || OooO00o2.size() == 0) {
                AbstractC8536oo00OO0O.OooO0OO("ActionData", "get state data ：The number of data obtained is too much! or No data");
                return hashMap;
            }
            for (Map.Entry<String, String> entry : OooO00o2.entrySet()) {
                OooO00o(entry, context, hashMap);
            }
        } else {
            OooO00o(str, AbstractC8521oo00O00.OooO00o(sharedPreferences, str), context, hashMap);
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.Map<java.lang.String, com.pd.sdk.oo0000OO[]> */
    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO00o(String str, String str2, Context context, Map<String, AbstractC8493oo0000OO[]> map) {
        try {
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(str2)) {
                AbstractC8536oo00OO0O.OooO0OO("ActionData", "No data from cache sp!");
                return;
            }
            JSONArray jSONArray = new JSONArray(str2);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                C8492oo0000O0 oo0000o0 = new C8492oo0000O0(context);
                oo0000o0.OooO00o(optJSONObject);
                arrayList.add(oo0000o0);
            }
            map.put(str, arrayList.toArray(new C8492oo0000O0[arrayList.size()]));
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO("ActionData", "readDataToAppAction() events is not json format");
        }
    }

    public static void OooO00o(Map.Entry<String, String> entry, Context context, Map<String, AbstractC8493oo0000OO[]> map) {
        OooO00o(entry.getKey(), entry.getValue(), context, map);
    }

    @Override // com.p118pd.sdk.AbstractC8493oo0000OO
    public JSONObject OooO00o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", OooO0o0());
            jSONObject.put("eventtime", super.OooO00o);
            jSONObject.put("event", this.OooO0O0);
            jSONObject.put("event_session_name", this.OooO0o);
            jSONObject.put("first_session_event", this.OooO0oO);
            jSONObject.put("content", AbstractC8486oo00.OooO0O0(OooO0o(), this.OooO00o));
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO("ActionData", "When toJsonStr() executed,properties parameter anomaly.JSON Exception has happen!");
        }
        return jSONObject;
    }

    public JSONObject OooO00o(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", OooO0o0());
            jSONObject.put("eventtime", super.OooO00o);
            jSONObject.put("event", this.OooO0O0);
            jSONObject.put("event_session_name", this.OooO0o);
            jSONObject.put("first_session_event", this.OooO0oO);
            jSONObject.put("properties", z ? AbstractC8486oo00.OooO0O0(OooO0o(), this.OooO00o) : new JSONObject(this.OooO0OO));
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO("ActionData", "When toJsonObj() executed,properties parameter anomaly.JSON Exception has happen!");
        }
        return jSONObject;
    }

    public void OooO00o(JSONObject jSONObject) {
        if (jSONObject != null) {
            super.OooO00o = jSONObject.optString("eventtime", "");
            this.OooO0O0 = jSONObject.optString("event", "");
            OooO0o(AbstractC8486oo00.OooO00o(jSONObject.optString("properties"), this.OooO00o));
            this.OooO0Oo = jSONObject.optString("type", "");
        }
    }

    @Override // com.p118pd.sdk.AbstractC8493oo0000OO
    public JSONObject OooO0O0() {
        return OooO00o(false);
    }
}
