package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import p293rx.exceptions.OnErrorThrowable;

/* renamed from: com.pd.sdk.IlIl1l丨  reason: invalid class name and case insensitive filesystem */
public final class C5431IlIl1l<T> implements C9349III.OooO00o<T> {
    public final C9349III<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super T, Boolean> f15821OooO00o;

    /* renamed from: com.pd.sdk.IlIl1l丨$OooO00o */
    public static final class OooO00o<T> extends AbstractC9508LiLi<T> {
        public final AbstractC9508LiLi<? super T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9847l1<? super T, Boolean> f15822OooO00o;
        public boolean OooO0O0;

        public OooO00o(AbstractC9508LiLi<? super T> r1, AbstractC9847l1<? super T, Boolean> r2) {
            this.OooO00o = r1;
            this.f15822OooO00o = r2;
            request(0);
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
                if (this.f15822OooO00o.call(t).booleanValue()) {
                    this.OooO00o.onNext(t);
                } else {
                    request(1);
                }
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r2) {
            super.setProducer(r2);
            this.OooO00o.setProducer(r2);
        }
    }

    public C5431IlIl1l(C9349III<T> r1, AbstractC9847l1<? super T, Boolean> r2) {
        this.OooO00o = r1;
        this.f15821OooO00o = r2;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r3) {
        OooO00o oooO00o = new OooO00o(r3, this.f15821OooO00o);
        r3.add(oooO00o);
        this.OooO00o.OooO0O0((AbstractC9508LiLi) oooO00o);
    }
}
