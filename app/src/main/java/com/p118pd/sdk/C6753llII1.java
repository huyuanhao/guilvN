package com.p118pd.sdk;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.exceptions.OnErrorNotImplementedException;
import p293rx.functions.Actions;
import p293rx.internal.operators.NotificationLite;
import p293rx.internal.util.UtilityFunctions;

/* renamed from: com.pd.sdk.llII1  reason: case insensitive filesystem */
public final class C6753llII1<T> {
    public static final Object OooO00o = new Object();
    public static final Object OooO0O0 = new Object();
    public static final Object OooO0OO = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<? extends T> f18728OooO00o;

    /* renamed from: com.pd.sdk.llII1$OooO */
    public class OooO implements AbstractC5477Il11<T> {
        public final /* synthetic */ AbstractC6153iL1l OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ liii1l f18730OooO00o;
        public final /* synthetic */ AbstractC6153iL1l OooO0O0;

        public OooO(AbstractC6153iL1l il1l, AbstractC6153iL1l il1l2, liii1l r4) {
            this.OooO00o = il1l;
            this.OooO0O0 = il1l2;
            this.f18730OooO00o = r4;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f18730OooO00o.call();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO0O0.call(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.OooO00o.call(t);
        }
    }

    /* renamed from: com.pd.sdk.llII1$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {
        public final /* synthetic */ AbstractC6153iL1l OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ CountDownLatch f18732OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicReference f18733OooO00o;

        public OooO00o(CountDownLatch countDownLatch, AtomicReference atomicReference, AbstractC6153iL1l il1l) {
            this.f18732OooO00o = countDownLatch;
            this.f18733OooO00o = atomicReference;
            this.OooO00o = il1l;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f18732OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f18733OooO00o.set(th);
            this.f18732OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.OooO00o.call(t);
        }
    }

    /* renamed from: com.pd.sdk.llII1$OooO0O0 */
    public class OooO0O0 implements Iterable<T> {
        public OooO0O0() {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C6753llII1.this.m17849OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.llII1$OooO0OO */
    public class OooO0OO extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ CountDownLatch f18734OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicReference f18735OooO00o;
        public final /* synthetic */ AtomicReference OooO0O0;

        public OooO0OO(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f18734OooO00o = countDownLatch;
            this.f18735OooO00o = atomicReference;
            this.OooO0O0 = atomicReference2;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f18734OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f18735OooO00o.set(th);
            this.f18734OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.OooO0O0.set(t);
        }
    }

    /* renamed from: com.pd.sdk.llII1$OooO0Oo  reason: case insensitive filesystem */
    public class C6754OooO0Oo extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ CountDownLatch f18736OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Throwable[] f18737OooO00o;

        public C6754OooO0Oo(Throwable[] thArr, CountDownLatch countDownLatch) {
            this.f18737OooO00o = thArr;
            this.f18736OooO00o = countDownLatch;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f18736OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f18737OooO00o[0] = th;
            this.f18736OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
        }
    }

    /* renamed from: com.pd.sdk.llII1$OooO0o */
    public class OooO0o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ BlockingQueue f18738OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9465L1l1[] f18739OooO00o;

        public OooO0o(BlockingQueue blockingQueue, AbstractC9465L1l1[] r3) {
            this.f18738OooO00o = blockingQueue;
            this.f18739OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f18738OooO00o.offer(NotificationLite.OooO00o());
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f18738OooO00o.offer(NotificationLite.OooO00o(th));
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.f18738OooO00o.offer(NotificationLite.OooO0O0((Object) t));
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            this.f18738OooO00o.offer(C6753llII1.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r3) {
            this.f18739OooO00o[0] = r3;
            this.f18738OooO00o.offer(C6753llII1.OooO0O0);
        }
    }

    /* renamed from: com.pd.sdk.llII1$OooO0o0  reason: case insensitive filesystem */
    public class C6755OooO0o0 extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ BlockingQueue f18740OooO00o;

