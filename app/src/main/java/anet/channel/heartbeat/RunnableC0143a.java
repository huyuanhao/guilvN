package anet.channel.heartbeat;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.umeng.analytics.pro.C3416b;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.heartbeat.a */
public class RunnableC0143a implements IHeartbeat, Runnable {

    /* renamed from: a */
    public Session f171a;

    /* renamed from: b */
    public volatile long f172b = 0;

    /* renamed from: c */
    public volatile boolean f173c = false;

    /* renamed from: d */
    public long f174d = 0;

    /* renamed from: a */
    private void m95a(long j) {
        try {
            this.f172b = System.currentTimeMillis() + j;
            ThreadPoolExecutorFactory.submitScheduledTask(this, j + 50, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            ALog.m288e("awcn.DefaultHeartbeatImpl", "Submit heartbeat task failed.", this.f171a.f53p, e, new Object[0]);
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        this.f172b = System.currentTimeMillis() + this.f174d;
    }

    public void run() {
        if (!this.f173c) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < this.f172b - 1000) {
                m95a(this.f172b - currentTimeMillis);
            } else if (!GlobalAppRuntimeInfo.isAppBackground()) {
                if (ALog.isPrintLog(1)) {
                    Session session = this.f171a;
                    ALog.m287d("awcn.DefaultHeartbeatImpl", "heartbeat", session.f53p, C3416b.f8468at, session);
                }
                this.f171a.ping(true);
                m95a(this.f174d);
            } else {
                Session session2 = this.f171a;
                ALog.m289e("awcn.DefaultHeartbeatImpl", "close session in background", session2.f53p, C3416b.f8468at, session2);
                this.f171a.close(false);
            }
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        if (session != null) {
            this.f171a = session;
            long heartbeat = (long) session.getConnStrategy().getHeartbeat();
            this.f174d = heartbeat;
            if (heartbeat <= 0) {
                this.f174d = 45000;
            }
            ALog.m290i("awcn.DefaultHeartbeatImpl", "heartbeat start", session.f53p, C3416b.f8468at, session, "interval", Long.valueOf(this.f174d));
            m95a(this.f174d);
            return;
        }
        throw new NullPointerException("session is null");
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        Session session = this.f171a;
        if (session != null) {
            ALog.m290i("awcn.DefaultHeartbeatImpl", "heartbeat stop", session.f53p, C3416b.f8468at, session);
            this.f173c = true;
        }
    }
}
