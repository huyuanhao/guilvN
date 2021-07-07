package com.facebook.jni;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.soloader.SoLoader;

@DoNotStrip
public class ThreadScopeSupport {
    static {
        SoLoader.loadLibrary("fb");
    }

    @DoNotStrip
    public static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }

    public static native void runStdFunctionImpl(long j);
}
