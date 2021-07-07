package com.qiyukf.nim.uikit;

import android.content.Context;
import com.qiyukf.nim.uikit.session.AbstractC1963b;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider;

/* renamed from: com.qiyukf.nim.uikit.b */
public final class C1877b {

    /* renamed from: a */
    public static Context f3456a;

    /* renamed from: b */
    public static String f3457b;

    /* renamed from: c */
    public static AbstractC1963b f3458c;

    /* renamed from: a */
    public static Context m3578a() {
        return f3456a;
    }

    /* renamed from: a */
    public static void m3579a(Context context, UserInfoProvider userInfoProvider) {
        f3456a = context.getApplicationContext();
        C2180b.m4479d().userInfoProvider = userInfoProvider;
        C1870a.m3565a(context);
    }

    /* renamed from: a */
    public static void m3580a(String str) {
        f3457b = str;
    }

    /* renamed from: b */
    public static String m3581b() {
        return f3457b;
    }

    /* renamed from: c */
    public static AbstractC1963b m3582c() {
        return f3458c;
    }
}
