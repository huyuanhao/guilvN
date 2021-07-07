package com.taobao.accs.net;

import anet.channel.Session;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.umeng.analytics.pro.C3416b;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.taobao.accs.net.s */
public class RunnableC3155s implements IHeartbeat, Runnable {

    /* renamed from: a */
    public static final String f7072a = RunnableC3155s.class.getSimpleName();

    /* renamed from: b */
    public Session f7073b;

    /* renamed from: c */
    public long f7074c = 45000;

    /* renamed from: d */
    public volatile int f7075d = 1;

    /* renamed from: e */
    public Future f7076e;

    /* renamed from: a */
    public void mo37697a(int i) {
        if (this.f7075d == i || this.f7075d + i <= 1) {
            this.f7075d = i;
            return;
        }
        String str = f7072a;
        ALog.m7600i(str, "reset state, last state: " + this.f7075d + " current state: " + i, new Object[0]);
        this.f7075d = i;
        this.f7074c = this.f7075d < 2 ? 45000 : 270000;
        reSchedule();
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        ALog.m7599e(f7072a, "reSchedule ", new Object[0]);
        m7538a(this.f7074c);
    }

    public void run() {
        ALog.m7599e(f7072a, "ping ", new Object[0]);
        this.f7073b.ping(true);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        if (session != null) {
            this.f7073b = session;
            this.f7074c = this.f7075d < 2 ? 45000 : 270000;
            ALog.m7600i(f7072a, "heartbeat start", session.mSeq, C3416b.f8468at, session, "interval", Long.valueOf(this.f7074c));
            m7538a(this.f7074c);
            return;
        }
        throw new NullPointerException("session is null");
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        Future future;
        ALog.m7600i(f7072a, "heartbeat stop", this.f7073b.mSeq, C3416b.f8468at, this.f7073b);
        if (this.f7073b != null && (future = this.f7076e) != null) {
            future.cancel(true);
        }
    }

    /* renamed from: a */
    private synchronized void m7538a(long j) {
        try {
            String str = f7072a;
            ALog.m7600i(str, "submit ping current delay: " + j, new Object[0]);
            if (this.f7076e != null) {
                this.f7076e.cancel(false);
                this.f7076e = null;
            }
            this.f7076e = ThreadPoolExecutorFactory.submitScheduledTask(this, j + 50, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            ALog.m7599e(f7072a, "Submit heartbeat task failed.", this.f7073b.mSeq, e);
        }
        return;
    }
}
