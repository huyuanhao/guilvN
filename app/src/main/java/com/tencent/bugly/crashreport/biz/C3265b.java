package com.tencent.bugly.crashreport.biz;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.bumptech.glide.load.engine.GlideException;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.common.strategy.C3272a;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.C3319am;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;
import java.util.List;

/* renamed from: com.tencent.bugly.crashreport.biz.b */
public class C3265b {

    /* renamed from: a */
    public static boolean f7598a = false;

    /* renamed from: b */
    public static C3259a f7599b = null;

    /* renamed from: c */
    public static int f7600c = 10;

    /* renamed from: d */
    public static long f7601d = 300000;

    /* renamed from: e */
    public static long f7602e = 30000;

    /* renamed from: f */
    public static long f7603f = 0;

    /* renamed from: g */
    public static int f7604g = 0;

    /* renamed from: h */
    public static long f7605h = 0;

    /* renamed from: i */
    public static long f7606i = 0;

    /* renamed from: j */
    public static long f7607j = 0;

    /* renamed from: k */
    public static Application.ActivityLifecycleCallbacks f7608k = null;

    /* renamed from: l */
    public static Class<?> f7609l = null;

    /* renamed from: m */
    public static boolean f7610m = true;

    /* renamed from: g */
    public static /* synthetic */ int m7942g() {
        int i = f7604g;
        f7604g = i + 1;
        return i;
    }

