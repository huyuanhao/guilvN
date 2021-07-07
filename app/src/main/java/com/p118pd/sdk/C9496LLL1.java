package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import p293rx.exceptions.OnErrorThrowable;

/* renamed from: com.pd.sdk.丨LLL1丨  reason: invalid class name and case insensitive filesystem */
public final class C9496LLL1<T, R> implements C9349III.OooO00o<R> {
    public final C9349III<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super T, ? extends R> f23059OooO00o;

    /* renamed from: com.pd.sdk.丨LLL1丨$OooO00o */
    public static final class OooO00o<T, R> extends AbstractC9508LiLi<T> {
        public final AbstractC9508LiLi<? super R> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9847l1<? super T, ? extends R> f23060OooO00o;
        public boolean OooO0O0;

        public OooO00o(AbstractC9508LiLi<? super R> r1, AbstractC9847l1<? super T, ? extends R> r2) {
            this.OooO00o = r1;
            this.f23060OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.OooO0O0) {
                C9714lli.m21756OooO00o(th);
                return;
            }
            this.OooO0O0 = true;
            this.OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            try {
                this.OooO00o.onNext(this.f23060OooO00o.call(t));
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r2) {
            this.OooO00o.setProducer(r2);
        }
    }

    public C9496LLL1(C9349III<T> r1, AbstractC9847l1<? super T, ? extends R> r2) {
        this.OooO00o = r1;
        this.f23059OooO00o = r2;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super R> r3) {
        OooO00o oooO00o = new OooO00o(r3, this.f23059OooO00o);
        r3.add(oooO00o);
        this.OooO00o.OooO0O0((AbstractC9508LiLi) oooO00o);
    }
}
