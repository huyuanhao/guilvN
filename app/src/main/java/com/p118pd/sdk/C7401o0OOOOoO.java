package com.p118pd.sdk;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.o0OOOOoO  reason: case insensitive filesystem */
public class C7401o0OOOOoO implements Closeable {
    public final Object OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<C7388o0OOO0oo> f20218OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ScheduledExecutorService f20219OooO00o = C7386o0OOO0o0.m18916OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ScheduledFuture<?> f20220OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;

    /* renamed from: com.pd.sdk.o0OOOOoO$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            synchronized (C7401o0OOOOoO.this.OooO00o) {
                C7401o0OOOOoO.this.f20220OooO00o = null;
            }
            C7401o0OOOOoO.this.m18943OooO00o();
        }
    }

    private void OooO0Oo() {
        if (this.OooO0OO) {
            throw new IllegalStateException("Object already closed");
        }
    }

    public void OooO0O0() throws CancellationException {
        synchronized (this.OooO00o) {
            OooO0Oo();
            if (this.OooO0O0) {
                throw new CancellationException();
            }
        }
    }

    public void OooO0OO(long j) {
        OooO00o(j, TimeUnit.MILLISECONDS);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.OooO00o) {
            if (!this.OooO0OO) {
                OooO0OO();
                for (C7388o0OOO0oo o0ooo0oo : this.f20218OooO00o) {
                    o0ooo0oo.close();
                }
                this.f20218OooO00o.clear();
                this.OooO0OO = true;
            }
        }
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", C7401o0OOOOoO.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(m18944OooO00o()));
    }

    private void OooO0OO() {
        ScheduledFuture<?> scheduledFuture = this.f20220OooO00o;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f20220OooO00o = null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18944OooO00o() {
        boolean z;
        synchronized (this.OooO00o) {
            OooO0Oo();
            z = this.OooO0O0;
        }
        return z;
    }

    public C7387o0OOO0oO OooO00o() {
        C7387o0OOO0oO o0ooo0oo;
        synchronized (this.OooO00o) {
            OooO0Oo();
            o0ooo0oo = new C7387o0OOO0oO(this);
        }
        return o0ooo0oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18943OooO00o() {
        synchronized (this.OooO00o) {
            OooO0Oo();
            if (!this.OooO0O0) {
                OooO0OO();
                this.OooO0O0 = true;
                OooO00o(new ArrayList(this.f20218OooO00o));
            }
        }
    }

    private void OooO00o(long j, TimeUnit timeUnit) {
        if (j < -1) {
            throw new IllegalArgumentException("Delay must be >= -1");
        } else if (j == 0) {
            m18943OooO00o();
        } else {
            synchronized (this.OooO00o) {
                if (!this.OooO0O0) {
                    OooO0OO();
                    if (j != -1) {
                        this.f20220OooO00o = this.f20219OooO00o.schedule(new OooO00o(), j, timeUnit);
                    }
                }
            }
        }
    }

    public C7388o0OOO0oo OooO00o(Runnable runnable) {
        C7388o0OOO0oo o0ooo0oo;
        synchronized (this.OooO00o) {
            OooO0Oo();
            o0ooo0oo = new C7388o0OOO0oo(this, runnable);
            if (this.OooO0O0) {
                o0ooo0oo.OooO00o();
            } else {
                this.f20218OooO00o.add(o0ooo0oo);
            }
        }
        return o0ooo0oo;
    }

    public void OooO00o(C7388o0OOO0oo o0ooo0oo) {
        synchronized (this.OooO00o) {
            OooO0Oo();
            this.f20218OooO00o.remove(o0ooo0oo);
        }
    }

    private void OooO00o(List<C7388o0OOO0oo> list) {
        for (C7388o0OOO0oo o0ooo0oo : list) {
            o0ooo0oo.OooO00o();
        }
    }
}
