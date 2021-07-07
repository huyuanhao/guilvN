package com.taobao.accs.utl;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taobao.accs.utl.p */
public class C3185p {

    /* renamed from: com.taobao.accs.utl.p$a */
    public static class C3186a {

        /* renamed from: a */
        public JSONObject f7251a = new JSONObject();

        /* renamed from: a */
        public C3186a mo37784a(String str, String str2) {
            if (!(str2 == null || str == null)) {
                try {
                    this.f7251a.put(str, str2);
                } catch (JSONException unused) {
                }
            }
            return this;
        }

        /* renamed from: a */
        public C3186a mo37783a(String str, Integer num) {
            if (num == null) {
                return this;
            }
            try {
                this.f7251a.put(str, num);
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: a */
        public JSONObject mo37785a() {
            return this.f7251a;
        }
    }

    /* renamed from: a */
    public static String m7678a(JSONObject jSONObject, String str, String str2) throws JSONException {
        return (jSONObject != null && jSONObject.has(str)) ? jSONObject.getString(str) : str2;
    }
}
