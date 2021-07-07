package com.vivo.push.p282c;

import com.vivo.push.p281b.C4054t;

/* renamed from: com.vivo.push.c.aa */
public final class RunnableC4063aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4054t f10951a;

    /* renamed from: b */
    public final /* synthetic */ C4098z f10952b;

    public RunnableC4063aa(C4098z zVar, C4054t tVar) {
        this.f10952b = zVar;
        this.f10951a = tVar;
    }

    public final void run() {
        C4098z zVar = this.f10952b;
        ((AbstractC4064ab) zVar).f10953b.onPublish(zVar.f11150a, this.f10951a.mo40932h(), this.f10951a.mo40931g());
    }
}
