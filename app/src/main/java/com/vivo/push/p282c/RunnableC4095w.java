package com.vivo.push.p282c;

import com.vivo.push.model.UPSNotificationMessage;

/* renamed from: com.vivo.push.c.w */
public final class RunnableC4095w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UPSNotificationMessage f10992a;

    /* renamed from: b */
    public final /* synthetic */ C4092t f10993b;

    public RunnableC4095w(C4092t tVar, UPSNotificationMessage uPSNotificationMessage) {
        this.f10993b = tVar;
        this.f10992a = uPSNotificationMessage;
    }

    public final void run() {
        C4092t tVar = this.f10993b;
        ((AbstractC4064ab) tVar).f10953b.onNotificationMessageClicked(tVar.f11150a, this.f10992a);
    }
}
