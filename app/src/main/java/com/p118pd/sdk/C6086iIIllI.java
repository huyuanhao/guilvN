package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import p293rx.internal.producers.SingleDelayedProducer;

/* renamed from: com.pd.sdk.iIIllI  reason: case insensitive filesystem */
public final class C6086iIIllI<T> implements C9349III.OooO0O0<Boolean, T> {
    public final AbstractC9847l1<? super T, Boolean> OooO00o;
    public final boolean OooO0O0;

    /* renamed from: com.pd.sdk.iIIllI$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f17492OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ SingleDelayedProducer f17493OooO00o;
        public boolean OooO0O0;
        public boolean OooO0OO;

        public OooO00o(SingleDelayedProducer singleDelayedProducer, AbstractC9508LiLi r3) {
            this.f17493OooO00o = singleDelayedProducer;
            this.f17492OooO00o = r3;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: rx.internal.producers.SingleDelayedProducer */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: rx.internal.producers.SingleDelayedProducer */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0OO) {
                this.OooO0OO = true;
                if (this.OooO0O0) {
                    this.f17493OooO00o.setValue(false);
                } else {
                    this.f17493OooO00o.setValue(Boolean.valueOf(C6086iIIllI.this.OooO0O0));
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.OooO0OO) {
                this.OooO0OO = true;
                this.f17492OooO00o.onError(th);
                return;
            }
            C9714lli.m21756OooO00o(th);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: rx.internal.producers.SingleDelayedProducer */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.OooO0OO) {
                this.OooO0O0 = true;
                try {
                    if (C6086iIIllI.this.OooO00o.call(t).booleanValue()) {
                        this.OooO0OO = true;
                        this.f17493OooO00o.setValue(Boolean.valueOf(true ^ C6086iIIllI.this.OooO0O0));
                        unsubscribe();
                    }
                } catch (Throwable th) {
                    IIl11.OooO00o(th, this, t);
                }
            }
        }
    }

    public C6086iIIllI(AbstractC9847l1<? super T, Boolean> r1, boolean z) {
        this.OooO00o = r1;
        this.OooO0O0 = z;
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
