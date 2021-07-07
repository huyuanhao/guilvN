package com.p118pd.sdk;

import android.os.Build;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo000O0  reason: case insensitive filesystem */
public class C8500oo000O0 {
    public String OooO00o;
    public String OooO0O0;
    public String OooO0OO;
    public String OooO0Oo;
    public String OooO0o;
    public String OooO0o0;
    public String OooO0oO;

    public JSONObject OooO00o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_rom_ver", Build.DISPLAY);
            jSONObject.put("_emui_ver", this.OooO00o);
            jSONObject.put("_model", Build.MODEL);
            jSONObject.put("_mcc", this.OooO0o);
            jSONObject.put("_mnc", this.OooO0oO);
            jSONObject.put("_package_name", this.OooO0O0);
            jSONObject.put("_app_ver", this.OooO0OO);
            jSONObject.put("_lib_ver", "2.1.4.301");
            jSONObject.put("_channel", this.OooO0Oo);
            jSONObject.put("_lib_name", "hianalytics");
            jSONObject.put("_oaid_tracking_flag", this.OooO0o0);
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO("RomInfoData", "toJsonObj(): JSON structure Exception: Rom info toJsonObj exception!");
        }
        return jSONObject;
    }

    public void OooO00o(String str) {
        this.OooO0o0 = str;
    }

    public void OooO0O0(String str) {
        this.OooO0Oo = str;
    }

    public void OooO0OO(String str) {
        this.OooO00o = str;
    }

    public void OooO0Oo(String str) {
        this.OooO0O0 = str;
    }

    public void OooO0o(String str) {
        this.OooO0o = str;
    }

    public void OooO0o0(String str) {
        this.OooO0OO = str;
    }

    public void OooO0oO(String str) {
        this.OooO0oO = str;
    }
}
