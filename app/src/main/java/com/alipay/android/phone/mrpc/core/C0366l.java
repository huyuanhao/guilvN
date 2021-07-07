package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alipay.android.phone.mrpc.core.l */
public final class C0366l implements AbstractC0350ab {

    /* renamed from: b */
    public static C0366l f808b;

    /* renamed from: i */
    public static final ThreadFactory f809i = new ThreadFactoryC0368n();

    /* renamed from: a */
    public Context f810a;

    /* renamed from: c */
    public ThreadPoolExecutor f811c;

    /* renamed from: d */
    public C0353b f812d = C0353b.m654a("android");

    /* renamed from: e */
    public long f813e;

    /* renamed from: f */
    public long f814f;

    /* renamed from: g */
    public long f815g;

    /* renamed from: h */
    public int f816h;

    public C0366l(Context context) {
        this.f810a = context;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3, TimeUnit.SECONDS, new ArrayBlockingQueue(20), f809i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.f811c = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f810a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    /* renamed from: a */
    public static final C0366l m682a(Context context) {
        C0366l lVar = f808b;
        return lVar != null ? lVar : m683b(context);
    }

    /* renamed from: b */
    public static final synchronized C0366l m683b(Context context) {
        synchronized (C0366l.class) {
            if (f808b != null) {
                return f808b;
            }
            C0366l lVar = new C0366l(context);
            f808b = lVar;
            return lVar;
        }
    }

    /* renamed from: a */
    public final C0353b mo4149a() {
        return this.f812d;
    }

    @Override // com.alipay.android.phone.mrpc.core.AbstractC0350ab
    /* renamed from: a */
    public final Future<C0375u> mo4122a(AbstractC0374t tVar) {
        if (C0373s.m720a(this.f810a)) {
            String str = "HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times";
            Object[] objArr = new Object[9];
            objArr[0] = Integer.valueOf(this.f811c.getActiveCount());
            objArr[1] = Long.valueOf(this.f811c.getCompletedTaskCount());
            objArr[2] = Long.valueOf(this.f811c.getTaskCount());
            long j = this.f815g;
            long j2 = 0;
            objArr[3] = Long.valueOf(j == 0 ? 0 : ((this.f813e * 1000) / j) >> 10);
            int i = this.f816h;
            if (i != 0) {
                j2 = this.f814f / ((long) i);
            }
            objArr[4] = Long.valueOf(j2);
            objArr[5] = Long.valueOf(this.f813e);
            objArr[6] = Long.valueOf(this.f814f);
            objArr[7] = Long.valueOf(this.f815g);
            objArr[8] = Integer.valueOf(this.f816h);
            String.format(str, objArr);
        }
        CallableC0371q qVar = new CallableC0371q(this, (C0369o) tVar);
        C0367m mVar = new C0367m(this, qVar, qVar);
        this.f811c.execute(mVar);
        return mVar;
    }

    /* renamed from: a */
    public final void mo4150a(long j) {
        this.f813e += j;
    }

    /* renamed from: b */
    public final void mo4151b(long j) {
        this.f814f += j;
        this.f816h++;
    }

    /* renamed from: c */
    public final void mo4152c(long j) {
        this.f815g += j;
    }
}
