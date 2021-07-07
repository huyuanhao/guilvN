package com.p118pd.sdk;

import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.entity.C0133c;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.HttpUrl;

/* renamed from: com.pd.sdk.o0OO0oo0  reason: case insensitive filesystem */
public class RunnableC7379o0OO0oo0 implements Runnable {
    public final /* synthetic */ SessionCenter OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ RequestStatistic f20133OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ HttpUrl f20134OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ C7446o0OOoooO f20135OooO00o;
    public final /* synthetic */ HttpUrl OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final /* synthetic */ boolean f20136OooO0O0;

    public RunnableC7379o0OO0oo0(C7446o0OOoooO o0oooooo, SessionCenter sessionCenter, HttpUrl httpUrl, RequestStatistic requestStatistic, HttpUrl httpUrl2, boolean z) {
        this.f20135OooO00o = o0oooooo;
        this.OooO00o = sessionCenter;
        this.f20134OooO00o = httpUrl;
        this.f20133OooO00o = requestStatistic;
        this.OooO0O0 = httpUrl2;
        this.f20136OooO0O0 = z;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        Session session = this.OooO00o.get(this.f20134OooO00o, C0133c.f155a, 3000);
        this.f20133OooO00o.connWaitTime = System.currentTimeMillis() - currentTimeMillis;
        this.f20133OooO00o.spdyRequestSend = session != null;
        Session session2 = this.f20135OooO00o.OooO00o(session, this.OooO00o, this.OooO0O0, this.f20136OooO0O0);
        C7446o0OOoooO o0oooooo = this.f20135OooO00o;
        o0oooooo.OooO00o(session2, o0oooooo.f20278OooO00o.f20099OooO00o.m19127OooO00o());
    }
}
