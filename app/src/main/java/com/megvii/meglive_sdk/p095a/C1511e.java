package com.megvii.meglive_sdk.p095a;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.megvii.meglive_sdk.a.e */
public final class C1511e {

    /* renamed from: a */
    public List<C1507a> f2084a = new ArrayList();

    /* renamed from: b */
    public String f2085b = "";

    /* renamed from: c */
    public String f2086c = "";

    public C1511e() {
    }

    /* renamed from: a */
    public final void mo16969a(C1507a aVar) {
        this.f2084a.add(aVar);
    }

    /* renamed from: a */
    public final String mo16968a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("__source__", this.f2086c);
            jSONObject.put("__topic__", this.f2085b);
            JSONArray jSONArray = new JSONArray();
            for (C1507a aVar : this.f2084a) {
                jSONArray.put(new JSONObject(aVar.f2073a));
            }
            jSONObject.put("__logs__", jSONArray);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public C1511e(String str, String str2) {
        this.f2085b = str;
        this.f2086c = str2;
    }
}
