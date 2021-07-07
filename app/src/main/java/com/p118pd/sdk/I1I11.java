package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.I1I11 */
public class I1I11<T> implements C9349III.OooO0O0<T, T> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f15293OooO00o;

    /* renamed from: com.pd.sdk.I1I11$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f15294OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Deque<Ili11<T>> f15295OooO00o = new ArrayDeque();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, AbstractC9508LiLi r3) {
            super(r2);
            this.f15294OooO00o = r3;
        }

        private void OooO00o(long j) {
            long j2 = j - I1I11.this.OooO00o;
            while (!this.f15295OooO00o.isEmpty()) {
                Ili11<T> first = this.f15295OooO00o.getFirst();
                if (first.OooO00o() < j2) {
                    this.f15295OooO00o.removeFirst();
                    this.f15294OooO00o.onNext(first.m15687OooO00o());
                } else {
                    return;
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            OooO00o(I1I11.this.f15293OooO00o.OooO00o());
            this.f15294OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f15294OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            long OooO00o2 = I1I11.this.f15293OooO00o.OooO00o();
            OooO00o(OooO00o2);
            this.f15295OooO00o.offerLast(new Ili11<>(OooO00o2, t));
        }
    }

    public I1I11(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        this.OooO00o = timeUnit.toMillis(j);
        this.f15293OooO00o = ll1ll;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r2) {
        return new OooO00o(r2, r2);
    }
}
