package com.tencent.bugly.crashreport.crash.jni;

import android.annotation.SuppressLint;
import android.content.Context;
import com.p118pd.sdk.C8905ooOO0OOO;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import com.tencent.bugly.crashreport.AbstractC3257a;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.common.info.C3270b;
import com.tencent.bugly.crashreport.common.strategy.C3272a;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.C3285b;
import com.tencent.bugly.crashreport.crash.C3287c;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C3319am;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3322ao;
import com.tencent.bugly.proguard.C3325ap;
import java.io.File;

public class NativeCrashHandler implements AbstractC3257a {

    /* renamed from: a */
    public static NativeCrashHandler f7916a = null;

    /* renamed from: l */
    public static boolean f7917l = false;

    /* renamed from: m */
    public static boolean f7918m = false;

    /* renamed from: o */
    public static boolean f7919o = true;

    /* renamed from: b */
    public final Context f7920b;

    /* renamed from: c */
    public final C3269a f7921c;

    /* renamed from: d */
    public final C3319am f7922d;

    /* renamed from: e */
    public NativeExceptionHandler f7923e;

    /* renamed from: f */
    public String f7924f;

    /* renamed from: g */
    public final boolean f7925g;

    /* renamed from: h */
    public boolean f7926h = false;

    /* renamed from: i */
    public boolean f7927i = false;

    /* renamed from: j */
    public boolean f7928j = false;

    /* renamed from: k */
    public boolean f7929k = false;

    /* renamed from: n */
    public C3285b f7930n;

    @SuppressLint({"SdCardPath"})
    public NativeCrashHandler(Context context, C3269a aVar, C3285b bVar, C3272a aVar2, C3319am amVar, boolean z, String str) {
        this.f7920b = C3325ap.m8380a(context);
        try {
            if (C3325ap.m8404a(str)) {
                str = context.getDir("bugly", 0).getAbsolutePath();
            }
        } catch (Throwable unused) {
            str = "/data/data/" + C3269a.m7965a(context).f7680d + "/app_bugly";
        }
        this.f7930n = bVar;
        this.f7924f = str;
        this.f7921c = aVar;
        this.f7922d = amVar;
        this.f7925g = z;
        this.f7923e = new C3298a(context, aVar, bVar, C3272a.m8069a());
    }

    public static synchronized NativeCrashHandler getInstance(Context context, C3269a aVar, C3285b bVar, C3272a aVar2, C3319am amVar, boolean z, String str) {
        NativeCrashHandler nativeCrashHandler;
        synchronized (NativeCrashHandler.class) {
            if (f7916a == null) {
                f7916a = new NativeCrashHandler(context, aVar, bVar, aVar2, amVar, z, str);
            }
            nativeCrashHandler = f7916a;
        }
        return nativeCrashHandler;
    }

    public static boolean isShouldHandleInJava() {
        return f7919o;
    }

    public static void setShouldHandleInJava(boolean z) {
        f7919o = z;
        NativeCrashHandler nativeCrashHandler = f7916a;
        if (nativeCrashHandler != null) {
            nativeCrashHandler.m8199a(999, "" + z);
        }
    }

