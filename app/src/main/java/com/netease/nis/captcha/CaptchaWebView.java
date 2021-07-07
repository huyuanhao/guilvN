package com.netease.nis.captcha;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.net.http.SslError;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.p118pd.sdk.C8932ooOOO0o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CaptchaWebView extends WebView {

    /* renamed from: a */
    public CaptchaListener f2993a;

    /* renamed from: b */
    public Context f2994b;

    /* renamed from: c */
    public String f2995c;

    /* renamed from: d */
    public HashMap<String, InputStream> f2996d = new HashMap<>();

    /* renamed from: e */
    public ExecutorService f2997e = Executors.newFixedThreadPool(5);

    /* renamed from: f */
    public String[] f2998f = {"http://acstatic-dun.126.net/tool.min.js", "http://cstaticdun.126.net/2.14.2/core.v2.14.2.min.js", "http://cstaticdun.126.net/2.14.2/light.v2.14.2.min.js", "http://cstaticdun.126.net//2.14.2/images/tipBg@2x.c7a9593.png", "http://cstaticdun.126.net//2.14.2/images/icon_light@2x.9386248.png"};

    public class OooO0O0 extends WebViewClient {
        public OooO0O0() {
        }

        private void OooO00o(String str) {
            String.format("WebViewClient's [%s] method has callback", str);
        }

        @TargetApi(23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            OooO00o("onReceivedError");
            C1664d.m2931a("error code is:%s error description is:%s", Integer.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription());
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (CaptchaWebView.this.f2993a != null) {
                CaptchaListener captchaListener = CaptchaWebView.this.f2993a;
                int errorCode = webResourceError.getErrorCode();
                captchaListener.onError(errorCode, "[onReceivedError]error code:" + webResourceError.getErrorCode() + "error desc:" + ((Object) webResourceError.getDescription()));
            }
        }

        @TargetApi(21)
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (webResourceRequest.isForMainFrame() && !webResourceRequest.getUrl().getPath().endsWith("/favicon.ico")) {
                OooO00o("onReceivedHttpError");
                C1664d.m2931a("[onReceivedHttpError] status code is:%s error reason is:%s", Integer.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getReasonPhrase());
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (CaptchaWebView.this.f2993a != null) {
                CaptchaListener captchaListener = CaptchaWebView.this.f2993a;
                int statusCode = webResourceResponse.getStatusCode();
                captchaListener.onError(statusCode, "[onReceivedHttpError]error code:" + webResourceResponse.getStatusCode() + "error desc:" + webResourceResponse.getReasonPhrase());
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            OooO00o("onReceivedSslError" + sslError.toString());
            if (C1664d.m2933a()) {
                sslErrorHandler.proceed();
            } else {
                sslErrorHandler.cancel();
            }
            if (CaptchaWebView.this.f2993a != null) {
                CaptchaWebView.this.f2993a.onError(sslError.getPrimaryError(), "[onReceivedSslError]");
            }
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        @RequiresApi(api = 21)
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            String path = webResourceRequest.getUrl().getPath();
            InputStream inputStream = (InputStream) CaptchaWebView.this.f2996d.get(path.substring(path.lastIndexOf(C8932ooOOO0o.OooO0OO) + 1));
            return inputStream != null ? new WebResourceResponse("*", "UTF-8", inputStream) : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public class OooO0OO implements Runnable {
        public String o0ooOOo;
        public String o0ooOoO;

        public OooO0OO(String str, String str2) {
            this.o0ooOOo = str;
            this.o0ooOoO = str2;
        }

        public void run() {
            C1665e.m2939a(this.o0ooOOo, CaptchaWebView.this.f2995c);
            try {
                CaptchaWebView.this.f2996d.put(this.o0ooOoO, new FileInputStream(new File(CaptchaWebView.this.f2995c, this.o0ooOoO)));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public CaptchaWebView(Context context) {
        super(m2894a(context));
        this.f2994b = context.getApplicationContext();
        m2896a();
    }

    public CaptchaWebView(Context context, AttributeSet attributeSet) {
        super(m2894a(context), attributeSet);
        this.f2994b = context.getApplicationContext();
        m2896a();
    }

    public CaptchaWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2994b = context.getApplicationContext();
        m2896a();
    }

    /* renamed from: a */
    public static Context m2894a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return (i < 21 || i >= 23) ? context : context.createConfigurationContext(new Configuration());
    }

    /* renamed from: a */
    private void m2896a() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setWebChromeClient(new WebChromeClient());
        setWebViewClient(new OooO0O0());
        resumeTimers();
        this.f2995c = this.f2994b.getCacheDir().getAbsolutePath();
        String[] strArr = this.f2998f;
        for (String str : strArr) {
            String substring = str.substring(str.lastIndexOf(C8932ooOOO0o.OooO0OO) + 1);
            File file = new File(this.f2995c, substring);
            if (!file.exists() || file.lastModified() - System.currentTimeMillis() >= 86400000) {
                this.f2997e.execute(new OooO0OO(str, substring));
            } else {
                C1664d.m2931a("文件上次修改时间戳为:%s  当前时间戳为:%s", Long.valueOf(file.lastModified()), Long.valueOf(System.currentTimeMillis()));
                try {
                    this.f2996d.put(substring, new FileInputStream(new File(this.f2995c, substring)));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        scrollTo(0, 0);
    }

    public void setCaptchaListener(CaptchaListener captchaListener) {
        this.f2993a = captchaListener;
    }
}
