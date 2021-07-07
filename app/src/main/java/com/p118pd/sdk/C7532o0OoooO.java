package com.p118pd.sdk;

import android.content.Context;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.o0OoooO  reason: case insensitive filesystem */
public class C7532o0OoooO extends LinearLayout {
    public static Handler OooO00o = new Handler(Looper.getMainLooper());

    /* renamed from: OooO00o  reason: collision with other field name */
    public View.OnClickListener f20385OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public WebView f20386OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ImageView f20387OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ProgressBar f20388OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f20389OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f20390OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f20391OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0OO f20392OooO00o;
    public ImageView OooO0O0;
    public final float OooO0Oo;

    /* renamed from: com.pd.sdk.o0OoooO$OooO00o */
    public interface OooO00o {
        void OooO00o(C7532o0OoooO o0ooooo, String str);

        boolean OooO00o(C7532o0OoooO o0ooooo, String str, String str2, String str3, JsPromptResult jsPromptResult);
    }

    /* renamed from: com.pd.sdk.o0OoooO$OooO0O0 */
    public interface OooO0O0 {
        boolean OooO00o(C7532o0OoooO o0ooooo, int i, String str, String str2);

        boolean OooO00o(C7532o0OoooO o0ooooo, SslErrorHandler sslErrorHandler, SslError sslError);

        boolean OooO00o(C7532o0OoooO o0ooooo, String str);

        boolean OooO0O0(C7532o0OoooO o0ooooo, String str);
    }

    /* renamed from: com.pd.sdk.o0OoooO$OooO0OO */
    public interface OooO0OO {
        void OooO00o(C7532o0OoooO o0ooooo);

        void OooO0O0(C7532o0OoooO o0ooooo);
    }

    public C7532o0OoooO(Context context) {
        this(context, null);
    }

    private void OooO0OO(Context context) {
        WebView webView = new WebView(context);
        this.f20386OooO00o = webView;
        webView.setVerticalScrollbarOverlay(true);
        OooO00o(this.f20386OooO00o, context);
        WebSettings settings = this.f20386OooO00o.getSettings();
        settings.setUseWideViewPort(true);
        settings.setAppCacheMaxSize(5242880);
        settings.setAppCachePath(context.getCacheDir().getAbsolutePath());
        settings.setAllowFileAccess(true);
        settings.setAppCacheEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        try {
            this.f20386OooO00o.removeJavascriptInterface("searchBoxJavaBridge_");
            this.f20386OooO00o.removeJavascriptInterface("accessibility");
            this.f20386OooO00o.removeJavascriptInterface("accessibilityTraversal");
        } catch (Exception unused) {
        }
        addView(this.f20386OooO00o, new LinearLayout.LayoutParams(-1, -1));
    }

    public ImageView getBackButton() {
        return this.f20387OooO00o;
    }

    public ProgressBar getProgressbar() {
        return this.f20388OooO00o;
    }

    public ImageView getRefreshButton() {
        return this.OooO0O0;
    }

    public TextView getTitle() {
        return this.f20389OooO00o;
    }

    public String getUrl() {
        return this.f20386OooO00o.getUrl();
    }

    public WebView getWebView() {
        return this.f20386OooO00o;
    }

    public void setChromeProxy(OooO00o oooO00o) {
        this.f20390OooO00o = oooO00o;
        if (oooO00o == null) {
            this.f20386OooO00o.setWebChromeClient(null);
        } else {
            this.f20386OooO00o.setWebChromeClient(new C7553o0o00O0(this));
        }
    }

    public void setWebClientProxy(OooO0O0 oooO0O0) {
        this.f20391OooO00o = oooO0O0;
        if (oooO0O0 == null) {
            this.f20386OooO00o.setWebViewClient(null);
        } else {
            this.f20386OooO00o.setWebViewClient(new C7555o0o00O0O(this));
        }
    }

    public void setWebEventProxy(OooO0OO oooO0OO) {
        this.f20392OooO00o = oooO0OO;
    }

    public C7532o0OoooO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20385OooO00o = new View$OnClickListenerC7539o0o00(this);
        this.OooO0Oo = context.getResources().getDisplayMetrics().density;
        setOrientation(1);
        OooO00o(context);
        OooO0O0(context);
        OooO0OO(context);
    }

    private void OooO0O0(Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, 16973855);
        this.f20388OooO00o = progressBar;
        progressBar.setProgressDrawable(context.getResources().getDrawable(17301612));
        this.f20388OooO00o.setMax(100);
        this.f20388OooO00o.setBackgroundColor(-218103809);
        addView(this.f20388OooO00o, new LinearLayout.LayoutParams(-1, OooO00o(2)));
    }

    private void OooO00o(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(-218103809);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        ImageView imageView = new ImageView(context);
        this.f20387OooO00o = imageView;
        imageView.setOnClickListener(this.f20385OooO00o);
        this.f20387OooO00o.setScaleType(ImageView.ScaleType.CENTER);
        this.f20387OooO00o.setImageDrawable(C7525o0Ooo0oo.OooO00o(C7525o0Ooo0oo.OooO00o, context));
        this.f20387OooO00o.setPadding(OooO00o(12), 0, OooO00o(12), 0);
        linearLayout.addView(this.f20387OooO00o, new LinearLayout.LayoutParams(-2, -2));
        View view = new View(context);
        view.setBackgroundColor(-2500135);
        linearLayout.addView(view, new LinearLayout.LayoutParams(OooO00o(1), OooO00o(25)));
        TextView textView = new TextView(context);
        this.f20389OooO00o = textView;
        textView.setTextColor(-15658735);
        this.f20389OooO00o.setTextSize(17.0f);
        this.f20389OooO00o.setMaxLines(1);
        this.f20389OooO00o.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(OooO00o(17), 0, 0, 0);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.f20389OooO00o, layoutParams);
        ImageView imageView2 = new ImageView(context);
        this.OooO0O0 = imageView2;
        imageView2.setOnClickListener(this.f20385OooO00o);
        this.OooO0O0.setScaleType(ImageView.ScaleType.CENTER);
        this.OooO0O0.setImageDrawable(C7525o0Ooo0oo.OooO00o(C7525o0Ooo0oo.OooO0O0, context));
        this.OooO0O0.setPadding(OooO00o(12), 0, OooO00o(12), 0);
        linearLayout.addView(this.OooO0O0, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(-1, OooO00o(48)));
    }

    public void OooO00o(WebView webView, Context context) {
        String userAgentString = webView.getSettings().getUserAgentString();
        String packageName = context.getPackageName();
        String OooO0o = C7531o0Oooo0o.OooO0o(context);
        webView.getSettings().setUserAgentString(userAgentString + " AlipaySDK(" + packageName + C8932ooOOO0o.OooO0OO + OooO0o + C8932ooOOO0o.OooO0OO + "15.6.8" + C3848l.f10402t);
    }

    public void OooO00o(String str) {
        this.f20386OooO00o.loadUrl(str);
    }

    public void OooO00o(String str, byte[] bArr) {
        this.f20386OooO00o.postUrl(str, bArr);
    }

    public void OooO00o() {
        removeAllViews();
        this.f20386OooO00o.removeAllViews();
        this.f20386OooO00o.setWebViewClient(null);
        this.f20386OooO00o.setWebChromeClient(null);
        this.f20386OooO00o.destroy();
    }

    private int OooO00o(int i) {
        return (int) (((float) i) * this.OooO0Oo);
    }
}
