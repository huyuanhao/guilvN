package com.p118pd.sdk;

import android.text.TextUtils;
import android.util.Pair;
import com.xiaomi.mipush.sdk.Constants;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* renamed from: com.pd.sdk.oo00O0O0  reason: case insensitive filesystem */
public abstract class AbstractC8526oo00O0O0 {
    public static long OooO00o(String str, long j) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
            return simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(j))).getTime();
        } catch (ParseException unused) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event/stringUtil", "getMillisOfDate(): Time conversion Exception !");
            return 0;
        }
    }

    public static Pair<String, String> OooO00o(String str) {
        String str2;
        String str3;
        if ("_default_config_tag".equals(str)) {
            return new Pair<>(str, "");
        }
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (split.length > 2) {
            str3 = split[split.length - 1];
            str2 = str.substring(0, (str.length() - str3.length()) - 1);
        } else {
            str2 = split[0];
            str3 = split[1];
        }
        return new Pair<>(str2, str3);
    }

    public static String OooO00o() {
        return "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039";
    }

    public static String OooO00o(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "allType" : "diffprivacy" : "preins" : "maint" : "oper";
    }

    public static String OooO00o(String str, int i) {
        if (!TextUtils.isEmpty(str) && str.length() > i) {
            int length = str.length();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = length - 1;
                str = str.substring(i3) + str.substring(0, i3);
            }
        }
        return str;
    }

    public static String OooO00o(String str, String str2, String str3) {
        if ("_default_config_tag".equals(str)) {
            return "_default_config_tag#" + str3;
        }
        return str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2 + "#" + str3;
    }

    public static String OooO00o(String str, String str2, String str3, String str4, String str5) {
        byte[] OooO00o = AbstractC8522oo00O000.OooO00o(str);
        byte[] OooO00o2 = AbstractC8522oo00O000.OooO00o(str2);
        byte[] OooO00o3 = AbstractC8522oo00O000.OooO00o(str3);
        byte[] OooO00o4 = AbstractC8522oo00O000.OooO00o(str4);
        int length = OooO00o.length;
        if (length > OooO00o2.length) {
            length = OooO00o2.length;
        }
        if (length > OooO00o3.length) {
            length = OooO00o3.length;
        }
        if (length > OooO00o4.length) {
            length = OooO00o4.length;
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (((OooO00o[i] ^ OooO00o2[i]) ^ OooO00o3[i]) ^ OooO00o4[i]);
        }
        return OooO00o(cArr, AbstractC8522oo00O000.OooO00o(str5));
    }

    public static String OooO00o(char[] cArr, byte[] bArr) {
        String str;
        try {
            return AbstractC8522oo00O000.OooO00o(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(cArr, bArr, 10000, 128)).getEncoded());
        } catch (InvalidKeySpecException unused) {
            str = "getAuthToken() encryptPBKDF2 Invalid key specification !";
            AbstractC8536oo00OO0O.OooO0Oo("HiAnalytics/event/stringUtil", str);
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            str = "getAuthToken() encryptPBKDF2 No such algorithm!";
            AbstractC8536oo00OO0O.OooO0Oo("HiAnalytics/event/stringUtil", str);
            return null;
        }
    }

    public static Set<String> OooO00o(Set<String> set) {
        if (set == null || set.size() == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet(set.size());
        for (String str : set) {
            if (!"_default_config_tag".equals(str)) {
                String str2 = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + "oper";
                String str3 = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + "maint";
                hashSet.add(str2);
                hashSet.add(str3);
                hashSet.add(str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + "diffprivacy");
            } else {
                hashSet.add("_default_config_tag");
            }
        }
        return hashSet;
    }
}
