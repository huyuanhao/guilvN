package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.NoSuchElementException;
import p293rx.internal.producers.SingleProducer;

/* renamed from: com.pd.sdk.iL丨Il丨i1  reason: invalid class name and case insensitive filesystem */
public final class C6204iLIli1<T> implements C9349III.OooO0O0<T, T> {
    public final T OooO00o;
    public final boolean OooO0O0;

    /* renamed from: com.pd.sdk.iL丨Il丨i1$OooO00o */
    public static final class OooO00o {
        public static final C6204iLIli1<?> OooO00o = new C6204iLIli1<>();
    }

    /* renamed from: com.pd.sdk.iL丨Il丨i1$OooO0O0 */
    public static final class OooO0O0<T> extends AbstractC9508LiLi<T> {
        public final AbstractC9508LiLi<? super T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final T f17805OooO00o;
        public T OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final boolean f17806OooO0O0;
        public boolean OooO0OO;
        public boolean OooO0Oo;

        public OooO0O0(AbstractC9508LiLi<? super T> r1, boolean z, T t) {
            this.OooO00o = r1;
            this.f17806OooO0O0 = z;
            this.f17805OooO00o = t;
            request(2);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (this.OooO0Oo) {
                return;
            }
            if (this.OooO0OO) {
                this.OooO00o.setProducer(new SingleProducer(this.OooO00o, this.OooO0O0));
            } else if (this.f17806OooO0O0) {
                this.OooO00o.setProducer(new SingleProducer(this.OooO00o, this.f17805OooO00o));
            } else {
                this.OooO00o.onError(new NoSuchElementException("Sequence contains no elements"));
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.OooO0Oo) {
                C9714lli.m21756OooO00o(th);
            } else {
                this.OooO00o.onError(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (this.OooO0Oo) {
                return;
            }
            if (this.OooO0OO) {
                this.OooO0Oo = true;
                this.OooO00o.onError(new IllegalArgumentException("Sequence contains too many elements"));
                unsubscribe();
                return;
            }
            this.OooO0O0 = t;
            this.OooO0OO = true;
        }
    }

    public C6204iLIli1() {
        this(false, null);
    }

    public static <T> C6204iLIli1<T> OooO00o() {
        return (C6204iLIli1<T>) OooO00o.OooO00o;
    }

    public C6204iLIli1(T t) {
        this(true, t);
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r4) {
        OooO0O0 oooO0O0 = new OooO0O0(r4, this.OooO0O0, this.OooO00o);
        r4.add(oooO0O0);
        return oooO0O0;
    }

    public C6204iLIli1(boolean z, T t) {
        this.OooO0O0 = z;
        this.OooO00o = t;
    }
}
