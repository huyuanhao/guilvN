package com.tencent.bugly.crashreport.crash;

import android.content.Context;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import com.tencent.bugly.crashreport.common.info.AppInfo;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.common.strategy.C3272a;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.anr.C3282b;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.proguard.C3307ae;
import com.tencent.bugly.proguard.C3310ag;
import com.tencent.bugly.proguard.C3314ak;
import com.tencent.bugly.proguard.C3319am;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tencent.bugly.crashreport.crash.c */
public class C3287c {

    /* renamed from: a */
    public static int f7842a = 0;

    /* renamed from: b */
    public static boolean f7843b = false;

    /* renamed from: c */
    public static int f7844c = 2;

    /* renamed from: d */
    public static boolean f7845d = true;

    /* renamed from: e */
    public static int f7846e = 20480;

    /* renamed from: f */
    public static int f7847f = 20480;

    /* renamed from: g */
    public static long f7848g = 604800000;

    /* renamed from: h */
    public static String f7849h = null;

    /* renamed from: i */
    public static boolean f7850i = false;

    /* renamed from: j */
    public static String f7851j = null;

    /* renamed from: k */
    public static int f7852k = 5000;

    /* renamed from: l */
    public static boolean f7853l = true;

    /* renamed from: m */
    public static boolean f7854m;

    /* renamed from: n */
    public static String f7855n;

    /* renamed from: o */
    public static String f7856o;

    /* renamed from: v */
    public static C3287c f7857v;

    /* renamed from: p */
    public final C3285b f7858p;

    /* renamed from: q */
    public final C3272a f7859q = C3272a.m8069a();

    /* renamed from: r */
    public final C3319am f7860r;

    /* renamed from: s */
    public BuglyStrategy.C3214a f7861s;

    /* renamed from: t */
    public AbstractC3294f f7862t;

    /* renamed from: u */
    public final Context f7863u;

    /* renamed from: w */
    public final C3293e f7864w;

    /* renamed from: x */
    public final NativeCrashHandler f7865x;

    /* renamed from: y */
    public final C3282b f7866y;

    /* renamed from: z */
    public Boolean f7867z;

    public C3287c(int i, Context context, C3319am amVar, boolean z, BuglyStrategy.C3214a aVar, AbstractC3294f fVar, String str) {
        f7842a = i;
        Context a = C3325ap.m8380a(context);
        this.f7863u = a;
        this.f7860r = amVar;
        this.f7861s = aVar;
        this.f7862t = fVar;
        C3314ak a2 = C3314ak.m8297a();
        C3307ae a3 = C3307ae.m8249a();
        this.f7858p = new C3285b(i, a, a2, a3, this.f7859q, aVar, fVar);
        C3269a a4 = C3269a.m7965a(a);
        this.f7864w = new C3293e(a, this.f7858p, this.f7859q, a4);
        NativeCrashHandler instance = NativeCrashHandler.getInstance(a, a4, this.f7858p, this.f7859q, amVar, z, str);
        this.f7865x = instance;
        a4.f7632M = instance;
        this.f7866y = new C3282b(a, this.f7859q, a4, amVar, a3, this.f7858p, aVar);
    }

    /* renamed from: c */
    public synchronized void mo38259c() {
        mo38262f();
        mo38264h();
        mo38265i();
    }

    /* renamed from: d */
    public synchronized void mo38260d() {
        mo38261e();
        mo38263g();
        mo38266j();
    }

    /* renamed from: e */
    public void mo38261e() {
        this.f7864w.mo38279b();
    }

    /* renamed from: f */
    public void mo38262f() {
        this.f7864w.mo38276a();
    }

    /* renamed from: g */
    public void mo38263g() {
        this.f7865x.setUserOpened(false);
    }

    /* renamed from: h */
    public void mo38264h() {
        this.f7865x.setUserOpened(true);
    }

    /* renamed from: i */
    public void mo38265i() {
        this.f7866y.mo38227b(true);
    }

    /* renamed from: j */
    public void mo38266j() {
        this.f7866y.mo38227b(false);
    }

    /* renamed from: k */
    public synchronized void mo38267k() {
        this.f7866y.mo38232g();
    }

    /* renamed from: l */
    public boolean mo38268l() {
        return this.f7866y.mo38223a();
    }

