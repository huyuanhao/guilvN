package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.Iterator;

/* renamed from: com.pd.sdk.Ll1LLlI */
public final class Ll1LLlI<T1, T2, R> implements C9349III.OooO0O0<R, T1> {
    public final AbstractC5189I1l1l<? super T1, ? super T2, ? extends R> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Iterable<? extends T2> f16669OooO00o;

    /* renamed from: com.pd.sdk.Ll1LLlI$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T1> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f16670OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Iterator f16671OooO00o;
        public boolean OooO0O0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, AbstractC9508LiLi r3, Iterator it) {
            super(r2);
            this.f16670OooO00o = r3;
            this.f16671OooO00o = it;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.f16670OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.OooO0O0) {
                IIl11.m15447OooO00o(th);
                return;
            }
            this.OooO0O0 = true;
            this.f16670OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T1 t1) {
            if (!this.OooO0O0) {
                try {
                    this.f16670OooO00o.onNext(Ll1LLlI.this.OooO00o.OooO00o(t1, (Object) this.f16671OooO00o.next()));
                    if (!this.f16671OooO00o.hasNext()) {
                        onCompleted();
                    }
                } catch (Throwable th) {
                    IIl11.OooO00o(th, this);
                }
            }
        }
    }

    public Ll1LLlI(Iterable<? extends T2> iterable, AbstractC5189I1l1l<? super T1, ? super T2, ? extends R> r2) {
        this.f16669OooO00o = iterable;
        this.OooO00o = r2;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T1> call(AbstractC9508LiLi<? super R> r3) {
        Iterator<? extends T2> it = this.f16669OooO00o.iterator();
        try {
            if (it.hasNext()) {
                return new OooO00o(r3, r3, it);
            }
            r3.onCompleted();
            return C6695lilIl.OooO00o();
        } catch (Throwable th) {
            IIl11.OooO00o(th, r3);
            return C6695lilIl.OooO00o();
        }
    }
}
