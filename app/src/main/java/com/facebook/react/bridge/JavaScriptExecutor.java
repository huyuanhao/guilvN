package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public abstract class JavaScriptExecutor {
    public final HybridData mHybridData;

    public JavaScriptExecutor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void close() {
        this.mHybridData.resetNative();
    }

    public abstract String getName();
}
