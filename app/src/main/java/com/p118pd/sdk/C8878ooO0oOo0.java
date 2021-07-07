package com.p118pd.sdk;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

/* renamed from: com.pd.sdk.ooO0oOo0  reason: case insensitive filesystem */
public class C8878ooO0oOo0 {
    public static String OooO00o() {
        return UUID.randomUUID().toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
    }

    public static String OooO0O0() {
        return UUID.randomUUID().toString();
    }

    public static String OooO0OO(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf != -1 ? str.substring(lastIndexOf + 1, str.length()) : str;
    }

    public static String OooO0Oo(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length() - 1;
        int i = length;
        while (i >= 0 && str.charAt(i) <= ' ') {
            i--;
        }
        if (i == length) {
            return str;
        }
        return str.substring(0, i + 1);
    }

    public static String OooO0o0(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        int length = str.length() - 1;
        while (i <= length && str.charAt(i) <= ' ') {
            i++;
        }
        if (i == 0) {
            return str;
        }
        return str.substring(i, length + 1);
    }

    public static String OooO00o(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return "";
        }
        int i = lastIndexOf + 1;
        for (int i2 = i; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && (charAt < '0' || charAt > '9'))) {
                return "";
            }
        }
        return str.substring(i, str.length());
    }

    public static String OooO0O0(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String OooO00o = OooO00o(str.toLowerCase());
        if (!TextUtils.isEmpty(OooO00o)) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(OooO00o);
        }
        return "";
    }

    public static String OooO00o(long j) {
        if (j >= 1048576) {
            return String.format("%.2fMB", Float.valueOf(((float) j) / 1048576.0f));
        } else if (j >= 1024) {
            double d = (double) j;
            Double.isNaN(d);
            return String.format("%dKB", Integer.valueOf((int) Math.ceil(d / 1024.0d)));
        } else {
            return String.format("%dB", Long.valueOf(j));
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m20522OooO00o(String str) {
        if (str == null) {
            str = "";
        }
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String OooO00o(byte[] bArr) {
        if (bArr != null) {
            try {
                return new String(bArr, "utf-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return null;
    }
}
