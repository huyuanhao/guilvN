package com.p118pd.sdk;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.o0OoOoo0  reason: case insensitive filesystem */
public class C7511o0OoOoo0 extends AbstractC7726o0ooOOoo {
    public static final String OooOOo = "log_v";

    @Override // com.p118pd.sdk.AbstractC7726o0ooOOoo
    public String OooO00o(String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.p118pd.sdk.AbstractC7726o0ooOOoo
    public Map<String, String> OooO00o(boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooO00o, String.valueOf(z));
        hashMap.put("content-type", "application/octet-stream");
        hashMap.put(AbstractC7726o0ooOOoo.OooO0oO, "CBC");
        return hashMap;
    }

    @Override // com.p118pd.sdk.AbstractC7726o0ooOOoo, com.p118pd.sdk.AbstractC7726o0ooOOoo
    public JSONObject OooO00o() throws JSONException {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7726o0ooOOoo
    public String OooO0O0() throws JSONException {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(AbstractC7726o0ooOOoo.OooO, "/sdk/log");
        hashMap.put(AbstractC7726o0ooOOoo.OooOO0, "1.0.0");
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put(OooOOo, "1.0");
        return OooO00o(hashMap, hashMap2);
    }

    @Override // com.p118pd.sdk.AbstractC7726o0ooOOoo
    public C7495o0OoOOo OooO00o(Context context, String str) throws Throwable {
        return OooO00o(context, str, "https://mcgw.alipay.com/sdklog.do", true);
    }
}
