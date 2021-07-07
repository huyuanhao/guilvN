package com.p118pd.sdk;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.pd.sdk.o0OoOOOO  reason: case insensitive filesystem */
public class C7493o0OoOOOO {
    public static String OooO00o = "DESede/CBC/PKCS5Padding";

    public static byte[] OooO00o(String str, byte[] bArr, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            Cipher instance = Cipher.getInstance(OooO00o);
            instance.init(1, secretKeySpec, new IvParameterSpec(C7492o0OoOOO0.OooO00o(instance, str2)));
            return instance.doFinal(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] OooO0O0(String str, byte[] bArr, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            Cipher instance = Cipher.getInstance(OooO00o);
            instance.init(2, secretKeySpec, new IvParameterSpec(C7492o0OoOOO0.OooO00o(instance, str2)));
            return instance.doFinal(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String OooO00o(String str, String str2, String str3) {
        try {
            return C7490o0OoOO0o.OooO00o(OooO00o(str, str2.getBytes(), str3));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String OooO0O0(String str, String str2, String str3) {
        try {
            return new String(OooO0O0(str, C7490o0OoOO0o.OooO00o(str2), str3));
        } catch (Exception unused) {
            return null;
        }
    }
}
