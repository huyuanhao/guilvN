package com.p118pd.sdk;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0o0000  reason: case insensitive filesystem */
public class C8691oo0o0000 {
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

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static HashMap<String, String> m20301OooO00o(WritableMap writableMap) {
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, Object> hashMap2 = writableMap.toHashMap();
        if (!hashMap2.isEmpty()) {
            for (String str : hashMap2.keySet()) {
                hashMap.put(str, "" + hashMap2.get(str));
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

    public static HashMap<String, String> OooO00o(Map<String, Object> map) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                hashMap.put(str, obj + "");
            }
        }
        return hashMap;
    }

    public static WritableMap OooO00o(WritableMap writableMap) {
        WritableMap createMap = Arguments.createMap();
        if (writableMap != null) {
            HashMap<String, Object> hashMap = writableMap.toHashMap();
            for (String str : hashMap.keySet()) {
                ReadableType type = writableMap.getType(str);
                if (ReadableType.String == type) {
                    createMap.putString(str, writableMap.getString(str));
                } else if (ReadableType.Number == type) {
                    createMap.putDouble(str, ((Double) hashMap.get(str)).doubleValue());
                } else if (ReadableType.Boolean == type) {
                    createMap.putBoolean(str, ((Boolean) hashMap.get(str)).booleanValue());
                } else if (ReadableType.Map == type) {
                    createMap.putMap(str, (WritableMap) writableMap.getMap(str));
                } else if (ReadableType.Array == type) {
                    createMap.putArray(str, (WritableArray) writableMap.getArray(str));
                } else if (ReadableType.Null == type) {
                    createMap.putNull(str);
                }
            }
        }
        return createMap;
    }

    public static WritableMap OooO00o(Bundle bundle) {
        WritableMap createMap = Arguments.createMap();
        if (bundle == null) {
            bundle = new Bundle();
        }
        for (String str : bundle.keySet()) {
            createMap.putString(str, "" + bundle.get(str));
        }
        return createMap;
    }
}
