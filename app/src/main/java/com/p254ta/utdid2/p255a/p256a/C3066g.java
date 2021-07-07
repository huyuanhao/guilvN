package com.p254ta.utdid2.p255a.p256a;

import java.util.regex.Pattern;

/* renamed from: com.ta.utdid2.a.a.g */
public class C3066g {

    /* renamed from: a */
    public static final Pattern f6765a = Pattern.compile("([\t\r\n])+");

    /* renamed from: a */
    public static boolean m7133a(String str) {
        return str == null || str.length() <= 0;
    }

    /* renamed from: a */
    public static int m7132a(String str) {
        char[] charArray;
        if (str.length() <= 0) {
            return 0;
        }
        int i = 0;
        for (char c : str.toCharArray()) {
            i = (i * 31) + c;
        }
        return i;
    }
}
