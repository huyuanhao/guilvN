package com.umeng.message.proguard;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.umeng.message.proguard.c */
public class C3814c {

    /* renamed from: a */
    public static byte[] f10306a = "uLi4/f4+Pb39.T19".getBytes();

    /* renamed from: b */
    public static byte[] f10307b = ("nmeug" + ".f9/" + "Om+L823").getBytes();

    /* renamed from: a */
    public static String m10491a(String... strArr) throws Exception {
        String str;
        String str2;
        String str3 = null;
        if (strArr.length == 2) {
            str2 = strArr[0];
            str = strArr[1];
        } else if (strArr.length == 3) {
            String str4 = strArr[0];
            String str5 = strArr[1];
            str3 = strArr[2];
            str = str5;
            str2 = str4;
        } else {
            str = null;
            str2 = null;
        }
        if (str3 != null && str3.length() == 16) {
            f10306a = str3.getBytes();
        }
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, new SecretKeySpec(f10306a, "AES"), new IvParameterSpec(f10307b));
        return C3815d.m10503d(instance.doFinal(str2.getBytes(str)));
    }

    /* renamed from: a */
    public static String m10490a(String str, String str2) throws Exception {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, new SecretKeySpec(f10306a, "AES"), new IvParameterSpec(f10307b));
        return new String(instance.doFinal(C3815d.m10500b(str)), str2);
    }

    /* renamed from: a */
    public static String m10489a(String str) throws Exception {
        f10306a = "uLi4/f4+Pb39.T19".getBytes();
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, new SecretKeySpec(f10306a, "AES"), new IvParameterSpec(f10307b));
        return C3815d.m10503d(instance.doFinal(str.getBytes("UTF-8")));
    }
}
