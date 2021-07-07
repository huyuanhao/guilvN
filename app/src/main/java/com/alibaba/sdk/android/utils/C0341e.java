package com.alibaba.sdk.android.utils;

import com.p118pd.sdk.LL1i;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.alibaba.sdk.android.utils.e */
public class C0341e {

    /* renamed from: a */
    public static final char[] f769a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static boolean m639a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: b */
    public static String m640b(String str) throws NoSuchAlgorithmException {
        return m637a(MessageDigest.getInstance(LL1i.OooO0O0).digest(str.getBytes()));
    }

    /* renamed from: a */
    public static void m638a(double d) {
        try {
            Thread.sleep((long) (d * 1000.0d));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static String m636a(String str) throws NoSuchAlgorithmException {
        return m637a(MessageDigest.getInstance("MD5").digest(str.getBytes()));
    }

    /* renamed from: a */
    public static String m637a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(f769a[(bArr[i] & 240) >>> 4]);
            sb.append(f769a[bArr[i] & 15]);
        }
        return sb.toString();
    }
}
