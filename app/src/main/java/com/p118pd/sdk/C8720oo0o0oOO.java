package com.p118pd.sdk;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MultipartBody;

/* renamed from: com.pd.sdk.oo0o0oOO  reason: case insensitive filesystem */
public class C8720oo0o0oOO {
    public static int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static String f21896OooO00o = "signcode";
    public static int OooO0O0 = 1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static String f21897OooO0O0 = "&";
    public static String OooO0OO = "=";
    public static String OooO0Oo = "{";
    public static String OooO0o = "s_l";
    public static String OooO0o0 = "}";
    public static String OooO0oO = "1";
    public static String OooO0oo = "0";

    public static String OooO00o(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        String[] split = str.split(f21897OooO0O0);
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split(OooO0OO);
            if (!C8741oo0oOo0.OooO00o(split2[OooO00o], f21896OooO00o)) {
                if (i != 0) {
                    sb.append(f21897OooO0O0);
                }
                sb.append(split2[OooO00o]);
                sb.append(OooO0OO);
                if (split2.length >= 2) {
                    int i2 = OooO0O0;
                    if (split2[i2] != null) {
                        str2 = split2[i2];
                        sb.append(str2);
                    }
                }
                str2 = "";
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public static void OooO00o(FormBody.Builder builder, String str) {
        String[] split;
        String str2;
        for (String str3 : str.split(f21897OooO0O0)) {
            String[] split2 = str3.split(OooO0OO);
            try {
                String str4 = split2[OooO00o];
                if (split2.length >= 2) {
                    if (split2[OooO0O0] != null) {
                        str2 = URLDecoder.decode(split2[OooO0O0], "UTF-8");
                        builder.add(str4, str2);
                    }
                }
                str2 = "";
                builder.add(str4, str2);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    public static void OooO00o(MultipartBody.Builder builder, String str) {
        String[] split;
        String str2;
        for (String str3 : str.split(f21897OooO0O0)) {
            String[] split2 = str3.split(OooO0OO);
            try {
                String str4 = split2[OooO00o];
                if (split2.length >= 2) {
                    if (split2[OooO0O0] != null) {
                        str2 = URLDecoder.decode(split2[OooO0O0], "UTF-8");
                        builder.addFormDataPart(str4, str2);
                    }
                }
                str2 = "";
                builder.addFormDataPart(str4, str2);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    public static String OooO00o(Map<String, String> map) {
        map.remove(f21896OooO00o);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str : map.keySet()) {
            if (i != 0) {
                sb.append(f21897OooO0O0);
            }
            String str2 = map.get(str) == null ? "" : map.get(str);
            sb.append(str);
            sb.append(OooO0OO);
            try {
                sb.append(URLEncoder.encode(str2, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            i++;
        }
        return sb.toString();
    }

    public static void OooO00o(HttpUrl.Builder builder, String str) {
        String[] split = str.split(f21897OooO0O0);
        for (int i = 0; i < split.length; i++) {
            try {
                String[] split2 = split[i].split(OooO0OO);
                String decode = (split2.length < 2 || split2[OooO0O0] == null) ? "" : URLDecoder.decode(split2[OooO0O0], "UTF-8");
                if (decode.contains(OooO0Oo)) {
                    builder.addEncodedQueryParameter(split2[OooO00o], URLEncoder.encode(decode, "UTF-8"));
                } else {
                    builder.addQueryParameter(split2[OooO00o], decode);
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    public static void OooO00o(Map<String, String> map, String str) {
        String str2;
        String[] split = str.split(f21897OooO0O0);
        for (int i = 0; i < split.length; i++) {
            try {
                String[] split2 = split[i].split(OooO0OO);
                String str3 = split2[OooO00o];
                if (split2.length >= 2) {
                    if (split2[OooO0O0] != null) {
                        str2 = URLDecoder.decode(split2[OooO0O0], "UTF-8");
                        map.put(str3, str2);
                    }
                }
                str2 = "";
                map.put(str3, str2);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Map<String, Object> m20343OooO00o(String str) {
        Map<String, Object> OooO0o02 = C8706oo0o0OO0.OooO00o().OooO0o0();
        for (String str2 : OooO0o02.keySet()) {
            Map<String, Object> map = (Map) OooO0o02.get(str2);
            if (map != null && map.containsKey("baseURL") && ((String) map.get("baseURL")).contains(str)) {
                return map;
            }
        }
        return new HashMap();
    }
}
