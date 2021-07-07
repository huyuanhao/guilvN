package com.facebook.react.views.webview;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
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
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.facebook.react.views.webview.events.TopLoadingErrorEvent;
import com.facebook.react.views.webview.events.TopLoadingFinishEvent;
import com.facebook.react.views.webview.events.TopLoadingStartEvent;
import com.facebook.react.views.webview.events.TopMessageEvent;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(name = ReactWebViewManager.REACT_CLASS)
public class ReactWebViewManager extends SimpleViewManager<WebView> {
    public static final String BLANK_URL = "about:blank";
    public static final String BRIDGE_NAME = "__REACT_WEB_VIEW_BRIDGE";
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    public static final String HTML_ENCODING = "UTF-8";
    public static final String HTML_MIME_TYPE = "text/html";
    public static final String HTTP_METHOD_POST = "POST";
    public static final String INTENT_URL_PREFIX = "intent://";
    public static final String REACT_CLASS = "RCTWebView";
    @Nullable
    public WebView.PictureListener mPictureListener;
    public WebViewConfig mWebViewConfig;

    public static class ReactWebView extends WebView implements LifecycleEventListener {
        @Nullable
        public String injectedJS;
        @Nullable
        public ReactWebViewClient mReactWebViewClient;
        public boolean messagingEnabled = false;

        public class ReactWebViewBridge {
            public ReactWebView mContext;

            public ReactWebViewBridge(ReactWebView reactWebView) {
                this.mContext = reactWebView;
            }

            @JavascriptInterface
            public void postMessage(String str) {
                this.mContext.onMessage(str);
            }
        }