    /* renamed from: m */
    public static void m7948m() {
        C3269a b = C3269a.m7966b();
        if (b != null) {
            String str = null;
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement.getMethodName().equals("onCreate")) {
                    str = stackTraceElement.getClassName();
                }
                if (stackTraceElement.getClassName().equals("android.app.Activity")) {
                    z = true;
                }
            }
            if (str == null) {
                str = "unknown";
            } else if (z) {
                b.mo38148a(true);
            } else {
                str = "background";
            }
            b.f7698v = str;
        }
    }

    /* renamed from: n */
    public static void m7949n() {
        f7606i = System.currentTimeMillis();
        f7599b.mo38101a(1, false, 0L);
        C3321an.m8349a("[session] launch app, new start", new Object[0]);
    }

    /* renamed from: a */
    public static void m7927a(final Context context, final BuglyStrategy buglyStrategy) {
        long j;
        if (!f7598a) {
            boolean z = C3269a.m7965a(context).f7684h;
            f7610m = z;
            f7599b = new C3259a(context, z);
            f7598a = true;
            if (buglyStrategy != null) {
                f7609l = buglyStrategy.getUserInfoActivity();
                j = buglyStrategy.getAppReportDelay();
            } else {
                j = 0;
            }
            if (j <= 0) {
                m7937c(context, buglyStrategy);
            } else {
                C3319am.m8340a().mo38399a(new Runnable() {
                    /* class com.tencent.bugly.crashreport.biz.C3265b.RunnableC32661 */

                    public void run() {
                        C3265b.m7937c(context, buglyStrategy);
                    }
                }, j);
            }
        }
    }

    @TargetApi(14)
    /* renamed from: d */
    public static void m7939d(Context context) {
        if (Build.VERSION.SDK_INT >= 14) {
            Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
            if (application != null) {
                try {
                    if (f7608k != null) {
                        application.unregisterActivityLifecycleCallbacks(f7608k);
                    }
                } catch (Exception e) {
                    if (!C3321an.m8350a(e)) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static void m7937c(Context context, BuglyStrategy buglyStrategy) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (buglyStrategy != null) {
            z2 = buglyStrategy.recordUserInfoOnceADay();
            z = buglyStrategy.isEnableUserInfo();
        } else {
            z = true;
            z2 = false;
        }
        if (!z2) {
            z3 = z;
        } else if (!m7933b(context)) {
            return;
        }
        m7948m();
        if (z3) {
            m7936c(context);
        }
        if (f7610m) {
            m7949n();
            f7599b.mo38100a();
            f7599b.mo38105b(21600000);
        }
    }

    /* renamed from: b */
    public static boolean m7933b(Context context) {
        C3269a a = C3269a.m7965a(context);
        List<UserInfoBean> a2 = f7599b.mo38099a(a.f7681e);
        if (a2 == null) {
            return true;
        }
        for (int i = 0; i < a2.size(); i++) {
            UserInfoBean userInfoBean = a2.get(i);
            if (userInfoBean.f7579n.equals(a.f7692p) && userInfoBean.f7567b == 1) {
                long b = C3325ap.m8412b();
                if (b <= 0) {
                    return true;
                }
                if (userInfoBean.f7570e >= b) {
                    if (userInfoBean.f7571f <= 0) {
                        f7599b.mo38104b();
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m7925a(long j) {
        if (j < 0) {
            j = C3272a.m8069a().mo38194c().f7724q;
        }
        f7603f = j;
    }

    /* renamed from: a */
    public static void m7928a(StrategyBean strategyBean, boolean z) {
        C3259a aVar = f7599b;
        if (aVar != null && !z) {
            aVar.mo38104b();
        }
        if (strategyBean != null) {
            long j = strategyBean.f7724q;
            if (j > 0) {
                f7602e = j;
            }
            int i = strategyBean.f7730w;
            if (i > 0) {
                f7600c = i;
            }
            long j2 = strategyBean.f7731x;
            if (j2 > 0) {
                f7601d = j2;
            }
        }
    }

    @TargetApi(14)
    /* renamed from: c */
    public static void m7936c(Context context) {
        if (Build.VERSION.SDK_INT >= 14) {
            Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
            if (application != null) {
                try {
                    if (f7608k == null) {
                        f7608k = new Application.ActivityLifecycleCallbacks() {
                            /* class com.tencent.bugly.crashreport.biz.C3265b.C32672 */

                            public void onActivityCreated(Activity activity, Bundle bundle) {
                                String name = activity != null ? activity.getClass().getName() : "unknown";
                                if (C3265b.f7609l == null || C3265b.f7609l.getName().equals(name)) {
                                    C3321an.m8355c(">>> %s onCreated <<<", name);
                                    C3269a b = C3269a.m7966b();
                                    if (b != null) {
                                        b.f7630K.add(C3265b.m7931b(name, "onCreated"));
                                    }
                                }
                            }

                            public void onActivityDestroyed(Activity activity) {
                                String name = activity != null ? activity.getClass().getName() : "unknown";
                                if (C3265b.f7609l == null || C3265b.f7609l.getName().equals(name)) {
                                    C3321an.m8355c(">>> %s onDestroyed <<<", name);
                                    C3269a b = C3269a.m7966b();
                                    if (b != null) {
                                        b.f7630K.add(C3265b.m7931b(name, "onDestroyed"));
                                    }
                                }
                            }

                            public void onActivityPaused(Activity activity) {
                                String name = activity != null ? activity.getClass().getName() : "unknown";
                                if (C3265b.f7609l == null || C3265b.f7609l.getName().equals(name)) {
                                    C3321an.m8355c(">>> %s onPaused <<<", name);
                                    C3269a b = C3269a.m7966b();
                                    if (b != null) {
                                        b.f7630K.add(C3265b.m7931b(name, "onPaused"));
                                        b.mo38148a(false);
                                        long currentTimeMillis = System.currentTimeMillis();
                                        b.f7700x = currentTimeMillis;
                                        b.f7701y = currentTimeMillis - b.f7699w;
                                        long unused = C3265b.f7605h = currentTimeMillis;
                                        if (b.f7701y < 0) {
                                            b.f7701y = 0;
                                        }
                                        if (activity != null) {
                                            b.f7698v = "background";
                                        } else {
                                            b.f7698v = "unknown";
                                        }
                                    }
                                }
                            }

                            public void onActivityResumed(Activity activity) {
                                String name = activity != null ? activity.getClass().getName() : "unknown";
                                if (C3265b.f7609l == null || C3265b.f7609l.getName().equals(name)) {
                                    C3321an.m8355c(">>> %s onResumed <<<", name);
                                    C3269a b = C3269a.m7966b();
                                    if (b != null) {
                                        b.f7630K.add(C3265b.m7931b(name, "onResumed"));
                                        b.mo38148a(true);
                                        b.f7698v = name;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        b.f7699w = currentTimeMillis;
                                        b.f7702z = currentTimeMillis - C3265b.f7606i;
                                        long j = b.f7699w - C3265b.f7605h;
                                        if (j > (C3265b.f7603f > 0 ? C3265b.f7603f : C3265b.f7602e)) {
                                            b.mo38157d();
                                            C3265b.m7942g();
                                            C3321an.m8349a("[session] launch app one times (app in background %d seconds and over %d seconds)", Long.valueOf(j / 1000), Long.valueOf(C3265b.f7602e / 1000));
                                            if (C3265b.f7604g % C3265b.f7600c == 0) {
                                                C3265b.f7599b.mo38101a(4, C3265b.f7610m, 0);
                                                return;
                                            }
                                            C3265b.f7599b.mo38101a(4, false, 0L);
                                            long currentTimeMillis2 = System.currentTimeMillis();
                                            if (currentTimeMillis2 - C3265b.f7607j > C3265b.f7601d) {
                                                long unused = C3265b.f7607j = currentTimeMillis2;
                                                C3321an.m8349a("add a timer to upload hot start user info", new Object[0]);
                                                if (C3265b.f7610m) {
                                                    C3265b.f7599b.mo38102a(C3265b.f7601d);
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                            }

                            public void onActivityStarted(Activity activity) {
                            }

                            public void onActivityStopped(Activity activity) {
                            }
                        };
                    }
                    application.registerActivityLifecycleCallbacks(f7608k);
                } catch (Exception e) {
                    if (!C3321an.m8350a(e)) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static String m7931b(String str, String str2) {
        return C3325ap.m8386a() + GlideException.OooO00o.o0ooOoO + str + GlideException.OooO00o.o0ooOoO + str2 + "\n";
    }

    /* renamed from: a */
    public static void m7924a() {
        C3259a aVar = f7599b;
        if (aVar != null) {
            aVar.mo38101a(2, false, 0L);
        }
    }

    /* renamed from: a */
    public static void m7926a(Context context) {
        if (f7598a && context != null) {
            m7939d(context);
            f7598a = false;
        }
    }
}
