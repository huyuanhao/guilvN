package com.p118pd.sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.Notification;

/* renamed from: com.pd.sdk.l1IlIiL */
public final class l1IlIiL {

    /* renamed from: com.pd.sdk.l1IlIiL$OooO00o */
    public static class OooO00o implements Iterable<T> {
        public final /* synthetic */ C9349III OooO00o;

        public OooO00o(C9349III r1) {
            this.OooO00o = r1;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            OooO0O0 oooO0O0 = new OooO0O0();
            this.OooO00o.OooOO0o().OooO00o((AbstractC9508LiLi) oooO0O0);
            return oooO0O0;
        }
    }

    /* renamed from: com.pd.sdk.l1IlIiL$OooO0O0 */
    public static final class OooO0O0<T> extends AbstractC9508LiLi<Notification<? extends T>> implements Iterator<T> {
        public final Semaphore OooO00o = new Semaphore(0);

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicReference<Notification<? extends T>> f18254OooO00o = new AtomicReference<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public Notification<? extends T> f18255OooO00o;

        /* renamed from: OooO00o */
        public void onNext(Notification<? extends T> notification) {
            if (this.f18254OooO00o.getAndSet(notification) == null) {
                this.OooO00o.release();
            }
        }

        public boolean hasNext() {
            Notification<? extends T> notification = this.f18255OooO00o;
            if (notification == null || !notification.OooO0Oo()) {
                Notification<? extends T> notification2 = this.f18255OooO00o;
                if ((notification2 == null || !notification2.OooO0OO()) && this.f18255OooO00o == null) {
                    try {
                        this.OooO00o.acquire();
                        Notification<? extends T> andSet = this.f18254OooO00o.getAndSet(null);
                        this.f18255OooO00o = andSet;
                        if (andSet.OooO0Oo()) {
                            throw IIl11.OooO00o(this.f18255OooO00o.m22991OooO00o());
                        }
                    } catch (InterruptedException e) {
                        unsubscribe();
                        Thread.currentThread().interrupt();
                        this.f18255OooO00o = Notification.OooO00o((Throwable) e);
                        throw IIl11.OooO00o((Throwable) e);
                    }
                }
                return !this.f18255OooO00o.OooO0OO();
            }
            throw IIl11.OooO00o(this.f18255OooO00o.m22991OooO00o());
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext() || !this.f18255OooO00o.OooO0o0()) {
                throw new NoSuchElementException();
            }
            T t = (T) this.f18255OooO00o.m22990OooO00o();
            this.f18255OooO00o = null;
            return t;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
        }

        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    public l1IlIiL() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterable<T> OooO00o(C9349III<? extends T> r1) {
        return new OooO00o(r1);
    }
}
