package com.p118pd.sdk;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.pd.sdk.o0o00O0  reason: case insensitive filesystem */
public class C7553o0o00O0 extends WebChromeClient {
    public final /* synthetic */ C7532o0OoooO OooO00o;

    public C7553o0o00O0(C7532o0OoooO o0ooooo) {
        this.OooO00o = o0ooooo;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return C7532o0OoooO.OooO00o(this.OooO00o).OooO00o(this.OooO00o, str, str2, str3, jsPromptResult);
    }

    public void onProgressChanged(WebView webView, int i) {
        if (i == 100) {
            C7532o0OoooO.OooO00o(this.OooO00o).setVisibility(4);
            return;
        }
        if (4 == C7532o0OoooO.OooO00o(this.OooO00o).getVisibility()) {
            C7532o0OoooO.OooO00o(this.OooO00o).setVisibility(0);
        }
        C7532o0OoooO.OooO00o(this.OooO00o).setProgress(i);
    }

    public void onReceivedTitle(WebView webView, String str) {
        C7532o0OoooO.OooO00o(this.OooO00o).OooO00o(this.OooO00o, str);
    }
}
