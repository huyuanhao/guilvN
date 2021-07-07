package com.p118pd.sdk;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo0000Oo  reason: case insensitive filesystem */
public class C8494oo0000Oo {
    public String OooO00o;

    public String OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                OooO00o(new JSONObject(str));
            } catch (JSONException unused) {
                AbstractC8536oo00OO0O.OooO0OO("ResponseResult", "When fromJson() executed ,JSON Exception has happened");
            }
        }
    }

    public void OooO00o(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.OooO00o = jSONObject.optString("resultcode");
        }
    }
}
