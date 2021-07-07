package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.ooOoOO0O  reason: case insensitive filesystem */
public class C9044ooOoOO0O {
    public static boolean OooO00o(List<?> list) {
        return list == null || list.isEmpty();
    }

    public static boolean OooO0O0(List<?> list) {
        return !OooO00o(list);
    }

    public static <K, V> Map<K, V> OooO00o(Map<K, V> map) {
        if (map != null && !map.isEmpty()) {
            ArrayList<Object> arrayList = new ArrayList();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    arrayList.add(entry.getKey());
                }
            }
            for (Object obj : arrayList) {
                map.remove(obj);
            }
        }
        return map;
    }

    public static Map<String, String> OooO0O0(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            map.remove(null);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() == null) {
                    map.put(entry.getKey(), "");
                }
            }
        }
        return map;
    }
}
