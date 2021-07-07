package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hianalytics.p032h.AbstractC1099c;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oOooo0OO  reason: case insensitive filesystem */
public class RunnableC8467oOooo0OO implements Runnable {
    public Context OooO00o;
    public String o0OOO0o = C8463oOooo00O.OooO00o().OooO0OO();
    public String o0ooOOo = C8463oOooo00O.OooO00o().m20118OooO00o();
    public String o0ooOoO = C8463oOooo00O.OooO00o().OooO0O0();

    public RunnableC8467oOooo0OO(Context context) {
        this.OooO00o = context;
    }

    private String OooO00o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", this.o0ooOoO);
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO("ABTest/SyncDataTask", "getBody: json exception");
        }
        return jSONObject.toString();
    }

    private Map<String, String> OooO00o(String str) {
        String str2 = this.o0ooOOo;
        String OooO0o0 = AbstractC8453oOooOoOO.OooO0o0();
        String valueOf = String.valueOf(System.currentTimeMillis());
        String str3 = "";
        String replace = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, str3);
        StringBuilder sb = new StringBuilder();
        sb.append(OooO0o0);
        sb.append("|");
        sb.append(valueOf);
        sb.append("|");
        sb.append(replace);
        sb.append("|");
        int indexOf = str2.indexOf(C8932ooOOO0o.f22176OooO00o);
        if (indexOf != -1) {
            str3 = str2.substring(indexOf + 1, str2.length());
        }
        sb.append(str3);
        sb.append("|");
        sb.append(str);
        String OooO00o2 = C8586oo0O00.OooO00o(C8586oo0O00.OooO00o(sb.toString(), this.o0OOO0o));
        HashMap hashMap = new HashMap();
        hashMap.put("appId", OooO0o0);
        hashMap.put("timestamp", valueOf);
        hashMap.put("random", replace);
        hashMap.put("sign", OooO00o2);
        return hashMap;
    }

    public void run() {
        AbstractC8536oo00OO0O.OooO0O0("ABTest/SyncDataTask", "sync data running..");
        String OooO00o2 = OooO00o();
        Map<String, String> OooO00o3 = OooO00o(OooO00o2);
        try {
            C8544oo00OOoo OooO00o4 = AbstractC1099c.OooO00o(this.o0ooOOo + "/api/gateway/ab/api/service/shunting/hasdk/api/v1/getuserparameters", OooO00o2.getBytes("UTF-8"), OooO00o3);
            AbstractC8536oo00OO0O.OooO0O0("ABTest/SyncDataTask", "get experimental data request code : " + OooO00o4.OooO00o());
            String OooO00o5 = OooO00o4.m20207OooO00o();
            if (!TextUtils.isEmpty(OooO00o5)) {
                try {
                    C8463oOooo00O.OooO00o().m20119OooO00o(OooO00o5);
                    AbstractC8536oo00OO0O.OooO0O0("ABTest/SyncDataTask", "Start caching data!");
                    SharedPreferences.Editor edit = C8592oo0O00O0.OooO00o(this.OooO00o, "abtest").edit();
                    edit.putString("exp_data", AbstractC8486oo00.OooO0O0(OooO00o5, this.OooO00o));
                    edit.putLong("expdata_refresh_time", System.currentTimeMillis());
                    edit.commit();
                } catch (JSONException unused) {
                    AbstractC8536oo00OO0O.OooO0OO("ABTest/SyncDataTask", "experiment data error");
                }
            }
        } catch (IOException unused2) {
            AbstractC8536oo00OO0O.OooO0OO("ABTest/SyncDataTask", "getBody: body to bytes error!");
        }
        C8463oOooo00O.OooO00o().OooO00o(true);
        C8463oOooo00O.OooO00o().OooO0O0(false);
    }
}
