package com.facebook.react.modules.deviceinfo;

import android.content.Context;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = "DeviceInfo")
public class DeviceInfoModule extends BaseJavaModule implements LifecycleEventListener {
    public static final String NAME = "DeviceInfo";
    public float mFontScale;
    @Nullable
    public ReactApplicationContext mReactApplicationContext;

    public DeviceInfoModule(ReactApplicationContext reactApplicationContext) {
        this((Context) reactApplicationContext);
        this.mReactApplicationContext = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public void emitUpdateDimensionsEvent() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("didUpdateDimensions", DisplayMetricsHolder.getDisplayMetricsNativeMap((double) this.mFontScale));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("Dimensions", DisplayMetricsHolder.getDisplayMetricsMap((double) this.mFontScale));
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DeviceInfo";
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext != null) {
            float f = reactApplicationContext.getResources().getConfiguration().fontScale;
            if (this.mFontScale != f) {
                this.mFontScale = f;
                emitUpdateDimensionsEvent();
            }
        }
    }

    public DeviceInfoModule(Context context) {
        this.mReactApplicationContext = null;
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(context);
        this.mFontScale = context.getResources().getConfiguration().fontScale;
    }
}
