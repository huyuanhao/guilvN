package com.p118pd.sdk;

import java.io.PrintStream;
import java.util.Queue;
import p293rx.exceptions.MissingBackpressureException;
import p293rx.internal.operators.NotificationLite;

/* renamed from: com.pd.sdk.ll丨丨1i1l  reason: invalid class name */
public class ll1i1l implements LlIiLii {
    public static final int o0ooOO0;
    public volatile Object OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Queue<Object> f18863OooO00o;
    public final int o00oO0O;

    static {
        int i = C5593L1ll.m15992OooO00o() ? 16 : 128;
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                PrintStream printStream = System.err;
                printStream.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e.getMessage());
            }
        }
        o0ooOO0 = i;
    }

    public ll1i1l(Queue<Object> queue, int i) {
        this.f18863OooO00o = queue;
        this.o00oO0O = i;
    }

    public static ll1i1l OooO00o() {
        if (C11LI1.OooO00o()) {
            return new ll1i1l(true, o0ooOO0);
        }
        return new ll1i1l();
    }

    public static ll1i1l OooO0O0() {
        if (C11LI1.OooO00o()) {
            return new ll1i1l(false, o0ooOO0);
        }
        return new ll1i1l();
    }

    public int OooO0Oo() {
        return this.o00oO0O;
    }

    public int OooO0o0() {
        Queue<Object> queue = this.f18863OooO00o;
        if (queue == null) {
            return 0;
        }
        return queue.size();
    }

    @Override // com.p118pd.sdk.LlIiLii
    public boolean isUnsubscribed() {
        return this.f18863OooO00o == null;
    }

    @Override // com.p118pd.sdk.LlIiLii
    public void unsubscribe() {
        m17949OooO0O0();
    }

    public ll1i1l(boolean z, int i) {
        this.f18863OooO00o = z ? new C5613LI1<>(i) : new iI1L1i<>(i);
        this.o00oO0O = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17944OooO00o(Object obj) throws MissingBackpressureException {
        boolean z;
        boolean z2;
        synchronized (this) {
            Queue<Object> queue = this.f18863OooO00o;
            z = true;
            z2 = false;
            if (queue != null) {
                z2 = !queue.offer(NotificationLite.OooO0O0(obj));
                z = false;
            }
        }
        if (z) {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        } else if (z2) {
            throw new MissingBackpressureException();
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public synchronized void m17949OooO0O0() {
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m17947OooO0O0() {
        return this.o00oO0O - OooO0o0();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Object m17948OooO0O0() {
        synchronized (this) {
            Queue<Object> queue = this.f18863OooO00o;
            if (queue == null) {
                return null;
            }
            Object poll = queue.poll();
            Object obj = this.OooO00o;
            if (poll == null && obj != null && queue.peek() == null) {
                this.OooO00o = null;
                poll = obj;
            }
            return poll;
        }
    }

    public ll1i1l() {
        this(new i1Il1LL(o0ooOO0), o0ooOO0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17943OooO00o() {
        if (this.OooO00o == null) {
            this.OooO00o = NotificationLite.OooO00o();
        }
    }

    public void OooO00o(Throwable th) {
        if (this.OooO00o == null) {
            this.OooO00o = NotificationLite.OooO00o(th);
        }
    }

    public boolean OooO0O0(Object obj) {
        return NotificationLite.m23000OooO0O0(obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17945OooO00o() {
        Queue<Object> queue = this.f18863OooO00o;
        return queue == null || queue.isEmpty();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m17941OooO00o() {
        synchronized (this) {
            Queue<Object> queue = this.f18863OooO00o;
            if (queue == null) {
                return null;
            }
            Object peek = queue.peek();
            Object obj = this.OooO00o;
            if (peek == null && obj != null && queue.peek() == null) {
                peek = obj;
            }
            return peek;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17946OooO00o(Object obj) {
        return NotificationLite.m22999OooO00o(obj);
    }

    public Object OooO00o(Object obj) {
        return NotificationLite.OooO00o(obj);
    }

    public boolean OooO00o(Object obj, AbstractC5477Il11 r2) {
        return NotificationLite.OooO00o(r2, obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Throwable m17942OooO00o(Object obj) {
        return NotificationLite.m22998OooO00o(obj);
    }
}
