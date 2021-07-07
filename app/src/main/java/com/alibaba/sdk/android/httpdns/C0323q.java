package com.alibaba.sdk.android.httpdns;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.httpdns.q */
public class C0323q {
    public boolean enabled = true;

    /* renamed from: f */
    public String[] f710f;

    public C0323q(String str) {
        boolean z = true;
        try {
            JSONObject jSONObject = new JSONObject(str);
            C0299i.m534d("Schedule center response:" + jSONObject.toString());
            if (jSONObject.has("service_status")) {
                this.enabled = jSONObject.getString("service_status").equals("disable") ? false : z;
            }
            if (jSONObject.has("service_ip")) {
                JSONArray jSONArray = jSONObject.getJSONArray("service_ip");
                this.f710f = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.f710f[i] = (String) jSONArray.get(i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public String[] mo4057c() {
        return this.f710f;
    }

    public boolean isEnabled() {
        return this.enabled;
    }
}
