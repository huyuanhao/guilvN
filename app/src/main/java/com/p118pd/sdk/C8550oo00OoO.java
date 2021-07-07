package com.p118pd.sdk;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.pd.sdk.oo00OoO  reason: case insensitive filesystem */
public class C8550oo00OoO {
    public SortedMap<String, String> OooO00o = new TreeMap();

    public C8550oo00OoO(String str) {
        OooO00o(str);
    }

    private void OooO00o(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("&");
            for (String str2 : split) {
                int indexOf = str2.indexOf(C8932ooOOO0o.OooO0Oo);
                this.OooO00o.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
            }
        }
    }

    public String OooO00o() {
        StringBuilder sb = new StringBuilder(512);
        try {
            for (Map.Entry<String, String> entry : this.OooO00o.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String encode = URLEncoder.encode(key, "UTF-8");
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    String value = entry.getValue();
                    String decode = !TextUtils.isEmpty(value) ? URLDecoder.decode(value, "UTF-8") : "";
                    sb.append(encode);
                    sb.append(C8932ooOOO0o.OooO0Oo);
                    sb.append(decode);
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            AbstractC8536oo00OO0O.OooO0OO("CanonicalQueryString", "Exception when toString,Encode does not support!");
            return "";
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20208OooO00o(String str) {
        String str2 = this.OooO00o.get(URLEncoder.encode(str, "UTF-8"));
        return !TextUtils.isEmpty(str2) ? URLDecoder.decode(str2, "UTF-8") : str2;
    }
}
