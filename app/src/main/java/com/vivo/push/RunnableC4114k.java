package com.vivo.push;

/* renamed from: com.vivo.push.k */
public final class RunnableC4114k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ RunnableC4113j f11021a;

    public RunnableC4114k(RunnableC4113j jVar) {
        this.f11021a = jVar;
    }

    public final void run() {
        RunnableC4113j jVar = this.f11021a;
        jVar.f11019b.onTransmissionMessage(jVar.f11020c.mContext, this.f11021a.f11018a);
    }
}
