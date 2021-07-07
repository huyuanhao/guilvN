package com.facebook.react.bridge;

import androidx.annotation.NonNull;
import com.facebook.infer.annotation.Assertions;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@DoNotStrip
public class WritableNativeMap extends ReadableNativeMap implements WritableMap {
    static {
        ReactBridge.staticInit();
    }

    public WritableNativeMap() {
        super(initHybrid());
    }

    public static native HybridData initHybrid();

    private native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private native void putNativeArray(String str, WritableNativeArray writableNativeArray);

    private native void putNativeMap(String str, WritableNativeMap writableNativeMap);

    @Override // com.facebook.react.bridge.WritableMap
    public void merge(@Nonnull ReadableMap readableMap) {
        Assertions.assertCondition(readableMap instanceof ReadableNativeMap, "Illegal type provided");
        mergeNativeMap((ReadableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putArray(@Nonnull String str, @Nullable WritableArray writableArray) {
        Assertions.assertCondition(writableArray == null || (writableArray instanceof WritableNativeArray), "Illegal type provided");
        putNativeArray(str, (WritableNativeArray) writableArray);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putBoolean(@Nonnull String str, boolean z);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putDouble(@Nonnull String str, double d);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putInt(@Nonnull String str, int i);

    @Override // com.facebook.react.bridge.WritableMap
    public void putMap(@Nonnull String str, @Nullable WritableMap writableMap) {
        Assertions.assertCondition(writableMap == null || (writableMap instanceof WritableNativeMap), "Illegal type provided");
        putNativeMap(str, (WritableNativeMap) writableMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putNull(@NonNull String str);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putString(@Nonnull String str, @Nullable String str2);
}
