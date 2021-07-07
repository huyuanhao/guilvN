package com.huawei.updatesdk.sdk.p062a.p069d;

import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Pattern;

/* renamed from: com.huawei.updatesdk.sdk.a.d.e */
public abstract class AbstractC1293e {

    /* renamed from: a */
    public static final Pattern f1456a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: a */
    public static boolean m1646a(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* renamed from: b */
    public static String m1647b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20").replace("*", "%2A").replace(Constants.WAVE_SEPARATOR, "%7E");
        } catch (UnsupportedEncodingException e) {
            C1278a.m1581a("StringUtils", "encode2utf8 error", e);
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m1648c(String str) {
        return str != null && str.trim().startsWith("{") && str.trim().endsWith(C7522o0Ooo0o.OooO0Oo);
    }

    /* renamed from: d */
    public static boolean m1649d(String str) {
        return f1456a.matcher(str).matches();
    }
}
