package com.tencent.bugly.crashreport.crash;

import android.content.Context;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.common.info.C3270b;
import com.tencent.bugly.crashreport.common.strategy.C3272a;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.C3319am;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3322ao;
import com.tencent.bugly.proguard.C3325ap;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.message.proguard.C3848l;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.crashreport.crash.d */
public class C3290d {

    /* renamed from: a */
    public static C3290d f7876a;

    /* renamed from: b */
    public C3272a f7877b;

    /* renamed from: c */
    public C3269a f7878c;

    /* renamed from: d */
    public C3285b f7879d;

    /* renamed from: e */
    public Context f7880e;

    public C3290d(Context context) {
        C3287c a = C3287c.m8145a();
        if (a != null) {
            this.f7877b = C3272a.m8069a();
            this.f7878c = C3269a.m7965a(context);
            this.f7879d = a.f7858p;
            this.f7880e = context;
            C3319am.m8340a().mo38398a(new Runnable() {
                /* class com.tencent.bugly.crashreport.crash.C3290d.RunnableC32911 */

                public void run() {
                    C3290d.this.m8173b();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m8173b() {
        C3321an.m8355c("[ExtraCrashManager] Trying to notify Bugly agents.", new Object[0]);
        try {
            Class<?> cls = Class.forName("com.tencent.bugly.proguard.o");
            this.f7878c.getClass();
            C3325ap.m8400a(cls, "sdkPackageName", "com.tencent.bugly", (Object) null);
            C3321an.m8355c("[ExtraCrashManager] Bugly game agent has been notified.", new Object[0]);
        } catch (Throwable unused) {
            C3321an.m8349a("[ExtraCrashManager] no game agent", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m8174c(Thread thread, int i, String str, String str2, String str3, Map<String, String> map) {
        String str4;
        Thread currentThread = thread == null ? Thread.currentThread() : thread;
        if (i == 4) {
            str4 = UMConfigure.WRAPER_TYPE_UNITY;
        } else if (i == 5 || i == 6) {
            str4 = "Cocos";
        } else if (i != 8) {
            C3321an.m8356d("[ExtraCrashManager] Unknown extra crash type: %d", Integer.valueOf(i));
            return;
        } else {
            str4 = "H5";
        }
        C3321an.m8357e("[ExtraCrashManager] %s Crash Happen", str4);
        try {
            if (!this.f7877b.mo38193b()) {
                C3321an.m8356d("[ExtraCrashManager] There is no remote strategy, but still store it.", new Object[0]);
            }
            StrategyBean c = this.f7877b.mo38194c();
            if (c.f7714g || !this.f7877b.mo38193b()) {
                if (i == 5 || i == 6) {
                    if (!c.f7719l) {
                        C3321an.m8357e("[ExtraCrashManager] %s report is disabled.", str4);
                        C3321an.m8357e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                        return;
                    }
                } else if (i == 8 && !c.f7720m) {
                    C3321an.m8357e("[ExtraCrashManager] %s report is disabled.", str4);
                    C3321an.m8357e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                    return;
                }
                CrashDetailBean b = m8172b(currentThread, i == 8 ? 5 : i, str, str2, str3, map);
                if (b == null) {
                    C3321an.m8357e("[ExtraCrashManager] Failed to package crash data.", new Object[0]);
                    C3321an.m8357e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                    return;
                }
                String a = C3325ap.m8386a();
                String str5 = this.f7878c.f7681e;
                String name = currentThread.getName();
                C3285b.m8123a(str4, a, str5, name, str + "\n" + str2 + "\n" + str3, b);
                if (!this.f7879d.mo38242a(b)) {
                    this.f7879d.mo38239a(b, 3000L, false);
                }
                C3321an.m8357e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            C3321an.m8357e("[ExtraCrashManager] Crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
            String a2 = C3325ap.m8386a();
            String str6 = this.f7878c.f7681e;
            String name2 = currentThread.getName();
            C3285b.m8123a(str4, a2, str6, name2, str + "\n" + str2 + "\n" + str3, null);
            C3321an.m8357e("[ExtraCrashManager] Successfully handled.", new Object[0]);
        } catch (Throwable th) {
            C3321an.m8357e("[ExtraCrashManager] Successfully handled.", new Object[0]);
            throw th;
        }
    }

    /* renamed from: a */
    public static C3290d m8168a(Context context) {
        if (f7876a == null) {
            f7876a = new C3290d(context);
        }
        return f7876a;
    }

    /* renamed from: a */
    public static void m8171a(final Thread thread, final int i, final String str, final String str2, final String str3, final Map<String, String> map) {
        C3319am.m8340a().mo38398a(new Runnable() {
            /* class com.tencent.bugly.crashreport.crash.C3290d.RunnableC32922 */

            public void run() {
                try {
                    if (C3290d.f7876a == null) {
                        C3321an.m8357e("[ExtraCrashManager] Extra crash manager has not been initialized.", new Object[0]);
                    } else {
                        C3290d.f7876a.m8174c(thread, i, str, str2, str3, map);
                    }
                } catch (Throwable th) {
                    if (!C3321an.m8353b(th)) {
                        th.printStackTrace();
                    }
                    C3321an.m8357e("[ExtraCrashManager] Crash error %s %s %s", str, str2, str3);
                }
            }
        });
    }

    /* renamed from: b */
    private CrashDetailBean m8172b(Thread thread, int i, String str, String str2, String str3, Map<String, String> map) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f7752C = C3270b.m8045i();
        crashDetailBean.f7753D = C3270b.m8041g();
        crashDetailBean.f7754E = C3270b.m8049k();
        crashDetailBean.f7755F = this.f7878c.mo38173p();
        crashDetailBean.f7756G = this.f7878c.mo38172o();
        crashDetailBean.f7757H = this.f7878c.mo38174q();
        crashDetailBean.f7795w = C3325ap.m8388a(this.f7880e, C3287c.f7846e, C3287c.f7849h);
        crashDetailBean.f7774b = i;
        crashDetailBean.f7777e = this.f7878c.mo38165h();
        C3269a aVar = this.f7878c;
        crashDetailBean.f7778f = aVar.f7692p;
        crashDetailBean.f7779g = aVar.mo38180w();
        crashDetailBean.f7785m = this.f7878c.mo38163g();
        StringBuilder sb = new StringBuilder();
        String str4 = "";
        sb.append(str4);
        sb.append(str);
        crashDetailBean.f7786n = sb.toString();
        crashDetailBean.f7787o = str4 + str2;
        if (str3 != null) {
            String[] split = str3.split("\n");
            if (split.length > 0) {
                str4 = split[0];
            }
        } else {
            str3 = str4;
        }
        crashDetailBean.f7788p = str4;
        crashDetailBean.f7789q = str3;
        crashDetailBean.f7790r = System.currentTimeMillis();
        crashDetailBean.f7793u = C3325ap.m8415b(crashDetailBean.f7789q.getBytes());
        crashDetailBean.f7798z = C3325ap.m8396a(C3287c.f7847f, false);
        crashDetailBean.f7750A = this.f7878c.f7681e;
        crashDetailBean.f7751B = thread.getName() + C3848l.f10401s + thread.getId() + C3848l.f10402t;
        crashDetailBean.f7758I = this.f7878c.mo38182y();
        crashDetailBean.f7780h = this.f7878c.mo38179v();
        C3269a aVar2 = this.f7878c;
        crashDetailBean.f7763N = aVar2.f7646a;
        crashDetailBean.f7764O = aVar2.mo38149a();
        crashDetailBean.f7766Q = this.f7878c.mo38132H();
        crashDetailBean.f7767R = this.f7878c.mo38133I();
        crashDetailBean.f7768S = this.f7878c.mo38126B();
        crashDetailBean.f7769T = this.f7878c.mo38131G();
        this.f7879d.mo38248c(crashDetailBean);
        crashDetailBean.f7797y = C3322ao.m8366a();
        if (crashDetailBean.f7765P == null) {
            crashDetailBean.f7765P = new LinkedHashMap();
        }
        if (map != null) {
            crashDetailBean.f7765P.putAll(map);
        }
        return crashDetailBean;
    }
}
