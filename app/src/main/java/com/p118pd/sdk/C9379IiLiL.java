package com.p118pd.sdk;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.pd.sdk.丨IiLi丨L  reason: invalid class name and case insensitive filesystem */
public final class C9379IiLiL {

    /* renamed from: com.pd.sdk.丨IiLi丨L$OooO00o */
    public static class OooO00o extends AbstractC9508LiLi<T> {
        public final /* synthetic */ CountDownLatch OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicReference f22925OooO00o;
        public final /* synthetic */ AtomicReference OooO0O0;

        public OooO00o(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.OooO00o = countDownLatch;
            this.f22925OooO00o = atomicReference;
            this.OooO0O0 = atomicReference2;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f22925OooO00o.compareAndSet(null, th);
            this.OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.OooO0O0.set(t);
        }
    }

    public C9379IiLiL() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Future<T> OooO00o(C9349III<? extends T> r4) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        return new OooO0O0(countDownLatch, r4.OooOo0O().OooO00o((AbstractC9508LiLi<? super Object>) new OooO00o(countDownLatch, atomicReference2, atomicReference)), atomicReference2, atomicReference);
    }

    /* renamed from: com.pd.sdk.丨IiLi丨L$OooO0O0 */
    public static class OooO0O0 implements Future<T> {
        public final /* synthetic */ LlIiLii OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ CountDownLatch f22926OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicReference f22927OooO00o;
        public final /* synthetic */ AtomicReference OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public volatile boolean f22928OooO0O0;

        public OooO0O0(CountDownLatch countDownLatch, LlIiLii llIiLii, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f22926OooO00o = countDownLatch;
            this.OooO00o = llIiLii;
            this.f22927OooO00o = atomicReference;
            this.OooO0O0 = atomicReference2;
        }

        private T OooO00o() throws ExecutionException {
            Throwable th = (Throwable) this.f22927OooO00o.get();
            if (th != null) {
                throw new ExecutionException("Observable onError", th);
            } else if (!this.f22928OooO0O0) {
                return (T) this.OooO0O0.get();
            } else {
                throw new CancellationException("Subscription unsubscribed");
            }
        }

        public boolean cancel(boolean z) {
            if (this.f22926OooO00o.getCount() <= 0) {
                return false;
            }
            this.f22928OooO0O0 = true;
            this.OooO00o.unsubscribe();
            this.f22926OooO00o.countDown();
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            this.f22926OooO00o.await();
            return (T) OooO00o();
        }

        public boolean isCancelled() {
            return this.f22928OooO0O0;
        }

        public boolean isDone() {
            return this.f22926OooO00o.getCount() == 0;
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            if (this.f22926OooO00o.await(j, timeUnit)) {
                return (T) OooO00o();
            }
            throw new TimeoutException("Timed out after " + timeUnit.toMillis(j) + "ms waiting for underlying Observable.");
        }
    }
}
