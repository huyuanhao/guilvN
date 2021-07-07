package com.jinhui365.util.webview;

import android.os.Handler;
import android.os.Message;
import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;

@Keep
public class JHJavaScriptInterface {
    public static final String OooO00o = "JinhuiJSInterface";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f15036OooO00o;

    public JHJavaScriptInterface(Handler handler) {
        this.f15036OooO00o = handler;
    }

    @JavascriptInterface
    public void sendApp(String str) {
        Message message = new Message();
        message.obj = str;
        message.what = JHWebView.o00oO0O;
        this.f15036OooO00o.sendMessage(message);
    }
}
