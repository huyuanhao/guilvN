package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;

/* renamed from: com.pd.sdk.iili丨I丨  reason: invalid class name and case insensitive filesystem */
public final class C6278iiliI<T> implements C9349III.OooO00o<T> {
    public final LL1LL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<T> f17954OooO00o;
    public final boolean OooO0O0;

    /* renamed from: com.pd.sdk.iili丨I丨$OooO00o */
    public static final class OooO00o<T> extends AbstractC9508LiLi<T> implements liii1l {
        public final LL1LL.OooO00o OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C9349III<T> f17955OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super T> f17956OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Thread f17957OooO00o;
        public final boolean OooO0O0;

        /* renamed from: com.pd.sdk.iili丨I丨$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4940OooO00o implements AbstractC9465L1l1 {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC9465L1l1 f17958OooO00o;

            /* renamed from: com.pd.sdk.iili丨I丨$OooO00o$OooO00o$OooO00o  reason: collision with other inner class name */
            public class C4941OooO00o implements liii1l {
                public final /* synthetic */ long OooO00o;

                public C4941OooO00o(long j) {
                    this.OooO00o = j;
                }

                @Override // com.p118pd.sdk.liii1l
                public void call() {
                    C4940OooO00o.this.f17958OooO00o.request(this.OooO00o);
                }
            }

            public C4940OooO00o(AbstractC9465L1l1 r2) {
                this.f17958OooO00o = r2;
            }

            @Override // com.p118pd.sdk.AbstractC9465L1l1
            public void request(long j) {
                if (OooO00o.this.f17957OooO00o != Thread.currentThread()) {
                    OooO00o oooO00o = OooO00o.this;
                    if (oooO00o.OooO0O0) {
                        oooO00o.OooO00o.OooO00o(new C4941OooO00o(j));
                        return;
                    }
                }
                this.f17958OooO00o.request(j);
            }
        }

        public OooO00o(AbstractC9508LiLi<? super T> r1, boolean z, LL1LL.OooO00o oooO00o, C9349III<T> r4) {
            this.f17956OooO00o = r1;
            this.OooO0O0 = z;
            this.OooO00o = oooO00o;
            this.f17955OooO00o = r4;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            C9349III<T> r0 = this.f17955OooO00o;
            this.f17955OooO00o = null;
            this.f17957OooO00o = Thread.currentThread();
            r0.OooO0O0((AbstractC9508LiLi) this);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            try {
                this.f17956OooO00o.onCompleted();
            } finally {
                this.OooO00o.unsubscribe();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            try {
                this.f17956OooO00o.onError(th);
            } finally {
                this.OooO00o.unsubscribe();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.f17956OooO00o.onNext(t);
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r3) {
            this.f17956OooO00o.setProducer(new C4940OooO00o(r3));
        }
    }

    public C6278iiliI(C9349III<T> r1, LL1LL ll1ll, boolean z) {
        this.OooO00o = ll1ll;
        this.f17954OooO00o = r1;
        this.OooO0O0 = z;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r5) {
        LL1LL.OooO00o OooO00o2 = this.OooO00o.m16172OooO00o();
        OooO00o oooO00o = new OooO00o(r5, this.OooO0O0, OooO00o2, this.f17954OooO00o);
        r5.add(oooO00o);
        r5.add(OooO00o2);
        OooO00o2.OooO00o(oooO00o);
    }
}
