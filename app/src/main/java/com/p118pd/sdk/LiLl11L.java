package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.LiLl丨11L  reason: invalid class name */
public final class LiLl11L<T> implements C9349III.OooO00o<T> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f16610OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<T> f16611OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TimeUnit f16612OooO00o;

    /* renamed from: com.pd.sdk.LiLl丨11L$OooO00o */
    public static final class OooO00o<T> extends AbstractC9508LiLi<T> implements liii1l {
        public final AbstractC9508LiLi<? super T> OooO00o;
        public volatile boolean OooO0O0;

        public OooO00o(AbstractC9508LiLi<? super T> r1) {
            this.OooO00o = r1;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            this.OooO0O0 = true;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            try {
                this.OooO00o.onCompleted();
            } finally {
                unsubscribe();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            try {
                this.OooO00o.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (this.OooO0O0) {
                this.OooO00o.onNext(t);
            }
        }
    }

    public LiLl11L(C9349III<T> r1, long j, TimeUnit timeUnit, LL1LL ll1ll) {
        this.f16611OooO00o = r1;
        this.OooO00o = j;
        this.f16612OooO00o = timeUnit;
        this.f16610OooO00o = ll1ll;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r5) {
        LL1LL.OooO00o OooO00o2 = this.f16610OooO00o.m16172OooO00o();
        OooO00o oooO00o = new OooO00o(r5);
        oooO00o.add(OooO00o2);
        r5.add(oooO00o);
        OooO00o2.OooO00o(oooO00o, this.OooO00o, this.f16612OooO00o);
        this.f16611OooO00o.OooO0O0((AbstractC9508LiLi) oooO00o);
    }
}
