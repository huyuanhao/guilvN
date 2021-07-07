package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p293rx.internal.producers.SingleDelayedProducer;

/* renamed from: com.pd.sdk.lli丨l丨  reason: invalid class name and case insensitive filesystem */
public final class C6788llil<T> implements C9349III.OooO0O0<List<T>, T> {

    /* renamed from: com.pd.sdk.lli丨l丨$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f18818OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<T> f18819OooO00o = new LinkedList();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ SingleDelayedProducer f18820OooO00o;
        public boolean OooO0O0;

        public OooO00o(SingleDelayedProducer singleDelayedProducer, AbstractC9508LiLi r3) {
            this.f18820OooO00o = singleDelayedProducer;
            this.f18818OooO00o = r3;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: rx.internal.producers.SingleDelayedProducer */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                try {
                    ArrayList arrayList = new ArrayList(this.f18819OooO00o);
                    this.f18819OooO00o = null;
                    this.f18820OooO00o.setValue(arrayList);
                } catch (Throwable th) {
                    IIl11.OooO00o(th, this);
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f18818OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.OooO0O0) {
                this.f18819OooO00o.add(t);
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: com.pd.sdk.lli丨l丨$OooO0O0 */
    public static final class OooO0O0 {
        public static final C6788llil<Object> OooO00o = new C6788llil<>();
    }

    public static <T> C6788llil<T> OooO00o() {
        return (C6788llil<T>) OooO0O0.OooO00o;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super List<T>> r3) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(r3);
        OooO00o oooO00o = new OooO00o(singleDelayedProducer, r3);
        r3.add(oooO00o);
        r3.setProducer(singleDelayedProducer);
        return oooO00o;
    }
}
