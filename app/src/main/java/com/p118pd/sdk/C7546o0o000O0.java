package com.p118pd.sdk;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.ImageView;
import com.p118pd.sdk.C7532o0OoooO;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.o0o000O0  reason: case insensitive filesystem */
public class C7546o0o000O0 extends AbstractC7611o0o0o00O implements C7532o0OoooO.OooO00o, C7532o0OoooO.OooO0O0, C7532o0OoooO.OooO0OO {
    public static final String o00000 = "title";
    public static final String o000000 = "onLoadJs";
    public static final String o000000O = "callNativeFunc";
    public static final String o000000o = "back";
    public static final String o00000O = "backButton";
    public static final String o00000O0 = "refresh";
    public static final String o00000OO = "refreshButton";
    public static final String o00000Oo = "exit";
    public static final String o00000o0 = "action";
    public static final String o00000oO = "h5JsFuncCallback";
    public static final String o0000Ooo = "pushWindow";
    public static final String o000OOo = "onExit";
    public static final String o0O0O00 = "showBackButton";
    public static final String o0OO00O = "setTitle";
    public static final String o0OOO0o = "alipayjsbridge://";
    public static final String o0Oo0oo = "onBack";
    public static final String o0ooOoO = "sdk_result_code:";
    public static final String oo0o0Oo = "onRefresh";
    public C7532o0OoooO OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7556o0o00O0o f20408OooO00o = new C7556o0o00O0o();
    public boolean OooO0O0 = true;
    public boolean OooO0OO = false;
    public boolean OooO0Oo;
    public String o0ooOOo = "GET";

    /* renamed from: com.pd.sdk.o0o000O0$OooO00o */
    public abstract class OooO00o implements Animation.AnimationListener {
        public OooO00o() {
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        public /* synthetic */ OooO00o(C7546o0o000O0 o0o000o0, RunnableC7545o0o000O o0o000o) {
            this();
        }
    }

    public C7546o0o000O0(Activity activity) {
        super(activity);
        m19203OooO0O0();
    }

