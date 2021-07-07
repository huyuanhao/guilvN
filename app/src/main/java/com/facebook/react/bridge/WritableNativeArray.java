package com.facebook.react.bridge;

import com.facebook.infer.annotation.Assertions;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import javax.annotation.Nullable;

@DoNotStrip
public class WritableNativeArray extends ReadableNativeArray implements WritableArray {
    static {
        ReactBridge.staticInit();
    }

    public WritableNativeArray() {
        super(initHybrid());
    }

    public static native HybridData initHybrid();

    private native void pushNativeArray(WritableNativeArray writableNativeArray);

    private native void pushNativeMap(WritableNativeMap writableNativeMap);

    @Override // com.facebook.react.bridge.WritableArray
    public void pushArray(@Nullable WritableArray writableArray) {
        Assertions.assertCondition(writableArray == null || (writableArray instanceof WritableNativeArray), "Illegal type provided");
        pushNativeArray((WritableNativeArray) writableArray);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushBoolean(boolean z);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushDouble(double d);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushInt(int i);

    @Override // com.facebook.react.bridge.WritableArray
    public void pushMap(@Nullable WritableMap writableMap) {
        Assertions.assertCondition(writableMap == null || (writableMap instanceof WritableNativeMap), "Illegal type provided");
        pushNativeMap((WritableNativeMap) writableMap);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushNull();

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushString(@Nullable String str);
}
