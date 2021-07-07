package anet.channel.p010f;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.C0131a;
import anet.channel.session.TnetSpdySession;
import anet.channel.strategy.IConnStrategy;
import java.util.List;
import org.android.spdy.SpdyAgent;

/* renamed from: anet.channel.f.c */
public final class RunnableC0137c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List f165a;

    public RunnableC0137c(List list) {
        this.f165a = list;
    }

    public void run() {
        if (C0135a.f162c.compareAndSet(false, true)) {
            SpdyAgent.InitializeCerts();
        }
        IConnStrategy iConnStrategy = (IConnStrategy) this.f165a.get(0);
        TnetSpdySession tnetSpdySession = new TnetSpdySession(GlobalAppRuntimeInfo.getContext(), new C0131a("https://" + C0135a.f160a, "QuicDetect" + C0135a.f164e.getAndIncrement(), iConnStrategy));
        tnetSpdySession.registerEventcb(257, new C0138d(this, iConnStrategy));
        tnetSpdySession.f54q.isCommitted = true;
        tnetSpdySession.connect();
    }
}
