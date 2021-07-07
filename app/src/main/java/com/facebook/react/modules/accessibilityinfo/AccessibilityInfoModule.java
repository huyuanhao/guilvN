package com.facebook.react.modules.accessibilityinfo;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import javax.annotation.Nullable;

@ReactModule(name = AccessibilityInfoModule.NAME)
public class AccessibilityInfoModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String EVENT_NAME = "touchExplorationDidChange";
    public static final String NAME = "AccessibilityInfo";
    @Nullable
    public AccessibilityManager mAccessibilityManager;
    public boolean mEnabled = false;
    @Nullable
    public ReactTouchExplorationStateChangeListener mTouchExplorationStateChangeListener;

    @TargetApi(19)
    public class ReactTouchExplorationStateChangeListener implements AccessibilityManager.TouchExplorationStateChangeListener {
        public ReactTouchExplorationStateChangeListener() {
        }

        public void onTouchExplorationStateChanged(boolean z) {
            AccessibilityInfoModule.this.updateAndSendChangeEvent(z);
        }
    }

    public AccessibilityInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        AccessibilityManager accessibilityManager = (AccessibilityManager) reactApplicationContext.getApplicationContext().getSystemService("accessibility");
        this.mAccessibilityManager = accessibilityManager;
        this.mEnabled = accessibilityManager.isTouchExplorationEnabled();
        if (Build.VERSION.SDK_INT >= 19) {
            this.mTouchExplorationStateChangeListener = new ReactTouchExplorationStateChangeListener();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void updateAndSendChangeEvent(boolean z) {
        if (this.mEnabled != z) {
            this.mEnabled = z;
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(EVENT_NAME, Boolean.valueOf(this.mEnabled));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        updateAndSendChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
    }

    @ReactMethod
    public void isTouchExplorationEnabled(Callback callback) {
        callback.invoke(Boolean.valueOf(this.mEnabled));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.mAccessibilityManager.removeTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.mAccessibilityManager.addTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener);
        }
        updateAndSendChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
    }
}
