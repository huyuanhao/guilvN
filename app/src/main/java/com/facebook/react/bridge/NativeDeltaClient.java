package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.nio.channels.ReadableByteChannel;

public class NativeDeltaClient {
    public final HybridData mHybridData = initHybrid();

    static {
        ReactBridge.staticInit();
    }

    public static native HybridData initHybrid();

    public native void processDelta(ReadableByteChannel readableByteChannel);

    public native void reset();
}
