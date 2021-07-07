package anet.channel;

import anet.channel.SessionRequest;
import anet.channel.util.C0229i;

/* renamed from: anet.channel.g */
public class RunnableC0141g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Session f169a;

    /* renamed from: b */
    public final /* synthetic */ SessionRequest.C0104a f170b;

    public RunnableC0141g(SessionRequest.C0104a aVar, Session session) {
        this.f170b = aVar;
        this.f169a = session;
    }

    public void run() {
        try {
            SessionRequest.this.mo3389a(this.f170b.f90c, this.f169a.getConnType().getType(), C0229i.m330a(SessionRequest.this.f76a.f67c), (SessionGetCallback) null, 0);
        } catch (Exception unused) {
        }
    }
}
