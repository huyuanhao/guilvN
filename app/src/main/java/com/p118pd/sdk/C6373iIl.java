package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.i丨Il  reason: invalid class name and case insensitive filesystem */
public class C6373iIl<T, R> extends AbstractC5635LIi1<T, R> {
    public final C5468IllIL<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC5635LIi1<T, R> f18159OooO00o;

    /* renamed from: com.pd.sdk.i丨Il$OooO00o */
    public class OooO00o implements C9349III.OooO00o<R> {
        public final /* synthetic */ AbstractC5635LIi1 OooO00o;

        public OooO00o(AbstractC5635LIi1 r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super R> r2) {
            this.OooO00o.OooO0O0((AbstractC9508LiLi) r2);
        }
    }

    public C6373iIl(AbstractC5635LIi1<T, R> r2) {
        super(new OooO00o(r2));
        this.f18159OooO00o = r2;
        this.OooO00o = new C5468IllIL<>(r2);
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    public boolean OooO00o() {
        return this.f18159OooO00o.m16112OooO00o();
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
