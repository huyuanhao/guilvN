package com.taobao.accs.common;

import com.taobao.accs.utl.ALog;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExecutorFactory {
    public static final String TAG = "ThreadPoolExecutorFactory";
    public static volatile ScheduledThreadPoolExecutor collectThreadPoolExecutor;
    public static final AtomicInteger integer = new AtomicInteger();
    public static volatile ScheduledThreadPoolExecutor scheduleThreadPoolExecutor;
    public static volatile ScheduledThreadPoolExecutor sendThreadPoolExecutor;

    /* renamed from: com.taobao.accs.common.ThreadPoolExecutorFactory$a */
    public static class ThreadFactoryC3106a implements ThreadFactory {

        /* renamed from: a */
        public String f6889a;

        public ThreadFactoryC3106a(String str) {
            this.f6889a = str;
        }

        public Thread newThread(Runnable runnable) {
            int andIncrement = ThreadPoolExecutorFactory.integer.getAndIncrement();
            Thread thread = new Thread(runnable, this.f6889a + andIncrement);
            thread.setPriority(5);
            return thread;
        }
    }

    public static void execute(Runnable runnable) {
        try {
            getScheduledExecutor().execute(runnable);
        } catch (Throwable th) {
            ALog.m7598e(TAG, "ThreadPoolExecutorFactory execute", th, new Object[0]);
        }
    }

    public static ScheduledThreadPoolExecutor getCollectThreadPoolExecutor() {
        if (collectThreadPoolExecutor == null) {
            synchronized (ThreadPoolExecutorFactory.class) {
                if (collectThreadPoolExecutor == null) {
                    collectThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC3106a("ACCS-COLLECT"));
                    collectThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
                    collectThreadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return collectThreadPoolExecutor;
    }

    public static ScheduledThreadPoolExecutor getScheduledExecutor() {
        if (scheduleThreadPoolExecutor == null) {
            synchronized (ThreadPoolExecutorFactory.class) {
                if (scheduleThreadPoolExecutor == null) {
                    scheduleThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC3106a("ACCS"));
                    scheduleThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
                    scheduleThreadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return scheduleThreadPoolExecutor;
    }

    public static ScheduledThreadPoolExecutor getSendScheduledExecutor() {
        if (sendThreadPoolExecutor == null) {
            synchronized (ThreadPoolExecutorFactory.class) {
                if (sendThreadPoolExecutor == null) {
                    sendThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC3106a("ACCS-SEND"));
                    sendThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
                    sendThreadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return sendThreadPoolExecutor;
    }

    public static ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            return getScheduledExecutor().schedule(runnable, j, timeUnit);
        } catch (Throwable th) {
            ALog.m7598e(TAG, "ThreadPoolExecutorFactory schedule", th, new Object[0]);
            return null;
        }
    }
}
