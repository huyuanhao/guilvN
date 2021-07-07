package com.p118pd.sdk;

import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.Locale;

/* renamed from: com.pd.sdk.oo00O000  reason: case insensitive filesystem */
public abstract class AbstractC8522oo00O000 {
    public static byte OooO00o(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    public static String OooO00o() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return OooO00o(bArr);
    }

    public static String OooO00o(byte[] bArr) {
        return C8586oo0O00.OooO00o(bArr);
    }

    public static byte[] OooO00o(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (OooO00o(charArray[i2 + 1]) | (OooO00o(charArray[i2]) << 4));
        }
        return bArr;
    }

    public static String OooO0O0() {
        byte[] bArr = new byte[128];
        new SecureRandom().nextBytes(bArr);
        return OooO00o(bArr);
    }

    public static String OooO0OO() {
        return "a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc";
    }

    public static String OooO0Oo() {
        return "49cb4254efce57d5861aedca86e5baf1205b09cd7f742b38065559f0f70676754915acca5ad6eeaa0d68dfd5143d0a50faedb6cda3b13852705c881ba5b587ecbbb4467cbed08b6754a3f424d90c66fd3b82d48bd5c132b88ff36da668f5adc286ec8317166c70110203010001";
    }
}
