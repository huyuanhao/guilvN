package com.umeng.socialize.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.umeng.socialize.bean.PlatformName;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.ResContainer;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import java.lang.reflect.Method;

public abstract class BaseDialog extends Dialog {

    /* renamed from: R */
    public final ResContainer f10871R;
    public Activity mActivity;
    public View mContent;
    public Context mContext;
    public int mFlag = 0;
    public Handler mHandler = new Handler() {
        /* class com.umeng.socialize.view.BaseDialog.HandlerC40091 */

        public void handleMessage(Message message) {
            View view;
            super.handleMessage(message);
            if (message.what == 1 && (view = BaseDialog.this.mProgressbar) != null) {
                view.setVisibility(8);
            }
            int i = message.what;
        }
    };
    public SHARE_MEDIA mPlatform;
    public View mProgressbar;
    public Bundle mValues;
    public String mWaitUrl = "error";
    public WebView mWebView;
    public TextView titleMidTv;

    public BaseDialog(Activity activity, SHARE_MEDIA share_media) {
        super(activity, ResContainer.get(activity).style("umeng_socialize_popup_dialog"));
        Context applicationContext = activity.getApplicationContext();
        this.mContext = applicationContext;
        this.f10871R = ResContainer.get(applicationContext);
        this.mActivity = activity;
        this.mPlatform = share_media;
    }

