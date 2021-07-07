package org.android.agoo.control;

import android.content.Intent;

/* renamed from: org.android.agoo.control.h */
public class RunnableC4801h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f13459a;

    /* renamed from: b */
    public final /* synthetic */ HandlerC4800g f13460b;

    public RunnableC4801h(HandlerC4800g gVar, Intent intent) {
        this.f13460b = gVar;
        this.f13459a = intent;
    }

    public void run() {
        this.f13460b.f13458a.onHandleIntent(this.f13459a);
    }
}
