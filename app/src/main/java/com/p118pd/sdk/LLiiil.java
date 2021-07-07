package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;
import p293rx.internal.operators.NotificationLite;

/* renamed from: com.pd.sdk.LLii丨i丨l  reason: invalid class name */
public final class LLiiil<T> implements C9349III.OooO0O0<T, T> {
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.LLii丨i丨l$OooO00o */
    public class OooO00o implements AbstractC9465L1l1 {
        public final /* synthetic */ OooO0O0 OooO00o;

        public OooO00o(OooO0O0 oooO0O0) {
            this.OooO00o = oooO0O0;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            this.OooO00o.OooO00o(j);
        }
    }

    /* renamed from: com.pd.sdk.LLii丨i丨l$OooO0O0 */
    public static final class OooO0O0<T> extends AbstractC9508LiLi<T> implements AbstractC9847l1<Object, T> {
        public final AbstractC9508LiLi<? super T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ArrayDeque<Object> f16489OooO00o = new ArrayDeque<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicLong f16490OooO00o = new AtomicLong();
        public final int o00oO0O;

        public OooO0O0(AbstractC9508LiLi<? super T> r1, int i) {
            this.OooO00o = r1;
            this.o00oO0O = i;
        }

        public void OooO00o(long j) {
            if (j > 0) {
                C6211iLli.OooO00o(this.f16490OooO00o, j, this.f16489OooO00o, this.OooO00o, this);
            }
        }

        @Override // com.p118pd.sdk.AbstractC9847l1
        public T call(Object obj) {
            return (T) NotificationLite.OooO00o(obj);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            C6211iLli.OooO00o(this.f16490OooO00o, this.f16489OooO00o, this.OooO00o, this);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f16489OooO00o.clear();
            this.OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (this.f16489OooO00o.size() == this.o00oO0O) {
                this.f16489OooO00o.poll();
            }
            this.f16489OooO00o.offer(NotificationLite.OooO0O0((Object) t));
        }
    }

    public LLiiil(int i) {
        if (i >= 0) {
            this.o00oO0O = i;
            return;
        }
        throw new IndexOutOfBoundsException("count cannot be negative");
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r3) {
        OooO0O0 oooO0O0 = new OooO0O0(r3, this.o00oO0O);
        r3.add(oooO0O0);
        r3.setProducer(new OooO00o(oooO0O0));
        return oooO0O0;
    }
}
