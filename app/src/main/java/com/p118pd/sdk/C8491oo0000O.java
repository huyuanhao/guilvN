package com.p118pd.sdk;

import android.text.TextUtils;
import com.umeng.commonsdk.statistics.idtracking.C3681i;
import com.umeng.commonsdk.statistics.idtracking.C3692t;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo0000O  reason: case insensitive filesystem */
public class C8491oo0000O {
    public String OooO00o;
    public String OooO0O0;
    public String OooO0OO;
    public String OooO0Oo;
    public String OooO0o;
    public String OooO0o0 = "";
    public String OooO0oO;

    public JSONObject OooO00o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("androidid", this.OooO00o);
            jSONObject.put("imei", this.OooO0O0);
            jSONObject.put(C3692t.f9678a, this.OooO0OO);
            jSONObject.put("udid", this.OooO0o0);
            jSONObject.put(C3681i.f9652d, this.OooO0Oo);
            jSONObject.put("upid", this.OooO0o);
            jSONObject.put("sn", this.OooO0oO);
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO("InfoData", " When toJsonObj() executed has JSON Exception happened");
        }
        return jSONObject;
    }

    public void OooO00o(String str) {
        if (TextUtils.isEmpty(str)) {
            this.OooO00o = "";
        } else {
            this.OooO00o = str;
        }
    }

    public void OooO0O0(String str) {
        if (TextUtils.isEmpty(str)) {
            this.OooO0O0 = "";
        } else {
            this.OooO0O0 = str;
        }
    }

    public void OooO0OO(String str) {
        if (TextUtils.isEmpty(str)) {
            this.OooO0OO = "";
        } else {
            this.OooO0OO = str;
        }
    }

    public void OooO0Oo(String str) {
        this.OooO0Oo = str;
    }

    public void OooO0o(String str) {
        this.OooO0o = str;
    }

    public void OooO0o0(String str) {
        if (str != null) {
            this.OooO0o0 = str;
        }
    }

    public void OooO0oO(String str) {
        this.OooO0oO = str;
    }
}
