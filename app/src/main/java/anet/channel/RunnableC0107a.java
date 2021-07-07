package anet.channel;

import anet.channel.entity.C0132b;
import anet.channel.entity.EventCb;
import anet.channel.util.ALog;

/* renamed from: anet.channel.a */
public class RunnableC0107a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f98a;

    /* renamed from: b */
    public final /* synthetic */ C0132b f99b;

    /* renamed from: c */
    public final /* synthetic */ Session f100c;

    public RunnableC0107a(Session session, int i, C0132b bVar) {
        this.f100c = session;
        this.f98a = i;
        this.f99b = bVar;
    }

    public void run() {
        try {
            if (this.f100c.f39b != null) {
                for (EventCb eventCb : this.f100c.f39b.keySet()) {
                    if (!(eventCb == null || (this.f100c.f39b.get(eventCb).intValue() & this.f98a) == 0)) {
                        try {
                            eventCb.onEvent(this.f100c, this.f98a, this.f99b);
                        } catch (Exception e) {
                            ALog.m289e("awcn.Session", e.toString(), this.f100c.f53p, new Object[0]);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            ALog.m288e("awcn.Session", "handleCallbacks", this.f100c.f53p, e2, new Object[0]);
        }
    }
}
