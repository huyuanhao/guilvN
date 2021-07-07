package anet.channel.strategy.utils;

import anet.channel.strategy.dispatch.C0186b;
import anet.channel.util.ALog;
import java.util.concurrent.ThreadFactory;

/* renamed from: anet.channel.strategy.utils.b */
public final class ThreadFactoryC0208b implements ThreadFactory {
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "AMDC" + C0207a.f450a.incrementAndGet());
        ALog.m290i(C0186b.TAG, "thread created!", null, "name", thread.getName());
        thread.setPriority(5);
        return thread;
    }
}
