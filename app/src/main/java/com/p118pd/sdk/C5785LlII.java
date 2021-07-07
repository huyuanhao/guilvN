package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import p293rx.exceptions.OnErrorThrowable;

/* renamed from: com.pd.sdk.LlI丨丨I丨  reason: invalid class name and case insensitive filesystem */
public class C5785LlII<T, R> implements C9349III.OooO0O0<R, T> {
    public final Class<R> OooO00o;

    /* renamed from: com.pd.sdk.LlI丨丨I丨$OooO00o */
    public static final class OooO00o<T, R> extends AbstractC9508LiLi<T> {
        public final AbstractC9508LiLi<? super R> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Class<R> f16715OooO00o;
        public boolean OooO0O0;

        public OooO00o(AbstractC9508LiLi<? super R> r1, Class<R> cls) {
            this.OooO00o = r1;
            this.f16715OooO00o = cls;
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
                this.OooO00o.onNext(this.f16715OooO00o.cast(t));
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

    public C5785LlII(Class<R> cls) {
        this.OooO00o = cls;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super R> r3) {
        OooO00o oooO00o = new OooO00o(r3, this.OooO00o);
        r3.add(oooO00o);
        return oooO00o;
    }
}
