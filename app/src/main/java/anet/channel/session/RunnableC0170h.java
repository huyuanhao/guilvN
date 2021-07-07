package anet.channel.session;

import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;

/* renamed from: anet.channel.session.h */
public class RunnableC0170h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TnetSpdySession f295a;

    public RunnableC0170h(TnetSpdySession tnetSpdySession) {
        this.f295a = tnetSpdySession;
    }

    public void run() {
        if (this.f295a.f274y) {
            TnetSpdySession tnetSpdySession = this.f295a;
            ALog.m289e("awcn.TnetSpdySession", "send msg time out!", tnetSpdySession.f53p, "pingUnRcv:", Boolean.valueOf(tnetSpdySession.f274y));
            try {
                this.f295a.handleCallbacks(2048, null);
                if (this.f295a.f54q != null) {
                    this.f295a.f54q.closeReason = "ping time out";
                }
                ConnEvent connEvent = new ConnEvent();
                connEvent.isSuccess = false;
                StrategyCenter.getInstance().notifyConnEvent(this.f295a.f41d, this.f295a.f48k, connEvent);
                this.f295a.close(true);
            } catch (Exception unused) {
            }
        }
    }
}
