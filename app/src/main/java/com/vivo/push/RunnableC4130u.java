package com.vivo.push;

import com.vivo.push.C4121p;

/* renamed from: com.vivo.push.u */
public final class RunnableC4130u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f11084a;

    /* renamed from: b */
    public final /* synthetic */ C4121p f11085b;

    public RunnableC4130u(C4121p pVar, String str) {
        this.f11085b = pVar;
        this.f11084a = str;
    }

    public final void run() {
        C4121p.C4122a aVar = this.f11085b.m11088c(this.f11084a);
        if (aVar != null) {
            aVar.mo41136a(1003, new Object[0]);
        }
    }
}
