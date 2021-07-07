package com.p118pd.sdk;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;

/* renamed from: com.pd.sdk.oOoo0oO  reason: case insensitive filesystem */
public class C8419oOoo0oO {
    public static final int OooO00o = 16;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21563OooO00o = "com.nearme.mcs";

    public static String OooO00o() {
        byte[] OooO00o2 = m20087OooO00o(m20086OooO00o(f21563OooO00o));
        return OooO00o2 != null ? new String(OooO00o2, Charset.forName("UTF-8")) : "";
    }

    public static String OooO00o(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return AbstractC8461oOooo00.OooO00o(str, OooO00o());
            } catch (Exception e) {
                C8409oOoo0OOo.OooO0O0("desDecrypt-" + e.getMessage());
            }
        }
        return "";
    }

    public static String OooO00o(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString.toUpperCase(Locale.getDefault()));
        }
        return sb.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m20086OooO00o(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m20087OooO00o(byte[] bArr) {
        int length = bArr.length % 2 == 0 ? bArr.length : bArr.length - 1;
        for (int i = 0; i < length; i += 2) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    public static String OooO0O0(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return AbstractC8461oOooo00.OooO0O0(str, OooO00o());
            } catch (Exception e) {
                C8409oOoo0OOo.OooO0O0("desEncrypt-" + e.getMessage());
            }
        }
        return "";
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static byte[] m20088OooO0O0(String str) {
        if (str.length() <= 0) {
            return null;
        }
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < str.length() / 2; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            bArr[i] = (byte) ((Integer.parseInt(str.substring(i2, i3), 16) * 16) + Integer.parseInt(str.substring(i3, i2 + 2), 16));
        }
        return bArr;
    }
}
