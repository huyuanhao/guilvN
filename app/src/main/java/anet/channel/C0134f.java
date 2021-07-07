package anet.channel;

import anet.channel.entity.C0132b;
import anet.channel.entity.EventCb;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;

/* renamed from: anet.channel.f */
public class C0134f implements EventCb {

    /* renamed from: a */
    public final /* synthetic */ Session f158a;

    /* renamed from: b */
    public final /* synthetic */ SessionRequest f159b;

    public C0134f(SessionRequest sessionRequest, Session session) {
        this.f159b = sessionRequest;
        this.f158a = session;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i, C0132b bVar) {
        ALog.m287d("awcn.SessionRequest", "Receive session event", null, "eventType", Integer.valueOf(i));
        ConnEvent connEvent = new ConnEvent();
        if (i == 512) {
            connEvent.isSuccess = true;
        }
        StrategyCenter.getInstance().notifyConnEvent(this.f158a.getRealHost(), this.f158a.getConnStrategy(), connEvent);
    }
}
