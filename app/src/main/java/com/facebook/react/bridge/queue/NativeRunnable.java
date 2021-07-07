package com.facebook.react.bridge.queue;

import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public class NativeRunnable implements Runnable {
    public final HybridData mHybridData;

    @DoNotStrip
    public NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void run();
}
