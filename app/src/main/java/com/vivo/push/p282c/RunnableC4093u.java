package com.vivo.push.p282c;

import com.vivo.push.model.UPSNotificationMessage;

/* renamed from: com.vivo.push.c.u */
public final class RunnableC4093u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UPSNotificationMessage f10988a;

    /* renamed from: b */
    public final /* synthetic */ C4092t f10989b;

    public RunnableC4093u(C4092t tVar, UPSNotificationMessage uPSNotificationMessage) {
        this.f10989b = tVar;
        this.f10988a = uPSNotificationMessage;
    }

    public final void run() {
        C4092t tVar = this.f10989b;
        ((AbstractC4064ab) tVar).f10953b.onNotificationMessageClicked(tVar.f11150a, this.f10988a);
    }
}
