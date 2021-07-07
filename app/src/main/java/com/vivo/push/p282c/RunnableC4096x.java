package com.vivo.push.p282c;

import com.vivo.push.model.UPSNotificationMessage;

/* renamed from: com.vivo.push.c.x */
public final class RunnableC4096x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UPSNotificationMessage f10994a;

    /* renamed from: b */
    public final /* synthetic */ C4092t f10995b;

    public RunnableC4096x(C4092t tVar, UPSNotificationMessage uPSNotificationMessage) {
        this.f10995b = tVar;
        this.f10994a = uPSNotificationMessage;
    }

    public final void run() {
        C4092t tVar = this.f10995b;
        ((AbstractC4064ab) tVar).f10953b.onNotificationMessageClicked(tVar.f11150a, this.f10994a);
    }
}
