package com.p118pd.sdk;

import anet.channel.thread.ThreadPoolExecutorFactory;

/* renamed from: com.pd.sdk.o0OO0oOo  reason: case insensitive filesystem */
public class RunnableC7378o0OO0oOo implements Runnable {
    public final /* synthetic */ C7446o0OOoooO OooO00o;

    public RunnableC7378o0OO0oOo(C7446o0OOoooO o0oooooo) {
        this.OooO00o = o0oooooo;
    }

    public void run() {
        ThreadPoolExecutorFactory.submitPriorityTask(this.OooO00o, ThreadPoolExecutorFactory.Priority.HIGH);
    }
}
