package com.p118pd.sdk;

import com.alipay.sdk.app.H5PayCallback;
import com.alipay.sdk.app.PayTask;

/* renamed from: com.pd.sdk.o0Oo0ooo  reason: case insensitive filesystem */
public class RunnableC7475o0Oo0ooo implements Runnable {
    public final /* synthetic */ H5PayCallback OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ PayTask f20297OooO00o;
    public final /* synthetic */ boolean OooO0O0;
    public final /* synthetic */ String o0ooOOo;

    public RunnableC7475o0Oo0ooo(PayTask payTask, String str, boolean z, H5PayCallback h5PayCallback) {
        this.f20297OooO00o = payTask;
        this.o0ooOOo = str;
        this.OooO0O0 = z;
        this.OooO00o = h5PayCallback;
    }

    public void run() {
        this.OooO00o.onPayResult(this.f20297OooO00o.h5Pay(this.o0ooOOo, this.OooO0O0));
    }
}
