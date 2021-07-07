package com.p118pd.sdk;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.ooOOOO00  reason: case insensitive filesystem */
public class C8938ooOOOO00 {

    /* renamed from: com.pd.sdk.ooOOOO00$OooO00o */
    public static class OooO00o implements Comparator<Map.Entry<String, String>> {
        /* renamed from: OooO00o */
        public int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
            return entry.getKey().compareTo(entry2.getKey());
        }
    }

    public static String OooO00o(String str, String str2, String str3, String str4) {
        if (m20598OooO00o(str4)) {
            return "";
        }
        int indexOf = str4.indexOf(C8932ooOOO0o.f22176OooO00o);
        HashMap hashMap = new HashMap();
        if (indexOf > 0) {
            String substring = str4.substring(0, indexOf);
            String[] split = str4.substring(indexOf).split("&");
            for (int i = 0; i < split.length; i++) {
                int indexOf2 = split[i].indexOf(C8932ooOOO0o.OooO0Oo);
                if (indexOf2 > 0) {
                    hashMap.put(split[i].substring(0, indexOf2), split[i].substring(indexOf2 + 1));
                }
            }
            str4 = substring;
        }
        return OooO00o(str4, OooO00o(str, str2, str3, hashMap));
    }

    public static String OooO0O0(String str) {
        if (m20598OooO00o(str)) {
            return null;
        }
        return OooO00o(str).toUpperCase();
    }

    public static Map<String, String> OooO00o(String str, String str2, String str3, Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (map != null && !map.isEmpty()) {
            for (String str4 : map.keySet()) {
                if (map.get(str4) == null) {
                    map.put(str4, "");
                }
            }
        }
        map.put("appkey", str);
        map.put("timestamp", str3);
        return m20597OooO00o(str2, map);
    }

    public static String OooO00o(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(str);
        if (map != null && !map.isEmpty()) {
            if (sb.indexOf(C8932ooOOO0o.f22176OooO00o) < 0) {
                sb.append(C8932ooOOO0o.f22176OooO00o);
            }
            for (String str2 : map.keySet()) {
                sb.append("&");
                sb.append(str2);
                sb.append(C8932ooOOO0o.OooO0Oo);
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Map<String, String> m20597OooO00o(String str, Map<String, String> map) {
        ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new OooO00o());
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : arrayList) {
            sb.append((String) entry.getKey());
            sb.append((String) entry.getValue());
        }
        sb.append(str);
        sb.insert(0, str);
        map.put("signcode", OooO00o(sb.toString().toUpperCase()));
        return map;
    }

    public static String OooO00o(String str) {
        if (m20598OooO00o(str)) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    stringBuffer.append(0);
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20598OooO00o(String str) {
        return str == null || "".equals(str.trim());
    }

    public static String OooO00o(String str, int i, int i2, int i3) {
        try {
            if (!C8741oo0oOo0.OooO0Oo(str) || str.length() < i || str.length() < i2 || i2 < i) {
                return str;
            }
            StringBuffer stringBuffer = new StringBuffer();
            if (i3 <= 0) {
                i3 = i2 - i;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                stringBuffer.append("*");
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(str.substring(0, i));
            stringBuffer2.append(stringBuffer.toString());
            stringBuffer2.append(str.substring(i2));
            return stringBuffer2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
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
}
