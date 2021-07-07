package anet.channel.p010f;

import anet.channel.Session;
import anet.channel.entity.C0132b;
import anet.channel.entity.EventCb;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;

/* renamed from: anet.channel.f.d */
public class C0138d implements EventCb {

    /* renamed from: a */
    public final /* synthetic */ IConnStrategy f166a;

    /* renamed from: b */
    public final /* synthetic */ RunnableC0137c f167b;

    public C0138d(RunnableC0137c cVar, IConnStrategy iConnStrategy) {
        this.f167b = cVar;
        this.f166a = iConnStrategy;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i, C0132b bVar) {
        ConnEvent connEvent = new ConnEvent();
        if (i == 1) {
            connEvent.isSuccess = true;
        }
        StrategyCenter.getInstance().notifyConnEvent(C0135a.f160a, this.f166a, connEvent);
        session.close(false);
    }
}
