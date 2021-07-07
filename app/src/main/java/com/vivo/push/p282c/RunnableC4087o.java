package com.vivo.push.p282c;

import com.vivo.push.p281b.C4050p;

/* renamed from: com.vivo.push.c.o */
public final class RunnableC4087o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4050p f10981a;

    /* renamed from: b */
    public final /* synthetic */ C4086n f10982b;

    public RunnableC4087o(C4086n nVar, C4050p pVar) {
        this.f10982b = nVar;
        this.f10981a = pVar;
    }

    public final void run() {
        C4086n nVar = this.f10982b;
        ((AbstractC4064ab) nVar).f10953b.onLog(nVar.f11150a, this.f10981a.mo40921d(), this.f10981a.mo40922e(), this.f10981a.mo40923f());
    }
}
