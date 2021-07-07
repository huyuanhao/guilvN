package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;

/* renamed from: anet.channel.session.f */
public class RunnableC0168f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Request f290a;

    /* renamed from: b */
    public final /* synthetic */ RequestCb f291b;

    /* renamed from: c */
    public final /* synthetic */ RequestStatistic f292c;

    /* renamed from: d */
    public final /* synthetic */ C0166d f293d;

    public RunnableC0168f(C0166d dVar, Request request, RequestCb requestCb, RequestStatistic requestStatistic) {
        this.f293d = dVar;
        this.f290a = request;
        this.f291b = requestCb;
        this.f292c = requestStatistic;
    }

    public void run() {
        this.f290a.f219a.sendBeforeTime = System.currentTimeMillis() - this.f290a.f219a.reqStart;
        C0163b.m173a(this.f290a, new C0169g(this));
    }
}