    /* renamed from: m */
    public void mo38269m() {
        this.f7865x.checkUploadRecordCrash();
    }

    /* renamed from: n */
    public void mo38270n() {
        if (C3269a.m7966b().f7681e.equals(AppInfo.m7950a(this.f7863u))) {
            this.f7865x.removeEmptyNativeRecordFiles();
        }
    }

    /* renamed from: a */
    public static synchronized C3287c m8146a(int i, Context context, boolean z, BuglyStrategy.C3214a aVar, AbstractC3294f fVar, String str) {
        C3287c cVar;
        synchronized (C3287c.class) {
            if (f7857v == null) {
                f7857v = new C3287c(i, context, C3319am.m8340a(), z, aVar, fVar, str);
            }
            cVar = f7857v;
        }
        return cVar;
    }

    /* renamed from: b */
    public boolean mo38258b() {
        Boolean bool = this.f7867z;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = C3269a.m7966b().f7681e;
        List<C3310ag> a = C3307ae.m8249a().mo38344a(1);
        ArrayList arrayList = new ArrayList();
        if (a == null || a.size() <= 0) {
            this.f7867z = false;
            return false;
        }
        for (C3310ag agVar : a) {
            if (str.equals(agVar.f7987c)) {
                this.f7867z = true;
                arrayList.add(agVar);
            }
        }
        if (arrayList.size() > 0) {
            C3307ae.m8249a().mo38346a(arrayList);
        }
        return true;
    }

    /* renamed from: a */
    public static synchronized C3287c m8145a() {
        C3287c cVar;
        synchronized (C3287c.class) {
            cVar = f7857v;
        }
        return cVar;
    }

    /* renamed from: a */
    public void mo38254a(StrategyBean strategyBean) {
        this.f7864w.mo38277a(strategyBean);
        this.f7865x.onStrategyChanged(strategyBean);
        this.f7866y.mo38220a(strategyBean);
        mo38253a(3000);
    }

    /* renamed from: a */
    public synchronized void mo38257a(boolean z, boolean z2, boolean z3) {
        this.f7865x.testNativeCrash(z, z2, z3);
    }

    /* renamed from: a */
    public void mo38256a(final Thread thread, final Throwable th, final boolean z, final String str, final byte[] bArr, final boolean z2) {
        this.f7860r.mo38398a(new Runnable() {
            /* class com.tencent.bugly.crashreport.crash.C3287c.RunnableC32881 */

            public void run() {
                try {
                    C3321an.m8355c("post a throwable %b", Boolean.valueOf(z));
                    C3287c.this.f7864w.mo38280b(thread, th, false, str, bArr);
                    if (z2) {
                        C3321an.m8349a("clear user datas", new Object[0]);
                        C3269a.m7965a(C3287c.this.f7863u).mo38127C();
                    }
                } catch (Throwable th) {
                    if (!C3321an.m8353b(th)) {
                        th.printStackTrace();
                    }
                    C3321an.m8357e("java catch error: %s", th.toString());
                }
            }
        });
    }

    /* renamed from: a */
    public void mo38255a(CrashDetailBean crashDetailBean) {
        this.f7858p.mo38252e(crashDetailBean);
    }

    /* renamed from: a */
    public void mo38253a(long j) {
        C3319am.m8340a().mo38399a(new Thread() {
            /* class com.tencent.bugly.crashreport.crash.C3287c.C32892 */

            public void run() {
                ArrayList arrayList;
                if (C3325ap.m8401a(C3287c.this.f7863u, "local_crash_lock", (long) TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE)) {
                    List<CrashDetailBean> a = C3287c.this.f7858p.mo38237a();
                    if (a != null && a.size() > 0) {
                        C3321an.m8355c("Size of crash list: %s", Integer.valueOf(a.size()));
                        int size = a.size();
                        if (((long) size) > 100) {
                            ArrayList arrayList2 = new ArrayList();
                            Collections.sort(a);
                            for (int i = 0; ((long) i) < 100; i++) {
                                arrayList2.add(a.get((size - 1) - i));
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = a;
                        }
                        C3287c.this.f7858p.mo38240a(arrayList, 0, false, false, false);
                    }
                    C3325ap.m8428c(C3287c.this.f7863u, "local_crash_lock");
                }
            }
        }, j);
    }
}
