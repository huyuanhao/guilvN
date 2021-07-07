package com.p118pd.sdk;

import com.p118pd.sdk.LL1LL;

/* renamed from: com.pd.sdk.IIlI丨lI  reason: invalid class name */
public class IIlIlI implements liii1l {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL.OooO00o f15511OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final liii1l f15512OooO00o;

    public IIlIlI(liii1l r1, LL1LL.OooO00o oooO00o, long j) {
        this.f15512OooO00o = r1;
        this.f15511OooO00o = oooO00o;
        this.OooO00o = j;
    }

    @Override // com.p118pd.sdk.liii1l
    public void call() {
        if (!this.f15511OooO00o.isUnsubscribed()) {
            long OooO0O0 = this.OooO00o - this.f15511OooO00o.OooO0O0();
            if (OooO0O0 > 0) {
                try {
                    Thread.sleep(OooO0O0);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    IIl11.OooO00o((Throwable) e);
                }
            }
            if (!this.f15511OooO00o.isUnsubscribed()) {
                this.f15512OooO00o.call();
            }
        }
    }
}
