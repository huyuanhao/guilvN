package com.facebook.react.fabric.jsi;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;

@SuppressLint({"MissingNativeLoadLibrary"})
public class EventEmitterWrapper {
    @DoNotStrip
    public final HybridData mHybridData = initHybrid();

    static {
        FabricSoLoader.staticInit();
    }

    public static native HybridData initHybrid();

    private native void invokeEvent(String str, NativeMap nativeMap);

    public void invoke(String str, @Nullable WritableMap writableMap) {
        invokeEvent(str, writableMap == null ? new WritableNativeMap() : (NativeMap) writableMap);
    }
}
