package com.p118pd.sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p293rx.Notification;

/* renamed from: com.pd.sdk.丨L1L丨  reason: invalid class name and case insensitive filesystem */
public final class C9461L1L {

    /* renamed from: com.pd.sdk.丨L1L丨$OooO00o */
    public static class OooO00o implements Iterable<T> {
        public final /* synthetic */ C9349III OooO00o;

        public OooO00o(C9349III r1) {
            this.OooO00o = r1;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new OooO0O0(this.OooO00o, new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.丨L1L丨$OooO0O0 */
    public static final class OooO0O0<T> implements Iterator<T> {
        public final C9349III<? extends T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0OO<T> f23022OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public T f23023OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Throwable f23024OooO00o;
        public boolean OooO0O0 = true;
        public boolean OooO0OO = true;
        public boolean OooO0Oo;

        public OooO0O0(C9349III<? extends T> r2, OooO0OO<T> oooO0OO) {
            this.OooO00o = r2;
            this.f23022OooO00o = oooO0OO;
        }

        private boolean OooO00o() {
            try {
                if (!this.OooO0Oo) {
                    this.OooO0Oo = true;
                    this.f23022OooO00o.OooO00o(1);
                    this.OooO00o.OooOO0o().OooO00o((AbstractC9508LiLi<? super Notification<? extends T>>) this.f23022OooO00o);
                }
                Notification<? extends T> OooO00o2 = this.f23022OooO00o.OooO00o();
                if (OooO00o2.OooO0o0()) {
                    this.OooO0OO = false;
                    this.f23023OooO00o = (T) OooO00o2.m22990OooO00o();
                    return true;
                }
                this.OooO0O0 = false;
                if (OooO00o2.OooO0OO()) {
                    return false;
                }
                if (OooO00o2.OooO0Oo()) {
                    Throwable OooO00o3 = OooO00o2.m22991OooO00o();
                    this.f23024OooO00o = OooO00o3;
                    throw IIl11.OooO00o(OooO00o3);
                }
                throw new IllegalStateException("Should not reach here");
            } catch (InterruptedException e) {
                this.f23022OooO00o.unsubscribe();
                Thread.currentThread().interrupt();
                this.f23024OooO00o = e;
                throw IIl11.OooO00o((Throwable) e);
            }
        }

        public boolean hasNext() {
            Throwable th = this.f23024OooO00o;
            if (th != null) {
                throw IIl11.OooO00o(th);
            } else if (!this.OooO0O0) {
                return false;
            } else {
                if (!this.OooO0OO || OooO00o()) {
                    return true;
                }
                return false;
            }
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th = this.f23024OooO00o;
            if (th != null) {
                throw IIl11.OooO00o(th);
            } else if (hasNext()) {
                this.OooO0OO = true;
                return this.f23023OooO00o;
            } else {
                throw new NoSuchElementException("No more elements");
            }
        }

        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    public C9461L1L() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterable<T> OooO00o(C9349III<? extends T> r1) {
        return new OooO00o(r1);
    }

    /* renamed from: com.pd.sdk.丨L1L丨$OooO0OO */
    public static final class OooO0OO<T> extends AbstractC9508LiLi<Notification<? extends T>> {
        public final BlockingQueue<Notification<? extends T>> OooO00o = new ArrayBlockingQueue(1);

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f23025OooO00o = new AtomicInteger();

        /* renamed from: OooO00o */
        public void onNext(Notification<? extends T> notification) {
            if (this.f23025OooO00o.getAndSet(0) == 1 || !notification.OooO0o0()) {
                while (!this.OooO00o.offer(notification)) {
                    Notification<? extends T> poll = this.OooO00o.poll();
                    if (poll != null && !poll.OooO0o0()) {
                        notification = poll;
                    }
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
        }

        public Notification<? extends T> OooO00o() throws InterruptedException {
            OooO00o(1);
            return this.OooO00o.take();
        }

        public void OooO00o(int i) {
            this.f23025OooO00o.set(i);
        }
    }
}
