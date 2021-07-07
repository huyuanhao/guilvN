package com.alibaba.sdk.android.utils.crashdefend;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.sdk.android.utils.crashdefend.f */
public final class C0338f {

    /* renamed from: a */
    public final ThreadFactory f765a = new ThreadFactory() {
        /* class com.alibaba.sdk.android.utils.crashdefend.C0338f.ThreadFactoryC03391 */

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "safe_thread");
            thread.setDaemon(false);
            return thread;
        }
    };

    /* renamed from: c */
    public ExecutorService f766c;

    /* renamed from: a */
    public synchronized ExecutorService mo4087a() {
        if (this.f766c == null) {
            this.f766c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 1, TimeUnit.SECONDS, new SynchronousQueue(), this.f765a);
        }
        return this.f766c;
    }
}
