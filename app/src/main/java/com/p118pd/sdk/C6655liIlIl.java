package com.p118pd.sdk;

import com.p118pd.sdk.LL1LL;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.internal.schedulers.ScheduledAction;
import p293rx.internal.util.RxThreadFactory;
import p293rx.internal.util.SuppressAnimalSniffer;

/* renamed from: com.pd.sdk.liIlIl  reason: case insensitive filesystem */
public class C6655liIlIl extends LL1LL.OooO00o implements LlIiLii {
    public static volatile Object OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> f18610OooO00o = new ConcurrentHashMap<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final AtomicReference<ScheduledExecutorService> f18611OooO00o = new AtomicReference<>();
    public static final Object OooO0O0 = new Object();
    public static final boolean OooO0OO;
    public static final int o00oO0O = Integer.getInteger(o0ooOOo, 1000).intValue();
    public static final String o0OOO0o = "RxSchedulerPurge-";
    public static final String o0ooOOo = "rx.scheduler.jdk6.purge-frequency-millis";
    public static final String o0ooOoO = "rx.scheduler.jdk6.purge-force";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ScheduledExecutorService f18612OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public volatile boolean f18613OooO0O0;

    /* renamed from: com.pd.sdk.liIlIl$OooO00o */
    public static class OooO00o implements Runnable {
        public void run() {
            C6655liIlIl.OooO00o();
        }
    }

    static {
        boolean z = Boolean.getBoolean(o0ooOoO);
        int OooO00o2 = C5593L1ll.OooO00o();
        OooO0OO = !z && (OooO00o2 == 0 || OooO00o2 >= 21);
    }

    public C6655liIlIl(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!m17745OooO00o(newScheduledThreadPool) && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            OooO00o((ScheduledThreadPoolExecutor) newScheduledThreadPool);
        }
        this.f18612OooO00o = newScheduledThreadPool;
    }

    public static void OooO00o(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            if (f18611OooO00o.get() != null) {
                break;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory(o0OOO0o));
            if (f18611OooO00o.compareAndSet(null, newScheduledThreadPool)) {
                OooO00o oooO00o = new OooO00o();
                int i = o00oO0O;
                newScheduledThreadPool.scheduleAtFixedRate(oooO00o, (long) i, (long) i, TimeUnit.MILLISECONDS);
                break;
            }
            newScheduledThreadPool.shutdownNow();
        }
        f18610OooO00o.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    @Override // com.p118pd.sdk.LlIiLii
    public boolean isUnsubscribed() {
        return this.f18613OooO0O0;
    }

    @Override // com.p118pd.sdk.LlIiLii
    public void unsubscribe() {
        this.f18613OooO0O0 = true;
        this.f18612OooO00o.shutdownNow();
        m17744OooO00o(this.f18612OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m17744OooO00o(ScheduledExecutorService scheduledExecutorService) {
        f18610OooO00o.remove(scheduledExecutorService);
    }

    @SuppressAnimalSniffer
    public static void OooO00o() {
        try {
            Iterator<ScheduledThreadPoolExecutor> it = f18610OooO00o.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor next = it.next();
                if (!next.isShutdown()) {
                    next.purge();
                } else {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            IIl11.m15447OooO00o(th);
            C9714lli.m21756OooO00o(th);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17745OooO00o(ScheduledExecutorService scheduledExecutorService) {
        Method method;
        Object obj;
        if (OooO0OO) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj2 = OooO00o;
                if (obj2 == OooO0O0) {
                    return false;
                }
                if (obj2 == null) {
                    method = OooO00o(scheduledExecutorService);
                    if (method != null) {
                        obj = method;
                    } else {
                        obj = OooO0O0;
                    }
                    OooO00o = obj;
                } else {
                    method = (Method) obj2;
                }
            } else {
                method = OooO00o(scheduledExecutorService);
            }
            if (method != null) {
                try {
                    method.invoke(scheduledExecutorService, true);
                    return true;
                } catch (InvocationTargetException e) {
                    C9714lli.m21756OooO00o((Throwable) e);
                } catch (IllegalAccessException e2) {
                    C9714lli.m21756OooO00o((Throwable) e2);
                } catch (IllegalArgumentException e3) {
                    C9714lli.m21756OooO00o((Throwable) e3);
                }
            }
        }
        return false;
    }

    public static Method OooO00o(ScheduledExecutorService scheduledExecutorService) {
        Method[] methods = scheduledExecutorService.getClass().getMethods();
        for (Method method : methods) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    @Override // com.p118pd.sdk.LL1LL.OooO00o
    public LlIiLii OooO00o(liii1l r4) {
        return OooO00o(r4, 0L, (TimeUnit) null);
    }

    @Override // com.p118pd.sdk.LL1LL.OooO00o
    public LlIiLii OooO00o(liii1l r2, long j, TimeUnit timeUnit) {
        if (this.f18613OooO0O0) {
            return C9638ill.OooO0O0();
        }
        return m17746OooO00o(r2, j, timeUnit);
    }

    @Override // com.p118pd.sdk.LL1LL.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ScheduledAction m17746OooO00o(liii1l r4, long j, TimeUnit timeUnit) {
        Future<?> future;
        ScheduledAction scheduledAction = new ScheduledAction(C9714lli.OooO00o(r4));
        if (j <= 0) {
            future = this.f18612OooO00o.submit(scheduledAction);
        } else {
            future = this.f18612OooO00o.schedule(scheduledAction, j, timeUnit);
        }
        scheduledAction.add(future);
        return scheduledAction;
    }

    public ScheduledAction OooO00o(liii1l r4, long j, TimeUnit timeUnit, IIlIIiI1 iIlIIiI1) {
        Future<?> future;
        ScheduledAction scheduledAction = new ScheduledAction(C9714lli.OooO00o(r4), iIlIIiI1);
        iIlIIiI1.OooO00o(scheduledAction);
        if (j <= 0) {
            future = this.f18612OooO00o.submit(scheduledAction);
        } else {
            future = this.f18612OooO00o.schedule(scheduledAction, j, timeUnit);
        }
        scheduledAction.add(future);
        return scheduledAction;
    }

    public ScheduledAction OooO00o(liii1l r4, long j, TimeUnit timeUnit, C9862ll r8) {
        Future<?> future;
        ScheduledAction scheduledAction = new ScheduledAction(C9714lli.OooO00o(r4), r8);
        r8.OooO00o(scheduledAction);
        if (j <= 0) {
            future = this.f18612OooO00o.submit(scheduledAction);
        } else {
            future = this.f18612OooO00o.schedule(scheduledAction, j, timeUnit);
        }
        scheduledAction.add(future);
        return scheduledAction;
    }
}
