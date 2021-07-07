package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.pd.sdk.iliiii丨  reason: invalid class name and case insensitive filesystem */
public final class C6328iliiii<T> implements C9349III.OooO0O0<T, T> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f18053OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TimeUnit f18054OooO00o;

    /* renamed from: com.pd.sdk.iliiii丨$OooO00o */
    public static final class OooO00o<T> extends AbstractC9508LiLi<T> implements liii1l {
        public static final Object OooO00o = new Object();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super T> f18055OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicReference<Object> f18056OooO00o = new AtomicReference<>(OooO00o);

        public OooO00o(AbstractC9508LiLi<? super T> r3) {
            this.f18055OooO00o = r3;
        }

        private void OooO0OO() {
            Object andSet = this.f18056OooO00o.getAndSet(OooO00o);
            if (andSet != OooO00o) {
                try {
                    this.f18055OooO00o.onNext(andSet);
                } catch (Throwable th) {
                    IIl11.OooO00o(th, this);
                }
            }
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            OooO0OO();
            this.f18055OooO00o.onCompleted();
            unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f18055OooO00o.onError(th);
            unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.f18056OooO00o.set(t);
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public C6328iliiii(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        this.OooO00o = j;
        this.f18054OooO00o = timeUnit;
        this.f18053OooO00o = ll1ll;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r10) {
        IL11lL r0 = new IL11lL(r10);
        LL1LL.OooO00o OooO00o2 = this.f18053OooO00o.m16172OooO00o();
        r10.add(OooO00o2);
        OooO00o oooO00o = new OooO00o(r0);
        r10.add(oooO00o);
        long j = this.OooO00o;
        OooO00o2.OooO00o(oooO00o, j, j, this.f18054OooO00o);
        return oooO00o;
    }
}
