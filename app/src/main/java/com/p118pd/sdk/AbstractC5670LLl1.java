package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LLl1  reason: case insensitive filesystem */
public abstract class AbstractC5670LLl1<T, R> extends AbstractC6730ll1Il<T, R> {
    public boolean OooO0OO;

    public AbstractC5670LLl1(AbstractC9508LiLi<? super R> r1) {
        super(r1);
    }

    @Override // com.p118pd.sdk.AbstractC6730ll1Il, com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        if (!this.OooO0OO) {
            this.OooO0OO = true;
            super.onCompleted();
        }
    }

    @Override // com.p118pd.sdk.AbstractC6730ll1Il, com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        if (!this.OooO0OO) {
            this.OooO0OO = true;
            super.onError(th);
            return;
        }
        C9714lli.m21756OooO00o(th);
    }
}
