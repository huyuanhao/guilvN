package com.taobao.accs.net;

import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.net.d */
public class RunnableC3139d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AbstractC3137b f7028a;

    public RunnableC3139d(AbstractC3137b bVar) {
        this.f7028a = bVar;
    }

    public void run() {
        if (this.f7028a.f7013e.mo37597c()) {
            ALog.m7599e(this.f7028a.mo37662d(), "receive ping time out! ", new Object[0]);
            AbstractC3141f.m7500a(this.f7028a.f7012d).mo37677c();
            this.f7028a.mo37650a("", false, "receive ping timeout");
            this.f7028a.f7013e.mo37586a(-12);
        }
    }
}
