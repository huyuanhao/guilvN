package org.android.agoo.control;

import android.content.Intent;

/* renamed from: org.android.agoo.control.k */
public class RunnableC4804k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f13463a;

    /* renamed from: b */
    public final /* synthetic */ BaseIntentService f13464b;

    public RunnableC4804k(BaseIntentService baseIntentService, Intent intent) {
        this.f13464b = baseIntentService;
        this.f13463a = intent;
    }

    public void run() {
        this.f13464b.onHandleIntent(this.f13463a);
    }
}
