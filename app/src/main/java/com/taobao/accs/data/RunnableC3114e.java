package com.taobao.accs.data;

import com.taobao.accs.p263ut.monitor.TrafficsMonitor;

/* renamed from: com.taobao.accs.data.e */
public class RunnableC3114e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TrafficsMonitor.C3168a f6959a;

    /* renamed from: b */
    public final /* synthetic */ C3113d f6960b;

    public RunnableC3114e(C3113d dVar, TrafficsMonitor.C3168a aVar) {
        this.f6960b = dVar;
        this.f6959a = aVar;
    }

    public void run() {
        TrafficsMonitor trafficsMonitor = this.f6960b.f6945c;
        if (trafficsMonitor != null) {
            trafficsMonitor.mo37749a(this.f6959a);
        }
    }
}