    public void initViews() {
        setOwnerActivity(this.mActivity);
        int layout = this.f10871R.layout("umeng_socialize_oauth_dialog");
        int id = this.f10871R.mo40288id("umeng_socialize_follow");
        String str = null;
        View inflate = ((LayoutInflater) this.mActivity.getSystemService("layout_inflater")).inflate(layout, (ViewGroup) null);
        this.mContent = inflate;
        final View findViewById = inflate.findViewById(id);
        findViewById.setVisibility(8);
        int id2 = this.f10871R.mo40288id("progress_bar_parent");
        int id3 = this.f10871R.mo40288id("umeng_back");
        int id4 = this.f10871R.mo40288id("umeng_share_btn");
        int id5 = this.f10871R.mo40288id("umeng_title");
        int id6 = this.f10871R.mo40288id("umeng_socialize_titlebar");
        View findViewById2 = this.mContent.findViewById(id2);
        this.mProgressbar = findViewById2;
        findViewById2.setVisibility(0);
        ((RelativeLayout) this.mContent.findViewById(id3)).setOnClickListener(new View.OnClickListener() {
            /* class com.umeng.socialize.view.BaseDialog.View$OnClickListenerC40102 */

            public void onClick(View view) {
                BaseDialog.this.dismiss();
            }
        });
        this.mContent.findViewById(id4).setVisibility(8);
        this.titleMidTv = (TextView) this.mContent.findViewById(id5);
        if (this.mPlatform.toString().equals("SINA")) {
            str = PlatformName.SINA;
        } else if (this.mPlatform.toString().equals("RENREN")) {
            str = PlatformName.RENREN;
        } else if (this.mPlatform.toString().equals("DOUBAN")) {
            str = PlatformName.DOUBAN;
        } else if (this.mPlatform.toString().equals("TENCENT")) {
            str = PlatformName.TENCENT;
        }
        TextView textView = this.titleMidTv;
        textView.setText("授权" + str);
        setUpWebView();
        final View findViewById3 = this.mContent.findViewById(id6);
        final int dip2Px = SocializeUtils.dip2Px(this.mContext, 200.0f);
        C40113 r0 = new FrameLayout(this.mContext) {
            /* class com.umeng.socialize.view.BaseDialog.C40113 */

            /* renamed from: a */
            private void m10861a(final View view, final View view2, int i, int i2) {
                if (view2.getVisibility() == 0 && i2 < i) {
                    BaseDialog.this.mHandler.post(new Runnable() {
                        /* class com.umeng.socialize.view.BaseDialog.C40113.RunnableC40121 */

                        public void run() {
                            view2.setVisibility(8);
                            if (view.getVisibility() == 0) {
                                view.setVisibility(8);
                            }
                            C40113.this.requestLayout();
                        }
                    });
                } else if (view2.getVisibility() != 0 && i2 >= i) {
                    BaseDialog.this.mHandler.post(new Runnable() {
                        /* class com.umeng.socialize.view.BaseDialog.C40113.RunnableC40132 */

                        public void run() {
                            view2.setVisibility(0);
                            C40113.this.requestLayout();
                        }
                    });
                }
            }

            public void onSizeChanged(int i, int i2, int i3, int i4) {
                super.onSizeChanged(i, i2, i3, i4);
                if (!SocializeUtils.isFloatWindowStyle(BaseDialog.this.mContext)) {
                    m10861a(findViewById, findViewById3, dip2Px, i2);
                }
            }
        };
        r0.addView(this.mContent, -1, -1);
        setContentView(r0);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (SocializeUtils.isFloatWindowStyle(this.mContext)) {
            int[] floatWindowSize = SocializeUtils.getFloatWindowSize(this.mContext);
            attributes.width = floatWindowSize[0];
            attributes.height = floatWindowSize[1];
        } else {
            attributes.height = -1;
            attributes.width = -1;
        }
        attributes.gravity = 17;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void releaseWebView() {
        /*
            r2 = this;
            android.webkit.WebView r0 = r2.mWebView     // Catch:{ Exception -> 0x000d }
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ Exception -> 0x000d }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x000d }
            android.webkit.WebView r1 = r2.mWebView     // Catch:{ Exception -> 0x000d }
            r0.removeView(r1)     // Catch:{ Exception -> 0x000d }
        L_0x000d:
            android.webkit.WebView r0 = r2.mWebView     // Catch:{ Exception -> 0x0012 }
            r0.removeAllViews()     // Catch:{ Exception -> 0x0012 }
        L_0x0012:
            r0 = 0
            r2.mWebView = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.view.BaseDialog.releaseWebView():void");
    }

    public void removeJavascriptInterface(WebView webView) {
        if (Build.VERSION.SDK_INT < 11) {
            try {
                Method declaredMethod = webView.getClass().getDeclaredMethod("removeJavascriptInterface", new Class[0]);
                declaredMethod.invoke("searchBoxJavaBridge_", new Object[0]);
                declaredMethod.invoke("accessibility", new Object[0]);
                declaredMethod.invoke("accessibilityTraversal", new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public abstract void setClient(WebView webView);

    public boolean setUpWebView() {
        WebView webView = (WebView) this.mContent.findViewById(this.f10871R.mo40288id("webView"));
        this.mWebView = webView;
        setClient(webView);
        this.mWebView.requestFocusFromTouch();
        this.mWebView.setVerticalScrollBarEnabled(false);
        this.mWebView.setHorizontalScrollBarEnabled(false);
        this.mWebView.setScrollBarStyle(0);
        this.mWebView.getSettings().setCacheMode(2);
        this.mWebView.setBackgroundColor(-1);
        WebSettings settings = this.mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= 8) {
            settings.setPluginState(WebSettings.PluginState.ON);
        }
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setAllowFileAccess(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        settings.setUseWideViewPort(true);
        if (Build.VERSION.SDK_INT >= 8) {
            settings.setLoadWithOverviewMode(true);
            settings.setDatabaseEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setGeolocationEnabled(true);
            settings.setAppCacheEnabled(true);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            try {
                Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(settings, false);
            } catch (Exception e) {
                SLog.error(e);
            }
        }
        try {
            if (this.mPlatform == SHARE_MEDIA.RENREN) {
                CookieSyncManager.createInstance(this.mContext);
                CookieManager.getInstance().removeAllCookie();
            }
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 11) {
            try {
                this.mWebView.removeJavascriptInterface("searchBoxJavaBridge_");
                this.mWebView.removeJavascriptInterface("accessibility");
                this.mWebView.removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable unused2) {
            }
        } else {
            removeJavascriptInterface(this.mWebView);
        }
        return true;
    }

    public void setWaitUrl(String str) {
        this.mWaitUrl = str;
    }
}
