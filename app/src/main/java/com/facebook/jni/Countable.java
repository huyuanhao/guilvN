package com.facebook.jni;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.soloader.SoLoader;

@DoNotStrip
public class Countable {
    @DoNotStrip
    public long mInstance = 0;

    static {
        SoLoader.loadLibrary("fb");
    }

    public native void dispose();

    public void finalize() throws Throwable {
        dispose();
        super.finalize();
    }
}
