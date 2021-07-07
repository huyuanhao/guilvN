package anet.channel.p008d;

import anet.channel.Session;
import anet.channel.entity.C0132b;
import anet.channel.entity.EventCb;
import anet.channel.request.Request;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.HorseRaceStat;
import anet.channel.strategy.C0198l;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;

/* renamed from: anet.channel.d.e */
public final class C0126e implements EventCb {

    /* renamed from: a */
    public final /* synthetic */ HorseRaceStat f136a;

    /* renamed from: b */
    public final /* synthetic */ long f137b;

    /* renamed from: c */
    public final /* synthetic */ String f138c;

    /* renamed from: d */
    public final /* synthetic */ C0198l.C0203e f139d;

    /* renamed from: e */
    public final /* synthetic */ TnetSpdySession f140e;

    public C0126e(HorseRaceStat horseRaceStat, long j, String str, C0198l.C0203e eVar, TnetSpdySession tnetSpdySession) {
        this.f136a = horseRaceStat;
        this.f137b = j;
        this.f138c = str;
        this.f139d = eVar;
        this.f140e = tnetSpdySession;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i, C0132b bVar) {
        if (this.f136a.connTime == 0) {
            this.f136a.connTime = System.currentTimeMillis() - this.f137b;
            if (i == 1) {
                ALog.m290i("awcn.NetworkDetector", "tnetSpdySession connect success", this.f138c, new Object[0]);
                this.f136a.connRet = 1;
                HttpUrl parse = HttpUrl.parse(session.getHost() + this.f139d.f445c);
                if (parse != null) {
                    this.f140e.request(new Request.Builder().setUrl(parse).setReadTimeout(this.f139d.f444b.f417d).setRedirectEnable(false).setSeq(this.f138c).build(), new C0127f(this));
                    return;
                }
                return;
            }
            this.f136a.connErrorCode = bVar.f153b;
            synchronized (this.f136a) {
                this.f136a.notify();
            }
        }
    }
}
