package com.vivo.push.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vivo.push.util.m */
public final class C4143m {
    /* renamed from: a */
    public static Map<String, String> m11177a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.getString(next));
        }
        return hashMap;
    }
}
