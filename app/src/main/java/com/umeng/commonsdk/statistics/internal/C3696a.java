package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.commonsdk.statistics.internal.a */
public class C3696a {

    /* renamed from: a */
    public static Context f9686a;

    /* renamed from: b */
    public String f9687b;

    /* renamed from: c */
    public String f9688c;

    /* renamed from: com.umeng.commonsdk.statistics.internal.a$a */
    public static class C3698a {

        /* renamed from: a */
        public static final C3696a f9689a = new C3696a();
    }

    /* renamed from: a */
    public static C3696a m9958a(Context context) {
        if (f9686a == null && context != null) {
            f9686a = context.getApplicationContext();
        }
        return C3698a.f9689a;
    }

    /* renamed from: d */
    private void m9959d(String str) {
        try {
            String replaceAll = str.replaceAll("&=", " ").replaceAll("&&", " ").replaceAll("==", C8932ooOOO0o.OooO0OO);
            this.f9687b = replaceAll + C8932ooOOO0o.OooO0OO + "Android" + C8932ooOOO0o.OooO0OO + Build.DISPLAY + C8932ooOOO0o.OooO0OO + Build.MODEL + C8932ooOOO0o.OooO0OO + Build.VERSION.RELEASE + " " + HelperUtils.getUmengMD5(UMUtils.getAppkey(f9686a));
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f9686a, th);
        }
    }

    /* renamed from: e */
    private void m9960e(String str) {
        try {
            String str2 = str.split("&&")[0];
            if (!TextUtils.isEmpty(str2)) {
                String[] split = str2.split("&=");
                StringBuilder sb = new StringBuilder();
                sb.append(C3617o.f9342aB);
                for (String str3 : split) {
                    if (!TextUtils.isEmpty(str3)) {
                        String substring = str3.substring(0, 2);
                        if (substring.endsWith(C8932ooOOO0o.OooO0Oo)) {
                            substring = substring.replace(C8932ooOOO0o.OooO0Oo, "");
                        }
                        sb.append(substring);
                    }
                }
                this.f9688c = sb.toString();
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f9686a, th);
        }
    }

    /* renamed from: b */
    public boolean mo39278b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith("t");
        }
        return false;
    }

    /* renamed from: c */
    public void mo39279c(String str) {
        String substring = str.substring(0, str.indexOf(95));
        m9960e(substring);
        m9959d(substring);
    }

    public C3696a() {
        this.f9687b = null;
        this.f9688c = null;
    }

    /* renamed from: b */
    public String mo39277b() {
        return this.f9687b;
    }

    /* renamed from: a */
    public boolean mo39276a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith("a");
        }
        return false;
    }

    /* renamed from: a */
    public String mo39275a() {
        return this.f9688c;
    }
}
