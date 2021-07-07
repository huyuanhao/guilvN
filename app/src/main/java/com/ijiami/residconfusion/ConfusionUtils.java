package com.ijiami.residconfusion;

import android.annotation.SuppressLint;
import android.content.Context;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SuppressLint({"DefaultLocale"})
public class ConfusionUtils {
    private static Context mContext = null;
    private static String sig = "B99931E15076315992F82E17C7E39DE2";

    /* renamed from: wJ */
    private static final char[] f1730wJ = "0123456789abcdef".toCharArray();

    public static void check(Context context) {
        mContext = context;
        String currenSig = getSignInfo();
        if (!sig.equals(currenSig) && !"20F7B".equals(currenSig) && !"20F7B70588D139686A6587CD3CAEC966".equals(currenSig) && !"123456789123456789".equals(currenSig)) {
            System.exit(-1);
        }
    }

    private static String getSignInfo() {
        try {
            return m2146k(m2145j(mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 64).signatures[0].toByteArray()));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: k */
    private static String m2146k(byte[] paramArrayOfByte) {
        StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length * 3);
        for (byte b : paramArrayOfByte) {
            int k = b & 255;
            localStringBuilder.append(f1730wJ[k >> 4]);
            localStringBuilder.append(f1730wJ[k & 15]);
        }
        return localStringBuilder.toString().toUpperCase();
    }

    /* renamed from: j */
    private static byte[] m2145j(byte[] paramArrayOfByte) {
        try {
            MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
            localMessageDigest.update(paramArrayOfByte);
            return localMessageDigest.digest();
        } catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {
            localNoSuchAlgorithmException.printStackTrace();
            return null;
        }
    }
}
