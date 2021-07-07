package com.p118pd.sdk;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.pd.sdk.ilLi1l丨  reason: invalid class name */
public final class ilLi1l<T> {
    public final LLil11<? extends T> OooO00o;

    /* renamed from: com.pd.sdk.ilLi1l丨$OooO00o */
    public class OooO00o extends AbstractC93021L<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ CountDownLatch f18027OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicReference f18028OooO00o;
        public final /* synthetic */ AtomicReference OooO0O0;

        public OooO00o(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
            this.f18028OooO00o = atomicReference;
            this.f18027OooO00o = countDownLatch;
            this.OooO0O0 = atomicReference2;
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            this.f18028OooO00o.set(t);
            this.f18027OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            this.OooO0O0.set(th);
            this.f18027OooO00o.countDown();
        }
    }

    public ilLi1l(LLil11<? extends T> r1) {
        this.OooO00o = r1;
    }

    public static <T> ilLi1l<T> OooO00o(LLil11<? extends T> r1) {
        return new ilLi1l<>(r1);
    }

    public T OooO00o() {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C5915Lil.OooO00o(countDownLatch, this.OooO00o.OooO00o((AbstractC93021L<? super Object>) new OooO00o(atomicReference, countDownLatch, atomicReference2)));
        Throwable th = (Throwable) atomicReference2.get();
        if (th == null) {
            return (T) atomicReference.get();
        }
        throw IIl11.OooO00o(th);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Future<T> m17359OooO00o() {
        return C9379IiLiL.OooO00o(this.OooO00o.m16263OooO00o());
    }
}
