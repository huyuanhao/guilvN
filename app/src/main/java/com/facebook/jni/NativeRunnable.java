package com.facebook.jni;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public class NativeRunnable implements Runnable {
    public final HybridData mHybridData;

    public NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void run();
}
