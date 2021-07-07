package com.umeng.message.inapp;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: com.umeng.message.inapp.c */
public abstract class AbstractC3805c {

    /* renamed from: a */
    public static final String f10273a = "com.umeng.message.inapp.c";

    /* renamed from: g */
    public static final int f10274g = 1;

    /* renamed from: h */
    public static final int f10275h = 2;

    /* renamed from: b */
    public final long f10276b;

    /* renamed from: c */
    public final long f10277c;

    /* renamed from: d */
    public long f10278d;

    /* renamed from: e */
    public long f10279e;

    /* renamed from: f */
    public boolean f10280f = false;

    /* renamed from: i */
    public Handler f10281i = new Handler() {
        /* class com.umeng.message.inapp.AbstractC3805c.HandlerC38061 */

        public void handleMessage(Message message) {
            synchronized (AbstractC3805c.this) {
                if (message.what == 1) {
                    if (!AbstractC3805c.this.f10280f) {
                        long elapsedRealtime = AbstractC3805c.this.f10278d - SystemClock.elapsedRealtime();
                        if (elapsedRealtime <= 0) {
                            AbstractC3805c.this.mo39854e();
                        } else if (elapsedRealtime < AbstractC3805c.this.f10277c) {
                            AbstractC3805c.this.mo39853a(elapsedRealtime);
                            sendMessageDelayed(obtainMessage(1), elapsedRealtime);
                        } else {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            AbstractC3805c.this.mo39853a(elapsedRealtime);
                            long elapsedRealtime3 = (elapsedRealtime2 + AbstractC3805c.this.f10277c) - SystemClock.elapsedRealtime();
                            while (elapsedRealtime3 < 0) {
                                elapsedRealtime3 += AbstractC3805c.this.f10277c;
                            }
                            sendMessageDelayed(obtainMessage(1), elapsedRealtime3);
                        }
                    }
                }
            }
        }
    };

    public AbstractC3805c(long j, long j2) {
        this.f10276b = j;
        this.f10277c = j2;
    }

    /* renamed from: a */
    public abstract void mo39853a(long j);

    /* renamed from: d */
    public final synchronized AbstractC3805c mo39860d() {
        this.f10280f = false;
        if (this.f10279e <= 0) {
            return this;
        }
        this.f10281i.removeMessages(2);
        this.f10278d = this.f10279e + SystemClock.elapsedRealtime();
        this.f10281i.sendMessageAtFrontOfQueue(this.f10281i.obtainMessage(1));
        return this;
    }

    /* renamed from: e */
    public abstract void mo39854e();

    /* renamed from: a */
    public final synchronized void mo39857a() {
        this.f10280f = true;
        this.f10281i.removeMessages(1);
    }

    /* renamed from: b */
    public final synchronized AbstractC3805c mo39858b() {
        this.f10280f = false;
        if (this.f10276b <= 0) {
            mo39854e();
            return this;
        }
        this.f10278d = SystemClock.elapsedRealtime() + this.f10276b;
        this.f10281i.sendMessage(this.f10281i.obtainMessage(1));
        return this;
    }

    /* renamed from: c */
    public final synchronized AbstractC3805c mo39859c() {
        this.f10280f = false;
        long elapsedRealtime = this.f10278d - SystemClock.elapsedRealtime();
        this.f10279e = elapsedRealtime;
        if (elapsedRealtime <= 0) {
            return this;
        }
        this.f10281i.removeMessages(1);
        this.f10281i.sendMessageAtFrontOfQueue(this.f10281i.obtainMessage(2));
        return this;
    }
}
