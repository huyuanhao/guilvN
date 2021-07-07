package com.facebook.react.fabric.jsi;

import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public class ComponentFactoryDelegate {
    @DoNotStrip
    public final HybridData mHybridData = initHybrid();

    static {
        FabricSoLoader.staticInit();
    }

    @DoNotStrip
    public static native HybridData initHybrid();
}
