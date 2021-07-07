package com.p118pd.sdk;

import com.p118pd.sdk.C5876LlIl;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.pd.sdk.lI1L丨1丨  reason: invalid class name */
public final class lI1L1 implements C5876LlIl.AbstractC5898Oooo0O0 {
    public final Iterable<? extends C5876LlIl> OooO00o;

    /* renamed from: com.pd.sdk.lI1L丨1丨$OooO00o */
    public class OooO00o implements AbstractC6473l1II {
        public final /* synthetic */ IIlIIiI1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6473l1II f18342OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicBoolean f18344OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicInteger f18345OooO00o;

        public OooO00o(IIlIIiI1 iIlIIiI1, AtomicBoolean atomicBoolean, AbstractC6473l1II r4, AtomicInteger atomicInteger) {
            this.OooO00o = iIlIIiI1;
            this.f18344OooO00o = atomicBoolean;
            this.f18342OooO00o = r4;
            this.f18345OooO00o = atomicInteger;
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            if (this.f18345OooO00o.decrementAndGet() == 0 && this.f18344OooO00o.compareAndSet(false, true)) {
                this.f18342OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onError(Throwable th) {
            this.OooO00o.unsubscribe();
            if (this.f18344OooO00o.compareAndSet(false, true)) {
                this.f18342OooO00o.onError(th);
            } else {
                C9714lli.m21756OooO00o(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
            this.OooO00o.OooO00o(llIiLii);
        }
    }

    public lI1L1(Iterable<? extends C5876LlIl> iterable) {
        this.OooO00o = iterable;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC6473l1II r14) {
        IIlIIiI1 iIlIIiI1 = new IIlIIiI1();
        r14.onSubscribe(iIlIIiI1);
        try {
            Iterator<? extends C5876LlIl> it = this.OooO00o.iterator();
            if (it == null) {
                r14.onError(new NullPointerException("The source iterator returned is null"));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(1);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            while (!iIlIIiI1.isUnsubscribed()) {
                try {
                    if (!it.hasNext()) {
                        if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
                            r14.onCompleted();
                            return;
                        }
                        return;
                    } else if (!iIlIIiI1.isUnsubscribed()) {
                        try {
                            C5876LlIl r11 = (C5876LlIl) it.next();
                            if (!iIlIIiI1.isUnsubscribed()) {
                                if (r11 == null) {
                                    iIlIIiI1.unsubscribe();
                                    Throwable nullPointerException = new NullPointerException("A completable source is null");
                                    if (atomicBoolean.compareAndSet(false, true)) {
                                        r14.onError(nullPointerException);
                                        return;
                                    } else {
                                        C9714lli.m21756OooO00o(nullPointerException);
                                        return;
                                    }
                                } else {
                                    atomicInteger.getAndIncrement();
                                    r11.OooO0O0(new OooO00o(iIlIIiI1, atomicBoolean, r14, atomicInteger));
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            iIlIIiI1.unsubscribe();
                            if (atomicBoolean.compareAndSet(false, true)) {
                                r14.onError(th);
                                return;
                            } else {
                                C9714lli.m21756OooO00o(th);
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    iIlIIiI1.unsubscribe();
                    if (atomicBoolean.compareAndSet(false, true)) {
                        r14.onError(th2);
                        return;
                    } else {
                        C9714lli.m21756OooO00o(th2);
                        return;
                    }
                }
            }
        } catch (Throwable th3) {
            r14.onError(th3);
        }
    }
}
