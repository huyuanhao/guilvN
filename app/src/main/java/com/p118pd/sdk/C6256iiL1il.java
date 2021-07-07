package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iiL丨1丨il  reason: invalid class name and case insensitive filesystem */
public final class C6256iiL1il<T> implements AbstractC5477Il11<T> {
    public final AbstractC6153iL1l<? super T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final liii1l f17884OooO00o;
    public final AbstractC6153iL1l<? super Throwable> OooO0O0;

    public C6256iiL1il(AbstractC6153iL1l<? super T> il1l, AbstractC6153iL1l<? super Throwable> il1l2, liii1l r3) {
        this.OooO00o = il1l;
        this.OooO0O0 = il1l2;
        this.f17884OooO00o = r3;
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        this.f17884OooO00o.call();
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        this.OooO0O0.call(th);
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onNext(T t) {
        this.OooO00o.call(t);
    }
}
