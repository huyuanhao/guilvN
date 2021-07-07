package com.tencent.bugly.proguard;

import com.tencent.bugly.C3216b;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.bugly.proguard.am */
public class C3319am {

    /* renamed from: a */
    public static final AtomicInteger f8046a = new AtomicInteger(1);

    /* renamed from: b */
    public static C3319am f8047b;

    /* renamed from: c */
    public ScheduledExecutorService f8048c = null;

    public C3319am() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(3, new ThreadFactory() {
            /* class com.tencent.bugly.proguard.C3319am.ThreadFactoryC33201 */

            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("BuglyThread-" + C3319am.f8046a.getAndIncrement());
                return thread;
            }
        });
        this.f8048c = newScheduledThreadPool;
        if (newScheduledThreadPool == null || newScheduledThreadPool.isShutdown()) {
            C3321an.m8356d("[AsyncTaskHandler] ScheduledExecutorService is not valiable!", new Object[0]);
        }
    }

    /* renamed from: a */
    public static synchronized C3319am m8340a() {
        C3319am amVar;
        synchronized (C3319am.class) {
            if (f8047b == null) {
                f8047b = new C3319am();
            }
            amVar = f8047b;
        }
        return amVar;
    }

    /* renamed from: b */
    public synchronized void mo38400b() {
        if (this.f8048c != null && !this.f8048c.isShutdown()) {
            C3321an.m8355c("[AsyncTaskHandler] Close async handler.", new Object[0]);
            this.f8048c.shutdownNow();
        }
    }

    /* renamed from: c */
    public synchronized boolean mo38401c() {
        return this.f8048c != null && !this.f8048c.isShutdown();
    }

    /* renamed from: a */
    public synchronized boolean mo38399a(Runnable runnable, long j) {
        if (!mo38401c()) {
            C3321an.m8356d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        } else if (runnable == null) {
            C3321an.m8356d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        } else {
            if (j <= 0) {
                j = 0;
            }
            C3321an.m8355c("[AsyncTaskHandler] Post a delay(time: %dms) task: %s", Long.valueOf(j), runnable.getClass().getName());
            try {
                this.f8048c.schedule(runnable, j, TimeUnit.MILLISECONDS);
                return true;
            } catch (Throwable th) {
                if (C3216b.f7324c) {
                    th.printStackTrace();
                }
                return false;
            }
        }
    }

    /* renamed from: a */
    public synchronized boolean mo38398a(Runnable runnable) {
        if (!mo38401c()) {
            C3321an.m8356d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        } else if (runnable == null) {
            C3321an.m8356d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        } else {
            C3321an.m8355c("[AsyncTaskHandler] Post a normal task: %s", runnable.getClass().getName());
            try {
                this.f8048c.execute(runnable);
                return true;
            } catch (Throwable th) {
                if (C3216b.f7324c) {
                    th.printStackTrace();
                }
                return false;
            }
        }
    }
}
