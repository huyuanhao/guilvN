package com.jinhui365.util.webview;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.Keep;

@Keep
public class JHWebChromeClient extends WebChromeClient {
    public WebChromeClientCallBack OooO00o;

    public void OooO00o(WebChromeClientCallBack webChromeClientCallBack) {
        this.OooO00o = webChromeClientCallBack;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        WebChromeClientCallBack webChromeClientCallBack = this.OooO00o;
        if (webChromeClientCallBack == null) {
            return true;
        }
        webChromeClientCallBack.OooO00o(valueCallback, fileChooserParams.getAcceptTypes());
        return true;
    }

    public void OooO00o(ValueCallback<Uri> valueCallback, String str) {
        WebChromeClientCallBack webChromeClientCallBack = this.OooO00o;
        if (webChromeClientCallBack != null) {
            webChromeClientCallBack.OooO00o(valueCallback, str);
        }
    }

    public void OooO00o(ValueCallback<Uri> valueCallback) {
        OooO00o(valueCallback, "*/*");
    }

    public void OooO00o(ValueCallback<Uri> valueCallback, String str, String str2) {
        OooO00o(valueCallback, str);
    }
}
