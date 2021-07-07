package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.xiaomi.push.dv */
public class RunnableC4368dv implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f11632a;

    /* renamed from: a */
    public final /* synthetic */ Intent f11633a;

    /* renamed from: a */
    public final /* synthetic */ C4367du f11634a;

    public RunnableC4368dv(C4367du duVar, Context context, Intent intent) {
        this.f11634a = duVar;
        this.f11632a = context;
        this.f11633a = intent;
    }

    public void run() {
        this.f11634a.m12128b(this.f11632a, this.f11633a);
    }
}
