package com.facebook.react.fabric.jsi;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.Systrace;

public class FabricSoLoader {
    public static boolean sDidInit;

    public static void staticInit() {
        if (!sDidInit) {
            sDidInit = true;
            Systrace.beginSection(0, "FabricSoLoader.staticInit::load:fabricjni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
            SoLoader.loadLibrary("fabricjni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
            Systrace.endSection(0);
        }
    }
}
