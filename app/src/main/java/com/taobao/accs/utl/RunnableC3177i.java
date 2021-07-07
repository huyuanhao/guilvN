package com.taobao.accs.utl;

import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;

/* renamed from: com.taobao.accs.utl.i */
public final class RunnableC3177i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AccsDataListener f7219a;

    /* renamed from: b */
    public final /* synthetic */ String f7220b;

    /* renamed from: c */
    public final /* synthetic */ boolean f7221c;

    /* renamed from: d */
    public final /* synthetic */ boolean f7222d;

    /* renamed from: e */
    public final /* synthetic */ int f7223e;

    /* renamed from: f */
    public final /* synthetic */ String f7224f;

    public RunnableC3177i(AccsDataListener accsDataListener, String str, boolean z, boolean z2, int i, String str2) {
        this.f7219a = accsDataListener;
        this.f7220b = str;
        this.f7221c = z;
        this.f7222d = z2;
        this.f7223e = i;
        this.f7224f = str2;
    }

    public void run() {
        this.f7219a.onDisconnected(new TaoBaseService.ConnectInfo(this.f7220b, this.f7221c, this.f7222d, this.f7223e, this.f7224f));
    }
}
