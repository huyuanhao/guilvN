package com.p118pd.sdk;

import p293rx.exceptions.OnErrorNotImplementedException;

/* renamed from: com.pd.sdk.lilIl  reason: case insensitive filesystem */
public final class C6695lilIl {

    /* renamed from: com.pd.sdk.lilIl$OooO00o */
    public static class OooO00o extends AbstractC9508LiLi<T> {
        public final /* synthetic */ AbstractC5477Il11 OooO00o;

        public OooO00o(AbstractC5477Il11 r1) {
            this.OooO00o = r1;
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
        }
    }

    /* renamed from: com.pd.sdk.lilIl$OooO0O0 */
    public static class OooO0O0 extends AbstractC9508LiLi<T> {
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

    /* renamed from: com.pd.sdk.lilIl$OooO0OO */
    public static class OooO0OO extends AbstractC9508LiLi<T> {
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

    /* renamed from: com.pd.sdk.lilIl$OooO0Oo  reason: case insensitive filesystem */
    public static class C6696OooO0Oo extends AbstractC9508LiLi<T> {
        public final /* synthetic */ AbstractC6153iL1l OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ liii1l f18637OooO00o;
        public final /* synthetic */ AbstractC6153iL1l OooO0O0;

        public C6696OooO0Oo(liii1l r1, AbstractC6153iL1l il1l, AbstractC6153iL1l il1l2) {
            this.f18637OooO00o = r1;
            this.OooO00o = il1l;
            this.OooO0O0 = il1l2;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public final void onCompleted() {
            this.f18637OooO00o.call();
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

    /* renamed from: com.pd.sdk.lilIl$OooO0o0  reason: case insensitive filesystem */
    public static class C6697OooO0o0 extends AbstractC9508LiLi<T> {
        public final /* synthetic */ AbstractC9508LiLi OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6697OooO0o0(AbstractC9508LiLi r1, AbstractC9508LiLi r2) {
            super(r1);
            this.OooO00o = r2;
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
        }
    }

    public C6695lilIl() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> AbstractC9508LiLi<T> OooO00o() {
        return OooO00o(LIi1.OooO00o());
    }

    public static <T> AbstractC9508LiLi<T> OooO00o(AbstractC5477Il11<? super T> r1) {
        return new OooO00o(r1);
    }

    public static <T> AbstractC9508LiLi<T> OooO00o(AbstractC6153iL1l<? super T> il1l) {
        if (il1l != null) {
            return new OooO0O0(il1l);
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public static <T> AbstractC9508LiLi<T> OooO00o(AbstractC6153iL1l<? super T> il1l, AbstractC6153iL1l<Throwable> il1l2) {
        if (il1l == null) {
            throw new IllegalArgumentException("onNext can not be null");
        } else if (il1l2 != null) {
            return new OooO0OO(il1l2, il1l);
        } else {
            throw new IllegalArgumentException("onError can not be null");
        }
    }

    public static <T> AbstractC9508LiLi<T> OooO00o(AbstractC6153iL1l<? super T> il1l, AbstractC6153iL1l<Throwable> il1l2, liii1l r3) {
        if (il1l == null) {
            throw new IllegalArgumentException("onNext can not be null");
        } else if (il1l2 == null) {
            throw new IllegalArgumentException("onError can not be null");
        } else if (r3 != null) {
            return new C6696OooO0Oo(r3, il1l2, il1l);
        } else {
            throw new IllegalArgumentException("onComplete can not be null");
        }
    }

    public static <T> AbstractC9508LiLi<T> OooO00o(AbstractC9508LiLi<? super T> r1) {
        return new C6697OooO0o0(r1, r1);
    }
}
