package com.umeng.message.common;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.message.common.d */
public class C3780d {

    /* renamed from: a */
    public static final String f10128a = "com.umeng.message.common.d";

    /* renamed from: b */
    public static volatile ScheduledThreadPoolExecutor f10129b;

    /* renamed from: c */
    public static ThreadFactory f10130c = new ThreadFactory() {
        /* class com.umeng.message.common.C3780d.ThreadFactoryC37811 */

        /* renamed from: a */
        public AtomicInteger f10131a = new AtomicInteger(0);

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("UMThreadPoolExecutor" + this.f10131a.addAndGet(1));
            return thread;
        }
    };

    /* renamed from: a */
    public static ScheduledThreadPoolExecutor m10346a() {
        if (f10129b == null) {
            synchronized (C3780d.class) {
                if (f10129b == null) {
                    f10129b = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors() * 4, f10130c);
                }
            }
        }
        return f10129b;
    }

    /* renamed from: a */
    public static void m10347a(Runnable runnable) {
        try {
            m10346a().execute(runnable);
        } catch (Throwable unused) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10128a, 0, "UmengThreadPoolExecutorFactory execute exception");
        }
    }

    /* renamed from: a */
    public static void m10348a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            m10346a().schedule(runnable, j, timeUnit);
        } catch (Throwable unused) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10128a, 0, "UmengThreadPoolExecutorFactory schedule exception");
        }
    }
}
