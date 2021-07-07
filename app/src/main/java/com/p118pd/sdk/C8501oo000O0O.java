package com.p118pd.sdk;

import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo000O0O  reason: case insensitive filesystem */
public class C8501oo000O0O extends C8494oo0000Oo {
    public String OooO0O0;

    @Override // com.p118pd.sdk.C8494oo0000Oo
    public void OooO00o(JSONObject jSONObject) {
        if (jSONObject != null) {
            super.OooO00o(jSONObject);
            this.OooO0O0 = jSONObject.optString("serverUrl");
        }
    }

    public String OooO0O0() {
        return this.OooO0O0;
    }
}
