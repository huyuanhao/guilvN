package com.p118pd.sdk;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.text.SimpleDateFormat;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oo0O0OoO  reason: case insensitive filesystem */
public class C8609oo0O0OoO {
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
        HashMap<String, Object> hashMap2 = writableMap.toHashMap();
        if (!hashMap2.isEmpty()) {
            for (String str : hashMap2.keySet()) {
                hashMap.put(str, "" + hashMap2.get(str));
            }
        }
        return hashMap;
    }

    public static String OooO00o(String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        try {
            return new SimpleDateFormat(str3).format(simpleDateFormat.parse(str));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
