package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.pd.sdk.iilL  reason: case insensitive filesystem */
public final class C6273iilL<T> implements C9349III.OooO0O0<T, C9349III<T>> {
    public final AbstractC5189I1l1l<Integer, Throwable, Boolean> OooO00o;

    /* renamed from: com.pd.sdk.iilL$OooO00o */
    public static final class OooO00o<T> extends AbstractC9508LiLi<C9349III<T>> {
        public final AbstractC5189I1l1l<Integer, Throwable, Boolean> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LL1LL.OooO00o f17929OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final iLIiLILI f17930OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super T> f17931OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9577i1 f17932OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f17933OooO00o = new AtomicInteger();

        /* renamed from: com.pd.sdk.iilL$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4937OooO00o implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C9349III f17934OooO00o;

            /* renamed from: com.pd.sdk.iilL$OooO00o$OooO00o$OooO00o  reason: collision with other inner class name */
            public class C4938OooO00o extends AbstractC9508LiLi<T> {

                /* renamed from: OooO00o  reason: collision with other field name */
                public final /* synthetic */ liii1l f17935OooO00o;
                public boolean OooO0O0;

                public C4938OooO00o(liii1l r2) {
                    this.f17935OooO00o = r2;
                }

                @Override // com.p118pd.sdk.AbstractC5477Il11
                public void onCompleted() {
                    if (!this.OooO0O0) {
                        this.OooO0O0 = true;
                        OooO00o.this.f17931OooO00o.onCompleted();
                    }
                }

                @Override // com.p118pd.sdk.AbstractC5477Il11
                public void onError(Throwable th) {
                    if (!this.OooO0O0) {
                        this.OooO0O0 = true;
                        OooO00o oooO00o = OooO00o.this;
                        if (!oooO00o.OooO00o.OooO00o(Integer.valueOf(oooO00o.f17933OooO00o.get()), th).booleanValue() || OooO00o.this.f17929OooO00o.isUnsubscribed()) {
                            OooO00o.this.f17931OooO00o.onError(th);
                        } else {
                            OooO00o.this.f17929OooO00o.OooO00o(this.f17935OooO00o);
                        }
                    }
                }

                @Override // com.p118pd.sdk.AbstractC5477Il11
                public void onNext(T t) {
                    if (!this.OooO0O0) {
                        OooO00o.this.f17931OooO00o.onNext(t);
                        OooO00o.this.f17932OooO00o.OooO00o(1);
                    }
                }

                @Override // com.p118pd.sdk.AbstractC9508LiLi
                public void setProducer(AbstractC9465L1l1 r2) {
                    OooO00o.this.f17932OooO00o.OooO00o(r2);
                }
            }

            public C4937OooO00o(C9349III r2) {
                this.f17934OooO00o = r2;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO00o.this.f17933OooO00o.incrementAndGet();
                C4938OooO00o oooO00o = new C4938OooO00o(this);
                OooO00o.this.f17930OooO00o.OooO00o(oooO00o);
                this.f17934OooO00o.OooO0O0((AbstractC9508LiLi) oooO00o);
            }
        }

        public OooO00o(AbstractC9508LiLi<? super T> r2, AbstractC5189I1l1l<Integer, Throwable, Boolean> r3, LL1LL.OooO00o oooO00o, iLIiLILI iliilili, C9577i1 r6) {
            this.f17931OooO00o = r2;
            this.OooO00o = r3;
            this.f17929OooO00o = oooO00o;
            this.f17930OooO00o = iliilili;
            this.f17932OooO00o = r6;
        }

        /* renamed from: OooO00o */
        public void onNext(C9349III<T> r3) {
            this.f17929OooO00o.OooO00o(new C4937OooO00o(r3));
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f17931OooO00o.onError(th);
        }
    }

    public C6273iilL(AbstractC5189I1l1l<Integer, Throwable, Boolean> r1) {
        this.OooO00o = r1;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super C9349III<T>> call(AbstractC9508LiLi<? super T> r8) {
        LL1LL.OooO00o OooO00o2 = C6261iii1I1.OooO0o0().m16172OooO00o();
        r8.add(OooO00o2);
        iLIiLILI iliilili = new iLIiLILI();
        r8.add(iliilili);
        C9577i1 r6 = new C9577i1();
        r8.setProducer(r6);
        return new OooO00o(r8, this.OooO00o, OooO00o2, iliilili, r6);
    }
}
