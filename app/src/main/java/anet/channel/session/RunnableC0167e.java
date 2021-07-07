package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.entity.C0132b;
import anet.channel.request.Request;

/* renamed from: anet.channel.session.e */
public class RunnableC0167e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Request f288a;

    /* renamed from: b */
    public final /* synthetic */ C0166d f289b;

    public RunnableC0167e(C0166d dVar, Request request) {
        this.f289b = dVar;
        this.f288a = request;
    }

    public void run() {
        int i = C0163b.m173a(this.f288a, (RequestCb) null).f281a;
        if (i > 0) {
            this.f289b.notifyStatus(4, new C0132b(1));
        } else {
            this.f289b.handleCallbacks(256, new C0132b(256, i, "Http connect fail"));
        }
    }
}
