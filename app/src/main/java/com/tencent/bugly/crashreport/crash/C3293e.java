package com.tencent.bugly.crashreport.crash;

import android.content.Context;
import android.os.Process;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.common.info.C3270b;
import com.tencent.bugly.crashreport.common.strategy.C3272a;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3322ao;
import com.tencent.bugly.proguard.C3325ap;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.Thread;
import java.util.HashMap;

/* renamed from: com.tencent.bugly.crashreport.crash.e */
public class C3293e implements Thread.UncaughtExceptionHandler {

    /* renamed from: h */
    public static String f7888h;

    /* renamed from: i */
    public static final Object f7889i = new Object();

    /* renamed from: a */
    public final Context f7890a;

    /* renamed from: b */
    public final C3285b f7891b;

    /* renamed from: c */
    public final C3272a f7892c;

    /* renamed from: d */
    public final C3269a f7893d;

    /* renamed from: e */
    public Thread.UncaughtExceptionHandler f7894e;

    /* renamed from: f */
    public Thread.UncaughtExceptionHandler f7895f;

    /* renamed from: g */
    public boolean f7896g = false;

    /* renamed from: j */
    public int f7897j;

    public C3293e(Context context, C3285b bVar, C3272a aVar, C3269a aVar2) {
        this.f7890a = context;
        this.f7891b = bVar;
        this.f7892c = aVar;
        this.f7893d = aVar2;
    }

    /* renamed from: a */
    public synchronized void mo38276a() {
        if (this.f7897j >= 10) {
            C3321an.m8349a("java crash handler over %d, no need set.", 10);
            return;
        }
        this.f7896g = true;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            if (!getClass().getName().equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                if ("com.android.internal.os.RuntimeInit$UncaughtHandler".equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                    C3321an.m8349a("backup system java handler: %s", defaultUncaughtExceptionHandler.toString());
                    this.f7895f = defaultUncaughtExceptionHandler;
                    this.f7894e = defaultUncaughtExceptionHandler;
                } else {
                    C3321an.m8349a("backup java handler: %s", defaultUncaughtExceptionHandler.toString());
                    this.f7894e = defaultUncaughtExceptionHandler;
                }
            } else {
                return;
            }
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.f7897j++;
        C3321an.m8349a("registered java monitor: %s", toString());
    }

