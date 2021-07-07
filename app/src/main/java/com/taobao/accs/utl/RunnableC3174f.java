package com.taobao.accs.utl;

import android.content.Intent;
import com.taobao.accs.base.AccsDataListener;

/* renamed from: com.taobao.accs.utl.f */
public final class RunnableC3174f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AccsDataListener f7208a;

    /* renamed from: b */
    public final /* synthetic */ String f7209b;

    /* renamed from: c */
    public final /* synthetic */ String f7210c;

    /* renamed from: d */
    public final /* synthetic */ int f7211d;

    /* renamed from: e */
    public final /* synthetic */ Intent f7212e;

    public RunnableC3174f(AccsDataListener accsDataListener, String str, String str2, int i, Intent intent) {
        this.f7208a = accsDataListener;
        this.f7209b = str;
        this.f7210c = str2;
        this.f7211d = i;
        this.f7212e = intent;
    }

    public void run() {
        this.f7208a.onSendData(this.f7209b, this.f7210c, this.f7211d, C3169a.m7657b(this.f7212e));
    }
}
