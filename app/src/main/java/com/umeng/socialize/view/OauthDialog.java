package com.umeng.socialize.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.socialize.Config;
import com.umeng.socialize.SocializeException;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.UmengErrorCode;
import com.umeng.socialize.handler.UMSSOHandler;
import com.umeng.socialize.net.utils.SocializeNetUtils;
import com.umeng.socialize.utils.DeviceConfig;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.URLBuilder;
import com.umeng.socialize.utils.UmengText;
import java.lang.ref.WeakReference;
import org.android.agoo.common.AgooConstants;

public class OauthDialog extends BaseDialog {
    public static final String BASE_URL = "https://log.umsns.com/";
    public static final String TAG = "OauthDialog";
    public static String mRedirectUri = "error";
    public C4015a mListener;

    /* renamed from: com.umeng.socialize.view.OauthDialog$a */
    public static class C4015a {

        /* renamed from: a */
        public UMAuthListener f10883a = null;

        /* renamed from: b */
        public SHARE_MEDIA f10884b;

        /* renamed from: c */
        public int f10885c;

        public C4015a(UMAuthListener uMAuthListener, SHARE_MEDIA share_media) {
            this.f10883a = uMAuthListener;
            this.f10884b = share_media;
        }

        /* renamed from: a */
        public void mo40775a(Exception exc) {
            UMAuthListener uMAuthListener = this.f10883a;
            if (uMAuthListener != null) {
                uMAuthListener.onError(this.f10884b, this.f10885c, exc);
            }
        }

        public void onCancel() {
            UMAuthListener uMAuthListener = this.f10883a;
            if (uMAuthListener != null) {
                uMAuthListener.onCancel(this.f10884b, this.f10885c);
            }
        }

        /* renamed from: a */
        public void mo40774a(Bundle bundle) {
            UMAuthListener uMAuthListener = this.f10883a;
            if (uMAuthListener != null) {
                uMAuthListener.onComplete(this.f10884b, this.f10885c, SocializeUtils.bundleTomap(bundle));
            }
        }
    }

    /* renamed from: com.umeng.socialize.view.OauthDialog$b */
    public static class C4016b extends WebChromeClient {

        /* renamed from: a */
        public WeakReference<OauthDialog> f10886a;

        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            WeakReference<OauthDialog> weakReference = this.f10886a;
            OauthDialog oauthDialog = weakReference == null ? null : weakReference.get();
            if (oauthDialog == null) {
                return;
            }
            if (i < 90) {
                oauthDialog.mProgressbar.setVisibility(0);
            } else {
                oauthDialog.mHandler.sendEmptyMessage(1);
            }
        }

