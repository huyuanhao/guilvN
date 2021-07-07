package com.qiyukf.basesdk.p138c.p142c;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.p118pd.sdk.C8318oOo0oooo;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.qiyukf.basesdk.c.c.d */
public class C1853d {

    /* renamed from: a */
    public static Map<String, Character> f3411a;

    /* renamed from: b */
    public static Pattern f3412b;

    /* renamed from: a */
    public static String m3514a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public static String m3515a(float f) {
        return String.format(Locale.US, "%d%%", Integer.valueOf((int) (f * 100.0f)));
    }

    /* renamed from: a */
    public static String m3516a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return "";
        }
        int i = lastIndexOf + 1;
        for (int i2 = i; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && (charAt < '0' || charAt > '9'))) {
                return "";
            }
        }
        return str.substring(i, str.length());
    }

    /* renamed from: a */
    public static boolean m3517a(CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!(charAt == ' ' || charAt == '\n' || charAt == '\t' || charAt == '\r')) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m3518b() {
        return UUID.randomUUID().toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
    }

    /* renamed from: b */
    public static String m3519b(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf != -1 ? str.substring(lastIndexOf + 1, str.length()) : str;
    }

    /* renamed from: c */
    public static String m3520c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String a = m3516a(str.toLowerCase());
        return !TextUtils.isEmpty(a) ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(a) : "";
    }

    /* renamed from: d */
    public static String m3521d(String str) {
        if (f3411a == null || f3412b == null) {
            synchronized (C1853d.class) {
                if (f3411a == null || f3412b == null) {
                    HashMap hashMap = new HashMap(8);
                    f3411a = hashMap;
                    hashMap.put("&quot;", Character.valueOf(C8318oOo0oooo.OooO00o));
                    f3411a.put("&amp;", Character.valueOf(C8318oOo0oooo.OooO0OO));
                    f3411a.put("&lt;", Character.valueOf(C8318oOo0oooo.OooO0Oo));
                    f3411a.put("&gt;", Character.valueOf(C8318oOo0oooo.OooO0o0));
                    f3411a.put("&#39;", '\'');
                    f3411a.put("&nbsp;", ' ');
                    f3412b = Pattern.compile("&quot;|&amp;|&lt;|&gt;|&#39;|&nbsp;");
                }
            }
        }
        Matcher matcher = f3412b.matcher(str);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            sb.append((CharSequence) str, i, start);
            Character ch = f3411a.get(str.substring(start, end));
            if (ch != null) {
                sb.append(ch);
            } else {
                sb.append((CharSequence) str, start, end);
            }
            i = end;
        }
        if (i == 0) {
            return str;
        }
        if (i < str.length()) {
            sb.append((CharSequence) str, i, str.length());
        }
        return sb.toString();
    }
}
