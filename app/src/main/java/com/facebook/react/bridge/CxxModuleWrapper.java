package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.soloader.SoLoader;

@DoNotStrip
public class CxxModuleWrapper extends CxxModuleWrapperBase {
    public CxxModuleWrapper(HybridData hybridData) {
        super(hybridData);
    }

    public static CxxModuleWrapper makeDso(String str, String str2) {
        SoLoader.loadLibrary(str);
        return makeDsoNative(SoLoader.unpackLibraryAndDependencies(str).getAbsolutePath(), str2);
    }

    public static native CxxModuleWrapper makeDsoNative(String str, String str2);
}
