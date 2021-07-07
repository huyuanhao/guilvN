package com.p118pd.sdk;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.pd.sdk.ll1Il  reason: case insensitive filesystem */
public abstract class AbstractC6730ll1Il<T, R> extends AbstractC9508LiLi<T> {
    public static final int o00oO0O = 0;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    public static final int o0ooOoO = 3;
    public final AbstractC9508LiLi<? super R> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public R f18708OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicInteger f18709OooO00o = new AtomicInteger();
    public boolean OooO0O0;

    /* renamed from: com.pd.sdk.ll1Il$OooO00o */
    public static final class OooO00o implements AbstractC9465L1l1 {
        public final AbstractC6730ll1Il<?, ?> OooO00o;

        public OooO00o(AbstractC6730ll1Il<?, ?> ll1il) {
            this.OooO00o = ll1il;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            this.OooO00o.OooO00o(j);
        }
    }

    public AbstractC6730ll1Il(AbstractC9508LiLi<? super R> r1) {
        this.OooO00o = r1;
    }

    public final void OooO00o(R r) {
        AbstractC9508LiLi<? super R> r0 = this.OooO00o;
        do {
            int i = this.f18709OooO00o.get();
            if (i != 2 && i != 3 && !r0.isUnsubscribed()) {
                if (i == 1) {
                    r0.onNext(r);
                    if (!r0.isUnsubscribed()) {
                        r0.onCompleted();
                    }
                    this.f18709OooO00o.lazySet(3);
                    return;
                }
                this.f18708OooO00o = r;
            } else {
                return;
            }
        } while (!this.f18709OooO00o.compareAndSet(0, 2));
    }

    public final void OooO0OO() {
        this.OooO00o.onCompleted();
    }

    public final void OooO0Oo() {
        AbstractC9508LiLi<? super R> r0 = this.OooO00o;
        r0.add(this);
        r0.setProducer(new OooO00o(this));
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        if (this.OooO0O0) {
            OooO00o((Object) this.f18708OooO00o);
        } else {
            OooO0OO();
        }
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        this.f18708OooO00o = null;
        this.OooO00o.onError(th);
    }

    @Override // com.p118pd.sdk.AbstractC9508LiLi
    public final void setProducer(AbstractC9465L1l1 r3) {
        r3.request(Long.MAX_VALUE);
    }

    public final void OooO00o(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + j);
        } else if (j != 0) {
            AbstractC9508LiLi<? super R> r4 = this.OooO00o;
            do {
                int i = this.f18709OooO00o.get();
                if (i != 1 && i != 3 && !r4.isUnsubscribed()) {
                    if (i == 2) {
                        if (this.f18709OooO00o.compareAndSet(2, 3)) {
                            r4.onNext(this.f18708OooO00o);
                            if (!r4.isUnsubscribed()) {
                                r4.onCompleted();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f18709OooO00o.compareAndSet(0, 1));
        }
    }

    public final void OooO00o(C9349III<? extends T> r1) {
        OooO0Oo();
        r1.OooO0O0((AbstractC9508LiLi<? super Object>) this);
    }
}
