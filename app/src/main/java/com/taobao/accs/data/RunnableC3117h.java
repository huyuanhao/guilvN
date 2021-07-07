package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import com.taobao.accs.net.AbstractC3137b;

/* renamed from: com.taobao.accs.data.h */
public final class RunnableC3117h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f6964a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC3137b f6965b;

    /* renamed from: c */
    public final /* synthetic */ Intent f6966c;

    public RunnableC3117h(Context context, AbstractC3137b bVar, Intent intent) {
        this.f6964a = context;
        this.f6965b = bVar;
        this.f6966c = intent;
    }

    public void run() {
        C3116g.m7380a().m7386b(this.f6964a, this.f6965b, this.f6966c);
    }
}
