package com.p118pd.sdk;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;

/* renamed from: com.pd.sdk.o0Oo0o0o  reason: case insensitive filesystem */
public class C7468o0Oo0o0o extends WebViewClient {
    public Activity OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f20292OooO00o = new Handler(this.OooO00o.getMainLooper());

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7534o0OoooOO f20293OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20294OooO00o;
    public boolean OooO0O0;

    /* renamed from: com.pd.sdk.o0Oo0o0o$OooO00o */
    public static final class OooO00o implements Runnable {
        public final WeakReference<C7468o0Oo0o0o> OooO00o;

        public OooO00o(C7468o0Oo0o0o o0oo0o0o) {
            this.OooO00o = new WeakReference<>(o0oo0o0o);
        }

        public void run() {
            C7468o0Oo0o0o o0oo0o0o = this.OooO00o.get();
            if (o0oo0o0o != null) {
                o0oo0o0o.OooO0OO();
            }
        }
    }

    public C7468o0Oo0o0o(Activity activity) {
        this.OooO00o = activity;
    }

    private void OooO0O0() {
        Activity activity = this.OooO00o;
        if (activity != null) {
            if (this.f20293OooO00o == null) {
                C7534o0OoooOO o0oooooo = new C7534o0OoooOO(activity, C7534o0OoooOO.OooO0O0);
                this.f20293OooO00o = o0oooooo;
                o0oooooo.OooO00o(true);
            }
            this.f20293OooO00o.m19201OooO00o();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0OO() {
        C7534o0OoooOO o0oooooo = this.f20293OooO00o;
        if (o0oooooo != null) {
            o0oooooo.OooO0O0();
        }
        this.f20293OooO00o = null;
    }

    public void onPageFinished(WebView webView, String str) {
        Activity activity = this.OooO00o;
        if (this.f20292OooO00o != null && activity != null && !activity.isFinishing()) {
            OooO0OO();
            this.f20292OooO00o.removeCallbacksAndMessages(null);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Activity activity = this.OooO00o;
        if (!(this.f20292OooO00o == null || activity == null || activity.isFinishing())) {
            OooO0O0();
            this.f20292OooO00o.postDelayed(new OooO00o(this), 30000);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.OooO0O0 = true;
        super.onReceivedError(webView, i, str, str2);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Activity activity = this.OooO00o;
        if (activity != null) {
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0O, C7482o0OoO0OO.OooOoo0, "1" + sslError);
            if (this.f20294OooO00o) {
                sslErrorHandler.proceed();
                this.f20294OooO00o = false;
                return;
            }
            activity.runOnUiThread(new RunnableC7470o0Oo0oO0(this, activity, sslErrorHandler));
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return C7531o0Oooo0o.OooO00o(webView, str, this.OooO00o);
    }

    public void OooO00o() {
        this.f20292OooO00o = null;
        this.OooO00o = null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19091OooO00o() {
        return this.OooO0O0;
    }
}
