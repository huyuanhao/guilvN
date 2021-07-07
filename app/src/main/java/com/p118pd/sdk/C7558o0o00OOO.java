package com.p118pd.sdk;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.pd.sdk.o0o00OOO  reason: case insensitive filesystem */
public final class C7558o0o00OOO {
    public static String OooO00o = "idnjfhncnsfuobcnt847y929o449u474w7j3h22aoddc98euk#%&&)*&^%#";

    public static String OooO00o() {
        String str = new String();
        for (int i = 0; i < OooO00o.length() - 1; i += 4) {
            str = str + OooO00o.charAt(i);
        }
        return str;
    }

    public static String OooO00o(String str, String str2) {
        try {
            PBEKeySpec OooO00o2 = OooO00o(str);
            byte[] bytes = str2.getBytes();
            byte[] OooO00o3 = m19209OooO00o();
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(OooO00o2).getEncoded(), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(OooO00o3));
            byte[] salt = OooO00o2.getSalt();
            ByteBuffer allocate = ByteBuffer.allocate(salt.length + instance.getOutputSize(bytes.length));
            allocate.put(salt);
            instance.doFinal(ByteBuffer.wrap(bytes), allocate);
            return OooO00o(allocate.array());
        } catch (Exception unused) {
            return null;
        }
    }

    public static String OooO00o(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            stringBuffer.append("0123456789ABCDEF".charAt((b >> 4) & 15));
            stringBuffer.append("0123456789ABCDEF".charAt(b & 15));
        }
        return stringBuffer.toString();
    }

    public static PBEKeySpec OooO00o(String str) {
        Class<?> cls = Class.forName(new String(C7552o0o00O.OooO00o("amF2YS5zZWN1cml0eS5TZWN1cmVSYW5kb20=")));
        Object newInstance = cls.newInstance();
        byte[] bArr = new byte[16];
        Method method = cls.getMethod("nextBytes", bArr.getClass());
        method.setAccessible(true);
        method.invoke(newInstance, bArr);
        return new PBEKeySpec(str.toCharArray(), bArr, 10, 128);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m19209OooO00o() {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 48; i += 2) {
                sb.append("AsAgAtA5A6AdAgABABACADAfAsAdAfAsAgAaAgA3A5A6=8=0".charAt(i));
            }
            return C7552o0o00O.OooO00o(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String OooO0O0(String str, String str2) {
        byte[] bArr;
        try {
            PBEKeySpec OooO00o2 = OooO00o(str);
            int length = str2.length() / 2;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr2[i] = Integer.valueOf(str2.substring(i2, i2 + 2), 16).byteValue();
            }
            byte[] OooO00o3 = m19209OooO00o();
            if (length <= 16) {
                bArr = null;
            } else {
                SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(OooO00o2.getPassword(), Arrays.copyOf(bArr2, 16), 10, 128)).getEncoded(), "AES");
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(2, secretKeySpec, new IvParameterSpec(OooO00o3));
                bArr = instance.doFinal(bArr2, 16, length - 16);
            }
            if (bArr != null) {
                String str3 = new String(bArr);
                if (C7559o0o00OOo.m19213OooO0OO(str3)) {
                    return str3;
                }
                return null;
            }
            throw new Exception();
        } catch (Exception unused) {
        }
    }
}
