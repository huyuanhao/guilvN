package com.p118pd.sdk;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.pd.sdk.i1i11IL */
public final class i1i11IL implements LlIiLii {
    public static final liii1l OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicReference<liii1l> f17392OooO00o;

    /* renamed from: com.pd.sdk.i1i11IL$OooO00o */
    public static class OooO00o implements liii1l {
        @Override // com.p118pd.sdk.liii1l
        public void call() {
        }
    }

    public i1i11IL() {
        this.f17392OooO00o = new AtomicReference<>();
    }

    public static i1i11IL OooO00o() {
        return new i1i11IL();
    }

    @Override // com.p118pd.sdk.LlIiLii
    public boolean isUnsubscribed() {
        return this.f17392OooO00o.get() == OooO00o;
    }

    @Override // com.p118pd.sdk.LlIiLii
    public void unsubscribe() {
        liii1l andSet;
        liii1l r0 = this.f17392OooO00o.get();
        liii1l r1 = OooO00o;
        if (r0 != r1 && (andSet = this.f17392OooO00o.getAndSet(r1)) != null && andSet != OooO00o) {
            andSet.call();
        }
    }

    public static i1i11IL OooO00o(liii1l r1) {
        return new i1i11IL(r1);
    }

    public i1i11IL(liii1l r2) {
        this.f17392OooO00o = new AtomicReference<>(r2);
    }
}
