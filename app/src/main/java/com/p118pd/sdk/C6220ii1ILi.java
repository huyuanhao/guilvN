package com.p118pd.sdk;

import p293rx.exceptions.CompositeException;
import p293rx.exceptions.OnCompletedFailedException;
import p293rx.exceptions.OnErrorFailedException;

/* renamed from: com.pd.sdk.ii1ILi  reason: case insensitive filesystem */
public final class C6220ii1ILi implements AbstractC6473l1II, LlIiLii {
    public LlIiLii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6473l1II f17833OooO00o;
    public boolean OooO0O0;

    public C6220ii1ILi(AbstractC6473l1II r1) {
        this.f17833OooO00o = r1;
    }

    @Override // com.p118pd.sdk.LlIiLii
    public boolean isUnsubscribed() {
        return this.OooO0O0 || this.OooO00o.isUnsubscribed();
    }

    @Override // com.p118pd.sdk.AbstractC6473l1II
    public void onCompleted() {
        if (!this.OooO0O0) {
            this.OooO0O0 = true;
            try {
                this.f17833OooO00o.onCompleted();
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                throw new OnCompletedFailedException(th);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6473l1II
    public void onError(Throwable th) {
        C9714lli.m21756OooO00o(th);
        if (!this.OooO0O0) {
            this.OooO0O0 = true;
            try {
                this.f17833OooO00o.onError(th);
            } catch (Throwable th2) {
                IIl11.m15447OooO00o(th2);
                throw new OnErrorFailedException(new CompositeException(th, th2));
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6473l1II
    public void onSubscribe(LlIiLii llIiLii) {
        this.OooO00o = llIiLii;
        try {
            this.f17833OooO00o.onSubscribe(this);
        } catch (Throwable th) {
            IIl11.m15447OooO00o(th);
            llIiLii.unsubscribe();
            onError(th);
        }
    }

    @Override // com.p118pd.sdk.LlIiLii
    public void unsubscribe() {
        this.OooO00o.unsubscribe();
    }
}