        public ReactWebView(ThemedReactContext themedReactContext) {
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

        public ReactWebViewBridge createReactWebViewBridge(ReactWebView reactWebView) {
            return new ReactWebViewBridge(reactWebView);
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
        public ReactWebViewClient getReactWebViewClient() {
            return this.mReactWebViewClient;
        }

        public void linkBridge() {
            if (this.messagingEnabled) {
                evaluateJavascriptWithFallback("(window.originalPostMessage = window.postMessage,window.postMessage = function(data) {__REACT_WEB_VIEW_BRIDGE.postMessage(String(data));})");
            }
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

        public void onMessage(String str) {
            ReactWebViewManager.dispatchEvent(this, new TopMessageEvent(getId(), str));
        }

        public void setInjectedJavaScript(@Nullable String str) {
            this.injectedJS = str;
        }

        public void setMessagingEnabled(boolean z) {
            if (this.messagingEnabled != z) {
                this.messagingEnabled = z;
                if (z) {
                    addJavascriptInterface(createReactWebViewBridge(this), ReactWebViewManager.BRIDGE_NAME);
                    linkBridge();
                    return;
                }
                removeJavascriptInterface(ReactWebViewManager.BRIDGE_NAME);
            }
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.mReactWebViewClient = (ReactWebViewClient) webViewClient;
        }
    }

    public static class ReactWebViewClient extends WebViewClient {
        public boolean mLastLoadFailed = false;
        @Nullable
        public List<Pattern> mOriginWhitelist;
        @Nullable
        public ReadableArray mUrlPrefixesForDefaultIntent;

        /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void launchIntent(android.content.Context r7, java.lang.String r8) {
            /*
            // Method dump skipped, instructions count: 115
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.webview.ReactWebViewManager.ReactWebViewClient.launchIntent(android.content.Context, java.lang.String):void");
        }

        private boolean shouldHandleURL(List<Pattern> list, String str) {
            Uri parse = Uri.parse(str);
            String str2 = "";
            String scheme = parse.getScheme() != null ? parse.getScheme() : str2;
            if (parse.getAuthority() != null) {
                str2 = parse.getAuthority();
            }
            String str3 = scheme + HttpConstant.SCHEME_SPLIT + str2;
            for (Pattern pattern : list) {
                if (pattern.matcher(str3).matches()) {
                    return true;
                }
            }
            return false;
        }

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
            ReactWebViewManager.dispatchEvent(webView, new TopLoadingFinishEvent(webView.getId(), createWebViewEvent(webView, str)));
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.mLastLoadFailed) {
                ReactWebView reactWebView = (ReactWebView) webView;
                reactWebView.callInjectedJavaScript();
                reactWebView.linkBridge();
                emitFinishEvent(webView, str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.mLastLoadFailed = false;
            ReactWebViewManager.dispatchEvent(webView, new TopLoadingStartEvent(webView.getId(), createWebViewEvent(webView, str)));
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.mLastLoadFailed = true;
            emitFinishEvent(webView, str2);
            WritableMap createWebViewEvent = createWebViewEvent(webView, str2);
            createWebViewEvent.putDouble("code", (double) i);
            createWebViewEvent.putString("description", str);
            ReactWebViewManager.dispatchEvent(webView, new TopLoadingErrorEvent(webView.getId(), createWebViewEvent));
        }

        public void setOriginWhitelist(List<Pattern> list) {
            this.mOriginWhitelist = list;
        }

        public void setUrlPrefixesForDefaultIntent(ReadableArray readableArray) {
            this.mUrlPrefixesForDefaultIntent = readableArray;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.equals("about:blank")) {
                return false;
            }
            ReadableArray readableArray = this.mUrlPrefixesForDefaultIntent;
            if (readableArray != null && readableArray.size() > 0) {
                Iterator<Object> it = this.mUrlPrefixesForDefaultIntent.toArrayList().iterator();
                while (it.hasNext()) {
                    if (str.startsWith((String) it.next())) {
                        launchIntent(webView.getContext(), str);
                        return true;
                    }
                }
            }
            List<Pattern> list = this.mOriginWhitelist;
            if (list != null && shouldHandleURL(list, str)) {
                return false;
            }
            launchIntent(webView.getContext(), str);
            return true;
        }
    }

    public ReactWebViewManager() {
        this.mWebViewConfig = new WebViewConfig() {
            /* class com.facebook.react.views.webview.ReactWebViewManager.C08951 */

            @Override // com.facebook.react.views.webview.WebViewConfig
            public void configWebView(WebView webView) {
            }
        };
    }

    public static void dispatchEvent(WebView webView, Event event) {
        ((UIManagerModule) ((ReactContext) webView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(event);
    }

    public ReactWebView createReactWebViewInstance(ThemedReactContext themedReactContext) {
        return new ReactWebView(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.m951of("goBack", 1, "goForward", 2, "reload", 3, "stopLoading", 4, "postMessage", 5, "injectJavaScript", 6);
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return REACT_CLASS;
    }

    public WebView.PictureListener getPictureListener() {
        if (this.mPictureListener == null) {
            this.mPictureListener = new WebView.PictureListener() {
                /* class com.facebook.react.views.webview.ReactWebViewManager.C08973 */

                public void onNewPicture(WebView webView, Picture picture) {
                    ReactWebViewManager.dispatchEvent(webView, new ContentSizeChangeEvent(webView.getId(), webView.getWidth(), webView.getContentHeight()));
                }
            };
        }
        return this.mPictureListener;
    }

    @ReactProp(name = "allowFileAccess")
    public void setAllowFileAccess(WebView webView, @Nullable Boolean bool) {
        webView.getSettings().setAllowFileAccess(bool != null && bool.booleanValue());
    }

    @ReactProp(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @ReactProp(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z) {
        webView.getSettings().setDomStorageEnabled(z);
    }

    @ReactProp(name = "geolocationEnabled")
    public void setGeolocationEnabled(WebView webView, @Nullable Boolean bool) {
        webView.getSettings().setGeolocationEnabled(bool != null && bool.booleanValue());
    }

    @ReactProp(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, @Nullable String str) {
        ((ReactWebView) webView).setInjectedJavaScript(str);
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
        ((ReactWebView) webView).setMessagingEnabled(z);
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
        if (z) {
            webView.setPictureListener(getPictureListener());
        } else {
            webView.setPictureListener(null);
        }
    }

    @ReactProp(name = "originWhitelist")
    public void setOriginWhitelist(WebView webView, @Nullable ReadableArray readableArray) {
        ReactWebViewClient reactWebViewClient = ((ReactWebView) webView).getReactWebViewClient();
        if (!(reactWebViewClient == null || readableArray == null)) {
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < readableArray.size(); i++) {
                linkedList.add(Pattern.compile(readableArray.getString(i)));
            }
            reactWebViewClient.setOriginWhitelist(linkedList);
        }
    }

    @ReactProp(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z) {
        webView.getSettings().setSaveFormData(!z);
    }

    @ReactProp(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z) {
        webView.getSettings().setUseWideViewPort(!z);
    }

    @ReactProp(name = "source")
    public void setSource(WebView webView, @Nullable ReadableMap readableMap) {
        if (readableMap != null) {
            if (readableMap.hasKey("html")) {
                String string = readableMap.getString("html");
                if (readableMap.hasKey("baseUrl")) {
                    webView.loadDataWithBaseURL(readableMap.getString("baseUrl"), string, "text/html", "UTF-8", null);
                    return;
                } else {
                    webView.loadData(string, "text/html", "UTF-8");
                    return;
                }
            } else if (readableMap.hasKey("uri")) {
                String string2 = readableMap.getString("uri");
                String url = webView.getUrl();
                if (url != null && url.equals(string2)) {
                    return;
                }
                if (!readableMap.hasKey(AbstractC7726o0ooOOoo.OooOOo0) || !readableMap.getString(AbstractC7726o0ooOOoo.OooOOo0).equalsIgnoreCase("POST")) {
                    HashMap hashMap = new HashMap();
                    if (readableMap.hasKey("headers")) {
                        ReadableMap map = readableMap.getMap("headers");
                        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                        while (keySetIterator.hasNextKey()) {
                            String nextKey = keySetIterator.nextKey();
                            if (!"user-agent".equals(nextKey.toLowerCase(Locale.ENGLISH))) {
                                hashMap.put(nextKey, map.getString(nextKey));
                            } else if (webView.getSettings() != null) {
                                webView.getSettings().setUserAgentString(map.getString(nextKey));
                            }
                        }
                    }
                    webView.loadUrl(string2, hashMap);
                    return;
                }
                byte[] bArr = null;
                if (readableMap.hasKey(AgooConstants.MESSAGE_BODY)) {
                    String string3 = readableMap.getString(AgooConstants.MESSAGE_BODY);
                    try {
                        bArr = string3.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                        bArr = string3.getBytes();
                    }
                }
                if (bArr == null) {
                    bArr = new byte[0];
                }
                webView.postUrl(string2, bArr);
                return;
            }
        }
        webView.loadUrl("about:blank");
    }

    @ReactProp(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
        }
    }

    @ReactProp(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, @Nullable ReadableArray readableArray) {
        ReactWebViewClient reactWebViewClient = ((ReactWebView) webView).getReactWebViewClient();
        if (reactWebViewClient != null && readableArray != null) {
            reactWebViewClient.setUrlPrefixesForDefaultIntent(readableArray);
        }
    }

    @ReactProp(name = "userAgent")
    public void setUserAgent(WebView webView, @Nullable String str) {
        if (str != null) {
            webView.getSettings().setUserAgentString(str);
        }
    }

    @ReactProp(defaultBoolean = true, name = "hardwareAccelerationEnabledExperimental")
    public void sethardwareAccelerationEnabledExperimental(WebView webView, boolean z) {
        if (!z) {
            webView.setLayerType(1, null);
        }
    }

    public void addEventEmitters(ThemedReactContext themedReactContext, WebView webView) {
        webView.setWebViewClient(new ReactWebViewClient());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @TargetApi(21)
    public WebView createViewInstance(ThemedReactContext themedReactContext) {
        ReactWebView createReactWebViewInstance = createReactWebViewInstance(themedReactContext);
        createReactWebViewInstance.setWebChromeClient(new WebChromeClient() {
            /* class com.facebook.react.views.webview.ReactWebViewManager.C08962 */

            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return true;
            }

            public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                callback.invoke(str, true, false);
            }
        });
        themedReactContext.addLifecycleEventListener(createReactWebViewInstance);
        this.mWebViewConfig.configWebView(createReactWebViewInstance);
        WebSettings settings = createReactWebViewInstance.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        setAllowUniversalAccessFromFileURLs(createReactWebViewInstance, false);
        setMixedContentMode(createReactWebViewInstance, ReactScrollViewHelper.OVER_SCROLL_NEVER);
        createReactWebViewInstance.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setGeolocationEnabled(createReactWebViewInstance, false);
        return createReactWebViewInstance;
    }

    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance((View) webView);
        ReactWebView reactWebView = (ReactWebView) webView;
        ((ThemedReactContext) webView.getContext()).removeLifecycleEventListener(reactWebView);
        reactWebView.cleanupCallbacksAndDestroy();
    }

    public void receiveCommand(WebView webView, int i, @Nullable ReadableArray readableArray) {
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
                    ((ReactWebView) webView).evaluateJavascriptWithFallback("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                    return;
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            case 6:
                ((ReactWebView) webView).evaluateJavascriptWithFallback(readableArray.getString(0));
                return;
            default:
                return;
        }
    }

    public ReactWebViewManager(WebViewConfig webViewConfig) {
        this.mWebViewConfig = webViewConfig;
    }
}
