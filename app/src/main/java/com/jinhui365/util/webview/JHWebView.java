package com.jinhui365.util.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Keep;
import com.jinhui365.util.webview.AppSendWebData;
import java.util.Map;

@Keep
public abstract class JHWebView extends WebView {
    public static final int o00oO0O = 80000;
    public Handler OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public DownloadListener f15037OooO00o = new OooO0OO();

    /* renamed from: OooO00o  reason: collision with other field name */
    public WebViewClient f15038OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public JHWebChromeClient f15039OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public WebSendAppData f15040OooO00o;

    public class OooO00o extends Handler {
        public OooO00o() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 80000) {
                JHWebView.this.f15040OooO00o = new WebSendAppData((String) message.obj);
                JHWebView.this.OooO00o();
            }
        }
    }

    public class OooO0O0 extends WebViewClient {
        public OooO0O0() {
        }

        private boolean OooO00o(WebView webView, String str) {
            return JHWebView.this.m15126OooO00o(webView, str);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            JHWebView.this.OooO00o(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            JHWebView.this.OooO00o(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            JHWebView.this.OooO00o(webView, i, str, str2);
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            JHWebView.this.OooO00o(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return JHWebView.this.m15126OooO00o(webView, str);
        }
    }

    public class OooO0OO implements DownloadListener {
        public OooO0OO() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            JHWebView.this.OooO00o(str, str2, str3, str4, j);
        }
    }

    /* renamed from: com.jinhui365.util.webview.JHWebView$OooO0Oo  reason: case insensitive filesystem */
    public class C5124OooO0Oo implements ValueCallback<String> {
        public C5124OooO0Oo() {
        }

        /* renamed from: OooO00o */
        public void onReceiveValue(String str) {
        }
    }

    public JHWebView(Context context) {
        super(context);
        OooO0O0();
    }

    public abstract void OooO00o();

    public abstract void OooO00o(WebView webView, int i, String str, String str2);

    public abstract void OooO00o(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    public abstract void OooO00o(WebView webView, String str);

    public abstract void OooO00o(WebView webView, String str, Bitmap bitmap);

    @SuppressLint({"JavascriptInterface"})
    public void OooO00o(JHJavaScriptInterface jHJavaScriptInterface) {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setUserAgentString(settings.getUserAgentString() + getUserAgentStr());
        setWebViewSetting(settings);
        addJavascriptInterface(jHJavaScriptInterface, getJavascriptInterfaceName());
        setWebViewClient(this.f15038OooO00o);
        setJhWebChromeClient(new JHWebChromeClient());
        setWebChromeClient(getJhWebChromeClient());
        setDownloadListener(this.f15037OooO00o);
    }

    public abstract void OooO00o(String str, String str2, String str3, String str4, long j);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m15126OooO00o(WebView webView, String str);

    public void OooO0O0() {
        OooO00o(new JHJavaScriptInterface(this.OooO00o));
    }

    public abstract boolean OooO0O0(WebView webView, String str);

    public abstract String getJavascriptInterfaceName();

    public JHWebChromeClient getJhWebChromeClient() {
        return this.f15039OooO00o;
    }

    public abstract String getUserAgentStr();

    public void setJhWebChromeClient(JHWebChromeClient jHWebChromeClient) {
        this.f15039OooO00o = jHWebChromeClient;
    }

    public abstract void setWebViewSetting(WebSettings webSettings);

    public JHWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO0O0();
    }

    public JHWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooO0O0();
    }

    private void OooO00o(String str) {
        String str2 = "typeof(jinhuiApp.sendWeb) != 'undefined' && jinhuiApp.sendWeb('" + str + "')";
        if (Build.VERSION.SDK_INT >= 19) {
            evaluateJavascript(str2, new C5124OooO0Oo());
            return;
        }
        loadUrl("javascript:" + str2);
    }

    public void OooO00o(int i, String str, Map<String, Object> map) {
        AppSendWebData appSendWebData = new AppSendWebData();
        appSendWebData.setId(this.f15040OooO00o.getIdStr());
        AppSendWebData.MessageBean messageBean = new AppSendWebData.MessageBean();
        messageBean.setCode(i);
        messageBean.setMessage(str);
        appSendWebData.setMessage(messageBean);
        appSendWebData.setData(map);
        OooO00o(appSendWebData.objectToJsonString());
    }
}
