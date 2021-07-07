package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.util.Base64;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.tencent.bugly.C3216b;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.tencent.bugly.proguard.ak */
public class C3314ak {

    /* renamed from: c */
    public static C3314ak f7995c;

    /* renamed from: a */
    public AbstractC3313aj f7996a;

    /* renamed from: b */
    public boolean f7997b = true;

    /* renamed from: d */
    public final C3307ae f7998d;

    /* renamed from: e */
    public final Context f7999e;

    /* renamed from: f */
    public Map<Integer, Long> f8000f = new HashMap();

    /* renamed from: g */
    public long f8001g;

    /* renamed from: h */
    public long f8002h;

    /* renamed from: i */
    public LinkedBlockingQueue<Runnable> f8003i = new LinkedBlockingQueue<>();

    /* renamed from: j */
    public LinkedBlockingQueue<Runnable> f8004j = new LinkedBlockingQueue<>();

    /* renamed from: k */
    public final Object f8005k = new Object();

    /* renamed from: l */
    public String f8006l = null;

    /* renamed from: m */
    public byte[] f8007m = null;

    /* renamed from: n */
    public long f8008n = 0;

    /* renamed from: o */
    public byte[] f8009o = null;

    /* renamed from: p */
    public long f8010p = 0;

    /* renamed from: q */
    public String f8011q = null;

    /* renamed from: r */
    public long f8012r = 0;

    /* renamed from: s */
    public final Object f8013s = new Object();

    /* renamed from: t */
    public boolean f8014t = false;

    /* renamed from: u */
    public final Object f8015u = new Object();

    /* renamed from: v */
    public int f8016v = 0;

    public C3314ak(Context context) {
        this.f7999e = context;
        this.f7998d = C3307ae.m8249a();
        try {
            Class.forName("android.util.Base64");
        } catch (ClassNotFoundException unused) {
            C3321an.m8349a("[UploadManager] Error: Can not find Base64 class, will not use stronger security way to upload", new Object[0]);
            this.f7997b = false;
        }
        if (this.f7997b) {
            this.f8006l = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDP9x32s5pPtZBXzJBz2GWM/" + "sbTvVO2+RvW0PH01IdaBxc/" + "fB6fbHZocC9T3nl1+" + "J5eAFjIRVuV8vHDky7Qo82Mnh0PVvcZIEQvMMVKU8dsMQopxgsOs2gkSHJwgWdinKNS8CmWobo6pFwPUW11lMv714jAUZRq2GBOqiO2vQI6iwIDAQAB";
        }
    }

    /* renamed from: b */
    public static /* synthetic */ int m8307b(C3314ak akVar) {
        int i = akVar.f8016v - 1;
        akVar.f8016v = i;
        return i;
    }

    /* renamed from: c */
    private boolean m8310c() {
        C3321an.m8355c("[UploadManager] Drop security info of database (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            C3307ae a = C3307ae.m8249a();
            if (a != null) {
                return a.mo38347a(555, "security_info", (AbstractC3306ad) null, true);
            }
            C3321an.m8356d("[UploadManager] Failed to get Database", new Object[0]);
            return false;
        } catch (Throwable th) {
            C3321an.m8350a(th);
            return false;
        }
    }

