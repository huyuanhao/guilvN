package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import p293rx.internal.producers.SingleDelayedProducer;

/* renamed from: com.pd.sdk.LLIL */
public final class LLIL<T> implements C9349III.OooO0O0<Boolean, T> {
    public final AbstractC9847l1<? super T, Boolean> OooO00o;

    /* renamed from: com.pd.sdk.LLIL$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f16417OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ SingleDelayedProducer f16418OooO00o;
        public boolean OooO0O0;

        public OooO00o(SingleDelayedProducer singleDelayedProducer, AbstractC9508LiLi r3) {
            this.f16418OooO00o = singleDelayedProducer;
            this.f16417OooO00o = r3;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: rx.internal.producers.SingleDelayedProducer */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.f16418OooO00o.setValue(true);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.f16417OooO00o.onError(th);
                return;
            }
            C9714lli.m21756OooO00o(th);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: rx.internal.producers.SingleDelayedProducer */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.OooO0O0) {
                try {
                    if (!LLIL.this.OooO00o.call(t).booleanValue()) {
                        this.OooO0O0 = true;
                        this.f16418OooO00o.setValue(false);
                        unsubscribe();
                    }
                } catch (Throwable th) {
                    IIl11.OooO00o(th, this, t);
                }
            }
        }
    }

    public LLIL(AbstractC9847l1<? super T, Boolean> r1) {
        this.OooO00o = r1;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super Boolean> r3) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(r3);
        OooO00o oooO00o = new OooO00o(singleDelayedProducer, r3);
        r3.add(oooO00o);
        r3.setProducer(singleDelayedProducer);
        return oooO00o;
    }
}
