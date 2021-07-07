package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.o0OOO0Oo  reason: case insensitive filesystem */
public final class C7384o0OOO0Oo {
    public static final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final long f20148OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C7384o0OOO0Oo f20149OooO00o = new C7384o0OOO0Oo();
    public static final int OooO0O0;
    public static final int OooO0OO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Executor f20150OooO00o = new OooO0O0();

    /* renamed from: com.pd.sdk.o0OOO0Oo$OooO0O0 */
    public static class OooO0O0 implements Executor {
        public OooO0O0() {
        }

        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        OooO00o = availableProcessors;
        OooO0O0 = availableProcessors + 1;
        OooO0OO = (availableProcessors * 2) + 1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static ExecutorService m18912OooO00o() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(OooO0O0, OooO0OO, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        OooO00o(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static ExecutorService OooO00o(ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(OooO0O0, OooO0OO, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        OooO00o(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    @SuppressLint({"NewApi"})
    public static void OooO00o(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        if (Build.VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(z);
        }
    }

    public static Executor OooO00o() {
        return f20149OooO00o.f20150OooO00o;
    }
}