        public C6755OooO0o0(BlockingQueue blockingQueue) {
            this.f18740OooO00o = blockingQueue;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f18740OooO00o.offer(NotificationLite.OooO00o());
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f18740OooO00o.offer(NotificationLite.OooO00o(th));
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.f18740OooO00o.offer(NotificationLite.OooO0O0((Object) t));
        }
    }

    /* renamed from: com.pd.sdk.llII1$OooO0oO  reason: case insensitive filesystem */
    public class C6756OooO0oO implements liii1l {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ BlockingQueue f18741OooO00o;

        public C6756OooO0oO(BlockingQueue blockingQueue) {
            this.f18741OooO00o = blockingQueue;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            this.f18741OooO00o.offer(C6753llII1.OooO0OO);
        }
    }

    /* renamed from: com.pd.sdk.llII1$OooO0oo  reason: case insensitive filesystem */
    public class C6757OooO0oo implements AbstractC6153iL1l<Throwable> {
        public C6757OooO0oo() {
        }

        /* renamed from: OooO00o */
        public void call(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    }

    public C6753llII1(C9349III<? extends T> r1) {
        this.f18728OooO00o = r1;
    }

    public static <T> C6753llII1<T> OooO00o(C9349III<? extends T> r1) {
        return new C6753llII1<>(r1);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public T m17852OooO0O0() {
        return m17846OooO00o((C9349III) this.f18728OooO00o.OooOO0O());
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public T m17853OooO0OO() {
        return m17846OooO00o((C9349III) this.f18728OooO00o.OooOo0O());
    }

    public void OooO00o(AbstractC6153iL1l<? super T> il1l) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        C5915Lil.OooO00o(countDownLatch, this.f18728OooO00o.OooO00o((AbstractC9508LiLi<? super Object>) new OooO00o(countDownLatch, atomicReference, il1l)));
        if (atomicReference.get() != null) {
            IIl11.OooO00o((Throwable) atomicReference.get());
        }
    }

    public T OooO0O0(AbstractC9847l1<? super T, Boolean> r2) {
        return m17846OooO00o((C9349III) this.f18728OooO00o.OooOOo(r2));
    }

    public T OooO0OO(AbstractC9847l1<? super T, Boolean> r2) {
        return m17846OooO00o((C9349III) this.f18728OooO00o.OooOoO(r2));
    }

    public T OooO0O0(T t) {
        return m17846OooO00o((C9349III) this.f18728OooO00o.OooOOoo(UtilityFunctions.OooO0OO()).OooO0Oo((R) t));
    }

    public T OooO0OO(T t) {
        return m17846OooO00o((C9349III) this.f18728OooO00o.OooOOoo(UtilityFunctions.OooO0OO()).OooO0o0((R) t));
    }

    public T OooO0O0(T t, AbstractC9847l1<? super T, Boolean> r3) {
        return m17846OooO00o((C9349III) this.f18728OooO00o.OooOO0O(r3).OooOOoo(UtilityFunctions.OooO0OO()).OooO0Oo((R) t));
    }

    public T OooO0OO(T t, AbstractC9847l1<? super T, Boolean> r3) {
        return m17846OooO00o((C9349III) this.f18728OooO00o.OooOO0O(r3).OooOOoo(UtilityFunctions.OooO0OO()).OooO0o0((R) t));
    }

    public Iterable<T> OooO0O0() {
        return C9461L1L.OooO00o(this.f18728OooO00o);
    }

    public Iterable<T> OooO0OO() {
        return new OooO0O0();
    }

    public void OooO0O0(AbstractC6153iL1l<? super T> il1l) {
        OooO00o(il1l, new C6757OooO0oo(), Actions.m22996OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Iterator<T> m17849OooO00o() {
        return C6564lL1i.OooO00o(this.f18728OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m17847OooO00o() {
        return m17846OooO00o((C9349III) this.f18728OooO00o.OooO0oo());
    }

    public T OooO00o(AbstractC9847l1<? super T, Boolean> r2) {
        return m17846OooO00o((C9349III) this.f18728OooO00o.OooOO0o(r2));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m17848OooO00o(T t) {
        return m17846OooO00o((C9349III) this.f18728OooO00o.OooOOoo(UtilityFunctions.OooO0OO()).OooO0OO((R) t));
    }

    public T OooO00o(T t, AbstractC9847l1<? super T, Boolean> r3) {
        return m17846OooO00o((C9349III) this.f18728OooO00o.OooOO0O(r3).OooOOoo(UtilityFunctions.OooO0OO()).OooO0OO((R) t));
    }

    public Iterable<T> OooO00o(T t) {
        return LLLLL.OooO00o(this.f18728OooO00o, t);
    }

    public Iterable<T> OooO00o() {
        return l1IlIiL.OooO00o(this.f18728OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Future<T> m17850OooO00o() {
        return C9379IiLiL.OooO00o(this.f18728OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private T m17846OooO00o(C9349III<? extends T> r5) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C5915Lil.OooO00o(countDownLatch, r5.OooO00o((AbstractC9508LiLi<? super Object>) new OooO0OO(countDownLatch, atomicReference2, atomicReference)));
        if (atomicReference2.get() != null) {
            IIl11.OooO00o((Throwable) atomicReference2.get());
        }
        return (T) atomicReference.get();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17851OooO00o() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = {null};
        C5915Lil.OooO00o(countDownLatch, this.f18728OooO00o.OooO00o((AbstractC9508LiLi<? super Object>) new C6754OooO0Oo(thArr, countDownLatch)));
        Throwable th = thArr[0];
        if (th != null) {
            IIl11.OooO00o(th);
        }
    }

    public void OooO00o(AbstractC5477Il11<? super T> r4) {
        Object poll;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        LlIiLii OooO00o2 = this.f18728OooO00o.OooO00o((AbstractC9508LiLi<? super Object>) new C6755OooO0o0(linkedBlockingQueue));
        do {
            try {
                poll = linkedBlockingQueue.poll();
                if (poll == null) {
                    poll = linkedBlockingQueue.take();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                r4.onError(e);
                return;
            } finally {
                OooO00o2.unsubscribe();
            }
        } while (!NotificationLite.OooO00o(r4, poll));
    }

    public void OooO00o(AbstractC9508LiLi<? super T> r7) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        AbstractC9465L1l1[] r1 = {null};
        OooO0o oooO0o = new OooO0o(linkedBlockingQueue, r1);
        r7.add(oooO0o);
        r7.add(C9638ill.OooO00o(new C6756OooO0oO(linkedBlockingQueue)));
        this.f18728OooO00o.OooO00o((AbstractC9508LiLi<? super Object>) oooO0o);
        while (true) {
            try {
                if (r7.isUnsubscribed()) {
                    break;
                }
                Object poll = linkedBlockingQueue.poll();
                if (poll == null) {
                    poll = linkedBlockingQueue.take();
                }
                if (r7.isUnsubscribed()) {
                    break;
                } else if (poll == OooO0OO) {
                    break;
                } else if (poll == OooO00o) {
                    r7.onStart();
                } else if (poll == OooO0O0) {
                    r7.setProducer(r1[0]);
                } else if (NotificationLite.OooO00o(r7, poll)) {
                    oooO0o.unsubscribe();
                    return;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                r7.onError(e);
            } catch (Throwable th) {
                oooO0o.unsubscribe();
                throw th;
            }
        }
        oooO0o.unsubscribe();
    }

    public void OooO00o(AbstractC6153iL1l<? super T> il1l, AbstractC6153iL1l<? super Throwable> il1l2) {
        OooO00o(il1l, il1l2, Actions.m22996OooO00o());
    }

    public void OooO00o(AbstractC6153iL1l<? super T> il1l, AbstractC6153iL1l<? super Throwable> il1l2, liii1l r4) {
        OooO00o((AbstractC5477Il11) new OooO(il1l, il1l2, r4));
    }
}
