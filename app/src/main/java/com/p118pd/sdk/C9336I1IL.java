package com.p118pd.sdk;

import p293rx.Notification;

/* renamed from: com.pd.sdk.丨I1IL丨  reason: invalid class name and case insensitive filesystem */
public final class C9336I1IL<T> implements AbstractC5477Il11<T> {
    public final AbstractC6153iL1l<Notification<? super T>> OooO00o;

    public C9336I1IL(AbstractC6153iL1l<Notification<? super T>> il1l) {
        this.OooO00o = il1l;
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        this.OooO00o.call(Notification.OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        this.OooO00o.call(Notification.OooO00o(th));
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onNext(T t) {
        this.OooO00o.call(Notification.OooO00o((Object) t));
    }
}
