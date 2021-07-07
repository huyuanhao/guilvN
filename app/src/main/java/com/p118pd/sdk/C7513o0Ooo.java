package com.p118pd.sdk;

import com.alipay.sdk.app.EnumC0405k;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.o0Ooo  reason: case insensitive filesystem */
public class C7513o0Ooo {
    public static final String OooO00o = "resultStatus";
    public static final String OooO0O0 = "memo";
    public static final String OooO0OO = "result";

    public static Map<String, String> OooO00o(String str) {
        Map<String, String> OooO00o2 = OooO00o();
        try {
            return OooO0O0(str);
        } catch (Throwable th) {
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.OooOOo0, th);
            return OooO00o2;
        }
    }

    public static Map<String, String> OooO0O0(String str) {
        String[] split = str.split(C7522o0Ooo0o.OooO0O0);
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            String substring = str2.substring(0, str2.indexOf("={"));
            hashMap.put(substring, OooO00o(str2, substring));
        }
        return hashMap;
    }

    public static Map<String, String> OooO00o() {
        EnumC0405k b = EnumC0405k.m832b(EnumC0405k.CANCELED.mo4240a());
        HashMap hashMap = new HashMap();
        hashMap.put(OooO00o, Integer.toString(b.mo4240a()));
        hashMap.put(OooO0O0, b.mo4243b());
        hashMap.put("result", "");
        return hashMap;
    }

    public static String OooO00o(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf(C7522o0Ooo0o.OooO0Oo));
    }
}
