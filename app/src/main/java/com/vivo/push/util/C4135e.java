package com.vivo.push.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.vivo.push.util.e */
public final class C4135e {

    /* renamed from: a */
    public static final int f11093a;

    /* renamed from: b */
    public static final int f11094b;

    /* renamed from: c */
    public static final int f11095c = ((f11093a * 2) + 1);

    /* renamed from: d */
    public static ExecutorService f11096d = m11166a("COMMON_THREAD");

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f11093a = availableProcessors;
        f11094b = Math.max(2, Math.min(availableProcessors - 1, 4));
    }

    /* renamed from: a */
    public static ExecutorService m11166a(String str) {
        return new ThreadPoolExecutor(f11094b, f11095c, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new ThreadFactoryC4136f(str), new ThreadPoolExecutor.DiscardPolicy());
    }
}
