package com.p118pd.sdk;

import p293rx.internal.subscriptions.SequentialSubscription;

/* renamed from: com.pd.sdk.iLIiLILI */
public final class iLIiLILI implements LlIiLii {
    public final SequentialSubscription OooO00o = new SequentialSubscription();

    public void OooO00o(LlIiLii llIiLii) {
        if (llIiLii != null) {
            this.OooO00o.update(llIiLii);
            return;
        }
        throw new IllegalArgumentException("Subscription can not be null");
    }

    @Override // com.p118pd.sdk.LlIiLii
    public boolean isUnsubscribed() {
        return this.OooO00o.isUnsubscribed();
    }

    @Override // com.p118pd.sdk.LlIiLii
    public void unsubscribe() {
        this.OooO00o.unsubscribe();
    }

    public LlIiLii OooO00o() {
        return this.OooO00o.current();
    }
}
