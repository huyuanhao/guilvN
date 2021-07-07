package com.p118pd.sdk;

import android.content.Context;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogLevel;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.pd.sdk.ooOO0OoO  reason: case insensitive filesystem */
public class C8908ooOO0OoO {
    public static final BlockingQueue<Runnable> OooO00o = new LinkedBlockingQueue(128);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Executor f22114OooO00o = new ThreadPoolExecutor(OooO0Oo, OooO0o0, 1, TimeUnit.SECONDS, OooO00o, f22115OooO00o);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ThreadFactory f22115OooO00o = new OooO00o();
    public static final int OooO0O0 = 30;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final long f22116OooO0O0 = 1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static String f22117OooO0O0 = "LogCollectorManager";
    public static final int OooO0OO;
    public static final int OooO0Oo;
    public static final int OooO0o0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f22118OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f22119OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f22120OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8910ooOO0Ooo f22121OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8928ooOOO0O f22122OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f22123OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f22124OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ExecutorService f22125OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Future<?> f22126OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22127OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Map<String, String> f22128OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public Map<String, C8906ooOO0Oo> f22129OooO0OO;

    /* renamed from: com.pd.sdk.ooOO0OoO$OooO00o */
    public static class OooO00o implements ThreadFactory {
        public final AtomicInteger OooO00o = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "LogRecord #" + this.OooO00o.getAndIncrement());
        }
    }

    /* renamed from: com.pd.sdk.ooOO0OoO$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public final /* synthetic */ long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LogCategory f22131OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LogLevel f22132OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Map f22133OooO00o;
        public final /* synthetic */ long OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final /* synthetic */ Map f22134OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final /* synthetic */ boolean f22135OooO0O0;
        public final /* synthetic */ String o0ooOOo;

        public OooO0O0(LogCategory logCategory, String str, long j, long j2, LogLevel logLevel, Map map, Map map2, boolean z) {
            this.f22131OooO00o = logCategory;
            this.o0ooOOo = str;
            this.OooO00o = j;
            this.OooO0O0 = j2;
            this.f22132OooO00o = logLevel;
            this.f22133OooO00o = map;
            this.f22134OooO0O0 = map2;
            this.f22135OooO0O0 = z;
        }

        public void run() {
            C8908ooOO0OoO.this.f22121OooO00o.OooO00o(this.f22131OooO00o, this.o0ooOOo, this.OooO00o, this.OooO0O0, C8908ooOO0OoO.this.f22124OooO00o, this.f22132OooO00o, this.f22133OooO00o, this.f22134OooO0O0);
            if (this.f22135OooO0O0 || C8908ooOO0OoO.this.f22121OooO00o.OooO00o(this.f22132OooO00o) || C8908ooOO0OoO.this.f22121OooO00o.OooO00o() >= C8908ooOO0OoO.this.f22118OooO00o) {
                C8908ooOO0OoO.this.OooO00o(true, true);
            } else {
                C8908ooOO0OoO.this.OooO00o(false, false);
            }
        }
    }

    /* renamed from: com.pd.sdk.ooOO0OoO$OooO0OO */
    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        public void run() {
            C8908ooOO0OoO.this.OooO0O0();
        }
    }

    /* renamed from: com.pd.sdk.ooOO0OoO$OooO0Oo  reason: case insensitive filesystem */
    public static class C8909OooO0Oo {
        public static final C8908ooOO0OoO OooO00o = new C8908ooOO0OoO(null);
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        OooO0OO = availableProcessors;
        OooO0Oo = availableProcessors + 1;
        OooO0o0 = (availableProcessors * 2) + 1;
    }

    public /* synthetic */ C8908ooOO0OoO(OooO00o oooO00o) {
        this();
    }

    public void OooO0O0(Map<String, String> map) {
        this.f22128OooO0O0.putAll(map);
    }

    public void OooO0OO(Map<String, String> map) {
        this.f22124OooO00o.putAll(map);
    }

    public C8908ooOO0OoO() {
        this.f22124OooO00o = new HashMap();
        this.f22128OooO0O0 = new HashMap();
        this.f22129OooO0OO = new HashMap();
        this.f22119OooO00o = 0;
        this.f22118OooO00o = 30;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void OooO0O0() {
        if (this.f22121OooO00o.OooO00o() > 0 && (this.f22126OooO00o == null || this.f22126OooO00o.isDone())) {
            String OooO00o2 = this.f22121OooO00o.m20554OooO00o();
            m20550OooO00o();
            this.f22121OooO00o.m20555OooO00o();
            m20550OooO00o();
            m20544OooO00o();
            this.f22126OooO00o = this.f22125OooO00o.submit(new RunnableC8913ooOO0o00(this.f22120OooO00o, this.f22121OooO00o, this.f22123OooO00o, OooO00o2));
        }
    }

    private boolean OooO0OO() {
        if (this.f22120OooO00o == null) {
            m20550OooO00o();
            return false;
        } else if (this.f22121OooO00o == null) {
            m20550OooO00o();
            return false;
        } else {
            String str = this.f22123OooO00o;
            if (str != null && m20551OooO00o(str)) {
                return true;
            }
            m20550OooO00o();
            return false;
        }
    }

    public void OooO00o(C8910ooOO0Ooo oooo0ooo) {
        this.f22121OooO00o = oooo0ooo;
    }

    public void OooO00o(Context context) {
        this.f22120OooO00o = context;
    }

    public void OooO00o(Map<String, C8906ooOO0Oo> map) {
        this.f22129OooO0OO.putAll(map);
    }

    public void OooO00o(long j) {
        this.f22119OooO00o = j;
    }

    public void OooO00o(int i) {
        this.f22118OooO00o = i;
    }

    public void OooO00o(boolean z) {
        this.f22127OooO00o = z;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public synchronized boolean m20552OooO0O0() {
        return this.f22121OooO00o != null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20549OooO00o(String str) {
        this.f22123OooO00o = str;
    }

    public static C8908ooOO0OoO OooO00o() {
        return C8909OooO0Oo.OooO00o;
    }

    public void OooO00o(AbstractC8928ooOOO0O ooooo0o) {
        this.f22122OooO00o = ooooo0o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8928ooOOO0O m20546OooO00o() {
        return this.f22122OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<String, C8906ooOO0Oo> m20548OooO00o() {
        return this.f22129OooO0OO;
    }

    public synchronized void OooO00o(String str, String str2) {
        this.f22121OooO00o.m20553OooO00o().edit().putString(str, str2).commit();
    }

    public synchronized String OooO00o(String str) {
        return this.f22121OooO00o.m20553OooO00o().getString(str, "0");
    }

    public synchronized void OooO00o(LogCategory logCategory, String str, long j, long j2, boolean z, LogLevel logLevel, Map<String, String> map, Map<String, C8906ooOO0Oo> map2) {
        if (!m20552OooO0O0()) {
            m20550OooO00o();
        } else if (str == null || str.length() == 0) {
            m20550OooO00o();
        } else if (C8937ooOOOO0.m20596OooO00o(this.f22120OooO00o)) {
            HashMap hashMap = map == null ? new HashMap() : map;
            hashMap.putAll(this.f22128OooO0O0);
            if (OooO0OO()) {
                if (m20547OooO00o().getLevel() <= logLevel.getLevel()) {
                    if (!logLevel.equals(LogLevel.error)) {
                        f22114OooO00o.execute(new OooO0O0(logCategory, str, j, j2, logLevel, hashMap, map2, z));
                    } else if (this.f22121OooO00o.OooO00o(logCategory, str, j, j2, this.f22124OooO00o, logLevel, hashMap, map2)) {
                        if (this.f22122OooO00o != null) {
                            this.f22122OooO00o.report();
                        }
                        OooO0O0();
                    }
                }
            }
        }
    }

    public void OooO00o(boolean z, boolean z2) {
        AbstractC8928ooOOO0O ooooo0o;
        if (z && z2 && (ooooo0o = this.f22122OooO00o) != null) {
            ooooo0o.report();
        }
        if (this.f22121OooO00o.OooO00o() > this.f22118OooO00o || z) {
            f22114OooO00o.execute(new OooO0OO());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m20544OooO00o() {
        if (this.f22125OooO00o == null) {
            this.f22125OooO00o = Executors.newSingleThreadExecutor();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20551OooO00o(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        try {
            new URL(str);
            return true;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized boolean m20550OooO00o() {
        return this.f22127OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m20545OooO00o() {
        return this.f22119OooO00o + System.currentTimeMillis();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LogLevel m20547OooO00o() {
        return C8915ooOO0o0o.OooO00o().m20564OooO00o();
    }
}
