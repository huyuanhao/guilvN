package com.github.yamill.orientation;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.netinfo.NetInfoModule;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class OrientationModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public final BroadcastReceiver receiver;

    public class OooO00o extends BroadcastReceiver {
        public final /* synthetic */ ReactApplicationContext OooO00o;

        public OooO00o(ReactApplicationContext reactApplicationContext) {
            this.OooO00o = reactApplicationContext;
        }

        public void onReceive(Context context, Intent intent) {
            Configuration configuration = (Configuration) intent.getParcelableExtra("newConfig");
            String.valueOf(configuration.orientation);
            String str = configuration.orientation == 1 ? "PORTRAIT" : "LANDSCAPE";
            WritableMap createMap = Arguments.createMap();
            createMap.putString("orientation", str);
            if (this.OooO00o.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.OooO00o.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
            }
        }
    }

    public OrientationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.receiver = new OooO00o(reactApplicationContext);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private String getOrientationString(int i) {
        return i == 2 ? "LANDSCAPE" : i == 1 ? "PORTRAIT" : i == 0 ? NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED : "null";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        String orientationString = getOrientationString(getReactApplicationContext().getResources().getConfiguration().orientation);
        if (orientationString == "null") {
            hashMap.put("initialOrientation", null);
        } else {
            hashMap.put("initialOrientation", orientationString);
        }
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return ExifInterface.f14146OooO0oo;
    }

    @ReactMethod
    public void getOrientation(Callback callback) {
        int i = getReactApplicationContext().getResources().getConfiguration().orientation;
        String orientationString = getOrientationString(i);
        if (orientationString == "null") {
            callback.invoke(Integer.valueOf(i), null);
            return;
        }
        callback.invoke(null, orientationString);
    }

    @ReactMethod
    public void lockToLandscape() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.setRequestedOrientation(6);
        }
    }

    @ReactMethod
    public void lockToLandscapeLeft() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.setRequestedOrientation(0);
        }
    }

    @ReactMethod
    public void lockToLandscapeRight() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.setRequestedOrientation(8);
        }
    }

    @ReactMethod
    public void lockToPortrait() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.setRequestedOrientation(1);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            try {
                currentActivity.unregisterReceiver(this.receiver);
            } catch (IllegalArgumentException e) {
                FLog.m874e(ReactConstants.TAG, "receiver already unregistered", e);
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            FLog.m873e(ReactConstants.TAG, "no activity to register receiver");
        } else {
            currentActivity.registerReceiver(this.receiver, new IntentFilter("onConfigurationChanged"));
        }
    }

    @ReactMethod
    public void unlockAllOrientations() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.setRequestedOrientation(4);
        }
    }
}
