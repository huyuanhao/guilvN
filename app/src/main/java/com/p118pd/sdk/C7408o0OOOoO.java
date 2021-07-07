package com.p118pd.sdk;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.pd.sdk.o0OOOoO  reason: case insensitive filesystem */
public class C7408o0OOOoO {
    public static HashMap<String, String> OooO00o(ReadableMap readableMap) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (readableMap != null) {
            HashMap<String, Object> hashMap2 = readableMap.toHashMap();
            if (!hashMap2.isEmpty()) {
                for (String str : hashMap2.keySet()) {
                    hashMap.put(str, "" + hashMap2.get(str));
                }
            }
        }
        return hashMap;
    }

    public static HashMap<String, String> OooO00o(WritableMap writableMap) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (writableMap != null) {
            HashMap<String, Object> hashMap2 = writableMap.toHashMap();
            if (!hashMap2.isEmpty()) {
                for (String str : hashMap2.keySet()) {
                    hashMap.put(str, "" + hashMap2.get(str));
                }
            }
        }
        return hashMap;
    }

    public static HashMap<String, String> OooO00o(String str, WritableArray writableArray) {
        HashMap<String, String> hashMap = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < writableArray.size(); i++) {
            arrayList.add(OooO00o(writableArray.getMap(i)));
        }
        hashMap.put(str, arrayList.toString());
        return hashMap;
    }
}
