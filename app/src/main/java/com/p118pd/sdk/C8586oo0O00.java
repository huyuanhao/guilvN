package com.p118pd.sdk;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.pd.sdk.oo0O00  reason: case insensitive filesystem */
public class C8586oo0O00 {
    public static final char[] OooO00o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String OooO00o(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(LL1i.OooO0Oo);
            instance.update(str.getBytes("UTF-8"));
            return OooO00o(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            str2 = "getSHA256StrJava, No Such Algorithm!";
        } catch (UnsupportedEncodingException unused2) {
            str2 = "getSHA256StrJava, Unsupported Encoding: UTF-8 !";
        }
        AbstractC8536oo00OO0O.OooO0Oo("HianalyticsSDK", str2);
        return "";
    }

    public static String OooO00o(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(OooO00o[(b & 240) >> 4]);
            sb.append(OooO00o[b & 15]);
        }
        return sb.toString();
    }

    public static byte[] OooO00o(String str, String str2) {
        String str3;
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(Charset.forName("UTF-8")), "HmacSHA256");
        try {
            Mac instance = Mac.getInstance(secretKeySpec.getAlgorithm());
            instance.init(secretKeySpec);
            return instance.doFinal(bytes);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "When digest2byte executed Exception has happened!From Algorithm error !";
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsHexUtil", str3);
            return new byte[0];
        } catch (InvalidKeyException unused2) {
            str3 = "Exception has happened when digest2byte,From Invalid key!";
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsHexUtil", str3);
            return new byte[0];
        }
    }
}
