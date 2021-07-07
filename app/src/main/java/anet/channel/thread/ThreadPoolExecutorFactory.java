package anet.channel.thread;

import anet.channel.util.ALog;
import com.p118pd.sdk.AbstractC8411oOoo0Oo0;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExecutorFactory {

    /* renamed from: a */
    public static ScheduledThreadPoolExecutor f452a = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0211b("AWCN Scheduler"));

    /* renamed from: b */
    public static ThreadPoolExecutor f453b = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0211b("AWCN Worker(H)"));

    /* renamed from: c */
    public static ThreadPoolExecutor f454c = new C0212a(16, 16, 60, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ThreadFactoryC0211b("AWCN Worker(M)"));

    /* renamed from: d */
    public static ThreadPoolExecutor f455d = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0211b("AWCN Worker(L)"));

    /* renamed from: e */
    public static ThreadPoolExecutor f456e = new ThreadPoolExecutor(32, 32, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0211b("AWCN Worker(Backup)"));

    public static class Priority {
        public static int HIGH = 0;
        public static int LOW = 9;
        public static int NORMAL = 1;
    }

    /* renamed from: anet.channel.thread.ThreadPoolExecutorFactory$a */
    public static class RunnableC0210a implements Comparable<RunnableC0210a>, Runnable {

        /* renamed from: a */
        public Runnable f457a = null;

        /* renamed from: b */
        public int f458b = 0;

        /* renamed from: c */
        public long f459c = System.currentTimeMillis();

        public RunnableC0210a(Runnable runnable, int i) {
            this.f457a = runnable;
            this.f458b = i;
            this.f459c = System.currentTimeMillis();
        }

        /* renamed from: a */
        public int compareTo(RunnableC0210a aVar) {
            int i = this.f458b;
            int i2 = aVar.f458b;
            if (i != i2) {
                return i - i2;
            }
            return (int) (aVar.f459c - this.f459c);
        }

        public void run() {
            this.f457a.run();
        }
    }

    /* renamed from: anet.channel.thread.ThreadPoolExecutorFactory$b */
    public static class ThreadFactoryC0211b implements ThreadFactory {

        /* renamed from: a */
        public AtomicInteger f460a = new AtomicInteger(0);

        /* renamed from: b */
        public String f461b;

        public ThreadFactoryC0211b(String str) {
            this.f461b = str;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f461b + this.f460a.incrementAndGet());
            ALog.m290i("awcn.ThreadPoolExecutorFactory", "thread created!", null, "name", thread.getName());
            thread.setPriority(5);
            return thread;
        }
    }

    static {
        f453b.allowCoreThreadTimeOut(true);
        f454c.allowCoreThreadTimeOut(true);
        f455d.allowCoreThreadTimeOut(true);
        f456e.allowCoreThreadTimeOut(true);
    }

    public static void removeScheduleTask(Runnable runnable) {
        f452a.remove(runnable);
    }

    public static synchronized void setNormalExecutorPoolSize(int i) {
        synchronized (ThreadPoolExecutorFactory.class) {
            if (i < 6) {
                i = 6;
            }
            f454c.setCorePoolSize(i);
            f454c.setMaximumPoolSize(i);
        }
    }

    public static Future<?> submitBackupTask(Runnable runnable) {
        return f456e.submit(runnable);
    }

    public static Future<?> submitPriorityTask(Runnable runnable, int i) {
        if (ALog.isPrintLog(1)) {
            ALog.m287d("awcn.ThreadPoolExecutorFactory", "submit priority task", null, AbstractC8411oOoo0Oo0.OooOOo, Integer.valueOf(i));
        }
        if (i < Priority.HIGH || i > Priority.LOW) {
            i = Priority.LOW;
        }
        if (i == Priority.HIGH) {
            return f453b.submit(runnable);
        }
        if (i == Priority.LOW) {
            return f455d.submit(runnable);
        }
        return f454c.submit(new RunnableC0210a(runnable, i));
    }

    public static Future<?> submitScheduledTask(Runnable runnable) {
        return f452a.submit(runnable);
    }

    public static Future<?> submitScheduledTask(Runnable runnable, long j, TimeUnit timeUnit) {
        return f452a.schedule(runnable, j, timeUnit);
    }
}
