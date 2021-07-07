package com.taobao.accs.utl;

import com.taobao.accs.utl.C3180l;

/* renamed from: com.taobao.accs.utl.n */
public class RunnableC3183n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3180l.RunnableC3181a f7249a;

    /* renamed from: b */
    public final /* synthetic */ C3180l f7250b;

    public RunnableC3183n(C3180l lVar, C3180l.RunnableC3181a aVar) {
        this.f7250b = lVar;
        this.f7249a = aVar;
    }

    public void run() {
        C3180l.f7234c.add(this.f7249a);
    }
}
