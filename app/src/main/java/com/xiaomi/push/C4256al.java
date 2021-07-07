package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.xiaomi.push.al */
public class C4256al {

    /* renamed from: a */
    public int f11364a;

    /* renamed from: a */
    public Handler f11365a;

    /* renamed from: a */
    public C4257a f11366a;

    /* renamed from: a */
    public volatile AbstractC4258b f11367a;

    /* renamed from: a */
    public volatile boolean f11368a;

    /* renamed from: b */
    public final boolean f11369b;

    /* renamed from: com.xiaomi.push.al$a */
    public class C4257a extends Thread {

        /* renamed from: a */
        public final LinkedBlockingQueue<AbstractC4258b> f11371a = new LinkedBlockingQueue<>();

        public C4257a() {
            super("PackageProcessor");
        }

        /* renamed from: a */
        private void m11665a(int i, AbstractC4258b bVar) {
            try {
                C4256al.this.f11365a.sendMessage(C4256al.this.f11365a.obtainMessage(i, bVar));
            } catch (Exception e) {
                AbstractC4163b.m11303a(e);
            }
        }

        /* renamed from: a */
        public void mo41485a(AbstractC4258b bVar) {
            try {
                this.f11371a.add(bVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void run() {
            long j = C4256al.this.f11364a > 0 ? (long) C4256al.this.f11364a : Long.MAX_VALUE;
            while (!C4256al.this.f11368a) {
                try {
                    AbstractC4258b poll = this.f11371a.poll(j, TimeUnit.SECONDS);
                    C4256al.this.f11367a = poll;
                    if (poll != null) {
                        m11665a(0, poll);
                        poll.mo41488b();
                        m11665a(1, poll);
                    } else if (C4256al.this.f11364a > 0) {
                        C4256al.this.m11660a();
                    }
                } catch (InterruptedException e) {
                    AbstractC4163b.m11303a(e);
                }
            }
        }
    }

    /* renamed from: com.xiaomi.push.al$b */
    public static abstract class AbstractC4258b {
        /* renamed from: a */
        public void mo41487a() {
        }

        /* renamed from: b */
        public abstract void mo41488b();

        /* renamed from: c */
        public void mo41489c() {
        }
    }

    public C4256al() {
        this(false);
    }

    public C4256al(boolean z) {
        this(z, 0);
    }

    public C4256al(boolean z, int i) {
        this.f11365a = null;
        this.f11368a = false;
        this.f11364a = 0;
        this.f11365a = new HandlerC4259am(this, Looper.getMainLooper());
        this.f11369b = z;
        this.f11364a = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private synchronized void m11660a() {
        this.f11366a = null;
        this.f11368a = true;
    }

    /* renamed from: a */
    public synchronized void mo41483a(AbstractC4258b bVar) {
        if (this.f11366a == null) {
            C4257a aVar = new C4257a();
            this.f11366a = aVar;
            aVar.setDaemon(this.f11369b);
            this.f11368a = false;
            this.f11366a.start();
        }
        this.f11366a.mo41485a(bVar);
    }

    /* renamed from: a */
    public void mo41484a(AbstractC4258b bVar, long j) {
        this.f11365a.postDelayed(new RunnableC4260an(this, bVar), j);
    }
}