    /* renamed from: b */
    public synchronized void mo38279b() {
        this.f7896g = false;
        C3321an.m8349a("close java monitor!", new Object[0]);
        if (Thread.getDefaultUncaughtExceptionHandler().getClass().getName().contains("bugly")) {
            C3321an.m8349a("Java monitor to unregister: %s", toString());
            Thread.setDefaultUncaughtExceptionHandler(this.f7894e);
            this.f7897j--;
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        synchronized (f7889i) {
            mo38280b(thread, th, true, null, null);
        }
    }

    /* renamed from: b */
    public void mo38280b(Thread thread, Throwable th, boolean z, String str, byte[] bArr) {
        String str2;
        if (z) {
            C3321an.m8357e("Java Crash Happen cause by %s(%d)", thread.getName(), Long.valueOf(thread.getId()));
            if (m8177a(thread)) {
                C3321an.m8349a("this class has handled this exception", new Object[0]);
                if (this.f7895f != null) {
                    C3321an.m8349a("call system handler", new Object[0]);
                    this.f7895f.uncaughtException(thread, th);
                } else {
                    mo38278a(thread, th);
                }
            }
        } else {
            C3321an.m8357e("Java Catch Happen", new Object[0]);
        }
        try {
            if (!this.f7896g) {
                C3321an.m8355c("Java crash handler is disable. Just return.", new Object[0]);
                if (z) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f7894e;
                    if (uncaughtExceptionHandler != null && m8176a(uncaughtExceptionHandler)) {
                        C3321an.m8357e("sys default last handle start!", new Object[0]);
                        this.f7894e.uncaughtException(thread, th);
                        C3321an.m8357e("sys default last handle end!", new Object[0]);
                    } else if (this.f7895f != null) {
                        C3321an.m8357e("system handle start!", new Object[0]);
                        this.f7895f.uncaughtException(thread, th);
                        C3321an.m8357e("system handle end!", new Object[0]);
                    } else {
                        C3321an.m8357e("crashreport last handle start!", new Object[0]);
                        mo38278a(thread, th);
                        C3321an.m8357e("crashreport last handle end!", new Object[0]);
                    }
                }
            } else {
                if (!this.f7892c.mo38193b()) {
                    C3321an.m8356d("no remote but still store!", new Object[0]);
                }
                String str3 = "JAVA_CRASH";
                if (this.f7892c.mo38194c().f7714g || !this.f7892c.mo38193b()) {
                    CrashDetailBean a = mo38275a(thread, th, z, str, bArr);
                    if (a == null) {
                        C3321an.m8357e("pkg crash datas fail!", new Object[0]);
                        if (z) {
                            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f7894e;
                            if (uncaughtExceptionHandler2 != null && m8176a(uncaughtExceptionHandler2)) {
                                C3321an.m8357e("sys default last handle start!", new Object[0]);
                                this.f7894e.uncaughtException(thread, th);
                                C3321an.m8357e("sys default last handle end!", new Object[0]);
                            } else if (this.f7895f != null) {
                                C3321an.m8357e("system handle start!", new Object[0]);
                                this.f7895f.uncaughtException(thread, th);
                                C3321an.m8357e("system handle end!", new Object[0]);
                            } else {
                                C3321an.m8357e("crashreport last handle start!", new Object[0]);
                                mo38278a(thread, th);
                                C3321an.m8357e("crashreport last handle end!", new Object[0]);
                            }
                        }
                    } else {
                        if (!z) {
                            str3 = "JAVA_CATCH";
                        }
                        C3285b.m8123a(str3, C3325ap.m8386a(), this.f7893d.f7681e, thread.getName(), C3325ap.m8391a(th), a);
                        if (!this.f7891b.mo38242a(a)) {
                            this.f7891b.mo38239a(a, 3000, z);
                        }
                        if (z) {
                            this.f7891b.mo38247b(a);
                        }
                        if (z) {
                            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f7894e;
                            if (uncaughtExceptionHandler3 != null && m8176a(uncaughtExceptionHandler3)) {
                                C3321an.m8357e("sys default last handle start!", new Object[0]);
                                this.f7894e.uncaughtException(thread, th);
                                C3321an.m8357e("sys default last handle end!", new Object[0]);
                            } else if (this.f7895f != null) {
                                C3321an.m8357e("system handle start!", new Object[0]);
                                this.f7895f.uncaughtException(thread, th);
                                C3321an.m8357e("system handle end!", new Object[0]);
                            } else {
                                C3321an.m8357e("crashreport last handle start!", new Object[0]);
                                mo38278a(thread, th);
                                C3321an.m8357e("crashreport last handle end!", new Object[0]);
                            }
                        }
                    }
                } else {
                    C3321an.m8357e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                    if (z) {
                        str2 = str3;
                    } else {
                        str2 = "JAVA_CATCH";
                    }
                    C3285b.m8123a(str2, C3325ap.m8386a(), this.f7893d.f7681e, thread.getName(), C3325ap.m8391a(th), null);
                    if (z) {
                        Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = this.f7894e;
                        if (uncaughtExceptionHandler4 != null && m8176a(uncaughtExceptionHandler4)) {
                            C3321an.m8357e("sys default last handle start!", new Object[0]);
                            this.f7894e.uncaughtException(thread, th);
                            C3321an.m8357e("sys default last handle end!", new Object[0]);
                        } else if (this.f7895f != null) {
                            C3321an.m8357e("system handle start!", new Object[0]);
                            this.f7895f.uncaughtException(thread, th);
                            C3321an.m8357e("system handle end!", new Object[0]);
                        } else {
                            C3321an.m8357e("crashreport last handle start!", new Object[0]);
                            mo38278a(thread, th);
                            C3321an.m8357e("crashreport last handle end!", new Object[0]);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            if (z) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = this.f7894e;
                if (uncaughtExceptionHandler5 != null && m8176a(uncaughtExceptionHandler5)) {
                    C3321an.m8357e("sys default last handle start!", new Object[0]);
                    this.f7894e.uncaughtException(thread, th);
                    C3321an.m8357e("sys default last handle end!", new Object[0]);
                } else if (this.f7895f != null) {
                    C3321an.m8357e("system handle start!", new Object[0]);
                    this.f7895f.uncaughtException(thread, th);
                    C3321an.m8357e("system handle end!", new Object[0]);
                } else {
                    C3321an.m8357e("crashreport last handle start!", new Object[0]);
                    mo38278a(thread, th);
                    C3321an.m8357e("crashreport last handle end!", new Object[0]);
                }
            }
            throw th2;
        }
    }

    /* renamed from: a */
    public void mo38278a(Thread thread, Throwable th) {
        C3321an.m8357e("current process die", new Object[0]);
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    /* renamed from: a */
    public CrashDetailBean mo38275a(Thread thread, Throwable th, boolean z, String str, byte[] bArr) {
        int i;
        String str2;
        String str3;
        boolean z2 = false;
        if (th == null) {
            C3321an.m8356d("We can do nothing with a null throwable.", new Object[0]);
            return null;
        }
        boolean l = C3287c.m8145a().mo38268l();
        String str4 = (!l || !z) ? "" : " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]";
        if (l && z) {
            C3321an.m8357e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f7752C = C3270b.m8045i();
        crashDetailBean.f7753D = C3270b.m8041g();
        crashDetailBean.f7754E = C3270b.m8049k();
        crashDetailBean.f7755F = this.f7893d.mo38173p();
        crashDetailBean.f7756G = this.f7893d.mo38172o();
        crashDetailBean.f7757H = this.f7893d.mo38174q();
        crashDetailBean.f7795w = C3325ap.m8388a(this.f7890a, C3287c.f7846e, C3287c.f7849h);
        byte[] a = C3322ao.m8366a();
        crashDetailBean.f7797y = a;
        Object[] objArr = new Object[1];
        if (a == null) {
            i = 0;
        } else {
            i = a.length;
        }
        objArr[0] = Integer.valueOf(i);
        C3321an.m8349a("user log size:%d", objArr);
        crashDetailBean.f7774b = z ? 0 : 2;
        crashDetailBean.f7777e = this.f7893d.mo38165h();
        C3269a aVar = this.f7893d;
        crashDetailBean.f7778f = aVar.f7692p;
        crashDetailBean.f7779g = aVar.mo38180w();
        crashDetailBean.f7785m = this.f7893d.mo38163g();
        String name = th.getClass().getName();
        String b = m8178b(th, 1000);
        if (b == null) {
            b = "";
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = Integer.valueOf(th.getStackTrace().length);
        objArr2[1] = Boolean.valueOf(th.getCause() != null);
        C3321an.m8357e("stack frame :%d, has cause %b", objArr2);
        if (th.getStackTrace().length > 0) {
            str2 = th.getStackTrace()[0].toString();
        } else {
            str2 = "";
        }
        Throwable th2 = th;
        while (th2 != null && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        if (th2 == null || th2 == th) {
            crashDetailBean.f7786n = name;
            String str5 = b + "" + str4;
            crashDetailBean.f7787o = str5;
            if (str5 == null) {
                crashDetailBean.f7787o = "";
            }
            crashDetailBean.f7788p = str2;
            str3 = m8175a(th, C3287c.f7847f);
            crashDetailBean.f7789q = str3;
        } else {
            crashDetailBean.f7786n = th2.getClass().getName();
            String b2 = m8178b(th2, 1000);
            crashDetailBean.f7787o = b2;
            if (b2 == null) {
                crashDetailBean.f7787o = "";
            }
            if (th2.getStackTrace().length > 0) {
                crashDetailBean.f7788p = th2.getStackTrace()[0].toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(b);
            sb.append("\n");
            sb.append(str2);
            sb.append("\n......");
            sb.append("\nCaused by:\n");
            sb.append(crashDetailBean.f7786n);
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(crashDetailBean.f7787o);
            sb.append("\n");
            str3 = m8175a(th2, C3287c.f7847f);
            sb.append(str3);
            crashDetailBean.f7789q = sb.toString();
        }
        crashDetailBean.f7790r = System.currentTimeMillis();
        crashDetailBean.f7793u = C3325ap.m8415b(crashDetailBean.f7789q.getBytes());
        try {
            crashDetailBean.f7798z = C3325ap.m8396a(C3287c.f7847f, false);
            crashDetailBean.f7750A = this.f7893d.f7681e;
            String str6 = thread.getName() + C3848l.f10401s + thread.getId() + C3848l.f10402t;
            crashDetailBean.f7751B = str6;
            crashDetailBean.f7798z.put(str6, str3);
            crashDetailBean.f7758I = this.f7893d.mo38182y();
            crashDetailBean.f7780h = this.f7893d.mo38179v();
            crashDetailBean.f7781i = this.f7893d.mo38134J();
            crashDetailBean.f7763N = this.f7893d.f7646a;
            crashDetailBean.f7764O = this.f7893d.mo38149a();
            crashDetailBean.f7766Q = this.f7893d.mo38132H();
            crashDetailBean.f7767R = this.f7893d.mo38133I();
            crashDetailBean.f7768S = this.f7893d.mo38126B();
            crashDetailBean.f7769T = this.f7893d.mo38131G();
        } catch (Throwable th3) {
            C3321an.m8357e("handle crash error %s", th3.toString());
        }
        if (z) {
            this.f7891b.mo38248c(crashDetailBean);
        } else {
            boolean z3 = str != null && str.length() > 0;
            if (bArr != null && bArr.length > 0) {
                z2 = true;
            }
            if (z3) {
                HashMap hashMap = new HashMap(1);
                crashDetailBean.f7765P = hashMap;
                hashMap.put("UserData", str);
            }
            if (z2) {
                crashDetailBean.f7770U = bArr;
            }
        }
        return crashDetailBean;
    }

    /* renamed from: a */
    private boolean m8177a(Thread thread) {
        synchronized (f7889i) {
            if (f7888h != null) {
                if (thread.getName().equals(f7888h)) {
                    return true;
                }
            }
            f7888h = thread.getName();
            return false;
        }
    }

    /* renamed from: a */
    private boolean m8176a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            return true;
        }
        String name = uncaughtExceptionHandler.getClass().getName();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (name.equals(className) && "uncaughtException".equals(methodName)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m8178b(Throwable th, int i) {
        if (th.getMessage() == null) {
            return "";
        }
        if (i < 0 || th.getMessage().length() <= i) {
            return th.getMessage();
        }
        return th.getMessage().substring(0, i) + "\n[Message over limit size:" + i + ", has been cutted!]";
    }

    /* renamed from: a */
    public synchronized void mo38277a(StrategyBean strategyBean) {
        if (strategyBean != null) {
            if (strategyBean.f7714g != this.f7896g) {
                C3321an.m8349a("java changed to %b", Boolean.valueOf(strategyBean.f7714g));
                if (strategyBean.f7714g) {
                    mo38276a();
                } else {
                    mo38279b();
                }
            }
        }
    }

    /* renamed from: a */
    public static String m8175a(Throwable th, int i) {
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (th.getStackTrace() != null) {
                StackTraceElement[] stackTrace = th.getStackTrace();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (i <= 0 || sb.length() < i) {
                        sb.append(stackTraceElement.toString());
                        sb.append("\n");
                    } else {
                        sb.append("\n[Stack over limit size :" + i + " , has been cutted !]");
                        return sb.toString();
                    }
                }
            }
        } catch (Throwable th2) {
            C3321an.m8357e("gen stack error %s", th2.toString());
        }
        return sb.toString();
    }
}
