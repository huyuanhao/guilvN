package com.learnium.RNDeviceInfo.netInfo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.p118pd.sdk.AbstractC8974ooOOoO;
import com.p118pd.sdk.C8741oo0oOo0;
import s.h.e.l.l.C;

public class NetInfoModule extends ReactContextBaseJavaModule implements NetStateChangeObserver, AbstractC8974ooOOoO {
    public final String MODULE_NAME = "NetInfoModule";
    public String lastIpAddress;
    public String lastNetWorkType;
    public ReactApplicationContext mContext;
    public Promise promiseArea;
    public Promise promiseCountry;
    public Promise promiseIpAddress;

    static {
        C.i(16777258);
    }

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mContext = reactApplicationContext;
    }

    private native void updateIp();

    private native void updateNetWorkType();

    @ReactMethod
    public void getArea(Promise promise) {
        String area = NetInfoManager.getInstance().getArea();
        if (C8741oo0oOo0.OooO0OO(area)) {
            NetInfoManager.getInstance().getIpAddressAsync(this);
        }
        promise.resolve(area);
    }

    @ReactMethod
    public void getCarrier(Promise promise) {
        promise.resolve(NetInfoManager.getInstance().getCarrier(getReactApplicationContext()));
    }

    @ReactMethod
    public void getCountry(Promise promise) {
        String country = NetInfoManager.getInstance().getCountry();
        if (C8741oo0oOo0.OooO0OO(country)) {
            NetInfoManager.getInstance().getIpAddressAsync(this);
        }
        promise.resolve(country);
    }

    @ReactMethod
    public void getIpAddress(Promise promise) {
        String ipAddress = NetInfoManager.getInstance().getIpAddress();
        if (C8741oo0oOo0.OooO0OO(ipAddress)) {
            NetInfoManager.getInstance().getIpAddressAsync(this);
        }
        promise.resolve(ipAddress);
    }

    @ReactMethod
    public void getIpType(Promise promise) {
        promise.resolve(NetInfoManager.getInstance().getIpType(getReactApplicationContext()));
    }

    @ReactMethod
    public void getLocalIpAddress(Promise promise) {
        promise.resolve(NetInfoManager.getInstance().getLocalIPAddress());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public native String getName();

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        NetStateChangeReceiver.registerReceiver(getReactApplicationContext());
        NetStateChangeReceiver.registerObserver(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public native void onCatalystInstanceDestroy();

    @Override // com.p118pd.sdk.AbstractC8974ooOOoO
    public native void onFailure(String str);

    @Override // com.learnium.RNDeviceInfo.netInfo.NetStateChangeObserver
    public native void onNetConnected(NetworkType networkType);

    @Override // com.learnium.RNDeviceInfo.netInfo.NetStateChangeObserver
    public native void onNetDisconnected();

    @Override // com.p118pd.sdk.AbstractC8974ooOOoO
    public native void onStart();

    @Override // com.p118pd.sdk.AbstractC8974ooOOoO
    public native void onSuccess(String str);

    public native void sendNetInfoEvent(WritableMap writableMap);
}
