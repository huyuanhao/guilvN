package com.umeng.message.proguard;

import com.p118pd.sdk.C8932ooOOO0o;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;

/* renamed from: com.umeng.message.proguard.i */
public class C3845i {
    /* renamed from: a */
    public static String m10570a(Map<String, Object> map, String str) {
        String str2;
        if (map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        Set<String> keySet = map.keySet();
        if (!str.endsWith(C8932ooOOO0o.f22176OooO00o)) {
            sb.append(C8932ooOOO0o.f22176OooO00o);
        }
        for (String str3 : keySet) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(URLEncoder.encode(str3));
            sb2.append(C8932ooOOO0o.OooO0Oo);
            if (map.get(str3) == null) {
                str2 = "";
            } else {
                str2 = map.get(str3).toString();
            }
            sb2.append(URLEncoder.encode(str2));
            sb2.append("&");
            sb.append(sb2.toString());
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
