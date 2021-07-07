package anet.channel.heartbeat;

import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.heartbeat.b */
public class RunnableC0144b implements IHeartbeat, Runnable {

    /* renamed from: a */
    public Session f175a = null;

    /* renamed from: b */
    public volatile boolean f176b = false;

    /* renamed from: c */
    public volatile long f177c = System.currentTimeMillis();

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        this.f177c = System.currentTimeMillis() + 45000;
    }

    public void run() {
        if (!this.f176b) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < this.f177c - 1000) {
                ThreadPoolExecutorFactory.submitScheduledTask(this, this.f177c - currentTimeMillis, TimeUnit.MILLISECONDS);
            } else {
                this.f175a.close(false);
            }
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        if (session != null) {
            this.f175a = session;
            this.f177c = System.currentTimeMillis() + 45000;
            ThreadPoolExecutorFactory.submitScheduledTask(this, 45000, TimeUnit.MILLISECONDS);
            return;
        }
        throw new NullPointerException("session is null");
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        this.f176b = true;
    }
}
