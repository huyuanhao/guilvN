package com.p118pd.sdk;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.ooOoOOO  reason: case insensitive filesystem */
public class C9046ooOoOOO {

    /* renamed from: com.pd.sdk.ooOoOOO$OooO00o */
    public static class OooO00o implements Comparator<Map.Entry<String, String>> {
        /* renamed from: OooO00o */
        public int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
            return entry.getKey().compareTo(entry2.getKey());
        }
    }

    public static String OooO00o(String str, String str2, String str3, String str4) {
        return OooO00o(C9048ooOoOOOo.OooO00o().m20706OooO00o(), str, str2, str3, str4);
    }

    public static String OooO0O0(String str) {
        if (C9054ooOoOo0.OooO0OO(str)) {
            return null;
        }
        return OooO00o(str).toUpperCase();
    }

    public static String OooO00o(String str, String str2, String str3, String str4, String str5) {
        if (C9054ooOoOo0.OooO0OO(str5)) {
            return "";
        }
        int indexOf = str5.indexOf(C8932ooOOO0o.f22176OooO00o);
        HashMap hashMap = new HashMap();
        if (indexOf > 0) {
            String substring = str5.substring(0, indexOf);
            String[] split = str5.substring(indexOf).split("&");
            for (int i = 0; i < split.length; i++) {
                int indexOf2 = split[i].indexOf(C8932ooOOO0o.OooO0Oo);
                if (indexOf2 > 0) {
                    hashMap.put(split[i].substring(0, indexOf2), split[i].substring(indexOf2 + 1));
                }
            }
            str5 = substring;
        }
        return OooO00o(str5, OooO00o(str, str2, str3, str4, hashMap));
    }

    public static Map<String, String> OooO00o(String str, String str2, String str3, Map<String, String> map) {
        return OooO00o(C9048ooOoOOOo.OooO00o().m20706OooO00o(), str, str2, str3, map);
    }

    public static Map<String, String> OooO00o(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (C9048ooOoOOOo.OooO00o().m20705OooO00o() != null) {
            return C9048ooOoOOOo.OooO00o().m20705OooO00o().OooO00o(str, str2, str3, str4, map);
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (map != null && !map.isEmpty()) {
            for (String str5 : map.keySet()) {
                if (map.get(str5) == null) {
                    map.put(str5, "");
                }
            }
        }
        map.put("appkey", str2);
        map.put("timestamp", str4);
        return OooO00o(str, str3, map);
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

    public static Map<String, String> OooO00o(String str, String str2, Map<String, String> map) {
        ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new OooO00o());
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        for (Map.Entry entry : arrayList) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            sb.append(str3);
            sb.append(str4);
            if (i != 0) {
                try {
                    sb2.append("&");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            sb2.append(str3);
            sb2.append(C8932ooOOO0o.OooO0Oo);
            sb2.append(URLEncoder.encode(str4, "UTF-8"));
            i++;
        }
        sb.append(str2);
        sb.insert(0, str2);
        map.put("signcode", OooO00o(str, sb2.toString(), sb.toString().toUpperCase()));
        return map;
    }

    public static String OooO00o(String str, String str2, String str3) {
        if (!C9048ooOoOOOo.OooO00o().m20707OooO0O0().equals(str)) {
            return OooO00o(str3);
        }
        try {
            String OooO00o2 = C9052ooOoOOoo.OooO00o(str3, "utf-8");
            if (C9048ooOoOOOo.OooO00o().m20705OooO00o() != null) {
                return C9048ooOoOOOo.OooO00o().m20705OooO00o().OooO00o(str2, OooO00o2);
            }
            if (-1 == C9048ooOoOOOo.OooO00o().OooO0Oo()) {
                return OooO00o2;
            }
            int OooO0Oo = C9048ooOoOOOo.OooO00o().OooO0Oo();
            return OooO00o2.substring(OooO0Oo, C9048ooOoOOOo.OooO00o().OooO0o0() + OooO0Oo);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String OooO00o(String str) {
        if (C9054ooOoOo0.OooO0OO(str)) {
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
}
