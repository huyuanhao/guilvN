package com.p254ta.utdid2.p255a.p256a;

import android.os.Build;

/* renamed from: com.ta.utdid2.a.a.c */
public class C3060c {
    /* renamed from: a */
    public static boolean m7122a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        if (Build.VERSION.CODENAME.length() != 1 || Build.VERSION.CODENAME.charAt(0) < 'Q' || Build.VERSION.CODENAME.charAt(0) > 'Z') {
            return false;
        }
        return true;
    }
}
