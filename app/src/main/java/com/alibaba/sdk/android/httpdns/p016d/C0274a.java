package com.alibaba.sdk.android.httpdns.p016d;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.sdk.android.httpdns.d.a */
public final class C0274a {

    /* renamed from: b */
    public ExecutorService f601b;

    /* renamed from: b */
    public final ThreadFactory f602b = new ThreadFactory() {
        /* class com.alibaba.sdk.android.httpdns.p016d.C0274a.ThreadFactoryC02751 */

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "report_thread");
            thread.setDaemon(false);
            return thread;
        }
    };

    /* renamed from: b */
    public synchronized ExecutorService mo3980b() {
        if (this.f601b == null) {
            this.f601b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 1, TimeUnit.SECONDS, new SynchronousQueue(), this.f602b);
        }
        return this.f601b;
    }
}
