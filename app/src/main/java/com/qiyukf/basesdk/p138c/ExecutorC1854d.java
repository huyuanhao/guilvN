package com.qiyukf.basesdk.p138c;

import android.os.Build;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.qiyukf.basesdk.c.d */
public final class ExecutorC1854d implements Executor {

    /* renamed from: a */
    public static final Executor f3413a = new Executor() {
        /* class com.qiyukf.basesdk.p138c.ExecutorC1854d.ExecutorC18551 */

        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: b */
    public static C1857a f3414b = new C1857a(3, 5, true);

    /* renamed from: c */
    public static C1857a f3415c = new C1857a(1, 1, false);

    /* renamed from: d */
    public Comparator<Runnable> f3416d = new Comparator<Runnable>() {
        /* class com.qiyukf.basesdk.p138c.ExecutorC1854d.C18562 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Runnable runnable, Runnable runnable2) {
            return RunnableC1858b.m3526a((RunnableC1858b) runnable, (RunnableC1858b) runnable2);
        }
    };

    /* renamed from: e */
    public final String f3417e;

    /* renamed from: f */
    public final C1857a f3418f;

    /* renamed from: g */
    public ExecutorService f3419g;

    /* renamed from: com.qiyukf.basesdk.c.d$a */
    public static class C1857a {

        /* renamed from: a */
        public int f3421a;

        /* renamed from: b */
        public int f3422b;

        /* renamed from: c */
        public int f3423c = 30000;

        /* renamed from: d */
        public boolean f3424d;

        public C1857a(int i, int i2, boolean z) {
            this.f3421a = i;
            this.f3422b = i2;
            this.f3424d = z;
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.d$b */
    public static class RunnableC1858b implements Runnable {

        /* renamed from: a */
        public static int f3425a;

        /* renamed from: b */
        public Runnable f3426b;

        /* renamed from: c */
        public int f3427c;

        /* renamed from: d */
        public int f3428d;

        public RunnableC1858b(Runnable runnable, int i) {
            int i2 = f3425a;
            f3425a = i2 + 1;
            this.f3428d = i2;
            this.f3426b = runnable;
            this.f3427c = i;
        }

        /* renamed from: a */
        public static final int m3526a(RunnableC1858b bVar, RunnableC1858b bVar2) {
            int i = bVar.f3427c;
            int i2 = bVar2.f3427c;
            return i != i2 ? i2 - i : bVar.f3428d - bVar2.f3428d;
        }

        public final void run() {
            Runnable runnable = this.f3426b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.qiyukf.basesdk.c.d$c */
    public static class ThreadFactoryC1859c implements ThreadFactory {

        /* renamed from: a */
        public final ThreadGroup f3429a;

        /* renamed from: b */
        public final AtomicInteger f3430b = new AtomicInteger(1);

        /* renamed from: c */
        public final String f3431c;

        public ThreadFactoryC1859c(String str) {
            SecurityManager securityManager = System.getSecurityManager();
            this.f3429a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.f3431c = str + "#";
        }

        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f3429a;
            Thread thread = new Thread(threadGroup, runnable, this.f3431c + this.f3430b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    public ExecutorC1854d(String str, C1857a aVar, boolean z) {
        this.f3417e = str;
        this.f3418f = aVar;
        if (z) {
            mo34120a();
        }
    }

    /* renamed from: a */
    private void m3522a(Runnable runnable) {
        synchronized (this) {
            if (this.f3419g != null) {
                if (!this.f3419g.isShutdown()) {
                    this.f3419g.execute(runnable);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo34120a() {
        synchronized (this) {
            if (this.f3419g == null || this.f3419g.isShutdown()) {
                C1857a aVar = this.f3418f;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(aVar.f3421a, aVar.f3422b, (long) aVar.f3423c, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, this.f3416d), new ThreadFactoryC1859c(this.f3417e), new ThreadPoolExecutor.DiscardPolicy());
                boolean z = aVar.f3424d;
                if (Build.VERSION.SDK_INT >= 9) {
                    threadPoolExecutor.allowCoreThreadTimeOut(z);
                }
                this.f3419g = threadPoolExecutor;
            }
        }
    }

    /* renamed from: a */
    public final void mo34121a(Runnable runnable, int i) {
        m3522a(new RunnableC1858b(runnable, i));
    }

    /* renamed from: b */
    public final void mo34122b() {
        ExecutorService executorService;
        synchronized (this) {
            executorService = null;
            if (this.f3419g != null) {
                ExecutorService executorService2 = this.f3419g;
                this.f3419g = null;
                executorService = executorService2;
            }
        }
        if (executorService != null && !executorService.isShutdown()) {
            executorService.shutdown();
        }
    }

    public final void execute(Runnable runnable) {
        m3522a(new RunnableC1858b(runnable, 0));
    }
}
