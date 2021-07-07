package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p293rx.internal.operators.NotificationLite;

/* renamed from: com.pd.sdk.lII丨l  reason: invalid class name and case insensitive filesystem */
public final class C6497lIIl<R, T> implements C9349III.OooO0O0<R, T> {
    public static final Object OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC5189I1l1l<R, ? super T, R> f18364OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LiLIll<R> f18365OooO00o;

    /* renamed from: com.pd.sdk.lII丨l$OooO00o */
    public class OooO00o implements LiLIll<R> {
        public final /* synthetic */ Object OooO00o;

        public OooO00o(Object obj) {
            this.OooO00o = obj;
        }

        @Override // java.util.concurrent.Callable, com.p118pd.sdk.LiLIll
        public R call() {
            return (R) this.OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.lII丨l$OooO0O0 */
    public class OooO0O0 extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f18366OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public R f18367OooO00o;
        public boolean OooO0O0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0O0(AbstractC9508LiLi r2, AbstractC9508LiLi r3) {
            super(r2);
            this.f18366OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f18366OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f18366OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            R r;
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                r = t;
            } else {
                try {
                    r = C6497lIIl.this.f18364OooO00o.OooO00o(this.f18367OooO00o, t);
                } catch (Throwable th) {
                    IIl11.OooO00o(th, this.f18366OooO00o, t);
                    return;
                }
            }
            this.f18367OooO00o = r;
            this.f18366OooO00o.onNext(r);
        }
    }

    /* renamed from: com.pd.sdk.lII丨l$OooO0OO */
    public class OooO0OO extends AbstractC9508LiLi<T> {
        public final /* synthetic */ C6498OooO0Oo OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public R f18369OooO00o = ((R) this.OooO0O0);
        public final /* synthetic */ Object OooO0O0;

        public OooO0OO(Object obj, C6498OooO0Oo oooO0Oo) {
            this.OooO0O0 = obj;
            this.OooO00o = oooO0Oo;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            try {
                R OooO00o2 = C6497lIIl.this.f18364OooO00o.OooO00o(this.f18369OooO00o, t);
                this.f18369OooO00o = OooO00o2;
                this.OooO00o.onNext(OooO00o2);
            } catch (Throwable th) {
                IIl11.OooO00o(th, this, t);
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r2) {
            this.OooO00o.setProducer(r2);
        }
    }

    public C6497lIIl(R r, AbstractC5189I1l1l<R, ? super T, R> r3) {
        this((LiLIll) new OooO00o(r), (AbstractC5189I1l1l) r3);
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super R> r4) {
        R call = this.f18365OooO00o.call();
        if (call == OooO00o) {
            return new OooO0O0(r4, r4);
        }
        C6498OooO0Oo oooO0Oo = new C6498OooO0Oo(call, r4);
        OooO0OO oooO0OO = new OooO0OO(call, oooO0Oo);
        r4.add(oooO0OO);
        r4.setProducer(oooO0Oo);
        return oooO0OO;
    }

    public C6497lIIl(LiLIll<R> r1, AbstractC5189I1l1l<R, ? super T, R> r2) {
        this.f18365OooO00o = r1;
        this.f18364OooO00o = r2;
    }

    /* renamed from: com.pd.sdk.lII丨l$OooO0Oo  reason: case insensitive filesystem */
    public static final class C6498OooO0Oo<R> implements AbstractC9465L1l1, AbstractC5477Il11<R> {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile AbstractC9465L1l1 f18370OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super R> f18371OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Throwable f18372OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Queue<Object> f18373OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicLong f18374OooO00o;
        public boolean OooO0O0;
        public boolean OooO0OO;
        public volatile boolean OooO0Oo;

        public C6498OooO0Oo(R r, AbstractC9508LiLi<? super R> r2) {
            Queue<Object> queue;
            this.f18371OooO00o = r2;
            if (C11LI1.OooO00o()) {
                queue = new C5306ILi1<>();
            } else {
                queue = new C6089iIIiLL<>();
            }
            this.f18373OooO00o = queue;
            queue.offer(NotificationLite.OooO0O0((Object) r));
            this.f18374OooO00o = new AtomicLong();
        }

        public boolean OooO00o(boolean z, boolean z2, AbstractC9508LiLi<? super R> r5) {
            if (r5.isUnsubscribed()) {
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f18372OooO00o;
            if (th != null) {
                r5.onError(th);
                return true;
            } else if (!z2) {
                return false;
            } else {
                r5.onCompleted();
                return true;
            }
        }

        public void OooO0O0() {
            AbstractC9508LiLi<? super R> r0 = this.f18371OooO00o;
            Queue<Object> queue = this.f18373OooO00o;
            AtomicLong atomicLong = this.f18374OooO00o;
            long j = atomicLong.get();
            while (!OooO00o(this.OooO0Oo, queue.isEmpty(), r0)) {
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.OooO0Oo;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!OooO00o(z, z2, r0)) {
                        if (z2) {
                            break;
                        }
                        Object obj = (Object) NotificationLite.OooO00o(poll);
                        try {
                            r0.onNext(obj);
                            j2++;
                        } catch (Throwable th) {
                            IIl11.OooO00o(th, r0, obj);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                    j = C6211iLli.OooO0O0(atomicLong, j2);
                }
                synchronized (this) {
                    if (!this.OooO0OO) {
                        this.OooO0O0 = false;
                        return;
                    }
                    this.OooO0OO = false;
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO0Oo = true;
            OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f18372OooO00o = th;
            this.OooO0Oo = true;
            OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(R r) {
            this.f18373OooO00o.offer(NotificationLite.OooO0O0((Object) r));
            OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j);
            } else if (j != 0) {
                C6211iLli.OooO00o(this.f18374OooO00o, j);
                AbstractC9465L1l1 r0 = this.f18370OooO00o;
                if (r0 == null) {
                    synchronized (this.f18374OooO00o) {
                        r0 = this.f18370OooO00o;
                        if (r0 == null) {
                            this.OooO00o = C6211iLli.OooO00o(this.OooO00o, j);
                        }
                    }
                }
                if (r0 != null) {
                    r0.request(j);
                }
                OooO00o();
            }
        }

        public void setProducer(AbstractC9465L1l1 r7) {
            long j;
            if (r7 != null) {
                synchronized (this.f18374OooO00o) {
                    if (this.f18370OooO00o == null) {
                        j = this.OooO00o;
                        if (j != Long.MAX_VALUE) {
                            j--;
                        }
                        this.OooO00o = 0;
                        this.f18370OooO00o = r7;
                    } else {
                        throw new IllegalStateException("Can't set more than one Producer!");
                    }
                }
                if (j > 0) {
                    r7.request(j);
                }
                OooO00o();
                return;
            }
            throw null;
        }

        public void OooO00o() {
            synchronized (this) {
                if (this.OooO0O0) {
                    this.OooO0OO = true;
                    return;
                }
                this.OooO0O0 = true;
                OooO0O0();
            }
        }
    }

    public C6497lIIl(AbstractC5189I1l1l<R, ? super T, R> r2) {
        this(OooO00o, r2);
    }
}
