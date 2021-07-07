package com.alibaba.sdk.android.httpdns;

import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.httpdns.g */
public class C0297g {

    /* renamed from: b */
    public int f648b;

    /* renamed from: c */
    public String f649c;

    public C0297g(int i, String str) {
        this.f648b = i;
        this.f649c = new JSONObject(str).getString("code");
    }

    /* renamed from: a */
    public String mo4020a() {
        return this.f649c;
    }

    public int getErrorCode() {
        return this.f648b;
    }
}
