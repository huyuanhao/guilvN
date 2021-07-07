package com.p118pd.sdk;

import android.app.Activity;
import android.webkit.SslErrorHandler;

/* renamed from: com.pd.sdk.o0Oo0oO0  reason: case insensitive filesystem */
public class RunnableC7470o0Oo0oO0 implements Runnable {
    public final /* synthetic */ Activity OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ SslErrorHandler f20295OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ C7468o0Oo0o0o f20296OooO00o;

    public RunnableC7470o0Oo0oO0(C7468o0Oo0o0o o0oo0o0o, Activity activity, SslErrorHandler sslErrorHandler) {
        this.f20296OooO00o = o0oo0o0o;
        this.OooO00o = activity;
        this.f20295OooO00o = sslErrorHandler;
    }

    public void run() {
        C7538o0OooooO.OooO00o(this.OooO00o, "安全警告", "安全连接证书校验无效，将无法保证访问数据的安全性，可能存在风险，请选择是否继续？", "继续", new DialogInterface$OnClickListenerC7469o0Oo0oO(this), "退出", new DialogInterface$OnClickListenerC7473o0Oo0oo0(this));
    }
}
