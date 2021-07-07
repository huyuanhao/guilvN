package com.p118pd.sdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.gson.JsonArray;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo0o0ooO  reason: case insensitive filesystem */
public class C8724oo0o0ooO {
    public static Map<String, Object> OooO00o(Map<String, Object> map, Map<String, Object> map2) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        for (String str : map2.keySet()) {
            Object obj = map2.get(str);
            if (obj instanceof Map) {
                map.put(str, OooO00o((Map) map.get(str), (Map) obj));
            } else {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static int OooO00o(Map<String, Integer> map) {
        int i = 100;
        for (String str : map.keySet()) {
            int intValue = map.get(str).intValue();
            if (i > intValue) {
                i = intValue;
            }
        }
        return i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static WritableMap m20344OooO00o(String str) {
        WritableMap createMap = Arguments.createMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    createMap.putMap(next, m20344OooO00o(obj.toString()));
                } else if (obj instanceof JSONArray) {
                    createMap.putArray(next, OooO00o(obj.toString()));
                } else {
                    createMap.putString(next, String.valueOf(obj));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "getWritableMapByObj");
            hashMap.put("exception", e.getLocalizedMessage());
            hashMap.put("info", str);
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), hashMap);
        }
        return createMap;
    }

    public static WritableArray OooO00o(String str) {
        WritableArray createArray = Arguments.createArray();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    createArray.pushMap(m20344OooO00o(obj.toString()));
                } else if (obj instanceof JsonArray) {
                    createArray.pushArray(OooO00o(obj.toString()));
                } else {
                    createArray.pushString(String.valueOf(obj));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "getWritableArrayByObj");
            hashMap.put("exception", e.getLocalizedMessage());
            hashMap.put("info", str);
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), hashMap);
        }
        return createArray;
    }
}
