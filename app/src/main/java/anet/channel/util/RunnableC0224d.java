package anet.channel.util;

import anet.channel.statist.NetTypeStat;
import anet.channel.thread.ThreadPoolExecutorFactory;

/* renamed from: anet.channel.util.d */
public final class RunnableC0224d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f479a;

    /* renamed from: b */
    public final /* synthetic */ NetTypeStat f480b;

    public RunnableC0224d(String str, NetTypeStat netTypeStat) {
        this.f479a = str;
        this.f480b = netTypeStat;
    }

    public void run() {
        ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC0225e(this), ThreadPoolExecutorFactory.Priority.LOW);
    }
}
