package com.xiaomi.push;

import com.p118pd.sdk.O0O00O;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.xiaomi.push.be */
public class C4284be {
    /* renamed from: a */
    public static String m11796a(byte b) {
        int i = (b & O0O00O.OooO0O0) + (b < 0 ? 128 : 0);
        StringBuilder sb = new StringBuilder();
        sb.append(i < 16 ? "0" : "");
        sb.append(Integer.toHexString(i).toLowerCase());
        return sb.toString();
    }

    /* renamed from: a */
    public static String m11797a(String str) {
        byte[] digest;
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            StringBuffer stringBuffer = new StringBuffer();
            instance.update(str.getBytes(), 0, str.length());
            for (byte b : instance.digest()) {
                stringBuffer.append(m11796a(b));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m11798b(String str) {
        return m11797a(str).subSequence(8, 24).toString();
    }
}
