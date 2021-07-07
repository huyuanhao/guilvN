package com.alibaba.sdk.android.httpdns;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.sdk.android.httpdns.c */
public class C0266c {

    /* renamed from: a */
    public static final ExecutorService f589a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 1, f591a, new SynchronousQueue(), f590a);

    /* renamed from: a */
    public static final ThreadFactory f590a = new ThreadFactory() {
        /* class com.alibaba.sdk.android.httpdns.C0266c.ThreadFactoryC02671 */

        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("httpdns worker");
            thread.setDaemon(false);
            thread.setUncaughtExceptionHandler(new C0300j());
            return thread;
        }
    };

    /* renamed from: a */
    public static final TimeUnit f591a = TimeUnit.SECONDS;

    /* renamed from: a */
    public static ExecutorService m467a() {
        return f589a;
    }
}
