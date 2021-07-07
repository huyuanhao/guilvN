package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.i丨Ll  reason: invalid class name and case insensitive filesystem */
public final class C6382iLl<T> implements C9349III.OooO0O0<T, T> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f18173OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TimeUnit f18174OooO00o;

    /* renamed from: com.pd.sdk.i丨Ll$OooO00o */
    public static final class OooO00o<T> extends AbstractC9508LiLi<T> implements liii1l {
        public final AbstractC9508LiLi<? super T> OooO00o;

        public OooO00o(AbstractC9508LiLi<? super T> r1) {
            super(r1);
            this.OooO00o = r1;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO00o.onCompleted();
            unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
            unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.OooO00o.onNext(t);
        }
    }

    public C6382iLl(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        this.OooO00o = j;
        this.f18174OooO00o = timeUnit;
        this.f18173OooO00o = ll1ll;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r5) {
        LL1LL.OooO00o OooO00o2 = this.f18173OooO00o.m16172OooO00o();
        r5.add(OooO00o2);
        OooO00o oooO00o = new OooO00o(new IL11lL(r5));
        OooO00o2.OooO00o(oooO00o, this.OooO00o, this.f18174OooO00o);
        return oooO00o;
    }
}
