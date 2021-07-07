package com.taobao.accs.utl;

import com.taobao.accs.base.AccsDataListener;

/* renamed from: com.taobao.accs.utl.g */
public final class RunnableC3175g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AccsDataListener f7213a;

    /* renamed from: b */
    public final /* synthetic */ boolean f7214b;

    public RunnableC3175g(AccsDataListener accsDataListener, boolean z) {
        this.f7213a = accsDataListener;
        this.f7214b = z;
    }

    public void run() {
        this.f7213a.onAntiBrush(this.f7214b, null);
    }
}