    private void OooO0OO() {
        WebView webView = this.OooO00o.getWebView();
        if (webView.canGoBack()) {
            webView.goBack();
            return;
        }
        C7556o0o00O0o o0o00o0o = this.f20408OooO00o;
        if (o0o00o0o == null || o0o00o0o.m19208OooO00o()) {
            OooO00o(false);
        } else {
            m19204OooO0OO();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.OooO0OO) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private boolean m19203OooO0O0() {
        try {
            C7532o0OoooO o0ooooo = new C7532o0OoooO(((AbstractC7611o0o0o00O) this).OooO00o);
            this.OooO00o = o0ooooo;
            o0ooooo.setChromeProxy(this);
            this.OooO00o.setWebClientProxy(this);
            this.OooO00o.setWebEventProxy(this);
            addView(this.OooO00o);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void OooO00o(String str, String str2, boolean z) {
        this.o0ooOOo = str2;
        this.OooO00o.getTitle().setText(str);
        this.OooO0O0 = z;
    }

    private void OooO00o(boolean z) {
        C7479o0OoO000.OooO00o(z);
        ((AbstractC7611o0o0o00O) this).OooO00o.finish();
    }

    private void OooO0O0() {
        if (this.OooO0O0) {
            ((AbstractC7611o0o0o00O) this).OooO00o.finish();
        } else {
            this.OooO00o.OooO00o("javascript:window.AlipayJSBridge.callListener('h5BackAction');");
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    private boolean m19204OooO0OO() {
        if (this.f20408OooO00o.m19208OooO00o()) {
            ((AbstractC7611o0o0o00O) this).OooO00o.finish();
        } else {
            this.OooO0OO = true;
            C7532o0OoooO o0ooooo = this.OooO00o;
            this.OooO00o = this.f20408OooO00o.OooO00o();
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new C7547o0o000OO(this, o0ooooo));
            o0ooooo.setAnimation(translateAnimation);
            removeView(o0ooooo);
            addView(this.OooO00o);
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7611o0o0o00O
    public void OooO00o(String str) {
        if ("POST".equals(this.o0ooOOo)) {
            this.OooO00o.OooO00o(str, (byte[]) null);
        } else {
            this.OooO00o.OooO00o(str);
        }
    }

    @Override // com.p118pd.sdk.C7532o0OoooO.OooO0O0
    public boolean OooO0O0(C7532o0OoooO o0ooooo, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith(o0OOO0o)) {
            OooO0O0(str.substring(17));
            return true;
        } else if (TextUtils.equals(str, C7722o0ooOOO0.OooOOO0)) {
            OooO00o(false);
            return true;
        } else if (str.startsWith("http://") || str.startsWith("https://")) {
            this.OooO00o.OooO00o(str);
            return true;
        } else {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                ((AbstractC7611o0o0o00O) this).OooO00o.startActivity(intent);
                return true;
            } catch (Throwable th) {
                C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, th);
                return true;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7611o0o0o00O, com.p118pd.sdk.AbstractC7611o0o0o00O
    public void OooO00o() {
        this.OooO00o.OooO00o();
        this.f20408OooO00o.m19207OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7611o0o0o00O, com.p118pd.sdk.AbstractC7611o0o0o00O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19205OooO00o() {
        if (this.OooO0OO) {
            return true;
        }
        OooO0O0();
        return true;
    }

    @Override // com.p118pd.sdk.C7532o0OoooO.OooO00o
    public boolean OooO00o(C7532o0OoooO o0ooooo, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (str2.startsWith("<head>") && str2.contains(o0ooOoO)) {
            ((AbstractC7611o0o0o00O) this).OooO00o.runOnUiThread(new RunnableC7545o0o000O(this));
        }
        jsPromptResult.cancel();
        return true;
    }

    @Override // com.p118pd.sdk.C7532o0OoooO.OooO00o, com.p118pd.sdk.C7532o0OoooO.OooO0O0
    public void OooO00o(C7532o0OoooO o0ooooo, String str) {
        if (!str.startsWith("http") && !o0ooooo.getUrl().endsWith(str)) {
            this.OooO00o.getTitle().setText(str);
        }
    }

    private void OooO0O0(String str) {
        Map<String, String> OooO0O02 = C7531o0Oooo0o.m19199OooO0O0(str);
        if (str.startsWith(o000000O)) {
            OooO00o(OooO0O02.get("func"), OooO0O02.get("cbId"), OooO0O02.get("data"));
        } else if (str.startsWith(o0Oo0oo)) {
            OooO0OO();
        } else if (str.startsWith(o0OO00O) && OooO0O02.containsKey("title")) {
            this.OooO00o.getTitle().setText(OooO0O02.get("title"));
        } else if (str.startsWith(oo0o0Oo)) {
            this.OooO00o.getWebView().reload();
        } else if (str.startsWith(o0O0O00) && OooO0O02.containsKey("bshow")) {
            this.OooO00o.getBackButton().setVisibility(TextUtils.equals("true", OooO0O02.get("bshow")) ? 0 : 4);
        } else if (str.startsWith(o000OOo)) {
            C7479o0OoO000.OooO00o(OooO0O02.get("result"));
            OooO00o(TextUtils.equals("true", OooO0O02.get("bsucc")));
        } else if (str.startsWith(o000000)) {
            this.OooO00o.OooO00o("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n");
        }
    }

    @Override // com.p118pd.sdk.AbstractC7611o0o0o00O
    private boolean OooO00o(String str, String str2) {
        C7532o0OoooO o0ooooo = this.OooO00o;
        try {
            C7532o0OoooO o0ooooo2 = new C7532o0OoooO(((AbstractC7611o0o0o00O) this).OooO00o);
            this.OooO00o = o0ooooo2;
            o0ooooo2.setChromeProxy(this);
            this.OooO00o.setWebClientProxy(this);
            this.OooO00o.setWebEventProxy(this);
            if (!TextUtils.isEmpty(str2)) {
                this.OooO00o.getTitle().setText(str2);
            }
            this.OooO0OO = true;
            this.f20408OooO00o.OooO00o(o0ooooo);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new C7548o0o000Oo(this, o0ooooo, str));
            this.OooO00o.setAnimation(translateAnimation);
            addView(this.OooO00o);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.p118pd.sdk.C7532o0OoooO.OooO00o, com.p118pd.sdk.C7532o0OoooO.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19206OooO00o(C7532o0OoooO o0ooooo, String str) {
        o0ooooo.OooO00o("javascript:window.prompt('<head>'+document.getElementsByTagName('html')[0].innerHTML+'</head>');(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
        o0ooooo.getRefreshButton().setVisibility(0);
        return true;
    }

    @Override // com.p118pd.sdk.C7532o0OoooO.OooO0O0
    public boolean OooO00o(C7532o0OoooO o0ooooo, int i, String str, String str2) {
        C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0O, C7482o0OoO0OO.OooOoo0, "onReceivedError:" + str2);
        o0ooooo.getRefreshButton().setVisibility(0);
        return false;
    }

    @Override // com.p118pd.sdk.C7532o0OoooO.OooO0OO
    public void OooO0O0(C7532o0OoooO o0ooooo) {
        o0ooooo.getWebView().reload();
        o0ooooo.getRefreshButton().setVisibility(4);
    }

    @Override // com.p118pd.sdk.C7532o0OoooO.OooO0O0
    public boolean OooO00o(C7532o0OoooO o0ooooo, SslErrorHandler sslErrorHandler, SslError sslError) {
        C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0O, C7482o0OoO0OO.OooOoo0, "2-" + sslError);
        if (this.OooO0Oo) {
            sslErrorHandler.proceed();
            this.OooO0Oo = false;
            return true;
        }
        ((AbstractC7611o0o0o00O) this).OooO00o.runOnUiThread(new RunnableC7549o0o000o0(this, sslErrorHandler));
        return true;
    }

    private void OooO00o(String str, String str2, String str3) {
        JSONObject OooO00o2 = C7531o0Oooo0o.m19195OooO00o(str3);
        if ("title".equals(str) && OooO00o2.has("title")) {
            this.OooO00o.getTitle().setText(OooO00o2.optString("title", ""));
        } else if (o00000O0.equals(str)) {
            this.OooO00o.getWebView().reload();
        } else if (o000000o.equals(str)) {
            OooO0OO();
        } else {
            int i = 0;
            if (o00000Oo.equals(str)) {
                C7479o0OoO000.OooO00o(OooO00o2.optString("result", null));
                OooO00o(OooO00o2.optBoolean("success", false));
            } else if (o00000O.equals(str)) {
                boolean optBoolean = OooO00o2.optBoolean("show", true);
                ImageView backButton = this.OooO00o.getBackButton();
                if (!optBoolean) {
                    i = 4;
                }
                backButton.setVisibility(i);
            } else if (o00000OO.equals(str)) {
                boolean optBoolean2 = OooO00o2.optBoolean("show", true);
                ImageView refreshButton = this.OooO00o.getRefreshButton();
                if (!optBoolean2) {
                    i = 4;
                }
                refreshButton.setVisibility(i);
            } else if (o0000Ooo.equals(str) && OooO00o2.optString("url", null) != null) {
                OooO00o(OooO00o2.optString("url"), OooO00o2.optString("title", ""));
            }
        }
    }

    @Override // com.p118pd.sdk.C7532o0OoooO.OooO0OO
    public void OooO00o(C7532o0OoooO o0ooooo) {
        OooO0O0();
    }
}
