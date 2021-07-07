package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨1L丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC93021L<T> implements LlIiLii {
    public final C9862ll OooO00o = new C9862ll();

    public final void OooO00o(LlIiLii llIiLii) {
        this.OooO00o.OooO00o(llIiLii);
    }

    public abstract void OooO00o(T t);

    @Override // com.p118pd.sdk.LlIiLii
    public final boolean isUnsubscribed() {
        return this.OooO00o.isUnsubscribed();
    }

    public abstract void onError(Throwable th);

    @Override // com.p118pd.sdk.LlIiLii
    public final void unsubscribe() {
        this.OooO00o.unsubscribe();
    }
}
