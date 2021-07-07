package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.os.Build;
import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.pd.sdk.oo0ooo0O  reason: case insensitive filesystem */
public class ExecutorC8777oo0ooo0O implements Executor {
    public static final Executor OooO00o = new OooO00o();
    public static OooO0OO OooO0O0 = new OooO0OO(3, 5, 30000, true);
    public static OooO0OO OooO0OO = new OooO0OO(1, 1, 30000, false);
    public static final int o00oO0O = 11;
    public static final int o0ooOO0 = 3;
    public static final int o0ooOOo = 5;
    public static final int o0ooOoO = 30000;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0OO f21962OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Comparator<Runnable> f21963OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ExecutorService f21964OooO00o;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public final String f21965o0ooOOo;

    /* renamed from: com.pd.sdk.oo0ooo0O$OooO00o */
    public static class OooO00o implements Executor {
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: com.pd.sdk.oo0ooo0O$OooO0O0 */
    public class OooO0O0 implements Comparator<Runnable> {
        public OooO0O0() {
        }

        /* renamed from: OooO00o */
        public int compare(Runnable runnable, Runnable runnable2) {
            return RunnableC8778OooO0Oo.OooO00o((RunnableC8778OooO0Oo) runnable, (RunnableC8778OooO0Oo) runnable2);
        }
    }

    /* renamed from: com.pd.sdk.oo0ooo0O$OooO0OO */
    public static class OooO0OO {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f21966OooO00o;
        public int OooO0O0;
        public int OooO0OO;

        public OooO0OO(int i, int i2, int i3, boolean z) {
            this.OooO00o = i;
            this.OooO0O0 = i2;
            this.OooO0OO = i3;
            this.f21966OooO00o = z;
        }
    }

    /* renamed from: com.pd.sdk.oo0ooo0O$OooO0Oo  reason: case insensitive filesystem */
    public static class RunnableC8778OooO0Oo implements Runnable {
        public static int o0ooOOo;
        public Runnable OooO00o;
        public int o00oO0O;
        public int o0ooOO0;

        public RunnableC8778OooO0Oo(Runnable runnable, int i) {
            int i2 = o0ooOOo;
            o0ooOOo = i2 + 1;
            this.o0ooOO0 = i2;
            this.OooO00o = runnable;
            this.o00oO0O = i;
        }

        public static final int OooO00o(RunnableC8778OooO0Oo oooO0Oo, RunnableC8778OooO0Oo oooO0Oo2) {
            int i = oooO0Oo.o00oO0O;
            int i2 = oooO0Oo2.o00oO0O;
            if (i != i2) {
                return i2 - i;
            }
            return oooO0Oo.o0ooOO0 - oooO0Oo2.o0ooOO0;
        }

        public void run() {
            Runnable runnable = this.OooO00o;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.pd.sdk.oo0ooo0O$OooO0o0  reason: case insensitive filesystem */
    public static class ThreadFactoryC8779OooO0o0 implements ThreadFactory {
        public final ThreadGroup OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f21967OooO00o = new AtomicInteger(1);
        public final String o0ooOOo;

        public ThreadFactoryC8779OooO0o0(String str) {
            SecurityManager securityManager = System.getSecurityManager();
            this.OooO00o = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.o0ooOOo = str + "#";
        }

        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.OooO00o;
            Thread thread = new Thread(threadGroup, runnable, this.o0ooOOo + this.f21967OooO00o.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    public ExecutorC8777oo0ooo0O(String str) {
        this(str, OooO0O0);
    }

    @TargetApi(9)
    public static final void OooO0O0(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        threadPoolExecutor.allowCoreThreadTimeOut(z);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20417OooO00o() {
        synchronized (this) {
            if (this.f21964OooO00o == null || this.f21964OooO00o.isShutdown()) {
                this.f21964OooO00o = OooO00o(this.f21962OooO00o);
            }
        }
    }

    public void execute(Runnable runnable) {
        OooO00o(new RunnableC8778OooO0Oo(runnable, 0));
    }

    public void shutdown() {
        ExecutorService executorService;
        synchronized (this) {
            executorService = null;
            if (this.f21964OooO00o != null) {
                ExecutorService executorService2 = this.f21964OooO00o;
                this.f21964OooO00o = null;
                executorService = executorService2;
            }
        }
        if (executorService != null && !executorService.isShutdown()) {
            executorService.shutdown();
        }
    }

    public Future<?> submit(Runnable runnable) {
        synchronized (this) {
            if (this.f21964OooO00o != null) {
                if (!this.f21964OooO00o.isShutdown()) {
                    return this.f21964OooO00o.submit(new RunnableC8778OooO0Oo(runnable, 0));
                }
            }
            return null;
        }
    }

    public ExecutorC8777oo0ooo0O(String str, OooO0OO oooO0OO) {
        this(str, oooO0OO, true);
    }

    public ExecutorC8777oo0ooo0O(String str, OooO0OO oooO0OO, boolean z) {
        this.f21963OooO00o = new OooO0O0();
        this.f21965o0ooOOo = str;
        this.f21962OooO00o = oooO0OO;
        if (z) {
            m20417OooO00o();
        }
    }

    public int OooO00o() {
        ExecutorService executorService = this.f21964OooO00o;
        int i = 0;
        if (executorService != null && (executorService instanceof ThreadPoolExecutor)) {
            BlockingQueue<Runnable> queue = ((ThreadPoolExecutor) executorService).getQueue();
            if (queue != null) {
                i = queue.size();
            }
            AbstractC8796ooO0000o.OooO0OO("response queue size = " + i);
        }
        return i;
    }

    public void OooO00o(Runnable runnable, int i) {
        OooO00o(new RunnableC8778OooO0Oo(runnable, i));
    }

    private void OooO00o(Runnable runnable) {
        synchronized (this) {
            if (this.f21964OooO00o != null) {
                if (!this.f21964OooO00o.isShutdown()) {
                    this.f21964OooO00o.execute(runnable);
                }
            }
        }
    }

    private ExecutorService OooO00o(OooO0OO oooO0OO) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(oooO0OO.OooO00o, oooO0OO.OooO0O0, (long) oooO0OO.OooO0OO, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, this.f21963OooO00o), new ThreadFactoryC8779OooO0o0(this.f21965o0ooOOo), new ThreadPoolExecutor.DiscardPolicy());
        OooO00o(threadPoolExecutor, oooO0OO.f21966OooO00o);
        return threadPoolExecutor;
    }

    public static final void OooO00o(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        if (Build.VERSION.SDK_INT >= 9) {
            OooO0O0(threadPoolExecutor, z);
        }
    }
}
