package anet.channel;

import anet.channel.SessionRequest;
import anet.channel.entity.C0132b;
import anet.channel.entity.EventCb;
import anet.channel.util.ALog;

/* renamed from: anet.channel.e */
public class C0129e implements EventCb {

    /* renamed from: a */
    public final /* synthetic */ SessionRequest.IConnCb f144a;

    /* renamed from: b */
    public final /* synthetic */ long f145b;

    /* renamed from: c */
    public final /* synthetic */ SessionRequest f146c;

    public C0129e(SessionRequest sessionRequest, SessionRequest.IConnCb iConnCb, long j) {
        this.f146c = sessionRequest;
        this.f144a = iConnCb;
        this.f145b = j;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i, C0132b bVar) {
        String str;
        if (session != null) {
            int i2 = bVar == null ? 0 : bVar.f153b;
            if (bVar == null) {
                str = "";
            } else {
                str = bVar.f154c;
            }
            if (i == 2) {
                ALog.m287d("awcn.SessionRequest", null, session != null ? session.f53p : null, "Session", session, "EventType", Integer.valueOf(i), "Event", bVar);
                this.f146c.mo3392a(session, i2, str);
                SessionRequest sessionRequest = this.f146c;
                if (sessionRequest.f77b.mo3450c(sessionRequest, session)) {
                    this.f144a.onDisConnect(session, this.f145b, i);
                } else {
                    this.f144a.onFailed(session, this.f145b, i, i2);
                }
            } else if (i == 256) {
                ALog.m287d("awcn.SessionRequest", null, session != null ? session.f53p : null, "Session", session, "EventType", Integer.valueOf(i), "Event", bVar);
                this.f146c.mo3392a(session, i2, str);
                this.f144a.onFailed(session, this.f145b, i, i2);
            } else if (i == 512) {
                ALog.m287d("awcn.SessionRequest", null, session != null ? session.f53p : null, "Session", session, "EventType", Integer.valueOf(i), "Event", bVar);
                this.f146c.mo3392a(session, 0, (String) null);
                this.f144a.onSuccess(session, this.f145b);
            }
        }
    }
}
