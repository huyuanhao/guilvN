package com.reactnativecommunity.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import anet.channel.util.HttpConstant;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.ContentSizeChangeEvent;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.scroll.OnScrollDispatchHelper;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.facebook.react.views.scroll.ScrollEvent;
import com.facebook.react.views.scroll.ScrollEventType;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.p118pd.sdk.C7009o000OoOo;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.p118pd.sdk.C8932ooOOO0o;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.reactnativecommunity.webview.events.TopHttpErrorEvent;
import com.reactnativecommunity.webview.events.TopLoadingErrorEvent;
import com.reactnativecommunity.webview.events.TopLoadingFinishEvent;
import com.reactnativecommunity.webview.events.TopLoadingProgressEvent;
import com.reactnativecommunity.webview.events.TopLoadingStartEvent;
import com.reactnativecommunity.webview.events.TopMessageEvent;
import com.reactnativecommunity.webview.events.TopShouldStartLoadWithRequestEvent;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(name = "RNCWebView")
public class RNCWebViewManager extends SimpleViewManager<WebView> {
    public static final String BLANK_URL = "about:blank";
    public static final int COMMAND_CLEAR_CACHE = 1001;
    public static final int COMMAND_CLEAR_FORM_DATA = 1000;
    public static final int COMMAND_CLEAR_HISTORY = 1002;
    public static final int COMMAND_FOCUS = 8;
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_LOAD_URL = 7;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    public static final String HTML_ENCODING = "UTF-8";
    public static final String HTML_MIME_TYPE = "text/html";
    public static final String HTTP_METHOD_POST = "POST";
    public static final String JAVASCRIPT_INTERFACE = "ReactNativeWebView";
    public static final String REACT_CLASS = "RNCWebView";
    public static String activeUrl;
    public boolean mAllowsFullscreenVideo;
    @Nullable
    public String mUserAgent;
    @Nullable
    public String mUserAgentWithApplicationName;
    public RNCWebChromeClient mWebChromeClient;
    public WebViewConfig mWebViewConfig;

    public static class RNCWebChromeClient extends WebChromeClient implements LifecycleEventListener {
        public static final FrameLayout.LayoutParams FULLSCREEN_LAYOUT_PARAMS = new FrameLayout.LayoutParams(-1, -1, 17);
        @RequiresApi(api = 19)
        public static final int FULLSCREEN_SYSTEM_UI_VISIBILITY = 7942;
        public WebChromeClient.CustomViewCallback mCustomViewCallback;
        public ReactContext mReactContext;
        public View mVideoView;
        public View mWebView;

        public RNCWebChromeClient(ReactContext reactContext, WebView webView) {
            this.mReactContext = reactContext;
            this.mWebView = webView;
        }

        public ViewGroup getRootView() {
            return (ViewGroup) this.mReactContext.getCurrentActivity().findViewById(16908290);
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            callback.invoke(str, true, false);
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            View view;
            if (Build.VERSION.SDK_INT >= 19 && (view = this.mVideoView) != null && view.getSystemUiVisibility() != 7942) {
                this.mVideoView.setSystemUiVisibility(FULLSCREEN_SYSTEM_UI_VISIBILITY);
            }
        }

