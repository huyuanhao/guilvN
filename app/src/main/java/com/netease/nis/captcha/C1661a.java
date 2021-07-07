package com.netease.nis.captcha;

import android.content.Context;
import java.io.File;

/* renamed from: com.netease.nis.captcha.a */
public class C1661a {

    /* renamed from: a */
    public static C1661a f3009a;

    /* renamed from: b */
    public Context f3010b;

    /* renamed from: c */
    public final String f3011c;

    /* renamed from: d */
    public final String f3012d = "mobile.v2.13.5.html";

    /* renamed from: e */
    public final String f3013e;

    public C1661a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f3010b = applicationContext;
        this.f3011c = applicationContext.getFilesDir().getAbsolutePath();
        this.f3013e = this.f3011c + File.separator + "captcha.html";
    }

    /* renamed from: a */
    public static C1661a m2899a(Context context) {
        if (f3009a == null) {
            synchronized (C1661a.class) {
                if (f3009a == null) {
                    f3009a = new C1661a(context);
                }
            }
        }
        return f3009a;
    }

    /* renamed from: a */
    public String mo17661a() {
        return "mobile.v2.13.5.html";
    }
}
