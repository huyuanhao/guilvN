package com.p118pd.sdk;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.pd.sdk.oo0oO0  reason: case insensitive filesystem */
public class C8727oo0oO0 {
    public static AtomicInteger OooO00o = new AtomicInteger(0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ExecutorService[] f21903OooO00o = new ExecutorService[2];

    static {
        for (int i = 0; i < 2; i++) {
            f21903OooO00o[i] = Executors.newSingleThreadExecutor(new ThreadFactoryC8763oo0ooO());
        }
    }

    public static void OooO00o(int i, Runnable runnable) {
        f21903OooO00o[Math.abs(i % 2)].submit(runnable);
    }
}