        @TargetApi(21)
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            String[] resources = permissionRequest.getResources();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < resources.length; i++) {
                if (resources[i].equals("android.webkit.resource.AUDIO_CAPTURE")) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                } else if (resources[i].equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    arrayList.add("android.permission.CAMERA");
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (C7009o000OoOo.OooO00o((Context) this.mReactContext, (String) arrayList.get(i2)) == 0) {
                    if (((String) arrayList.get(i2)).equals("android.permission.RECORD_AUDIO")) {
                        arrayList2.add("android.webkit.resource.AUDIO_CAPTURE");
                    } else if (((String) arrayList.get(i2)).equals("android.permission.CAMERA")) {
                        arrayList2.add("android.webkit.resource.VIDEO_CAPTURE");
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                permissionRequest.deny();
            } else {
                permissionRequest.grant((String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }

        public void onProgressChanged(WebView webView, int i) {
            String str;
            super.onProgressChanged(webView, i);
            String url = webView.getUrl();
            if (url == null || (str = RNCWebViewManager.activeUrl) == null || url.equals(str)) {
                WritableMap createMap = Arguments.createMap();
                createMap.putDouble("target", (double) webView.getId());
                createMap.putString("title", webView.getTitle());
                createMap.putString("url", url);
                createMap.putBoolean("canGoBack", webView.canGoBack());
                createMap.putBoolean("canGoForward", webView.canGoForward());
                createMap.putDouble("progress", (double) (((float) i) / 100.0f));
                RNCWebViewManager.dispatchEvent(webView, new TopLoadingProgressEvent(webView.getId(), createMap));
            }
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            boolean z = true;
            if (fileChooserParams.getMode() != 1) {
                z = false;
            }
            return RNCWebViewManager.getModule(this.mReactContext).startPhotoPickerIntent(valueCallback, fileChooserParams.createIntent(), acceptTypes, z);
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
            RNCWebViewManager.getModule(this.mReactContext).startPhotoPickerIntent(valueCallback, str);
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback) {
            RNCWebViewManager.getModule(this.mReactContext).startPhotoPickerIntent(valueCallback, "");
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            RNCWebViewManager.getModule(this.mReactContext).startPhotoPickerIntent(valueCallback, str);
        }
    }

    public static class RNCWebView extends WebView implements LifecycleEventListener {
        public boolean hasScrollEvent = false;
        @Nullable
        public String injectedJS;
        public OnScrollDispatchHelper mOnScrollDispatchHelper;
        @Nullable
        public RNCWebViewClient mRNCWebViewClient;
        public boolean messagingEnabled = false;
        public boolean sendContentSizeChangeEvents = false;

        public class RNCWebViewBridge {
            public RNCWebView mContext;

            public RNCWebViewBridge(RNCWebView rNCWebView) {
                this.mContext = rNCWebView;
            }

            @JavascriptInterface
            public void postMessage(String str) {
                this.mContext.onMessage(str);
            }
        }

        public RNCWebView(ThemedReactContext themedReactContext) {
            super(themedReactContext);
        }

        public void callInjectedJavaScript() {
            String str;
            if (getSettings().getJavaScriptEnabled() && (str = this.injectedJS) != null && !TextUtils.isEmpty(str)) {
                evaluateJavascriptWithFallback("(function() {\n" + this.injectedJS + ";\n})();");
            }
        }

        public void cleanupCallbacksAndDestroy() {
            setWebViewClient(null);
            destroy();
        }

        public RNCWebViewBridge createRNCWebViewBridge(RNCWebView rNCWebView) {
            return new RNCWebViewBridge(rNCWebView);
        }

        public void evaluateJavascriptWithFallback(String str) {
            if (Build.VERSION.SDK_INT >= 19) {
                evaluateJavascript(str, null);
                return;
            }
            try {
                loadUrl("javascript:" + URLEncoder.encode(str, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }

        @Nullable
        public RNCWebViewClient getRNCWebViewClient() {
            return this.mRNCWebViewClient;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            cleanupCallbacksAndDestroy();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
        }

        public void onMessage(final String str) {
            if (this.mRNCWebViewClient != null) {
                post(new Runnable() {
                    /* class com.reactnativecommunity.webview.RNCWebViewManager.RNCWebView.RunnableC30401 */

                    public void run() {
                        RNCWebViewClient rNCWebViewClient = RNCWebView.this.mRNCWebViewClient;
                        if (rNCWebViewClient != null) {
                            WebView webView = this;
                            WritableMap createWebViewEvent = rNCWebViewClient.createWebViewEvent(webView, webView.getUrl());
                            createWebViewEvent.putString("data", str);
                            RNCWebViewManager.dispatchEvent(this, new TopMessageEvent(this.getId(), createWebViewEvent));
                        }
                    }
                });
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString("data", str);
            RNCWebViewManager.dispatchEvent(this, new TopMessageEvent(getId(), createMap));
        }

        public void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            if (this.hasScrollEvent) {
                if (this.mOnScrollDispatchHelper == null) {
                    this.mOnScrollDispatchHelper = new OnScrollDispatchHelper();
                }
                if (this.mOnScrollDispatchHelper.onScrollChanged(i, i2)) {
                    RNCWebViewManager.dispatchEvent(this, ScrollEvent.obtain(getId(), ScrollEventType.SCROLL, i, i2, this.mOnScrollDispatchHelper.getXFlingVelocity(), this.mOnScrollDispatchHelper.getYFlingVelocity(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
                }
            }
        }

        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (this.sendContentSizeChangeEvents) {
                RNCWebViewManager.dispatchEvent(this, new ContentSizeChangeEvent(getId(), i, i2));
            }
        }

        public void setHasScrollEvent(boolean z) {
            this.hasScrollEvent = z;
        }

        public void setInjectedJavaScript(@Nullable String str) {
            this.injectedJS = str;
        }

        @SuppressLint({"AddJavascriptInterface"})
        public void setMessagingEnabled(boolean z) {
            if (this.messagingEnabled != z) {
                this.messagingEnabled = z;
                if (z) {
                    addJavascriptInterface(createRNCWebViewBridge(this), RNCWebViewManager.JAVASCRIPT_INTERFACE);
                } else {
                    removeJavascriptInterface(RNCWebViewManager.JAVASCRIPT_INTERFACE);
                }
            }
        }

        public void setSendContentSizeChangeEvents(boolean z) {
            this.sendContentSizeChangeEvents = z;
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            if (webViewClient instanceof RNCWebViewClient) {
                this.mRNCWebViewClient = (RNCWebViewClient) webViewClient;
            }
        }
    }

    public RNCWebViewManager() {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.mWebViewConfig = new WebViewConfig() {
            /* class com.reactnativecommunity.webview.RNCWebViewManager.C30361 */

            @Override // com.reactnativecommunity.webview.WebViewConfig
            public void configWebView(WebView webView) {
            }
        };
    }

    public static void dispatchEvent(WebView webView, Event event) {
        ((UIManagerModule) ((ReactContext) webView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(event);
    }

    public static String getCookieDomain(String str) {
        if (str == null || str.indexOf(C9058ooOoOoOO.OooOO0) <= 0) {
            return "";
        }
        String substring = str.substring(str.indexOf(C9058ooOoOoOO.OooOO0));
        if (substring.indexOf(C8932ooOOO0o.OooO0OO) > 0) {
            substring = substring.substring(0, substring.indexOf(C8932ooOOO0o.OooO0OO));
        }
        return substring.lastIndexOf(Constants.COLON_SEPARATOR) > 0 ? substring.substring(0, substring.lastIndexOf(Constants.COLON_SEPARATOR)) : substring;
    }

    public static RNCWebViewModule getModule(ReactContext reactContext) {
        return (RNCWebViewModule) reactContext.getNativeModule(RNCWebViewModule.class);
    }

    public static void syncCookie(String str, String str2, Context context) {
        String[] split;
        HashMap hashMap = new HashMap();
        hashMap.put("setCookie", str2);
        String cookieDomain = getCookieDomain(str);
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(cookieDomain);
        CookieSyncManager.createInstance(context);
        instance.setCookie(cookieDomain, cookie);
        for (String str3 : str2.split(C7522o0Ooo0o.OooO0O0)) {
            instance.setCookie(cookieDomain, str3.trim());
        }
        hashMap.put("newCookie", instance.getCookie(cookieDomain));
        hashMap.put("desc", "库WebView中Cookie");
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, "WebView", hashMap);
        CookieSyncManager.getInstance().sync();
    }

    public RNCWebView createRNCWebViewInstance(ThemedReactContext themedReactContext) {
        return new RNCWebView(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.builder().put("goBack", 1).put("goForward", 2).put("reload", 3).put("stopLoading", 4).put("postMessage", 5).put("injectJavaScript", 6).put("loadUrl", 7).put("requestFocus", 8).put("clearFormData", 1000).put("clearCache", 1001).put("clearHistory", 1002).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = MapBuilder.newHashMap();
        }
        exportedCustomDirectEventTypeConstants.put(TopLoadingProgressEvent.EVENT_NAME, MapBuilder.m946of("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put(TopShouldStartLoadWithRequestEvent.EVENT_NAME, MapBuilder.m946of("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), MapBuilder.m946of("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put(TopHttpErrorEvent.EVENT_NAME, MapBuilder.m946of("registrationName", "onHttpError"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return "RNCWebView";
    }

    @ReactProp(name = "allowFileAccess")
    public void setAllowFileAccess(WebView webView, @Nullable Boolean bool) {
        webView.getSettings().setAllowFileAccess(bool != null && bool.booleanValue());
    }

    @ReactProp(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowFileAccessFromFileURLs(z);
    }

    @ReactProp(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @ReactProp(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(WebView webView, @Nullable Boolean bool) {
        this.mAllowsFullscreenVideo = bool != null && bool.booleanValue();
        setupWebChromeClient((ReactContext) webView.getContext(), webView);
    }

    @ReactProp(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(WebView webView, @Nullable String str) {
        if (str == null) {
            this.mUserAgentWithApplicationName = null;
        } else if (Build.VERSION.SDK_INT >= 17) {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(webView.getContext());
            this.mUserAgentWithApplicationName = defaultUserAgent + " " + str;
        }
        setUserAgentString(webView);
    }

    @ReactProp(name = "cacheEnabled")
    public void setCacheEnabled(WebView webView, boolean z) {
        if (z) {
            Context context = webView.getContext();
            if (context != null) {
                webView.getSettings().setAppCachePath(context.getCacheDir().getAbsolutePath());
                webView.getSettings().setCacheMode(-1);
                webView.getSettings().setAppCacheEnabled(true);
                return;
            }
            return;
        }
        webView.getSettings().setCacheMode(2);
        webView.getSettings().setAppCacheEnabled(false);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @ReactProp(name = "cacheMode")
    public void setCacheMode(WebView webView, String str) {
        char c;
        Integer num;
        switch (str.hashCode()) {
            case -2059164003:
                if (str.equals("LOAD_NO_CACHE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1215135800:
                if (str.equals("LOAD_DEFAULT")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -873877826:
                if (str.equals("LOAD_CACHE_ELSE_NETWORK")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1548620642:
                if (str.equals("LOAD_CACHE_ONLY")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            num = 3;
        } else if (c == 1) {
            num = 1;
        } else if (c != 2) {
            num = -1;
        } else {
            num = 2;
        }
        webView.getSettings().setCacheMode(num.intValue());
    }

    @ReactProp(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z) {
        webView.getSettings().setDomStorageEnabled(z);
    }

    @ReactProp(name = "geolocationEnabled")
    public void setGeolocationEnabled(WebView webView, @Nullable Boolean bool) {
        webView.getSettings().setGeolocationEnabled(bool != null && bool.booleanValue());
    }

    @ReactProp(name = "androidHardwareAccelerationDisabled")
    public void setHardwareAccelerationDisabled(WebView webView, boolean z) {
        if (z) {
            webView.setLayerType(1, null);
        }
    }

    @ReactProp(name = "incognito")
    public void setIncognito(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(null);
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
        webView.getSettings().setCacheMode(2);
        webView.getSettings().setAppCacheEnabled(!z);
        webView.clearHistory();
        webView.clearCache(z);
        webView.clearFormData();
        webView.getSettings().setSavePassword(!z);
        webView.getSettings().setSaveFormData(!z);
    }

    @ReactProp(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, @Nullable String str) {
        ((RNCWebView) webView).setInjectedJavaScript(str);
    }

    @ReactProp(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptEnabled(z);
    }

    @ReactProp(name = "mediaPlaybackRequiresUserAction")
    @TargetApi(17)
    public void setMediaPlaybackRequiresUserAction(WebView webView, boolean z) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @ReactProp(name = "messagingEnabled")
    public void setMessagingEnabled(WebView webView, boolean z) {
        ((RNCWebView) webView).setMessagingEnabled(z);
    }

    @ReactProp(name = "mixedContentMode")
    public void setMixedContentMode(WebView webView, @Nullable String str) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (str == null || ReactScrollViewHelper.OVER_SCROLL_NEVER.equals(str)) {
            webView.getSettings().setMixedContentMode(1);
        } else if (ReactScrollViewHelper.OVER_SCROLL_ALWAYS.equals(str)) {
            webView.getSettings().setMixedContentMode(0);
        } else if ("compatibility".equals(str)) {
            webView.getSettings().setMixedContentMode(2);
        }
    }

    @ReactProp(name = "onContentSizeChange")
    public void setOnContentSizeChange(WebView webView, boolean z) {
        ((RNCWebView) webView).setSendContentSizeChangeEvents(z);
    }

    @ReactProp(name = "onScroll")
    public void setOnScroll(WebView webView, boolean z) {
        ((RNCWebView) webView).setHasScrollEvent(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "overScrollMode")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOverScrollMode(android.webkit.WebView r6, java.lang.String r7) {
        /*
            r5 = this;
            int r0 = r7.hashCode()
            r1 = -1414557169(0xffffffffabaf920f, float:-1.2475037E-12)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x002b
            r1 = 104712844(0x63dca8c, float:3.5695757E-35)
            if (r0 == r1) goto L_0x0021
            r1 = 951530617(0x38b73479, float:8.735894E-5)
            if (r0 == r1) goto L_0x0017
            goto L_0x0035
        L_0x0017:
            java.lang.String r0 = "content"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 1
            goto L_0x0036
        L_0x0021:
            java.lang.String r0 = "never"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 0
            goto L_0x0036
        L_0x002b:
            java.lang.String r0 = "always"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 2
            goto L_0x0036
        L_0x0035:
            r7 = -1
        L_0x0036:
            if (r7 == 0) goto L_0x0044
            if (r7 == r4) goto L_0x003f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            goto L_0x0048
        L_0x003f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            goto L_0x0048
        L_0x0044:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
        L_0x0048:
            int r7 = r7.intValue()
            r6.setOverScrollMode(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.webview.RNCWebViewManager.setOverScrollMode(android.webkit.WebView, java.lang.String):void");
    }

    @ReactProp(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z) {
        webView.getSettings().setSaveFormData(!z);
    }

    @ReactProp(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z) {
        webView.getSettings().setLoadWithOverviewMode(z);
        webView.getSettings().setUseWideViewPort(z);
    }

    @ReactProp(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(WebView webView, boolean z) {
        webView.setHorizontalScrollBarEnabled(z);
    }

    @ReactProp(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(WebView webView, boolean z) {
        webView.setVerticalScrollBarEnabled(z);
    }

    @ReactProp(name = "source")
    public void setSource(WebView webView, @Nullable ReadableMap readableMap) {
        if (readableMap != null) {
            if (readableMap.hasKey("html")) {
                webView.loadDataWithBaseURL(readableMap.hasKey("baseUrl") ? readableMap.getString("baseUrl") : "", readableMap.getString("html"), "text/html", "UTF-8", null);
                return;
            } else if (readableMap.hasKey("uri")) {
                String string = readableMap.getString("uri");
                if (readableMap.hasKey("headers")) {
                    ReadableMap map = readableMap.getMap("headers");
                    ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                    while (keySetIterator.hasNextKey()) {
                        String nextKey = keySetIterator.nextKey();
                        if ("cookie".equals(nextKey.toLowerCase(Locale.ENGLISH))) {
                            syncCookie(string, map.getString(nextKey), webView.getContext());
                        }
                    }
                }
                String url = webView.getUrl();
                if (url != null && url.equals(string)) {
                    return;
                }
                if (!readableMap.hasKey(AbstractC7726o0ooOOoo.OooOOo0) || !readableMap.getString(AbstractC7726o0ooOOoo.OooOOo0).equalsIgnoreCase("POST")) {
                    HashMap hashMap = new HashMap();
                    if (readableMap.hasKey("headers")) {
                        ReadableMap map2 = readableMap.getMap("headers");
                        ReadableMapKeySetIterator keySetIterator2 = map2.keySetIterator();
                        while (keySetIterator2.hasNextKey()) {
                            String nextKey2 = keySetIterator2.nextKey();
                            if (!"user-agent".equals(nextKey2.toLowerCase(Locale.ENGLISH))) {
                                hashMap.put(nextKey2, map2.getString(nextKey2));
                            } else if (webView.getSettings() != null) {
                                webView.getSettings().setUserAgentString(map2.getString(nextKey2));
                            }
                        }
                    }
                    webView.loadUrl(string, hashMap);
                    return;
                }
                byte[] bArr = null;
                if (readableMap.hasKey(AgooConstants.MESSAGE_BODY)) {
                    String string2 = readableMap.getString(AgooConstants.MESSAGE_BODY);
                    try {
                        bArr = string2.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                        bArr = string2.getBytes();
                    }
                }
                if (bArr == null) {
                    bArr = new byte[0];
                }
                webView.postUrl(string, bArr);
                return;
            }
        }
        webView.loadUrl("about:blank");
    }

    @ReactProp(name = "textZoom")
    public void setTextZoom(WebView webView, int i) {
        webView.getSettings().setTextZoom(i);
    }

    @ReactProp(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
        }
    }

    @ReactProp(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, @Nullable ReadableArray readableArray) {
        RNCWebViewClient rNCWebViewClient = ((RNCWebView) webView).getRNCWebViewClient();
        if (rNCWebViewClient != null && readableArray != null) {
            rNCWebViewClient.setUrlPrefixesForDefaultIntent(readableArray);
        }
    }

    @ReactProp(name = "userAgent")
    public void setUserAgent(WebView webView, @Nullable String str) {
        if (str != null) {
            this.mUserAgent = str;
        } else {
            this.mUserAgent = null;
        }
        setUserAgentString(webView);
    }

    public void setUserAgentString(WebView webView) {
        if (this.mUserAgent != null) {
            webView.getSettings().setUserAgentString(this.mUserAgent);
        } else if (this.mUserAgentWithApplicationName != null) {
            webView.getSettings().setUserAgentString(this.mUserAgentWithApplicationName);
        } else if (Build.VERSION.SDK_INT >= 17) {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    public void setupWebChromeClient(ReactContext reactContext, WebView webView) {
        if (this.mAllowsFullscreenVideo) {
            final int requestedOrientation = reactContext.getCurrentActivity().getRequestedOrientation();
            C30383 r1 = new RNCWebChromeClient(reactContext, webView) {
                /* class com.reactnativecommunity.webview.RNCWebViewManager.C30383 */

                public Bitmap getDefaultVideoPoster() {
                    return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                }

                public void onHideCustomView() {
                    View view = this.mVideoView;
                    if (view != null) {
                        view.setVisibility(8);
                        getRootView().removeView(this.mVideoView);
                        this.mCustomViewCallback.onCustomViewHidden();
                        this.mVideoView = null;
                        this.mCustomViewCallback = null;
                        this.mWebView.setVisibility(0);
                        if (Build.VERSION.SDK_INT >= 19) {
                            this.mReactContext.getCurrentActivity().getWindow().clearFlags(512);
                        }
                        this.mReactContext.getCurrentActivity().setRequestedOrientation(requestedOrientation);
                        this.mReactContext.removeLifecycleEventListener(this);
                    }
                }

                public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                    if (this.mVideoView != null) {
                        customViewCallback.onCustomViewHidden();
                        return;
                    }
                    this.mVideoView = view;
                    this.mCustomViewCallback = customViewCallback;
                    this.mReactContext.getCurrentActivity().setRequestedOrientation(-1);
                    if (Build.VERSION.SDK_INT >= 19) {
                        this.mVideoView.setSystemUiVisibility(RNCWebChromeClient.FULLSCREEN_SYSTEM_UI_VISIBILITY);
                        this.mReactContext.getCurrentActivity().getWindow().setFlags(512, 512);
                    }
                    this.mVideoView.setBackgroundColor(-16777216);
                    getRootView().addView(this.mVideoView, RNCWebChromeClient.FULLSCREEN_LAYOUT_PARAMS);
                    this.mWebView.setVisibility(8);
                    this.mReactContext.addLifecycleEventListener(this);
                }
            };
            this.mWebChromeClient = r1;
            webView.setWebChromeClient(r1);
            return;
        }
        RNCWebChromeClient rNCWebChromeClient = this.mWebChromeClient;
        if (rNCWebChromeClient != null) {
            rNCWebChromeClient.onHideCustomView();
        }
        C30394 r0 = new RNCWebChromeClient(reactContext, webView) {
            /* class com.reactnativecommunity.webview.RNCWebViewManager.C30394 */

            public Bitmap getDefaultVideoPoster() {
                return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            }
        };
        this.mWebChromeClient = r0;
        webView.setWebChromeClient(r0);
    }

    public void addEventEmitters(ThemedReactContext themedReactContext, WebView webView) {
        webView.setWebViewClient(new RNCWebViewClient());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @TargetApi(21)
    public WebView createViewInstance(final ThemedReactContext themedReactContext) {
        RNCWebView createRNCWebViewInstance = createRNCWebViewInstance(themedReactContext);
        setupWebChromeClient(themedReactContext, createRNCWebViewInstance);
        themedReactContext.addLifecycleEventListener(createRNCWebViewInstance);
        this.mWebViewConfig.configWebView(createRNCWebViewInstance);
        WebSettings settings = createRNCWebViewInstance.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            setAllowUniversalAccessFromFileURLs(createRNCWebViewInstance, false);
        }
        setMixedContentMode(createRNCWebViewInstance, ReactScrollViewHelper.OVER_SCROLL_NEVER);
        createRNCWebViewInstance.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        createRNCWebViewInstance.setDownloadListener(new DownloadListener() {
            /* class com.reactnativecommunity.webview.RNCWebViewManager.C30372 */

            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                RNCWebViewModule module = RNCWebViewManager.getModule(themedReactContext);
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                String guessFileName = URLUtil.guessFileName(str, str3, str4);
                String str5 = "Downloading " + guessFileName;
                try {
                    URL url = new URL(str);
                    request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + HttpConstant.SCHEME_SPLIT + url.getHost()));
                } catch (MalformedURLException e) {
                    System.out.println("Error getting cookie for DownloadManager: " + e.toString());
                    e.printStackTrace();
                }
                request.addRequestHeader("User-Agent", str2);
                request.setTitle(guessFileName);
                request.setDescription(str5);
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                module.setDownloadRequest(request);
                if (module.grantFileDownloaderPermissions()) {
                    module.downloadFile();
                }
            }
        });
        return createRNCWebViewInstance;
    }

    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance((View) webView);
        RNCWebView rNCWebView = (RNCWebView) webView;
        ((ThemedReactContext) webView.getContext()).removeLifecycleEventListener(rNCWebView);
        rNCWebView.cleanupCallbacksAndDestroy();
    }

    public void receiveCommand(WebView webView, int i, @Nullable ReadableArray readableArray) {
        boolean z = false;
        switch (i) {
            case 1:
                webView.goBack();
                return;
            case 2:
                webView.goForward();
                return;
            case 3:
                webView.reload();
                return;
            case 4:
                webView.stopLoading();
                return;
            case 5:
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", readableArray.getString(0));
                    ((RNCWebView) webView).evaluateJavascriptWithFallback("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                    return;
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            case 6:
                ((RNCWebView) webView).evaluateJavascriptWithFallback(readableArray.getString(0));
                return;
            case 7:
                if (readableArray != null) {
                    webView.loadUrl(readableArray.getString(0));
                    return;
                }
                throw new RuntimeException("Arguments for loading an url are null!");
            case 8:
                webView.requestFocus();
                return;
            default:
                switch (i) {
                    case 1000:
                        webView.clearFormData();
                        return;
                    case 1001:
                        if (readableArray != null && readableArray.getBoolean(0)) {
                            z = true;
                        }
                        webView.clearCache(z);
                        return;
                    case 1002:
                        webView.clearHistory();
                        return;
                    default:
                        return;
                }
        }
    }

    public static class RNCWebViewClient extends WebViewClient {
        public boolean mLastLoadFailed = false;
        @Nullable
        public ReadableArray mUrlPrefixesForDefaultIntent;

        public WritableMap createWebViewEvent(WebView webView, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("target", (double) webView.getId());
            createMap.putString("url", str);
            createMap.putBoolean("loading", !this.mLastLoadFailed && webView.getProgress() != 100);
            createMap.putString("title", webView.getTitle());
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            return createMap;
        }

        public void emitFinishEvent(WebView webView, String str) {
            RNCWebViewManager.dispatchEvent(webView, new TopLoadingFinishEvent(webView.getId(), createWebViewEvent(webView, str)));
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.mLastLoadFailed) {
                ((RNCWebView) webView).callInjectedJavaScript();
                emitFinishEvent(webView, str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.mLastLoadFailed = false;
            RNCWebViewManager.dispatchEvent(webView, new TopLoadingStartEvent(webView.getId(), createWebViewEvent(webView, str)));
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.mLastLoadFailed = true;
            emitFinishEvent(webView, str2);
            WritableMap createWebViewEvent = createWebViewEvent(webView, str2);
            createWebViewEvent.putDouble("code", (double) i);
            createWebViewEvent.putString("description", str);
            RNCWebViewManager.dispatchEvent(webView, new TopLoadingErrorEvent(webView.getId(), createWebViewEvent));
        }

        @RequiresApi(api = 23)
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest.isForMainFrame()) {
                WritableMap createWebViewEvent = createWebViewEvent(webView, webResourceRequest.getUrl().toString());
                createWebViewEvent.putInt("statusCode", webResourceResponse.getStatusCode());
                createWebViewEvent.putString("description", webResourceResponse.getReasonPhrase());
                RNCWebViewManager.dispatchEvent(webView, new TopHttpErrorEvent(webView.getId(), createWebViewEvent));
            }
        }

        public void setUrlPrefixesForDefaultIntent(ReadableArray readableArray) {
            this.mUrlPrefixesForDefaultIntent = readableArray;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            RNCWebViewManager.activeUrl = str;
            RNCWebViewManager.dispatchEvent(webView, new TopShouldStartLoadWithRequestEvent(webView.getId(), createWebViewEvent(webView, str)));
            return true;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
    }

    public RNCWebViewManager(WebViewConfig webViewConfig) {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.mWebViewConfig = webViewConfig;
    }
}
