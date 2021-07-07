package com.p118pd.sdk;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.o0Ooo0O  reason: case insensitive filesystem */
public class C7519o0Ooo0O {
    public static JSONObject OooO00o(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            JSONObject[] jSONObjectArr = {jSONObject, jSONObject2};
            for (int i = 0; i < 2; i++) {
                JSONObject jSONObject4 = jSONObjectArr[i];
                if (jSONObject4 != null) {
                    Iterator<String> keys = jSONObject4.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject3.put(next, jSONObject4.get(next));
                    }
                }
            }
        } catch (JSONException e) {
            C7620o0oOOOoo.m19257OooO00o((Throwable) e);
        }
        return jSONObject3;
    }
}
