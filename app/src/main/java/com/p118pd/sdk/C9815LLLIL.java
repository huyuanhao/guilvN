package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import p293rx.exceptions.OnErrorThrowable;

/* renamed from: com.pd.sdk.丨丨LLLIL  reason: invalid class name and case insensitive filesystem */
public final class C9815LLLIL<T, U, R> implements C9349III.OooO0O0<C9349III<? extends R>, T> {
    public final AbstractC5189I1l1l<? super T, ? super U, ? extends R> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super T, ? extends C9349III<? extends U>> f23410OooO00o;

    /* renamed from: com.pd.sdk.丨丨LLLIL$OooO00o */
    public static class OooO00o implements AbstractC9847l1<T, C9349III<U>> {
        public final /* synthetic */ AbstractC9847l1 OooO00o;

        public OooO00o(AbstractC9847l1 r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public C9349III<U> call(T t) {
            return C9349III.OooO0o((Iterable) this.OooO00o.call(t));
        }
    }

    /* renamed from: com.pd.sdk.丨丨LLLIL$OooO0O0 */
    public static final class OooO0O0<T, U, R> extends AbstractC9508LiLi<T> {
        public final AbstractC5189I1l1l<? super T, ? super U, ? extends R> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super C9349III<? extends R>> f23411OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9847l1<? super T, ? extends C9349III<? extends U>> f23412OooO00o;
        public boolean OooO0O0;

        public OooO0O0(AbstractC9508LiLi<? super C9349III<? extends R>> r1, AbstractC9847l1<? super T, ? extends C9349III<? extends U>> r2, AbstractC5189I1l1l<? super T, ? super U, ? extends R> r3) {
            this.f23411OooO00o = r1;
            this.f23412OooO00o = r2;
            this.OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.f23411OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.OooO0O0) {
                C9714lli.m21756OooO00o(th);
                return;
            }
            this.OooO0O0 = true;
            this.f23411OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            try {
                this.f23411OooO00o.onNext(((C9349III) this.f23412OooO00o.call(t)).OooOOoo(new OooO0OO(t, this.OooO00o)));
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r2) {
            this.f23411OooO00o.setProducer(r2);
        }
    }

    /* renamed from: com.pd.sdk.丨丨LLLIL$OooO0OO */
    public static final class OooO0OO<T, U, R> implements AbstractC9847l1<U, R> {
        public final AbstractC5189I1l1l<? super T, ? super U, ? extends R> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final T f23413OooO00o;

        public OooO0OO(T t, AbstractC5189I1l1l<? super T, ? super U, ? extends R> r2) {
            this.f23413OooO00o = t;
            this.OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC9847l1
        public R call(U u) {
            return (R) this.OooO00o.OooO00o(this.f23413OooO00o, u);
        }
    }

    public C9815LLLIL(AbstractC9847l1<? super T, ? extends C9349III<? extends U>> r1, AbstractC5189I1l1l<? super T, ? super U, ? extends R> r2) {
        this.f23410OooO00o = r1;
        this.OooO00o = r2;
    }

    public static <T, U> AbstractC9847l1<T, C9349III<U>> OooO00o(AbstractC9847l1<? super T, ? extends Iterable<? extends U>> r1) {
        return new OooO00o(r1);
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super C9349III<? extends R>> r4) {
        OooO0O0 oooO0O0 = new OooO0O0(r4, this.f23410OooO00o, this.OooO00o);
        r4.add(oooO0O0);
        return oooO0O0;
    }
}
