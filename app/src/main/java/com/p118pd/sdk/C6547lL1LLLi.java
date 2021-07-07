package com.p118pd.sdk;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.internal.schedulers.GenericScheduledExecutorServiceFactory;

/* renamed from: com.pd.sdk.lL1LLLi  reason: case insensitive filesystem */
public final class C6547lL1LLLi implements AbstractC9688lLiLl {
    public static final C6547lL1LLLi OooO00o = new C6547lL1LLLi();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ScheduledExecutorService f18452OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ScheduledExecutorService[] f18453OooO00o = new ScheduledExecutorService[0];
    public static int o00oO0O;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicReference<ScheduledExecutorService[]> f18454OooO00o = new AtomicReference<>(f18453OooO00o);

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f18452OooO00o = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public C6547lL1LLLi() {
        start();
    }

    public static ScheduledExecutorService OooO00o() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = OooO00o.f18454OooO00o.get();
        if (scheduledExecutorServiceArr == f18453OooO00o) {
            return f18452OooO00o;
        }
        int i = o00oO0O + 1;
        if (i >= scheduledExecutorServiceArr.length) {
            i = 0;
        }
        o00oO0O = i;
        return scheduledExecutorServiceArr[i];
    }

    @Override // com.p118pd.sdk.AbstractC9688lLiLl
    public void shutdown() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        ScheduledExecutorService[] scheduledExecutorServiceArr2;
        do {
            scheduledExecutorServiceArr = this.f18454OooO00o.get();
            scheduledExecutorServiceArr2 = f18453OooO00o;
            if (scheduledExecutorServiceArr == scheduledExecutorServiceArr2) {
                return;
            }
        } while (!this.f18454OooO00o.compareAndSet(scheduledExecutorServiceArr, scheduledExecutorServiceArr2));
        for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            C6655liIlIl.m17744OooO00o(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // com.p118pd.sdk.AbstractC9688lLiLl
    public void start() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors > 4) {
            availableProcessors /= 2;
        }
        if (availableProcessors > 8) {
            availableProcessors = 8;
        }
        ScheduledExecutorService[] scheduledExecutorServiceArr = new ScheduledExecutorService[availableProcessors];
        int i = 0;
        for (int i2 = 0; i2 < availableProcessors; i2++) {
            scheduledExecutorServiceArr[i2] = GenericScheduledExecutorServiceFactory.create();
        }
        if (this.f18454OooO00o.compareAndSet(f18453OooO00o, scheduledExecutorServiceArr)) {
            while (i < availableProcessors) {
                ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i];
                if (!C6655liIlIl.m17745OooO00o(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                    C6655liIlIl.OooO00o((ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i++;
            }
            return;
        }
        while (i < availableProcessors) {
            scheduledExecutorServiceArr[i].shutdownNow();
            i++;
        }
    }
}
