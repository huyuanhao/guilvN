package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.xiaomi.push.ai */
public class C4251ai {

    /* renamed from: a */
    public static volatile C4251ai f11355a;

    /* renamed from: a */
    public SharedPreferences f11356a;

    /* renamed from: a */
    public SparseArray<ScheduledFuture> f11357a = new SparseArray<>();

    /* renamed from: a */
    public Object f11358a = new Object();

    /* renamed from: a */
    public ScheduledThreadPoolExecutor f11359a = new ScheduledThreadPoolExecutor(1);

    /* renamed from: com.xiaomi.push.ai$a */
    public static abstract class AbstractRunnableC4252a implements Runnable {
        /* renamed from: a */
        public abstract int mo41384a();
    }

    /* renamed from: com.xiaomi.push.ai$b */
    public static class RunnableC4253b implements Runnable {

        /* renamed from: a */
        public AbstractRunnableC4252a f11360a;

        public RunnableC4253b(AbstractRunnableC4252a aVar) {
            this.f11360a = aVar;
        }

        /* renamed from: a */
        public void mo41480a() {
        }

        /* renamed from: b */
        public void mo41481b() {
        }

        public void run() {
            mo41480a();
            this.f11360a.run();
            mo41481b();
        }
    }

    public C4251ai(Context context) {
        this.f11356a = context.getSharedPreferences("mipush_extra", 0);
    }

    /* renamed from: a */
    public static C4251ai m11641a(Context context) {
        if (f11355a == null) {
            synchronized (C4251ai.class) {
                if (f11355a == null) {
                    f11355a = new C4251ai(context);
                }
            }
        }
        return f11355a;
    }

    /* renamed from: a */
    public static String mo41476a(int i) {
        return "last_job_time" + i;
    }

    /* renamed from: a */
    private ScheduledFuture m11644a(AbstractRunnableC4252a aVar) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f11358a) {
            scheduledFuture = this.f11357a.get(aVar.mo41384a());
        }
        return scheduledFuture;
    }

    /* renamed from: a */
    public void mo41474a(Runnable runnable) {
        mo41475a(runnable, 0);
    }

    /* renamed from: a */
    public void mo41475a(Runnable runnable, int i) {
        this.f11359a.schedule(runnable, (long) i, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public boolean m11647a(int i) {
        synchronized (this.f11358a) {
            ScheduledFuture scheduledFuture = this.f11357a.get(i);
            if (scheduledFuture == null) {
                return false;
            }
            this.f11357a.remove(i);
            return scheduledFuture.cancel(false);
        }
    }

    /* renamed from: a */
    public boolean mo41477a(AbstractRunnableC4252a aVar, int i) {
        return mo41478a(aVar, i, 0);
    }

    /* renamed from: a */
    public boolean mo41478a(AbstractRunnableC4252a aVar, int i, int i2) {
        if (aVar == null || m11644a(aVar) != null) {
            return false;
        }
        String a = mo41476a(aVar.mo41384a());
        C4254aj ajVar = new C4254aj(this, aVar, a);
        long abs = Math.abs(System.currentTimeMillis() - this.f11356a.getLong(a, 0)) / 1000;
        if (abs < ((long) (i - i2))) {
            i2 = (int) (((long) i) - abs);
        }
        try {
            ScheduledFuture<?> scheduleAtFixedRate = this.f11359a.scheduleAtFixedRate(ajVar, (long) i2, (long) i, TimeUnit.SECONDS);
            synchronized (this.f11358a) {
                this.f11357a.put(aVar.mo41384a(), scheduleAtFixedRate);
            }
            return true;
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo41479b(AbstractRunnableC4252a aVar, int i) {
        if (aVar == null || m11644a(aVar) != null) {
            return false;
        }
        ScheduledFuture<?> schedule = this.f11359a.schedule(new C4255ak(this, aVar), (long) i, TimeUnit.SECONDS);
        synchronized (this.f11358a) {
            this.f11357a.put(aVar.mo41384a(), schedule);
        }
        return true;
    }
}
