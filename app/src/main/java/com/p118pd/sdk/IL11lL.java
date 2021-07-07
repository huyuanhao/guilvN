package com.p118pd.sdk;

/* renamed from: com.pd.sdk.IL丨11lL  reason: invalid class name */
public class IL11lL<T> extends AbstractC9508LiLi<T> {
    public final AbstractC5477Il11<T> OooO00o;

    public IL11lL(AbstractC9508LiLi<? super T> r2) {
        this(r2, true);
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

    public IL11lL(AbstractC9508LiLi<? super T> r1, boolean z) {
        super(r1, z);
        this.OooO00o = new C5468IllIL(r1);
    }
}
