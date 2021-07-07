package com.p118pd.sdk;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.pd.sdk.o0OoOO  reason: case insensitive filesystem */
public class C7488o0OoOO {
    public static String OooO00o(String str, String str2) {
        return OooO00o(1, str, str2);
    }

    public static String OooO0O0(String str, String str2) {
        return OooO00o(2, str, str2);
    }

    public static String OooO00o(int i, String str, String str2) {
        byte[] bArr;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
            Cipher instance = Cipher.getInstance("DES");
            instance.init(i, secretKeySpec);
            if (i == 2) {
                bArr = C7490o0OoOO0o.OooO00o(str);
            } else {
                bArr = str.getBytes("UTF-8");
            }
            byte[] doFinal = instance.doFinal(bArr);
            if (i == 2) {
                return new String(doFinal);
            }
            return C7490o0OoOO0o.OooO00o(doFinal);
        } catch (Exception e) {
            C7620o0oOOOoo.m19257OooO00o((Throwable) e);
            return null;
        }
    }
}
