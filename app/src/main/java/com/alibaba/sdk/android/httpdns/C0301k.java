package com.alibaba.sdk.android.httpdns;

import java.security.MessageDigest;
import java.util.regex.Pattern;

/* renamed from: com.alibaba.sdk.android.httpdns.k */
public class C0301k {

    /* renamed from: a */
    public static Pattern f654a = Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");

    /* renamed from: a */
    public static String m538a(String str) {
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(str.getBytes());
        byte[] digest = instance.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            String hexString = Integer.toHexString(b & 255);
            while (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m539b(String str) {
        if (str != null) {
            try {
                char[] charArray = str.toCharArray();
                if (charArray.length > 0) {
                    if (charArray.length <= 255) {
                        for (char c : charArray) {
                            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '.' || c == '-'))) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m540c(String str) {
        return str != null && str.length() >= 7 && str.length() <= 15 && !str.equals("") && f654a.matcher(str).matches();
    }
}
