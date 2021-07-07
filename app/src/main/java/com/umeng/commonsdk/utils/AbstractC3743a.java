package com.umeng.commonsdk.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: com.umeng.commonsdk.utils.a */
public abstract class AbstractC3743a {

    /* renamed from: e */
    public static final int f9802e = 1;

    /* renamed from: a */
    public final long f9803a;

    /* renamed from: b */
    public final long f9804b;

    /* renamed from: c */
    public long f9805c;

    /* renamed from: d */
    public boolean f9806d = false;

    /* renamed from: f */
    public HandlerThread f9807f;

    /* renamed from: g */
    public Handler f9808g;

    /* renamed from: h */
    public Handler.Callback f9809h = new Handler.Callback() {
        /* class com.umeng.commonsdk.utils.AbstractC3743a.C37441 */

        public boolean handleMessage(Message message) {
            synchronized (AbstractC3743a.this) {
                if (AbstractC3743a.this.f9806d) {
                    return true;
                }
                long elapsedRealtime = AbstractC3743a.this.f9805c - SystemClock.elapsedRealtime();
                if (elapsedRealtime <= 0) {
                    AbstractC3743a.this.mo38829a();
                    if (AbstractC3743a.this.f9807f != null) {
                        AbstractC3743a.this.f9807f.quit();
                    }
                } else if (elapsedRealtime < AbstractC3743a.this.f9804b) {
                    AbstractC3743a.this.f9808g.sendMessageDelayed(AbstractC3743a.this.f9808g.obtainMessage(1), elapsedRealtime);
                } else {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    AbstractC3743a.this.mo38830a(elapsedRealtime);
                    long elapsedRealtime3 = (elapsedRealtime2 + AbstractC3743a.this.f9804b) - SystemClock.elapsedRealtime();
                    while (elapsedRealtime3 < 0) {
                        elapsedRealtime3 += AbstractC3743a.this.f9804b;
                    }
                    AbstractC3743a.this.f9808g.sendMessageDelayed(AbstractC3743a.this.f9808g.obtainMessage(1), elapsedRealtime3);
                }
                return false;
            }
        }
    };

    public AbstractC3743a(long j, long j2) {
        this.f9803a = j;
        this.f9804b = j2;
        if (!m10213d()) {
            HandlerThread handlerThread = new HandlerThread("CountDownTimerThread");
            this.f9807f = handlerThread;
            handlerThread.start();
            this.f9808g = new Handler(this.f9807f.getLooper(), this.f9809h);
            return;
        }
        this.f9808g = new Handler(this.f9809h);
    }

    /* renamed from: a */
    public abstract void mo38829a();

    /* renamed from: a */
    public abstract void mo38830a(long j);

    /* renamed from: d */
    private boolean m10213d() {
        return Looper.getMainLooper().getThread().equals(Thread.currentThread());
    }

    /* renamed from: b */
    public final synchronized void mo39469b() {
        this.f9806d = true;
        this.f9808g.removeMessages(1);
    }

    /* renamed from: c */
    public final synchronized AbstractC3743a mo39470c() {
        this.f9806d = false;
        if (this.f9803a <= 0) {
            mo38829a();
            return this;
        }
        this.f9805c = SystemClock.elapsedRealtime() + this.f9803a;
        this.f9808g.sendMessage(this.f9808g.obtainMessage(1));
        return this;
    }
}
