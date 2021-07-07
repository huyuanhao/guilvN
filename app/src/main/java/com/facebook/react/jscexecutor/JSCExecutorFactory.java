package com.facebook.react.jscexecutor;

import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.ReactConstants;

public class JSCExecutorFactory implements JavaScriptExecutorFactory {
    public final String mAppName;
    public final String mDeviceName;

    public JSCExecutorFactory(String str, String str2) {
        this.mAppName = str;
        this.mDeviceName = str2;
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() throws Exception {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", ReactConstants.TAG);
        writableNativeMap.putString("AppIdentity", this.mAppName);
        writableNativeMap.putString("DeviceIdentity", this.mDeviceName);
        return new JSCExecutor(writableNativeMap);
    }

    public String toString() {
        return "JSIExecutor+JSCRuntime";
    }
}
