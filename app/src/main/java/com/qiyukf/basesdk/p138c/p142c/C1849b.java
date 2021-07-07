package com.qiyukf.basesdk.p138c.p142c;

import android.text.util.Linkify;
import anet.channel.util.HttpConstant;
import com.umeng.message.proguard.C3848l;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.qiyukf.basesdk.c.c.b */
public final class C1849b {

    /* renamed from: a */
    public static final Pattern f3404a = Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))");

    /* renamed from: b */
    public static final Pattern f3405b = Pattern.compile("(([a-zA-Z0-9]([a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9]){0,1}\\.)+[a-zA-Z]{2,63}|" + f3404a + C3848l.f10402t);

    /* renamed from: c */
    public static final Pattern f3406c = Pattern.compile("((?:(http|https|Http|Https|HTTP|HTTPS|rtsp|Rtsp|RTSP):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:" + f3405b + ")(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9¡-퟿豈-﷏ﷰ-￯\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?(?:\\b|$)");

    /* renamed from: d */
    public static final Linkify.MatchFilter f3407d = new Linkify.MatchFilter() {
        /* class com.qiyukf.basesdk.p138c.p142c.C1849b.C18501 */

        public final boolean acceptMatch(CharSequence charSequence, int i, int i2) {
            if (i == 0) {
                return true;
            }
            return charSequence.charAt(i + -1) != '@' && !((String) charSequence).regionMatches(i - 3, HttpConstant.SCHEME_SPLIT, 0, 3);
        }
    };

    /* renamed from: com.qiyukf.basesdk.c.c.b$a */
    public static class C1851a {

        /* renamed from: a */
        public String f3408a;

        /* renamed from: b */
        public int f3409b;

        /* renamed from: c */
        public int f3410c;
    }

    /* renamed from: a */
    public static List<C1851a> m3508a(String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = f3406c.matcher(str);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (f3407d.acceptMatch(str, start, end)) {
                C1851a aVar = new C1851a();
                aVar.f3408a = m3509b(matcher.group(0));
                aVar.f3409b = start;
                aVar.f3410c = end;
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static String m3509b(String str) {
        boolean z = true;
        String[] strArr = {"http://", "https://", "rtsp://"};
        int i = 0;
        while (true) {
            if (i >= 3) {
                z = false;
                break;
            } else if (!str.regionMatches(true, 0, strArr[i], 0, strArr[i].length())) {
                i++;
            } else if (!str.regionMatches(false, 0, strArr[i], 0, strArr[i].length())) {
                str = strArr[i] + str.substring(strArr[i].length());
            }
        }
        if (z) {
            return str;
        }
        return strArr[0] + str;
    }
}