        public C4016b(OauthDialog oauthDialog) {
            this.f10886a = new WeakReference<>(oauthDialog);
        }
    }

    /* renamed from: com.umeng.socialize.view.OauthDialog$c */
    public static class C4017c extends WebViewClient {

        /* renamed from: a */
        public WeakReference<OauthDialog> f10887a;

        /* renamed from: a */
        private void m10864a(String str) {
            WeakReference<OauthDialog> weakReference = this.f10887a;
            OauthDialog oauthDialog = weakReference == null ? null : weakReference.get();
            if (oauthDialog != null) {
                oauthDialog.mFlag = 1;
                oauthDialog.mValues = SocializeUtils.parseUrl(str);
                if (oauthDialog.isShowing()) {
                    SocializeUtils.safeCloseDialog(oauthDialog);
                }
            }
        }

        /* renamed from: b */
        private void m10865b(String str) {
            WeakReference<OauthDialog> weakReference = this.f10887a;
            OauthDialog oauthDialog = weakReference == null ? null : weakReference.get();
            if (oauthDialog != null) {
                oauthDialog.mFlag = 1;
                oauthDialog.mValues = SocializeNetUtils.parseUrl(str);
                if (oauthDialog.isShowing()) {
                    SocializeUtils.safeCloseDialog(oauthDialog);
                }
            }
        }

        public void onPageFinished(WebView webView, String str) {
            WeakReference<OauthDialog> weakReference = this.f10887a;
            OauthDialog oauthDialog = weakReference == null ? null : weakReference.get();
            if (oauthDialog != null) {
                oauthDialog.mHandler.sendEmptyMessage(1);
                super.onPageFinished(webView, str);
                if (oauthDialog.mFlag == 0 && str.contains(oauthDialog.mWaitUrl)) {
                    m10864a(str);
                }
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WeakReference<OauthDialog> weakReference = this.f10887a;
            OauthDialog oauthDialog = weakReference == null ? null : weakReference.get();
            if (oauthDialog != null) {
                String decrypt = str.contains("?ud_get=") ? oauthDialog.decrypt(str) : "";
                if (!decrypt.contains("access_key") || !decrypt.contains(UMSSOHandler.ACCESS_SECRET)) {
                    if (str.startsWith(OauthDialog.mRedirectUri)) {
                        m10865b(str);
                    }
                } else if (str.contains(oauthDialog.mWaitUrl)) {
                    m10864a(str);
                    return;
                } else {
                    return;
                }
            }
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            WeakReference<OauthDialog> weakReference = this.f10887a;
            OauthDialog oauthDialog = weakReference == null ? null : weakReference.get();
            if (oauthDialog != null) {
                View view = oauthDialog.mProgressbar;
                if (view.getVisibility() == 0) {
                    view.setVisibility(8);
                }
            }
            super.onReceivedError(webView, i, str, str2);
            if (oauthDialog != null) {
                SocializeUtils.safeCloseDialog(oauthDialog);
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WeakReference<OauthDialog> weakReference = this.f10887a;
            OauthDialog oauthDialog = weakReference == null ? null : weakReference.get();
            if (oauthDialog != null) {
                Context applicationContext = oauthDialog.mContext.getApplicationContext();
                if (!DeviceConfig.isNetworkAvailable(applicationContext)) {
                    Toast.makeText(applicationContext, UmengText.NET.NET_INAVALIBLE, 0).show();
                    return true;
                }
                if (str.contains("?ud_get=")) {
                    str = oauthDialog.decrypt(str);
                }
                if (str.contains(oauthDialog.mWaitUrl)) {
                    m10864a(str);
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        public C4017c(OauthDialog oauthDialog) {
            this.f10887a = new WeakReference<>(oauthDialog);
        }
    }

    public OauthDialog(Activity activity, SHARE_MEDIA share_media, UMAuthListener uMAuthListener) {
        super(activity, share_media);
        this.mListener = new C4015a(uMAuthListener, share_media);
        initViews();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String decrypt(String str) {
        try {
            String[] split = str.split("ud_get=");
            return split[0] + split[1];
        } catch (Exception e) {
            SLog.error(e);
            return str;
        }
    }

    private WebViewClient getAdapterWebViewClient() {
        return new C4017c();
    }

    private String getUrl(SHARE_MEDIA share_media) {
        URLBuilder uRLBuilder = new URLBuilder(this.mContext);
        uRLBuilder.setHost("https://log.umsns.com/").setPath("share/auth/").setAppkey(SocializeUtils.getAppkey(this.mContext)).setEntityKey(Config.EntityKey).withMedia(share_media).withOpId(AgooConstants.ACK_REMOVE_PACKAGE).withSessionId(Config.SessionId).withUID(UMUtils.getUMId(this.mContext));
        return uRLBuilder.toEncript();
    }

    public void dismiss() {
        Bundle bundle = this.mValues;
        if (bundle != null) {
            String string = bundle.getString("uid");
            String string2 = this.mValues.getString("error_code");
            String string3 = this.mValues.getString("error_description");
            if (this.mPlatform == SHARE_MEDIA.SINA && !TextUtils.isEmpty(string3)) {
                C4015a aVar = this.mListener;
                aVar.mo40775a(new SocializeException(UmengErrorCode.AuthorizeFailed.getMessage() + "errorcode:" + string2 + " message:" + string3));
            } else if (TextUtils.isEmpty(string)) {
                C4015a aVar2 = this.mListener;
                aVar2.mo40775a(new SocializeException(UmengErrorCode.AuthorizeFailed.getMessage() + "unfetch usid..."));
            } else {
                Bundle bundle2 = this.mValues;
                bundle2.putString(UMSSOHandler.ACCESSTOKEN, bundle2.getString("access_key"));
                Bundle bundle3 = this.mValues;
                bundle3.putString(UMSSOHandler.EXPIRATION, bundle3.getString("expires_in"));
                this.mListener.mo40774a(this.mValues);
            }
        } else {
            this.mListener.onCancel();
        }
        super.dismiss();
        releaseWebView();
    }

    @Override // com.umeng.socialize.view.BaseDialog
    public void setClient(WebView webView) {
        webView.setWebViewClient(getAdapterWebViewClient());
        this.mWebView.setWebChromeClient(new C4016b());
    }

    public void setmRedirectUri(String str) {
        mRedirectUri = str;
    }

    public void show() {
        super.show();
        this.mValues = null;
        SHARE_MEDIA share_media = this.mPlatform;
        if (share_media == SHARE_MEDIA.SINA) {
            this.mWebView.loadUrl(this.mWaitUrl);
            return;
        }
        this.mWebView.loadUrl(getUrl(share_media));
    }
}
