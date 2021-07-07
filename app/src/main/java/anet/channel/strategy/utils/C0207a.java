package anet.channel.strategy.utils;

import anet.channel.strategy.dispatch.C0186b;
import anet.channel.util.ALog;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anet.channel.strategy.utils.a */
public class C0207a {

    /* renamed from: a */
    public static AtomicInteger f450a = new AtomicInteger(0);

    /* renamed from: b */
    public static ScheduledThreadPoolExecutor f451b = null;

    /* renamed from: a */
    public static ScheduledThreadPoolExecutor m275a() {
        if (f451b == null) {
            synchronized (C0207a.class) {
                if (f451b == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new ThreadFactoryC0208b());
                    f451b = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
                    f451b.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f451b;
    }

    /* renamed from: a */
    public static void m276a(Runnable runnable) {
        try {
            m275a().submit(runnable);
        } catch (Exception e) {
            ALog.m288e(C0186b.TAG, "submit task failed", null, e, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m277a(Runnable runnable, long j) {
        try {
            m275a().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            ALog.m288e(C0186b.TAG, "schedule task failed", null, e, new Object[0]);
        }
    }
}
