package com.vivo.push.util;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.vivo.push.util.f */
public final class ThreadFactoryC4136f implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f11097a;

    public ThreadFactoryC4136f(String str) {
        this.f11097a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(this.f11097a);
        thread.setDaemon(true);
        return thread;
    }
}
