package com.facebook.react.modules.netinfo;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.core.net.ConnectivityManagerCompat;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;

@ReactModule(name = NetInfoModule.NAME)
@SuppressLint({"MissingPermission"})
public class NetInfoModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String CONNECTION_TYPE_BLUETOOTH = "bluetooth";
    public static final String CONNECTION_TYPE_CELLULAR = "cellular";
    public static final String CONNECTION_TYPE_ETHERNET = "ethernet";
    public static final String CONNECTION_TYPE_NONE = "none";
    public static final String CONNECTION_TYPE_NONE_DEPRECATED = "NONE";
    public static final String CONNECTION_TYPE_UNKNOWN = "unknown";
    public static final String CONNECTION_TYPE_UNKNOWN_DEPRECATED = "UNKNOWN";
    public static final String CONNECTION_TYPE_WIFI = "wifi";
    public static final String CONNECTION_TYPE_WIMAX = "wimax";
    public static final String EFFECTIVE_CONNECTION_TYPE_2G = "2g";
    public static final String EFFECTIVE_CONNECTION_TYPE_3G = "3g";
    public static final String EFFECTIVE_CONNECTION_TYPE_4G = "4g";
    public static final String EFFECTIVE_CONNECTION_TYPE_UNKNOWN = "unknown";
    public static final String ERROR_MISSING_PERMISSION = "E_MISSING_PERMISSION";
    public static final String MISSING_PERMISSION_MESSAGE = "To use NetInfo on Android, add the following to your AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />";
    public static final String NAME = "NetInfo";
    public String mConnectionType = "unknown";
    public final ConnectivityBroadcastReceiver mConnectivityBroadcastReceiver;
    public String mConnectivityDeprecated = CONNECTION_TYPE_UNKNOWN_DEPRECATED;
    public final ConnectivityManager mConnectivityManager;
    public String mEffectiveConnectionType = "unknown";
    public boolean mNoNetworkPermission = false;

    public class ConnectivityBroadcastReceiver extends BroadcastReceiver {
        public boolean isRegistered;

        public ConnectivityBroadcastReceiver() {
            this.isRegistered = false;
        }

        public boolean isRegistered() {
            return this.isRegistered;
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                NetInfoModule.this.updateAndSendConnectionType();
            }
        }

        public void setRegistered(boolean z) {
            this.isRegistered = z;
        }
    }

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mConnectivityManager = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.mConnectivityBroadcastReceiver = new ConnectivityBroadcastReceiver();
    }

    private WritableMap createConnectivityEventMap() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("network_info", this.mConnectivityDeprecated);
        writableNativeMap.putString("connectionType", this.mConnectionType);
        writableNativeMap.putString("effectiveConnectionType", this.mEffectiveConnectionType);
        return writableNativeMap;
    }

    private String getCurrentConnectionType() {
        try {
            NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return CONNECTION_TYPE_NONE_DEPRECATED;
            }
            if (!activeNetworkInfo.isConnected()) {
                return CONNECTION_TYPE_NONE_DEPRECATED;
            }
            if (ConnectivityManager.isNetworkTypeValid(activeNetworkInfo.getType())) {
                return activeNetworkInfo.getTypeName().toUpperCase();
            }
            return CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        } catch (SecurityException unused) {
            this.mNoNetworkPermission = true;
            return CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        }
    }

    private String getEffectiveConnectionType(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2g";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
                return "3g";
            case 13:
            case 15:
                return "4g";
            default:
                return "unknown";
        }
    }

    private void registerReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        getReactApplicationContext().registerReceiver(this.mConnectivityBroadcastReceiver, intentFilter);
        this.mConnectivityBroadcastReceiver.setRegistered(true);
        updateAndSendConnectionType();
    }

    private void sendConnectivityChangedEvent() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("networkStatusDidChange", createConnectivityEventMap());
    }

    private void unregisterReceiver() {
        if (this.mConnectivityBroadcastReceiver.isRegistered()) {
            getReactApplicationContext().unregisterReceiver(this.mConnectivityBroadcastReceiver);
            this.mConnectivityBroadcastReceiver.setRegistered(false);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateAndSendConnectionType() {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.netinfo.NetInfoModule.updateAndSendConnectionType():void");
    }

    @ReactMethod
    public void getCurrentConnectivity(Promise promise) {
        if (this.mNoNetworkPermission) {
            promise.reject(ERROR_MISSING_PERMISSION, MISSING_PERMISSION_MESSAGE);
        } else {
            promise.resolve(createConnectivityEventMap());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @ReactMethod
    public void isConnectionMetered(Promise promise) {
        if (this.mNoNetworkPermission) {
            promise.reject(ERROR_MISSING_PERMISSION, MISSING_PERMISSION_MESSAGE);
        } else {
            promise.resolve(Boolean.valueOf(ConnectivityManagerCompat.m14558OooO00o(this.mConnectivityManager)));
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        unregisterReceiver();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        registerReceiver();
    }
}
