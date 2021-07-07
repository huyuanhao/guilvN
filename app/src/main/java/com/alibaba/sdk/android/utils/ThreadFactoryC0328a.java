package com.alibaba.sdk.android.utils;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.alibaba.sdk.android.utils.a */
public class ThreadFactoryC0328a implements ThreadFactory {
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setUncaughtExceptionHandler(new C0329b());
        return thread;
    }
}
