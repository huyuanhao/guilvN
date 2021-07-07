package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.umeng.commonsdk.proguard.n */
public class C3616n {
    /* renamed from: a */
    public static String m9503a(Context context, String str, String str2) {
        Signature[] a = m9505a(context, str);
        if (a == null) {
            return null;
        }
        for (Signature signature : a) {
            if ("SHA1".equals(str2)) {
                return m9504a(signature, "SHA1");
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Signature[] m9505a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static String m9504a(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            if (instance == null) {
                return null;
            }
            byte[] digest = instance.digest(byteArray);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
