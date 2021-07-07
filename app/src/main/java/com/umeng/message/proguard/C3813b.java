package com.umeng.message.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.umeng.message.proguard.b */
public class C3813b {
    /* renamed from: a */
    public static byte[] m10477a(String str) {
        return m10478a(str, "ISO-8859-1");
    }

    /* renamed from: b */
    public static byte[] m10480b(String str) {
        return m10478a(str, "US-ASCII");
    }

    /* renamed from: c */
    public static byte[] m10482c(String str) {
        return m10478a(str, C3817f.f10341c);
    }

    /* renamed from: d */
    public static byte[] m10484d(String str) {
        return m10478a(str, C3817f.f10342d);
    }

    /* renamed from: e */
    public static byte[] m10486e(String str) {
        return m10478a(str, C3817f.f10343e);
    }

    /* renamed from: f */
    public static byte[] m10488f(String str) {
        return m10478a(str, "UTF-8");
    }

    /* renamed from: a */
    public static byte[] m10478a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            throw m10474a(str2, e);
        }
    }

    /* renamed from: b */
    public static String m10479b(byte[] bArr) {
        return m10476a(bArr, "US-ASCII");
    }

    /* renamed from: c */
    public static String m10481c(byte[] bArr) {
        return m10476a(bArr, C3817f.f10341c);
    }

    /* renamed from: d */
    public static String m10483d(byte[] bArr) {
        return m10476a(bArr, C3817f.f10342d);
    }

    /* renamed from: e */
    public static String m10485e(byte[] bArr) {
        return m10476a(bArr, C3817f.f10343e);
    }

    /* renamed from: f */
    public static String m10487f(byte[] bArr) {
        return m10476a(bArr, "UTF-8");
    }

    /* renamed from: a */
    public static IllegalStateException m10474a(String str, UnsupportedEncodingException unsupportedEncodingException) {
        return new IllegalStateException(str + ": " + unsupportedEncodingException);
    }

    /* renamed from: a */
    public static String m10476a(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            throw m10474a(str, e);
        }
    }

    /* renamed from: a */
    public static String m10475a(byte[] bArr) {
        return m10476a(bArr, "ISO-8859-1");
    }
}
