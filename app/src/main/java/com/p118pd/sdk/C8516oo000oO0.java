package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3416b;
import com.umeng.commonsdk.statistics.idtracking.C3692t;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo000oO0  reason: case insensitive filesystem */
public class C8516oo000oO0 implements AbstractRunnableC8546oo00Oo0 {
    public Context OooO00o;

    public C8516oo000oO0(Context context) {
        this.OooO00o = context;
    }

    private void OooO00o() {
        if (!AbstractC8521oo00O00.m20191OooO00o(this.OooO00o, "stat_v2").exists()) {
            AbstractC8536oo00OO0O.OooO0O0("InitInfoV2support", "No V2 data supporting!");
            return;
        }
        SharedPreferences OooO00o2 = AbstractC8521oo00O00.OooO00o(this.OooO00o, "stat_v2");
        if (OooO00o2 == null) {
            AbstractC8536oo00OO0O.OooO0OO("InitInfoV2support", "getV2StateSP error!");
            return;
        }
        String str = (String) AbstractC8521oo00O00.OooO00o(OooO00o2, C3416b.f8463ao, (Object) "");
        String OooO00o3 = AbstractC8486oo00.OooO00o(C8524oo00O00o.OooO00o(this.OooO00o, "cached_v2"), this.OooO00o);
        OooO0O0();
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(OooO00o3)) {
            OooO00o(str, OooO00o3);
        } else {
            AbstractC8536oo00OO0O.OooO0O0("InitInfoV2support", " No cached V2 data found.");
        }
    }

    public static void OooO00o(Context context) {
        C8483oOooooo ooooooo;
        boolean z;
        SharedPreferences OooO00o2 = C8592oo0O00O0.OooO00o(context, "global_v2");
        String str = (String) C8592oo0O00O0.OooO00o(OooO00o2, C3692t.f9678a, (Object) "");
        if (TextUtils.isEmpty(str)) {
            String replace = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
            C8480oOooooO0.OooO00o().m20150OooO00o().OooOO0O(replace);
            OooO00o2.edit().putString(C3692t.f9678a, replace).apply();
        } else {
            C8480oOooooO0.OooO00o().m20150OooO00o().OooOO0O(str);
        }
        String str2 = (String) C8592oo0O00O0.OooO00o(OooO00o2, "upload_url", (Object) "");
        long longValue = ((Long) C8592oo0O00O0.OooO00o(OooO00o2, "upload_url_time", (Object) 0L)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(str2) || currentTimeMillis - longValue > 86400000) {
            ooooooo = C8480oOooooO0.OooO00o().m20150OooO00o();
            z = true;
        } else {
            C8480oOooooO0.OooO00o().m20150OooO00o().OooOOO(str2);
            ooooooo = C8480oOooooO0.OooO00o().m20150OooO00o();
            z = false;
        }
        ooooooo.OooO00o(z);
    }

    private void OooO00o(Context context, String str) {
        SharedPreferences.Editor edit = AbstractC8521oo00O00.OooO00o(context, str).edit();
        edit.clear();
        edit.apply();
    }

    private void OooO00o(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray(C3416b.f8463ao);
                if (jSONArray != null) {
                    if (jSONArray.length() != 0) {
                        OooO00o(jSONArray);
                        return;
                    }
                }
                AbstractC8536oo00OO0O.OooO0O0("InitInfoV2support", "No V2CacheFile Data!");
            } catch (JSONException unused) {
                AbstractC8536oo00OO0O.OooO0OO("InitInfoV2support", "parseV2CacheData() eventJsonArray.cacheData No json !");
            }
        }
    }

    private void OooO00o(String str, String str2) {
        OooO0O0(str);
        OooO00o(str2);
    }

    private void OooO00o(Map<String, ?> map, String str) {
        map.remove(str);
        AbstractC8536oo00OO0O.OooO0O0("InitInfoV2support", "remove this unusualData, backup data size : " + map.size());
    }

    private void OooO00o(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String optString = jSONObject.optString("event");
                    String OooO00o2 = AbstractC8486oo00.OooO00o(jSONObject.getString("content"), this.OooO00o);
                    String optString2 = jSONObject.optString("eventtime");
                    String optString3 = jSONObject.optString("type");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(OooO00o2) && !TextUtils.isEmpty(optString2)) {
                        if (!TextUtils.isEmpty(optString3)) {
                            C8525oo00O0O.OooO00o(new C8507oo000Oo(this.OooO00o, "_default_config_tag", C8523oo00O00O.OooO00o(optString3), optString, OooO00o2, Long.parseLong(optString2)));
                        }
                    }
                    AbstractC8536oo00OO0O.OooO0OO("InitInfoV2support", "parseV2SPData() Data anomaly! Discarding data.");
                    return;
                }
                continue;
            } catch (JSONException unused) {
                AbstractC8536oo00OO0O.OooO0OO("InitInfoV2support", "parseV2SPData() eventJsonArray.getJSONObject() error !");
            }
        }
    }

    private void OooO00o(boolean z) {
        String OooO00o2 = AbstractC8453oOooOoOO.m20094OooO00o();
        String OooO0o = AbstractC8453oOooOoOO.OooO0o();
        if (TextUtils.isEmpty(OooO00o2)) {
            AbstractC8536oo00OO0O.OooO0O0("InitInfoV2support", "app ver is first save!");
        } else if (!OooO00o2.equals(OooO0o)) {
            AbstractC8536oo00OO0O.OooO0O0("InitInfoV2support", "the appVers are different!");
            C8511oo000o0.OooO00o().OooO00o("", this.OooO00o, "", OooO00o2);
        } else if (z) {
            AbstractC8536oo00OO0O.OooO0O0("InitInfoV2support", "report backup data!");
            C8511oo000o0.OooO00o().OooO00o("", this.OooO00o, "", OooO0o);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m20185OooO00o() {
        JSONArray jSONArray;
        AbstractC8536oo00OO0O.OooO0O0("InitInfoV2support", "begin handler backup data...");
        SharedPreferences OooO00o2 = AbstractC8521oo00O00.OooO00o(this.OooO00o, "backup_event");
        SharedPreferences OooO00o3 = AbstractC8521oo00O00.OooO00o(this.OooO00o, "stat_v2_1");
        Map<String, ?> all = OooO00o2.getAll();
        if (all.size() == 0) {
            AbstractC8536oo00OO0O.OooO0O0("InitInfoV2support", "No backup data needed to be processed");
            return false;
        }
        String string = AbstractC8521oo00O00.OooO00o(this.OooO00o, "global_v2").getString("request_id", "");
        if (!AbstractC8453oOooOoOO.m20099OooO0O0()) {
            AbstractC8536oo00OO0O.OooO0O0("InitInfoV2support", "UnusualDataIgnored is false,begin handler unusualData,spKey: " + string);
            String[] split = string.split("#");
            String str = split[0];
            String str2 = split[1];
            Map<String, AbstractC8493oo0000OO[]> OooO00o4 = C8495oo0000o.OooO00o(OooO00o2, this.OooO00o, string, false);
            if (OooO00o4.size() != 0) {
                for (Map.Entry<String, AbstractC8493oo0000OO[]> entry : OooO00o4.entrySet()) {
                    new C8506oo000OOo(this.OooO00o, str, entry.getValue(), AbstractC8453oOooOoOO.m20094OooO00o(), str2).OooO00o();
                }
            } else {
                AbstractC8536oo00OO0O.OooO0O0("InitInfoV2support", "backupUnusualData is empty");
            }
        }
        OooO00o(all, string);
        boolean z = false;
        for (Map.Entry<String, ?> entry2 : all.entrySet()) {
            String key = entry2.getKey();
            String str3 = key.split("#")[0];
            try {
                jSONArray = new JSONArray(OooO00o3.getString(str3, ""));
            } catch (JSONException unused) {
                AbstractC8536oo00OO0O.OooO0O0("InitInfoV2support", "handler unusualData: stat sp data is error,spKey: " + str3);
                jSONArray = new JSONArray();
            }
            if (entry2.getValue() instanceof String) {
                try {
                    JSONArray jSONArray2 = new JSONArray((String) entry2.getValue());
                    for (int i = 0; i < jSONArray2.length(); i++) {
                        jSONArray.put(jSONArray2.getJSONObject(i));
                    }
                    AbstractC8521oo00O00.m20194OooO00o(OooO00o3, str3, (Object) jSONArray.toString());
                    z = true;
                } catch (JSONException unused2) {
                    AbstractC8536oo00OO0O.OooO0OO("InitInfoV2support", "backup data is error! spKey: " + key);
                }
            }
        }
        SharedPreferences.Editor edit = OooO00o2.edit();
        edit.clear();
        edit.apply();
        return z;
    }

    private void OooO0O0() {
        OooO00o(this.OooO00o, "stat_v2");
        C8524oo00O00o.m20196OooO00o(this.OooO00o, "cached_v2");
    }

    private void OooO0O0(String str) {
        JSONArray jSONArray = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONArray = new JSONArray(str);
            }
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO("InitInfoV2support", "parseV2SPData:When events turn to JSONArray,json Exception");
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            AbstractC8536oo00OO0O.OooO0O0("InitInfoV2support", "No V2State Data!");
        } else {
            OooO00o(jSONArray);
        }
    }

    private void OooO0OO() {
        C8480oOooooO0.OooO00o().m20150OooO00o().OooO0OO(AbstractC8475oOoooO0O.OooO0O0());
        OooO00o(this.OooO00o);
    }

    public void run() {
        OooO0OO();
        OooO00o(m20185OooO00o());
        SharedPreferences OooO00o2 = AbstractC8521oo00O00.OooO00o(this.OooO00o, "global_v2");
        if (((Boolean) AbstractC8521oo00O00.OooO00o(OooO00o2, "v2cacheHandlerFlag", (Object) false)).booleanValue()) {
            AbstractC8536oo00OO0O.OooO0O0("InitInfoV2support", "cached data by HASDKV2 has already handled.");
            return;
        }
        AbstractC8521oo00O00.m20194OooO00o(OooO00o2, "v2cacheHandlerFlag", (Object) true);
        OooO00o();
    }
}
