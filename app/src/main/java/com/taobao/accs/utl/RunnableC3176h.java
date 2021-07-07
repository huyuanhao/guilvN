package com.taobao.accs.utl;

import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;

/* renamed from: com.taobao.accs.utl.h */
public final class RunnableC3176h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AccsDataListener f7215a;

    /* renamed from: b */
    public final /* synthetic */ String f7216b;

    /* renamed from: c */
    public final /* synthetic */ boolean f7217c;

    /* renamed from: d */
    public final /* synthetic */ boolean f7218d;

    public RunnableC3176h(AccsDataListener accsDataListener, String str, boolean z, boolean z2) {
        this.f7215a = accsDataListener;
        this.f7216b = str;
        this.f7217c = z;
        this.f7218d = z2;
    }

    public void run() {
        this.f7215a.onConnected(new TaoBaseService.ConnectInfo(this.f7216b, this.f7217c, this.f7218d));
    }
}
