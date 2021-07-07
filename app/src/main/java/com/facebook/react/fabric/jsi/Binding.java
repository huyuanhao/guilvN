package com.facebook.react.fabric.jsi;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.uimanager.PixelUtil;

@DoNotStrip
@SuppressLint({"MissingNativeLoadLibrary"})
public class Binding {
    @DoNotStrip
    public final HybridData mHybridData = initHybrid();

    static {
        FabricSoLoader.staticInit();
    }

    public static native HybridData initHybrid();

    private native void installFabricUIManager(long j, Object obj, EventBeatManager eventBeatManager, MessageQueueThread messageQueueThread, ComponentFactoryDelegate componentFactoryDelegate, Object obj2);

    private native void uninstallFabricUIManager();

    public void register(JavaScriptContextHolder javaScriptContextHolder, FabricUIManager fabricUIManager, EventBeatManager eventBeatManager, MessageQueueThread messageQueueThread, ComponentFactoryDelegate componentFactoryDelegate, ReactNativeConfig reactNativeConfig) {
        fabricUIManager.setBinding(this);
        installFabricUIManager(javaScriptContextHolder.get(), fabricUIManager, eventBeatManager, messageQueueThread, componentFactoryDelegate, reactNativeConfig);
        setPixelDensity(PixelUtil.getDisplayMetricDensity());
    }

    public native void renderTemplateToSurface(int i, String str);

    public native void setConstraints(int i, float f, float f2, float f3, float f4);

    public native void setPixelDensity(float f);

    public native void startSurface(int i, NativeMap nativeMap);

    public native void stopSurface(int i);

    public void unregister() {
        uninstallFabricUIManager();
    }
}
