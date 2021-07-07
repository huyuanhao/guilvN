package com.vivo.push.p282c;

import com.vivo.push.model.UnvarnishedMessage;

/* renamed from: com.vivo.push.c.q */
public final class RunnableC4089q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UnvarnishedMessage f10983a;

    /* renamed from: b */
    public final /* synthetic */ C4088p f10984b;

    public RunnableC4089q(C4088p pVar, UnvarnishedMessage unvarnishedMessage) {
        this.f10984b = pVar;
        this.f10983a = unvarnishedMessage;
    }

    public final void run() {
        C4088p pVar = this.f10984b;
        ((AbstractC4064ab) pVar).f10953b.onTransmissionMessage(pVar.f11150a, this.f10983a);
    }
}
