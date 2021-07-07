package com.vivo.push.p282c;

import com.vivo.push.model.UPSNotificationMessage;

/* renamed from: com.vivo.push.c.v */
public final class RunnableC4094v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UPSNotificationMessage f10990a;

    /* renamed from: b */
    public final /* synthetic */ C4092t f10991b;

    public RunnableC4094v(C4092t tVar, UPSNotificationMessage uPSNotificationMessage) {
        this.f10991b = tVar;
        this.f10990a = uPSNotificationMessage;
    }

    public final void run() {
        C4092t tVar = this.f10991b;
        ((AbstractC4064ab) tVar).f10953b.onNotificationMessageClicked(tVar.f11150a, this.f10990a);
    }
}
