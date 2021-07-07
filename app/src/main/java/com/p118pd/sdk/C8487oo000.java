package com.p118pd.sdk;

import com.baidu.idl.face.platform.common.ConstantHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo000  reason: case insensitive filesystem */
public class C8487oo000 {
    public String OooO00o;
    public String OooO0O0 = "";
    public String OooO0OO;
    public String OooO0Oo;
    public String OooO0o;
    public String OooO0o0;
    public String OooO0oO;

    public String OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public JSONObject m20169OooO00o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("protocol_version", "1");
            jSONObject.put("compress_mode", "1");
            jSONObject.put("serviceid", this.OooO0Oo);
            jSONObject.put(ConstantHelper.LOG_APPID, this.OooO00o);
            jSONObject.put("hmac", this.OooO0O0);
            jSONObject.put("chifer", this.OooO0oO);
            jSONObject.put("timestamp", this.OooO0OO);
            jSONObject.put("servicetag", this.OooO0o0);
            jSONObject.put("requestid", this.OooO0o);
        } catch (JSONException unused) {
            AbstractC8536oo00OO0O.OooO0OO("HeadData", "headData - toJsonObj():JSON structure Exception!");
        }
        return jSONObject;
    }

    public void OooO00o(String str) {
        this.OooO0o = str;
    }

    public void OooO0O0(String str) {
        this.OooO0o0 = str;
    }

    public void OooO0OO(String str) {
        this.OooO0oO = str;
    }

    public void OooO0Oo(String str) {
        this.OooO0Oo = str;
    }

    public void OooO0o(String str) {
        this.OooO0O0 = str;
    }

    public void OooO0o0(String str) {
        this.OooO00o = str;
    }

    public void OooO0oO(String str) {
        this.OooO0OO = str;
    }
}
