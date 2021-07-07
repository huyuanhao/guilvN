package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.pd.sdk.LIi丨  reason: invalid class name and case insensitive filesystem */
public final class C5632LIi<T> implements C9349III.OooO0O0<T, T> {
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.LIi丨$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f16339OooO00o;
        public boolean OooO0O0;
        public int o00oO0O;

        /* renamed from: com.pd.sdk.LIi丨$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4919OooO00o implements AbstractC9465L1l1 {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC9465L1l1 f16340OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final AtomicLong f16341OooO00o = new AtomicLong(0);

            public C4919OooO00o(AbstractC9465L1l1 r4) {
                this.f16340OooO00o = r4;
            }

            @Override // com.p118pd.sdk.AbstractC9465L1l1
            public void request(long j) {
                long j2;
                long min;
                if (j > 0 && !OooO00o.this.OooO0O0) {
                    do {
                        j2 = this.f16341OooO00o.get();
                        min = Math.min(j, ((long) C5632LIi.this.o00oO0O) - j2);
                        if (min == 0) {
                            return;
                        }
                    } while (!this.f16341OooO00o.compareAndSet(j2, j2 + min));
                    this.f16340OooO00o.request(min);
                }
            }
        }

        public OooO00o(AbstractC9508LiLi r2) {
            this.f16339OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.f16339OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                try {
                    this.f16339OooO00o.onError(th);
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!isUnsubscribed()) {
                int i = this.o00oO0O;
                int i2 = i + 1;
                this.o00oO0O = i2;
                int i3 = C5632LIi.this.o00oO0O;
                if (i < i3) {
                    boolean z = i2 == i3;
                    this.f16339OooO00o.onNext(t);
                    if (z && !this.OooO0O0) {
                        this.OooO0O0 = true;
                        try {
                            this.f16339OooO00o.onCompleted();
                        } finally {
                            unsubscribe();
                        }
                    }
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r3) {
            this.f16339OooO00o.setProducer(new C4919OooO00o(r3));
        }
    }

    public C5632LIi(int i) {
        if (i >= 0) {
            this.o00oO0O = i;
            return;
        }
        throw new IllegalArgumentException("limit >= 0 required but it was " + i);
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r3) {
        OooO00o oooO00o = new OooO00o(r3);
        if (this.o00oO0O == 0) {
            r3.onCompleted();
            oooO00o.unsubscribe();
        }
        r3.add(oooO00o);
        return oooO00o;
    }
}
