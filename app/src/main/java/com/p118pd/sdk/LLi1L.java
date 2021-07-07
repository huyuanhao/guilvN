package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p293rx.internal.operators.NotificationLite;

/* renamed from: com.pd.sdk.LLi1L */
public final class LLi1L<T> implements C9349III.OooO0O0<T, T> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f16478OooO00o;
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.LLi1L$OooO00o */
    public class OooO00o implements AbstractC9465L1l1 {
        public final /* synthetic */ OooO0O0 OooO00o;

        public OooO00o(OooO0O0 oooO0O0) {
            this.OooO00o = oooO0O0;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            this.OooO00o.OooO0O0(j);
        }
    }

    /* renamed from: com.pd.sdk.LLi1L$OooO0O0 */
    public static final class OooO0O0<T> extends AbstractC9508LiLi<T> implements AbstractC9847l1<Object, T> {
        public final long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LL1LL f16480OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super T> f16481OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ArrayDeque<Object> f16482OooO00o = new ArrayDeque<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicLong f16483OooO00o = new AtomicLong();
        public final ArrayDeque<Long> OooO0O0 = new ArrayDeque<>();
        public final int o00oO0O;

        public OooO0O0(AbstractC9508LiLi<? super T> r1, int i, long j, LL1LL ll1ll) {
            this.f16481OooO00o = r1;
            this.o00oO0O = i;
            this.OooO00o = j;
            this.f16480OooO00o = ll1ll;
        }

        public void OooO00o(long j) {
            long j2 = j - this.OooO00o;
            while (true) {
                Long peek = this.OooO0O0.peek();
                if (peek != null && peek.longValue() < j2) {
                    this.f16482OooO00o.poll();
                    this.OooO0O0.poll();
                } else {
                    return;
                }
            }
        }

        public void OooO0O0(long j) {
            C6211iLli.OooO00o(this.f16483OooO00o, j, this.f16482OooO00o, this.f16481OooO00o, this);
        }

        @Override // com.p118pd.sdk.AbstractC9847l1
        public T call(Object obj) {
            return (T) NotificationLite.OooO00o(obj);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            OooO00o(this.f16480OooO00o.OooO00o());
            this.OooO0O0.clear();
            C6211iLli.OooO00o(this.f16483OooO00o, this.f16482OooO00o, this.f16481OooO00o, this);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f16482OooO00o.clear();
            this.OooO0O0.clear();
            this.f16481OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (this.o00oO0O != 0) {
                long OooO00o2 = this.f16480OooO00o.OooO00o();
                if (this.f16482OooO00o.size() == this.o00oO0O) {
                    this.f16482OooO00o.poll();
                    this.OooO0O0.poll();
                }
                OooO00o(OooO00o2);
                this.f16482OooO00o.offer(NotificationLite.OooO0O0((Object) t));
                this.OooO0O0.offer(Long.valueOf(OooO00o2));
            }
        }
    }

    public LLi1L(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        this.OooO00o = timeUnit.toMillis(j);
        this.f16478OooO00o = ll1ll;
        this.o00oO0O = -1;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r8) {
        OooO0O0 oooO0O0 = new OooO0O0(r8, this.o00oO0O, this.OooO00o, this.f16478OooO00o);
        r8.add(oooO0O0);
        r8.setProducer(new OooO00o(oooO0O0));
        return oooO0O0;
    }

    public LLi1L(int i, long j, TimeUnit timeUnit, LL1LL ll1ll) {
        if (i >= 0) {
            this.OooO00o = timeUnit.toMillis(j);
            this.f16478OooO00o = ll1ll;
            this.o00oO0O = i;
            return;
        }
        throw new IndexOutOfBoundsException("count could not be negative");
    }
}
