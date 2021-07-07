package com.p118pd.sdk;

import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionGetCallback;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;

/* renamed from: com.pd.sdk.o0OO0ooO  reason: case insensitive filesystem */
public class C7380o0OO0ooO implements SessionGetCallback {
    public final /* synthetic */ long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ SessionCenter f20137OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ Request f20138OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ RequestStatistic f20139OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ HttpUrl f20140OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ C7446o0OOoooO f20141OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ boolean f20142OooO00o;

    public C7380o0OO0ooO(C7446o0OOoooO o0oooooo, RequestStatistic requestStatistic, long j, Request request, SessionCenter sessionCenter, HttpUrl httpUrl, boolean z) {
        this.f20141OooO00o = o0oooooo;
        this.f20139OooO00o = requestStatistic;
        this.OooO00o = j;
        this.f20138OooO00o = request;
        this.f20137OooO00o = sessionCenter;
        this.f20140OooO00o = httpUrl;
        this.f20142OooO00o = z;
    }

    @Override // anet.channel.SessionGetCallback
    public void onSessionGetFail() {
        ALog.m289e(C7446o0OOoooO.o0ooOoO, "onSessionGetFail", this.f20141OooO00o.f20278OooO00o.f20100OooO00o, "url", this.f20139OooO00o.url);
        this.f20139OooO00o.connWaitTime = System.currentTimeMillis() - this.OooO00o;
        C7446o0OOoooO o0oooooo = this.f20141OooO00o;
        o0oooooo.OooO00o(o0oooooo.OooO00o(null, this.f20137OooO00o, this.f20140OooO00o, this.f20142OooO00o), this.f20138OooO00o);
    }

    @Override // anet.channel.SessionGetCallback
    public void onSessionGetSuccess(Session session) {
        ALog.m290i(C7446o0OOoooO.o0ooOoO, "onSessionGetSuccess", this.f20141OooO00o.f20278OooO00o.f20100OooO00o, "Session", session);
        this.f20139OooO00o.connWaitTime = System.currentTimeMillis() - this.OooO00o;
        this.f20139OooO00o.spdyRequestSend = true;
        this.f20141OooO00o.OooO00o(session, this.f20138OooO00o);
    }
}
