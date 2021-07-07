package com.p118pd.sdk;

import p293rx.exceptions.OnErrorNotImplementedException;

/* renamed from: com.pd.sdk.LIi1丨  reason: invalid class name */
public final class LIi1 {
    public static final AbstractC5477Il11<Object> OooO00o = new OooO00o();

    /* renamed from: com.pd.sdk.LIi1丨$OooO00o */
    public static class OooO00o implements AbstractC5477Il11<Object> {
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public final void onCompleted() {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public final void onError(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public final void onNext(Object obj) {
        }
    }

    /* renamed from: com.pd.sdk.LIi1丨$OooO0O0 */
    public static class OooO0O0 implements AbstractC5477Il11<T> {
        public final /* synthetic */ AbstractC6153iL1l OooO00o;

        public OooO0O0(AbstractC6153iL1l il1l) {
            this.OooO00o = il1l;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public final void onCompleted() {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public final void onError(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public final void onNext(T t) {
            this.OooO00o.call(t);
        }
    }

    /* renamed from: com.pd.sdk.LIi1丨$OooO0OO */
    public static class OooO0OO implements AbstractC5477Il11<T> {
        public final /* synthetic */ AbstractC6153iL1l OooO00o;
        public final /* synthetic */ AbstractC6153iL1l OooO0O0;

        public OooO0OO(AbstractC6153iL1l il1l, AbstractC6153iL1l il1l2) {
            this.OooO00o = il1l;
            this.OooO0O0 = il1l2;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public final void onCompleted() {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public final void onError(Throwable th) {
            this.OooO00o.call(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public final void onNext(T t) {
            this.OooO0O0.call(t);
        }
    }

    /* renamed from: com.pd.sdk.LIi1丨$OooO0Oo  reason: case insensitive filesystem */
    public static class C5626OooO0Oo implements AbstractC5477Il11<T> {
        public final /* synthetic */ AbstractC6153iL1l OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ liii1l f16316OooO00o;
        public final /* synthetic */ AbstractC6153iL1l OooO0O0;

        public C5626OooO0Oo(liii1l r1, AbstractC6153iL1l il1l, AbstractC6153iL1l il1l2) {
            this.f16316OooO00o = r1;
            this.OooO00o = il1l;
            this.OooO0O0 = il1l2;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public final void onCompleted() {
            this.f16316OooO00o.call();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public final void onError(Throwable th) {
            this.OooO00o.call(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public final void onNext(T t) {
            this.OooO0O0.call(t);
        }
    }

    public LIi1() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> AbstractC5477Il11<T> OooO00o() {
        return (AbstractC5477Il11<T>) OooO00o;
    }

    public static <T> AbstractC5477Il11<T> OooO00o(AbstractC6153iL1l<? super T> il1l) {
        if (il1l != null) {
            return new OooO0O0(il1l);
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public static <T> AbstractC5477Il11<T> OooO00o(AbstractC6153iL1l<? super T> il1l, AbstractC6153iL1l<Throwable> il1l2) {
        if (il1l == null) {
            throw new IllegalArgumentException("onNext can not be null");
        } else if (il1l2 != null) {
            return new OooO0OO(il1l2, il1l);
        } else {
            throw new IllegalArgumentException("onError can not be null");
        }
    }

    public static <T> AbstractC5477Il11<T> OooO00o(AbstractC6153iL1l<? super T> il1l, AbstractC6153iL1l<Throwable> il1l2, liii1l r3) {
        if (il1l == null) {
            throw new IllegalArgumentException("onNext can not be null");
        } else if (il1l2 == null) {
            throw new IllegalArgumentException("onError can not be null");
        } else if (r3 != null) {
            return new C5626OooO0Oo(r3, il1l2, il1l);
        } else {
            throw new IllegalArgumentException("onComplete can not be null");
        }
    }
}
