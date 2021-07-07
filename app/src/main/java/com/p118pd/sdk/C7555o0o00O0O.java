package com.p118pd.sdk;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.pd.sdk.o0o00O0O  reason: case insensitive filesystem */
public class C7555o0o00O0O extends WebViewClient {
    public final /* synthetic */ C7532o0OoooO OooO00o;

    public C7555o0o00O0O(C7532o0OoooO o0ooooo) {
        this.OooO00o = o0ooooo;
    }

    public void onPageFinished(WebView webView, String str) {
        if (!C7532o0OoooO.OooO00o(this.OooO00o).OooO00o(this.OooO00o, str)) {
            super.onPageFinished(webView, str);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        if (!C7532o0OoooO.OooO00o(this.OooO00o).OooO00o(this.OooO00o, i, str, str2)) {
            super.onReceivedError(webView, i, str, str2);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (!C7532o0OoooO.OooO00o(this.OooO00o).OooO00o(this.OooO00o, sslErrorHandler, sslError)) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!C7532o0OoooO.OooO00o(this.OooO00o).OooO0O0(this.OooO00o, str)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