    /* renamed from: d */
    private boolean m8313d() {
        C3321an.m8355c("[UploadManager] Record security info to database (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            C3307ae a = C3307ae.m8249a();
            if (a == null) {
                C3321an.m8356d("[UploadManager] Failed to get database", new Object[0]);
                return false;
            }
            StringBuilder sb = new StringBuilder();
            if (this.f8009o != null) {
                sb.append(Base64.encodeToString(this.f8009o, 0));
                sb.append("#");
                if (this.f8010p != 0) {
                    sb.append(Long.toString(this.f8010p));
                } else {
                    sb.append("null");
                }
                sb.append("#");
                if (this.f8011q != null) {
                    sb.append(this.f8011q);
                } else {
                    sb.append("null");
                }
                sb.append("#");
                if (this.f8012r != 0) {
                    sb.append(Long.toString(this.f8012r));
                } else {
                    sb.append("null");
                }
                a.mo38348a(555, "security_info", sb.toString().getBytes(), (AbstractC3306ad) null, true);
                return true;
            }
            C3321an.m8355c("[UploadManager] AES key is null, will not record", new Object[0]);
            return false;
        } catch (Throwable th) {
            C3321an.m8350a(th);
            m8310c();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private boolean m8315e() {
        boolean z;
        C3321an.m8355c("[UploadManager] Load security info from database (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            C3307ae a = C3307ae.m8249a();
            if (a == null) {
                C3321an.m8356d("[UploadManager] Failed to get database", new Object[0]);
                return false;
            }
            Map<String, byte[]> a2 = a.mo38345a(555, (AbstractC3306ad) null, true);
            if (a2 != null && a2.containsKey("security_info")) {
                String str = new String(a2.get("security_info"));
                String[] split = str.split("#");
                if (split.length == 4) {
                    if (!split[0].isEmpty() && !split[0].equals("null")) {
                        try {
                            this.f8009o = Base64.decode(split[0], 0);
                        } catch (Throwable th) {
                            C3321an.m8350a(th);
                            z = true;
                        }
                    }
                    z = false;
                    if (!z && !split[1].isEmpty() && !split[1].equals("null")) {
                        try {
                            this.f8010p = Long.parseLong(split[1]);
                        } catch (Throwable th2) {
                            C3321an.m8350a(th2);
                            z = true;
                        }
                    }
                    if (!z && !split[2].isEmpty() && !split[2].equals("null")) {
                        this.f8011q = split[2];
                    }
                    if (!z && !split[3].isEmpty() && !split[3].equals("null")) {
                        try {
                            this.f8012r = Long.parseLong(split[3]);
                        } catch (Throwable th3) {
                            C3321an.m8350a(th3);
                        }
                    }
                } else {
                    C3321an.m8349a("SecurityInfo = %s, Strings.length = %d", str, Integer.valueOf(split.length));
                    z = true;
                }
                if (z) {
                    m8310c();
                }
            }
            return true;
        } catch (Throwable th4) {
            C3321an.m8350a(th4);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo38386b(int i) {
        if (C3216b.f7324c) {
            C3321an.m8355c("Uploading frequency will not be checked if SDK is in debug mode.", new Object[0]);
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - mo38372a(i);
        C3321an.m8355c("[UploadManager] Time interval is %d seconds since last uploading(ID: %d).", Long.valueOf(currentTimeMillis / 1000), Integer.valueOf(i));
        if (currentTimeMillis >= 30000) {
            return true;
        }
        C3321an.m8349a("[UploadManager] Data only be uploaded once in %d seconds.", 30L);
        return false;
    }

    /* renamed from: com.tencent.bugly.proguard.ak$a */
    public class RunnableC3317a implements Runnable {

        /* renamed from: b */
        public final Context f8023b;

        /* renamed from: c */
        public final Runnable f8024c;

        /* renamed from: d */
        public final long f8025d;

        public RunnableC3317a(Context context) {
            this.f8023b = context;
            this.f8024c = null;
            this.f8025d = 0;
        }

        public void run() {
            if (!C3325ap.m8401a(this.f8023b, "security_info", 30000)) {
                C3321an.m8355c("[UploadManager] Sleep %d try to lock security file again (pid=%d | tid=%d)", 5000, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                C3325ap.m8417b((long) WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
                if (C3325ap.m8394a(this, "BUGLY_ASYNC_UPLOAD") == null) {
                    C3321an.m8356d("[UploadManager] Failed to start a thread to execute task of initializing security context, try to post it into thread pool.", new Object[0]);
                    C3319am a = C3319am.m8340a();
                    if (a != null) {
                        a.mo38398a(this);
                    } else {
                        C3321an.m8357e("[UploadManager] Asynchronous thread pool is unavailable now, try next time.", new Object[0]);
                    }
                }
            } else {
                if (!C3314ak.this.m8315e()) {
                    C3321an.m8356d("[UploadManager] Failed to load security info from database", new Object[0]);
                    C3314ak.this.mo38384b(false);
                }
                if (C3314ak.this.f8011q != null) {
                    if (C3314ak.this.mo38385b()) {
                        C3321an.m8355c("[UploadManager] Sucessfully got session ID, try to execute upload tasks now (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                        Runnable runnable = this.f8024c;
                        if (runnable != null) {
                            C3314ak.this.m8302a((C3314ak) runnable, (Runnable) this.f8025d);
                        }
                        C3314ak.this.m8309c((C3314ak) 0);
                        C3325ap.m8428c(this.f8023b, "security_info");
                        synchronized (C3314ak.this.f8015u) {
                            C3314ak.this.f8014t = false;
                        }
                        return;
                    }
                    C3321an.m8349a("[UploadManager] Session ID is expired, drop it.", new Object[0]);
                    C3314ak.this.mo38384b(true);
                }
                byte[] a2 = C3325ap.m8405a(128);
                if (a2 == null || a2.length * 8 != 128) {
                    C3321an.m8356d("[UploadManager] Failed to create AES key (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                    C3314ak.this.mo38384b(false);
                    C3325ap.m8428c(this.f8023b, "security_info");
                    synchronized (C3314ak.this.f8015u) {
                        C3314ak.this.f8014t = false;
                    }
                    return;
                }
                C3314ak.this.f8009o = a2;
                C3321an.m8355c("[UploadManager] Execute one upload task for requesting session ID (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                Runnable runnable2 = this.f8024c;
                if (runnable2 != null) {
                    C3314ak.this.m8302a((C3314ak) runnable2, (Runnable) this.f8025d);
                } else {
                    C3314ak.this.m8309c((C3314ak) 1);
                }
            }
        }

        public RunnableC3317a(Context context, Runnable runnable, long j) {
            this.f8023b = context;
            this.f8024c = runnable;
            this.f8025d = j;
        }
    }

    /* renamed from: a */
    public static synchronized C3314ak m8298a(Context context) {
        C3314ak akVar;
        synchronized (C3314ak.class) {
            if (f7995c == null) {
                f7995c = new C3314ak(context);
            }
            akVar = f7995c;
        }
        return akVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bb, code lost:
        if (r13 <= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bd, code lost:
        com.tencent.bugly.proguard.C3321an.m8355c("[UploadManager] Execute urgent upload tasks of queue which has %d tasks (pid=%d | tid=%d)", java.lang.Integer.valueOf(r13), java.lang.Integer.valueOf(android.os.Process.myPid()), java.lang.Integer.valueOf(android.os.Process.myTid()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00de, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00df, code lost:
        if (r5 >= r13) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e1, code lost:
        r8 = (java.lang.Runnable) r2.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e7, code lost:
        if (r8 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ea, code lost:
        r10 = r12.f8005k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ec, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ef, code lost:
        if (r12.f8016v < 2) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f1, code lost:
        if (r1 == null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f3, code lost:
        r1.mo38398a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f6, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f8, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f9, code lost:
        com.tencent.bugly.proguard.C3321an.m8349a("[UploadManager] Create and start a new thread to execute a upload task: %s", "BUGLY_ASYNC_UPLOAD");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010f, code lost:
        if (com.tencent.bugly.proguard.C3325ap.m8394a(new com.tencent.bugly.proguard.C3314ak.RunnableC33151(r12), "BUGLY_ASYNC_UPLOAD") == null) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0111, code lost:
        r10 = r12.f8005k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0113, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r12.f8016v++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0119, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011e, code lost:
        com.tencent.bugly.proguard.C3321an.m8356d("[UploadManager] Failed to start a thread to execute asynchronous upload task, will try again next time.", new java.lang.Object[0]);
        m8305a(r8, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0128, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x012e, code lost:
        if (r7 <= 0) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0130, code lost:
        com.tencent.bugly.proguard.C3321an.m8355c("[UploadManager] Execute upload tasks of queue which has %d tasks (pid=%d | tid=%d)", java.lang.Integer.valueOf(r7), java.lang.Integer.valueOf(android.os.Process.myPid()), java.lang.Integer.valueOf(android.os.Process.myTid()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0151, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0153, code lost:
        r1.mo38398a(new com.tencent.bugly.proguard.C3314ak.RunnableC33162(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0094  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8309c(int r13) {
        /*
        // Method dump skipped, instructions count: 353
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3314ak.m8309c(int):void");
    }

    /* renamed from: a */
    public static synchronized C3314ak m8297a() {
        C3314ak akVar;
        synchronized (C3314ak.class) {
            akVar = f7995c;
        }
        return akVar;
    }

    /* renamed from: a */
    public void mo38375a(int i, int i2, byte[] bArr, String str, String str2, AbstractC3313aj ajVar, long j, boolean z) {
        try {
            m8308b(new RunnableC3318al(this.f7999e, i, i2, bArr, str, str2, ajVar, this.f7997b, z), true, true, j);
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public boolean mo38385b() {
        if (this.f8011q == null || this.f8012r == 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() + this.f8008n;
        long j = this.f8012r;
        if (j >= currentTimeMillis) {
            return true;
        }
        C3321an.m8355c("[UploadManager] Session ID expired time from server is: %d(%s), but now is: %d(%s)", Long.valueOf(j), new Date(this.f8012r).toString(), Long.valueOf(currentTimeMillis), new Date(currentTimeMillis).toString());
        return false;
    }

    /* renamed from: a */
    public void mo38378a(int i, C3340bd bdVar, String str, String str2, AbstractC3313aj ajVar, long j, boolean z) {
        mo38375a(i, bdVar.f8130g, C3311ah.m8287a((Object) bdVar), str, str2, ajVar, j, z);
    }

    /* renamed from: a */
    public void mo38374a(int i, int i2, byte[] bArr, String str, String str2, AbstractC3313aj ajVar, int i3, int i4, boolean z, Map<String, String> map) {
        try {
            m8308b(new RunnableC3318al(this.f7999e, i, i2, bArr, str, str2, ajVar, this.f7997b, i3, i4, false, map), z, false, 0);
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo38384b(boolean z) {
        synchronized (this.f8013s) {
            C3321an.m8355c("[UploadManager] Clear security context (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            this.f8009o = null;
            this.f8011q = null;
            this.f8012r = 0;
        }
        if (z) {
            m8310c();
        }
    }

    /* renamed from: a */
    public void mo38376a(int i, int i2, byte[] bArr, String str, String str2, AbstractC3313aj ajVar, boolean z, Map<String, String> map) {
        mo38374a(i, i2, bArr, str, str2, ajVar, 0, 0, z, map);
    }

    /* renamed from: a */
    public void mo38379a(int i, C3340bd bdVar, String str, String str2, AbstractC3313aj ajVar, boolean z) {
        mo38374a(i, bdVar.f8130g, C3311ah.m8287a((Object) bdVar), str, str2, ajVar, 0, 0, z, null);
    }

    /* renamed from: a */
    public long mo38373a(boolean z) {
        long j;
        long b = C3325ap.m8412b();
        int i = z ? 5 : 3;
        List<C3310ag> a = this.f7998d.mo38344a(i);
        if (a == null || a.size() <= 0) {
            j = z ? this.f8002h : this.f8001g;
        } else {
            j = 0;
            try {
                C3310ag agVar = a.get(0);
                if (agVar.f7989e >= b) {
                    j = C3325ap.m8426c(agVar.f7991g);
                    if (i == 3) {
                        this.f8001g = j;
                    } else {
                        this.f8002h = j;
                    }
                    a.remove(agVar);
                }
            } catch (Throwable th) {
                C3321an.m8350a(th);
            }
            if (a.size() > 0) {
                this.f7998d.mo38346a(a);
            }
        }
        C3321an.m8355c("[UploadManager] Local network consume: %d KB", Long.valueOf(j / 1024));
        return j;
    }

    /* renamed from: b */
    private void m8308b(Runnable runnable, boolean z, boolean z2, long j) {
        if (runnable == null) {
            C3321an.m8356d("[UploadManager] Upload task should not be null", new Object[0]);
        }
        C3321an.m8355c("[UploadManager] Add upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        if (this.f8011q != null) {
            if (mo38385b()) {
                C3321an.m8355c("[UploadManager] Sucessfully got session ID, try to execute upload task now (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                if (z2) {
                    m8302a(runnable, j);
                    return;
                }
                m8305a(runnable, z);
                m8309c(0);
                return;
            }
            C3321an.m8349a("[UploadManager] Session ID is expired, drop it (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            mo38384b(false);
        }
        synchronized (this.f8015u) {
            if (this.f8014t) {
                m8305a(runnable, z);
                return;
            }
            this.f8014t = true;
            m8303a(runnable, z, z2, j);
        }
    }

    /* renamed from: a */
    public synchronized void mo38381a(long j, boolean z) {
        int i = z ? 5 : 3;
        C3310ag agVar = new C3310ag();
        agVar.f7986b = i;
        agVar.f7989e = C3325ap.m8412b();
        agVar.f7987c = "";
        agVar.f7988d = "";
        agVar.f7991g = C3325ap.m8430c(j);
        this.f7998d.mo38352b(i);
        this.f7998d.mo38349a(agVar);
        if (z) {
            this.f8002h = j;
        } else {
            this.f8001g = j;
        }
        C3321an.m8355c("[UploadManager] Network total consume: %d KB", Long.valueOf(j / 1024));
    }

    /* renamed from: a */
    public synchronized void mo38377a(int i, long j) {
        if (i >= 0) {
            this.f8000f.put(Integer.valueOf(i), Long.valueOf(j));
            C3310ag agVar = new C3310ag();
            agVar.f7986b = i;
            agVar.f7989e = j;
            agVar.f7987c = "";
            agVar.f7988d = "";
            agVar.f7991g = new byte[0];
            this.f7998d.mo38352b(i);
            this.f7998d.mo38349a(agVar);
            C3321an.m8355c("[UploadManager] Uploading(ID:%d) time: %s", Integer.valueOf(i), C3325ap.m8387a(j));
        } else {
            C3321an.m8357e("[UploadManager] Unknown uploading ID: %d", Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    public byte[] mo38387b(byte[] bArr) {
        byte[] bArr2 = this.f8009o;
        if (bArr2 != null && bArr2.length * 8 == 128) {
            return C3325ap.m8406a(2, bArr, bArr2);
        }
        C3321an.m8356d("[UploadManager] AES key is invalid (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        return null;
    }

    /* renamed from: a */
    public synchronized long mo38372a(int i) {
        long j = 0;
        if (i >= 0) {
            Long l = this.f8000f.get(Integer.valueOf(i));
            if (l != null) {
                return l.longValue();
            }
            List<C3310ag> a = this.f7998d.mo38344a(i);
            if (a != null && a.size() > 0) {
                if (a.size() > 1) {
                    for (C3310ag agVar : a) {
                        if (agVar.f7989e > j) {
                            j = agVar.f7989e;
                        }
                    }
                    this.f7998d.mo38352b(i);
                } else {
                    try {
                        j = a.get(0).f7989e;
                    } catch (Throwable th) {
                        C3321an.m8350a(th);
                    }
                }
            }
        } else {
            C3321an.m8357e("[UploadManager] Unknown upload ID: %d", Integer.valueOf(i));
        }
        return j;
    }

    /* renamed from: a */
    private boolean m8305a(Runnable runnable, boolean z) {
        if (runnable == null) {
            C3321an.m8349a("[UploadManager] Upload task should not be null", new Object[0]);
            return false;
        }
        try {
            C3321an.m8355c("[UploadManager] Add upload task to queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            synchronized (this.f8005k) {
                if (z) {
                    this.f8003i.put(runnable);
                } else {
                    this.f8004j.put(runnable);
                }
            }
            return true;
        } catch (Throwable th) {
            C3321an.m8357e("[UploadManager] Failed to add upload task to queue: %s", th.getMessage());
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m8302a(Runnable runnable, long j) {
        if (runnable == null) {
            C3321an.m8356d("[UploadManager] Upload task should not be null", new Object[0]);
            return;
        }
        C3321an.m8355c("[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        Thread a = C3325ap.m8394a(runnable, "BUGLY_SYNC_UPLOAD");
        if (a == null) {
            C3321an.m8357e("[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue.", new Object[0]);
            m8305a(runnable, true);
            return;
        }
        try {
            a.join(j);
        } catch (Throwable th) {
            C3321an.m8357e("[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue.", th.getMessage());
            m8305a(runnable, true);
            m8309c(0);
        }
    }

    /* renamed from: a */
    private void m8303a(Runnable runnable, boolean z, boolean z2, long j) {
        C3321an.m8355c("[UploadManager] Initialize security context now (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        if (z2) {
            m8302a(new RunnableC3317a(this.f7999e, runnable, j), 0);
            return;
        }
        m8305a(runnable, z);
        RunnableC3317a aVar = new RunnableC3317a(this.f7999e);
        C3321an.m8349a("[UploadManager] Create and start a new thread to execute a task of initializing security context: %s", "BUGLY_ASYNC_UPLOAD");
        if (C3325ap.m8394a(aVar, "BUGLY_ASYNC_UPLOAD") == null) {
            C3321an.m8356d("[UploadManager] Failed to start a thread to execute task of initializing security context, try to post it into thread pool.", new Object[0]);
            C3319am a = C3319am.m8340a();
            if (a != null) {
                a.mo38398a(aVar);
                return;
            }
            C3321an.m8357e("[UploadManager] Asynchronous thread pool is unavailable now, try next time.", new Object[0]);
            synchronized (this.f8015u) {
                this.f8014t = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r10 == null) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        com.tencent.bugly.proguard.C3321an.m8355c("[UploadManager] Record security context (pid=%d | tid=%d)", java.lang.Integer.valueOf(android.os.Process.myPid()), java.lang.Integer.valueOf(android.os.Process.myTid()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9 = r10.f8157h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (r9 == null) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r9.containsKey("S1") == false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r9.containsKey("S2") == false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        r3 = r10.f8154e - java.lang.System.currentTimeMillis();
        r8.f8008n = r3;
        com.tencent.bugly.proguard.C3321an.m8355c("[UploadManager] Time lag of server is: %d", java.lang.Long.valueOf(r3));
        r10 = r9.get("S1");
        r8.f8011q = r10;
        com.tencent.bugly.proguard.C3321an.m8355c("[UploadManager] Session ID from server is: %s", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (r8.f8011q.length() <= 0) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r9 = java.lang.Long.parseLong(r9.get("S2"));
        r8.f8012r = r9;
        com.tencent.bugly.proguard.C3321an.m8355c("[UploadManager] Session expired time from server is: %d(%s)", java.lang.Long.valueOf(r9), new java.util.Date(r8.f8012r).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c7, code lost:
        if (r8.f8012r >= 1000) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c9, code lost:
        com.tencent.bugly.proguard.C3321an.m8356d("[UploadManager] Session expired time from server is less than 1 second, will set to default value", new java.lang.Object[0]);
        r8.f8012r = 259200000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d3, code lost:
        com.tencent.bugly.proguard.C3321an.m8356d("[UploadManager] Session expired time is invalid, will set to default value", new java.lang.Object[0]);
        r8.f8012r = 259200000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ef, code lost:
        com.tencent.bugly.proguard.C3321an.m8355c("[UploadManager] Session ID from server is invalid, try next time", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f7, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f8, code lost:
        com.tencent.bugly.proguard.C3321an.m8350a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0101, code lost:
        com.tencent.bugly.proguard.C3321an.m8355c("[UploadManager] Fail to init security context and clear local info (pid=%d | tid=%d)", java.lang.Integer.valueOf(android.os.Process.myPid()), java.lang.Integer.valueOf(android.os.Process.myTid()));
        mo38384b(false);
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0122 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38380a(int r9, com.tencent.bugly.proguard.C3341be r10) {
        /*
        // Method dump skipped, instructions count: 311
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3314ak.mo38380a(int, com.tencent.bugly.proguard.be):void");
    }

    /* renamed from: a */
    public byte[] mo38383a(byte[] bArr) {
        byte[] bArr2 = this.f8009o;
        if (bArr2 != null && bArr2.length * 8 == 128) {
            return C3325ap.m8406a(1, bArr, bArr2);
        }
        C3321an.m8356d("[UploadManager] AES key is invalid (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        return null;
    }

    /* renamed from: a */
    public boolean mo38382a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        C3321an.m8355c("[UploadManager] Integrate security to HTTP headers (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        String str = this.f8011q;
        if (str != null) {
            map.put("secureSessionId", str);
            return true;
        }
        byte[] bArr = this.f8009o;
        if (bArr == null || bArr.length * 8 != 128) {
            C3321an.m8356d("[UploadManager] AES key is invalid", new Object[0]);
            return false;
        }
        if (this.f8007m == null) {
            byte[] decode = Base64.decode(this.f8006l, 0);
            this.f8007m = decode;
            if (decode == null) {
                C3321an.m8356d("[UploadManager] Failed to decode RSA public key", new Object[0]);
                return false;
            }
        }
        byte[] b = C3325ap.m8422b(1, this.f8009o, this.f8007m);
        if (b == null) {
            C3321an.m8356d("[UploadManager] Failed to encrypt AES key", new Object[0]);
            return false;
        }
        String encodeToString = Base64.encodeToString(b, 0);
        if (encodeToString == null) {
            C3321an.m8356d("[UploadManager] Failed to encode AES key", new Object[0]);
            return false;
        }
        map.put("raKey", encodeToString);
        return true;
    }
}
