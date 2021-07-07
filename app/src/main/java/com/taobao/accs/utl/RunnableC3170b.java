package com.taobao.accs.utl;

import android.content.Intent;
import com.taobao.accs.base.AccsDataListener;

/* renamed from: com.taobao.accs.utl.b */
public final class RunnableC3170b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AccsDataListener f7188a;

    /* renamed from: b */
    public final /* synthetic */ String f7189b;

    /* renamed from: c */
    public final /* synthetic */ int f7190c;

    /* renamed from: d */
    public final /* synthetic */ Intent f7191d;

    public RunnableC3170b(AccsDataListener accsDataListener, String str, int i, Intent intent) {
        this.f7188a = accsDataListener;
        this.f7189b = str;
        this.f7190c = i;
        this.f7191d = intent;
    }

    public void run() {
        this.f7188a.onBind(this.f7189b, this.f7190c, C3169a.m7657b(this.f7191d));
    }
}
