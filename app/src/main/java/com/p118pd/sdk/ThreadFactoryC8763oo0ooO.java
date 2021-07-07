package com.p118pd.sdk;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.pd.sdk.oo0ooO  reason: case insensitive filesystem */
public final class ThreadFactoryC8763oo0ooO implements ThreadFactory {
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, String.format("RepeaterThread:%d", Integer.valueOf(C8727oo0oO0.OooO00o.getAndIncrement())));
    }
}
