package anet.channel.session;

import anet.channel.IAuth;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.statist.SessionStatistic;
import anet.channel.util.ALog;

/* renamed from: anet.channel.session.i */
public class C0171i implements IAuth.AuthCallback {

    /* renamed from: a */
    public final /* synthetic */ TnetSpdySession f296a;

    public C0171i(TnetSpdySession tnetSpdySession) {
        this.f296a = tnetSpdySession;
    }

    @Override // anet.channel.IAuth.AuthCallback
    public void onAuthFail(int i, String str) {
        this.f296a.notifyStatus(5, null);
        SessionStatistic sessionStatistic = this.f296a.f54q;
        if (sessionStatistic != null) {
            sessionStatistic.closeReason = "Accs_Auth_Fail:" + i;
            this.f296a.f54q.errorCode = (long) i;
        }
        this.f296a.close();
    }

    @Override // anet.channel.IAuth.AuthCallback
    public void onAuthSuccess() {
        this.f296a.notifyStatus(4, null);
        this.f296a.f275z = System.currentTimeMillis();
        TnetSpdySession tnetSpdySession = this.f296a;
        IHeartbeat iHeartbeat = tnetSpdySession.f267D;
        if (iHeartbeat != null) {
            iHeartbeat.start(tnetSpdySession);
        }
        TnetSpdySession tnetSpdySession2 = this.f296a;
        SessionStatistic sessionStatistic = tnetSpdySession2.f54q;
        sessionStatistic.ret = 1;
        ALog.m287d("awcn.TnetSpdySession", "spdyOnStreamResponse", tnetSpdySession2.f53p, "authTime", Long.valueOf(sessionStatistic.authTime));
        TnetSpdySession tnetSpdySession3 = this.f296a;
        if (tnetSpdySession3.f264A > 0) {
            tnetSpdySession3.f54q.authTime = System.currentTimeMillis() - this.f296a.f264A;
        }
    }
}
