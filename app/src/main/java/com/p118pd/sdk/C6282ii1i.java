package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ii丨1i  reason: invalid class name and case insensitive filesystem */
public final class C6282ii1i<T> extends AbstractC9508LiLi<T> {
    public final AbstractC5477Il11<? super T> OooO00o;

    public C6282ii1i(AbstractC5477Il11<? super T> r1) {
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