    @Override // com.tencent.bugly.crashreport.AbstractC3257a
    public boolean appendLogToNative(String str, String str2, String str3) {
        if (!((!this.f7926h && !this.f7927i) || !f7917l || str == null || str2 == null || str3 == null)) {
            try {
                if (this.f7927i) {
                    return appendNativeLog(str, str2, str3);
                }
                Boolean bool = (Boolean) C3325ap.m8384a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "appendNativeLog", null, new Class[]{String.class, String.class, String.class}, new Object[]{str, str2, str3});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
                f7917l = false;
            } catch (Throwable th) {
                if (!C3321an.m8350a(th)) {
                    th.printStackTrace();
                }
                return false;
            }
        }
        return false;
    }

    public native boolean appendNativeLog(String str, String str2, String str3);

    public native boolean appendWholeNativeLog(String str);

    public void checkUploadRecordCrash() {
        this.f7922d.mo38398a(new Runnable() {
            /* class com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.RunnableC32971 */

            public void run() {
                if (!C3325ap.m8401a(NativeCrashHandler.this.f7920b, "native_record_lock", (long) TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE)) {
                    C3321an.m8349a("[Native] Failed to lock file for handling native crash record.", new Object[0]);
                    return;
                }
                if (!NativeCrashHandler.f7919o) {
                    NativeCrashHandler.this.m8199a((NativeCrashHandler) 999, (int) "false");
                }
                CrashDetailBean a = C3299b.m8211a(NativeCrashHandler.this.f7920b, NativeCrashHandler.this.f7924f, NativeCrashHandler.this.f7923e);
                if (a != null) {
                    C3321an.m8349a("[Native] Get crash from native record.", new Object[0]);
                    if (!NativeCrashHandler.this.f7930n.mo38242a(a)) {
                        NativeCrashHandler.this.f7930n.mo38239a(a, 3000L, false);
                    }
                    C3299b.m8217a(false, NativeCrashHandler.this.f7924f);
                }
                NativeCrashHandler.this.mo38294b();
                C3325ap.m8428c(NativeCrashHandler.this.f7920b, "native_record_lock");
            }
        });
    }

    public boolean filterSigabrtSysLog() {
        return m8199a(998, "true");
    }

    public synchronized String getDumpFilePath() {
        return this.f7924f;
    }

    @Override // com.tencent.bugly.crashreport.AbstractC3257a
    public String getLogFromNative() {
        if ((!this.f7926h && !this.f7927i) || !f7917l) {
            return null;
        }
        try {
            if (this.f7927i) {
                return getNativeLog();
            }
            return (String) C3325ap.m8384a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "getNativeLog", null, null, null);
        } catch (UnsatisfiedLinkError unused) {
            f7917l = false;
            return null;
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public NativeExceptionHandler getNativeExceptionHandler() {
        return this.f7923e;
    }

    public native String getNativeKeyValueList();

    public native String getNativeLog();

    public synchronized boolean isUserOpened() {
        return this.f7929k;
    }

    public synchronized void onStrategyChanged(StrategyBean strategyBean) {
        if (strategyBean != null) {
            if (strategyBean.f7714g != this.f7928j) {
                C3321an.m8356d("server native changed to %b", Boolean.valueOf(strategyBean.f7714g));
            }
        }
        boolean z = C3272a.m8069a().mo38194c().f7714g && this.f7929k;
        if (z != this.f7928j) {
            C3321an.m8349a("native changed to %b", Boolean.valueOf(z));
            mo38295b(z);
        }
    }

    public boolean putKeyValueToNative(String str, String str2) {
        if ((this.f7926h || this.f7927i) && f7917l && str != null && str2 != null) {
            try {
                if (this.f7927i) {
                    return putNativeKeyValue(str, str2);
                }
                Boolean bool = (Boolean) C3325ap.m8384a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "putNativeKeyValue", null, new Class[]{String.class, String.class}, new Object[]{str, str2});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
                f7917l = false;
            } catch (Throwable th) {
                if (!C3321an.m8350a(th)) {
                    th.printStackTrace();
                }
                return false;
            }
        }
        return false;
    }

    public native boolean putNativeKeyValue(String str, String str2);

    public native String regist(String str, boolean z, int i);

    public void removeEmptyNativeRecordFiles() {
        C3299b.m8222d(this.f7924f);
    }

    public native String removeNativeKeyValue(String str);

    public synchronized void setDumpFilePath(String str) {
        this.f7924f = str;
    }

    public boolean setNativeAppChannel(String str) {
        return m8199a(12, str);
    }

    public boolean setNativeAppPackage(String str) {
        return m8199a(13, str);
    }

    public boolean setNativeAppVersion(String str) {
        return m8199a(10, str);
    }

    public native void setNativeInfo(int i, String str);

    @Override // com.tencent.bugly.crashreport.AbstractC3257a
    public boolean setNativeIsAppForeground(boolean z) {
        return m8199a(14, z ? "true" : "false");
    }

    public boolean setNativeLaunchTime(long j) {
        try {
            return m8199a(15, String.valueOf(j));
        } catch (NumberFormatException e) {
            if (C3321an.m8350a(e)) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }

    public boolean setNativeUserId(String str) {
        return m8199a(11, str);
    }

    public synchronized void setUserOpened(boolean z) {
        m8204c(z);
        boolean isUserOpened = isUserOpened();
        C3272a a = C3272a.m8069a();
        if (a != null) {
            isUserOpened = isUserOpened && a.mo38194c().f7714g;
        }
        if (isUserOpened != this.f7928j) {
            C3321an.m8349a("native changed to %b", Boolean.valueOf(isUserOpened));
            mo38295b(isUserOpened);
        }
    }

    public synchronized void startNativeMonitor() {
        String str;
        if (!this.f7927i) {
            if (!this.f7926h) {
                String str2 = "Bugly";
                boolean z = !C3325ap.m8404a(this.f7921c.f7695s);
                if (C3287c.f7843b) {
                    if (z) {
                        str = this.f7921c.f7695s;
                    } else {
                        str = str2 + "-rqd";
                    }
                    boolean a = m8201a(str, z);
                    this.f7927i = a;
                    if (!a && !z) {
                        this.f7926h = m8201a("NativeRQD", false);
                    }
                } else {
                    String str3 = this.f7921c.f7695s;
                    if (!z) {
                        this.f7921c.getClass();
                    } else {
                        str2 = str3;
                    }
                    this.f7927i = m8201a(str2, z);
                }
                if (this.f7927i || this.f7926h) {
                    mo38291a(this.f7925g);
                    if (f7917l) {
                        setNativeAppVersion(this.f7921c.f7692p);
                        setNativeAppChannel(this.f7921c.f7694r);
                        setNativeAppPackage(this.f7921c.f7680d);
                        setNativeUserId(this.f7921c.mo38163g());
                        setNativeIsAppForeground(this.f7921c.mo38149a());
                        setNativeLaunchTime(this.f7921c.f7646a);
                    }
                    return;
                }
                return;
            }
        }
        mo38291a(this.f7925g);
    }

    public native void testCrash();

    public void testNativeCrash() {
        if (!this.f7927i) {
            C3321an.m8356d("[Native] Bugly SO file has not been load.", new Object[0]);
        } else {
            testCrash();
        }
    }

    public native String unregist();

    /* renamed from: b */
    public void mo38294b() {
        long b = C3325ap.m8412b() - C3287c.f7848g;
        long b2 = C3325ap.m8412b() + 86400000;
        File file = new File(this.f7924f);
        if (file.exists() && file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    return;
                }
                if (listFiles.length != 0) {
                    int i = 0;
                    int i2 = 0;
                    for (File file2 : listFiles) {
                        long lastModified = file2.lastModified();
                        if (lastModified < b || lastModified >= b2) {
                            C3321an.m8349a("[Native] Delete record file: %s", file2.getAbsolutePath());
                            i++;
                            if (file2.delete()) {
                                i2++;
                            }
                        }
                    }
                    C3321an.m8355c("[Native] Number of record files overdue: %d, has deleted: %d", Integer.valueOf(i), Integer.valueOf(i2));
                }
            } catch (Throwable th) {
                C3321an.m8350a(th);
            }
        }
    }

    /* renamed from: a */
    public static void m8198a(String str) {
        C3321an.m8355c("[Native] Check extra jni for Bugly NDK v%s", str);
        String replace = "2.1.1".replace(C9058ooOoOoOO.OooOO0, "");
        String replace2 = C8905ooOO0OOO.OooO0o0.replace(C9058ooOoOoOO.OooOO0, "");
        String replace3 = str.replace(C9058ooOoOoOO.OooOO0, "");
        if (replace3.length() == 2) {
            replace3 = replace3 + "0";
        } else if (replace3.length() == 1) {
            replace3 = replace3 + "00";
        }
        try {
            if (Integer.parseInt(replace3) >= Integer.parseInt(replace)) {
                f7917l = true;
            }
            if (Integer.parseInt(replace3) >= Integer.parseInt(replace2)) {
                f7918m = true;
            }
        } catch (Throwable unused) {
        }
        if (f7918m) {
            C3321an.m8349a("[Native] Info setting jni can be accessed.", new Object[0]);
        } else {
            C3321an.m8356d("[Native] Info setting jni can not be accessed.", new Object[0]);
        }
        if (f7917l) {
            C3321an.m8349a("[Native] Extra jni can be accessed.", new Object[0]);
        } else {
            C3321an.m8356d("[Native] Extra jni can not be accessed.", new Object[0]);
        }
    }

    /* renamed from: c */
    private synchronized void m8204c(boolean z) {
        if (this.f7929k != z) {
            C3321an.m8349a("user change native %b", Boolean.valueOf(z));
            this.f7929k = z;
        }
    }

    public static synchronized NativeCrashHandler getInstance() {
        NativeCrashHandler nativeCrashHandler;
        synchronized (NativeCrashHandler.class) {
            nativeCrashHandler = f7916a;
        }
        return nativeCrashHandler;
    }

    public void testNativeCrash(boolean z, boolean z2, boolean z3) {
        m8199a(16, "" + z);
        m8199a(17, "" + z2);
        m8199a(18, "" + z3);
        testNativeCrash();
    }

    /* renamed from: b */
    public synchronized void mo38295b(boolean z) {
        if (z) {
            startNativeMonitor();
        } else {
            mo38290a();
        }
    }

    /* renamed from: a */
    public synchronized void mo38291a(boolean z) {
        if (this.f7928j) {
            C3321an.m8356d("[Native] Native crash report has already registered.", new Object[0]);
            return;
        }
        if (this.f7927i) {
            try {
                String regist = regist(this.f7924f, z, 1);
                if (regist != null) {
                    C3321an.m8349a("[Native] Native Crash Report enable.", new Object[0]);
                    m8198a(regist);
                    this.f7921c.f7696t = regist;
                    C3322ao.m8365a(f7917l);
                    this.f7928j = true;
                    return;
                }
            } catch (Throwable unused) {
                C3321an.m8355c("[Native] Failed to load Bugly SO file.", new Object[0]);
            }
        } else if (this.f7926h) {
            try {
                Class[] clsArr = {String.class, String.class, Integer.TYPE, Integer.TYPE};
                Object[] objArr = new Object[4];
                objArr[0] = this.f7924f;
                objArr[1] = C3270b.m8030a(this.f7920b, false);
                int i = 5;
                objArr[2] = Integer.valueOf(z ? 1 : 5);
                objArr[3] = 1;
                String str = (String) C3325ap.m8384a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler2", null, clsArr, objArr);
                if (str == null) {
                    str = (String) C3325ap.m8384a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler", null, new Class[]{String.class, String.class, Integer.TYPE}, new Object[]{this.f7924f, C3270b.m8030a(this.f7920b, false), Integer.valueOf(C3269a.m7966b().mo38135K())});
                }
                if (str != null) {
                    this.f7928j = true;
                    C3269a.m7966b().f7696t = str;
                    Boolean bool = (Boolean) C3325ap.m8384a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "checkExtraJni", null, new Class[]{String.class}, new Object[]{str});
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        f7917l = booleanValue;
                        C3322ao.m8365a(booleanValue);
                    }
                    C3325ap.m8384a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", null, new Class[]{Boolean.TYPE}, new Object[]{true});
                    if (z) {
                        i = 1;
                    }
                    C3325ap.m8384a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "setLogMode", null, new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i)});
                    return;
                }
            } catch (Throwable unused2) {
            }
        }
        this.f7927i = false;
        this.f7926h = false;
    }

    /* renamed from: a */
    private boolean m8201a(String str, boolean z) {
        Throwable th;
        boolean z2;
        try {
            C3321an.m8349a("[Native] Trying to load so: %s", str);
            if (z) {
                System.load(str);
            } else {
                System.loadLibrary(str);
            }
            try {
                C3321an.m8349a("[Native] Successfully loaded SO: %s", str);
                return true;
            } catch (Throwable th2) {
                th = th2;
                z2 = true;
            }
        } catch (Throwable th3) {
            th = th3;
            z2 = false;
            C3321an.m8356d(th.getMessage(), new Object[0]);
            C3321an.m8356d("[Native] Failed to load so: %s", str);
            return z2;
        }
    }

    /* renamed from: a */
    public synchronized void mo38290a() {
        if (!this.f7928j) {
            C3321an.m8356d("[Native] Native crash report has already unregistered.", new Object[0]);
            return;
        }
        try {
            if (unregist() != null) {
                C3321an.m8349a("[Native] Successfully closed native crash report.", new Object[0]);
                this.f7928j = false;
                return;
            }
        } catch (Throwable unused) {
            C3321an.m8355c("[Native] Failed to close native crash report.", new Object[0]);
        }
        try {
            C3325ap.m8384a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", null, new Class[]{Boolean.TYPE}, new Object[]{false});
            this.f7928j = false;
            C3321an.m8349a("[Native] Successfully closed native crash report.", new Object[0]);
        } catch (Throwable unused2) {
            C3321an.m8355c("[Native] Failed to close native crash report.", new Object[0]);
            this.f7927i = false;
            this.f7926h = false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private boolean m8199a(int i, String str) {
        if (this.f7927i && f7918m) {
            try {
                setNativeInfo(i, str);
                return true;
            } catch (UnsatisfiedLinkError unused) {
                f7918m = false;
            } catch (Throwable th) {
                if (!C3321an.m8350a(th)) {
                    th.printStackTrace();
                }
                return false;
            }
        }
        return false;
    }
}
