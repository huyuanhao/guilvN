package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: com.pd.sdk.Il1iIili */
public final class Il1iIili<T, R> implements C9349III.OooO00o<R> {
    public final AbstractC6021i1L<R> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<T> f15791OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Iterable<C9349III<?>> f15792OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<?>[] f15793OooO00o;

    /* renamed from: com.pd.sdk.Il1iIili$OooO0O0 */
    public static final class OooO0O0 extends AbstractC9508LiLi<Object> {
        public final OooO00o<?, ?> OooO00o;
        public final int o00oO0O;

        public OooO0O0(OooO00o<?, ?> oooO00o, int i) {
            this.OooO00o = oooO00o;
            this.o00oO0O = i;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO00o.OooO00o(this.o00oO0O);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.OooO00o(this.o00oO0O, th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(Object obj) {
            this.OooO00o.OooO00o(this.o00oO0O, obj);
        }
    }

    public Il1iIili(C9349III<T> r1, C9349III<?>[] r2, Iterable<C9349III<?>> iterable, AbstractC6021i1L<R> i1l) {
        this.f15791OooO00o = r1;
        this.f15793OooO00o = r2;
        this.f15792OooO00o = iterable;
        this.OooO00o = i1l;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super R> r8) {
        int i;
        IL11lL r0 = new IL11lL(r8);
        C9349III<?>[] r1 = this.f15793OooO00o;
        int i2 = 0;
        if (r1 != null) {
            i = r1.length;
        } else {
            r1 = new C9349III[8];
            int i3 = 0;
            for (C9349III<?> r5 : this.f15792OooO00o) {
                if (i3 == r1.length) {
                    r1 = (C9349III[]) Arrays.copyOf(r1, (i3 >> 2) + i3);
                }
                r1[i3] = r5;
                i3++;
            }
            i = i3;
        }
        OooO00o oooO00o = new OooO00o(r8, this.OooO00o, i);
        r0.add(oooO00o);
        while (i2 < i) {
            if (!r0.isUnsubscribed()) {
                int i4 = i2 + 1;
                OooO0O0 oooO0O0 = new OooO0O0(oooO00o, i4);
                oooO00o.add(oooO0O0);
                r1[i2].OooO0O0((AbstractC9508LiLi<? super Object>) oooO0O0);
                i2 = i4;
            } else {
                return;
            }
        }
        this.f15791OooO00o.OooO0O0((AbstractC9508LiLi) oooO00o);
    }

    /* renamed from: com.pd.sdk.Il1iIili$OooO00o */
    public static final class OooO00o<T, R> extends AbstractC9508LiLi<T> {
        public static final Object OooO00o = new Object();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC6021i1L<R> f15794OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super R> f15795OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f15796OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicReferenceArray<Object> f15797OooO00o;
        public boolean OooO0O0;

        public OooO00o(AbstractC9508LiLi<? super R> r2, AbstractC6021i1L<R> i1l, int i) {
            this.f15795OooO00o = r2;
            this.f15794OooO00o = i1l;
            AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(i + 1);
            for (int i2 = 0; i2 <= i; i2++) {
                atomicReferenceArray.lazySet(i2, OooO00o);
            }
            this.f15797OooO00o = atomicReferenceArray;
            this.f15796OooO00o = new AtomicInteger(i);
            request(0);
        }

        public void OooO00o(int i, Object obj) {
            if (this.f15797OooO00o.getAndSet(i, obj) == OooO00o) {
                this.f15796OooO00o.decrementAndGet();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                unsubscribe();
                this.f15795OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.OooO0O0) {
                C9714lli.m21756OooO00o(th);
                return;
            }
            this.OooO0O0 = true;
            unsubscribe();
            this.f15795OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.OooO0O0) {
                if (this.f15796OooO00o.get() == 0) {
                    AtomicReferenceArray<Object> atomicReferenceArray = this.f15797OooO00o;
                    int length = atomicReferenceArray.length();
                    atomicReferenceArray.lazySet(0, t);
                    Object[] objArr = new Object[atomicReferenceArray.length()];
                    for (int i = 0; i < length; i++) {
                        objArr[i] = atomicReferenceArray.get(i);
                    }
                    try {
                        this.f15795OooO00o.onNext(this.f15794OooO00o.call(objArr));
                    } catch (Throwable th) {
                        IIl11.m15447OooO00o(th);
                        onError(th);
                    }
                } else {
                    request(1);
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r2) {
            super.setProducer(r2);
            this.f15795OooO00o.setProducer(r2);
        }

        public void OooO00o(int i, Throwable th) {
            onError(th);
        }

        public void OooO00o(int i) {
            if (this.f15797OooO00o.get(i) == OooO00o) {
                onCompleted();
            }
        }
    }
}
