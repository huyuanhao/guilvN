package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.concurrent.Callable;
import p293rx.internal.producers.SingleDelayedProducer;

/* renamed from: com.pd.sdk.丨11ll  reason: invalid class name */
public final class C11ll<T> implements C9349III.OooO00o<T> {
    public final Callable<? extends T> OooO00o;

    public C11ll(Callable<? extends T> callable) {
        this.OooO00o = callable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: rx.internal.producers.SingleDelayedProducer */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r3) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(r3);
        r3.setProducer(singleDelayedProducer);
        try {
            singleDelayedProducer.setValue(this.OooO00o.call());
        } catch (Throwable th) {
            IIl11.OooO00o(th, r3);
        }
    }
}
