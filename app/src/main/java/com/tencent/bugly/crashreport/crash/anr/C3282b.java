package com.tencent.bugly.crashreport.crash.anr;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.p118pd.sdk.C5982OoooOoO;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.common.info.C3270b;
import com.tencent.bugly.crashreport.common.strategy.C3272a;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.C3285b;
import com.tencent.bugly.crashreport.crash.C3287c;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C3307ae;
import com.tencent.bugly.proguard.C3319am;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3322ao;
import com.tencent.bugly.proguard.C3325ap;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.tencent.bugly.crashreport.crash.anr.b */
public class C3282b {

    /* renamed from: a */
    public AtomicInteger f7821a = new AtomicInteger(0);

    /* renamed from: b */
    public long f7822b = -1;

    /* renamed from: c */
    public final Context f7823c;

    /* renamed from: d */
    public final C3269a f7824d;

    /* renamed from: e */
    public final C3319am f7825e;

    /* renamed from: f */
    public final C3272a f7826f;

    /* renamed from: g */
    public final String f7827g;

    /* renamed from: h */
    public final C3285b f7828h;

    /* renamed from: i */
    public FileObserver f7829i;

    /* renamed from: j */
    public boolean f7830j = true;

    public C3282b(Context context, C3272a aVar, C3269a aVar2, C3319am amVar, C3307ae aeVar, C3285b bVar, BuglyStrategy.C3214a aVar3) {
        this.f7823c = C3325ap.m8380a(context);
        this.f7827g = context.getDir("bugly", 0).getAbsolutePath();
        this.f7824d = aVar2;
        this.f7825e = amVar;
        this.f7826f = aVar;
        this.f7828h = bVar;
    }

