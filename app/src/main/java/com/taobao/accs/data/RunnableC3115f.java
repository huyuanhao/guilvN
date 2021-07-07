package com.taobao.accs.data;

import com.taobao.accs.p263ut.monitor.TrafficsMonitor;

/* renamed from: com.taobao.accs.data.f */
public class RunnableC3115f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3113d f6961a;

    public RunnableC3115f(C3113d dVar) {
        this.f6961a = dVar;
    }

    public void run() {
        TrafficsMonitor trafficsMonitor = this.f6961a.f6945c;
        if (trafficsMonitor != null) {
            trafficsMonitor.mo37748a();
        }
    }
}
