package com.facebook.react.modules.core;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@ReactModule(name = DeviceEventManagerModule.NAME)
public class DeviceEventManagerModule extends ReactContextBaseJavaModule {
    public static final String NAME = "DeviceEventManager";
    public final Runnable mInvokeDefaultBackPressRunnable;

    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(@Nonnull String str, @Nullable Object obj);
    }

    public DeviceEventManagerModule(ReactApplicationContext reactApplicationContext, final DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler) {
        super(reactApplicationContext);
        this.mInvokeDefaultBackPressRunnable = new Runnable() {
            /* class com.facebook.react.modules.core.DeviceEventManagerModule.RunnableC07531 */

            public void run() {
                UiThreadUtil.assertOnUiThread();
                defaultHardwareBackBtnHandler.invokeDefaultOnBackPressed();
            }
        };
    }

    public void emitHardwareBackPressed() {
        ((RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("hardwareBackPress", null);
    }

    public void emitNewIntentReceived(Uri uri) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("url", uri.toString());
        ((RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("url", createMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void invokeDefaultBackPressHandler() {
        getReactApplicationContext().runOnUiQueueThread(this.mInvokeDefaultBackPressRunnable);
    }
}
