package com.p118pd.sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import p293rx.Notification;

/* renamed from: com.pd.sdk.lL1丨i丨丨丨  reason: invalid class name and case insensitive filesystem */
public final class C6564lL1i {

    /* renamed from: com.pd.sdk.lL1丨i丨丨丨$OooO00o */
    public static final class OooO00o<T> extends AbstractC9508LiLi<Notification<? extends T>> implements Iterator<T> {
        public static final int o0ooOO0 = ((ll1i1l.o0ooOO0 * 3) / 4);
        public final BlockingQueue<Notification<? extends T>> OooO00o = new LinkedBlockingQueue();

        /* renamed from: OooO00o  reason: collision with other field name */
        public Notification<? extends T> f18462OooO00o;
        public int o00oO0O;

        /* renamed from: OooO00o */
        public void onNext(Notification<? extends T> notification) {
            this.OooO00o.offer(notification);
        }

        public boolean hasNext() {
            if (this.f18462OooO00o == null) {
                this.f18462OooO00o = OooO00o();
                int i = this.o00oO0O + 1;
                this.o00oO0O = i;
                if (i >= o0ooOO0) {
                    request((long) i);
                    this.o00oO0O = 0;
                }
            }
            if (!this.f18462OooO00o.OooO0Oo()) {
                return !this.f18462OooO00o.OooO0OO();
            }
            throw IIl11.OooO00o(this.f18462OooO00o.m22991OooO00o());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) this.f18462OooO00o.m22990OooO00o();
                this.f18462OooO00o = null;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.offer(Notification.OooO00o(th));
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request((long) ll1i1l.o0ooOO0);
        }

        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator");
        }

        private Notification<? extends T> OooO00o() {
            try {
                Notification<? extends T> poll = this.OooO00o.poll();
                if (poll != null) {
                    return poll;
                }
                return this.OooO00o.take();
            } catch (InterruptedException e) {
                unsubscribe();
                throw IIl11.OooO00o((Throwable) e);
            }
        }
    }

    public C6564lL1i() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterator<T> OooO00o(C9349III<? extends T> r1) {
        OooO00o oooO00o = new OooO00o();
        r1.OooOO0o().OooO00o((AbstractC9508LiLi<? super Notification<? extends T>>) oooO00o);
        return oooO00o;
    }
}
