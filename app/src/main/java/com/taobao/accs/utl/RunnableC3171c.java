package com.taobao.accs.utl;

import android.content.Intent;
import com.taobao.accs.base.AccsDataListener;

/* renamed from: com.taobao.accs.utl.c */
public final class RunnableC3171c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AccsDataListener f7192a;

    /* renamed from: b */
    public final /* synthetic */ String f7193b;

    /* renamed from: c */
    public final /* synthetic */ int f7194c;

    /* renamed from: d */
    public final /* synthetic */ Intent f7195d;

    public RunnableC3171c(AccsDataListener accsDataListener, String str, int i, Intent intent) {
        this.f7192a = accsDataListener;
        this.f7193b = str;
        this.f7194c = i;
        this.f7195d = intent;
    }

    public void run() {
        this.f7192a.onUnbind(this.f7193b, this.f7194c, C3169a.m7657b(this.f7195d));
    }
}
