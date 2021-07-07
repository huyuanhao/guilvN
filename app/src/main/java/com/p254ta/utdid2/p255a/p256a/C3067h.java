package com.p254ta.utdid2.p255a.p256a;

/* renamed from: com.ta.utdid2.a.a.h */
public class C3067h {
    public static String get(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }
}
