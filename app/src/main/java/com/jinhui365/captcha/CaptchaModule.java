package com.jinhui365.captcha;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.p118pd.sdk.C9100ooo0OoO;

public class CaptchaModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public C9100ooo0OoO captchaHelper;

    public CaptchaModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.captchaHelper = null;
        this.captchaHelper = new C9100ooo0OoO();
        reactApplicationContext.addLifecycleEventListener(this);
    }

    @ReactMethod
    public void closeCaptcha(ReadableMap readableMap) {
        CaptchaActivity.OooO00o();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C9100ooo0OoO.OooO00o;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @ReactMethod
    public void showCaptcha(String str, ReadableMap readableMap, Promise promise) {
        CaptchaActivity.OooO00o(getCurrentActivity(), this.captchaHelper, str, promise);
    }
}