    /* renamed from: a */
    public ActivityManager.ProcessErrorStateInfo mo38217a(Context context, long j) {
        if (j < 0) {
            j = 0;
        }
        C3321an.m8355c("to find!", new Object[0]);
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0);
        long j2 = j / 500;
        int i = 0;
        while (true) {
            C3321an.m8355c("waiting!", new Object[0]);
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2) {
                        C3321an.m8355c("found!", new Object[0]);
                        return processErrorStateInfo;
                    }
                }
            }
            C3325ap.m8417b(500);
            int i2 = i + 1;
            if (((long) i) >= j2) {
                C3321an.m8355c("end!", new Object[0]);
                return null;
            }
            i = i2;
        }
    }

    /* renamed from: b */
    public synchronized void mo38226b() {
        if (mo38229d()) {
            C3321an.m8356d("start when started!", new Object[0]);
            return;
        }
        FileObserverC32831 r0 = new FileObserver("/data/anr/", 8) {
            /* class com.tencent.bugly.crashreport.crash.anr.C3282b.FileObserverC32831 */

            public void onEvent(int i, String str) {
                if (str != null) {
                    String str2 = "/data/anr/" + str;
                    if (!str2.contains(AgooConstants.MESSAGE_TRACE)) {
                        C3321an.m8356d("not anr file %s", str2);
                        return;
                    }
                    C3282b.this.mo38221a(str2);
                }
            }
        };
        this.f7829i = r0;
        try {
            r0.startWatching();
            C3321an.m8349a("start anr monitor!", new Object[0]);
            this.f7825e.mo38398a(new Runnable() {
                /* class com.tencent.bugly.crashreport.crash.anr.C3282b.RunnableC32842 */

                public void run() {
                    C3282b.this.mo38231f();
                }
            });
        } catch (Throwable th) {
            this.f7829i = null;
            C3321an.m8356d("start anr monitor failed!", new Object[0]);
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public synchronized void mo38228c() {
        if (!mo38229d()) {
            C3321an.m8356d("close when closed!", new Object[0]);
            return;
        }
        try {
            this.f7829i.stopWatching();
            this.f7829i = null;
            C3321an.m8356d("close anr monitor!", new Object[0]);
        } catch (Throwable th) {
            C3321an.m8356d("stop anr monitor failed!", new Object[0]);
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public synchronized boolean mo38229d() {
        return this.f7829i != null;
    }

    /* renamed from: e */
    public synchronized boolean mo38230e() {
        return this.f7830j;
    }

    /* renamed from: f */
    public void mo38231f() {
        long b = C3325ap.m8412b() - C3287c.f7848g;
        File file = new File(this.f7827g);
        if (file.exists() && file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    return;
                }
                if (listFiles.length != 0) {
                    int i = 0;
                    for (File file2 : listFiles) {
                        String name = file2.getName();
                        if (name.startsWith("bugly_trace_")) {
                            try {
                                int indexOf = name.indexOf(".txt");
                                if (indexOf > 0 && Long.parseLong(name.substring(12, indexOf)) >= b) {
                                }
                            } catch (Throwable unused) {
                                C3321an.m8355c("Trace file that has invalid format: " + name, new Object[0]);
                            }
                            if (file2.delete()) {
                                i++;
                            }
                        }
                    }
                    C3321an.m8355c("Number of overdue trace files that has deleted: " + i, new Object[0]);
                }
            } catch (Throwable th) {
                C3321an.m8350a(th);
            }
        }
    }

    /* renamed from: g */
    public void mo38232g() {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i < 30) {
                try {
                    C3321an.m8349a("try main sleep for make a test anr! try:%d/30 , kill it if you don't want to wait!", Integer.valueOf(i2));
                    C3325ap.m8417b((long) WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
                    i = i2;
                } catch (Throwable th) {
                    if (!C3321an.m8350a(th)) {
                        th.printStackTrace();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private synchronized void m8103c(boolean z) {
        if (this.f7830j != z) {
            C3321an.m8349a("user change anr %b", Boolean.valueOf(z));
            this.f7830j = z;
        }
    }

    /* renamed from: a */
    public C3281a mo38219a(Context context, ActivityManager.ProcessErrorStateInfo processErrorStateInfo, long j, Map<String, String> map) {
        File filesDir = context.getFilesDir();
        File file = new File(filesDir, "bugly/bugly_trace_" + j + ".txt");
        C3281a aVar = new C3281a();
        aVar.f7816c = j;
        aVar.f7817d = file.getAbsolutePath();
        aVar.f7814a = processErrorStateInfo.processName;
        aVar.f7819f = processErrorStateInfo.shortMsg;
        aVar.f7818e = processErrorStateInfo.longMsg;
        aVar.f7815b = map;
        if (map != null) {
            for (String str : map.keySet()) {
                if (str.startsWith("main(")) {
                    aVar.f7820g = map.get(str);
                }
            }
        }
        Object[] objArr = new Object[6];
        int i = 0;
        objArr[0] = Long.valueOf(aVar.f7816c);
        objArr[1] = aVar.f7817d;
        objArr[2] = aVar.f7814a;
        objArr[3] = aVar.f7819f;
        objArr[4] = aVar.f7818e;
        Map<String, String> map2 = aVar.f7815b;
        if (map2 != null) {
            i = map2.size();
        }
        objArr[5] = Integer.valueOf(i);
        C3321an.m8355c("anr tm:%d\ntr:%s\nproc:%s\nsMsg:%s\n lMsg:%s\n threads:%d", objArr);
        return aVar;
    }

    /* renamed from: b */
    public void mo38227b(boolean z) {
        m8103c(z);
        boolean e = mo38230e();
        C3272a a = C3272a.m8069a();
        if (a != null) {
            e = e && a.mo38194c().f7714g;
        }
        if (e != mo38229d()) {
            C3321an.m8349a("anr changed to %b", Boolean.valueOf(e));
            mo38222a(e);
        }
    }

    /* renamed from: a */
    public CrashDetailBean mo38218a(C3281a aVar) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        try {
            crashDetailBean.f7752C = C3270b.m8045i();
            crashDetailBean.f7753D = C3270b.m8041g();
            crashDetailBean.f7754E = C3270b.m8049k();
            crashDetailBean.f7755F = this.f7824d.mo38173p();
            crashDetailBean.f7756G = this.f7824d.mo38172o();
            crashDetailBean.f7757H = this.f7824d.mo38174q();
            crashDetailBean.f7795w = C3325ap.m8388a(this.f7823c, C3287c.f7846e, C3287c.f7849h);
            crashDetailBean.f7774b = 3;
            crashDetailBean.f7777e = this.f7824d.mo38165h();
            crashDetailBean.f7778f = this.f7824d.f7692p;
            crashDetailBean.f7779g = this.f7824d.mo38180w();
            crashDetailBean.f7785m = this.f7824d.mo38163g();
            crashDetailBean.f7786n = "ANR_EXCEPTION";
            crashDetailBean.f7787o = aVar.f7819f;
            crashDetailBean.f7789q = aVar.f7820g;
            HashMap hashMap = new HashMap();
            crashDetailBean.f7765P = hashMap;
            hashMap.put("BUGLY_CR_01", aVar.f7818e);
            int i = -1;
            if (crashDetailBean.f7789q != null) {
                i = crashDetailBean.f7789q.indexOf("\n");
            }
            crashDetailBean.f7788p = i > 0 ? crashDetailBean.f7789q.substring(0, i) : "GET_FAIL";
            crashDetailBean.f7790r = aVar.f7816c;
            if (crashDetailBean.f7789q != null) {
                crashDetailBean.f7793u = C3325ap.m8415b(crashDetailBean.f7789q.getBytes());
            }
            crashDetailBean.f7798z = aVar.f7815b;
            crashDetailBean.f7750A = aVar.f7814a;
            crashDetailBean.f7751B = "main(1)";
            crashDetailBean.f7758I = this.f7824d.mo38182y();
            crashDetailBean.f7780h = this.f7824d.mo38179v();
            crashDetailBean.f7781i = this.f7824d.mo38134J();
            crashDetailBean.f7794v = aVar.f7817d;
            crashDetailBean.f7762M = this.f7824d.f7696t;
            crashDetailBean.f7763N = this.f7824d.f7646a;
            crashDetailBean.f7764O = this.f7824d.mo38149a();
            crashDetailBean.f7766Q = this.f7824d.mo38132H();
            crashDetailBean.f7767R = this.f7824d.mo38133I();
            crashDetailBean.f7768S = this.f7824d.mo38126B();
            crashDetailBean.f7769T = this.f7824d.mo38131G();
            this.f7828h.mo38248c(crashDetailBean);
            crashDetailBean.f7797y = C3322ao.m8366a();
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
        }
        return crashDetailBean;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0138 A[Catch:{ all -> 0x012e }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0164 A[SYNTHETIC, Splitter:B:59:0x0164] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0176 A[SYNTHETIC, Splitter:B:67:0x0176] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo38225a(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
        // Method dump skipped, instructions count: 462
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.anr.C3282b.mo38225a(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public boolean mo38223a() {
        return this.f7821a.get() != 0;
    }

    /* renamed from: a */
    public boolean mo38224a(Context context, String str, ActivityManager.ProcessErrorStateInfo processErrorStateInfo, long j, Map<String, String> map) {
        C3281a a = mo38219a(context, processErrorStateInfo, j, map);
        if (!this.f7826f.mo38193b()) {
            C3321an.m8357e("crash report sync remote fail, will not upload to Bugly , print local for helpful!", new Object[0]);
            C3285b.m8123a("ANR", C3325ap.m8386a(), a.f7814a, "main", a.f7818e, null);
            return false;
        } else if (!this.f7826f.mo38194c().f7717j) {
            C3321an.m8356d("ANR Report is closed!", new Object[0]);
            return false;
        } else {
            C3321an.m8349a("found visiable anr , start to upload!", new Object[0]);
            CrashDetailBean a2 = mo38218a(a);
            if (a2 == null) {
                C3321an.m8357e("pack anr fail!", new Object[0]);
                return false;
            }
            C3287c.m8145a().mo38255a(a2);
            if (a2.f7773a >= 0) {
                C3321an.m8349a("backup anr record success!", new Object[0]);
            } else {
                C3321an.m8356d("backup anr record fail!", new Object[0]);
            }
            if (str != null && new File(str).exists()) {
                this.f7821a.set(3);
                if (mo38225a(str, a.f7817d, a.f7814a)) {
                    C3321an.m8349a("backup trace success", new Object[0]);
                }
            }
            C3285b.m8123a("ANR", C3325ap.m8386a(), a.f7814a, "main", a.f7818e, a2);
            if (!this.f7828h.mo38242a(a2)) {
                this.f7828h.mo38239a(a2, 3000L, true);
            }
            this.f7828h.mo38247b(a2);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        com.tencent.bugly.proguard.C3321an.m8355c("read trace first dump for create time!", new java.lang.Object[0]);
        r0 = com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.readFirstDumpInfo(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r0 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r5 = r0.f7812c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r5 != -1) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        com.tencent.bugly.proguard.C3321an.m8356d("trace dump fail could not get time!", new java.lang.Object[0]);
        r5 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (java.lang.Math.abs(r5 - r10.f7822b) >= com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        com.tencent.bugly.proguard.C3321an.m8356d("should not process ANR too Fre in %d", 10000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        r10.f7822b = r5;
        r10.f7821a.set(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r9 = com.tencent.bugly.proguard.C3325ap.m8396a(com.tencent.bugly.crashreport.crash.C3287c.f7847f, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (r9 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (r9.size() > 0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        r6 = mo38217a(r10.f7823c, com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        if (r6 != null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        com.tencent.bugly.proguard.C3321an.m8355c("proc state is unvisiable!", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008c, code lost:
        if (r6.pid == android.os.Process.myPid()) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008e, code lost:
        com.tencent.bugly.proguard.C3321an.m8355c("not mind proc!", r6.processName);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        com.tencent.bugly.proguard.C3321an.m8349a("found visiable anr , start to process!", new java.lang.Object[0]);
        mo38224a(r10.f7823c, r11, r6, r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        com.tencent.bugly.proguard.C3321an.m8356d("can't get all thread skip this anr", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
        com.tencent.bugly.proguard.C3321an.m8350a(r11);
        com.tencent.bugly.proguard.C3321an.m8357e("get all thread stack fail!", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bd, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c2, code lost:
        if (com.tencent.bugly.proguard.C3321an.m8350a(r11) == false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c4, code lost:
        r11.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        com.tencent.bugly.proguard.C3321an.m8357e("handle anr error %s", r11.getClass().toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00de, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00df, code lost:
        r10.f7821a.set(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e4, code lost:
        throw r11;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38221a(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.anr.C3282b.mo38221a(java.lang.String):void");
    }

    /* renamed from: a */
    public synchronized void mo38222a(boolean z) {
        if (z) {
            mo38226b();
        } else {
            mo38228c();
        }
    }

    /* renamed from: a */
    public synchronized void mo38220a(StrategyBean strategyBean) {
        if (strategyBean != null) {
            if (strategyBean.f7717j != mo38229d()) {
                C3321an.m8356d("server anr changed to %b", Boolean.valueOf(strategyBean.f7717j));
            }
            boolean z = strategyBean.f7717j && mo38230e();
            if (z != mo38229d()) {
                C3321an.m8349a("anr changed to %b", Boolean.valueOf(z));
                mo38222a(z);
            }
        }
    }
}
