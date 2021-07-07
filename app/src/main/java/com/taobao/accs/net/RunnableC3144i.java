package com.taobao.accs.net;

import anet.channel.strategy.StrategyCenter;

/* renamed from: com.taobao.accs.net.i */
public class RunnableC3144i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3143h f7041a;

    public RunnableC3144i(C3143h hVar) {
        this.f7041a = hVar;
    }

    public void run() {
        StrategyCenter.getInstance().saveData();
    }
}
