package com.p118pd.sdk;

import android.webkit.SslErrorHandler;

/* renamed from: com.pd.sdk.o0o000o0  reason: case insensitive filesystem */
public class RunnableC7549o0o000o0 implements Runnable {
    public final /* synthetic */ SslErrorHandler OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ C7546o0o000O0 f20410OooO00o;

    public RunnableC7549o0o000o0(C7546o0o000O0 o0o000o0, SslErrorHandler sslErrorHandler) {
        this.f20410OooO00o = o0o000o0;
        this.OooO00o = sslErrorHandler;
    }

    public void run() {
        C7538o0OooooO.OooO00o(((AbstractC7611o0o0o00O) this.f20410OooO00o).OooO00o, "安全警告", "安全連接證書校驗無效，將無法保證訪問資料的安全性，可能存在風險，請選擇是否繼續？", "繼續", new DialogInterface$OnClickListenerC7550o0o000oO(this), "退出", new DialogInterface$OnClickListenerC7551o0o000oo(this));
    }
}
