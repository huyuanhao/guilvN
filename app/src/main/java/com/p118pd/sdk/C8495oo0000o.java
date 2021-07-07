package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo0000o  reason: case insensitive filesystem */
public class C8495oo0000o extends AbstractC8493oo0000OO {
    public static final String OooO0oo = "oo0000o";

    public static Map<String, AbstractC8493oo0000OO[]> OooO00o(SharedPreferences sharedPreferences, Context context, String str, boolean z) {
        if (sharedPreferences == null || context == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            Map<String, String> OooO00o = AbstractC8521oo00O00.OooO00o(sharedPreferences);
            if (OooO00o.size() > 200 || OooO00o.size() == 0) {
                String str2 = OooO0oo;
                AbstractC8536oo00OO0O.OooO0OO(str2, "get state data ：The number of data obtained is too much! or No data : " + OooO00o.size());
                return hashMap;
            }
            for (Map.Entry<String, String> entry : OooO00o.entrySet()) {
                OooO00o(entry, context, hashMap);
            }
        } else {
            OooO00o(str, (String) AbstractC8521oo00O00.OooO00o(sharedPreferences, str, (Object) ""), context, hashMap);
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.Map<java.lang.String, com.pd.sdk.oo0000OO[]> */
    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO00o(String str, String str2, Context context, Map<String, AbstractC8493oo0000OO[]> map) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = null;
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONArray = new JSONArray(str2);
            }
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO(OooO0oo, "When events turn to JSONArray,JSON Exception has happened");
        }
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                C8495oo0000o oo0000o = new C8495oo0000o();
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        oo0000o.OooO0O0 = jSONObject.optString("event");
                        oo0000o.OooO0OO = AbstractC8486oo00.OooO00o(jSONObject.optString("content"), context);
                        oo0000o.OooO00o = jSONObject.optString("eventtime");
                        oo0000o.OooO0Oo = jSONObject.optString("type");
                        if (jSONObject.has("event_session_name")) {
                            oo0000o.OooO0o = jSONObject.getString("event_session_name");
                            oo0000o.OooO0oO = jSONObject.getString("first_session_event");
                        }
                        arrayList.add(oo0000o);
                    }
                } catch (JSONException unused2) {
                    arrayList.add(oo0000o);
                    AbstractC8536oo00OO0O.OooO0OO(OooO0oo, "JSON Exception happened when create data for report - readDataToRecord");
                }
            }
            map.put(str, arrayList.toArray(new C8495oo0000o[arrayList.size()]));
        }
    }

    public static void OooO00o(Map.Entry<String, String> entry, Context context, Map<String, AbstractC8493oo0000OO[]> map) {
        OooO00o(entry.getKey(), entry.getValue(), context, map);
    }

    @SuppressLint({"ApplySharedPref"})
    public void OooO00o(SharedPreferences sharedPreferences) {
        String str;
        if (sharedPreferences == null || (str = this.OooO0o0) == null) {
            AbstractC8536oo00OO0O.OooO0OO(OooO0oo, "saveInSp() eventTag Can't be null");
            return;
        }
        if (!str.equals("_default_config_tag")) {
            str = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.OooO0Oo;
        }
        String str2 = (String) AbstractC8521oo00O00.OooO00o(sharedPreferences, str, (Object) "");
        try {
            JSONArray jSONArray = TextUtils.isEmpty(str2) ? new JSONArray() : new JSONArray(str2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", this.OooO0O0);
            jSONObject.put("content", this.OooO0OO);
            jSONObject.put("eventtime", this.OooO00o);
            jSONObject.put("type", this.OooO0Oo);
            jSONObject.put("event_session_name", this.OooO0o);
            jSONObject.put("first_session_event", this.OooO0oO);
            jSONArray.put(jSONObject);
            String jSONArray2 = jSONArray.toString();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(str);
            edit.putString(str, jSONArray2);
            edit.commit();
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO(OooO0oo, "When saveInSp() executed, JSON Exception has happened");
        }
    }
}
