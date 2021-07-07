package anet.channel.strategy.utils;

import android.text.TextUtils;
import anet.channel.util.ALog;
import com.bumptech.glide.request.SingleRequest;
import com.p118pd.sdk.C8932ooOOO0o;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* renamed from: anet.channel.strategy.utils.c */
public class C0209c {
    /* renamed from: a */
    public static boolean m281a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length < 7 || charArray.length > 15) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        for (char c : charArray) {
            if (c >= '0' && c <= '9') {
                i2 = ((i2 * 10) + c) - 48;
                if (i2 > 255) {
                    return false;
                }
            } else if (c != '.' || (i = i + 1) > 3) {
                return false;
            } else {
                i2 = 0;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m282b(String str) {
        int i;
        boolean z;
        int i2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length < 2) {
            return false;
        }
        if (charArray[0] != ':') {
            i2 = 0;
            z = false;
            i = 0;
        } else if (charArray[1] != ':') {
            return false;
        } else {
            i2 = 1;
            z = false;
            i = 1;
        }
        int i3 = 0;
        boolean z2 = true;
        while (i2 < charArray.length) {
            char c = charArray[i2];
            int digit = Character.digit(c, 16);
            if (digit != -1) {
                i3 = (i3 << 4) + digit;
                if (i3 > 65535) {
                    return false;
                }
                z2 = false;
            } else if (c != ':' || (i = i + 1) > 7) {
                return false;
            } else {
                if (!z2) {
                    i3 = 0;
                    z2 = true;
                } else if (z) {
                    return false;
                } else {
                    z = true;
                }
            }
            i2++;
        }
        if (z || i >= 7) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m283c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length <= 0 || charArray.length > 255) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i] >= 'A' && charArray[i] <= 'Z') || ((charArray[i] >= 'a' && charArray[i] <= 'z') || charArray[i] == '*')) {
                z = true;
            } else if (!((charArray[i] >= '0' && charArray[i] <= '9') || charArray[i] == '.' || charArray[i] == '-')) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: d */
    public static String m284d(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static String m279a(long j) {
        StringBuilder sb = new StringBuilder(16);
        long j2 = 1000000000;
        do {
            sb.append(j / j2);
            sb.append('.');
            j %= j2;
            j2 /= 1000;
        } while (j2 > 0);
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m280a(Map<String, String> map, String str) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(64);
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append(C8932ooOOO0o.OooO0Oo);
                    sb.append(URLEncoder.encode(m284d(entry.getValue()), str).replace("+", "%20"));
                    sb.append("&");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
        } catch (UnsupportedEncodingException e) {
            ALog.m288e(SingleRequest.o0ooOoO, "format params failed", null, e, new Object[0]);
        }
        return sb.toString();
    }
}
