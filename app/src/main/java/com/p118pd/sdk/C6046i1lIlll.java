package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.pd.sdk.i1lIlll  reason: case insensitive filesystem */
public final class C6046i1lIlll<T> implements C9349III.OooO00o<T> {
    public final C9349III<? extends T> OooO00o;
    public final C9349III<? extends T> OooO0O0;

    /* renamed from: com.pd.sdk.i1lIlll$OooO00o */
    public static final class OooO00o<T> extends AbstractC9508LiLi<T> {
        public final AbstractC9508LiLi<? super T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9577i1 f17442OooO00o;

        public OooO00o(AbstractC9508LiLi<? super T> r1, C9577i1 r2) {
            this.OooO00o = r1;
            this.f17442OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.OooO00o.onNext(t);
            this.f17442OooO00o.OooO00o(1);
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r2) {
            this.f17442OooO00o.OooO00o(r2);
        }
    }

    /* renamed from: com.pd.sdk.i1lIlll$OooO0O0 */
    public static final class OooO0O0<T> extends AbstractC9508LiLi<T> {
        public final iLIiLILI OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9349III<? extends T> f17443OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super T> f17444OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9577i1 f17445OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f17446OooO00o;
        public boolean OooO0O0 = true;
        public volatile boolean OooO0OO;

        public OooO0O0(AbstractC9508LiLi<? super T> r2, iLIiLILI iliilili, C9577i1 r4, C9349III<? extends T> r5) {
            this.f17444OooO00o = r2;
            this.OooO00o = iliilili;
            this.f17445OooO00o = r4;
            this.f17443OooO00o = r5;
            this.f17446OooO00o = new AtomicInteger();
        }

        public void OooO00o(C9349III<? extends T> r5) {
            if (this.f17446OooO00o.getAndIncrement() == 0) {
                while (!this.f17444OooO00o.isUnsubscribed()) {
                    if (!this.OooO0OO) {
                        if (r5 == null) {
                            OooO00o oooO00o = new OooO00o(this.f17444OooO00o, this.f17445OooO00o);
                            this.OooO00o.OooO00o(oooO00o);
                            this.OooO0OO = true;
                            this.f17443OooO00o.OooO0O0((AbstractC9508LiLi<? super Object>) oooO00o);
                        } else {
                            this.OooO0OO = true;
                            r5.OooO0O0((AbstractC9508LiLi<? super Object>) this);
                            r5 = null;
                        }
                    }
                    if (this.f17446OooO00o.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.f17444OooO00o.onCompleted();
            } else if (!this.f17444OooO00o.isUnsubscribed()) {
                this.OooO0OO = false;
                OooO00o(null);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f17444OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.OooO0O0 = false;
            this.f17444OooO00o.onNext(t);
            this.f17445OooO00o.OooO00o(1);
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r2) {
            this.f17445OooO00o.OooO00o(r2);
        }
    }

    public C6046i1lIlll(C9349III<? extends T> r1, C9349III<? extends T> r2) {
        this.OooO00o = r1;
        this.OooO0O0 = r2;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r5) {
        iLIiLILI iliilili = new iLIiLILI();
        C9577i1 r1 = new C9577i1();
        OooO0O0 oooO0O0 = new OooO0O0(r5, iliilili, r1, this.OooO0O0);
        iliilili.OooO00o(oooO0O0);
        r5.add(iliilili);
        r5.setProducer(r1);
        oooO0O0.OooO00o(this.OooO00o);
    }
}
