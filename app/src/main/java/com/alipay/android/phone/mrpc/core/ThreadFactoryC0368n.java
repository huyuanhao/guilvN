package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.alipay.android.phone.mrpc.core.n */
public final class ThreadFactoryC0368n implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f819a = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "com.alipay.mobile.common.transport.http.HttpManager.HttpWorker #" + this.f819a.getAndIncrement());
        thread.setPriority(4);
        return thread;
    }
}
