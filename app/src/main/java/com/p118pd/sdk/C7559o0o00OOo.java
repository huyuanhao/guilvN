package com.p118pd.sdk;

import android.os.Environment;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.pd.sdk.o0o00OOo  reason: case insensitive filesystem */
public final class C7559o0o00OOo {
    public static File OooO00o() {
        try {
            return (File) Environment.class.getMethod(new String(C7552o0o00O.OooO00o("Z2V0RXh0ZXJuYWxTdG9yYWdlRGlyZWN0b3J5")), new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String OooO00o(String str) {
        return str == null ? "" : str;
    }

    public static String OooO00o(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public static String OooO00o(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String OooO00o(Map<String, String> map, String str, String str2) {
        String str3;
        return (map == null || (str3 = map.get(str)) == null) ? str2 : str3;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19210OooO00o(String str) {
        int length;
        if (!(str == null || (length = str.length()) == 0)) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19211OooO00o(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public static String OooO0O0(String str) {
        try {
            if (m19210OooO00o(str)) {
                return null;
            }
            MessageDigest instance = MessageDigest.getInstance(LL1i.OooO0O0);
            instance.update(str.getBytes("UTF-8"));
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digest.length; i++) {
                sb.append(String.format("%02x", Byte.valueOf(digest[i])));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m19212OooO0O0(String str) {
        return !m19210OooO00o(str);
    }

    public static String OooO0OO(String str) {
        try {
            byte[] array = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(str.length()).array();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("UTF-8"));
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            byte[] bArr = new byte[(byteArrayOutputStream.toByteArray().length + 4)];
            System.arraycopy(array, 0, bArr, 0, 4);
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, 4, byteArrayOutputStream.toByteArray().length);
            return Base64.encodeToString(bArr, 8);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static boolean m19213OooO0OO(String str) {
        byte[] bytes = str.getBytes();
        for (byte b : bytes) {
            if ((b >= 0 && b <= 31) || b >= Byte.MAX_VALUE) {
                return false;
            }
        }
        return true;
    }

    public static String OooO0Oo(String str) {
        if (m19210OooO00o(str)) {
            return "";
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes("utf-8"));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = byteArrayInputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    gZIPOutputStream.write(bArr, 0, read);
                } else {
                    gZIPOutputStream.flush();
                    gZIPOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                    byteArrayInputStream.close();
                    return new String(Base64.encode(byteArray, 2));
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }
}
