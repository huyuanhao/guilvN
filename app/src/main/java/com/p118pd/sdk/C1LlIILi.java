package com.p118pd.sdk;

import com.p118pd.sdk.C5876LlIl;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.pd.sdk.丨1LlIILi  reason: invalid class name */
public final class C1LlIILi implements C5876LlIl.AbstractC5898Oooo0O0 {
    public final Iterable<? extends C5876LlIl> OooO00o;

    /* renamed from: com.pd.sdk.丨1LlIILi$OooO00o */
    public class OooO00o implements AbstractC6473l1II {
        public final /* synthetic */ IIlIIiI1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6473l1II f22786OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Queue f22788OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicInteger f22789OooO00o;

        public OooO00o(IIlIIiI1 iIlIIiI1, Queue queue, AtomicInteger atomicInteger, AbstractC6473l1II r5) {
            this.OooO00o = iIlIIiI1;
            this.f22788OooO00o = queue;
            this.f22789OooO00o = atomicInteger;
            this.f22786OooO00o = r5;
        }

        public void OooO00o() {
            if (this.f22789OooO00o.decrementAndGet() != 0) {
                return;
            }
            if (this.f22788OooO00o.isEmpty()) {
                this.f22786OooO00o.onCompleted();
            } else {
                this.f22786OooO00o.onError(i11IL.OooO00o(this.f22788OooO00o));
            }
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onError(Throwable th) {
            this.f22788OooO00o.offer(th);
            OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
            this.OooO00o.OooO00o(llIiLii);
        }
    }

    public C1LlIILi(Iterable<? extends C5876LlIl> iterable) {
        this.OooO00o = iterable;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC6473l1II r13) {
        Queue queue;
        IIlIIiI1 iIlIIiI1 = new IIlIIiI1();
        r13.onSubscribe(iIlIIiI1);
        try {
            Iterator<? extends C5876LlIl> it = this.OooO00o.iterator();
            if (it == null) {
                r13.onError(new NullPointerException("The source iterator returned is null"));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(1);
            if (C11LI1.OooO00o()) {
                queue = new C5243IIlL();
            } else {
                queue = new C6049i1lii();
            }
            while (!iIlIIiI1.isUnsubscribed()) {
                try {
                    if (!it.hasNext()) {
                        if (atomicInteger.decrementAndGet() != 0) {
                            return;
                        }
                        if (queue.isEmpty()) {
                            r13.onCompleted();
                            return;
                        } else {
                            r13.onError(i11IL.OooO00o(queue));
                            return;
                        }
                    } else if (!iIlIIiI1.isUnsubscribed()) {
                        try {
                            C5876LlIl r10 = (C5876LlIl) it.next();
                            if (!iIlIIiI1.isUnsubscribed()) {
                                if (r10 == null) {
                                    queue.offer(new NullPointerException("A completable source is null"));
                                    if (atomicInteger.decrementAndGet() != 0) {
                                        return;
                                    }
                                    if (queue.isEmpty()) {
                                        r13.onCompleted();
                                        return;
                                    } else {
                                        r13.onError(i11IL.OooO00o(queue));
                                        return;
                                    }
                                } else {
                                    atomicInteger.getAndIncrement();
                                    r10.OooO0O0(new OooO00o(iIlIIiI1, queue, atomicInteger, r13));
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            queue.offer(th);
                            if (atomicInteger.decrementAndGet() != 0) {
                                return;
                            }
                            if (queue.isEmpty()) {
                                r13.onCompleted();
                                return;
                            } else {
                                r13.onError(i11IL.OooO00o(queue));
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    queue.offer(th2);
                    if (atomicInteger.decrementAndGet() != 0) {
                        return;
                    }
                    if (queue.isEmpty()) {
                        r13.onCompleted();
                        return;
                    } else {
                        r13.onError(i11IL.OooO00o(queue));
                        return;
                    }
                }
            }
        } catch (Throwable th3) {
            r13.onError(th3);
        }
    }
}
