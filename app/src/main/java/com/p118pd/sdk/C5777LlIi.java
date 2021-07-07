package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import java.util.concurrent.TimeoutException;

/* renamed from: com.pd.sdk.LlIi丨  reason: invalid class name and case insensitive filesystem */
public class C5777LlIi<T> implements C9349III.OooO0O0<T, T> {
    public final LL1LL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o<T> f16697OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0<T> f16698OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<? extends T> f16699OooO00o;

    /* renamed from: com.pd.sdk.LlIi丨$OooO00o */
    public interface OooO00o<T> extends AbstractC9359IIIi<OooO0OO<T>, Long, LL1LL.OooO00o, LlIiLii> {
    }

    /* renamed from: com.pd.sdk.LlIi丨$OooO0O0 */
    public interface OooO0O0<T> extends i1li1ii1<OooO0OO<T>, Long, T, LL1LL.OooO00o, LlIiLii> {
    }

    /* renamed from: com.pd.sdk.LlIi丨$OooO0OO */
    public static final class OooO0OO<T> extends AbstractC9508LiLi<T> {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final IL11lL<T> f16700OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LL1LL.OooO00o f16701OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0O0<T> f16702OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final iLIiLILI f16703OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9349III<? extends T> f16704OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9577i1 f16705OooO00o = new C9577i1();
        public boolean OooO0O0;

        /* renamed from: com.pd.sdk.LlIi丨$OooO0OO$OooO00o */
        public class OooO00o extends AbstractC9508LiLi<T> {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                OooO0OO.this.f16700OooO00o.onCompleted();
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                OooO0OO.this.f16700OooO00o.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(T t) {
                OooO0OO.this.f16700OooO00o.onNext(t);
            }

            @Override // com.p118pd.sdk.AbstractC9508LiLi
            public void setProducer(AbstractC9465L1l1 r2) {
                OooO0OO.this.f16705OooO00o.OooO00o(r2);
            }
        }

        public OooO0OO(IL11lL<T> r1, OooO0O0<T> oooO0O0, iLIiLILI iliilili, C9349III<? extends T> r4, LL1LL.OooO00o oooO00o) {
            this.f16700OooO00o = r1;
            this.f16702OooO00o = oooO0O0;
            this.f16703OooO00o = iliilili;
            this.f16704OooO00o = r4;
            this.f16701OooO00o = oooO00o;
        }

        public void OooO00o(long j) {
            boolean z;
            synchronized (this) {
                z = true;
                if (j != this.OooO00o || this.OooO0O0) {
                    z = false;
                } else {
                    this.OooO0O0 = true;
                }
            }
            if (!z) {
                return;
            }
            if (this.f16704OooO00o == null) {
                this.f16700OooO00o.onError(new TimeoutException());
                return;
            }
            OooO00o oooO00o = new OooO00o();
            this.f16704OooO00o.OooO0O0((AbstractC9508LiLi<? super Object>) oooO00o);
            this.f16703OooO00o.OooO00o(oooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            boolean z;
            synchronized (this) {
                z = true;
                if (!this.OooO0O0) {
                    this.OooO0O0 = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                this.f16703OooO00o.unsubscribe();
                this.f16700OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            boolean z;
            synchronized (this) {
                z = true;
                if (!this.OooO0O0) {
                    this.OooO0O0 = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                this.f16703OooO00o.unsubscribe();
                this.f16700OooO00o.onError(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            boolean z;
            long j;
            synchronized (this) {
                if (!this.OooO0O0) {
                    j = this.OooO00o + 1;
                    this.OooO00o = j;
                    z = true;
                } else {
                    j = this.OooO00o;
                    z = false;
                }
            }
            if (z) {
                this.f16700OooO00o.onNext(t);
                this.f16703OooO00o.OooO00o((LlIiLii) this.f16702OooO00o.OooO00o(this, Long.valueOf(j), t, this.f16701OooO00o));
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r2) {
            this.f16705OooO00o.OooO00o(r2);
        }
    }

    public C5777LlIi(OooO00o<T> oooO00o, OooO0O0<T> oooO0O0, C9349III<? extends T> r3, LL1LL ll1ll) {
        this.f16697OooO00o = oooO00o;
        this.f16698OooO00o = oooO0O0;
        this.f16699OooO00o = r3;
        this.OooO00o = ll1ll;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r10) {
        LL1LL.OooO00o OooO00o2 = this.OooO00o.m16172OooO00o();
        r10.add(OooO00o2);
        IL11lL r7 = new IL11lL(r10);
        iLIiLILI iliilili = new iLIiLILI();
        r7.add(iliilili);
        OooO0OO oooO0OO = new OooO0OO(r7, this.f16698OooO00o, iliilili, this.f16699OooO00o, OooO00o2);
        r7.add(oooO0OO);
        r7.setProducer(oooO0OO.f16705OooO00o);
        iliilili.OooO00o((LlIiLii) this.f16697OooO00o.OooO00o(oooO0OO, 0L, OooO00o2));
        return oooO0OO;
    }
}
